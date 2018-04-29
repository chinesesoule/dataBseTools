package com.databse.core.cache;


import javax.validation.constraints.NotNull;
import java.util.Date;

public class CacheEntity {

    @NotNull
    private Object key;

    private Object value;

    @NotNull
    private Date updateDate;

    private Integer count;

    @Override
    public String toString() {
        return "[key:"+key+",value:"+value+",updateDate:"+updateDate+"]";
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
