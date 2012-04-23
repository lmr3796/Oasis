#!/usr/bin/env python
#coding=utf-8

import webapp2
import json
from google.appengine.ext import db

class DiaryPicture(db.Model):
    timestamp = db.DateTimeProperty(auto_now_add = True)
    fbid = db.StringProperty()
    

class Query(webapp2.RequestHandler):
    def get(self):
        self.response.headers['Content-Type'] = 'application/json'
        result = {'status': 0, 'message':'', 'data':None}
        query_results = db.GqlQuery("SELECT * FROM DiaryPicture ORDER BY timestamp DESC LIMIT 30")
        query_results = [r.fbid for r in query_results]
        result['data'] = query_results
        self.response.out.write(json.dumps(result))
            

class Update(webapp2.RequestHandler):
    def get(self):
        result = {'status': 0, 'message':'', 'data':None}
        fbid = self.request.get("fbid")
        if not fbid:
            result['status'] = -1
            result['message'] = 'Missing photo fbid'
        else:
            '''insert fbid to db'''
            diary = DiaryPicture(parent=diary_key())
            diary.fbid = fbid
            diary.put()
            result['data'] = [{'id': diary.fbid, 'timestamp': str(diary.timestamp)}]
        self.response.headers['Content-Type'] = 'application/json'
        self.response.out.write(json.dumps(result))
        #self.response.out.write('[{"fbid": "' + diary.fbid + '", "timestamp": "' + str(diary.timestamp) + '"}]')

		
def diary_key(diary_name = None):
    return db.Key.from_path('Diary', 'default_diary')
	
app = webapp2.WSGIApplication([('/query', Query), ('/update', Update)])
