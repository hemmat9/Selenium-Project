package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class examplePagination {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
        driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']")).click();
        //List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));//if we are puttin it inside the while loop we should remove it from here coz it is a reassingnig
        //find for id 26335A
        //find next button
       // WebElement nxtBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));

        //iterate through the list and look for the required id 26335A
        //declare a boolean that will be a flag to control the refilling of our list with new
        //enteries of the next page until we have found the desired row or entry

        boolean notfound = true;
        while (notfound) {
            //relocate the rows after the page is refreshed to avoid stale element exception
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (int i = 0; i < tableRows.size(); i++) {
                //get the text out of the webElement in list
                String text = tableRows.get(i).getText();
                // check if the row contains the id we are looking for
                if (text.contains("26335A")) {
                    System.out.println("The index of 2633A is: "+i);
                    String xpath = "//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td/input";
                  WebElement checkBox=  driver.findElement(By.xpath(xpath));//we have to make our x.path dynamic by adding ["+(i+1)+"] with our "tr".
                    checkBox.click();
                    notfound=false;//we have to put our boolean inside the if condition once it is found we have to break the loop.
                    break;
                }
            }
            //but only click on next if you still not found the required id
            if(notfound) {
                WebElement nxtBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nxtBtn.click();//the code ends with out finding the required Id, that is why we need to declare a boolean befor the forloop

            }

        }

    }
}
//check the checkbox associated with the id