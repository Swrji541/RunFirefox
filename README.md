# RunFirefox

#compilation and execution 
#here you can see LinuxFirefox.java file
#This is a small program that start up firefox in linux system only. 
#Open your terminal and follow the instruction : -- 
cd RunFirefox
javac LinuxFirefox.java #- This commands compile the source code and check error
java LinuxFirefox - This commands run the byte code and started up firefox on your system
#if cause by : java.lang.NoClassDefFoundError: com/company/Main (wrong name: Main)
#remove the statement : package com.company; line 4

#Execution 
#if you directly execute the java program then open your terminal follow the instruction 
cd RunFirefox
#Here you can see a file with class extension;
java LinuxFirefox
