


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>facebook-android-sdk/facebook/src/com/facebook/android/Util.java at master · facebook/facebook-android-sdk</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />

    
    

    <meta content="authenticity_token" name="csrf-param" />
<meta content="5TMsOvzW8KsScYHrf/+v4WCk31ia+RpCj1aDyvaqtqQ=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/stylesheets/bundles/github-9e6f49288d62ba4c519541a22d681e2f823f02b4.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="https://a248.e.akamai.net/assets.github.com/stylesheets/bundles/github2-1a2061c33e6632ce3bbf40295fe45208a5459e3c.css" media="screen" rel="stylesheet" type="text/css" />
    

    <script src="https://a248.e.akamai.net/assets.github.com/javascripts/bundles/jquery-2d0d4e0119675485f7a3d0dd7f49420b63c552ae.js" type="text/javascript"></script>
    <script src="https://a248.e.akamai.net/assets.github.com/javascripts/bundles/github-cfac289827b3ed9a195af1fc6531b5a5c5ca2cbe.js" type="text/javascript"></script>
    
    

      <link rel='permalink' href='/facebook/facebook-android-sdk/blob/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f/facebook/src/com/facebook/android/Util.java'>
    <meta property="og:title" content="facebook-android-sdk"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/facebook/facebook-android-sdk"/>
    <meta property="og:image" content="https://a248.e.akamai.net/assets.github.com/images/gravatars/gravatar-140.png?1334862345"/>
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
            <img alt="GitHub" class="github-logo" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov7.png?1334862346" />
            <img alt="GitHub" class="github-logo-hover" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov7-hover.png?1334862346" />
            <![endif]-->
            <img alt="GitHub" class="github-logo-4x" height="30" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov7@4x.png?1334862346" />
            <img alt="GitHub" class="github-logo-4x-hover" height="30" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov7@4x-hover.png?1334862346" />
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
                    <a href="/facebook/facebook-android-sdk/blob/master/facebook/src/com/facebook/android/Util.java" data-name="master" rel="nofollow">master</a>
                </h4>
              </div>

              <div class="commitish-item tag-commitish selector-item">
                <h4>
                    <a href="/facebook/facebook-android-sdk/blob/v1.2.1/facebook/src/com/facebook/android/Util.java" data-name="v1.2.1" rel="nofollow">v1.2.1</a>
                </h4>
              </div>
              <div class="commitish-item tag-commitish selector-item">
                <h4>
                    <a href="/facebook/facebook-android-sdk/blob/v1.2/facebook/src/com/facebook/android/Util.java" data-name="v1.2" rel="nofollow">v1.2</a>
                </h4>
              </div>
              <div class="commitish-item tag-commitish selector-item">
                <h4>
                    <a href="/facebook/facebook-android-sdk/blob/v1.1/facebook/src/com/facebook/android/Util.java" data-name="v1.1" rel="nofollow">v1.1</a>
                </h4>
              </div>
              <div class="commitish-item tag-commitish selector-item">
                <h4>
                    <a href="/facebook/facebook-android-sdk/blob/v1.0/facebook/src/com/facebook/android/Util.java" data-name="v1.0" rel="nofollow">v1.0</a>
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

        





<!-- block_view_fragment_key: views7/v8/blob:v21:db5a4cd6ca7f7c80dbff61ecb5cd3371 -->
  <div id="slider">

    <div class="breadcrumb" data-path="facebook/src/com/facebook/android/Util.java/">
      <b itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f" class="js-rewrite-sha" itemprop="url"><span itemprop="title">facebook-android-sdk</span></a></b> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f/facebook" class="js-rewrite-sha" itemscope="url"><span itemprop="title">facebook</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f/facebook/src" class="js-rewrite-sha" itemscope="url"><span itemprop="title">src</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f/facebook/src/com" class="js-rewrite-sha" itemscope="url"><span itemprop="title">com</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f/facebook/src/com/facebook" class="js-rewrite-sha" itemscope="url"><span itemprop="title">facebook</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/facebook/facebook-android-sdk/tree/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f/facebook/src/com/facebook/android" class="js-rewrite-sha" itemscope="url"><span itemprop="title">android</span></a></span> / <strong class="final-path">Util.java</strong> <span class="js-clippy mini-icon clippy " data-clipboard-text="facebook/src/com/facebook/android/Util.java" data-copied-hint="copied!" data-copy-hint="copy to clipboard"></span>
    </div>


      <div class="commit file-history-tease" data-path="facebook/src/com/facebook/android/Util.java/">
        <img class="main-avatar" height="24" src="https://secure.gravatar.com/avatar/583a71cdfcfa0559b4d7f73d851295fc?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="24" />
        <span class="author"><a href="/rightparen">rightparen</a></span>
        <time class="js-relative-date" datetime="2012-04-17T13:12:13-07:00" title="2012-04-17 13:12:13">April 17, 2012</time>
        <div class="commit-title">
            <a href="/facebook/facebook-android-sdk/commit/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f" class="message">Merge small pull requests</a>
        </div>

        <div class="participation">
          <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>2</strong> contributors</a></p>
              <a class="avatar tooltipped downwards" title="rightparen" href="/facebook/facebook-android-sdk/commits/master/facebook/src/com/facebook/android/Util.java?author=rightparen"><img height="20" src="https://secure.gravatar.com/avatar/583a71cdfcfa0559b4d7f73d851295fc?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="20" /></a>
    <a class="avatar tooltipped downwards" title="vijaye" href="/facebook/facebook-android-sdk/commits/master/facebook/src/com/facebook/android/Util.java?author=vijaye"><img height="20" src="https://secure.gravatar.com/avatar/bbda65a07582c57e0b7776fa99db44f9?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="20" /></a>


        </div>
        <div id="blob_contributors_box" style="display:none">
          <h2>Users on GitHub who have contributed to this file</h2>
          <ul class="facebox-user-list">
            <li>
              <img height="24" src="https://secure.gravatar.com/avatar/583a71cdfcfa0559b4d7f73d851295fc?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="24" />
              <a href="/rightparen">rightparen</a>
            </li>
            <li>
              <img height="24" src="https://secure.gravatar.com/avatar/bbda65a07582c57e0b7776fa99db44f9?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="24" />
              <a href="/vijaye">vijaye</a>
            </li>
          </ul>
        </div>
      </div>

    <div class="frames">
      <div class="frame frame-center" data-path="facebook/src/com/facebook/android/Util.java/" data-permalink-url="/facebook/facebook-android-sdk/blob/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f/facebook/src/com/facebook/android/Util.java" data-title="facebook-android-sdk/facebook/src/com/facebook/android/Util.java at master · facebook/facebook-android-sdk · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="mini-icon text-file"></b></span>
                <span class="mode" title="File Mode">100644</span>
                  <span>330 lines (296 sloc)</span>
                <span>11.874 kb</span>
              </div>
              <ul class="button-group actions">
                  <li>
                    <a class="grouped-button file-edit-link minibutton bigger lighter js-rewrite-sha" href="/facebook/facebook-android-sdk/edit/1e03bf9ea42eb663bf61eddac9d7b6bee3b6e69f/facebook/src/com/facebook/android/Util.java" data-method="post" rel="nofollow"><span>Edit this file</span></a>
                  </li>

                <li>
                  <a href="/facebook/facebook-android-sdk/raw/master/facebook/src/com/facebook/android/Util.java" class="minibutton btn-raw grouped-button bigger lighter" id="raw-url"><span><span class="icon"></span>Raw</span></a>
                </li>
                  <li>
                    <a href="/facebook/facebook-android-sdk/blame/master/facebook/src/com/facebook/android/Util.java" class="minibutton btn-blame grouped-button bigger lighter"><span><span class="icon"></span>Blame</span></a>
                  </li>
                <li>
                  <a href="/facebook/facebook-android-sdk/commits/master/facebook/src/com/facebook/android/Util.java" class="minibutton btn-history grouped-button bigger lighter" rel="nofollow"><span><span class="icon"></span>History</span></a>
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
</pre>
          </td>
          <td width="100%">
                <div class="highlight"><pre><div class='line' id='LC1'><span class="cm">/*</span></div><div class='line' id='LC2'><span class="cm"> * Copyright 2010 Facebook, Inc.</span></div><div class='line' id='LC3'><span class="cm"> *</span></div><div class='line' id='LC4'><span class="cm"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);</span></div><div class='line' id='LC5'><span class="cm"> * you may not use this file except in compliance with the License.</span></div><div class='line' id='LC6'><span class="cm"> * You may obtain a copy of the License at</span></div><div class='line' id='LC7'><span class="cm"> *</span></div><div class='line' id='LC8'><span class="cm"> *    http://www.apache.org/licenses/LICENSE-2.0</span></div><div class='line' id='LC9'><span class="cm"> *</span></div><div class='line' id='LC10'><span class="cm"> * Unless required by applicable law or agreed to in writing, software</span></div><div class='line' id='LC11'><span class="cm"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,</span></div><div class='line' id='LC12'><span class="cm"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></div><div class='line' id='LC13'><span class="cm"> * See the License for the specific language governing permissions and</span></div><div class='line' id='LC14'><span class="cm"> * limitations under the License.</span></div><div class='line' id='LC15'><span class="cm"> */</span></div><div class='line' id='LC16'><br/></div><div class='line' id='LC17'><span class="kn">package</span> <span class="n">com</span><span class="o">.</span><span class="na">facebook</span><span class="o">.</span><span class="na">android</span><span class="o">;</span></div><div class='line' id='LC18'><br/></div><div class='line' id='LC19'><span class="kn">import</span> <span class="nn">java.io.BufferedOutputStream</span><span class="o">;</span></div><div class='line' id='LC20'><span class="kn">import</span> <span class="nn">java.io.BufferedReader</span><span class="o">;</span></div><div class='line' id='LC21'><span class="kn">import</span> <span class="nn">java.io.FileNotFoundException</span><span class="o">;</span></div><div class='line' id='LC22'><span class="kn">import</span> <span class="nn">java.io.IOException</span><span class="o">;</span></div><div class='line' id='LC23'><span class="kn">import</span> <span class="nn">java.io.InputStream</span><span class="o">;</span></div><div class='line' id='LC24'><span class="kn">import</span> <span class="nn">java.io.InputStreamReader</span><span class="o">;</span></div><div class='line' id='LC25'><span class="kn">import</span> <span class="nn">java.io.OutputStream</span><span class="o">;</span></div><div class='line' id='LC26'><span class="kn">import</span> <span class="nn">java.net.HttpURLConnection</span><span class="o">;</span></div><div class='line' id='LC27'><span class="kn">import</span> <span class="nn">java.net.MalformedURLException</span><span class="o">;</span></div><div class='line' id='LC28'><span class="kn">import</span> <span class="nn">java.net.URL</span><span class="o">;</span></div><div class='line' id='LC29'><span class="kn">import</span> <span class="nn">java.net.URLDecoder</span><span class="o">;</span></div><div class='line' id='LC30'><span class="kn">import</span> <span class="nn">java.net.URLEncoder</span><span class="o">;</span></div><div class='line' id='LC31'><br/></div><div class='line' id='LC32'><span class="kn">import</span> <span class="nn">org.json.JSONException</span><span class="o">;</span></div><div class='line' id='LC33'><span class="kn">import</span> <span class="nn">org.json.JSONObject</span><span class="o">;</span></div><div class='line' id='LC34'><br/></div><div class='line' id='LC35'><span class="kn">import</span> <span class="nn">android.app.AlertDialog.Builder</span><span class="o">;</span></div><div class='line' id='LC36'><span class="kn">import</span> <span class="nn">android.content.Context</span><span class="o">;</span></div><div class='line' id='LC37'><span class="kn">import</span> <span class="nn">android.os.Bundle</span><span class="o">;</span></div><div class='line' id='LC38'><span class="kn">import</span> <span class="nn">android.util.Log</span><span class="o">;</span></div><div class='line' id='LC39'><span class="kn">import</span> <span class="nn">android.webkit.CookieManager</span><span class="o">;</span></div><div class='line' id='LC40'><span class="kn">import</span> <span class="nn">android.webkit.CookieSyncManager</span><span class="o">;</span></div><div class='line' id='LC41'><br/></div><div class='line' id='LC42'><span class="cm">/**</span></div><div class='line' id='LC43'><span class="cm"> * Utility class supporting the Facebook Object.</span></div><div class='line' id='LC44'><span class="cm"> *</span></div><div class='line' id='LC45'><span class="cm"> * @author ssoneff@facebook.com</span></div><div class='line' id='LC46'><span class="cm"> *</span></div><div class='line' id='LC47'><span class="cm"> */</span></div><div class='line' id='LC48'><span class="kd">public</span> <span class="kd">final</span> <span class="kd">class</span> <span class="nc">Util</span> <span class="o">{</span></div><div class='line' id='LC49'><br/></div><div class='line' id='LC50'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC51'><span class="cm">     * Set this to true to enable log output.  Remember to turn this back off</span></div><div class='line' id='LC52'><span class="cm">     * before releasing.  Sending sensitive data to log is a security risk.</span></div><div class='line' id='LC53'><span class="cm">     */</span></div><div class='line' id='LC54'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">static</span> <span class="kt">boolean</span> <span class="n">ENABLE_LOG</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC55'><br/></div><div class='line' id='LC56'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC57'><span class="cm">     * Generate the multi-part post body providing the parameters and boundary</span></div><div class='line' id='LC58'><span class="cm">     * string</span></div><div class='line' id='LC59'><span class="cm">     * </span></div><div class='line' id='LC60'><span class="cm">     * @param parameters the parameters need to be posted</span></div><div class='line' id='LC61'><span class="cm">     * @param boundary the random string as boundary</span></div><div class='line' id='LC62'><span class="cm">     * @return a string of the post body</span></div><div class='line' id='LC63'><span class="cm">     */</span></div><div class='line' id='LC64'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span> <span class="nf">encodePostBody</span><span class="o">(</span><span class="n">Bundle</span> <span class="n">parameters</span><span class="o">,</span> <span class="n">String</span> <span class="n">boundary</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC65'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">parameters</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="k">return</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC66'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">StringBuilder</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="n">StringBuilder</span><span class="o">();</span></div><div class='line' id='LC67'><br/></div><div class='line' id='LC68'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="n">String</span> <span class="n">key</span> <span class="o">:</span> <span class="n">parameters</span><span class="o">.</span><span class="na">keySet</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC69'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">parameter</span> <span class="o">=</span> <span class="n">parameters</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC70'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!(</span><span class="n">parameter</span> <span class="k">instanceof</span> <span class="n">String</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC71'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">continue</span><span class="o">;</span></div><div class='line' id='LC72'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC73'><br/></div><div class='line' id='LC74'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="s">&quot;Content-Disposition: form-data; name=\&quot;&quot;</span> <span class="o">+</span> <span class="n">key</span> <span class="o">+</span></div><div class='line' id='LC75'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;\&quot;\r\n\r\n&quot;</span> <span class="o">+</span> <span class="o">(</span><span class="n">String</span><span class="o">)</span><span class="n">parameter</span><span class="o">);</span></div><div class='line' id='LC76'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="s">&quot;\r\n&quot;</span> <span class="o">+</span> <span class="s">&quot;--&quot;</span> <span class="o">+</span> <span class="n">boundary</span> <span class="o">+</span> <span class="s">&quot;\r\n&quot;</span><span class="o">);</span></div><div class='line' id='LC77'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC78'><br/></div><div class='line' id='LC79'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC80'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC81'><br/></div><div class='line' id='LC82'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span> <span class="nf">encodeUrl</span><span class="o">(</span><span class="n">Bundle</span> <span class="n">parameters</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC83'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">parameters</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC84'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC85'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC86'><br/></div><div class='line' id='LC87'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">StringBuilder</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="n">StringBuilder</span><span class="o">();</span></div><div class='line' id='LC88'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">first</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC89'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="n">String</span> <span class="n">key</span> <span class="o">:</span> <span class="n">parameters</span><span class="o">.</span><span class="na">keySet</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC90'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">parameter</span> <span class="o">=</span> <span class="n">parameters</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC91'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!(</span><span class="n">parameter</span> <span class="k">instanceof</span> <span class="n">String</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC92'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">continue</span><span class="o">;</span></div><div class='line' id='LC93'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC94'><br/></div><div class='line' id='LC95'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">first</span><span class="o">)</span> <span class="n">first</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span> <span class="k">else</span> <span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="s">&quot;&amp;&quot;</span><span class="o">);</span></div><div class='line' id='LC96'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">URLEncoder</span><span class="o">.</span><span class="na">encode</span><span class="o">(</span><span class="n">key</span><span class="o">)</span> <span class="o">+</span> <span class="s">&quot;=&quot;</span> <span class="o">+</span></div><div class='line' id='LC97'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">URLEncoder</span><span class="o">.</span><span class="na">encode</span><span class="o">(</span><span class="n">parameters</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="n">key</span><span class="o">)));</span></div><div class='line' id='LC98'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC99'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC100'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC101'><br/></div><div class='line' id='LC102'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">Bundle</span> <span class="nf">decodeUrl</span><span class="o">(</span><span class="n">String</span> <span class="n">s</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC103'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Bundle</span> <span class="n">params</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Bundle</span><span class="o">();</span></div><div class='line' id='LC104'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">s</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC105'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">array</span><span class="o">[]</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">split</span><span class="o">(</span><span class="s">&quot;&amp;&quot;</span><span class="o">);</span></div><div class='line' id='LC106'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="n">String</span> <span class="n">parameter</span> <span class="o">:</span> <span class="n">array</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC107'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">v</span><span class="o">[]</span> <span class="o">=</span> <span class="n">parameter</span><span class="o">.</span><span class="na">split</span><span class="o">(</span><span class="s">&quot;=&quot;</span><span class="o">);</span></div><div class='line' id='LC108'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">v</span><span class="o">.</span><span class="na">length</span> <span class="o">==</span> <span class="mi">2</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC109'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">params</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="n">URLDecoder</span><span class="o">.</span><span class="na">decode</span><span class="o">(</span><span class="n">v</span><span class="o">[</span><span class="mi">0</span><span class="o">]),</span></div><div class='line' id='LC110'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">URLDecoder</span><span class="o">.</span><span class="na">decode</span><span class="o">(</span><span class="n">v</span><span class="o">[</span><span class="mi">1</span><span class="o">]));</span></div><div class='line' id='LC111'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC112'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC113'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC114'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">params</span><span class="o">;</span></div><div class='line' id='LC115'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC116'><br/></div><div class='line' id='LC117'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC118'><span class="cm">     * Parse a URL query and fragment parameters into a key-value bundle.</span></div><div class='line' id='LC119'><span class="cm">     *</span></div><div class='line' id='LC120'><span class="cm">     * @param url the URL to parse</span></div><div class='line' id='LC121'><span class="cm">     * @return a dictionary bundle of keys and values</span></div><div class='line' id='LC122'><span class="cm">     */</span></div><div class='line' id='LC123'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">Bundle</span> <span class="nf">parseUrl</span><span class="o">(</span><span class="n">String</span> <span class="n">url</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC124'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// hack to prevent MalformedURLException</span></div><div class='line' id='LC125'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">url</span> <span class="o">=</span> <span class="n">url</span><span class="o">.</span><span class="na">replace</span><span class="o">(</span><span class="s">&quot;fbconnect&quot;</span><span class="o">,</span> <span class="s">&quot;http&quot;</span><span class="o">);</span></div><div class='line' id='LC126'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC127'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">URL</span> <span class="n">u</span> <span class="o">=</span> <span class="k">new</span> <span class="n">URL</span><span class="o">(</span><span class="n">url</span><span class="o">);</span></div><div class='line' id='LC128'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Bundle</span> <span class="n">b</span> <span class="o">=</span> <span class="n">decodeUrl</span><span class="o">(</span><span class="n">u</span><span class="o">.</span><span class="na">getQuery</span><span class="o">());</span></div><div class='line' id='LC129'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">b</span><span class="o">.</span><span class="na">putAll</span><span class="o">(</span><span class="n">decodeUrl</span><span class="o">(</span><span class="n">u</span><span class="o">.</span><span class="na">getRef</span><span class="o">()));</span></div><div class='line' id='LC130'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">b</span><span class="o">;</span></div><div class='line' id='LC131'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">MalformedURLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC132'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">new</span> <span class="nf">Bundle</span><span class="o">();</span></div><div class='line' id='LC133'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC134'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC135'><br/></div><div class='line' id='LC136'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC137'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC138'><span class="cm">     * Connect to an HTTP URL and return the response as a string.</span></div><div class='line' id='LC139'><span class="cm">     *</span></div><div class='line' id='LC140'><span class="cm">     * Note that the HTTP method override is used on non-GET requests. (i.e.</span></div><div class='line' id='LC141'><span class="cm">     * requests are made as &quot;POST&quot; with method specified in the body).</span></div><div class='line' id='LC142'><span class="cm">     *</span></div><div class='line' id='LC143'><span class="cm">     * @param url - the resource to open: must be a welformed URL</span></div><div class='line' id='LC144'><span class="cm">     * @param method - the HTTP method to use (&quot;GET&quot;, &quot;POST&quot;, etc.)</span></div><div class='line' id='LC145'><span class="cm">     * @param params - the query parameter for the URL (e.g. access_token=foo)</span></div><div class='line' id='LC146'><span class="cm">     * @return the URL contents as a String</span></div><div class='line' id='LC147'><span class="cm">     * @throws MalformedURLException - if the URL format is invalid</span></div><div class='line' id='LC148'><span class="cm">     * @throws IOException - if a network problem occurs</span></div><div class='line' id='LC149'><span class="cm">     */</span></div><div class='line' id='LC150'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span> <span class="nf">openUrl</span><span class="o">(</span><span class="n">String</span> <span class="n">url</span><span class="o">,</span> <span class="n">String</span> <span class="n">method</span><span class="o">,</span> <span class="n">Bundle</span> <span class="n">params</span><span class="o">)</span></div><div class='line' id='LC151'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">throws</span> <span class="n">MalformedURLException</span><span class="o">,</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC152'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// random string as boundary for multi-part http post</span></div><div class='line' id='LC153'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">strBoundary</span> <span class="o">=</span> <span class="s">&quot;3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f&quot;</span><span class="o">;</span></div><div class='line' id='LC154'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">endLine</span> <span class="o">=</span> <span class="s">&quot;\r\n&quot;</span><span class="o">;</span></div><div class='line' id='LC155'><br/></div><div class='line' id='LC156'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">OutputStream</span> <span class="n">os</span><span class="o">;</span></div><div class='line' id='LC157'><br/></div><div class='line' id='LC158'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">method</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;GET&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC159'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">url</span> <span class="o">=</span> <span class="n">url</span> <span class="o">+</span> <span class="s">&quot;?&quot;</span> <span class="o">+</span> <span class="n">encodeUrl</span><span class="o">(</span><span class="n">params</span><span class="o">);</span></div><div class='line' id='LC160'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC161'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Util</span><span class="o">.</span><span class="na">logd</span><span class="o">(</span><span class="s">&quot;Facebook-Util&quot;</span><span class="o">,</span> <span class="n">method</span> <span class="o">+</span> <span class="s">&quot; URL: &quot;</span> <span class="o">+</span> <span class="n">url</span><span class="o">);</span></div><div class='line' id='LC162'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">HttpURLConnection</span> <span class="n">conn</span> <span class="o">=</span></div><div class='line' id='LC163'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">(</span><span class="n">HttpURLConnection</span><span class="o">)</span> <span class="k">new</span> <span class="n">URL</span><span class="o">(</span><span class="n">url</span><span class="o">).</span><span class="na">openConnection</span><span class="o">();</span></div><div class='line' id='LC164'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">conn</span><span class="o">.</span><span class="na">setRequestProperty</span><span class="o">(</span><span class="s">&quot;User-Agent&quot;</span><span class="o">,</span> <span class="n">System</span><span class="o">.</span><span class="na">getProperties</span><span class="o">().</span></div><div class='line' id='LC165'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">getProperty</span><span class="o">(</span><span class="s">&quot;http.agent&quot;</span><span class="o">)</span> <span class="o">+</span> <span class="s">&quot; FacebookAndroidSDK&quot;</span><span class="o">);</span></div><div class='line' id='LC166'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">method</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;GET&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC167'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Bundle</span> <span class="n">dataparams</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Bundle</span><span class="o">();</span></div><div class='line' id='LC168'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="n">String</span> <span class="n">key</span> <span class="o">:</span> <span class="n">params</span><span class="o">.</span><span class="na">keySet</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC169'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">parameter</span> <span class="o">=</span> <span class="n">params</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC170'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">parameter</span> <span class="k">instanceof</span> <span class="kt">byte</span><span class="o">[])</span> <span class="o">{</span></div><div class='line' id='LC171'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">dataparams</span><span class="o">.</span><span class="na">putByteArray</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="o">(</span><span class="kt">byte</span><span class="o">[])</span><span class="n">parameter</span><span class="o">);</span></div><div class='line' id='LC172'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC173'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC174'><br/></div><div class='line' id='LC175'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// use method override</span></div><div class='line' id='LC176'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">params</span><span class="o">.</span><span class="na">containsKey</span><span class="o">(</span><span class="s">&quot;method&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC177'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">params</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="s">&quot;method&quot;</span><span class="o">,</span> <span class="n">method</span><span class="o">);</span></div><div class='line' id='LC178'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC179'><br/></div><div class='line' id='LC180'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">params</span><span class="o">.</span><span class="na">containsKey</span><span class="o">(</span><span class="s">&quot;access_token&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC181'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">decoded_token</span> <span class="o">=</span></div><div class='line' id='LC182'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">URLDecoder</span><span class="o">.</span><span class="na">decode</span><span class="o">(</span><span class="n">params</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="s">&quot;access_token&quot;</span><span class="o">));</span></div><div class='line' id='LC183'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">params</span><span class="o">.</span><span class="na">putString</span><span class="o">(</span><span class="s">&quot;access_token&quot;</span><span class="o">,</span> <span class="n">decoded_token</span><span class="o">);</span></div><div class='line' id='LC184'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC185'><br/></div><div class='line' id='LC186'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">conn</span><span class="o">.</span><span class="na">setRequestMethod</span><span class="o">(</span><span class="s">&quot;POST&quot;</span><span class="o">);</span></div><div class='line' id='LC187'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">conn</span><span class="o">.</span><span class="na">setRequestProperty</span><span class="o">(</span></div><div class='line' id='LC188'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;Content-Type&quot;</span><span class="o">,</span></div><div class='line' id='LC189'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;multipart/form-data;boundary=&quot;</span><span class="o">+</span><span class="n">strBoundary</span><span class="o">);</span></div><div class='line' id='LC190'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">conn</span><span class="o">.</span><span class="na">setDoOutput</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></div><div class='line' id='LC191'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">conn</span><span class="o">.</span><span class="na">setDoInput</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></div><div class='line' id='LC192'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">conn</span><span class="o">.</span><span class="na">setRequestProperty</span><span class="o">(</span><span class="s">&quot;Connection&quot;</span><span class="o">,</span> <span class="s">&quot;Keep-Alive&quot;</span><span class="o">);</span></div><div class='line' id='LC193'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">conn</span><span class="o">.</span><span class="na">connect</span><span class="o">();</span></div><div class='line' id='LC194'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">os</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BufferedOutputStream</span><span class="o">(</span><span class="n">conn</span><span class="o">.</span><span class="na">getOutputStream</span><span class="o">());</span></div><div class='line' id='LC195'><br/></div><div class='line' id='LC196'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">os</span><span class="o">.</span><span class="na">write</span><span class="o">((</span><span class="s">&quot;--&quot;</span> <span class="o">+</span> <span class="n">strBoundary</span> <span class="o">+</span><span class="n">endLine</span><span class="o">).</span><span class="na">getBytes</span><span class="o">());</span></div><div class='line' id='LC197'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">os</span><span class="o">.</span><span class="na">write</span><span class="o">((</span><span class="n">encodePostBody</span><span class="o">(</span><span class="n">params</span><span class="o">,</span> <span class="n">strBoundary</span><span class="o">)).</span><span class="na">getBytes</span><span class="o">());</span></div><div class='line' id='LC198'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">os</span><span class="o">.</span><span class="na">write</span><span class="o">((</span><span class="n">endLine</span> <span class="o">+</span> <span class="s">&quot;--&quot;</span> <span class="o">+</span> <span class="n">strBoundary</span> <span class="o">+</span> <span class="n">endLine</span><span class="o">).</span><span class="na">getBytes</span><span class="o">());</span></div><div class='line' id='LC199'><br/></div><div class='line' id='LC200'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">dataparams</span><span class="o">.</span><span class="na">isEmpty</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC201'><br/></div><div class='line' id='LC202'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="n">String</span> <span class="nl">key:</span> <span class="n">dataparams</span><span class="o">.</span><span class="na">keySet</span><span class="o">()){</span></div><div class='line' id='LC203'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">os</span><span class="o">.</span><span class="na">write</span><span class="o">((</span><span class="s">&quot;Content-Disposition: form-data; filename=\&quot;&quot;</span> <span class="o">+</span> <span class="n">key</span> <span class="o">+</span> <span class="s">&quot;\&quot;&quot;</span> <span class="o">+</span> <span class="n">endLine</span><span class="o">).</span><span class="na">getBytes</span><span class="o">());</span></div><div class='line' id='LC204'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">os</span><span class="o">.</span><span class="na">write</span><span class="o">((</span><span class="s">&quot;Content-Type: content/unknown&quot;</span> <span class="o">+</span> <span class="n">endLine</span> <span class="o">+</span> <span class="n">endLine</span><span class="o">).</span><span class="na">getBytes</span><span class="o">());</span></div><div class='line' id='LC205'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">os</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">dataparams</span><span class="o">.</span><span class="na">getByteArray</span><span class="o">(</span><span class="n">key</span><span class="o">));</span></div><div class='line' id='LC206'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">os</span><span class="o">.</span><span class="na">write</span><span class="o">((</span><span class="n">endLine</span> <span class="o">+</span> <span class="s">&quot;--&quot;</span> <span class="o">+</span> <span class="n">strBoundary</span> <span class="o">+</span> <span class="n">endLine</span><span class="o">).</span><span class="na">getBytes</span><span class="o">());</span></div><div class='line' id='LC207'><br/></div><div class='line' id='LC208'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC209'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC210'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">os</span><span class="o">.</span><span class="na">flush</span><span class="o">();</span></div><div class='line' id='LC211'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC212'><br/></div><div class='line' id='LC213'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">response</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC214'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC215'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">response</span> <span class="o">=</span> <span class="n">read</span><span class="o">(</span><span class="n">conn</span><span class="o">.</span><span class="na">getInputStream</span><span class="o">());</span></div><div class='line' id='LC216'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">FileNotFoundException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC217'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Error Stream contains JSON that we can parse to a FB error</span></div><div class='line' id='LC218'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">response</span> <span class="o">=</span> <span class="n">read</span><span class="o">(</span><span class="n">conn</span><span class="o">.</span><span class="na">getErrorStream</span><span class="o">());</span></div><div class='line' id='LC219'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC220'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">response</span><span class="o">;</span></div><div class='line' id='LC221'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC222'><br/></div><div class='line' id='LC223'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">static</span> <span class="n">String</span> <span class="nf">read</span><span class="o">(</span><span class="n">InputStream</span> <span class="n">in</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC224'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">StringBuilder</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="n">StringBuilder</span><span class="o">();</span></div><div class='line' id='LC225'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">BufferedReader</span> <span class="n">r</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BufferedReader</span><span class="o">(</span><span class="k">new</span> <span class="n">InputStreamReader</span><span class="o">(</span><span class="n">in</span><span class="o">),</span> <span class="mi">1000</span><span class="o">);</span></div><div class='line' id='LC226'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="n">String</span> <span class="n">line</span> <span class="o">=</span> <span class="n">r</span><span class="o">.</span><span class="na">readLine</span><span class="o">();</span> <span class="n">line</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">;</span> <span class="n">line</span> <span class="o">=</span> <span class="n">r</span><span class="o">.</span><span class="na">readLine</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC227'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">line</span><span class="o">);</span></div><div class='line' id='LC228'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC229'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">in</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC230'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC231'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC232'><br/></div><div class='line' id='LC233'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">clearCookies</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC234'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Edge case: an illegal state exception is thrown if an instance of</span></div><div class='line' id='LC235'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// CookieSyncManager has not be created.  CookieSyncManager is normally</span></div><div class='line' id='LC236'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// created by a WebKit view, but this might happen if you start the</span></div><div class='line' id='LC237'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// app, restore saved state, and click logout before running a UI</span></div><div class='line' id='LC238'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// dialog in a WebView -- in which case the app crashes</span></div><div class='line' id='LC239'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@SuppressWarnings</span><span class="o">(</span><span class="s">&quot;unused&quot;</span><span class="o">)</span></div><div class='line' id='LC240'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">CookieSyncManager</span> <span class="n">cookieSyncMngr</span> <span class="o">=</span></div><div class='line' id='LC241'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">CookieSyncManager</span><span class="o">.</span><span class="na">createInstance</span><span class="o">(</span><span class="n">context</span><span class="o">);</span></div><div class='line' id='LC242'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">CookieManager</span> <span class="n">cookieManager</span> <span class="o">=</span> <span class="n">CookieManager</span><span class="o">.</span><span class="na">getInstance</span><span class="o">();</span></div><div class='line' id='LC243'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">cookieManager</span><span class="o">.</span><span class="na">removeAllCookie</span><span class="o">();</span></div><div class='line' id='LC244'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC245'><br/></div><div class='line' id='LC246'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC247'><span class="cm">     * Parse a server response into a JSON Object. This is a basic</span></div><div class='line' id='LC248'><span class="cm">     * implementation using org.json.JSONObject representation. More</span></div><div class='line' id='LC249'><span class="cm">     * sophisticated applications may wish to do their own parsing.</span></div><div class='line' id='LC250'><span class="cm">     *</span></div><div class='line' id='LC251'><span class="cm">     * The parsed JSON is checked for a variety of error fields and</span></div><div class='line' id='LC252'><span class="cm">     * a FacebookException is thrown if an error condition is set,</span></div><div class='line' id='LC253'><span class="cm">     * populated with the error message and error type or code if</span></div><div class='line' id='LC254'><span class="cm">     * available.</span></div><div class='line' id='LC255'><span class="cm">     *</span></div><div class='line' id='LC256'><span class="cm">     * @param response - string representation of the response</span></div><div class='line' id='LC257'><span class="cm">     * @return the response as a JSON Object</span></div><div class='line' id='LC258'><span class="cm">     * @throws JSONException - if the response is not valid JSON</span></div><div class='line' id='LC259'><span class="cm">     * @throws FacebookError - if an error condition is set</span></div><div class='line' id='LC260'><span class="cm">     */</span></div><div class='line' id='LC261'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">JSONObject</span> <span class="nf">parseJson</span><span class="o">(</span><span class="n">String</span> <span class="n">response</span><span class="o">)</span></div><div class='line' id='LC262'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">throws</span> <span class="n">JSONException</span><span class="o">,</span> <span class="n">FacebookError</span> <span class="o">{</span></div><div class='line' id='LC263'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Edge case: when sending a POST request to /[post_id]/likes</span></div><div class='line' id='LC264'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// the return value is &#39;true&#39; or &#39;false&#39;. Unfortunately</span></div><div class='line' id='LC265'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// these values cause the JSONObject constructor to throw</span></div><div class='line' id='LC266'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// an exception.</span></div><div class='line' id='LC267'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">response</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;false&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC268'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">FacebookError</span><span class="o">(</span><span class="s">&quot;request failed&quot;</span><span class="o">);</span></div><div class='line' id='LC269'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC270'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">response</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;true&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC271'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">response</span> <span class="o">=</span> <span class="s">&quot;{value : true}&quot;</span><span class="o">;</span></div><div class='line' id='LC272'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC273'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span> <span class="n">json</span> <span class="o">=</span> <span class="k">new</span> <span class="n">JSONObject</span><span class="o">(</span><span class="n">response</span><span class="o">);</span></div><div class='line' id='LC274'><br/></div><div class='line' id='LC275'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// errors set by the server are not consistent</span></div><div class='line' id='LC276'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// they depend on the method and endpoint</span></div><div class='line' id='LC277'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">json</span><span class="o">.</span><span class="na">has</span><span class="o">(</span><span class="s">&quot;error&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC278'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span> <span class="n">error</span> <span class="o">=</span> <span class="n">json</span><span class="o">.</span><span class="na">getJSONObject</span><span class="o">(</span><span class="s">&quot;error&quot;</span><span class="o">);</span></div><div class='line' id='LC279'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">FacebookError</span><span class="o">(</span></div><div class='line' id='LC280'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">error</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="s">&quot;message&quot;</span><span class="o">),</span> <span class="n">error</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="s">&quot;type&quot;</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC281'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC282'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">json</span><span class="o">.</span><span class="na">has</span><span class="o">(</span><span class="s">&quot;error_code&quot;</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="n">json</span><span class="o">.</span><span class="na">has</span><span class="o">(</span><span class="s">&quot;error_msg&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC283'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">FacebookError</span><span class="o">(</span><span class="n">json</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="s">&quot;error_msg&quot;</span><span class="o">),</span> <span class="s">&quot;&quot;</span><span class="o">,</span></div><div class='line' id='LC284'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Integer</span><span class="o">.</span><span class="na">parseInt</span><span class="o">(</span><span class="n">json</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="s">&quot;error_code&quot;</span><span class="o">)));</span></div><div class='line' id='LC285'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC286'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">json</span><span class="o">.</span><span class="na">has</span><span class="o">(</span><span class="s">&quot;error_code&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC287'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">FacebookError</span><span class="o">(</span><span class="s">&quot;request failed&quot;</span><span class="o">,</span> <span class="s">&quot;&quot;</span><span class="o">,</span></div><div class='line' id='LC288'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Integer</span><span class="o">.</span><span class="na">parseInt</span><span class="o">(</span><span class="n">json</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="s">&quot;error_code&quot;</span><span class="o">)));</span></div><div class='line' id='LC289'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC290'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">json</span><span class="o">.</span><span class="na">has</span><span class="o">(</span><span class="s">&quot;error_msg&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC291'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">FacebookError</span><span class="o">(</span><span class="n">json</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="s">&quot;error_msg&quot;</span><span class="o">));</span></div><div class='line' id='LC292'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC293'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">json</span><span class="o">.</span><span class="na">has</span><span class="o">(</span><span class="s">&quot;error_reason&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC294'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">FacebookError</span><span class="o">(</span><span class="n">json</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="s">&quot;error_reason&quot;</span><span class="o">));</span></div><div class='line' id='LC295'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC296'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">json</span><span class="o">;</span></div><div class='line' id='LC297'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC298'><br/></div><div class='line' id='LC299'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC300'><span class="cm">     * Display a simple alert dialog with the given text and title.</span></div><div class='line' id='LC301'><span class="cm">     *</span></div><div class='line' id='LC302'><span class="cm">     * @param context</span></div><div class='line' id='LC303'><span class="cm">     *          Android context in which the dialog should be displayed</span></div><div class='line' id='LC304'><span class="cm">     * @param title</span></div><div class='line' id='LC305'><span class="cm">     *          Alert dialog title</span></div><div class='line' id='LC306'><span class="cm">     * @param text</span></div><div class='line' id='LC307'><span class="cm">     *          Alert dialog message</span></div><div class='line' id='LC308'><span class="cm">     */</span></div><div class='line' id='LC309'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">showAlert</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">,</span> <span class="n">String</span> <span class="n">title</span><span class="o">,</span> <span class="n">String</span> <span class="n">text</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC310'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Builder</span> <span class="n">alertBuilder</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Builder</span><span class="o">(</span><span class="n">context</span><span class="o">);</span></div><div class='line' id='LC311'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">alertBuilder</span><span class="o">.</span><span class="na">setTitle</span><span class="o">(</span><span class="n">title</span><span class="o">);</span></div><div class='line' id='LC312'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">alertBuilder</span><span class="o">.</span><span class="na">setMessage</span><span class="o">(</span><span class="n">text</span><span class="o">);</span></div><div class='line' id='LC313'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">alertBuilder</span><span class="o">.</span><span class="na">create</span><span class="o">().</span><span class="na">show</span><span class="o">();</span></div><div class='line' id='LC314'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC315'><br/></div><div class='line' id='LC316'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC317'><span class="cm">     * A proxy for Log.d api that kills log messages in release build. It</span></div><div class='line' id='LC318'><span class="cm">     * not recommended to send sensitive information to log output in</span></div><div class='line' id='LC319'><span class="cm">     * shipping apps.</span></div><div class='line' id='LC320'><span class="cm">     *</span></div><div class='line' id='LC321'><span class="cm">     * @param tag</span></div><div class='line' id='LC322'><span class="cm">     * @param msg</span></div><div class='line' id='LC323'><span class="cm">     */</span></div><div class='line' id='LC324'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">logd</span><span class="o">(</span><span class="n">String</span> <span class="n">tag</span><span class="o">,</span> <span class="n">String</span> <span class="n">msg</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC325'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">ENABLE_LOG</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC326'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Log</span><span class="o">.</span><span class="na">d</span><span class="o">(</span><span class="n">tag</span><span class="o">,</span> <span class="n">msg</span><span class="o">);</span></div><div class='line' id='LC327'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC328'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC329'><span class="o">}</span></div></pre></div>
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
  <img src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-64.gif?1334862346" height="64" width="64">
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

      <p>&copy; 2012 <span title="0.11006s from fe13.rs.github.com">GitHub</span> Inc. All rights reserved.</p>
    </div><!-- /#legal or /#legal_ie-->

      <div class="sponsor">
        <a href="http://www.rackspace.com" class="logo">
          <img alt="Dedicated Server" height="36" src="https://a248.e.akamai.net/assets.github.com/images/modules/footer/rackspaces_logo.png?1334862346" width="38" />
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
          <a href="http://github-media-downloads.s3.amazonaws.com/GitHub_Logos.zip"><img alt="Github_logo" src="https://a248.e.akamai.net/assets.github.com/images/modules/about_page/github_logo.png?1334862345" /></a>
          <a href="http://github-media-downloads.s3.amazonaws.com/GitHub_Logos.zip" class="minibutton btn-download download"><span><span class="icon"></span>Download</span></a>
        </li>
        <li>
          <h4>The Octocat</h4>
          <a href="http://github-media-downloads.s3.amazonaws.com/Octocats.zip"><img alt="Octocat" src="https://a248.e.akamai.net/assets.github.com/images/modules/about_page/octocat.png?1334862345" /></a>
          <a href="http://github-media-downloads.s3.amazonaws.com/Octocats.zip" class="minibutton btn-download download"><span><span class="icon"></span>Download</span></a>
        </li>
      </ul>
    </div>

    
    
    
    <span id='server_response_time' data-time='0.11333' data-host='fe13'></span>
  </body>
</html>

