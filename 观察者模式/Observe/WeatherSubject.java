package Observe;

/**
 * @Author: lgs
 * @Date: 2019/4/8 14:34
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的天气发布主题--提供气温和湿度的发布并通知订阅者
 */
public class WeatherSubject  implements Subject {

    private List<Observe> obs = new ArrayList<>();
    private Weather weather;

    public WeatherSubject(Weather weather){
        this.weather = weather;
    }


    @Override
    public Observe addObserve(Observe o) {
        if( o == null)   return null;
        if(o instanceof  Observe){
            obs.add(o);
            return o;
        }
        return null;
    }

    @Override
    public Observe removeoberve(Observe o) {
        if( o == null)   return null;
        if((o instanceof  Observe)&& obs.contains(o)  ){
            obs.remove(o);
            return o;
        }
        return null;
    }
    @Override
    public   void noticeSub() {
        for(Observe o:obs){
            o.update(this.weather);
        }
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
        change();
    }
    private void change(){
        noticeSub();
    }
}
