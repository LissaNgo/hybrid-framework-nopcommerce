package javaBasic;

import org.testng.Assert;

public class Topic_04_Operator {
	public static void main(String[] arg) {
		int number = 10;
		
		//In number ra trước:10
	    // ++= tăng number lên 1 = 11
		System.out.println(number++);
		//++ trước: tăng number lên 1 = 12
		//In number ra: 12
		System.out.println(++number);
		
		for (int i = 0; i<= 3; ++i) {
		System.out.println(i);
	}
		Assert.assertTrue(5<6);
		String address = "Ho Chi Minh";
		
		if(address != "Ha Noi" && address != "Da Nang") {
			System.out.println("Address is not the same");
			
		}
		
	// Bieu thuc tam nguyen: = ? :
		boolean status = (address == "Ha Noi") ? true : false;
		System.out.println(status);
	}
	
	
	
}

