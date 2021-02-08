package dockerrun;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setupdockergrid {

	@BeforeTest
	public void start_dockergrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start startdockergrid.bat");
		Thread.sleep(45000);
	}

	@AfterTest
	public void stop_dockergrid() throws IOException, InterruptedException {
		
		  Runtime.getRuntime().exec("cmd /c start dockerstop.bat"); Thread.sleep(5000);
		 
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");//closes all cmd
	}
}
