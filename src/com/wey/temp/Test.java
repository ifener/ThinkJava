package com.wey.temp;

import java.sql.Timestamp;

public class Test {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(null instanceof Shape);
        Shape shape = new Shape();
        shape.setId(10L);
        shape.setTime(new Timestamp(System.currentTimeMillis()));
        
        System.out.println(shape);
        Shape clone = shape.clone();
        
    }
    
}
