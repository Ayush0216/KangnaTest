package com.stage.execution;

import org.openqa.selenium.WebDriver;


import com.stage.pagemodels.Homepage;
import com.stage.runners.LaunchBrowser;
import com.stage.runners.common;

public class Execution1 { 
	

		static WebDriver driver;

		
		public static void main(String[] args) {
			LaunchBrowser launch =  new LaunchBrowser();
		//	Homepage home= new Homepage();
			common common = new common();
		//	launch.Launch();
			//driver.manage().window().maximize();
			//com.stage.runners.common.clickJS(Homepage.getSearchButton(), driver);
			//com.stage.runners.common.setText(Homepage.getTextBox(), "1220", driver);
			

//			home.getSearchButton();
//			common.setText(Homepage.getTextBox(), "1220", driver);
			
			//common.clickVisibleWidget(driver, "//*[contains(@title,'Contact')]");
			

		}


}
