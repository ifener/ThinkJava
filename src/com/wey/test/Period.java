package com.wey.test;

public final class Period {
    
    public static void main(String[] args) {
        Period p = new Period(10L);
        System.out.println(p.id);
    }
    
    public final Long id;
    
    Period(Long id) {
        this.id = id;
    }
}
