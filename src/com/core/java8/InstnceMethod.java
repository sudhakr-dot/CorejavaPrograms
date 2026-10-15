package com.core.java8;

  interface  CalculateAug {
	 public int AvgCal();
}

public class InstnceMethod {
	
	public int AvgCalculate() {
		 int []a= {10,20,30,40,12,34};
		 
		 int sum=0;
		 for(int i=0;i<a.length;i++) {
			 sum=sum+a[i];
		 }
		 return sum/a.length;
		 }
	
	public static void main(String[] args) {
		InstnceMethod c=new InstnceMethod();
		CalculateAug i= c::AvgCalculate;
		System.out.println(i.AvgCal());
		
	}
	
	

}
