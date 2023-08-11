package com.util;
import java.io.*;
public class characterstream {
public static void main(String[] args){
	try{
		OutputStreamWriter write=new OutputStreamWriter(new FileOutputStream("stream.txt"));
		write.write("Employee Name : Peter Sam Joes\n");
		write.write("Department : Sales  \n");
  
 
		write.write("Designation : Manager\n");

		write.write("Salary :35000");
		write.flush();
		write.close();
		InputStreamReader read=new InputStreamReader(new FileInputStream("stream.txt"));
		char [] cstr=new char[90];
		read.read(cstr);
		System.out.println(cstr);
	}
		catch(IOException e){
			System.out.println(e);

		}
	}
}

