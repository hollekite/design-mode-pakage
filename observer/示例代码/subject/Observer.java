package com.lgs.observer.subject;
/**
 * �۲��߽ӿڣ��ṩ�۲��ߴ���֮��Ͷ���������ע��ͣ���������仯������֪ͨ
 * @author Administrator
 *
 */
public interface Observer {
	//���۲��ߺ�ע����ص�����
	void linkTSubject(Subject subject);
	//�����۲��ߵı仯֪ͨ
	void listenTSubject(Object obj);
}
