package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calenderWithPagination {
    public static String url = "https://www.sastaticket.pk/";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//        locate the element calender and click on it
        WebElement calender = driver.findElement(By.xpath("(//span[@class='dt_label'])[1]"));
        calender.click();
//        locate the current month and year
        WebElement currentMonth = driver.findElement(By.xpath("(//div[@class='react-datepicker__current-month'])[1]"));
//      print the current month
        System.out.println(currentMonth.getText());

//        locate the next button
        WebElement nxtBtn = driver.findElement(By.xpath("//button[text()='Next Month']"));


//        loop through month till we reach our desried month
        boolean notFound=true;
        while(notFound){
            if(currentMonth.getText().equalsIgnoreCase("July 2022")){
                System.out.println(currentMonth.getText());
                notFound=false;

//                select the date
                List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='react-datepicker__month'])[1]/div/div"));
//                loop throught the dates
                for(WebElement date :dates){
                    String dateText = date.getText();
                    if(dateText.equalsIgnoreCase("15")){
                        date.click();
                        break;
                    }

                }

            }
            else{
                nxtBtn.click();
            }

        }


    }
}
