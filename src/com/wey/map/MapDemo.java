package com.wey.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wey.cloneable.Fruit;
import com.wey.cloneable.Orange;
import com.wey.cloneable.Pear;

public class MapDemo {
    
    // 实例化MAP时，默认大小给16
    public static Map<String, List<? extends Fruit>> maps = new HashMap<String, List<? extends Fruit>>(16);
    static {
        maps.put("a", Arrays.asList(new Orange(), new Pear()));
        maps.put("b", Arrays.asList(new Orange(), new Pear(), new Pear()));
        
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(maps.keySet());
        for (String key : maps.keySet()) {
            for (Fruit f : maps.get(key)) {
                if (f instanceof Orange) {
                    System.out.println(f);
                }
            }
        }
        
    }
    
}
