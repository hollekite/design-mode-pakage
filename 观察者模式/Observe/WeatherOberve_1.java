package Observe;

/**
 * @Author: lgs
 * @Date: 2019/4/8 14:55
 * @Version 1.0
 */
public class WeatherOberve_1 implements Observe {
    Weather  weather;
    @Override
    public void update(Object obj) {
        this.weather = (Weather)obj;
        display();
    }

    public void display(){
        System.out.println(" today tempratue is : "+weather.getTemprature());
        System.out.println(" today himidaity is : "+weather.getHimidity());
    }
}
