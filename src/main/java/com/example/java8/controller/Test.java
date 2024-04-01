package com.example.java8.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> A=new ArrayList<>();
		A.add(1);
		A.add(1);
		A.add(2);
//		A.add(1);
//		A.add(2);
//		A.add(2);

		int num=majorityElement(A);
		System.out.println("majNUm   ==  "+num);
	}
	
	 // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int majorityElement(final List<Integer> A) {

        Map<Integer, Integer> majNum=new HashMap<Integer, Integer>();
        
        
         A.set(0, 1);
        for(Integer num:A){
            if(majNum.containsKey(num)){
                majNum.put(num, majNum.get(num)+1);
            }else {
                majNum.put(num, 1);
            }
        }

        int value=0; 
       if(majNum.size()>0){
         for(Integer key: majNum.keySet()){
        	 value=majNum.get(key);
            if(value>=((A.size()/2)+1)){
                return key;
            }
        }
       }
        

        return -1;
    }
}
