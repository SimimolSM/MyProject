package com.ust;


class Student{  
	 int id;  
	 String name;  
	}  

public class ObjectByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();  
		  s1.id=101;  
		  s1.name="Sonoo";  
		  System.out.println(s1.id+" "+s1.name);//printing members with a white space  

	}

}
