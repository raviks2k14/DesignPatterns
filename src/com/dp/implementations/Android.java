package com.dp.implementations;

import com.dp.interfaces.PhoneInterface;

public class Android implements PhoneInterface{

	@Override
	public void ram() {
		System.out.println("Android 32GB RAM");
		
	}

	@Override
	public void camera() {
		System.out.println("Android Camera");
		
	}

	@Override
	public void OS() {
		System.out.println("Android OS");
		
	}

}
