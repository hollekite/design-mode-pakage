package com.lgs.observer.subject;

public class Human implements Observer {

	private int age = 0;
	private String weather = "raining";
	
	@Override
	public void linkTSubject(Subject subject) {
		
		subject.addObserver(this);	
	}

	@Override
	public void listenTSubject(Object obj) {
		if(obj instanceof Integer) {
			this.age = (int)obj;
		}else if(obj instanceof String)
		{
			this.weather = (String)obj;
		}
	
	}
	
	public void liveing()
	{
		System.out.println("human max live age is :"+this.age+" and today weather is :"+this.weather);
	}
	
}
