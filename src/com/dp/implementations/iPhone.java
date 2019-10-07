package com.dp.implementations;

import com.dp.interfaces.PhoneInterface;

public class iPhone implements PhoneInterface {

	@Override
	public void ram() {
		System.out.println("iPhone 8GB RAM");

	}

	@Override
	public void camera() {
		System.out.println("iPhone Camera");

	}

	@Override
	public void OS() {
		System.out.println("iPhone OS");

	}

}
