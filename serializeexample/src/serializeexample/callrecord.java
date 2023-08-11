package serializeexample;
import java.io.*;

public class callrecord {
	
	

		public void saveCall(callquality callquality)
		{
			 try {
			FileOutputStream fileout=new FileOutputStream(callquality.getcustomerName()+".dat");
			 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
			 objectout.writeObject(callquality);
			 objectout.flush();
			 objectout.close();
			 }
			 catch(FileNotFoundException e)
			 {
				 System.out.println(e);
			 }
			 catch(IOException e1)
			 {
				 System.out.println(e1);
			 }
		}
		public void displayCustomer(String name)
		{
			
			try {
				FileInputStream filein =new FileInputStream(name+".dat");
				ObjectInputStream objectin=new ObjectInputStream(filein);
				callquality callquality =(callquality)objectin.readObject();
				
				System.out.println("CallId "+callquality.getcallId());
				System.out.println("callDuration "+callquality.getcallDuration());
				System.out.println("callQualityGrade "+callquality.getcallQualityGrade());

				System.out.println("customerName "+callquality.getcustomerName());

			}
			catch(FileNotFoundException e1)
			{
				System.out.println(e1);
			}
			catch(IOException e2)
			{
				System.out.println(e2);
			}
			catch(ClassNotFoundException e)
			{
				System.out.println(e);
			}
			
			
			
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	callquality obj1=new callquality(101,35,"avg","Peter");

	callrecord records=new callrecord();

	records.saveCall(obj1);
	records.displayCustomer(obj1.getcustomerName());



		}

	}


