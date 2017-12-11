package LinkedInDemo2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edocket_Login {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Jar files//chromedriver.exe");
		WebDriver fdriver1=new ChromeDriver();
		fdriver1.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		fdriver1.manage().window().maximize();
		fdriver1.get("http://52.205.78.71");
		
		System.out.println("USER CREDENTIALS");
		Robot robot = new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		//robot.keyPress(KeyEvent.);
		robot.keyPress(KeyEvent.VK_Q);
		robot.keyRelease(KeyEvent.VK_Q);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);

		robot.keyPress(KeyEvent.VK_BACK_SLASH);
		robot.keyRelease(KeyEvent.VK_BACK_SLASH);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_8);
		robot.keyRelease(KeyEvent.VK_8);
		robot.keyPress(KeyEvent.VK_7);
		robot.keyRelease(KeyEvent.VK_7);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_3);
		robot.keyRelease(KeyEvent.VK_3);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("USER CREDENTIALS");
		

	}

}
