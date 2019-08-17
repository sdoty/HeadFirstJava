public class MyNextApp {
    public static void main (String[] args) {
	
        int roll = (int) (Math.random() * 7);

	if (roll == 0) {
	   roll = (int)(Math.random() * 7);  
           System.out.println("Please roll again.");
	 } else {
           System.out.println("The roll is " + roll);
	}
      }
    }

    
