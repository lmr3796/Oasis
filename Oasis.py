#!/usr/bin/env python
#coding=utf-8
 
'''
    InFB - Information Facebook
    Usage: infb.py user@domain.tld password
 
    http://ruel.me
 
    Copyright (c) 2011, Ruel Pagayon
    All rights reserved.
 
    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions are met:
        * Redistributions of source code must retain the above copyright
          notice, this list of conditions and the following disclaimer.
        * Redistributions in binary form must reproduce the above copyright
          notice, this list of conditions and the following disclaimer in the
          documentation and/or other materials provided with the distribution.
        * Neither the name of the author nor the names of its contributors
          may be used to endorse or promote products derived from this software
          without specific prior written permission.
 
    THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS "AS IS" AND ANY
    EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
    WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
    DISCLAIMED. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
    INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
    LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
    OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
    LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
    OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
    ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
'''
 
import sys
import re
import urllib
import urllib2
import cookielib
import csv
import json
def get_access_token(user, passw): 
 
    # Initialize the needed modules
    CHandler = urllib2.HTTPCookieProcessor(cookielib.CookieJar())
    browser = urllib2.build_opener(urllib2.HTTPRedirectHandler(), CHandler)
    browser.addheaders = [('Referer', 'http://m.facebook.com/'),
                            ('Origin', 'http://m.facebook.com/'),
                            ('Content-Type', 'application/x-www-form-urlencoded'),
                            ('User-Agent', 'Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.1.7) Gecko/20091221 Firefox/3.5.7 (.NET CLR 3.5.30729)'),
                            ('Accept-Language', 'zh-TW,zh;q=0.8,en-US;q=0.6,en;q=0.4')]
    urllib2.install_opener(browser)
 
    # Initialize the cookies and get the post_form_data
    print >> sys.stderr, 'Initializing..'
    res = browser.open('http://m.facebook.com/index.php')
    page = res.read()
    post_url = re.search('''\<form.*?action="(.*?)".*?/\>''', page).group(1)
    print >> sys.stderr, post_url
    form_input = {} 
    for i in re.finditer(re.compile('''\<input\s+.*?\s+name="(.*?)".*?\/>'''), page):
        form_input[i.group(1)] = re.search('''value\s*=\s*"(.*?)"''', i.group(0)).group(1) if re.search('''value\s*=\s*"(.*?)"''', i.group(0)) else None
    form_input.update({
        'email':	user,
        'pass': 	passw,
        'width':	480,
        'pxr':  	1,
        'ajax': 	1,
        'gps':  	1,
        'signup_layout':	"top_link"
    })

    #for k,v in form_input.iteritems():
    #    print >> sys.stderr, k,':',v
    #mxt = re.search('name="li" value="(\w+)"', page)
    #pfi = mxt.group(1)
    print >> sys.stderr, 'Using login id: %s' % form_input['li']
    res.close()
 
    # Login to Facebook
    print >> sys.stderr, 'Logging in to account ' + user
    res = browser.open(post_url, urllib.urlencode(form_input))
    rcode = res.code
    page = res.read()
    if not re.search('登出', page):
        print >> sys.stderr, 'Login Failed'
 
        # For Debugging (when failed login)
        fh = open('debug.html', 'w')
        fh.write(page)
        fh.close
 
        # Exit the execution :(
        exit(2)
    res.close()
 
    # Get Access Token
    res = browser.open('http://developers.facebook.com/docs/reference/api')
    conft = res.read()
    mat = re.search('access_token=(.*?)"', conft)
    acct = mat.group(1)
    print >> sys.stderr, 'Using access token: %s' % acct
    return acct

    '''
    # Get friend's ID
    res = browser.open('https://graph.facebook.com/me/friends?access_token=%s' % acct)
    fres = res.read()
    jdata = json.loads(fres)
 
    # Initialize the CSV writer
    fbwriter = csv.writer(open('%s.csv' % user, 'ab'), delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
 
    # God for each ID in the JSON response
    for acc in jdata['data']:
        fid = acc['id']
        fname = acc['name']
 
        # Go to ID's profile
        res = browser.open('http://m.facebook.com/profile.php?id=%s&v=info&refid=17' % fid)
        xma = re.search('mailto:(.*?)"', res.read())
        if xma:
 
            # Replace the html entity from the scraped information
            email = xma.group(1).replace('&#64;', '@')
 
            # In case there will be weird characters, repr() will help us.
            try:
                print >> sys.stderr, fname, email
            except:
                print >> sys.stderr, repr(fname), repr(email)
 
            # Write to CSV, again with repr() if something weird prints out.
            try:
                fbwriter.writerow([fname, email])
            except:
                fbwriter.writerow([repr(fname), repr(email)])
    '''
 
def main():
    # Check the arguments
    if len(sys.argv) != 3:
        usage()
    user = sys.argv[1]
    passw = sys.argv[2]
    acc_tok = get_access_token(user, passw)
    return 0

def usage():
    '''
        Usage: infb.py user@domain.tld password
    '''
    print >> sys.stderr, 'Usage: ' + sys.argv[0] + ' user@domain.tld password'
    sys.exit(1)
 
if __name__ == '__main__':
    exit(main())
