package com.learning.basic;
import java.util.Scanner;

public class StaticExample {
	public static void main(String args[]){
	
	ObjectExample obj1 = new ObjectExample();
	ObjectExample obj2 = new ObjectExample();
	System.out.println("obj1 values are:" +obj1.a+ "and " +obj1.b);
	System.out.println("obj2 values are:" +obj2.a+ "and " +obj2.b);
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enetr the new no. for a:");
	obj1.a=sc.nextInt();
	System.out.println("Enetr the new no. for b:");
	obj1.b=sc.nextInt();

	System.out.println("New obj1 values are:" +obj1.a+ " and " +obj1.b);
	System.out.println("New obj2 values are:" +obj2.a+ " and " +obj2.b);
	//so here static means change in one object will reflect/change  every where for all the  object
	//here i changed in object1 but because value of b is static so change in one object reflect
	//in all the object


	
	}
}

/**import java.util.Scanner;

import com.learning.basic.*;

public class StaticExample {
	public static void main(String[] args) {
		ObjectExample o1= new ObjectExample();
		ObjectExample o2= new ObjectExample();
		
		System.out.println("o1 values are "+o1.a+ " and"+o1.b);
		System.out.println("o2 values are "+o2.a+ "and "+o2.b);
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the new number for a");
		o1.a=s.nextInt();
		System.out.println("enter the new number for b");

		o1.b=s.nextInt();
		System.out.println("New o1 values are "+o1.a+" "+o1.b);
		System.out.println("New o2 values are "+o2.a+" "+o2.b);
		
	}

}
**/
