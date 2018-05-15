package com.lgs.observer.subject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2Subject implements Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	private int age = 100;
	
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		 pushUpdate();
	}
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void pushUpdate() {
		
		Iterator<Observer> iterator = observers.iterator();
		
		while(iterator.hasNext())
		{
			Observer observer = iterator.next();
			observer.listenTSubject(this.getAge());
		}
			
	}

	

}
