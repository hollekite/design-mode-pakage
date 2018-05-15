package com.lgs.observer.subject;

public class ObserverConsole {
	
	public static void main(String [] args)
	{
		TestSubject subject = new TestSubject();
		CellPhone observer = new CellPhone();
		observer.linkTSubject(subject);
		subject.setWeather("raing");
		subject.pushUpdate();
		observer.display();
		subject.setWeather("cloudy");
		subject.pushUpdate();
		observer.display();
		subject.removeObserver(observer);
		subject.setWeather("windy");
		subject.pushUpdate();
		observer.display();
		subject.addObserver(observer);
		subject.setWeather("huhuhaha");
		subject.pushUpdate();
		observer.display();
		
		System.out.println("--------------------");
		Test2Subject subject2 = new Test2Subject();
		Human human = new Human();
		
		human.linkTSubject(subject);
		human.linkTSubject(subject2);
		subject.setWeather("holle world");
		subject.pushUpdate();
		subject2.setAge(999);
		subject2.pushUpdate();
		human.liveing();
		observer.display();
		
		
	}
}
