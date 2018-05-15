package com.lgs.observer.subject;

public class CellPhone implements Observer {
	
		private String Weather = "white";
	
	public String getWeather() {
		return Weather;
	}

	public void setWeather(String weather) {
		this.Weather = weather;
	}

	@Override
	public void linkTSubject(Subject subject) {
		subject.addObserver(this);
	}
	public void display() {
		System.out.println("the weather of cellphone is :"+this.Weather);
	}

	@Override
	public void listenTSubject(Object obj) {
		 setWeather((String)obj);
	}

}
