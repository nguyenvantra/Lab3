package com.example;

import com.example.model.Phone;
import com.example.services.PhoneService;

public class Main {
	
	public static void main(String[] args) {
		Phone samsung = new Phone("SamSung", "Android", 550.0, 2016, 2);
		Phone iphone = new Phone("Iphone", "IOS", 900.0, 2018, 1);
		
		PhoneService mPhoneService = new PhoneService();
		System.out.println(mPhoneService.showInfo(samsung));
		System.out.println(mPhoneService.showInfo(iphone));
	}
}
