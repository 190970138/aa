package com;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class B implements A{
	private static int a;
	public B(){
		System.out.println("b");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		B b =  new B ();
		System.out.println(++a);
//		 DataInputStream dataInputStream  = new DataInputStream(new BufferedInputStream(new FileInputStream("D:/a.dat")));
////		 FileInputStream fileInputStream =new FileInputStream("D:/a.dat");
//		 System.out.println(dataInputStream);
		 
		 
		 
//		 int i =0;
//		 int j =-1;
//		 switch (i) {
//		case 0:
//			j=1;
//		case 2:
//			j=2;
//		}
//		 System.out.println(j);
	}
}