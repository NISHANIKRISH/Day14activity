package detail;


	import java.io.*;

	public class bufferdemo {
	    public static void main(String[] args) {
	        
	        	try {
	        		FileOutputStream fs=new FileOutputStream("bufferdata.txt");
		        	BufferedOutputStream bufferout=new BufferedOutputStream(fs);
		        	
	    			
	    			bufferout.write("Devname:Nishani\n".getBytes());
	    			bufferout.write("bugno:101\n".getBytes());

	    			bufferout.write("bugdesc:error".getBytes());

	    			
		        	bufferout.flush();
		        	bufferout.close();
	        		
	        		FileInputStream fin=new FileInputStream("bufferdata.txt");
		        	BufferedInputStream bufferin=new BufferedInputStream(fin);
		    		byte[] bt=new byte[bufferin.available()];
		    		bufferin.read(bt);
		  System.out.println(new String(bt));
		    		
	        	
	        
	        } catch (IOException e) {
	    		System.out.println(e);

	        }
	    }
	}


