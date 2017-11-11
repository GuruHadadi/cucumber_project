import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

environments {

    firefox {
        System.setProperty("webdriver.firefox.bin", "/Users/guru/Downloads/firefox-sdk/bin/firefox");
        driver = { new FirefoxDriver() }
    }

    chrome {
        System.setProperty("webdriver.chrome.driver", "/Users/guru/Documents/Projects/Freelancing/Proposals/Cucu_Sel_Gro/CucumberSel/src/test/resources/chromedriver");
        driver = { new ChromeDriver() }
    }

}

baseUrl = "https://developer.salesforce.com/signup"

baseNavigatorWaiting = true
atCheckWaiting = true