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
	
	/*
	 * 	1. Factory design pattern provides approach to code for interface rather than implementation.
		2. Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
		3. Factory pattern provides abstraction between implementation and client classes through inheritance.
	 *
	 */

}
