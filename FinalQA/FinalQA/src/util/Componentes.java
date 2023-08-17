package util;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Componentes {

    private WebDriver driver;

    public void inicializa() {
        String chromedriver = System.getProperty("user.dir") + "/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/Driver/componentes.html");
    }

    public void acessarGoogle() {
        driver.get("https://www.google.com.br");
    }

    public void pesquisarEmpresa() {
        driver.findElement(By.name("q")).sendKeys("Rockstar Games");
    }

    public void clicarEnter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    public void resultadoPesquisa() {
        driver.findElement(By.id("res")).isDisplayed();
        Assert.assertTrue(driver.getTitle().contains("Rockstar Games"));
    }

    public void acessarSite(){
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a")).click();
    }

    public void fecharNavegador() {
        driver.quit();
    }

    public void informarCadastro(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Matheus");
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Barboza");
        driver.findElement(By.id("elementosForm:sexo:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
        new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Superior");
        new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Karate");
        driver.findElement(By.id("elementosForm:cadastrar")).click();
        Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastro Realizado!"));
        Assert.assertTrue(driver.findElement(By.id("descNome")).getText().endsWith("Matheus!"));
        Assert.assertEquals("Sobrenome: Barboza", driver.findElement(By.id("descSobrenome")).getText());
        Assert.assertEquals("Sexo: Masculino", driver.findElement(By.id("descSexo")).getText());
        Assert.assertEquals("Comida: Pizza", driver.findElement(By.id("descComida")).getText());
        Assert.assertEquals("Escolaridade: superior", driver.findElement(By.id("descEscolaridade")).getText());
        Assert.assertEquals("Esportes: Karate", driver.findElement(By.id("descEsportes")).getText());
    }

    public void botaoCadastrar(){
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    //Regra de Negocio

    public void validRegra1(){
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }
    public void alertaRegra1(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Nome e obrigatorio", alert.getText());

    }
    public void validRegra2(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Matheus");
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }

    public void alertaRegra2(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Sobrenome e obrigatorio", alert.getText());
    }

    public void validRegra3(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Matheus");
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Barboza");
        driver.findElement(By.id("elementosForm:cadastrar")).click();
    }
    public void alertaRegra3(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Sexo e obrigatorio", alert.getText());
    }
    public void botaoConfirma(){
        driver.findElement(By.id("confirm")).click();
    }
    public void alertaConfirma(){
        driver.findElement(By.id("confirm")).click();
        Alert aviso = driver.switchTo().alert();
        Assert.assertEquals("Confirm Simples", aviso.getText());
        aviso.accept();
        Assert.assertEquals("Confirmado", aviso.getText());
        aviso.accept();

        driver.findElement(By.id("confirm")).click();
        Alert aviso2 = driver.switchTo().alert();
        Assert.assertEquals("Confirm Simples", aviso2.getText());
        aviso2.dismiss();
        Assert.assertEquals("Negado", aviso2.getText());
        aviso2.dismiss();
    }

}


