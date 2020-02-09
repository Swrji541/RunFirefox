package com.company;

public class Main {

    public static void main(String[] args) {
	    try {
	        Process process = Runtime.getRuntime().exec("firefox");
	        System.out.println("Firefox successfully started.");
        } catch(Exception e) {
	        e.printStackTrace();
        }
    }
}
