package com.complietime;

class Addoverload
{
	void add(int i, int j)
	{
		int s;
		s=i+j;
		System.out.println("The Sum of" +i+ "and" +j+ "is:"+s);
	}
	void add(float i, float j)
	{
		float s;
		s=i+j;
		System.out.println("The Sum of" +i+ "and" +j+ "is:"+s);
	}
	void add(double i, double j)
	{
		double s;
		s=i+j;
		System.out.println("The Sum of" +i+ "and" +j+ "is:"+s);
	}
}
public class MainApp {

	public static void main(String[] args) 
	{
		Addoverload ao=new Addoverload();
		ao.add(2, 2);
		ao.add(2.5f, 4.5f);
		ao.add(72.5, 85.5);

	}

}
