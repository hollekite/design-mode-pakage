package com.lgs.observer.subject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * �������⣬�ṩ�����ı仯
 * @author Administrator
 *
 */
public class TestSubject implements Subject {
	//�����ڸ�����ע��Ĺ۲���
	private List<Observer>  observers  = new ArrayList<Observer>();
	//�������������
	private String weather;

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	//��ӹ۲��ߵ�����
	@Override
	public void addObserver( Observer observer) {
	
		observers.add(observer);
	}
	//�ѹ۲��ߴ��������Ƴ�
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		 pushUpdate();
	}
	
	//������۲��߷�����������
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
