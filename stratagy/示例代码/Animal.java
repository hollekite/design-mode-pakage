package com.lgs.stratagy;

import com.lgs.stratagy.port.CrossBehavor;
import com.lgs.stratagy.port.EatBeaveor;
import com.lgs.stratagy.protbehavor.ClothCross;
import com.lgs.stratagy.protbehavor.EatAllBehavor;

public abstract class Animal {
	
	private EatBeaveor eat_beaveor1 = null;
	private CrossBehavor cross_beaveor = null;
	
	public void Sleep()
	{
		System.out.println("ainimal all sleep!");
	}
	
	public abstract void walk();
	
	public void display(Object obj1,Object obj2 )
	{
		eat_beaveor1 = (EatBeaveor)obj1;
		cross_beaveor = (CrossBehavor)obj2;
	}
	
	public void eatPerform() {
		eat_beaveor1.eat();
		
	}
	public  void corssPerform() {
		cross_beaveor.cross();
	}
}
