ForegroundViews
=======
Small library that provides Foreground View functionality to most used Android Views with foreground.
If you want support to new View, add an issue :-)

<h6> Sources </h6>
This library is developed based on some other good but not completed approaches of Foreground Views:

* [FRelativeLayout][1] made by [Shaka Huang][2].
* [Antonie Merle][3] [post][4] about how custom Foreground Views should work.
* [Chris Banes][5] [post][6] that explains which possibilities we have to get the Foreground Approach on Android
* [FrameLayout source code] [7]

Screenshots
-----------

Usage
-----
You just have to use whatever FView like FrameLayout; just set the android:foreground attribute as shown below:
```
<com.dogmalabs.foregroundviews.FView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:foreground="?android:selectableItemBackground">

    ... other views ...

</your.package.ForegroundLinearLayout>
```

Download
--------
Not yet.

Download [the latest JAR][4] or grab via Maven:
```xml
<! -- Coming soon -->
```
or Gradle:
```groovy
# Coming soon
```

Developed By
------------

* César Díez Sánchez - <cesaryomismo@gmail.com>

<a href="https://twitter.com/menorking">
  <img alt="Follow me on Twitter" src="http://imageshack.us/a/img812/3923/smallth.png" />
</a>
<a href="https://plus.google.com/115273462230054581675">
  <img alt="Follow me on Google Plus" src="http://imageshack.us/a/img203/4712/smallg.png" />
</a>
<a href="http://www.linkedin.com/in/cesardiezsanchez">
  <img alt="Add me to Linkedin" src="http://imageshack.us/a/img41/7877/smallld.png" />
</a>

License
-------

    Copyright 2014 DogmaLabs

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[1] https://gist.github.com/shakalaca/6199283
[2] https://github.com/shakalaca
[3] https://github.com/castorflex
[4] http://antoine-merle.com/blog/2013/07/17/adding-a-foreground-selector-to-a-view/
[5] https://github.com/chrisbanes
[6] https://plus.google.com/+AndroidDevelopers/posts/aHPVDtr6mcp
[7] https://github.com/android/platform_frameworks_base/blob/master/core/java/android/widget/FrameLayout.java
