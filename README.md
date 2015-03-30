[![Build Status](https://travis-ci.org/AdaptiveMe/adaptive-ide-base.svg?branch=master)](https://travis-ci.org/AdaptiveMe/adaptive-ide-base)
[![GitHub tag](https://img.shields.io/github/tag/AdaptiveMe/adaptive-ide-base.svg)](https://github.com/AdaptiveMe/adaptive-ide-base) [![License](https://img.shields.io/badge/license-apache%202-blue.svg)](https://raw.githubusercontent.com/AdaptiveMe/adaptive-arp-api/master/LICENSE) 
[![Adaptive Nibble](https://img.shields.io/badge/ide-base-brightgreen.svg)](https://github.com/AdaptiveMe/adaptive-ide-base)  [![adaptive.me](https://img.shields.io/badge/adaptive-me-fdcb0e.svg)](http://adaptive.me) [![Stories in Ready](https://badge.waffle.io/AdaptiveMe/adaptive-ide-base.svg?label=ready&title=Ready)](http://waffle.io/AdaptiveMe/adaptive-ide-base)

# adaptive-ide-base
Adaptive.me IDE based on Jetbrains IntelliJ IDEA Community

#Cloning the repo
This repository includes intellij idea as a submodule, remember to clone with --recursive


```sh
$ git clone --recursive [git-repo-url]
```

If you have already cloned the repo and haven't used the ``--recursive`` option, execute the ``get-idea.sh`` script

```sh
$ ./get-idea.sh
```

#Building and Running from the IDE (Intellij IDEA)

To develop IntelliJ IDEA, you can use either IntelliJ IDEA Community Edition or IntelliJ IDEA Ultimate. To build and run the code:

 - Make sure you have the **Groovy** plugin enabled. Parts of IntelliJ IDEA are written in Groovy, and you will get compilation errors if you don't have the plugin enabled.
 - Make sure you have the **UI Designer** plugin enabled. Most of IntelliJ IDEA's UI is built using the UI Designer, and the version you build will not run correctly if you don't have the plugin enabled.
 - Open the directory with the source code as a directory-based project
 - Configure a JSDK named **"IDEA jdk"** (case sensitive), it's important tha the name of the jdk remain unchanged, pointing to an installation of JDK 1.6 (1.7 works as well)
 - Add **lib\tools.jar** from the JDK installation directory to the classpath of IDEA JDK
 - Use Build | Make Project to build the code
 - To run the code, use the provided shared run configuration "IDEA".

***Happy Coding***
