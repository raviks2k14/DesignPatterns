package com.dp.client;

import com.dp.factory.ObjectFactory;
import com.dp.interfaces.PhoneInterface;

public class ClientClass {

	public static void main(String[] args) {
		//ObjectFactory provides the objects here. This client need not worry about the 
		//configurations to be sent for getting specific object
		PhoneInterface phone = ObjectFactory.getPhone("iphone");
		phone.ram();
		phone.camera();
		phone.OS();
	}

}
