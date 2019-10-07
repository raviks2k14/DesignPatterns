package com.dp.factory;

import com.dp.implementations.*;
import com.dp.interfaces.PhoneInterface;

public class ObjectFactory {

	public static PhoneInterface getPhone(String OS) {

		if (OS.equals("windows")) {
			return new Windows();
		} else if (OS.equals("iphone")) {
			return new iPhone();
		} else {
			return new Android();
		}
	}
}
