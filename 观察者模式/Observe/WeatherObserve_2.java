package Observe;

/**
 * @Author: lgs
 * @Date: 2019/4/8 14:58
 * @Version 1.0
 */
public class WeatherObserve_2 implements Observe {
    Weather  weather;
    @Override
    public void update(Object obj) {
        this.weather = (Weather)obj;
        display();
    }

    public void display(){
        System.out.println("  今天的气温是 : "+weather.getTemprature());
        System.out.println(" 今天的湿度是 : "+weather.getHimidity());
    }

}
