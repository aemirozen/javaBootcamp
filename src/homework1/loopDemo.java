package homework1;

public class loopDemo {

	 public static void main(String[] args) {
	        //for
	        for(int i=1;i<10;i+=2) { //i++ i'iy birer birer artt�r demek
	            System.out.println(i);

	        }
	        System.out.println("For D�ng�s� Bitti");

	        int i=1;
	        //while 
	        while(i<10) {
	            System.out.println(i);
	            i+=2;
	        }
	        System.out.println("While D�ng�s� Bitti");
	        
	        //Do-While
	        
	        int j = 100;
	        do {
	        	System.out.println(j);
	        	j+=2;
	        } while(j<10);
	        System.out.println("Do-While D�ng�s� Bitti");
	    }

	


}
