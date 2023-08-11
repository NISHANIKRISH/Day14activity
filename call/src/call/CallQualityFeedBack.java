package call;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class CallQualityFeedBack  {
    ArrayList<details> itemList=new ArrayList<>();
    CallQualityFeedBack(){
    	itemList.add(new details(1,"987553345","good",4));
    	itemList.add(new details(2,"977553345","average",3));
    	itemList.add(new details(3,"967553345","excellent",5));
    	itemList.add(new details(4,"997553345","not bad",2));

    }
    public  void evaluateFeedBack(Consumer<details> c) {
for(details i:itemList){
	c.accept(i);
	}
}
    public  void predicatequality(Predicate<details> c) {
    	for(details i:itemList){
    		if(c.test(i)){
    			System.out.println("quality is good");
    		}
    		else{
    			System.out.println("quality is bad");
	
    		}
    		}
    	}

    public static void main(String[] args) {
    	CallQualityFeedBack obj=new CallQualityFeedBack();
    
		obj.evaluateFeedBack((c)->System.out.println(c));

		obj.predicatequality((c) -> c.getRating()>3);
        
    }
}