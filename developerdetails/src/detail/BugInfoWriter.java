package detail;

import java.io.*;
import java.util.Scanner;
public class BugInfoWriter {
    public static void main(String[] args) {
        try {
        	FileOutputStream fs=new FileOutputStream("buginfo");
        	Scanner sc=new Scanner(System.in);
            System.out.println("enter username");
            String name=sc.nextLine();

    		byte[] bt=name.getBytes();
    		fs.write(bt);
    		fs.flush();
    		fs.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
