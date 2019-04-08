package Observe;

/**
 * @Author: lgs
 * @Date: 2019/4/8 14:25
 * @Version 1.0
 */

/**
 * 观察者模式观察者接口---update方法是主题改变是通知观察者时调用的方法，观察者和主题的关联由该方法体现
 */
public interface Observe {
    void update(Object obj);
}
