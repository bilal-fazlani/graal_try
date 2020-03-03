#!/usr/bin/env bash -ex

coursier bootstrap --graalvm 20 tech.bilal::graal_try:0.1.0-SNAPSHOT \
--native-image -o hello-graal -f --graalvm-opt --no-fallback -- \
--initialize-at-build-time

#--initialize-at-build-time : allows lambda functions in scala code
#--no-fallback: forces native image - or else fails build

coursier bootstrap tech.bilal::graal_try:0.1.0-SNAPSHOT \
-o hello-jvm -f