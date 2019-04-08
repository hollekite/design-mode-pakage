package Observe;

/**
 * @Author: lgs
 * @Date: 2019/4/8 14:23
 * @Version 1.0
 */

/**
 * 观察者模式主题接口---用于对使用某一主题的观察者的注册和移除以及主题改变之后对观察者的通知
 */
public interface Subject {
    Observe addObserve(Observe o);   //使用某一主题的观察者注册
   Observe removeoberve(Observe o); //使用某一主题的观察者移除
    void noticeSub();  //主题改变通知观察者
}
