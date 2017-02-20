#!/bin/bash
java -jar /usr/local/lib/antlr-4.6-complete.jar aspectv.g4 -o build-test
javac build-test/aspectv*.java
cd build-test
cat ../test.vhd | java org.antlr.v4.gui.TestRig aspectv design_file -gui
