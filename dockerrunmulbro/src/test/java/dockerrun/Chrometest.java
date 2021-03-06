package dockerrun;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

public class Chrometest {

	@Test
	public void test() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		System.out.println("session started successfully ");
		WebDriver rwd = new RemoteWebDriver(url, dc);
		rwd.get("https://facebook.com/");

		System.out.println(rwd.getTitle());
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		rwd.quit();
	}

}
