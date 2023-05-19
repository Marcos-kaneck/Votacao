/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author User
 */
public class ElementosWeb {

    static ChromeOptions chromeOptions = new ChromeOptions();
    static WebDriver driver = new ChromeDriver(chromeOptions);

    private WebElement localVoto;

    public WebElement getLocalVoto() {
        return localVoto;
    }

    public void setLocalVoto(WebElement localVoto) {
        this.localVoto = localVoto;
    }

    public void votacaoPagina() {
        
        try{
        driver.get("https://esporterondonia.wixsite.com/my-site/post/esporte-rondônia-realiza-a-seleção-do-rondoniense-2023?fbclid=PAAaZE-0Ys6vwB8dn_u9y8VZdPpF6CrxUj5S5jqHUHqwlPjvDhylMmqXQbiK8");
        localVoto = driver.findElement(By.cssSelector("#viewer-557sc > div > div > ul > li:nth-child(3) > div > div._3sdYF"));
        driver.wait(5000);
        new Actions(driver).click(localVoto).perform();
        }catch(InterruptedException e){
            
        }
    }
}
