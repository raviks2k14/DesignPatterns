package com.dp.implementations;

import com.dp.interfaces.PhoneInterface;

public class Windows implements PhoneInterface{

	@Override
	public void ram() {
		System.out.println("Windows 16GB RAM");
		
	}

	@Override
	public void camera() {
		System.out.println("Windows Camera");
		
	}

	@Override
	public void OS() {
		System.out.println("Windows OS");
		
	}

}
