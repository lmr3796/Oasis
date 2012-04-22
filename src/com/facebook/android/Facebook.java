


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>facebook-android-sdk/facebook/src/com/facebook/android/Facebook.java at master · facebook/facebook-android-sdk</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />

    
    

    <meta content="authenticity_token" name="csrf-param" />
<meta content="5TMsOvzW8KsScYHrf/+v4WCk31ia+RpCj1aDyvaqtqQ=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/stylesheets/bundles/github-9e6f49288d62ba4c519541a22d681e2f823f02b4.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="https://a248.e.akamai.net/assets.github.com/stylesheets/bundles/github2-1a2061c33e6632ce3bbf40295fe45208a5459e3c.css" media="screen" rel="stylesheet" type="text/css" />
    

    <script src="https://a248.e.akamai.net/assets.github.com/javascripts/bundles/jquery-2d0d4e0119675485f7a3d0dd7f49420b63c552ae.js" type="text/javascript"></script>
    <script src="https://a248.e.akamai.net/assets.github.com/javascripts/bundles/github-cfac289827b3ed9a195af1fc6531b5a5c5ca2cbe.js" type="text/javascript"></script>
    
    

      <link rel='permalink' href='/facebook/facebook-android-sdk/blob/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f/facebook/src/com/facebook/android/Facebook.java'>
    <meta property="og:title" content="facebook-android-sdk"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/facebook/facebook-android-sdk"/>
    <meta property="og:image" content="https://a248.e.akamai.net/assets.github.com/images/gravatars/gravatar-140.png?1329920549"/>
    <meta property="og:site_name" content="GitHub"/>
    <meta property="og:description" content="facebook-android-sdk - Facebook SDK for Android"/>

    <meta name="description" content="facebook-android-sdk - Facebook SDK for Android" />
  <link href="https://github.com/facebook/facebook-android-sdk/commits/master.atom" rel="alternate" title="Recent Commits to facebook-android-sdk:master" type="application/atom+xml" />

  </head>


  <body class="logged_in page-blob windows vis-public env-production " data-blob-contribs-enabled="yes">
    <div id="wrapper">

    
    
    

      <div id="header" class="true clearfix">
        <div class="container clearfix">
          <a class="site-logo" href="https://github.com/">
            <!--[if IE]>
            <img alt="GitHub" class="github-logo" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov7.png?1329920549" />
            <img alt="GitHub" class="github-logo-hover" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov7-hover.png?1329920549" />
            <![endif]-->
            <img alt="GitHub" class="github-logo-4x" height="30" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov7@4x.png?1329920549" />
            <img alt="GitHub" class="github-logo-4x-hover" height="30" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov7@4x-hover.png?1329920549" />
          </a>

              
    <div class="topsearch ">
<form accept-charset="UTF-8" action="/search" id="top_search_form" method="get"><input name="utf8" type="hidden" value="&#x2713;" />        <a href="/search" class="advanced-search tooltipped downwards" title="Advanced Search"><span class="mini-icon advanced-search"></span></a>
        <div class="search placeholder-field js-placeholder-field">
          <label class="placeholder" for="global-search-field">Search…</label>
          <input type="text" class="search my_repos_autocompleter" id="global-search-field" name="q" results="5" spellcheck="false" autocomplete="off" data-autocomplete="my-repos-autocomplete">
          <div id="my-repos-autocomplete" class="autocomplete-results">
            <ul class="js-navigation-container"></ul>
          </div>
          <input type="submit" value="Search" class="button">
          <span class="mini-icon search-input"></span>
        </div>
        <input type="hidden" name="type" value="Everything" />
        <input type="hidden" name="repo" value="" />
        <input type="hidden" name="langOverride" value="" />
        <input type="hidden" name="start_value" value="1" />
</form>      <ul class="top-nav">
          <li class="explore"><a href="https://github.com/explore">Explore</a></li>
          <li><a href="https://gist.github.com">Gist</a></li>
          <li><a href="/blog">Blog</a></li>
        <li><a href="http://help.github.com">Help</a></li>
      </ul>
    </div>


            


  <div id="userbox">
    <div id="user">
      <a href="https://github.com/lmr3796"><img height="20" src="https://secure.gravatar.com/avatar/f562f5ff66264646a42bbea94a284e54?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="20" /></a>
      <a href="https://github.com/lmr3796" class="name">lmr3796</a>
    </div>
    <ul id="user-links">
      <li>
        <a href="/new" id="new_repo" class="tooltipped downwards" title="Create a New Repo"><span class="mini-icon new-repo"></span></a>
      </li>
      <li>
        <a href="/inbox/notifications" id="notifications" class="tooltipped downwards" title="Notifications">
          <span class="mini-icon notifications"></span>
        </a>
      </li>
      <li><a href="/settings/profile" id="settings" class="tooltipped downwards" title="Account Settings"><span class="mini-icon account-settings"></span></a></li>
      <li>
          <a href="/logout" data-method="post" id="logout" class="tooltipped downwards" title="Log Out"><span class="mini-icon logout"></span></a>
      </li>
    </ul>
  </div>



          
        </div>
      </div>

      

            <div class="site hfeed" itemscope itemtype="http://schema.org/WebPage">
      <div class="container hentry">
        <div class="pagehead repohead instapaper_ignore readability-menu">
        <div class="title-actions-bar">
          



              <ul class="pagehead-actions">


          <li class="js-toggler-container watch-button-container ">
            <a href="/facebook/facebook-android-sdk/toggle_watch" class="minibutton btn-watch watch-button js-toggler-target" data-method="post" data-remote="true" rel="nofollow"><span><span class="icon"></span>Watch</span></a>
            <a href="/facebook/facebook-android-sdk/toggle_watch" class="minibutton btn-watch unwatch-button js-toggler-target" data-method="post" data-remote="true" rel="nofollow"><span><span class="icon"></span>Unwatch</span></a>
          </li>

              <li><a href="/facebook/facebook-android-sdk/fork" class="minibutton btn-fork fork-button" data-method="post" rel="nofollow"><span><span class="icon"></span>Fork</span></a></li>



      <li class="repostats">
        <ul class="repo-stats">
          <li class="watchers ">
            <a href="/facebook/facebook-android-sdk/watchers" title="Watchers" class="tooltipped downwards">
              1,556
            </a>
          </li>
          <li class="forks">
            <a href="/facebook/facebook-android-sdk/network" title="Forks" class="tooltipped downwards">
              416
            </a>
          </li>
        </ul>
      </li>
    </ul>

          <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title">
            <span class="mini-icon public-repo"></span>
            <span class="author vcard">
<a href="/facebook" class="url fn" itemprop="url" rel="author">              <span itemprop="title">facebook</span>
              </a></span> /
            <strong><a href="/facebook/facebook-android-sdk" class="js-current-repository">facebook-android-sdk</a></strong>
          </h1>
        </div>

          

  <ul class="tabs">
    <li><a href="/facebook/facebook-android-sdk" class="selected" highlight="repo_sourcerepo_downloadsrepo_commitsrepo_tagsrepo_branches">Code</a></li>
    <li><a href="/facebook/facebook-android-sdk/network" highlight="repo_network">Network</a>
    <li><a href="/facebook/facebook-android-sdk/pulls" highlight="repo_pulls">Pull Requests <span class='counter'>20</span></a></li>



    <li><a href="/facebook/facebook-android-sdk/graphs" highlight="repo_graphsrepo_contributors">Stats &amp; Graphs</a></li>

  </ul>
 
<div class="frame frame-center tree-finder" style="display:none"
      data-tree-list-url="/facebook/facebook-android-sdk/tree-list/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f"
      data-blob-url-prefix="/facebook/facebook-android-sdk/blob/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f"
    >

  <div class="breadcrumb">
    <span class="bold"><a href="/facebook/facebook-android-sdk">facebook-android-sdk</a></span> /
    <input class="tree-finder-input js-navigation-enable" type="text" name="query" autocomplete="off" spellcheck="false">
  </div>

    <div class="octotip">
      <p>
        <a href="/facebook/facebook-android-sdk/dismiss-tree-finder-help" class="dismiss js-dismiss-tree-list-help" title="Hide this notice forever" rel="nofollow">Dismiss</a>
        <span class="bold">Octotip:</span> You've activated the <em>file finder</em>
        by pressing <span class="kbd">t</span> Start typing to filter the
        file list. Use <span class="kbd badmono">↑</span> and
        <span class="kbd badmono">↓</span> to navigate,
        <span class="kbd">enter</span> to view files.
      </p>
    </div>

  <table class="tree-browser" cellpadding="0" cellspacing="0">
    <tr class="js-header"><th>&nbsp;</th><th>name</th></tr>
    <tr class="js-no-results no-results" style="display: none">
      <th colspan="2">No matching files</th>
    </tr>
    <tbody class="js-results-list js-navigation-container">
    </tbody>
  </table>
</div>

<div id="jump-to-line" style="display:none">
  <h2>Jump to Line</h2>
  <form accept-charset="UTF-8">
    <input name="utf8" type="hidden" value="&#x2713;" />
    <input class="textfield" type="text">
    <div class="full-button">
      <button type="submit" class="classy">
        <span>Go</span>
      </button>
    </div>
  </form>
</div>


<div class="subnav-bar">

  <ul class="actions subnav">
    <li><a href="/facebook/facebook-android-sdk/tags" class="" highlight="repo_tags">Tags <span class="counter">4</span></a></li>
    <li><a href="/facebook/facebook-android-sdk/downloads" class="blank downloads-blank" highlight="repo_downloads">Downloads <span class="counter">0</span></a></li>
    
  </ul>

  <ul class="scope">
    <li class="switcher">

      <div class="context-menu-container js-menu-container">
        <a href="#"
           class="minibutton bigger switcher js-menu-target js-commitish-button btn-branch repo-tree"
           data-master-branch="master"
           data-ref="master">
          <span><span class="icon"></span><i>branch:</i> master</span>
        </a>

        <div class="context-pane commitish-context js-menu-content">
          <a href="javascript:;" class="close js-menu-close"></a>
          <div class="context-title">Switch Branches/Tags</div>
          <div class="context-body pane-selector commitish-selector js-filterable-commitishes">
            <div class="filterbar">
              <div class="placeholder-field js-placeholder-field">
                <label class="placeholder" for="context-commitish-filter-field" data-placeholder-mode="sticky">Filter branches/tags</label>
                <input type="text" id="context-commitish-filter-field" class="commitish-filter" />
              </div>

              <ul class="tabs">
                <li><a href="#" data-filter="branches" class="selected">Branches</a></li>
                <li><a href="#" data-filter="tags">Tags</a></li>
              </ul>
            </div>

              <div class="commitish-item branch-commitish selector-item">
                <h4>
                    <a href="/facebook/facebook-android-sdk/blob/master/facebook/src/com/facebook/android/Facebook.java" data-name="master" rel="nofollow">master</a>
                </h4>
              </div>

              <div class="commitish-item tag-commitish selector-item">
                <h4>
                    <a href="/facebook/facebook-android-sdk/blob/v1.2.1/facebook/src/com/facebook/android/Facebook.java" data-name="v1.2.1" rel="nofollow">v1.2.1</a>
                </h4>
              </div>
              <div class="commitish-item tag-commitish selector-item">
                <h4>
                    <a href="/facebook/facebook-android-sdk/blob/v1.2/facebook/src/com/facebook/android/Facebook.java" data-name="v1.2" rel="nofollow">v1.2</a>
                </h4>
              </div>
              <div class="commitish-item tag-commitish selector-item">
                <h4>
                    <a href="/facebook/facebook-android-sdk/blob/v1.1/facebook/src/com/facebook/android/Facebook.java" data-name="v1.1" rel="nofollow">v1.1</a>
                </h4>
              </div>
              <div class="commitish-item tag-commitish selector-item">
                <h4>
                    <a href="/facebook/facebook-android-sdk/blob/v1.0/facebook/src/com/facebook/android/Facebook.java" data-name="v1.0" rel="nofollow">v1.0</a>
                </h4>
              </div>

            <div class="no-results" style="display:none">Nothing to show</div>
          </div>
        </div><!-- /.commitish-context-context -->
      </div>

    </li>
  </ul>

  <ul class="subnav with-scope">

    <li><a href="/facebook/facebook-android-sdk" class="selected" highlight="repo_source">Files</a></li>
    <li><a href="/facebook/facebook-android-sdk/commits/master" highlight="repo_commits">Commits</a></li>
    <li><a href="/facebook/facebook-android-sdk/branches" class="" highlight="repo_branches" rel="nofollow">Branches <span class="counter">1</span></a></li>
  </ul>

</div>

  
  
  


          

        </div><!-- /.repohead -->

        





<!-- block_view_fragment_key: views7/v8/blob:v21:91153fa414ca6bf99fee0cd4704a86b1 -->
  <div id="slider">

    <div class="breadcrumb" data-path="facebook/src/com/facebook/android/Facebook.java/">
      <b itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/5a72863793521a96f5a9f4fb72960a27b98e441d" class="js-rewrite-sha" itemprop="url"><span itemprop="title">facebook-android-sdk</span></a></b> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/5a72863793521a96f5a9f4fb72960a27b98e441d/facebook" class="js-rewrite-sha" itemscope="url"><span itemprop="title">facebook</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/5a72863793521a96f5a9f4fb72960a27b98e441d/facebook/src" class="js-rewrite-sha" itemscope="url"><span itemprop="title">src</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/5a72863793521a96f5a9f4fb72960a27b98e441d/facebook/src/com" class="js-rewrite-sha" itemscope="url"><span itemprop="title">com</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/5a72863793521a96f5a9f4fb72960a27b98e441d/facebook/src/com/facebook" class="js-rewrite-sha" itemscope="url"><span itemprop="title">facebook</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/5a72863793521a96f5a9f4fb72960a27b98e441d/facebook/src/com/facebook/android" class="js-rewrite-sha" itemscope="url"><span itemprop="title">android</span></a></span> / <strong class="final-path">Facebook.java</strong> <span class="js-clippy mini-icon clippy " data-clipboard-text="facebook/src/com/facebook/android/Facebook.java" data-copied-hint="copied!" data-copy-hint="copy to clipboard"></span>
    </div>


      <div class="commit file-history-tease" data-path="facebook/src/com/facebook/android/Facebook.java/">
        <img class="main-avatar" height="24" src="https://secure.gravatar.com/avatar/583a71cdfcfa0559b4d7f73d851295fc?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="24" />
        <span class="author"><a href="/rightparen">rightparen</a></span>
        <time class="js-relative-date " datetime="2012-03-21T14:29:31-07:00" title="2012-03-21 14:29:31">March 21, 2012</time>
        <div class="commit-title">
            <a href="/facebook/facebook-android-sdk/commit/5a72863793521a96f5a9f4fb72960a27b98e441d" class="message">Fixed null pointer issue.</a>
        </div>

        <div class="participation">
          <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>2</strong> contributors</a></p>
              <a class="avatar tooltipped downwards" title="vijaye" href="/facebook/facebook-android-sdk/commits/master/facebook/src/com/facebook/android/Facebook.java?author=vijaye"><img height="20" src="https://secure.gravatar.com/avatar/bbda65a07582c57e0b7776fa99db44f9?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="20" /></a>
    <a class="avatar tooltipped downwards" title="rightparen" href="/facebook/facebook-android-sdk/commits/master/facebook/src/com/facebook/android/Facebook.java?author=rightparen"><img height="20" src="https://secure.gravatar.com/avatar/583a71cdfcfa0559b4d7f73d851295fc?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="20" /></a>


        </div>
        <div id="blob_contributors_box" style="display:none">
          <h2>Users on GitHub who have contributed to this file</h2>
          <ul class="facebox-user-list">
            <li>
              <img height="24" src="https://secure.gravatar.com/avatar/bbda65a07582c57e0b7776fa99db44f9?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="24" />
              <a href="/vijaye">vijaye</a>
            </li>
            <li>
              <img height="24" src="https://secure.gravatar.com/avatar/583a71cdfcfa0559b4d7f73d851295fc?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="24" />
              <a href="/rightparen">rightparen</a>
            </li>
          </ul>
        </div>
      </div>

    <div class="frames">
      <div class="frame frame-center" data-path="facebook/src/com/facebook/android/Facebook.java/" data-permalink-url="/facebook/facebook-android-sdk/blob/5a72863793521a96f5a9f4fb72960a27b98e441d/facebook/src/com/facebook/android/Facebook.java" data-title="facebook-android-sdk/facebook/src/com/facebook/android/Facebook.java at master · facebook/facebook-android-sdk · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="mini-icon text-file"></b></span>
                <span class="mode" title="File Mode">100644</span>
                  <span>981 lines (885 sloc)</span>
                <span>38.651 kb</span>
              </div>
              <ul class="button-group actions">
                  <li>
                    <a class="grouped-button file-edit-link minibutton bigger lighter js-rewrite-sha" href="/facebook/facebook-android-sdk/edit/5a72863793521a96f5a9f4fb72960a27b98e441d/facebook/src/com/facebook/android/Facebook.java" data-method="post" rel="nofollow"><span>Edit this file</span></a>
                  </li>

                <li>
                  <a href="/facebook/facebook-android-sdk/raw/master/facebook/src/com/facebook/android/Facebook.java" class="minibutton btn-raw grouped-button bigger lighter" id="raw-url"><span><span class="icon"></span>Raw</span></a>
                </li>
                  <li>
                    <a href="/facebook/facebook-android-sdk/blame/master/facebook/src/com/facebook/android/Facebook.java" class="minibutton btn-blame grouped-button bigger lighter"><span><span class="icon"></span>Blame</span></a>
                  </li>
                <li>
                  <a href="/facebook/facebook-android-sdk/commits/master/facebook/src/com/facebook/android/Facebook.java" class="minibutton btn-history grouped-button bigger lighter" rel="nofollow"><span><span class="icon"></span>History</span></a>
                </li>
              </ul>
            </div>
              <div class="data type-java">
      <table cellpadding="0" cellspacing="0" class="lines">
        <tr>
          <td>
            <pre class="line_numbers"><span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>
<span id="L197" rel="#L197">197</span>
<span id="L198" rel="#L198">198</span>
<span id="L199" rel="#L199">199</span>
<span id="L200" rel="#L200">200</span>
<span id="L201" rel="#L201">201</span>
<span id="L202" rel="#L202">202</span>
<span id="L203" rel="#L203">203</span>
<span id="L204" rel="#L204">204</span>
<span id="L205" rel="#L205">205</span>
<span id="L206" rel="#L206">206</span>
<span id="L207" rel="#L207">207</span>
<span id="L208" rel="#L208">208</span>
<span id="L209" rel="#L209">209</span>
<span id="L210" rel="#L210">210</span>
<span id="L211" rel="#L211">211</span>
<span id="L212" rel="#L212">212</span>
<span id="L213" rel="#L213">213</span>
<span id="L214" rel="#L214">214</span>
<span id="L215" rel="#L215">215</span>
<span id="L216" rel="#L216">216</span>
<span id="L217" rel="#L217">217</span>
<span id="L218" rel="#L218">218</span>
<span id="L219" rel="#L219">219</span>
<span id="L220" rel="#L220">220</span>
<span id="L221" rel="#L221">221</span>
<span id="L222" rel="#L222">222</span>
<span id="L223" rel="#L223">223</span>
<span id="L224" rel="#L224">224</span>
<span id="L225" rel="#L225">225</span>
<span id="L226" rel="#L226">226</span>
<span id="L227" rel="#L227">227</span>
<span id="L228" rel="#L228">228</span>
<span id="L229" rel="#L229">229</span>
<span id="L230" rel="#L230">230</span>
<span id="L231" rel="#L231">231</span>
<span id="L232" rel="#L232">232</span>
<span id="L233" rel="#L233">233</span>
<span id="L234" rel="#L234">234</span>
<span id="L235" rel="#L235">235</span>
<span id="L236" rel="#L236">236</span>
<span id="L237" rel="#L237">237</span>
<span id="L238" rel="#L238">238</span>
<span id="L239" rel="#L239">239</span>
<span id="L240" rel="#L240">240</span>
<span id="L241" rel="#L241">241</span>
<span id="L242" rel="#L242">242</span>
<span id="L243" rel="#L243">243</span>
<span id="L244" rel="#L244">244</span>
<span id="L245" rel="#L245">245</span>
<span id="L246" rel="#L246">246</span>
<span id="L247" rel="#L247">247</span>
<span id="L248" rel="#L248">248</span>
<span id="L249" rel="#L249">249</span>
<span id="L250" rel="#L250">250</span>
<span id="L251" rel="#L251">251</span>
<span id="L252" rel="#L252">252</span>
<span id="L253" rel="#L253">253</span>
<span id="L254" rel="#L254">254</span>
<span id="L255" rel="#L255">255</span>
<span id="L256" rel="#L256">256</span>
<span id="L257" rel="#L257">257</span>
<span id="L258" rel="#L258">258</span>
<span id="L259" rel="#L259">259</span>
<span id="L260" rel="#L260">260</span>
<span id="L261" rel="#L261">261</span>
<span id="L262" rel="#L262">262</span>
<span id="L263" rel="#L263">263</span>
<span id="L264" rel="#L264">264</span>
<span id="L265" rel="#L265">265</span>
<span id="L266" rel="#L266">266</span>
<span id="L267" rel="#L267">267</span>
<span id="L268" rel="#L268">268</span>
<span id="L269" rel="#L269">269</span>
<span id="L270" rel="#L270">270</span>
<span id="L271" rel="#L271">271</span>
<span id="L272" rel="#L272">272</span>
<span id="L273" rel="#L273">273</span>
<span id="L274" rel="#L274">274</span>
<span id="L275" rel="#L275">275</span>
<span id="L276" rel="#L276">276</span>
<span id="L277" rel="#L277">277</span>
<span id="L278" rel="#L278">278</span>
<span id="L279" rel="#L279">279</span>
<span id="L280" rel="#L280">280</span>
<span id="L281" rel="#L281">281</span>
<span id="L282" rel="#L282">282</span>
<span id="L283" rel="#L283">283</span>
<span id="L284" rel="#L284">284</span>
<span id="L285" rel="#L285">285</span>
<span id="L286" rel="#L286">286</span>
<span id="L287" rel="#L287">287</span>
<span id="L288" rel="#L288">288</span>
<span id="L289" rel="#L289">289</span>
<span id="L290" rel="#L290">290</span>
<span id="L291" rel="#L291">291</span>
<span id="L292" rel="#L292">292</span>
<span id="L293" rel="#L293">293</span>
<span id="L294" rel="#L294">294</span>
<span id="L295" rel="#L295">295</span>
<span id="L296" rel="#L296">296</span>
<span id="L297" rel="#L297">297</span>
<span id="L298" rel="#L298">298</span>
<span id="L299" rel="#L299">299</span>
<span id="L300" rel="#L300">300</span>
<span id="L301" rel="#L301">301</span>
<span id="L302" rel="#L302">302</span>
<span id="L303" rel="#L303">303</span>
<span id="L304" rel="#L304">304</span>
<span id="L305" rel="#L305">305</span>
<span id="L306" rel="#L306">306</span>
<span id="L307" rel="#L307">307</span>
<span id="L308" rel="#L308">308</span>
<span id="L309" rel="#L309">309</span>
<span id="L310" rel="#L310">310</span>
<span id="L311" rel="#L311">311</span>
<span id="L312" rel="#L312">312</span>
<span id="L313" rel="#L313">313</span>
<span id="L314" rel="#L314">314</span>
<span id="L315" rel="#L315">315</span>
<span id="L316" rel="#L316">316</span>
<span id="L317" rel="#L317">317</span>
<span id="L318" rel="#L318">318</span>
<span id="L319" rel="#L319">319</span>
<span id="L320" rel="#L320">320</span>
<span id="L321" rel="#L321">321</span>
<span id="L322" rel="#L322">322</span>
<span id="L323" rel="#L323">323</span>
<span id="L324" rel="#L324">324</span>
<span id="L325" rel="#L325">325</span>
<span id="L326" rel="#L326">326</span>
<span id="L327" rel="#L327">327</span>
<span id="L328" rel="#L328">328</span>
<span id="L329" rel="#L329">329</span>
<span id="L330" rel="#L330">330</span>
<span id="L331" rel="#L331">331</span>
<span id="L332" rel="#L332">332</span>
<span id="L333" rel="#L333">333</span>
<span id="L334" rel="#L334">334</span>
<span id="L335" rel="#L335">335</span>
<span id="L336" rel="#L336">336</span>
<span id="L337" rel="#L337">337</span>
<span id="L338" rel="#L338">338</span>
<span id="L339" rel="#L339">339</span>
<span id="L340" rel="#L340">340</span>
<span id="L341" rel="#L341">341</span>
<span id="L342" rel="#L342">342</span>
<span id="L343" rel="#L343">343</span>
<span id="L344" rel="#L344">344</span>
<span id="L345" rel="#L345">345</span>
<span id="L346" rel="#L346">346</span>
<span id="L347" rel="#L347">347</span>
<span id="L348" rel="#L348">348</span>
<span id="L349" rel="#L349">349</span>
<span id="L350" rel="#L350">350</span>
<span id="L351" rel="#L351">351</span>
<span id="L352" rel="#L352">352</span>
<span id="L353" rel="#L353">353</span>
<span id="L354" rel="#L354">354</span>
<span id="L355" rel="#L355">355</span>
<span id="L356" rel="#L356">356</span>
<span id="L357" rel="#L357">357</span>
<span id="L358" rel="#L358">358</span>
<span id="L359" rel="#L359">359</span>
<span id="L360" rel="#L360">360</span>
<span id="L361" rel="#L361">361</span>
<span id="L362" rel="#L362">362</span>
<span id="L363" rel="#L363">363</span>
<span id="L364" rel="#L364">364</span>
<span id="L365" rel="#L365">365</span>
<span id="L366" rel="#L366">366</span>
<span id="L367" rel="#L367">367</span>
<span id="L368" rel="#L368">368</span>
<span id="L369" rel="#L369">369</span>
<span id="L370" rel="#L370">370</span>
<span id="L371" rel="#L371">371</span>
<span id="L372" rel="#L372">372</span>
<span id="L373" rel="#L373">373</span>
<span id="L374" rel="#L374">374</span>
<span id="L375" rel="#L375">375</span>
<span id="L376" rel="#L376">376</span>
<span id="L377" rel="#L377">377</span>
<span id="L378" rel="#L378">378</span>
<span id="L379" rel="#L379">379</span>
<span id="L380" rel="#L380">380</span>
<span id="L381" rel="#L381">381</span>
<span id="L382" rel="#L382">382</span>
<span id="L383" rel="#L383">383</span>
<span id="L384" rel="#L384">384</span>
<span id="L385" rel="#L385">385</span>
<span id="L386" rel="#L386">386</span>
<span id="L387" rel="#L387">387</span>
<span id="L388" rel="#L388">388</span>
<span id="L389" rel="#L389">389</span>
<span id="L390" rel="#L390">390</span>
<span id="L391" rel="#L391">391</span>
<span id="L392" rel="#L392">392</span>
<span id="L393" rel="#L393">393</span>
<span id="L394" rel="#L394">394</span>
<span id="L395" rel="#L395">395</span>
<span id="L396" rel="#L396">396</span>
<span id="L397" rel="#L397">397</span>
<span id="L398" rel="#L398">398</span>
<span id="L399" rel="#L399">399</span>
<span id="L400" rel="#L400">400</span>
<span id="L401" rel="#L401">401</span>
<span id="L402" rel="#L402">402</span>
<span id="L403" rel="#L403">403</span>
<span id="L404" rel="#L404">404</span>
<span id="L405" rel="#L405">405</span>
<span id="L406" rel="#L406">406</span>
<span id="L407" rel="#L407">407</span>
<span id="L408" rel="#L408">408</span>
<span id="L409" rel="#L409">409</span>
<span id="L410" rel="#L410">410</span>
<span id="L411" rel="#L411">411</span>
<span id="L412" rel="#L412">412</span>
<span id="L413" rel="#L413">413</span>
<span id="L414" rel="#L414">414</span>
<span id="L415" rel="#L415">415</span>
<span id="L416" rel="#L416">416</span>
<span id="L417" rel="#L417">417</span>
<span id="L418" rel="#L418">418</span>
<span id="L419" rel="#L419">419</span>
<span id="L420" rel="#L420">420</span>
<span id="L421" rel="#L421">421</span>
<span id="L422" rel="#L422">422</span>
<span id="L423" rel="#L423">423</span>
<span id="L424" rel="#L424">424</span>
<span id="L425" rel="#L425">425</span>
<span id="L426" rel="#L426">426</span>
<span id="L427" rel="#L427">427</span>
<span id="L428" rel="#L428">428</span>
<span id="L429" rel="#L429">429</span>
<span id="L430" rel="#L430">430</span>
<span id="L431" rel="#L431">431</span>
<span id="L432" rel="#L432">432</span>
<span id="L433" rel="#L433">433</span>
<span id="L434" rel="#L434">434</span>
<span id="L435" rel="#L435">435</span>
<span id="L436" rel="#L436">436</span>
<span id="L437" rel="#L437">437</span>
<span id="L438" rel="#L438">438</span>
<span id="L439" rel="#L439">439</span>
<span id="L440" rel="#L440">440</span>
<span id="L441" rel="#L441">441</span>
<span id="L442" rel="#L442">442</span>
<span id="L443" rel="#L443">443</span>
<span id="L444" rel="#L444">444</span>
<span id="L445" rel="#L445">445</span>
<span id="L446" rel="#L446">446</span>
<span id="L447" rel="#L447">447</span>
<span id="L448" rel="#L448">448</span>
<span id="L449" rel="#L449">449</span>
<span id="L450" rel="#L450">450</span>
<span id="L451" rel="#L451">451</span>
<span id="L452" rel="#L452">452</span>
<span id="L453" rel="#L453">453</span>
<span id="L454" rel="#L454">454</span>
<span id="L455" rel="#L455">455</span>
<span id="L456" rel="#L456">456</span>
<span id="L457" rel="#L457">457</span>
<span id="L458" rel="#L458">458</span>
<span id="L459" rel="#L459">459</span>
<span id="L460" rel="#L460">460</span>
<span id="L461" rel="#L461">461</span>
<span id="L462" rel="#L462">462</span>
<span id="L463" rel="#L463">463</span>
<span id="L464" rel="#L464">464</span>
<span id="L465" rel="#L465">465</span>
<span id="L466" rel="#L466">466</span>
<span id="L467" rel="#L467">467</span>
<span id="L468" rel="#L468">468</span>
<span id="L469" rel="#L469">469</span>
<span id="L470" rel="#L470">470</span>
<span id="L471" rel="#L471">471</span>
<span id="L472" rel="#L472">472</span>
<span id="L473" rel="#L473">473</span>
<span id="L474" rel="#L474">474</span>
<span id="L475" rel="#L475">475</span>
<span id="L476" rel="#L476">476</span>
<span id="L477" rel="#L477">477</span>
<span id="L478" rel="#L478">478</span>
<span id="L479" rel="#L479">479</span>
<span id="L480" rel="#L480">480</span>
<span id="L481" rel="#L481">481</span>
<span id="L482" rel="#L482">482</span>
<span id="L483" rel="#L483">483</span>
<span id="L484" rel="#L484">484</span>
<span id="L485" rel="#L485">485</span>
<span id="L486" rel="#L486">486</span>
<span id="L487" rel="#L487">487</span>
<span id="L488" rel="#L488">488</span>
<span id="L489" rel="#L489">489</span>
<span id="L490" rel="#L490">490</span>
<span id="L491" rel="#L491">491</span>
<span id="L492" rel="#L492">492</span>
<span id="L493" rel="#L493">493</span>
<span id="L494" rel="#L494">494</span>
<span id="L495" rel="#L495">495</span>
<span id="L496" rel="#L496">496</span>
<span id="L497" rel="#L497">497</span>
<span id="L498" rel="#L498">498</span>
<span id="L499" rel="#L499">499</span>
<span id="L500" rel="#L500">500</span>
<span id="L501" rel="#L501">501</span>
<span id="L502" rel="#L502">502</span>
<span id="L503" rel="#L503">503</span>
<span id="L504" rel="#L504">504</span>
<span id="L505" rel="#L505">505</span>
<span id="L506" rel="#L506">506</span>
<span id="L507" rel="#L507">507</span>
<span id="L508" rel="#L508">508</span>
<span id="L509" rel="#L509">509</span>
<span id="L510" rel="#L510">510</span>
<span id="L511" rel="#L511">511</span>
<span id="L512" rel="#L512">512</span>
<span id="L513" rel="#L513">513</span>
<span id="L514" rel="#L514">514</span>
<span id="L515" rel="#L515">515</span>
<span id="L516" rel="#L516">516</span>
<span id="L517" rel="#L517">517</span>
<span id="L518" rel="#L518">518</span>
<span id="L519" rel="#L519">519</span>
<span id="L520" rel="#L520">520</span>
<span id="L521" rel="#L521">521</span>
<span id="L522" rel="#L522">522</span>
<span id="L523" rel="#L523">523</span>
<span id="L524" rel="#L524">524</span>
<span id="L525" rel="#L525">525</span>
<span id="L526" rel="#L526">526</span>
<span id="L527" rel="#L527">527</span>
<span id="L528" rel="#L528">528</span>
<span id="L529" rel="#L529">529</span>
<span id="L530" rel="#L530">530</span>
<span id="L531" rel="#L531">531</span>
<span id="L532" rel="#L532">532</span>
<span id="L533" rel="#L533">533</span>
<span id="L534" rel="#L534">534</span>
<span id="L535" rel="#L535">535</span>
<span id="L536" rel="#L536">536</span>
<span id="L537" rel="#L537">537</span>
<span id="L538" rel="#L538">538</span>
<span id="L539" rel="#L539">539</span>
<span id="L540" rel="#L540">540</span>
<span id="L541" rel="#L541">541</span>
<span id="L542" rel="#L542">542</span>
<span id="L543" rel="#L543">543</span>
<span id="L544" rel="#L544">544</span>
<span id="L545" rel="#L545">545</span>
<span id="L546" rel="#L546">546</span>
<span id="L547" rel="#L547">547</span>
<span id="L548" rel="#L548">548</span>
<span id="L549" rel="#L549">549</span>
<span id="L550" rel="#L550">550</span>
<span id="L551" rel="#L551">551</span>
<span id="L552" rel="#L552">552</span>
<span id="L553" rel="#L553">553</span>
<span id="L554" rel="#L554">554</span>
<span id="L555" rel="#L555">555</span>
<span id="L556" rel="#L556">556</span>
<span id="L557" rel="#L557">557</span>
<span id="L558" rel="#L558">558</span>
<span id="L559" rel="#L559">559</span>
<span id="L560" rel="#L560">560</span>
<span id="L561" rel="#L561">561</span>
<span id="L562" rel="#L562">562</span>
<span id="L563" rel="#L563">563</span>
<span id="L564" rel="#L564">564</span>
<span id="L565" rel="#L565">565</span>
<span id="L566" rel="#L566">566</span>
<span id="L567" rel="#L567">567</span>
<span id="L568" rel="#L568">568</span>
<span id="L569" rel="#L569">569</span>
<span id="L570" rel="#L570">570</span>
<span id="L571" rel="#L571">571</span>
<span id="L572" rel="#L572">572</span>
<span id="L573" rel="#L573">573</span>
<span id="L574" rel="#L574">574</span>
<span id="L575" rel="#L575">575</span>
<span id="L576" rel="#L576">576</span>
<span id="L577" rel="#L577">577</span>
<span id="L578" rel="#L578">578</span>
<span id="L579" rel="#L579">579</span>
<span id="L580" rel="#L580">580</span>
<span id="L581" rel="#L581">581</span>
<span id="L582" rel="#L582">582</span>
<span id="L583" rel="#L583">583</span>
<span id="L584" rel="#L584">584</span>
<span id="L585" rel="#L585">585</span>
<span id="L586" rel="#L586">586</span>
<span id="L587" rel="#L587">587</span>
<span id="L588" rel="#L588">588</span>
<span id="L589" rel="#L589">589</span>
<span id="L590" rel="#L590">590</span>
<span id="L591" rel="#L591">591</span>
<span id="L592" rel="#L592">592</span>
<span id="L593" rel="#L593">593</span>
<span id="L594" rel="#L594">594</span>
<span id="L595" rel="#L595">595</span>
<span id="L596" rel="#L596">596</span>
<span id="L597" rel="#L597">597</span>
<span id="L598" rel="#L598">598</span>
<span id="L599" rel="#L599">599</span>
<span id="L600" rel="#L600">600</span>
<span id="L601" rel="#L601">601</span>
<span id="L602" rel="#L602">602</span>
<span id="L603" rel="#L603">603</span>
<span id="L604" rel="#L604">604</span>
<span id="L605" rel="#L605">605</span>
<span id="L606" rel="#L606">606</span>
<span id="L607" rel="#L607">607</span>
<span id="L608" rel="#L608">608</span>
<span id="L609" rel="#L609">609</span>
<span id="L610" rel="#L610">610</span>
<span id="L611" rel="#L611">611</span>
<span id="L612" rel="#L612">612</span>
<span id="L613" rel="#L613">613</span>
<span id="L614" rel="#L614">614</span>
<span id="L615" rel="#L615">615</span>
<span id="L616" rel="#L616">616</span>
<span id="L617" rel="#L617">617</span>
<span id="L618" rel="#L618">618</span>
<span id="L619" rel="#L619">619</span>
<span id="L620" rel="#L620">620</span>
<span id="L621" rel="#L621">621</span>
<span id="L622" rel="#L622">622</span>
<span id="L623" rel="#L623">623</span>
<span id="L624" rel="#L624">624</span>
<span id="L625" rel="#L625">625</span>
<span id="L626" rel="#L626">626</span>
<span id="L627" rel="#L627">627</span>
<span id="L628" rel="#L628">628</span>
<span id="L629" rel="#L629">629</span>
<span id="L630" rel="#L630">630</span>
<span id="L631" rel="#L631">631</span>
<span id="L632" rel="#L632">632</span>
<span id="L633" rel="#L633">633</span>
<span id="L634" rel="#L634">634</span>
<span id="L635" rel="#L635">635</span>
<span id="L636" rel="#L636">636</span>
<span id="L637" rel="#L637">637</span>
<span id="L638" rel="#L638">638</span>
<span id="L639" rel="#L639">639</span>
<span id="L640" rel="#L640">640</span>
<span id="L641" rel="#L641">641</span>
<span id="L642" rel="#L642">642</span>
<span id="L643" rel="#L643">643</span>
<span id="L644" rel="#L644">644</span>
<span id="L645" rel="#L645">645</span>
<span id="L646" rel="#L646">646</span>
<span id="L647" rel="#L647">647</span>
<span id="L648" rel="#L648">648</span>
<span id="L649" rel="#L649">649</span>
<span id="L650" rel="#L650">650</span>
<span id="L651" rel="#L651">651</span>
<span id="L652" rel="#L652">652</span>
<span id="L653" rel="#L653">653</span>
<span id="L654" rel="#L654">654</span>
<span id="L655" rel="#L655">655</span>
<span id="L656" rel="#L656">656</span>
<span id="L657" rel="#L657">657</span>
<span id="L658" rel="#L658">658</span>
<span id="L659" rel="#L659">659</span>
<span id="L660" rel="#L660">660</span>
<span id="L661" rel="#L661">661</span>
<span id="L662" rel="#L662">662</span>
<span id="L663" rel="#L663">663</span>
<span id="L664" rel="#L664">664</span>
<span id="L665" rel="#L665">665</span>
<span id="L666" rel="#L666">666</span>
<span id="L667" rel="#L667">667</span>
<span id="L668" rel="#L668">668</span>
<span id="L669" rel="#L669">669</span>
<span id="L670" rel="#L670">670</span>
<span id="L671" rel="#L671">671</span>
<span id="L672" rel="#L672">672</span>
<span id="L673" rel="#L673">673</span>
<span id="L674" rel="#L674">674</span>
<span id="L675" rel="#L675">675</span>
<span id="L676" rel="#L676">676</span>
<span id="L677" rel="#L677">677</span>
<span id="L678" rel="#L678">678</span>
<span id="L679" rel="#L679">679</span>
<span id="L680" rel="#L680">680</span>
<span id="L681" rel="#L681">681</span>
<span id="L682" rel="#L682">682</span>
<span id="L683" rel="#L683">683</span>
<span id="L684" rel="#L684">684</span>
<span id="L685" rel="#L685">685</span>
<span id="L686" rel="#L686">686</span>
<span id="L687" rel="#L687">687</span>
<span id="L688" rel="#L688">688</span>
<span id="L689" rel="#L689">689</span>
<span id="L690" rel="#L690">690</span>
<span id="L691" rel="#L691">691</span>
<span id="L692" rel="#L692">692</span>
<span id="L693" rel="#L693">693</span>
<span id="L694" rel="#L694">694</span>
<span id="L695" rel="#L695">695</span>
<span id="L696" rel="#L696">696</span>
<span id="L697" rel="#L697">697</span>
<span id="L698" rel="#L698">698</span>
<span id="L699" rel="#L699">699</span>
<span id="L700" rel="#L700">700</span>
<span id="L701" rel="#L701">701</span>
<span id="L702" rel="#L702">702</span>
<span id="L703" rel="#L703">703</span>
<span id="L704" rel="#L704">704</span>
<span id="L705" rel="#L705">705</span>
<span id="L706" rel="#L706">706</span>
<span id="L707" rel="#L707">707</span>
<span id="L708" rel="#L708">708</span>
<span id="L709" rel="#L709">709</span>
<span id="L710" rel="#L710">710</span>
<span id="L711" rel="#L711">711</span>
<span id="L712" rel="#L712">712</span>
<span id="L713" rel="#L713">713</span>
<span id="L714" rel="#L714">714</span>
<span id="L715" rel="#L715">715</span>
<span id="L716" rel="#L716">716</span>
<span id="L717" rel="#L717">717</span>
<span id="L718" rel="#L718">718</span>
<span id="L719" rel="#L719">719</span>
<span id="L720" rel="#L720">720</span>
<span id="L721" rel="#L721">721</span>
<span id="L722" rel="#L722">722</span>
<span id="L723" rel="#L723">723</span>
<span id="L724" rel="#L724">724</span>
<span id="L725" rel="#L725">725</span>
<span id="L726" rel="#L726">726</span>
<span id="L727" rel="#L727">727</span>
<span id="L728" rel="#L728">728</span>
<span id="L729" rel="#L729">729</span>
<span id="L730" rel="#L730">730</span>
<span id="L731" rel="#L731">731</span>
<span id="L732" rel="#L732">732</span>
<span id="L733" rel="#L733">733</span>
<span id="L734" rel="#L734">734</span>
<span id="L735" rel="#L735">735</span>
<span id="L736" rel="#L736">736</span>
<span id="L737" rel="#L737">737</span>
<span id="L738" rel="#L738">738</span>
<span id="L739" rel="#L739">739</span>
<span id="L740" rel="#L740">740</span>
<span id="L741" rel="#L741">741</span>
<span id="L742" rel="#L742">742</span>
<span id="L743" rel="#L743">743</span>
<span id="L744" rel="#L744">744</span>
<span id="L745" rel="#L745">745</span>
<span id="L746" rel="#L746">746</span>
<span id="L747" rel="#L747">747</span>
<span id="L748" rel="#L748">748</span>
<span id="L749" rel="#L749">749</span>
<span id="L750" rel="#L750">750</span>
<span id="L751" rel="#L751">751</span>
<span id="L752" rel="#L752">752</span>
<span id="L753" rel="#L753">753</span>
<span id="L754" rel="#L754">754</span>
<span id="L755" rel="#L755">755</span>
<span id="L756" rel="#L756">756</span>
<span id="L757" rel="#L757">757</span>
<span id="L758" rel="#L758">758</span>
<span id="L759" rel="#L759">759</span>
<span id="L760" rel="#L760">760</span>
<span id="L761" rel="#L761">761</span>
<span id="L762" rel="#L762">762</span>
<span id="L763" rel="#L763">763</span>
<span id="L764" rel="#L764">764</span>
<span id="L765" rel="#L765">765</span>
<span id="L766" rel="#L766">766</span>
<span id="L767" rel="#L767">767</span>
<span id="L768" rel="#L768">768</span>
<span id="L769" rel="#L769">769</span>
<span id="L770" rel="#L770">770</span>
<span id="L771" rel="#L771">771</span>
<span id="L772" rel="#L772">772</span>
<span id="L773" rel="#L773">773</span>
<span id="L774" rel="#L774">774</span>
<span id="L775" rel="#L775">775</span>
<span id="L776" rel="#L776">776</span>
<span id="L777" rel="#L777">777</span>
<span id="L778" rel="#L778">778</span>
<span id="L779" rel="#L779">779</span>
<span id="L780" rel="#L780">780</span>
<span id="L781" rel="#L781">781</span>
<span id="L782" rel="#L782">782</span>
<span id="L783" rel="#L783">783</span>
<span id="L784" rel="#L784">784</span>
<span id="L785" rel="#L785">785</span>
<span id="L786" rel="#L786">786</span>
<span id="L787" rel="#L787">787</span>
<span id="L788" rel="#L788">788</span>
<span id="L789" rel="#L789">789</span>
<span id="L790" rel="#L790">790</span>
<span id="L791" rel="#L791">791</span>
<span id="L792" rel="#L792">792</span>
<span id="L793" rel="#L793">793</span>
<span id="L794" rel="#L794">794</span>
<span id="L795" rel="#L795">795</span>
<span id="L796" rel="#L796">796</span>
<span id="L797" rel="#L797">797</span>
<span id="L798" rel="#L798">798</span>
<span id="L799" rel="#L799">799</span>
<span id="L800" rel="#L800">800</span>
<span id="L801" rel="#L801">801</span>
<span id="L802" rel="#L802">802</span>
<span id="L803" rel="#L803">803</span>
<span id="L804" rel="#L804">804</span>
<span id="L805" rel="#L805">805</span>
<span id="L806" rel="#L806">806</span>
<span id="L807" rel="#L807">807</span>
<span id="L808" rel="#L808">808</span>
<span id="L809" rel="#L809">809</span>
<span id="L810" rel="#L810">810</span>
<span id="L811" rel="#L811">811</span>
<span id="L812" rel="#L812">812</span>
<span id="L813" rel="#L813">813</span>
<span id="L814" rel="#L814">814</span>
<span id="L815" rel="#L815">815</span>
<span id="L816" rel="#L816">816</span>
<span id="L817" rel="#L817">817</span>
<span id="L818" rel="#L818">818</span>
<span id="L819" rel="#L819">819</span>
<span id="L820" rel="#L820">820</span>
<span id="L821" rel="#L821">821</span>
<span id="L822" rel="#L822">822</span>
<span id="L823" rel="#L823">823</span>
<span id="L824" rel="#L824">824</span>
<span id="L825" rel="#L825">825</span>
<span id="L826" rel="#L826">826</span>
<span id="L827" rel="#L827">827</span>
<span id="L828" rel="#L828">828</span>
<span id="L829" rel="#L829">829</span>
<span id="L830" rel="#L830">830</span>
<span id="L831" rel="#L831">831</span>
<span id="L832" rel="#L832">832</span>
<span id="L833" rel="#L833">833</span>
<span id="L834" rel="#L834">834</span>
<span id="L835" rel="#L835">835</span>
<span id="L836" rel="#L836">836</span>
<span id="L837" rel="#L837">837</span>
<span id="L838" rel="#L838">838</span>
<span id="L839" rel="#L839">839</span>
<span id="L840" rel="#L840">840</span>
<span id="L841" rel="#L841">841</span>
<span id="L842" rel="#L842">842</span>
<span id="L843" rel="#L843">843</span>
<span id="L844" rel="#L844">844</span>
<span id="L845" rel="#L845">845</span>
<span id="L846" rel="#L846">846</span>
<span id="L847" rel="#L847">847</span>
<span id="L848" rel="#L848">848</span>
<span id="L849" rel="#L849">849</span>
<span id="L850" rel="#L850">850</span>
<span id="L851" rel="#L851">851</span>
<span id="L852" rel="#L852">852</span>
<span id="L853" rel="#L853">853</span>
<span id="L854" rel="#L854">854</span>
<span id="L855" rel="#L855">855</span>
<span id="L856" rel="#L856">856</span>
<span id="L857" rel="#L857">857</span>
<span id="L858" rel="#L858">858</span>
<span id="L859" rel="#L859">859</span>
<span id="L860" rel="#L860">860</span>
<span id="L861" rel="#L861">861</span>
<span id="L862" rel="#L862">862</span>
<span id="L863" rel="#L863">863</span>
<span id="L864" rel="#L864">864</span>
<span id="L865" rel="#L865">865</span>
<span id="L866" rel="#L866">866</span>
<span id="L867" rel="#L867">867</span>
<span id="L868" rel="#L868">868</span>
<span id="L869" rel="#L869">869</span>
<span id="L870" rel="#L870">870</span>
<span id="L871" rel="#L871">871</span>
<span id="L872" rel="#L872">872</span>
<span id="L873" rel="#L873">873</span>
<span id="L874" rel="#L874">874</span>
<span id="L875" rel="#L875">875</span>
<span id="L876" rel="#L876">876</span>
<span id="L877" rel="#L877">877</span>
<span id="L878" rel="#L878">878</span>
<span id="L879" rel="#L879">879</span>
<span id="L880" rel="#L880">880</span>
<span id="L881" rel="#L881">881</span>
<span id="L882" rel="#L882">882</span>
<span id="L883" rel="#L883">883</span>
<span id="L884" rel="#L884">884</span>
<span id="L885" rel="#L885">885</span>
<span id="L886" rel="#L886">886</span>
<span id="L887" rel="#L887">887</span>
<span id="L888" rel="#L888">888</span>
<span id="L889" rel="#L889">889</span>
<span id="L890" rel="#L890">890</span>
<span id="L891" rel="#L891">891</span>
<span id="L892" rel="#L892">892</span>
<span id="L893" rel="#L893">893</span>
<span id="L894" rel="#L894">894</span>
<span id="L895" rel="#L895">895</span>
<span id="L896" rel="#L896">896</span>
<span id="L897" rel="#L897">897</span>
<span id="L898" rel="#L898">898</span>
<span id="L899" rel="#L899">899</span>
<span id="L900" rel="#L900">900</span>
<span id="L901" rel="#L901">901</span>
<span id="L902" rel="#L902">902</span>
<span id="L903" rel="#L903">903</span>
<span id="L904" rel="#L904">904</span>
<span id="L905" rel="#L905">905</span>
<span id="L906" rel="#L906">906</span>
<span id="L907" rel="#L907">907</span>
<span id="L908" rel="#L908">908</span>
<span id="L909" rel="#L909">909</span>
<span id="L910" rel="#L910">910</span>
<span id="L911" rel="#L911">911</span>
<span id="L912" rel="#L912">912</span>
<span id="L913" rel="#L913">913</span>
<span id="L914" rel="#L914">914</span>
<span id="L915" rel="#L915">915</span>
<span id="L916" rel="#L916">916</span>
<span id="L917" rel="#L917">917</span>
<span id="L918" rel="#L918">918</span>
<span id="L919" rel="#L919">919</span>
<span id="L920" rel="#L920">920</span>
<span id="L921" rel="#L921">921</span>
<span id="L922" rel="#L922">922</span>
<span id="L923" rel="#L923">923</span>
<span id="L924" rel="#L924">924</span>
<span id="L925" rel="#L925">925</span>
<span id="L926" rel="#L926">926</span>
<span id="L927" rel="#L927">927</span>
<span id="L928" rel="#L928">928</span>
<span id="L929" rel="#L929">929</span>
<span id="L930" rel="#L930">930</span>
<span id="L931" rel="#L931">931</span>
<span id="L932" rel="#L932">932</span>
<span id="L933" rel="#L933">933</span>
<span id="L934" rel="#L934">934</span>
<span id="L935" rel="#L935">935</span>
<span id="L936" rel="#L936">936</span>
<span id="L937" rel="#L937">937</span>
<span id="L938" rel="#L938">938</span>
<span id="L939" rel="#L939">939</span>
<span id="L940" rel="#L940">940</span>
<span id="L941" rel="#L941">941</span>
<span id="L942" rel="#L942">942</span>
<span id="L943" rel="#L943">943</span>
<span id="L944" rel="#L944">944</span>
<span id="L945" rel="#L945">945</span>
<span id="L946" rel="#L946">946</span>
<span id="L947" rel="#L947">947</span>
<span id="L948" rel="#L948">948</span>
<span id="L949" rel="#L949">949</span>
<span id="L950" rel="#L950">950</span>
<span id="L951" rel="#L951">951</span>
<span id="L952" rel="#L952">952</span>
<span id="L953" rel="#L953">953</span>
<span id="L954" rel="#L954">954</span>
<span id="L955" rel="#L955">955</span>
<span id="L956" rel="#L956">956</span>
<span id="L957" rel="#L957">957</span>
<span id="L958" rel="#L958">958</span>
<span id="L959" rel="#L959">959</span>
<span id="L960" rel="#L960">960</span>
<span id="L961" rel="#L961">961</span>
<span id="L962" rel="#L962">962</span>
<span id="L963" rel="#L963">963</span>
<span id="L964" rel="#L964">964</span>
<span id="L965" rel="#L965">965</span>
<span id="L966" rel="#L966">966</span>
<span id="L967" rel="#L967">967</span>
<span id="L968" rel="#L968">968</span>
<span id="L969" rel="#L969">969</span>
<span id="L970" rel="#L970">970</span>
<span id="L971" rel="#L971">971</span>
<span id="L972" rel="#L972">972</span>
<span id="L973" rel="#L973">973</span>
<span id="L974" rel="#L974">974</span>
<span id="L975" rel="#L975">975</span>
<span id="L976" rel="#L976">976</span>
<span id="L977" rel="#L977">977</span>
<span id="L978" rel="#L978">978</span>
<span id="L979" rel="#L979">979</span>
<span id="L980" rel="#L980">980</span>
</pre>
          </td>
          <td width="100%">
                <div class="highlight"><pre><div class='line' id='LC1'><span class="cm">/*</span></div><div class='line' id='LC2'><span class="cm"> * Copyright 2010 Facebook, Inc.</span></div><div class='line' id='LC3'><span class="cm"> *</span></div><div class='line' id='LC4'><span class="cm"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);</span></div><div class='line' id='LC5'><span class="cm"> * you may not use this file except in compliance with the License.</span></div><div class='line' id='LC6'><span class="cm"> * You may obtain a copy of the License at</span></div><div class='line' id='LC7'><span class="cm"> *</span></div><div class='line' id='LC8'><span class="cm"> *    http://www.apache.org/licenses/LICENSE-2.0</span></div><div class='line' id='LC9'><span class="cm"> *</span></div><div class='line' id='LC10'><span class="cm"> * Unless required by applicable law or agreed to in writing, software</span></div><div class='line' id='LC11'><span class="cm"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,</span></div><div class='line' id='LC12'><span class="cm"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></div><div class='line' id='LC13'><span class="cm"> * See the License for the specific language governing permissions and</span></div><div class='line' id='LC14'><span class="cm"> * limitations under the License.</span></div><div class='line' id='LC15'><span class="cm"> */</span></div><div class='line' id='LC16'><br/></div><div class='line' id='LC17'><span class="kn">package</span> <span class="n">com</span><span class="o">.</span><span class="na">facebook</span><span class="o">.</span><span class="na">android</span><span class="o">;</span></div><div class='line' id='LC18'><br/></div><div class='line' id='LC19'><span class="kn">import</span> <span class="nn">java.io.FileNotFoundException</span><span class="o">;</span></div><div class='line' id='LC20'><span class="kn">import</span> <span class="nn">java.io.IOException</span><span class="o">;</span></div><div class='line' id='LC21'><span class="kn">import</span> <span class="nn">java.net.MalformedURLException</span><span class="o">;</span></div><div class='line' id='LC22'><br/></div><div class='line' id='LC23'><span class="kn">import</span> <span class="nn">android.Manifest</span><span class="o">;</span></div><div class='line' id='LC24'><span class="kn">import</span> <span class="nn">android.app.Activity</span><span class="o">;</span></div><div class='line' id='LC25'><span class="kn">import</span> <span class="nn">android.content.ActivityNotFoundException</span><span class="o">;</span></div><div class='line' id='LC26'><span class="kn">import</span> <span class="nn">android.content.ComponentName</span><span class="o">;</span></div><div class='line' id='LC27'><span class="kn">import</span> <span class="nn">android.content.Context</span><span class="o">;</span></div><div class='line' id='LC28'><span class="kn">import</span> <span class="nn">android.content.Intent</span><span class="o">;</span></div><div class='line' id='LC29'><span class="kn">import</span> <span class="nn">android.content.ServiceConnection</span><span class="o">;</span></div><div class='line' id='LC30'><span class="kn">import</span> <span class="nn">android.content.pm.PackageInfo</span><span class="o">;</span></div><div class='line' id='LC31'><span class="kn">import</span> <span class="nn">android.content.pm.PackageManager</span><span class="o">;</span></div><div class='line' id='LC32'><span class="kn">import</span> <span class="nn">android.content.pm.PackageManager.NameNotFoundException</span><span class="o">;</span></div><div class='line' id='LC33'><span class="kn">import</span> <span class="nn">android.content.pm.ResolveInfo</span><span class="o">;</span></div><div class='line' id='LC34'><span class="kn">import</span> <span class="nn">android.content.pm.Signature</span><span class="o">;</span></div><div class='line' id='LC35'><span class="kn">import</span> <span class="nn">android.os.Bundle</span><span class="o">;</span></div><div class='line' id='LC36'><span class="kn">import</span> <span class="nn">android.os.Handler</span><span class="o">;</span></div><div class='line' id='LC37'><span class="kn">import</span> <span class="nn">android.os.IBinder</span><span class="o">;</span></div><div class='line' id='LC38'><span class="kn">import</span> <span class="nn">android.os.Message</span><span class="o">;</span></div><div class='line' id='LC39'><span class="kn">import</span> <span class="nn">android.os.Messenger</span><span class="o">;</span></div><div class='line' id='LC40'><span class="kn">import</span> <span class="nn">android.os.RemoteException</span><span class="o">;</span></div><div class='line' id='LC41'><span class="kn">import</span> <span class="nn">android.text.TextUtils</span><span class="o">;</span></div><div class='line' id='LC42'><span class="kn">import</span> <span class="nn">android.webkit.CookieSyncManager</span><span class="o">;</span></div><div class='line' id='LC43'><br/></div><div class='line' id='LC44'><span class="cm">/**</span></div><div class='line' id='LC45'><span class="cm"> * Main Facebook object for interacting with the Facebook developer API.</span></div><div class='line' id='LC46'><span class="cm"> * Provides methods to log in and log out a user, make requests using the REST</span></div><div class='line' id='LC47'><span class="cm"> * and Graph APIs, and start user interface interactions with the API (such as</span></div><div class='line' id='LC48'><span class="cm"> * pop-ups promoting for credentials, permissions, stream posts, etc.)</span></div><div class='line' id='LC49'><span class="cm"> *</span></div><div class='line' id='LC50'><span class="cm"> * @author  Jim Brusstar (jimbru@facebook.com),</span></div><div class='line' id='LC51'><span class="cm"> *          Yariv Sadan (yariv@facebook.com),</span></div><div class='line' id='LC52'><span class="cm"> *          Luke Shepard (lshepard@facebook.com)</span></div><div class='line' id='LC53'><span class="cm"> */</span></div><div class='line' id='LC54'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Facebook</span> <span class="o">{</span></div><div class='line' id='LC55'><br/></div><div class='line' id='LC56'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Strings used in the authorization flow</span></div><div class='line' id='LC57'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">REDIRECT_URI</span> <span class="o">=</span> <span class="s">&quot;fbconnect://success&quot;</span><span class="o">;</span></div><div class='line' id='LC58'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">CANCEL_URI</span> <span class="o">=</span> <span class="s">&quot;fbconnect://cancel&quot;</span><span class="o">;</span></div><div class='line' id='LC59'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">TOKEN</span> <span class="o">=</span> <span class="s">&quot;access_token&quot;</span><span class="o">;</span></div><div class='line' id='LC60'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">EXPIRES</span> <span class="o">=</span> <span class="s">&quot;expires_in&quot;</span><span class="o">;</span></div><div class='line' id='LC61'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">SINGLE_SIGN_ON_DISABLED</span> <span class="o">=</span> <span class="s">&quot;service_disabled&quot;</span><span class="o">;</span></div><div class='line' id='LC62'><br/></div><div class='line' id='LC63'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">FORCE_DIALOG_AUTH</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC64'><br/></div><div class='line' id='LC65'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">LOGIN</span> <span class="o">=</span> <span class="s">&quot;oauth&quot;</span><span class="o">;</span></div><div class='line' id='LC66'><br/></div><div class='line' id='LC67'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Used as default activityCode by authorize(). See authorize() below.</span></div><div class='line' id='LC68'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">DEFAULT_AUTH_ACTIVITY_CODE</span> <span class="o">=</span> <span class="mi">32665</span><span class="o">;</span></div><div class='line' id='LC69'><br/></div><div class='line' id='LC70'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Facebook server endpoints: may be modified in a subclass for testing</span></div><div class='line' id='LC71'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">protected</span> <span class="kd">static</span> <span class="n">String</span> <span class="n">DIALOG_BASE_URL</span> <span class="o">=</span></div><div class='line' id='LC72'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;https://m.facebook.com/dialog/&quot;</span><span class="o">;</span></div><div class='line' id='LC73'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">protected</span> <span class="kd">static</span> <span class="n">String</span> <span class="n">GRAPH_BASE_URL</span> <span class="o">=</span></div><div class='line' id='LC74'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;https://graph.facebook.com/&quot;</span><span class="o">;</span></div><div class='line' id='LC75'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">protected</span> <span class="kd">static</span> <span class="n">String</span> <span class="n">RESTSERVER_URL</span> <span class="o">=</span></div><div class='line' id='LC76'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;https://api.facebook.com/restserver.php&quot;</span><span class="o">;</span></div><div class='line' id='LC77'><br/></div><div class='line' id='LC78'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">String</span> <span class="n">mAccessToken</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC79'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">long</span> <span class="n">mLastAccessUpdate</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC80'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">long</span> <span class="n">mAccessExpires</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC81'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">String</span> <span class="n">mAppId</span><span class="o">;</span></div><div class='line' id='LC82'><br/></div><div class='line' id='LC83'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">Activity</span> <span class="n">mAuthActivity</span><span class="o">;</span></div><div class='line' id='LC84'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">String</span><span class="o">[]</span> <span class="n">mAuthPermissions</span><span class="o">;</span></div><div class='line' id='LC85'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mAuthActivityCode</span><span class="o">;</span></div><div class='line' id='LC86'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">DialogListener</span> <span class="n">mAuthDialogListener</span><span class="o">;</span></div><div class='line' id='LC87'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC88'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// If the last time we extended the access token was more than 24 hours ago</span></div><div class='line' id='LC89'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// we try to refresh the access token again.</span></div><div class='line' id='LC90'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="kd">private</span> <span class="kt">long</span> <span class="n">REFRESH_TOKEN_BARRIER</span> <span class="o">=</span> <span class="mi">24L</span> <span class="o">*</span> <span class="mi">60L</span> <span class="o">*</span> <span class="mi">60L</span> <span class="o">*</span> <span class="mi">1000L</span><span class="o">;</span></div><div class='line' id='LC91'><br/></div><div class='line' id='LC92'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC93'><span class="cm">     * Constructor for Facebook object.</span></div><div class='line' id='LC94'><span class="cm">     *</span></div><div class='line' id='LC95'><span class="cm">     * @param appId</span></div><div class='line' id='LC96'><span class="cm">     *          Your Facebook application ID. Found at</span></div><div class='line' id='LC97'><span class="cm">     *          www.facebook.com/developers/apps.php.</span></div><div class='line' id='LC98'><span class="cm">     */</span></div><div class='line' id='LC99'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">Facebook</span><span class="o">(</span><span class="n">String</span> <span class="n">appId</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC100'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">appId</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC101'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span></div><div class='line' id='LC102'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;You must specify your application ID when instantiating &quot;</span> <span class="o">+</span></div><div class='line' id='LC103'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;a Facebook object. See README for details.&quot;</span><span class="o">);</span></div><div class='line' id='LC104'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC105'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAppId</span> <span class="o">=</span> <span class="n">appId</span><span class="o">;</span></div><div class='line' id='LC106'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC107'><br/></div><div class='line' id='LC108'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC109'><span class="cm">     * Default authorize method. Grants only basic permissions.</span></div><div class='line' id='LC110'><span class="cm">     *</span></div><div class='line' id='LC111'><span class="cm">     * See authorize() below for @params.</span></div><div class='line' id='LC112'><span class="cm">     */</span></div><div class='line' id='LC113'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">authorize</span><span class="o">(</span><span class="n">Activity</span> <span class="n">activity</span><span class="o">,</span> <span class="kd">final</span> <span class="n">DialogListener</span> <span class="n">listener</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC114'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">authorize</span><span class="o">(</span><span class="n">activity</span><span class="o">,</span> <span class="k">new</span> <span class="n">String</span><span class="o">[]</span> <span class="o">{},</span> <span class="n">DEFAULT_AUTH_ACTIVITY_CODE</span><span class="o">,</span></div><div class='line' id='LC115'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">listener</span><span class="o">);</span></div><div class='line' id='LC116'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC117'><br/></div><div class='line' id='LC118'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC119'><span class="cm">     * Authorize method that grants custom permissions.</span></div><div class='line' id='LC120'><span class="cm">     *</span></div><div class='line' id='LC121'><span class="cm">     * See authorize() below for @params.</span></div><div class='line' id='LC122'><span class="cm">     */</span></div><div class='line' id='LC123'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">authorize</span><span class="o">(</span><span class="n">Activity</span> <span class="n">activity</span><span class="o">,</span> <span class="n">String</span><span class="o">[]</span> <span class="n">permissions</span><span class="o">,</span></div><div class='line' id='LC124'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="n">DialogListener</span> <span class="n">listener</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC125'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">authorize</span><span class="o">(</span><span class="n">activity</span><span class="o">,</span> <span class="n">permissions</span><span class="o">,</span> <span class="n">DEFAULT_AUTH_ACTIVITY_CODE</span><span class="o">,</span> <span class="n">listener</span><span class="o">);</span></div><div class='line' id='LC126'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC127'><br/></div><div class='line' id='LC128'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC129'><span class="cm">     * Full authorize method.</span></div><div class='line' id='LC130'><span class="cm">     *</span></div><div class='line' id='LC131'><span class="cm">     * Starts either an Activity or a dialog which prompts the user to log in to</span></div><div class='line' id='LC132'><span class="cm">     * Facebook and grant the requested permissions to the given application.</span></div><div class='line' id='LC133'><span class="cm">     *</span></div><div class='line' id='LC134'><span class="cm">     * This method will, when possible, use Facebook&#39;s single sign-on for</span></div><div class='line' id='LC135'><span class="cm">     * Android to obtain an access token. This involves proxying a call through</span></div><div class='line' id='LC136'><span class="cm">     * the Facebook for Android stand-alone application, which will handle the</span></div><div class='line' id='LC137'><span class="cm">     * authentication flow, and return an OAuth access token for making API</span></div><div class='line' id='LC138'><span class="cm">     * calls.</span></div><div class='line' id='LC139'><span class="cm">     *</span></div><div class='line' id='LC140'><span class="cm">     * Because this process will not be available for all users, if single</span></div><div class='line' id='LC141'><span class="cm">     * sign-on is not possible, this method will automatically fall back to the</span></div><div class='line' id='LC142'><span class="cm">     * OAuth 2.0 User-Agent flow. In this flow, the user credentials are handled</span></div><div class='line' id='LC143'><span class="cm">     * by Facebook in an embedded WebView, not by the client application. As</span></div><div class='line' id='LC144'><span class="cm">     * such, the dialog makes a network request and renders HTML content rather</span></div><div class='line' id='LC145'><span class="cm">     * than a native UI. The access token is retrieved from a redirect to a</span></div><div class='line' id='LC146'><span class="cm">     * special URL that the WebView handles.</span></div><div class='line' id='LC147'><span class="cm">     *</span></div><div class='line' id='LC148'><span class="cm">     * Note that User credentials could be handled natively using the OAuth 2.0</span></div><div class='line' id='LC149'><span class="cm">     * Username and Password Flow, but this is not supported by this SDK.</span></div><div class='line' id='LC150'><span class="cm">     *</span></div><div class='line' id='LC151'><span class="cm">     * See http://developers.facebook.com/docs/authentication/ and</span></div><div class='line' id='LC152'><span class="cm">     * http://wiki.oauth.net/OAuth-2 for more details.</span></div><div class='line' id='LC153'><span class="cm">     *</span></div><div class='line' id='LC154'><span class="cm">     * Note that this method is asynchronous and the callback will be invoked in</span></div><div class='line' id='LC155'><span class="cm">     * the original calling thread (not in a background thread).</span></div><div class='line' id='LC156'><span class="cm">     *</span></div><div class='line' id='LC157'><span class="cm">     * Also note that requests may be made to the API without calling authorize</span></div><div class='line' id='LC158'><span class="cm">     * first, in which case only public information is returned.</span></div><div class='line' id='LC159'><span class="cm">     *</span></div><div class='line' id='LC160'><span class="cm">     * IMPORTANT: Note that single sign-on authentication will not function</span></div><div class='line' id='LC161'><span class="cm">     * correctly if you do not include a call to the authorizeCallback() method</span></div><div class='line' id='LC162'><span class="cm">     * in your onActivityResult() function! Please see below for more</span></div><div class='line' id='LC163'><span class="cm">     * information. single sign-on may be disabled by passing FORCE_DIALOG_AUTH</span></div><div class='line' id='LC164'><span class="cm">     * as the activityCode parameter in your call to authorize().</span></div><div class='line' id='LC165'><span class="cm">     *</span></div><div class='line' id='LC166'><span class="cm">     * @param activity</span></div><div class='line' id='LC167'><span class="cm">     *            The Android activity in which we want to display the</span></div><div class='line' id='LC168'><span class="cm">     *            authorization dialog.</span></div><div class='line' id='LC169'><span class="cm">     * @param applicationId</span></div><div class='line' id='LC170'><span class="cm">     *            The Facebook application identifier e.g. &quot;350685531728&quot;</span></div><div class='line' id='LC171'><span class="cm">     * @param permissions</span></div><div class='line' id='LC172'><span class="cm">     *            A list of permissions required for this application: e.g.</span></div><div class='line' id='LC173'><span class="cm">     *            &quot;read_stream&quot;, &quot;publish_stream&quot;, &quot;offline_access&quot;, etc. see</span></div><div class='line' id='LC174'><span class="cm">     *            http://developers.facebook.com/docs/authentication/permissions</span></div><div class='line' id='LC175'><span class="cm">     *            This parameter should not be null -- if you do not require any</span></div><div class='line' id='LC176'><span class="cm">     *            permissions, then pass in an empty String array.</span></div><div class='line' id='LC177'><span class="cm">     * @param activityCode</span></div><div class='line' id='LC178'><span class="cm">     *            Single sign-on requires an activity result to be called back</span></div><div class='line' id='LC179'><span class="cm">     *            to the client application -- if you are waiting on other</span></div><div class='line' id='LC180'><span class="cm">     *            activities to return data, pass a custom activity code here to</span></div><div class='line' id='LC181'><span class="cm">     *            avoid collisions. If you would like to force the use of legacy</span></div><div class='line' id='LC182'><span class="cm">     *            dialog-based authorization, pass FORCE_DIALOG_AUTH for this</span></div><div class='line' id='LC183'><span class="cm">     *            parameter. Otherwise just omit this parameter and Facebook</span></div><div class='line' id='LC184'><span class="cm">     *            will use a suitable default. See</span></div><div class='line' id='LC185'><span class="cm">     *            http://developer.android.com/reference/android/</span></div><div class='line' id='LC186'><span class="cm">     *              app/Activity.html for more information.</span></div><div class='line' id='LC187'><span class="cm">     * @param listener</span></div><div class='line' id='LC188'><span class="cm">     *            Callback interface for notifying the calling application when</span></div><div class='line' id='LC189'><span class="cm">     *            the authentication dialog has completed, failed, or been</span></div><div class='line' id='LC190'><span class="cm">     *            canceled.</span></div><div class='line' id='LC191'><span class="cm">     */</span></div><div class='line' id='LC192'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">authorize</span><span class="o">(</span><span class="n">Activity</span> <span class="n">activity</span><span class="o">,</span> <span class="n">String</span><span class="o">[]</span> <span class="n">permissions</span><span class="o">,</span></div><div class='line' id='LC193'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">activityCode</span><span class="o">,</span> <span class="kd">final</span> <span class="n">DialogListener</span> <span class="n">listener</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC194'><br/></div><div class='line' id='LC195'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">singleSignOnStarted</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC196'><br/></div><div class='line' id='LC197'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span> <span class="o">=</span> <span class="n">listener</span><span class="o">;</span></div><div class='line' id='LC198'><br/></div><div class='line' id='LC199'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Prefer single sign-on, where available.</span></div><div class='line' id='LC200'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">activityCode</span> <span class="o">&gt;=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC201'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">singleSignOnStarted</span> <span class="o">=</span> <span class="n">startSingleSignOn</span><span class="o">(</span><span class="n">activity</span><span class="o">,</span> <span class="n">mAppId</span><span class="o">,</span></div><div class='line' id='LC202'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">permissions</span><span class="o">,</span> <span class="n">activityCode</span><span class="o">);</span></div><div class='line' id='LC203'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC204'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Otherwise fall back to traditional dialog.</span></div><div class='line' id='LC205'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">singleSignOnStarted</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC206'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">startDialogAuth</span><span class="o">(</span><span class="n">activity</span><span class="o">,</span> <span class="n">permissions</span><span class="o">);</span></div><div class='line' id='LC207'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC208'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC209'><br/></div><div class='line' id='LC210'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC211'><span class="cm">     * Internal method to handle single sign-on backend for authorize().</span></div><div class='line' id='LC212'><span class="cm">     *</span></div><div class='line' id='LC213'><span class="cm">     * @param activity</span></div><div class='line' id='LC214'><span class="cm">     *            The Android Activity that will parent the ProxyAuth Activity.</span></div><div class='line' id='LC215'><span class="cm">     * @param applicationId</span></div><div class='line' id='LC216'><span class="cm">     *            The Facebook application identifier.</span></div><div class='line' id='LC217'><span class="cm">     * @param permissions</span></div><div class='line' id='LC218'><span class="cm">     *            A list of permissions required for this application. If you do</span></div><div class='line' id='LC219'><span class="cm">     *            not require any permissions, pass an empty String array.</span></div><div class='line' id='LC220'><span class="cm">     * @param activityCode</span></div><div class='line' id='LC221'><span class="cm">     *            Activity code to uniquely identify the result Intent in the</span></div><div class='line' id='LC222'><span class="cm">     *            callback.</span></div><div class='line' id='LC223'><span class="cm">     */</span></div><div class='line' id='LC224'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="nf">startSingleSignOn</span><span class="o">(</span><span class="n">Activity</span> <span class="n">activity</span><span class="o">,</span> <span class="n">String</span> <span class="n">applicationId</span><span class="o">,</span></div><div class='line' id='LC225'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span><span class="o">[]</span> <span class="n">permissions</span><span class="o">,</span> <span class="kt">int</span> <span class="n">activityCode</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC226'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">didSucceed</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC227'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Intent</span> <span class="n">intent</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Intent</span><span class="o">();</span></div><div class='line' id='LC228'><br/></div><div class='line' id='LC229'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span><span class="o">.</span><span class="na">setClassName</span><span class="o">(</span><span class="s">&quot;com.facebook.katana&quot;</span><span class="o">,</span></div><div class='line' id='LC230'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;com.facebook.katana.ProxyAuth&quot;</span><span class="o">);</span></div><div class='line' id='LC231'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span><span class="o">.</span><span class="na">putExtra</span><span class="o">(</span><span class="s">&quot;client_id&quot;</span><span class="o">,</span> <span class="n">applicationId</span><span class="o">);</span></div><div class='line' id='LC232'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">permissions</span><span class="o">.</span><span class="na">length</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC233'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span><span class="o">.</span><span class="na">putExtra</span><span class="o">(</span><span class="s">&quot;scope&quot;</span><span class="o">,</span> <span class="n">TextUtils</span><span class="o">.</span><span class="na">join</span><span class="o">(</span><span class="s">&quot;,&quot;</span><span class="o">,</span> <span class="n">permissions</span><span class="o">));</span></div><div class='line' id='LC234'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC235'><br/></div><div class='line' id='LC236'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Verify that the application whose package name is</span></div><div class='line' id='LC237'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// com.facebook.katana.ProxyAuth</span></div><div class='line' id='LC238'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// has the expected FB app signature.</span></div><div class='line' id='LC239'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">validateActivityIntent</span><span class="o">(</span><span class="n">activity</span><span class="o">,</span> <span class="n">intent</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC240'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC241'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC242'><br/></div><div class='line' id='LC243'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthActivity</span> <span class="o">=</span> <span class="n">activity</span><span class="o">;</span></div><div class='line' id='LC244'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthPermissions</span> <span class="o">=</span> <span class="n">permissions</span><span class="o">;</span></div><div class='line' id='LC245'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthActivityCode</span> <span class="o">=</span> <span class="n">activityCode</span><span class="o">;</span></div><div class='line' id='LC246'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC247'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">activity</span><span class="o">.</span><span class="na">startActivityForResult</span><span class="o">(</span><span class="n">intent</span><span class="o">,</span> <span class="n">activityCode</span><span class="o">);</span></div><div class='line' id='LC248'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">ActivityNotFoundException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC249'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">didSucceed</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC250'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC251'><br/></div><div class='line' id='LC252'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">didSucceed</span><span class="o">;</span></div><div class='line' id='LC253'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC254'><br/></div><div class='line' id='LC255'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC256'><span class="cm">     * Helper to validate an activity intent by resolving and checking the</span></div><div class='line' id='LC257'><span class="cm">     * provider&#39;s package signature.</span></div><div class='line' id='LC258'><span class="cm">     *</span></div><div class='line' id='LC259'><span class="cm">     * @param context</span></div><div class='line' id='LC260'><span class="cm">     * @param intent</span></div><div class='line' id='LC261'><span class="cm">     * @return true if the service intent resolution happens successfully and the</span></div><div class='line' id='LC262'><span class="cm">     * 	signatures match.</span></div><div class='line' id='LC263'><span class="cm">     */</span></div><div class='line' id='LC264'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="nf">validateActivityIntent</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">,</span> <span class="n">Intent</span> <span class="n">intent</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC265'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ResolveInfo</span> <span class="n">resolveInfo</span> <span class="o">=</span></div><div class='line' id='LC266'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">context</span><span class="o">.</span><span class="na">getPackageManager</span><span class="o">().</span><span class="na">resolveActivity</span><span class="o">(</span><span class="n">intent</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC267'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">resolveInfo</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC268'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC269'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC270'><br/></div><div class='line' id='LC271'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">validateAppSignatureForPackage</span><span class="o">(</span></div><div class='line' id='LC272'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">context</span><span class="o">,</span></div><div class='line' id='LC273'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">resolveInfo</span><span class="o">.</span><span class="na">activityInfo</span><span class="o">.</span><span class="na">packageName</span><span class="o">);</span></div><div class='line' id='LC274'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC275'><br/></div><div class='line' id='LC276'><br/></div><div class='line' id='LC277'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC278'><span class="cm">     * Helper to validate a service intent by resolving and checking the</span></div><div class='line' id='LC279'><span class="cm">     * provider&#39;s package signature.</span></div><div class='line' id='LC280'><span class="cm">     *</span></div><div class='line' id='LC281'><span class="cm">     * @param context</span></div><div class='line' id='LC282'><span class="cm">     * @param intent</span></div><div class='line' id='LC283'><span class="cm">     * @return true if the service intent resolution happens successfully and the</span></div><div class='line' id='LC284'><span class="cm">     * 	signatures match.</span></div><div class='line' id='LC285'><span class="cm">     */</span></div><div class='line' id='LC286'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="nf">validateServiceIntent</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">,</span> <span class="n">Intent</span> <span class="n">intent</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC287'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ResolveInfo</span> <span class="n">resolveInfo</span> <span class="o">=</span></div><div class='line' id='LC288'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">context</span><span class="o">.</span><span class="na">getPackageManager</span><span class="o">().</span><span class="na">resolveService</span><span class="o">(</span><span class="n">intent</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC289'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">resolveInfo</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC290'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC291'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC292'><br/></div><div class='line' id='LC293'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">validateAppSignatureForPackage</span><span class="o">(</span></div><div class='line' id='LC294'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">context</span><span class="o">,</span></div><div class='line' id='LC295'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">resolveInfo</span><span class="o">.</span><span class="na">serviceInfo</span><span class="o">.</span><span class="na">packageName</span><span class="o">);</span></div><div class='line' id='LC296'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC297'><br/></div><div class='line' id='LC298'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC299'><span class="cm">     * Query the signature for the application that would be invoked by the</span></div><div class='line' id='LC300'><span class="cm">     * given intent and verify that it matches the FB application&#39;s signature.</span></div><div class='line' id='LC301'><span class="cm">     *</span></div><div class='line' id='LC302'><span class="cm">     * @param context</span></div><div class='line' id='LC303'><span class="cm">     * @param packageName</span></div><div class='line' id='LC304'><span class="cm">     * @return true if the app&#39;s signature matches the expected signature.</span></div><div class='line' id='LC305'><span class="cm">     */</span></div><div class='line' id='LC306'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="nf">validateAppSignatureForPackage</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">,</span></div><div class='line' id='LC307'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">packageName</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC308'><br/></div><div class='line' id='LC309'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">PackageInfo</span> <span class="n">packageInfo</span><span class="o">;</span></div><div class='line' id='LC310'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC311'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">packageInfo</span> <span class="o">=</span> <span class="n">context</span><span class="o">.</span><span class="na">getPackageManager</span><span class="o">().</span><span class="na">getPackageInfo</span><span class="o">(</span></div><div class='line' id='LC312'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">packageName</span><span class="o">,</span> <span class="n">PackageManager</span><span class="o">.</span><span class="na">GET_SIGNATURES</span><span class="o">);</span></div><div class='line' id='LC313'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">NameNotFoundException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC314'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC315'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC316'><br/></div><div class='line' id='LC317'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="n">Signature</span> <span class="n">signature</span> <span class="o">:</span> <span class="n">packageInfo</span><span class="o">.</span><span class="na">signatures</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC318'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">signature</span><span class="o">.</span><span class="na">toCharsString</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="n">FB_APP_SIGNATURE</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC319'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC320'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC321'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC322'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC323'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC324'><br/></div><div class='line' id='LC325'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC326'><span class="cm">     * Internal method to handle dialog-based authentication backend for</span></div><div class='line' id='LC327'><span class="cm">     * authorize().</span></div><div class='line' id='LC328'><span class="cm">     *</span></div><div class='line' id='LC329'><span class="cm">     * @param activity</span></div><div class='line' id='LC330'><span class="cm">     *            The Android Activity that will parent the auth dialog.</span></div><div class='line' id='LC331'><span class="cm">     * @param applicationId</span></div><div class='line' id='LC332'><span class="cm">     *            The Facebook application identifier.</span></div><div class='line' id='LC333'><span class="cm">     * @param permissions</span></div><div class='line' id='LC334'><span class="cm">     *            A list of permissions required for this application. If you do</span></div><div class='line' id='LC335'><span class="cm">     *            not require any permissions, pass an empty String array.</span></div><div class='line' id='LC336'><span class="cm">     */</span></div><div class='line' id='LC337'>	<span class="kd">private</span> <span class="kt">void</span> <span class="nf">startDialogAuth</span><span class="o">(</span><span class="n">Activity</span> <span class="n">activity</span><span class="o">,</span> <span class="n">String</span><span class="o">[]</span> <span class="n">permissions</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC338'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Bundle</span> <span class="n">params</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Bundle</span><span class="o">();</span></div><div class='line' id='LC339'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">permissions</span><span class="o">.</span><span class="na">length</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC340'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">params</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="s">&quot;scope&quot;</span><span class="o">,</span> <span class="n">TextUtils</span><span class="o">.</span><span class="na">join</span><span class="o">(</span><span class="s">&quot;,&quot;</span><span class="o">,</span> <span class="n">permissions</span><span class="o">));</span></div><div class='line' id='LC341'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC342'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">CookieSyncManager</span><span class="o">.</span><span class="na">createInstance</span><span class="o">(</span><span class="n">activity</span><span class="o">);</span></div><div class='line' id='LC343'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">dialog</span><span class="o">(</span><span class="n">activity</span><span class="o">,</span> <span class="n">LOGIN</span><span class="o">,</span> <span class="n">params</span><span class="o">,</span> <span class="k">new</span> <span class="n">DialogListener</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC344'><br/></div><div class='line' id='LC345'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onComplete</span><span class="o">(</span><span class="n">Bundle</span> <span class="n">values</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC346'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// ensure any cookies set by the dialog are saved</span></div><div class='line' id='LC347'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">CookieSyncManager</span><span class="o">.</span><span class="na">getInstance</span><span class="o">().</span><span class="na">sync</span><span class="o">();</span></div><div class='line' id='LC348'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setAccessToken</span><span class="o">(</span><span class="n">values</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="n">TOKEN</span><span class="o">));</span></div><div class='line' id='LC349'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setAccessExpiresIn</span><span class="o">(</span><span class="n">values</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="n">EXPIRES</span><span class="o">));</span></div><div class='line' id='LC350'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">isSessionValid</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC351'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-authorize&quot;</span><span class="o">,</span> <span class="s">&quot;Login Success! access_token=&quot;</span></div><div class='line' id='LC352'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">getAccessToken</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot; expires=&quot;</span></div><div class='line' id='LC353'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">getAccessExpires</span><span class="o">());</span></div><div class='line' id='LC354'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onComplete</span><span class="o">(</span><span class="n">values</span><span class="o">);</span></div><div class='line' id='LC355'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC356'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onFacebookError</span><span class="o">(</span><span class="k">new</span> <span class="n">FacebookError</span><span class="o">(</span></div><div class='line' id='LC357'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;Failed to receive access token.&quot;</span><span class="o">));</span></div><div class='line' id='LC358'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC359'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC360'><br/></div><div class='line' id='LC361'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onError</span><span class="o">(</span><span class="n">DialogError</span> <span class="n">error</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC362'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-authorize&quot;</span><span class="o">,</span> <span class="s">&quot;Login failed: &quot;</span> <span class="o">+</span> <span class="n">error</span><span class="o">);</span></div><div class='line' id='LC363'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onError</span><span class="o">(</span><span class="n">error</span><span class="o">);</span></div><div class='line' id='LC364'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC365'><br/></div><div class='line' id='LC366'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onFacebookError</span><span class="o">(</span><span class="n">FacebookError</span> <span class="n">error</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC367'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-authorize&quot;</span><span class="o">,</span> <span class="s">&quot;Login failed: &quot;</span> <span class="o">+</span> <span class="n">error</span><span class="o">);</span></div><div class='line' id='LC368'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onFacebookError</span><span class="o">(</span><span class="n">error</span><span class="o">);</span></div><div class='line' id='LC369'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC370'><br/></div><div class='line' id='LC371'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onCancel</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC372'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-authorize&quot;</span><span class="o">,</span> <span class="s">&quot;Login canceled&quot;</span><span class="o">);</span></div><div class='line' id='LC373'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onCancel</span><span class="o">();</span></div><div class='line' id='LC374'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC375'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">});</span></div><div class='line' id='LC376'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC377'><br/></div><div class='line' id='LC378'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC379'><span class="cm">     * IMPORTANT: This method must be invoked at the top of the calling</span></div><div class='line' id='LC380'><span class="cm">     * activity&#39;s onActivityResult() function or Facebook authentication will</span></div><div class='line' id='LC381'><span class="cm">     * not function properly!</span></div><div class='line' id='LC382'><span class="cm">     *</span></div><div class='line' id='LC383'><span class="cm">     * If your calling activity does not currently implement onActivityResult(),</span></div><div class='line' id='LC384'><span class="cm">     * you must implement it and include a call to this method if you intend to</span></div><div class='line' id='LC385'><span class="cm">     * use the authorize() method in this SDK.</span></div><div class='line' id='LC386'><span class="cm">     *</span></div><div class='line' id='LC387'><span class="cm">     * For more information, see</span></div><div class='line' id='LC388'><span class="cm">     * http://developer.android.com/reference/android/app/</span></div><div class='line' id='LC389'><span class="cm">     *   Activity.html#onActivityResult(int, int, android.content.Intent)</span></div><div class='line' id='LC390'><span class="cm">     */</span></div><div class='line' id='LC391'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">authorizeCallback</span><span class="o">(</span><span class="kt">int</span> <span class="n">requestCode</span><span class="o">,</span> <span class="kt">int</span> <span class="n">resultCode</span><span class="o">,</span> <span class="n">Intent</span> <span class="n">data</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC392'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">requestCode</span> <span class="o">==</span> <span class="n">mAuthActivityCode</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC393'><br/></div><div class='line' id='LC394'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Successfully redirected.</span></div><div class='line' id='LC395'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">resultCode</span> <span class="o">==</span> <span class="n">Activity</span><span class="o">.</span><span class="na">RESULT_OK</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC396'><br/></div><div class='line' id='LC397'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Check OAuth 2.0/2.10 error code.</span></div><div class='line' id='LC398'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">error</span> <span class="o">=</span> <span class="n">data</span><span class="o">.</span><span class="na">getStringExtra</span><span class="o">(</span><span class="s">&quot;error&quot;</span><span class="o">);</span></div><div class='line' id='LC399'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">error</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC400'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">error</span> <span class="o">=</span> <span class="n">data</span><span class="o">.</span><span class="na">getStringExtra</span><span class="o">(</span><span class="s">&quot;error_type&quot;</span><span class="o">);</span></div><div class='line' id='LC401'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC402'><br/></div><div class='line' id='LC403'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// A Facebook error occurred.</span></div><div class='line' id='LC404'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">error</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC405'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">error</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">SINGLE_SIGN_ON_DISABLED</span><span class="o">)</span></div><div class='line' id='LC406'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">error</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;AndroidAuthKillSwitchException&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC407'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-authorize&quot;</span><span class="o">,</span> <span class="s">&quot;Hosted auth currently &quot;</span></div><div class='line' id='LC408'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;disabled. Retrying dialog auth...&quot;</span><span class="o">);</span></div><div class='line' id='LC409'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">startDialogAuth</span><span class="o">(</span><span class="n">mAuthActivity</span><span class="o">,</span> <span class="n">mAuthPermissions</span><span class="o">);</span></div><div class='line' id='LC410'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">error</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;access_denied&quot;</span><span class="o">)</span></div><div class='line' id='LC411'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">error</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;OAuthAccessDeniedException&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC412'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-authorize&quot;</span><span class="o">,</span> <span class="s">&quot;Login canceled by user.&quot;</span><span class="o">);</span></div><div class='line' id='LC413'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onCancel</span><span class="o">();</span></div><div class='line' id='LC414'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC415'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">description</span> <span class="o">=</span> <span class="n">data</span><span class="o">.</span><span class="na">getStringExtra</span><span class="o">(</span><span class="s">&quot;error_description&quot;</span><span class="o">);</span></div><div class='line' id='LC416'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">description</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC417'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">error</span> <span class="o">=</span> <span class="n">error</span> <span class="o">+</span> <span class="s">&quot;:&quot;</span> <span class="o">+</span> <span class="n">description</span><span class="o">;</span></div><div class='line' id='LC418'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC419'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-authorize&quot;</span><span class="o">,</span> <span class="s">&quot;Login failed: &quot;</span> <span class="o">+</span> <span class="n">error</span><span class="o">);</span></div><div class='line' id='LC420'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onFacebookError</span><span class="o">(</span></div><div class='line' id='LC421'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">new</span> <span class="nf">FacebookError</span><span class="o">(</span><span class="n">error</span><span class="o">));</span></div><div class='line' id='LC422'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC423'><br/></div><div class='line' id='LC424'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// No errors.</span></div><div class='line' id='LC425'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC426'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setAccessToken</span><span class="o">(</span><span class="n">data</span><span class="o">.</span><span class="na">getStringExtra</span><span class="o">(</span><span class="n">TOKEN</span><span class="o">));</span></div><div class='line' id='LC427'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setAccessExpiresIn</span><span class="o">(</span><span class="n">data</span><span class="o">.</span><span class="na">getStringExtra</span><span class="o">(</span><span class="n">EXPIRES</span><span class="o">));</span></div><div class='line' id='LC428'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">isSessionValid</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC429'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-authorize&quot;</span><span class="o">,</span></div><div class='line' id='LC430'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;Login Success! access_token=&quot;</span></div><div class='line' id='LC431'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">getAccessToken</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot; expires=&quot;</span></div><div class='line' id='LC432'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">getAccessExpires</span><span class="o">());</span></div><div class='line' id='LC433'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onComplete</span><span class="o">(</span><span class="n">data</span><span class="o">.</span><span class="na">getExtras</span><span class="o">());</span></div><div class='line' id='LC434'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC435'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onFacebookError</span><span class="o">(</span><span class="k">new</span> <span class="n">FacebookError</span><span class="o">(</span></div><div class='line' id='LC436'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;Failed to receive access token.&quot;</span><span class="o">));</span></div><div class='line' id='LC437'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC438'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC439'><br/></div><div class='line' id='LC440'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// An error occurred before we could be redirected.</span></div><div class='line' id='LC441'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">resultCode</span> <span class="o">==</span> <span class="n">Activity</span><span class="o">.</span><span class="na">RESULT_CANCELED</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC442'><br/></div><div class='line' id='LC443'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// An Android error occured.</span></div><div class='line' id='LC444'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">data</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC445'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-authorize&quot;</span><span class="o">,</span></div><div class='line' id='LC446'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;Login failed: &quot;</span> <span class="o">+</span> <span class="n">data</span><span class="o">.</span><span class="na">getStringExtra</span><span class="o">(</span><span class="s">&quot;error&quot;</span><span class="o">));</span></div><div class='line' id='LC447'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onError</span><span class="o">(</span></div><div class='line' id='LC448'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">new</span> <span class="nf">DialogError</span><span class="o">(</span></div><div class='line' id='LC449'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">data</span><span class="o">.</span><span class="na">getStringExtra</span><span class="o">(</span><span class="s">&quot;error&quot;</span><span class="o">),</span></div><div class='line' id='LC450'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">data</span><span class="o">.</span><span class="na">getIntExtra</span><span class="o">(</span><span class="s">&quot;error_code&quot;</span><span class="o">,</span> <span class="o">-</span><span class="mi">1</span><span class="o">),</span></div><div class='line' id='LC451'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">data</span><span class="o">.</span><span class="na">getStringExtra</span><span class="o">(</span><span class="s">&quot;failing_url&quot;</span><span class="o">)));</span></div><div class='line' id='LC452'><br/></div><div class='line' id='LC453'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// User pressed the &#39;back&#39; button.</span></div><div class='line' id='LC454'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC455'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-authorize&quot;</span><span class="o">,</span> <span class="s">&quot;Login canceled by user.&quot;</span><span class="o">);</span></div><div class='line' id='LC456'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAuthDialogListener</span><span class="o">.</span><span class="na">onCancel</span><span class="o">();</span></div><div class='line' id='LC457'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC458'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC459'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC460'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC461'><br/></div><div class='line' id='LC462'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC463'><span class="cm">     * Refresh OAuth access token method. Binds to Facebook for Android</span></div><div class='line' id='LC464'><span class="cm">     * stand-alone application application to refresh the access token. This</span></div><div class='line' id='LC465'><span class="cm">     * method tries to connect to the Facebook App which will handle the</span></div><div class='line' id='LC466'><span class="cm">     * authentication flow, and return a new OAuth access token. This method</span></div><div class='line' id='LC467'><span class="cm">     * will automatically replace the old token with a new one. Note that this</span></div><div class='line' id='LC468'><span class="cm">     * method is asynchronous and the callback will be invoked in the original</span></div><div class='line' id='LC469'><span class="cm">     * calling thread (not in a background thread).</span></div><div class='line' id='LC470'><span class="cm">     * </span></div><div class='line' id='LC471'><span class="cm">     * @param context</span></div><div class='line' id='LC472'><span class="cm">     *            The Android Context that will be used to bind to the Facebook</span></div><div class='line' id='LC473'><span class="cm">     *            RefreshToken Service</span></div><div class='line' id='LC474'><span class="cm">     * @param serviceListener</span></div><div class='line' id='LC475'><span class="cm">     *            Callback interface for notifying the calling application when</span></div><div class='line' id='LC476'><span class="cm">     *            the refresh request has completed or failed (can be null). In</span></div><div class='line' id='LC477'><span class="cm">     *            case of a success a new token can be found inside the result</span></div><div class='line' id='LC478'><span class="cm">     *            Bundle under Facebook.ACCESS_TOKEN key.</span></div><div class='line' id='LC479'><span class="cm">     * @return true if the binding to the RefreshToken Service was created</span></div><div class='line' id='LC480'><span class="cm">     */</span></div><div class='line' id='LC481'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">extendAccessToken</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">,</span> <span class="n">ServiceListener</span> <span class="n">serviceListener</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC482'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Intent</span> <span class="n">intent</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Intent</span><span class="o">();</span></div><div class='line' id='LC483'><br/></div><div class='line' id='LC484'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span><span class="o">.</span><span class="na">setClassName</span><span class="o">(</span><span class="s">&quot;com.facebook.katana&quot;</span><span class="o">,</span></div><div class='line' id='LC485'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;com.facebook.katana.platform.TokenRefreshService&quot;</span><span class="o">);</span></div><div class='line' id='LC486'><br/></div><div class='line' id='LC487'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Verify that the application whose package name is</span></div><div class='line' id='LC488'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// com.facebook.katana</span></div><div class='line' id='LC489'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// has the expected FB app signature.</span></div><div class='line' id='LC490'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">validateServiceIntent</span><span class="o">(</span><span class="n">context</span><span class="o">,</span> <span class="n">intent</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC491'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC492'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC493'><br/></div><div class='line' id='LC494'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">context</span><span class="o">.</span><span class="na">bindService</span><span class="o">(</span><span class="n">intent</span><span class="o">,</span></div><div class='line' id='LC495'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">new</span> <span class="nf">TokenRefreshServiceConnection</span><span class="o">(</span><span class="n">context</span><span class="o">,</span> <span class="n">serviceListener</span><span class="o">),</span></div><div class='line' id='LC496'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Context</span><span class="o">.</span><span class="na">BIND_AUTO_CREATE</span><span class="o">);</span></div><div class='line' id='LC497'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC498'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC499'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC500'><span class="cm">    * Calls extendAccessToken if shouldExtendAccessToken returns true.</span></div><div class='line' id='LC501'><span class="cm">    * </span></div><div class='line' id='LC502'><span class="cm">    * @return the same value as extendAccessToken if the the token requires</span></div><div class='line' id='LC503'><span class="cm">    *           refreshing, true otherwise</span></div><div class='line' id='LC504'><span class="cm">    */</span></div><div class='line' id='LC505'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">extendAccessTokenIfNeeded</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">,</span> <span class="n">ServiceListener</span> <span class="n">serviceListener</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC506'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">shouldExtendAccessToken</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC507'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">extendAccessToken</span><span class="o">(</span><span class="n">context</span><span class="o">,</span> <span class="n">serviceListener</span><span class="o">);</span></div><div class='line' id='LC508'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC509'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC510'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC511'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC512'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC513'><span class="cm">     * Check if the access token requires refreshing. </span></div><div class='line' id='LC514'><span class="cm">     * </span></div><div class='line' id='LC515'><span class="cm">     * @return true if the last time a new token was obtained was over 24 hours ago.</span></div><div class='line' id='LC516'><span class="cm">     */</span></div><div class='line' id='LC517'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">shouldExtendAccessToken</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC518'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">isSessionValid</span><span class="o">()</span> <span class="o">&amp;&amp;</span></div><div class='line' id='LC519'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">(</span><span class="n">System</span><span class="o">.</span><span class="na">currentTimeMillis</span><span class="o">()</span> <span class="o">-</span> <span class="n">mLastAccessUpdate</span> <span class="o">&gt;=</span> <span class="n">REFRESH_TOKEN_BARRIER</span><span class="o">);</span></div><div class='line' id='LC520'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC521'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC522'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC523'><span class="cm">     * Handles connection to the token refresh service (this service is a part</span></div><div class='line' id='LC524'><span class="cm">     * of Facebook App).</span></div><div class='line' id='LC525'><span class="cm">     */</span></div><div class='line' id='LC526'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">class</span> <span class="nc">TokenRefreshServiceConnection</span> <span class="kd">implements</span> <span class="n">ServiceConnection</span> <span class="o">{</span></div><div class='line' id='LC527'><br/></div><div class='line' id='LC528'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="n">Messenger</span> <span class="n">messageReceiver</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Messenger</span><span class="o">(</span><span class="k">new</span> <span class="n">Handler</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC529'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC530'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">handleMessage</span><span class="o">(</span><span class="n">Message</span> <span class="n">msg</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC531'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">token</span> <span class="o">=</span> <span class="n">msg</span><span class="o">.</span><span class="na">getData</span><span class="o">().</span><span class="na">getString</span><span class="o">(</span><span class="n">TOKEN</span><span class="o">);</span></div><div class='line' id='LC532'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">long</span> <span class="n">expiresAt</span> <span class="o">=</span> <span class="n">msg</span><span class="o">.</span><span class="na">getData</span><span class="o">().</span><span class="na">getLong</span><span class="o">(</span><span class="n">EXPIRES</span><span class="o">)</span> <span class="o">*</span> <span class="mi">1000L</span><span class="o">;</span></div><div class='line' id='LC533'><br/></div><div class='line' id='LC534'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// To avoid confusion we should return the expiration time in</span></div><div class='line' id='LC535'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// the same format as the getAccessExpires() function - that</span></div><div class='line' id='LC536'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// is in milliseconds.</span></div><div class='line' id='LC537'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Bundle</span> <span class="n">resultBundle</span> <span class="o">=</span> <span class="o">(</span><span class="n">Bundle</span><span class="o">)</span> <span class="n">msg</span><span class="o">.</span><span class="na">getData</span><span class="o">().</span><span class="na">clone</span><span class="o">();</span></div><div class='line' id='LC538'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">resultBundle</span><span class="o">.</span><span class="na">putLong</span><span class="o">(</span><span class="n">EXPIRES</span><span class="o">,</span> <span class="n">expiresAt</span><span class="o">);</span></div><div class='line' id='LC539'><br/></div><div class='line' id='LC540'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">token</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC541'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setAccessToken</span><span class="o">(</span><span class="n">token</span><span class="o">);</span></div><div class='line' id='LC542'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setAccessExpires</span><span class="o">(</span><span class="n">expiresAt</span><span class="o">);</span></div><div class='line' id='LC543'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">serviceListener</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC544'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">serviceListener</span><span class="o">.</span><span class="na">onComplete</span><span class="o">(</span><span class="n">resultBundle</span><span class="o">);</span></div><div class='line' id='LC545'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC546'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">serviceListener</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span> <span class="c1">// extract errors only if client wants them</span></div><div class='line' id='LC547'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">error</span> <span class="o">=</span> <span class="n">msg</span><span class="o">.</span><span class="na">getData</span><span class="o">().</span><span class="na">getString</span><span class="o">(</span><span class="s">&quot;error&quot;</span><span class="o">);</span></div><div class='line' id='LC548'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">msg</span><span class="o">.</span><span class="na">getData</span><span class="o">().</span><span class="na">containsKey</span><span class="o">(</span><span class="s">&quot;error_code&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC549'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">errorCode</span> <span class="o">=</span> <span class="n">msg</span><span class="o">.</span><span class="na">getData</span><span class="o">().</span><span class="na">getInt</span><span class="o">(</span><span class="s">&quot;error_code&quot;</span><span class="o">);</span></div><div class='line' id='LC550'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">serviceListener</span><span class="o">.</span><span class="na">onFacebookError</span><span class="o">(</span><span class="k">new</span> <span class="n">FacebookError</span><span class="o">(</span><span class="n">error</span><span class="o">,</span> <span class="kc">null</span><span class="o">,</span> <span class="n">errorCode</span><span class="o">));</span></div><div class='line' id='LC551'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC552'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">serviceListener</span><span class="o">.</span><span class="na">onError</span><span class="o">(</span><span class="k">new</span> <span class="n">Error</span><span class="o">(</span><span class="n">error</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">?</span> <span class="n">error</span></div><div class='line' id='LC553'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="s">&quot;Unknown service error&quot;</span><span class="o">));</span></div><div class='line' id='LC554'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC555'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC556'><br/></div><div class='line' id='LC557'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// The refreshToken function should be called rarely,</span></div><div class='line' id='LC558'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// so there is no point in keeping the binding open.</span></div><div class='line' id='LC559'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">applicationsContext</span><span class="o">.</span><span class="na">unbindService</span><span class="o">(</span><span class="n">TokenRefreshServiceConnection</span><span class="o">.</span><span class="na">this</span><span class="o">);</span></div><div class='line' id='LC560'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC561'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">});</span></div><div class='line' id='LC562'><br/></div><div class='line' id='LC563'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="n">ServiceListener</span> <span class="n">serviceListener</span><span class="o">;</span></div><div class='line' id='LC564'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="n">Context</span> <span class="n">applicationsContext</span><span class="o">;</span></div><div class='line' id='LC565'><br/></div><div class='line' id='LC566'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Messenger</span> <span class="n">messageSender</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC567'><br/></div><div class='line' id='LC568'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">TokenRefreshServiceConnection</span><span class="o">(</span><span class="n">Context</span> <span class="n">applicationsContext</span><span class="o">,</span></div><div class='line' id='LC569'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ServiceListener</span> <span class="n">serviceListener</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC570'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">applicationsContext</span> <span class="o">=</span> <span class="n">applicationsContext</span><span class="o">;</span></div><div class='line' id='LC571'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">serviceListener</span> <span class="o">=</span> <span class="n">serviceListener</span><span class="o">;</span></div><div class='line' id='LC572'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC573'><br/></div><div class='line' id='LC574'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC575'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onServiceConnected</span><span class="o">(</span><span class="n">ComponentName</span> <span class="n">className</span><span class="o">,</span> <span class="n">IBinder</span> <span class="n">service</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC576'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">messageSender</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Messenger</span><span class="o">(</span><span class="n">service</span><span class="o">);</span></div><div class='line' id='LC577'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">refreshToken</span><span class="o">();</span></div><div class='line' id='LC578'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC579'><br/></div><div class='line' id='LC580'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC581'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onServiceDisconnected</span><span class="o">(</span><span class="n">ComponentName</span> <span class="n">arg</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC582'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">serviceListener</span><span class="o">.</span><span class="na">onError</span><span class="o">(</span><span class="k">new</span> <span class="n">Error</span><span class="o">(</span><span class="s">&quot;Service disconnected&quot;</span><span class="o">));</span></div><div class='line' id='LC583'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// We returned an error so there&#39;s no point in</span></div><div class='line' id='LC584'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// keeping the binding open.</span></div><div class='line' id='LC585'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">applicationsContext</span><span class="o">.</span><span class="na">unbindService</span><span class="o">(</span><span class="n">TokenRefreshServiceConnection</span><span class="o">.</span><span class="na">this</span><span class="o">);</span></div><div class='line' id='LC586'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC587'><br/></div><div class='line' id='LC588'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">refreshToken</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC589'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Bundle</span> <span class="n">requestData</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Bundle</span><span class="o">();</span></div><div class='line' id='LC590'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">requestData</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="n">TOKEN</span><span class="o">,</span> <span class="n">mAccessToken</span><span class="o">);</span></div><div class='line' id='LC591'><br/></div><div class='line' id='LC592'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Message</span> <span class="n">request</span> <span class="o">=</span> <span class="n">Message</span><span class="o">.</span><span class="na">obtain</span><span class="o">();</span></div><div class='line' id='LC593'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">request</span><span class="o">.</span><span class="na">setData</span><span class="o">(</span><span class="n">requestData</span><span class="o">);</span></div><div class='line' id='LC594'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">request</span><span class="o">.</span><span class="na">replyTo</span> <span class="o">=</span> <span class="n">messageReceiver</span><span class="o">;</span></div><div class='line' id='LC595'><br/></div><div class='line' id='LC596'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC597'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">messageSender</span><span class="o">.</span><span class="na">send</span><span class="o">(</span><span class="n">request</span><span class="o">);</span></div><div class='line' id='LC598'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">RemoteException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC599'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">serviceListener</span><span class="o">.</span><span class="na">onError</span><span class="o">(</span><span class="k">new</span> <span class="n">Error</span><span class="o">(</span><span class="s">&quot;Service connection error&quot;</span><span class="o">));</span></div><div class='line' id='LC600'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC601'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC602'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">};</span>    </div><div class='line' id='LC603'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC604'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC605'><span class="cm">     * Invalidate the current user session by removing the access token in</span></div><div class='line' id='LC606'><span class="cm">     * memory, clearing the browser cookie, and calling auth.expireSession</span></div><div class='line' id='LC607'><span class="cm">     * through the API.</span></div><div class='line' id='LC608'><span class="cm">     *</span></div><div class='line' id='LC609'><span class="cm">     * Note that this method blocks waiting for a network response, so do not</span></div><div class='line' id='LC610'><span class="cm">     * call it in a UI thread.</span></div><div class='line' id='LC611'><span class="cm">     *</span></div><div class='line' id='LC612'><span class="cm">     * @param context</span></div><div class='line' id='LC613'><span class="cm">     *            The Android context in which the logout should be called: it</span></div><div class='line' id='LC614'><span class="cm">     *            should be the same context in which the login occurred in</span></div><div class='line' id='LC615'><span class="cm">     *            order to clear any stored cookies</span></div><div class='line' id='LC616'><span class="cm">     * @throws IOException</span></div><div class='line' id='LC617'><span class="cm">     * @throws MalformedURLException</span></div><div class='line' id='LC618'><span class="cm">     * @return JSON string representation of the auth.expireSession response</span></div><div class='line' id='LC619'><span class="cm">     *            (&quot;true&quot; if successful)</span></div><div class='line' id='LC620'><span class="cm">     */</span></div><div class='line' id='LC621'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">logout</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">)</span></div><div class='line' id='LC622'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">throws</span> <span class="n">MalformedURLException</span><span class="o">,</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC623'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">clearCookies</span><span class="o">(</span><span class="n">context</span><span class="o">);</span></div><div class='line' id='LC624'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Bundle</span> <span class="n">b</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Bundle</span><span class="o">();</span></div><div class='line' id='LC625'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">b</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="s">&quot;method&quot;</span><span class="o">,</span> <span class="s">&quot;auth.expireSession&quot;</span><span class="o">);</span></div><div class='line' id='LC626'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">response</span> <span class="o">=</span> <span class="n">request</span><span class="o">(</span><span class="n">b</span><span class="o">);</span></div><div class='line' id='LC627'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setAccessToken</span><span class="o">(</span><span class="kc">null</span><span class="o">);</span></div><div class='line' id='LC628'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setAccessExpires</span><span class="o">(</span><span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC629'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">response</span><span class="o">;</span></div><div class='line' id='LC630'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC631'><br/></div><div class='line' id='LC632'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC633'><span class="cm">     * Make a request to Facebook&#39;s old (pre-graph) API with the given</span></div><div class='line' id='LC634'><span class="cm">     * parameters. One of the parameter keys must be &quot;method&quot; and its value</span></div><div class='line' id='LC635'><span class="cm">     * should be a valid REST server API method.</span></div><div class='line' id='LC636'><span class="cm">     *</span></div><div class='line' id='LC637'><span class="cm">     * See http://developers.facebook.com/docs/reference/rest/</span></div><div class='line' id='LC638'><span class="cm">     *</span></div><div class='line' id='LC639'><span class="cm">     * Note that this method blocks waiting for a network response, so do not</span></div><div class='line' id='LC640'><span class="cm">     * call it in a UI thread.</span></div><div class='line' id='LC641'><span class="cm">     *</span></div><div class='line' id='LC642'><span class="cm">     * Example:</span></div><div class='line' id='LC643'><span class="cm">     * &lt;code&gt;</span></div><div class='line' id='LC644'><span class="cm">     *  Bundle parameters = new Bundle();</span></div><div class='line' id='LC645'><span class="cm">     *  parameters.putString(&quot;method&quot;, &quot;auth.expireSession&quot;);</span></div><div class='line' id='LC646'><span class="cm">     *  String response = request(parameters);</span></div><div class='line' id='LC647'><span class="cm">     * &lt;/code&gt;</span></div><div class='line' id='LC648'><span class="cm">     *</span></div><div class='line' id='LC649'><span class="cm">     * @param parameters</span></div><div class='line' id='LC650'><span class="cm">     *            Key-value pairs of parameters to the request. Refer to the</span></div><div class='line' id='LC651'><span class="cm">     *            documentation: one of the parameters must be &quot;method&quot;.</span></div><div class='line' id='LC652'><span class="cm">     * @throws IOException</span></div><div class='line' id='LC653'><span class="cm">     *            if a network error occurs</span></div><div class='line' id='LC654'><span class="cm">     * @throws MalformedURLException</span></div><div class='line' id='LC655'><span class="cm">     *            if accessing an invalid endpoint</span></div><div class='line' id='LC656'><span class="cm">     * @throws IllegalArgumentException</span></div><div class='line' id='LC657'><span class="cm">     *            if one of the parameters is not &quot;method&quot;</span></div><div class='line' id='LC658'><span class="cm">     * @return JSON string representation of the response</span></div><div class='line' id='LC659'><span class="cm">     */</span></div><div class='line' id='LC660'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">request</span><span class="o">(</span><span class="n">Bundle</span> <span class="n">parameters</span><span class="o">)</span></div><div class='line' id='LC661'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">throws</span> <span class="n">MalformedURLException</span><span class="o">,</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC662'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">parameters</span><span class="o">.</span><span class="na">containsKey</span><span class="o">(</span><span class="s">&quot;method&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC663'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span><span class="s">&quot;API method must be specified. &quot;</span></div><div class='line' id='LC664'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;(parameters must contain key \&quot;method\&quot; and value). See&quot;</span></div><div class='line' id='LC665'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot; http://developers.facebook.com/docs/reference/rest/&quot;</span><span class="o">);</span></div><div class='line' id='LC666'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC667'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">request</span><span class="o">(</span><span class="kc">null</span><span class="o">,</span> <span class="n">parameters</span><span class="o">,</span> <span class="s">&quot;GET&quot;</span><span class="o">);</span></div><div class='line' id='LC668'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC669'><br/></div><div class='line' id='LC670'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC671'><span class="cm">     * Make a request to the Facebook Graph API without any parameters.</span></div><div class='line' id='LC672'><span class="cm">     *</span></div><div class='line' id='LC673'><span class="cm">     * See http://developers.facebook.com/docs/api</span></div><div class='line' id='LC674'><span class="cm">     *</span></div><div class='line' id='LC675'><span class="cm">     * Note that this method blocks waiting for a network response, so do not</span></div><div class='line' id='LC676'><span class="cm">     * call it in a UI thread.</span></div><div class='line' id='LC677'><span class="cm">     *</span></div><div class='line' id='LC678'><span class="cm">     * @param graphPath</span></div><div class='line' id='LC679'><span class="cm">     *            Path to resource in the Facebook graph, e.g., to fetch data</span></div><div class='line' id='LC680'><span class="cm">     *            about the currently logged authenticated user, provide &quot;me&quot;,</span></div><div class='line' id='LC681'><span class="cm">     *            which will fetch http://graph.facebook.com/me</span></div><div class='line' id='LC682'><span class="cm">     * @throws IOException</span></div><div class='line' id='LC683'><span class="cm">     * @throws MalformedURLException</span></div><div class='line' id='LC684'><span class="cm">     * @return JSON string representation of the response</span></div><div class='line' id='LC685'><span class="cm">     */</span></div><div class='line' id='LC686'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">request</span><span class="o">(</span><span class="n">String</span> <span class="n">graphPath</span><span class="o">)</span></div><div class='line' id='LC687'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">throws</span> <span class="n">MalformedURLException</span><span class="o">,</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC688'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">request</span><span class="o">(</span><span class="n">graphPath</span><span class="o">,</span> <span class="k">new</span> <span class="n">Bundle</span><span class="o">(),</span> <span class="s">&quot;GET&quot;</span><span class="o">);</span></div><div class='line' id='LC689'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC690'><br/></div><div class='line' id='LC691'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC692'><span class="cm">     * Make a request to the Facebook Graph API with the given string parameters</span></div><div class='line' id='LC693'><span class="cm">     * using an HTTP GET (default method).</span></div><div class='line' id='LC694'><span class="cm">     *</span></div><div class='line' id='LC695'><span class="cm">     * See http://developers.facebook.com/docs/api</span></div><div class='line' id='LC696'><span class="cm">     *</span></div><div class='line' id='LC697'><span class="cm">     * Note that this method blocks waiting for a network response, so do not</span></div><div class='line' id='LC698'><span class="cm">     * call it in a UI thread.</span></div><div class='line' id='LC699'><span class="cm">     *</span></div><div class='line' id='LC700'><span class="cm">     * @param graphPath</span></div><div class='line' id='LC701'><span class="cm">     *            Path to resource in the Facebook graph, e.g., to fetch data</span></div><div class='line' id='LC702'><span class="cm">     *            about the currently logged authenticated user, provide &quot;me&quot;,</span></div><div class='line' id='LC703'><span class="cm">     *            which will fetch http://graph.facebook.com/me</span></div><div class='line' id='LC704'><span class="cm">     * @param parameters</span></div><div class='line' id='LC705'><span class="cm">     *            key-value string parameters, e.g. the path &quot;search&quot; with</span></div><div class='line' id='LC706'><span class="cm">     *            parameters &quot;q&quot; : &quot;facebook&quot; would produce a query for the</span></div><div class='line' id='LC707'><span class="cm">     *            following graph resource:</span></div><div class='line' id='LC708'><span class="cm">     *            https://graph.facebook.com/search?q=facebook</span></div><div class='line' id='LC709'><span class="cm">     * @throws IOException</span></div><div class='line' id='LC710'><span class="cm">     * @throws MalformedURLException</span></div><div class='line' id='LC711'><span class="cm">     * @return JSON string representation of the response</span></div><div class='line' id='LC712'><span class="cm">     */</span></div><div class='line' id='LC713'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">request</span><span class="o">(</span><span class="n">String</span> <span class="n">graphPath</span><span class="o">,</span> <span class="n">Bundle</span> <span class="n">parameters</span><span class="o">)</span></div><div class='line' id='LC714'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">throws</span> <span class="n">MalformedURLException</span><span class="o">,</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC715'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">request</span><span class="o">(</span><span class="n">graphPath</span><span class="o">,</span> <span class="n">parameters</span><span class="o">,</span> <span class="s">&quot;GET&quot;</span><span class="o">);</span></div><div class='line' id='LC716'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC717'><br/></div><div class='line' id='LC718'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC719'><span class="cm">     * Synchronously make a request to the Facebook Graph API with the given</span></div><div class='line' id='LC720'><span class="cm">     * HTTP method and string parameters. Note that binary data parameters</span></div><div class='line' id='LC721'><span class="cm">     * (e.g. pictures) are not yet supported by this helper function.</span></div><div class='line' id='LC722'><span class="cm">     *</span></div><div class='line' id='LC723'><span class="cm">     * See http://developers.facebook.com/docs/api</span></div><div class='line' id='LC724'><span class="cm">     *</span></div><div class='line' id='LC725'><span class="cm">     * Note that this method blocks waiting for a network response, so do not</span></div><div class='line' id='LC726'><span class="cm">     * call it in a UI thread.</span></div><div class='line' id='LC727'><span class="cm">     *</span></div><div class='line' id='LC728'><span class="cm">     * @param graphPath</span></div><div class='line' id='LC729'><span class="cm">     *            Path to resource in the Facebook graph, e.g., to fetch data</span></div><div class='line' id='LC730'><span class="cm">     *            about the currently logged authenticated user, provide &quot;me&quot;,</span></div><div class='line' id='LC731'><span class="cm">     *            which will fetch http://graph.facebook.com/me</span></div><div class='line' id='LC732'><span class="cm">     * @param params</span></div><div class='line' id='LC733'><span class="cm">     *            Key-value string parameters, e.g. the path &quot;search&quot; with</span></div><div class='line' id='LC734'><span class="cm">     *            parameters {&quot;q&quot; : &quot;facebook&quot;} would produce a query for the</span></div><div class='line' id='LC735'><span class="cm">     *            following graph resource:</span></div><div class='line' id='LC736'><span class="cm">     *            https://graph.facebook.com/search?q=facebook</span></div><div class='line' id='LC737'><span class="cm">     * @param httpMethod</span></div><div class='line' id='LC738'><span class="cm">     *            http verb, e.g. &quot;GET&quot;, &quot;POST&quot;, &quot;DELETE&quot;</span></div><div class='line' id='LC739'><span class="cm">     * @throws IOException</span></div><div class='line' id='LC740'><span class="cm">     * @throws MalformedURLException</span></div><div class='line' id='LC741'><span class="cm">     * @return JSON string representation of the response</span></div><div class='line' id='LC742'><span class="cm">     */</span></div><div class='line' id='LC743'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">request</span><span class="o">(</span><span class="n">String</span> <span class="n">graphPath</span><span class="o">,</span> <span class="n">Bundle</span> <span class="n">params</span><span class="o">,</span> <span class="n">String</span> <span class="n">httpMethod</span><span class="o">)</span></div><div class='line' id='LC744'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">throws</span> <span class="n">FileNotFoundException</span><span class="o">,</span> <span class="n">MalformedURLException</span><span class="o">,</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC745'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">params</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="s">&quot;format&quot;</span><span class="o">,</span> <span class="s">&quot;json&quot;</span><span class="o">);</span></div><div class='line' id='LC746'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">isSessionValid</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC747'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">params</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="n">TOKEN</span><span class="o">,</span> <span class="n">getAccessToken</span><span class="o">());</span></div><div class='line' id='LC748'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC749'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">url</span> <span class="o">=</span> <span class="o">(</span><span class="n">graphPath</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">?</span> <span class="n">GRAPH_BASE_URL</span> <span class="o">+</span> <span class="n">graphPath</span></div><div class='line' id='LC750'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">RESTSERVER_URL</span><span class="o">;</span></div><div class='line' id='LC751'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">Util</span><span class="o">.</span><span class="na">openUrl</span><span class="o">(</span><span class="n">url</span><span class="o">,</span> <span class="n">httpMethod</span><span class="o">,</span> <span class="n">params</span><span class="o">);</span></div><div class='line' id='LC752'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC753'><br/></div><div class='line' id='LC754'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC755'><span class="cm">     * Generate a UI dialog for the request action in the given Android context.</span></div><div class='line' id='LC756'><span class="cm">     *</span></div><div class='line' id='LC757'><span class="cm">     * Note that this method is asynchronous and the callback will be invoked in</span></div><div class='line' id='LC758'><span class="cm">     * the original calling thread (not in a background thread).</span></div><div class='line' id='LC759'><span class="cm">     *</span></div><div class='line' id='LC760'><span class="cm">     * @param context</span></div><div class='line' id='LC761'><span class="cm">     *            The Android context in which we will generate this dialog.</span></div><div class='line' id='LC762'><span class="cm">     * @param action</span></div><div class='line' id='LC763'><span class="cm">     *            String representation of the desired method: e.g. &quot;login&quot;,</span></div><div class='line' id='LC764'><span class="cm">     *            &quot;stream.publish&quot;, ...</span></div><div class='line' id='LC765'><span class="cm">     * @param listener</span></div><div class='line' id='LC766'><span class="cm">     *            Callback interface to notify the application when the dialog</span></div><div class='line' id='LC767'><span class="cm">     *            has completed.</span></div><div class='line' id='LC768'><span class="cm">     */</span></div><div class='line' id='LC769'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">dialog</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">,</span> <span class="n">String</span> <span class="n">action</span><span class="o">,</span></div><div class='line' id='LC770'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">DialogListener</span> <span class="n">listener</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC771'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">dialog</span><span class="o">(</span><span class="n">context</span><span class="o">,</span> <span class="n">action</span><span class="o">,</span> <span class="k">new</span> <span class="n">Bundle</span><span class="o">(),</span> <span class="n">listener</span><span class="o">);</span></div><div class='line' id='LC772'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC773'><br/></div><div class='line' id='LC774'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC775'><span class="cm">     * Generate a UI dialog for the request action in the given Android context</span></div><div class='line' id='LC776'><span class="cm">     * with the provided parameters.</span></div><div class='line' id='LC777'><span class="cm">     *</span></div><div class='line' id='LC778'><span class="cm">     * Note that this method is asynchronous and the callback will be invoked in</span></div><div class='line' id='LC779'><span class="cm">     * the original calling thread (not in a background thread).</span></div><div class='line' id='LC780'><span class="cm">     *</span></div><div class='line' id='LC781'><span class="cm">     * @param context</span></div><div class='line' id='LC782'><span class="cm">     *            The Android context in which we will generate this dialog.</span></div><div class='line' id='LC783'><span class="cm">     * @param action</span></div><div class='line' id='LC784'><span class="cm">     *            String representation of the desired method: e.g. &quot;feed&quot; ...</span></div><div class='line' id='LC785'><span class="cm">     * @param parameters</span></div><div class='line' id='LC786'><span class="cm">     *            String key-value pairs to be passed as URL parameters.</span></div><div class='line' id='LC787'><span class="cm">     * @param listener</span></div><div class='line' id='LC788'><span class="cm">     *            Callback interface to notify the application when the dialog</span></div><div class='line' id='LC789'><span class="cm">     *            has completed.</span></div><div class='line' id='LC790'><span class="cm">     */</span></div><div class='line' id='LC791'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">dialog</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">,</span> <span class="n">String</span> <span class="n">action</span><span class="o">,</span> <span class="n">Bundle</span> <span class="n">parameters</span><span class="o">,</span></div><div class='line' id='LC792'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="n">DialogListener</span> <span class="n">listener</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC793'><br/></div><div class='line' id='LC794'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">endpoint</span> <span class="o">=</span> <span class="n">DIALOG_BASE_URL</span> <span class="o">+</span> <span class="n">action</span><span class="o">;</span></div><div class='line' id='LC795'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">parameters</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="s">&quot;display&quot;</span><span class="o">,</span> <span class="s">&quot;touch&quot;</span><span class="o">);</span></div><div class='line' id='LC796'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">parameters</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="s">&quot;redirect_uri&quot;</span><span class="o">,</span> <span class="n">REDIRECT_URI</span><span class="o">);</span></div><div class='line' id='LC797'><br/></div><div class='line' id='LC798'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">action</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">LOGIN</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC799'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">parameters</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="s">&quot;type&quot;</span><span class="o">,</span> <span class="s">&quot;user_agent&quot;</span><span class="o">);</span></div><div class='line' id='LC800'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">parameters</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="s">&quot;client_id&quot;</span><span class="o">,</span> <span class="n">mAppId</span><span class="o">);</span></div><div class='line' id='LC801'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC802'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">parameters</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="s">&quot;app_id&quot;</span><span class="o">,</span> <span class="n">mAppId</span><span class="o">);</span></div><div class='line' id='LC803'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC804'><br/></div><div class='line' id='LC805'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">isSessionValid</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC806'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">parameters</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="n">TOKEN</span><span class="o">,</span> <span class="n">getAccessToken</span><span class="o">());</span></div><div class='line' id='LC807'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC808'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">url</span> <span class="o">=</span> <span class="n">endpoint</span> <span class="o">+</span> <span class="s">&quot;?&quot;</span> <span class="o">+</span> <span class="n">Util</span><span class="o">.</span><span class="na">encodeUrl</span><span class="o">(</span><span class="n">parameters</span><span class="o">);</span></div><div class='line' id='LC809'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">context</span><span class="o">.</span><span class="na">checkCallingOrSelfPermission</span><span class="o">(</span><span class="n">Manifest</span><span class="o">.</span><span class="na">permission</span><span class="o">.</span><span class="na">INTERNET</span><span class="o">)</span></div><div class='line' id='LC810'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">!=</span> <span class="n">PackageManager</span><span class="o">.</span><span class="na">PERMISSION_GRANTED</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC811'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">showAlert</span><span class="o">(</span><span class="n">context</span><span class="o">,</span> <span class="s">&quot;Error&quot;</span><span class="o">,</span></div><div class='line' id='LC812'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;Application requires permission to access the Internet&quot;</span><span class="o">);</span></div><div class='line' id='LC813'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC814'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">new</span> <span class="nf">FbDialog</span><span class="o">(</span><span class="n">context</span><span class="o">,</span> <span class="n">url</span><span class="o">,</span> <span class="n">listener</span><span class="o">).</span><span class="na">show</span><span class="o">();</span></div><div class='line' id='LC815'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC816'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC817'><br/></div><div class='line' id='LC818'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC819'><span class="cm">     * @return boolean - whether this object has an non-expired session token</span></div><div class='line' id='LC820'><span class="cm">     */</span></div><div class='line' id='LC821'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isSessionValid</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC822'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">(</span><span class="n">getAccessToken</span><span class="o">()</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span></div><div class='line' id='LC823'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">((</span><span class="n">getAccessExpires</span><span class="o">()</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">||</span></div><div class='line' id='LC824'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">(</span><span class="n">System</span><span class="o">.</span><span class="na">currentTimeMillis</span><span class="o">()</span> <span class="o">&lt;</span> <span class="n">getAccessExpires</span><span class="o">()));</span></div><div class='line' id='LC825'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC826'><br/></div><div class='line' id='LC827'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC828'><span class="cm">     * Retrieve the OAuth 2.0 access token for API access: treat with care.</span></div><div class='line' id='LC829'><span class="cm">     * Returns null if no session exists.</span></div><div class='line' id='LC830'><span class="cm">     *</span></div><div class='line' id='LC831'><span class="cm">     * @return String - access token</span></div><div class='line' id='LC832'><span class="cm">     */</span></div><div class='line' id='LC833'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">getAccessToken</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC834'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">mAccessToken</span><span class="o">;</span></div><div class='line' id='LC835'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC836'><br/></div><div class='line' id='LC837'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC838'><span class="cm">     * Retrieve the current session&#39;s expiration time (in milliseconds since</span></div><div class='line' id='LC839'><span class="cm">     * Unix epoch), or 0 if the session doesn&#39;t expire or doesn&#39;t exist.</span></div><div class='line' id='LC840'><span class="cm">     *</span></div><div class='line' id='LC841'><span class="cm">     * @return long - session expiration time</span></div><div class='line' id='LC842'><span class="cm">     */</span></div><div class='line' id='LC843'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">long</span> <span class="nf">getAccessExpires</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC844'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">mAccessExpires</span><span class="o">;</span></div><div class='line' id='LC845'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC846'><br/></div><div class='line' id='LC847'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC848'><span class="cm">     * Set the OAuth 2.0 access token for API access.</span></div><div class='line' id='LC849'><span class="cm">     *</span></div><div class='line' id='LC850'><span class="cm">     * @param token - access token</span></div><div class='line' id='LC851'><span class="cm">     */</span></div><div class='line' id='LC852'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">setAccessToken</span><span class="o">(</span><span class="n">String</span> <span class="n">token</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC853'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAccessToken</span> <span class="o">=</span> <span class="n">token</span><span class="o">;</span></div><div class='line' id='LC854'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mLastAccessUpdate</span> <span class="o">=</span> <span class="n">System</span><span class="o">.</span><span class="na">currentTimeMillis</span><span class="o">();</span></div><div class='line' id='LC855'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC856'><br/></div><div class='line' id='LC857'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC858'><span class="cm">     * Set the current session&#39;s expiration time (in milliseconds since Unix</span></div><div class='line' id='LC859'><span class="cm">     * epoch), or 0 if the session doesn&#39;t expire.</span></div><div class='line' id='LC860'><span class="cm">     *</span></div><div class='line' id='LC861'><span class="cm">     * @param time - timestamp in milliseconds</span></div><div class='line' id='LC862'><span class="cm">     */</span></div><div class='line' id='LC863'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">setAccessExpires</span><span class="o">(</span><span class="kt">long</span> <span class="n">time</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC864'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAccessExpires</span> <span class="o">=</span> <span class="n">time</span><span class="o">;</span></div><div class='line' id='LC865'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC866'><br/></div><div class='line' id='LC867'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC868'><span class="cm">     * Set the current session&#39;s duration (in seconds since Unix epoch), or &quot;0&quot;</span></div><div class='line' id='LC869'><span class="cm">     * if session doesn&#39;t expire.</span></div><div class='line' id='LC870'><span class="cm">     *</span></div><div class='line' id='LC871'><span class="cm">     * @param expiresIn</span></div><div class='line' id='LC872'><span class="cm">     *            - duration in seconds (or 0 if the session doesn&#39;t expire)</span></div><div class='line' id='LC873'><span class="cm">     */</span></div><div class='line' id='LC874'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">setAccessExpiresIn</span><span class="o">(</span><span class="n">String</span> <span class="n">expiresIn</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC875'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">expiresIn</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC876'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">long</span> <span class="n">expires</span> <span class="o">=</span> <span class="n">expiresIn</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;0&quot;</span><span class="o">)</span></div><div class='line' id='LC877'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">?</span> <span class="mi">0</span></div><div class='line' id='LC878'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">System</span><span class="o">.</span><span class="na">currentTimeMillis</span><span class="o">()</span> <span class="o">+</span> <span class="n">Long</span><span class="o">.</span><span class="na">parseLong</span><span class="o">(</span><span class="n">expiresIn</span><span class="o">)</span> <span class="o">*</span> <span class="mi">1000L</span><span class="o">;</span></div><div class='line' id='LC879'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setAccessExpires</span><span class="o">(</span><span class="n">expires</span><span class="o">);</span></div><div class='line' id='LC880'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC881'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC882'><br/></div><div class='line' id='LC883'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">getAppId</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC884'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">mAppId</span><span class="o">;</span></div><div class='line' id='LC885'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC886'><br/></div><div class='line' id='LC887'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">setAppId</span><span class="o">(</span><span class="n">String</span> <span class="n">appId</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC888'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAppId</span> <span class="o">=</span> <span class="n">appId</span><span class="o">;</span></div><div class='line' id='LC889'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC890'><br/></div><div class='line' id='LC891'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC892'><span class="cm">     * Callback interface for dialog requests.</span></div><div class='line' id='LC893'><span class="cm">     *</span></div><div class='line' id='LC894'><span class="cm">     */</span></div><div class='line' id='LC895'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kd">interface</span> <span class="nc">DialogListener</span> <span class="o">{</span></div><div class='line' id='LC896'><br/></div><div class='line' id='LC897'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC898'><span class="cm">         * Called when a dialog completes.</span></div><div class='line' id='LC899'><span class="cm">         *</span></div><div class='line' id='LC900'><span class="cm">         * Executed by the thread that initiated the dialog.</span></div><div class='line' id='LC901'><span class="cm">         *</span></div><div class='line' id='LC902'><span class="cm">         * @param values</span></div><div class='line' id='LC903'><span class="cm">         *            Key-value string pairs extracted from the response.</span></div><div class='line' id='LC904'><span class="cm">         */</span></div><div class='line' id='LC905'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onComplete</span><span class="o">(</span><span class="n">Bundle</span> <span class="n">values</span><span class="o">);</span></div><div class='line' id='LC906'><br/></div><div class='line' id='LC907'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC908'><span class="cm">         * Called when a Facebook responds to a dialog with an error.</span></div><div class='line' id='LC909'><span class="cm">         *</span></div><div class='line' id='LC910'><span class="cm">         * Executed by the thread that initiated the dialog.</span></div><div class='line' id='LC911'><span class="cm">         *</span></div><div class='line' id='LC912'><span class="cm">         */</span></div><div class='line' id='LC913'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onFacebookError</span><span class="o">(</span><span class="n">FacebookError</span> <span class="n">e</span><span class="o">);</span></div><div class='line' id='LC914'><br/></div><div class='line' id='LC915'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC916'><span class="cm">         * Called when a dialog has an error.</span></div><div class='line' id='LC917'><span class="cm">         *</span></div><div class='line' id='LC918'><span class="cm">         * Executed by the thread that initiated the dialog.</span></div><div class='line' id='LC919'><span class="cm">         *</span></div><div class='line' id='LC920'><span class="cm">         */</span></div><div class='line' id='LC921'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onError</span><span class="o">(</span><span class="n">DialogError</span> <span class="n">e</span><span class="o">);</span></div><div class='line' id='LC922'><br/></div><div class='line' id='LC923'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC924'><span class="cm">         * Called when a dialog is canceled by the user.</span></div><div class='line' id='LC925'><span class="cm">         *</span></div><div class='line' id='LC926'><span class="cm">         * Executed by the thread that initiated the dialog.</span></div><div class='line' id='LC927'><span class="cm">         *</span></div><div class='line' id='LC928'><span class="cm">         */</span></div><div class='line' id='LC929'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onCancel</span><span class="o">();</span></div><div class='line' id='LC930'><br/></div><div class='line' id='LC931'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC932'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC933'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC934'><span class="cm">     * Callback interface for service requests.</span></div><div class='line' id='LC935'><span class="cm">     */</span></div><div class='line' id='LC936'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kd">interface</span> <span class="nc">ServiceListener</span> <span class="o">{</span></div><div class='line' id='LC937'><br/></div><div class='line' id='LC938'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC939'><span class="cm">         * Called when a service request completes.</span></div><div class='line' id='LC940'><span class="cm">         * </span></div><div class='line' id='LC941'><span class="cm">         * @param values</span></div><div class='line' id='LC942'><span class="cm">         *            Key-value string pairs extracted from the response.</span></div><div class='line' id='LC943'><span class="cm">         */</span></div><div class='line' id='LC944'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onComplete</span><span class="o">(</span><span class="n">Bundle</span> <span class="n">values</span><span class="o">);</span></div><div class='line' id='LC945'><br/></div><div class='line' id='LC946'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC947'><span class="cm">         * Called when a Facebook server responds to the request with an error.</span></div><div class='line' id='LC948'><span class="cm">         */</span></div><div class='line' id='LC949'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onFacebookError</span><span class="o">(</span><span class="n">FacebookError</span> <span class="n">e</span><span class="o">);</span></div><div class='line' id='LC950'><br/></div><div class='line' id='LC951'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC952'><span class="cm">         * Called when a Facebook Service responds to the request with an error.</span></div><div class='line' id='LC953'><span class="cm">         */</span></div><div class='line' id='LC954'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onError</span><span class="o">(</span><span class="n">Error</span> <span class="n">e</span><span class="o">);</span></div><div class='line' id='LC955'><br/></div><div class='line' id='LC956'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC957'><br/></div><div class='line' id='LC958'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">FB_APP_SIGNATURE</span> <span class="o">=</span></div><div class='line' id='LC959'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310&quot;</span></div><div class='line' id='LC960'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;b3009060355040613025553310b30090603550408130243413112301006035504&quot;</span></div><div class='line' id='LC961'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;07130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204&quot;</span></div><div class='line' id='LC962'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;d6f62696c653111300f060355040b130846616365626f6f6b311d301b06035504&quot;</span></div><div class='line' id='LC963'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;03131446616365626f6f6b20436f72706f726174696f6e3020170d30393038333&quot;</span></div><div class='line' id='LC964'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;13231353231365a180f32303530303932353231353231365a307a310b30090603&quot;</span></div><div class='line' id='LC965'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;55040613025553310b30090603550408130243413112301006035504071309506&quot;</span></div><div class='line' id='LC966'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;16c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c&quot;</span></div><div class='line' id='LC967'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;653111300f060355040b130846616365626f6f6b311d301b06035504031314466&quot;</span></div><div class='line' id='LC968'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;16365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d01&quot;</span></div><div class='line' id='LC969'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;0101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fa&quot;</span></div><div class='line' id='LC970'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;b00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7&quot;</span></div><div class='line' id='LC971'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581cc&quot;</span></div><div class='line' id='LC972'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;fef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603&quot;</span></div><div class='line' id='LC973'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d010104050&quot;</span></div><div class='line' id='LC974'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;0038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c&quot;</span></div><div class='line' id='LC975'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a6&quot;</span></div><div class='line' id='LC976'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;73149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2&quot;</span></div><div class='line' id='LC977'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd&quot;</span></div><div class='line' id='LC978'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;928a2&quot;</span><span class="o">;</span></div><div class='line' id='LC979'><br/></div><div class='line' id='LC980'><span class="o">}</span></div></pre></div>
          </td>
        </tr>
      </table>
  </div>

          </div>
        </div>
      </div>
    </div>

  </div>

<div class="frame frame-loading large-loading-area" style="display:none;" data-tree-list-url="/facebook/facebook-android-sdk/tree-list/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f" data-blob-url-prefix="/facebook/facebook-android-sdk/blob/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f">
  <img src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-64.gif?1329920549" height="64" width="64">
</div>

      </div>
      <div class="context-overlay"></div>
    </div>

      <div id="footer-push"></div><!-- hack for sticky footer -->
    </div><!-- end of wrapper - hack for sticky footer -->

      <!-- footer -->
      <div id="footer" >
        
  <div class="upper_footer">
     <div class="container clearfix">

       <!--[if IE]><h4 id="blacktocat_ie">GitHub Links</h4><![endif]-->
       <![if !IE]><h4 id="blacktocat">GitHub Links</h4><![endif]>

       <ul class="footer_nav">
         <h4>GitHub</h4>
         <li><a href="https://github.com/about">About</a></li>
         <li><a href="https://github.com/blog">Blog</a></li>
         <li><a href="https://github.com/features">Features</a></li>
         <li><a href="https://github.com/contact">Contact &amp; Support</a></li>
         <li><a href="https://github.com/training">Training</a></li>
         <li><a href="http://enterprise.github.com/">GitHub Enterprise</a></li>
         <li><a href="http://status.github.com/">Site Status</a></li>
       </ul>

       <ul class="footer_nav">
         <h4>Tools</h4>
         <li><a href="http://get.gaug.es/">Gauges: Analyze web traffic</a></li>
         <li><a href="http://speakerdeck.com">Speaker Deck: Presentations</a></li>
         <li><a href="https://gist.github.com">Gist: Code snippets</a></li>
         <li><a href="http://mac.github.com/">GitHub for Mac</a></li>
         <li><a href="http://mobile.github.com/">Issues for iPhone</a></li>
         <li><a href="http://jobs.github.com/">Job Board</a></li>
       </ul>

       <ul class="footer_nav">
         <h4>Extras</h4>
         <li><a href="http://shop.github.com/">GitHub Shop</a></li>
         <li><a href="http://octodex.github.com/">The Octodex</a></li>
       </ul>

       <ul class="footer_nav">
         <h4>Documentation</h4>
         <li><a href="http://help.github.com/">GitHub Help</a></li>
         <li><a href="http://developer.github.com/">Developer API</a></li>
         <li><a href="http://github.github.com/github-flavored-markdown/">GitHub Flavored Markdown</a></li>
         <li><a href="http://pages.github.com/">GitHub Pages</a></li>
       </ul>

     </div><!-- /.site -->
  </div><!-- /.upper_footer -->

<div class="lower_footer">
  <div class="container clearfix">
    <!--[if IE]><div id="legal_ie"><![endif]-->
    <![if !IE]><div id="legal"><![endif]>
      <ul>
          <li><a href="https://github.com/site/terms">Terms of Service</a></li>
          <li><a href="https://github.com/site/privacy">Privacy</a></li>
          <li><a href="https://github.com/security">Security</a></li>
      </ul>

      <p>&copy; 2012 <span title="0.07929s from fe15.rs.github.com">GitHub</span> Inc. All rights reserved.</p>
    </div><!-- /#legal or /#legal_ie-->

      <div class="sponsor">
        <a href="http://www.rackspace.com" class="logo">
          <img alt="Dedicated Server" height="36" src="https://a248.e.akamai.net/assets.github.com/images/modules/footer/rackspaces_logo.png?1329920549" width="38" />
        </a>
        Powered by the <a href="http://www.rackspace.com ">Dedicated
        Servers</a> and<br/> <a href="http://www.rackspacecloud.com">Cloud
        Computing</a> of Rackspace Hosting<span>&reg;</span>
      </div>
  </div><!-- /.site -->
</div><!-- /.lower_footer -->

      </div><!-- /#footer -->

    

<div id="keyboard_shortcuts_pane" class="instapaper_ignore readability-extra" style="display:none">
  <h2>Keyboard Shortcuts <small><a href="#" class="js-see-all-keyboard-shortcuts">(see all)</a></small></h2>

  <div class="columns threecols">
    <div class="column first">
      <h3>Site wide shortcuts</h3>
      <dl class="keyboard-mappings">
        <dt>s</dt>
        <dd>Focus site search</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>?</dt>
        <dd>Bring up this help dialog</dd>
      </dl>
    </div><!-- /.column.first -->

    <div class="column middle" style='display:none'>
      <h3>Commit list</h3>
      <dl class="keyboard-mappings">
        <dt>j</dt>
        <dd>Move selection down</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>k</dt>
        <dd>Move selection up</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>c <em>or</em> o <em>or</em> enter</dt>
        <dd>Open commit</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>y</dt>
        <dd>Expand URL to its canonical form</dd>
      </dl>
    </div><!-- /.column.first -->

    <div class="column last" style='display:none'>
      <h3>Pull request list</h3>
      <dl class="keyboard-mappings">
        <dt>j</dt>
        <dd>Move selection down</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>k</dt>
        <dd>Move selection up</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>o <em>or</em> enter</dt>
        <dd>Open issue</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> enter</dt>
        <dd>Submit comment</dd>
      </dl>
    </div><!-- /.columns.last -->

  </div><!-- /.columns.equacols -->

  <div style='display:none'>
    <div class="rule"></div>

    <h3>Issues</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selection down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selection up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>x</dt>
          <dd>Toggle selection</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open issue</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> enter</dt>
          <dd>Submit comment</dd>
        </dl>
      </div><!-- /.column.first -->
      <div class="column last">
        <dl class="keyboard-mappings">
          <dt>c</dt>
          <dd>Create issue</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>l</dt>
          <dd>Create label</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>i</dt>
          <dd>Back to inbox</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>u</dt>
          <dd>Back to issues</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>/</dt>
          <dd>Focus issues search</dd>
        </dl>
      </div>
    </div>
  </div>

  <div style='display:none'>
    <div class="rule"></div>

    <h3>Issues Dashboard</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selection down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selection up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open issue</dd>
        </dl>
      </div><!-- /.column.first -->
    </div>
  </div>

  <div style='display:none'>
    <div class="rule"></div>

    <h3>Network Graph</h3>
    <div class="columns equacols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt><span class="badmono">←</span> <em>or</em> h</dt>
          <dd>Scroll left</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">→</span> <em>or</em> l</dt>
          <dd>Scroll right</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">↑</span> <em>or</em> k</dt>
          <dd>Scroll up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">↓</span> <em>or</em> j</dt>
          <dd>Scroll down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>t</dt>
          <dd>Toggle visibility of head labels</dd>
        </dl>
      </div><!-- /.column.first -->
      <div class="column last">
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">←</span> <em>or</em> shift h</dt>
          <dd>Scroll all the way left</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">→</span> <em>or</em> shift l</dt>
          <dd>Scroll all the way right</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">↑</span> <em>or</em> shift k</dt>
          <dd>Scroll all the way up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">↓</span> <em>or</em> shift j</dt>
          <dd>Scroll all the way down</dd>
        </dl>
      </div><!-- /.column.last -->
    </div>
  </div>

  <div >
    <div class="rule"></div>
    <div class="columns threecols">
      <div class="column first" >
        <h3>Source Code Browsing</h3>
        <dl class="keyboard-mappings">
          <dt>t</dt>
          <dd>Activates the file finder</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>l</dt>
          <dd>Jump to line</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>w</dt>
          <dd>Switch branch/tag</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>y</dt>
          <dd>Expand URL to its canonical form</dd>
        </dl>
      </div>
    </div>
  </div>

  <div style='display:none'>
    <div class="rule"></div>
    <div class="columns threecols">
      <div class="column first">
        <h3>Browsing Commits</h3>
        <dl class="keyboard-mappings">
          <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> enter</dt>
          <dd>Submit comment</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>escape</dt>
          <dd>Close form</dd>
        </dl>
      </div>
    </div>
  </div>
</div>

    <div id="markdown-help" class="instapaper_ignore readability-extra">
  <h2>Markdown Cheat Sheet</h2>

  <div class="cheatsheet-content">

  <div class="mod">
    <div class="col">
      <h3>Format Text</h3>
      <p>Headers</p>
      <pre>
# This is an &lt;h1&gt; tag
## This is an &lt;h2&gt; tag
###### This is an &lt;h6&gt; tag</pre>
     <p>Text styles</p>
     <pre>
*This text will be italic*
_This will also be italic_
**This text will be bold**
__This will also be bold__

*You **can** combine them*
</pre>
    </div>
    <div class="col">
      <h3>Lists</h3>
      <p>Unordered</p>
      <pre>
* Item 1
* Item 2
  * Item 2a
  * Item 2b</pre>
     <p>Ordered</p>
     <pre>
1. Item 1
2. Item 2
3. Item 3
   * Item 3a
   * Item 3b</pre>
    </div>
    <div class="col">
      <h3>Miscellaneous</h3>
      <p>Images</p>
      <pre>
![GitHub Logo](/images/logo.png)
Format: ![Alt Text](url)
</pre>
     <p>Links</p>
     <pre>
http://github.com - automatic!
[GitHub](http://github.com)</pre>
<p>Blockquotes</p>
     <pre>
As Kanye West said:

> We're living the future so
> the present is our past.
</pre>
    </div>
  </div>
  <div class="rule"></div>

  <h3>Code Examples in Markdown</h3>
  <div class="col">
      <p>Syntax highlighting with <a href="http://github.github.com/github-flavored-markdown/" title="GitHub Flavored Markdown" target="_blank">GFM</a></p>
      <pre>
```javascript
function fancyAlert(arg) {
  if(arg) {
    $.facebox({div:'#foo'})
  }
}
```</pre>
    </div>
    <div class="col">
      <p>Or, indent your code 4 spaces</p>
      <pre>
Here is a Python code example
without syntax highlighting:

    def foo:
      if not bar:
        return true</pre>
    </div>
    <div class="col">
      <p>Inline code for comments</p>
      <pre>
I think you should use an
`&lt;addr&gt;` element here instead.</pre>
    </div>
  </div>

  </div>
</div>


    <div class="ajax-error-message">
      <p><span class="icon"></span> Something went wrong with that request. Please try again. <a href="javascript:;" class="ajax-error-dismiss">Dismiss</a></p>
    </div>

    <div id="logo-popup">
      <h2>Looking for the GitHub logo?</h2>
      <ul>
        <li>
          <h4>GitHub Logo</h4>
          <a href="http://github-media-downloads.s3.amazonaws.com/GitHub_Logos.zip"><img alt="Github_logo" src="https://a248.e.akamai.net/assets.github.com/images/modules/about_page/github_logo.png?1329920549" /></a>
          <a href="http://github-media-downloads.s3.amazonaws.com/GitHub_Logos.zip" class="minibutton btn-download download"><span><span class="icon"></span>Download</span></a>
        </li>
        <li>
          <h4>The Octocat</h4>
          <a href="http://github-media-downloads.s3.amazonaws.com/Octocats.zip"><img alt="Octocat" src="https://a248.e.akamai.net/assets.github.com/images/modules/about_page/octocat.png?1329920549" /></a>
          <a href="http://github-media-downloads.s3.amazonaws.com/Octocats.zip" class="minibutton btn-download download"><span><span class="icon"></span>Download</span></a>
        </li>
      </ul>
    </div>

    
    
    
    <span id='server_response_time' data-time='0.08229' data-host='fe15'></span>
  </body>
</html>

