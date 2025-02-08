package com.bdd.page;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class Browser extends PageObject {

    public static boolean Start(PageObject page, String navegador) {
        boolean flag = false;
        try {
            switch (navegador.trim().toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", new File("drivers/chromedriver.exe").getAbsolutePath());

                    DesiredCapabilities ssl = DesiredCapabilities.chrome();
                    ssl.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

                    page.setDriver(new ChromeDriver(ssl));
                    flag = true;
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", new File("drivers/msedgedriver.exe").getAbsolutePath());

                    DesiredCapabilities ssl2 = DesiredCapabilities.edge();
                    ssl2.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

                    page.setDriver(new EdgeDriver(ssl2));
                    flag = true;
                    break;
                default:
                    Assert.fail("No está mapeado el navegador '" + navegador + "'");
                    flag = false;
                    break;
            }
            page.open();
            page.getDriver().manage().window().maximize();
        } catch (Exception e) {
            Assert.fail("Error al abrir el navegador '" + navegador + "'");
        }
        return flag;
    }
}
