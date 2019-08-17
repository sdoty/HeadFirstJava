//my first actual, independent app!  Yay!
//Shelley Doty 08172019 EC, CA

public class MyNextApp {
    public static void main (String[] args) {
	
        int roll = (int) (Math.random() * 7);

	if (roll == 0) {
	   roll = (int)(Math.random() * 7);  // this line isn't doing anything.  Need syntax to create a loop so that it will roll until <> 0
           System.out.println("Please roll again.");
	 } else {
           System.out.println("The roll is " + roll);
	}
      }
    }

    
