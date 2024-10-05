package handle_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_CountIn_webpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HP\\Documents\\Selenium july\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://is.rediff.com/signup/register");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	   WebElement rediff_link = driver.findElement(By.xpath("//a[@title='Rediff.com Home']"));
	   WebElement rediff_img = driver.findElement(By.xpath("//img[@class='halflogo']"));
	   WebElement rediff_txt = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
	   WebElement rediff_txt1 = driver.findElement(By.xpath("//p[text()='Tell us a few things about yourself and we will help you find classmates and']"));
	   WebElement rediff_FN = driver.findElement(By.xpath("//div[text()='Your Full name']"));
	   WebElement rediff_EmailID = driver.findElement(By.xpath("//div[text()='Your current email ID']"));
	   WebElement rediff_EmailIDBelow = driver.findElement(By.xpath("//p[text()='eg: myname@gmail.com,  myname@yahoo.com']"));
	   WebElement rediff_NewPsw = driver.findElement(By.xpath("//div[text()='New password']"));
	   WebElement rediff_RetypePsw = driver.findElement(By.xpath("//div[text()='Retype password']"));
	   WebElement rediff_Gender = driver.findElement(By.xpath("//div[text()='Gender:']"));
	   WebElement rediff_Gender_M = driver.findElement(By.xpath("//input[@value='m']"));
	   WebElement rediff_Gender_F = driver.findElement(By.xpath("//input[@value='f']"));
	   WebElement rediff_DOB = driver.findElement(By.xpath("//div[text()='Date of Birth']"));
	   WebElement rediff_DOB_Day = driver.findElement(By.xpath("//select[@name='date_day']"));
	   WebElement rediff_DOB_Month = driver.findElement(By.xpath("//select[@id='date_mon']"));
	   WebElement rediff_DOB_Year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
	   WebElement rediff_Location = driver.findElement(By.xpath("//div[text()='Location']"));
	   WebElement rediff_school = driver.findElement(By.xpath("//div[text()='School']"));
	   WebElement rediff_collage = driver.findElement(By.xpath("//div[text()='College']"));
	   WebElement rediff_Captcha = driver.findElement(By.xpath("//div[text()='Enter the code given in the above image']"));
	   WebElement rediff_SignUp = driver.findElement(By.xpath("//input[@class='submitbtn vmiddle']"));
	   WebElement rediff_link1 = driver.findElement(By.xpath("//a[text()='Investor Information']"));
	   WebElement rediff_link2 = driver.findElement(By.xpath("//a[text()='Advertise with us']"));
	   WebElement rediff_link3 = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
	   WebElement rediff_link4 = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
	   WebElement rediff_link5 = driver.findElement(By.xpath("//a[text()='Feedback']"));
	   WebElement rediff_link6 = driver.findElement(By.xpath("//a[text()='Terms of Use']"));   
	   
	   int count=0;
	   
	   if(rediff_link.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff link is available");
	   }
	   else
	   {
		   System.out.println("Rediff link is not available");
	   }
	   if(rediff_img.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff img is available");
	   }
	   else
	   {
		   System.out.println("Rediff img is not available");
	   } 
	   if(rediff_txt.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff text is available");
	   }
	   else
	   {
		   System.out.println("Rediff txt is not available");
	   } 
	   if(rediff_txt1.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff text1 is available");
	   }
	   else
	   {
		   System.out.println("Rediff text1 is not available");
	   } 
	   if(rediff_FN.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff FN is available");
	   }
	   else
	   {
		   System.out.println("Rediff FN is not available");
	   } 
	   if(rediff_EmailID.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff emailid is available");
	   }
	   else
	   {
		   System.out.println("Rediff emaild is not available");
	   } 
	   if(rediff_EmailIDBelow.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff below email txt  is available");
	   }
	   else
	   {
		   System.out.println("Rediff below email txt is not available");
	   } 
	   if(rediff_NewPsw.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff new password option is available");
	   }
	   else
	   {
		   System.out.println("Rediff new password is not available");
	   } 
	   if(rediff_RetypePsw.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff Retype pass is available");
	   }
	   else
	   {
		   System.out.println("Rediff Retype pass is not available");
	   } 
	   if(rediff_Gender.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff gender txt is available");
	   }
	   else
	   {
		   System.out.println("Rediff gender txt is not available");
	   } 
	   if(rediff_Gender_M.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff gender male txt is available");
	   }
	   else
	   {
		   System.out.println("Rediff gender male txt is not available");
	   } 
	   if(rediff_Gender_F.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff gender female txt is available");
	   }
	   else
	   {
		   System.out.println("Rediff gender female txt is not available");
	   } 
	   if(rediff_DOB.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff DOB is available");
	   }
	   else
	   {
		   System.out.println("Rediff DOB is not available");
	   } 
	   if(rediff_DOB_Day.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff DOB day is available");
	   }
	   else
	   {
		   System.out.println("Rediff DOB day is not available");
	   } 
	   if(rediff_DOB_Month.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff DOB month is available");
	   }
	   else
	   {
		   System.out.println("Rediff DOB month is not available");
	   } 
	   if(rediff_DOB_Year.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff DOB year is available");
	   }
	   else
	   {
		   System.out.println("Rediff DOB year is not available");
	   } 
	   if(rediff_Location.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff location is available");
	   }
	   else
	   {
		   System.out.println("Rediff location is not available");
	   } 
	   if(rediff_school.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff school is available");
	   }
	   else
	   {
		   System.out.println("Rediff school is not available");
	   } 
	   if(rediff_collage.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff collage is available");
	   }
	   else
	   {
		   System.out.println("Rediff collage is not available");
	   } 
	   if(rediff_Captcha.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff Captcha is available");
	   }
	   else
	   {
		   System.out.println("Rediff Captcha is not available");
	   } 
	   if(rediff_SignUp.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff SignUp is available");
	   }
	   else
	   {
		   System.out.println("Rediff SignUp is not available");
	   } 
	   if(rediff_link1.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff link1 is available");
	   }
	   else
	   {
		   System.out.println("Rediff link1 is not available");
	   } 
	   if(rediff_link2.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff link2 is available");
	   }
	   else
	   {
		   System.out.println("Rediff link2 is not available");
	   } 
	   if(rediff_link3.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff link3 is available");
	   }
	   else
	   {
		   System.out.println("Rediff link3 is not available");
	   } 
	   if(rediff_link4.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff link4 is available");
	   }
	   else
	   {
		   System.out.println("Rediff link4 is not available");
	   } 
	   if(rediff_link5.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff link5 is available");
	   }
	   else
	   {
		   System.out.println("Rediff link5 is not available");
	   } 
	   if(rediff_link6.isDisplayed())
	   {
		   count++;
		   System.out.println("Rediff link6 is available");
	   }
	   else
	   {
		   System.out.println("Rediff link6 is not available");
	   } 
	   
	   
	   System.out.println("Total element in webpage is = " + count);
	   driver.quit();	   
	
	
	}
	
}
