package lambaexample;

	interface Area 
	{
	    void calculateArea(int sides);
	}

	public class shape
	{ 
	    public void calculate(Area area) {
	        area.calculateArea(4); 
	    }
	    
	    public static void main(String[] args) {
	        shape shape = new shape();
	        
	        
	        shape.calculate(new Area() {
	            public void calculateArea(int sides) {
	                
	                System.out.println("Calculating area: " + sides*sides);
	            }});
	    }
	}

