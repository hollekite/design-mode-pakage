package Observe;

/**
 * @Author: lgs
 * @Date: 2019/4/8 14:50
 * @Version 1.0
 *  具体的天气信息
 */

public class Weather {

    private  String temprature;
    private String himidity;

    public Weather(String temprature ,String himidity ){
        this.temprature = temprature;
        this.himidity = himidity;
    }


    public String getTemprature() {
        return temprature;
    }

    public void setTemprature(String temprature) {
        this.temprature = temprature;
    }

    public String getHimidity() {
        return himidity;
    }

    public void setHimidity(String himidity) {
        this.himidity = himidity;
    }

}
