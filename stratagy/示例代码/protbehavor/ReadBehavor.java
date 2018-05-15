package com.lgs.stratagy.protbehavor;

import com.lgs.stratagy.port.Read;

public class ReadBehavor implements Read {

	@Override
	public void read() {
	 System.out.println("people read book");
	}

}
