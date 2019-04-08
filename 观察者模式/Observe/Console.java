package Observe;

/**
 * @Author: lgs
 * @Date: 2019/4/8 15:04
 * @Version 1.0
 */
public class Console {
    public static void main(String[] args) {
        Weather weather = new Weather("30","55");
        Observe obs1 = new WeatherOberve_1();
        Observe obs2 = new WeatherObserve_2();
        WeatherSubject sub = new WeatherSubject(weather);

        sub.addObserve(obs1);
        sub.addObserve(obs2);
        sub.noticeSub();

        weather.setTemprature("999");
        sub.setWeather(weather);
        sub.removeoberve(obs2);
        sub.noticeSub();

    }
}
