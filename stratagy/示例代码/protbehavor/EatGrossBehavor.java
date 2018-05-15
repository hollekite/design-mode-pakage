package com.lgs.stratagy.protbehavor;

import com.lgs.stratagy.port.EatBeaveor;

public class EatGrossBehavor implements EatBeaveor {

	@Override
	public void eat() {
		System.out.println("sheep eat grass");
	}

}
