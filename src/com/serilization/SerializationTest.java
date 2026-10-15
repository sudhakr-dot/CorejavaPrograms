package com.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
	

	EmployeSerilization se=new EmployeSerilization();

	se.setId(1);
	se.setName("sudhakar");
	FileOutputStream fileout = new FileOutputStream("c:\\SerilazationDemo\\demo.ser");
	ObjectOutputStream out = new ObjectOutputStream(fileout);
	out.writeObject(se);

	fileout.close();
	out.close();
	 
	
	
	FileInputStream finput=new FileInputStream("c:\\SerilazationDemo\\demo.ser");
	
	ObjectInputStream inp= new ObjectInputStream(finput);
	
	EmployeSerilization readObject = (EmployeSerilization)inp.readObject();
	
System.out.println(readObject.getName());
finput.close();
inp.close();
	
  }
  
}
