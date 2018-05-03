package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by CM-NB1 on 2018/5/3.
 */

public class Province extends DataSupport{
    //  id 是每个实体类中都应该有的字段，
    // provinceName 记录省的名字，
    // provinceCode
    //  记录省的代号
    private int id;
    private String provinceName;
    private int provinceCode;

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}


