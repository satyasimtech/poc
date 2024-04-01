package com.example.java8.controller;

import java.util.ArrayList;

public class Test2 {

		
		public static void main(String[] args) {
			/*
			 * ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>(); solve(
			 * A);
			 */
			
//			String A="hello";
//			char[] B=A.toCharArray();
//			B.toString()
			
			ArrayList<Integer> A = new ArrayList<Integer>();
			A.add(46);
			A.add(10);
			A.add(15);
			A.add(44);
			A.add(45);
			
			System.out.println(">>>>>>>>>>>>>>>>......   "+solve1(A, 1, 22));
		}
		
		
		public static int solve1(ArrayList<Integer> A, int B, int C) {
	        
	        long sum=0;
	        int i=0;
	        for( ;i<B;i++){
	            sum+=A.get(i); 
	        }
	        if((sum/B)<C) return 1;
	        for( i=B;i<A.size();i++){
	            
	            sum=sum-A.get(i-B)+A.get(i);
	            if((sum)/B<C) return 1;
	        }
	        
	        
	        return 0;
	    }
		
		
	    public static  ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {


	        for(int i=1;i<A.size();i++){
	            for(int j=1;j<A.get(i).size();j++){
	                if(A.get(i).get(j)==0){
	                   A.get(0).set(j, 0);
	                   A.get(i).set(0, 0); 
	                }
	            }
	        }

	       
	       for(int i=0;i<A.get(0).size();i++){
	          if(A.get(0).get(i)==0){
	              makeColumnZero(A, i);
	          }
	       }

	       for(int i=0;i<A.size();i++){
	          if(A.get(i).get(0)==0){
	              makeRowZero(A, i);
	          }
	       }

	       return A;

	    }


	    public static void makeColumnZero(ArrayList<ArrayList<Integer>> A, int col){     
	            for(int i=1;i<A.size();i++){
	                A.get(i).set(col, 0);
	            }
	         
	    }

	    public static void makeRowZero(ArrayList<ArrayList<Integer>> A, int row){
	         for(int i=1;i<A.get(row).size();i++){
	                A.get(row).set(i, 0);
	            }
	    }

}
