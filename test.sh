#!/bin/bash
java -jar /usr/local/lib/antlr-4.6-complete.jar vhdl.g4 -o build-test
javac build-test/vhdl*.java
cd build-test
cat ../test.vhd | java org.antlr.v4.gui.TestRig vhdl design_file -gui
