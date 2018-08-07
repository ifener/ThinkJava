package com.wey.effective.java;

public enum Fruit {
    Apple("Apple", "Red") {
        
        @Override
        String getFruitColor() {
            return this.getColor();
        }
        
    },
    Orange("Orange", "Orange") {
        
        @Override
        String getFruitColor() {
            return this.getColor();
        }
        
    },
    Pear("Pear", "Yellow") {
        
        @Override
        String getFruitColor() {
            return this.getColor();
        }
        
    };
    
    private String name;
    private String color;
    
    Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    abstract String getFruitColor();
    
    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }
    
}
