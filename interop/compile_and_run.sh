#!/bin/sh
scalac Test.scala

javac -cp $SCALA_HOME/lib/scala-library.jar:. Prog.java

java -cp $SCALA_HOME/lib/scala-library.jar:. Prog

