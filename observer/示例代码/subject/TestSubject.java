package com.lgs.observer.subject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 测试主题，提供天气的变化
 * @author Administrator
 *
 */
public class TestSubject implements Subject {
	//保存在该主题注册的观察者
	private List<Observer>  observers  = new ArrayList<Observer>();
	//主题的天气属性
	private String weather;

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	//添加观察者到主题
	@Override
	public void addObserver( Observer observer) {
	
		observers.add(observer);
	}
	//把观察者从主题中移除
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		 pushUpdate();
	}
	
	//主题向观察者发布更新推送
	@Override
	public void pushUpdate() {
		
		Iterator<Observer >	 iterator = observers.iterator();
		while(iterator.hasNext())
		{
			Observer observer = iterator.next();
			observer.listenTSubject(this.getWeather());
		}
	}



}
