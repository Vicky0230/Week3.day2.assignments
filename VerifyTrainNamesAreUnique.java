package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MDU",Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MS",Keys.TAB);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		Thread.sleep(2000);

		List<WebElement> arrList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]/a"));

		System.out.println("Train list Count is: "+arrList.size());

		List<String> list=new ArrayList<String>();

		for (WebElement string : arrList) {

			list.add(string.getText());

		}

		Set<String> set=new HashSet<String>(list);
		set.addAll(list);

		System.out.println("Set Count is: "+set.size());

		driver.close();

	}

}
