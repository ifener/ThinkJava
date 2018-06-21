package com.wey.arrayToList;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayToList {
    
    public static void main(String[] args) {
        System.out.println(Arrays.asList(new String[] { "a", "b" }));
        
        System.out.println(Arrays.asList(new Integer[] { 1, 2 }));
        
        // 以下会得到非预期的结果
        System.out.println(Arrays.asList(new int[] { 1, 2 })); // [[I@7852e922]
        
        System.out.println(Arrays.asList(new String[] { "a", "b" }, "c")); // [[Ljava.lang.String;@4e25154f, c]
        
        // 如果你打算将一个基本类型的数组转换为所对应的封装类型的list，使用Apache Commons Lang吧，可能你的项目正在使用它，类似下面这样使用ArrayUtils.toObject：
        // D:\myCenterRepository\org\apache\commons\commons-lang3\3.6\commons-lang3-3.6.jar
        List<Integer> list = Arrays.asList(ArrayUtils.toObject(new int[] { 1, 2 }));
        System.out.println(list);
        
    }
    
}
