package com.byteapp;

import java.io.*;
public class BugDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream in=System.in;
		try {
			byte[] bt1=new byte[20];
			byte[] bt2=new byte[5];
			byte[] bt3=new byte[20];

			System.out.println("Enter developer name");
			in.read(bt1);
			System.out.println("Enter bug no");
			in.read(bt2);
			System.out.println("Enter bug desc");
			in.read(bt3);


			
			FileOutputStream fs=new FileOutputStream("buginfo.dat");
			String str1=new String(bt1);
			String str2=new String(bt2);
			String str3=new String(bt3);

			byte[] b1=str1.getBytes();
			byte[] b2=str2.getBytes();
			byte[] b3=str3.getBytes();

			
			fs.write(b1);
			fs.write(b2);
			fs.write(b3);

			fs.flush();
			fs.close();
			
		}
		catch(IOException ex)
		{
			System.out.print("IO error "+ex);
		}
	}

}
