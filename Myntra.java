package week3.day2.assignments;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		Actions actions=new Actions(driver);
		WebElement Women=driver.findElement(By.xpath("//a[@data-group='women']"));

		actions.moveToElement(Women).build().perform();
		WebElement Jackets_Coats=driver.findElement(By.xpath("//a[text()='Jackets & Coats']"));
		Jackets_Coats.click();
		Thread.sleep(1000);


		WebElement totalCount1 = driver.findElement(By.xpath("(//main[@class='search-base']//div)[3]"));
		String count1=totalCount1.getText();
		Thread.sleep(2000);

		String jackets = driver.findElement(By.xpath("//label[text()='Jackets']")).getText();
		jackets = jackets.replaceAll("\\D", "").trim();
		String coats = driver.findElement(By.xpath("//label[text()='Coats']")).getText();
		coats = coats.replaceAll("\\D", "").trim();
		int sumOfCategories = Integer.parseInt(jackets) + Integer.parseInt(coats);
		System.out.println(sumOfCategories);

		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[2]")).click();

		driver.findElement(By.xpath("//ul[@class='brand-list']/following-sibling::div[1]")).click();

		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("MANGO");

		driver.findElement(By.xpath("//label[@class=' common-customCheckbox']//div[1]")).click();

		driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite FilterDirectory-close')]")).click();

		String Mango=driver.findElement(By.xpath("(//div[@class='filter-summary-filter'])[2]")).getText();

		if(Mango.equalsIgnoreCase("MANGO")) 
		{
			System.out.println("All the coats are MANGO brand");
		} else {
			System.out.println("Not MANGO Brand");
		}


		WebElement Sort=driver.findElement(By.className("sort-sortBy"));
		actions.moveToElement(Sort).build().perform();
		Thread.sleep(1000);
		WebElement Better_Discount=driver.findElement(By.xpath("//label[text()='Better Discount']"));
		Better_Discount.click();

		String Price=driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
		Price=Price.replaceAll("//D", "");
		System.out.println(Price);

		WebElement sizeitem=driver.findElement(By.xpath("//img[@title='MANGO Women Beige & Brown Solid Reversible Knee Length Overcoat']"));
		actions.moveToElement(sizeitem).build().perform();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//span[contains(@class,'product-wishlistFlex product-actionsButton')]")).click();
		Thread.sleep(13000);

		driver.close();


	}

}
