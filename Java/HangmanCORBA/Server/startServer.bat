@echo off
idlj -fall ../Hangman.idl
javac -d . *.java
start java -cp . Server -ORBInitialPort 7000
