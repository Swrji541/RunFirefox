# This smaall programme is only demonstration to execute firefox on linux system.
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
