package interview_questions;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class Largest_number_using_set_of_numbers {
	public static void main(String[] args) {
		
		 Vector<String> arr = new Vector<>();
	     
		 //output should be 6054854654
	     arr.add("54");
	     arr.add("546");
	     arr.add("548");
	     arr.add("60");
	     printLargest(arr);
	}

	static void printLargest(Vector<String> arr){
	     // TODO Auto-generated method stub
		
		Iterator itr2 = arr.iterator();
		while(itr2.hasNext()){
			System.out.print(itr2.next()+" ");
		}
		System.out.println();
		
		//softing started
		
		Collections.sort(arr,new Comparator<String>(){
			
			 // A comparison function which is used by 
	        // sort() in printLargest()
	        @Override
	        public int compare(String X, String Y){
	        	String XY = X+Y;
	        	String YX= Y+X;
	        	return XY.compareTo(YX)>0 ? -1 :1;
	        }
		});
		
		Iterator itr = arr.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next());
		}
	}
}
