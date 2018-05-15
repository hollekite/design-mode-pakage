package com.lgs.stratagy;

import com.lgs.stratagy.protbehavor.ClothCross;
import com.lgs.stratagy.protbehavor.EatAllBehavor;
import com.lgs.stratagy.protbehavor.EatGrossBehavor;
import com.lgs.stratagy.protbehavor.GrossCross;

public class Console {
	
	public static void main(String []args)
	{
		Human human = new Human();
		human.display(new EatAllBehavor(),new ClothCross());
		
		Sheep sheep = new Sheep();
		sheep.display(new EatGrossBehavor(), new GrossCross());
		
		
		System.out.println("-----------human--------");
		human.eatPerform();
		human.corssPerform();
		human.walk();
		human.Sleep();
		System.out.println("-----------sheep--------");
		sheep.eatPerform();
		sheep.corssPerform();
		sheep.walk();
		sheep.Sleep();
		
		
	}
	

	


}
