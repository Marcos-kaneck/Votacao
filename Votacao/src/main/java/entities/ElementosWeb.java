/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author User
 */
public class ElementosWeb {

    static ChromeOptions chromeOptions = new ChromeOptions();
    static WebDriver driver = new ChromeDriver(chromeOptions);
    private WebElement mensagemAprocurar;
    private WebElement localVoto;

    
    public WebElement getMensagemAprocurar() {
        return mensagemAprocurar;
    }

    public void setMensagemAprocurar(WebElement mensagemAprocurar) {
        this.mensagemAprocurar = mensagemAprocurar;
    }

    public WebElement getLocalVoto() {
        return localVoto;
    }

    public void setLocalVoto(WebElement localVoto) {
        this.localVoto = localVoto;
    }

    public void votacaoPagina() {
        driver.get("https://esporterondonia.wixsite.com/my-site/post/esporte-rondônia-realiza-a-seleção-do-rondoniense-2023?fbclid=PAAaZE-0Ys6vwB8dn_u9y8VZdPpF6CrxUj5S5jqHUHqwlPjvDhylMmqXQbiK8");
        this.mensagemAprocurar = driver.findElement(By.cssSelector("#viewer-557sc > div > div > div:nth-child(2) > p > span"));
        this.mensagemAprocurar.sendKeys(Keys.PAGE_DOWN);
        this.localVoto = driver.findElement(By.cssSelector("#viewer-557sc > div > div > ul > li:nth-child(1) > div._13DYo._2Z8GH._2KoHR._26WWd > div._3sdYF"));
        this.localVoto.click();
    }
}
