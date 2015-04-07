# AdaptiveMe IDE Base
[![Build Status](https://travis-ci.org/AdaptiveMe/adaptive-ide-base.svg?branch=master)](https://travis-ci.org/AdaptiveMe/adaptive-ide-base)
[![GitHub tag](https://img.shields.io/github/tag/AdaptiveMe/adaptive-ide-base.svg)](https://github.com/AdaptiveMe/adaptive-ide-base) [![License](https://img.shields.io/badge/license-apache%202-blue.svg)](https://raw.githubusercontent.com/AdaptiveMe/adaptive-arp-api/master/LICENSE) 
[![Adaptive Nibble](https://img.shields.io/badge/ide-base-brightgreen.svg)](https://github.com/AdaptiveMe/adaptive-ide-base)  [![adaptive.me](https://img.shields.io/badge/adaptive-me-fdcb0e.svg)](http://adaptive.me) [![Stories in Ready](https://badge.waffle.io/AdaptiveMe/adaptive-ide-base.svg?label=ready&title=Ready)](http://waffle.io/AdaptiveMe/adaptive-ide-base)

[![Adaptive Tools](https://raw.githubusercontent.com/AdaptiveMe/AdaptiveMe.github.io/master/assets/logos/normal/Logo-adaptive-devtools.png)](#)


## Introduction

### About This Project

Adaptive.me IDE based on Jetbrains IntelliJ IDEA Community. This project is used by all Adaptive.me IDE products.


### About Adaptive Runtime Platform

Hybrid apps are applications that are built using HTML5/CSS3/JavaScript web technologies and use a native "containers" to package the app to enable access to the native functionalities of a device. In essence, you can write a rich mobile/wearable/tv application using HTML and JavaScript and package that application as a native app for multiple mobile/wearable/tv platforms and distribute them on the different app stores and markets.

The Adaptive Runtime Platform (ARP) provides these native "containers" to package apps for the main mobile, wearable and desktop platforms... and other platforms as they emerge. Adaptive Runtime Platform (ARP) and sub-projects are open-source under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html). The Adaptive Runtime Platform (ARP) project was created by [Carlos Lozano Diez](https://github.com/carloslozano) as part of the [adaptive.me](http://adaptive.me) set of products.

Please refer to the [project site](http://adaptiveme.github.io) for more information.

## Work Backlog

#### Board: [![Stories in Ready](https://badge.waffle.io/AdaptiveMe/adaptive-ide-base.svg?label=ready&title=Ready)](https://waffle.io/AdaptiveMe/adaptive-ide-base)

[![Throughput Graph](https://graphs.waffle.io/AdaptiveMe/adaptive-ide-base/throughput.svg)](https://waffle.io/AdaptiveMe/adaptive-ide-base/metrics)

## Contributing

We'd *love to accept your patches and contributions to this project*.  There are a just a few small guidelines you need to follow to ensure that you and/or your company and our project are safeguarded from inadvertent copyright infringement. I know, this can be a pain but we want fair-play from the very start so that we're all on the same page. Please refer to the [project site](http://adaptiveme.github.io) for more information.

## Attributions

* Adaptive Runtime Platform (ARP) artwork by [Jennifer Lasso](https://github.com/Jlassob).
* Project badge artwork by [shields.io](http://shields.io/).
* All other logos are copyright of their respective owners.

## License
All the source code of the Adaptive Runtime Platform (ARP), including all Adaptive Runtime Platform (ARP) sub-projects curated by [Carlos Lozano Diez](https://github.com/carloslozano), are distributed, and must be contributed to, under the terms of the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html). The [license](https://raw.githubusercontent.com/AdaptiveMe/adaptive-arp-api/master/LICENSE) is included in this [repository](https://raw.githubusercontent.com/AdaptiveMe/adaptive-arp-api/master/LICENSE).

# Development

## Cloning the repo
This repository includes intellij idea as a submodule, remember to clone with --recursive


```sh
$ git clone --recursive [git-repo-url]
```

If you have already cloned the repo and haven't used the ``--recursive`` option, execute the ``get-idea.sh`` script

```sh
$ ./get-idea.sh
```

## Building and Running from the IDE (Intellij IDEA)

To develop IntelliJ IDEA, you can use either IntelliJ IDEA Community Edition or IntelliJ IDEA Ultimate. To build and run the code:

 - Make sure you have the **Groovy** plugin enabled. Parts of IntelliJ IDEA are written in Groovy, and you will get compilation errors if you don't have the plugin enabled.
 - Make sure you have the **UI Designer** plugin enabled. Most of IntelliJ IDEA's UI is built using the UI Designer, and the version you build will not run correctly if you don't have the plugin enabled.
 - Open the directory with the source code as a directory-based project
 - Configure a JSDK named **"IDEA jdk"** (case sensitive), it's important tha the name of the jdk remain unchanged, pointing to an installation of JDK 1.6 (1.7 works as well)
 - Add **lib\tools.jar** from the JDK installation directory to the classpath of IDEA JDK
 - Use Build | Make Project to build the code
 - To run the code, use the provided shared run configuration "IDEA".

***Happy Coding***

Forged with :heart: in Barcelona, Catalonia · © 2013 - 2015 [adaptive.me](http://adaptive.me) / [Carlos Lozano Diez](http://google.com/+CarlosLozano).