#!/bin/sh

export JAVA_HOME=$JAVA8_HOME
export CLASSPATH=.:$JAVA_HOME/lib
export PATH=$JAVA_HOME/bin:$PATH
export JAVA_OPTS='-server -Xms256m -Xmx512m'

java -version

pwd

cd ..
mvn clean eclipse:clean dependency:sources -DdownloadSources=true eclipse:eclipse