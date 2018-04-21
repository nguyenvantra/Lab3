package com.example.services;

import com.example.model.Phone;

public class PhoneService {
	private static final int YEAR_OF_MANUFACTURE = 2018;

	public String showInfo(Phone phone) {
		return phone.getYearOfManufacture() < YEAR_OF_MANUFACTURE ? displayMessage("old phone", phone)
				: displayMessage("new phone", phone);
	}

	public double costOfWearAndTear(Phone phone) {
		return 0.0;
	}

	private String displayMessage(String message, Phone phone) {
		return String.format("%s-%s", phone.toString(), message);
	}
}
