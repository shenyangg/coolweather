package android.coolweather.com.coolweather.db;

/**
 * Created by CM-NB1 on 2018/5/3.
 */

public class City {
    //   cityName 记录市的名字，
    //   cityCode 记录市的代号，
    //   provinceId 记录当前市所属省的 id值
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
