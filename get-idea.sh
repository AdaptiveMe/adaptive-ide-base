#!/usr/bin/env bash
echo "initializing the submodule"
git submodule update --init
echo "submodule initialized, checking out the tag webstorm/140.2574"
cd intellij-community
git checkout webstorm/140.2574
