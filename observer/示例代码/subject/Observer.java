package com.lgs.observer.subject;
/**
 * 观察者接口，提供观察者创建之后和对相关主题的注册和，监听主题变化的推送通知
 * @author Administrator
 *
 */
public interface Observer {
	//将观察者和注册相关的主题
	void linkTSubject(Subject subject);
	//监听观察者的变化通知
	void listenTSubject(Object obj);
}
