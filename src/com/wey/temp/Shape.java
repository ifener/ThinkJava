package com.wey.temp;

import java.sql.Timestamp;

public class Shape implements Cloneable {
    
    private Long id;
    private Timestamp time;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Timestamp getTime() {
        return time;
    }
    
    public void setTime(Timestamp time) {
        this.time = time;
    }
    
    @Override
    protected Shape clone() throws CloneNotSupportedException {
        
        return (Shape) super.clone();
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + "=" + time;
    }
    
}
