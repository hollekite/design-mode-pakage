package com.lgs.observer.subject;


/**
 * ����ӿ�
 * @author Administrator
 *
 */
public interface Subject {
	
	//���������Ƴ���ĳ�۲���
	void removeObserver(Observer observer);
	//�������Ըı��������۲������͸ı�֪ͨ
	void pushUpdate();
	//�۲���ע��
	void addObserver(Observer observer);
	
}
