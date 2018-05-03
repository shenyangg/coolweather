package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by CM-NB1 on 2018/5/3.
 */

public class County extends DataSupport{
    //  countyName 记录县的名字，
    //  weatherId 记录县所对应的天气 id，
    //  cityId 记录当前县所属市的 id值
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
