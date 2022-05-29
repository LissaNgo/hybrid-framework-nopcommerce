package com.notcommerce.user;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class User_01_Register_Login {
	//Toàn cục:
	@BeforeClass
	public void beforeClass() {
	}

	@Test
	public void TC_01() {
		//Cục bộ: Sử dụng trong phạm vi testcase/ hàm
		String homePageUrl="";
		System.out.println(homePageUrl);
		
		//Block cod
		if(3<5) {
			//Cục bộ
			String homePageTitle="";
			System.out.println(homePageTitle);
			
		}
	}

	@Test
	public void TC_02() {
	}

	@AfterClass
	public void afterClass() {
	}

}
