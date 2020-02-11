//If you are use other JVM, please change the package name like Intelli_J JVM;
//If the program cause by : java.lang.NoClassDefFoundError: com/company/Main;
//then remove package com.company;


//package com.company;
import java.lang.Process;

public class LinuxFirefox {

    public static void main(String[] args) {
	    try {
	        Process process = Runtime.getRuntime().exec("firefox");
	        System.out.println("Firefox successfully started.");
        } catch(Exception e) {
	        e.printStackTrace();
        }
    }
}
