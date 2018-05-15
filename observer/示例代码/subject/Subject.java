package com.lgs.observer.subject;


/**
 * 主题接口
 * @author Administrator
 *
 */
public interface Subject {
	
	//从主题中移除，某观察者
	void removeObserver(Observer observer);
	//主题属性改变后，主题像观察者推送改变通知
	void pushUpdate();
	//观察者注册
	void addObserver(Observer observer);
	
}
