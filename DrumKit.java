class DrumKit {
 
  boolean topHat = true;
  boolean snare  = true;  

  void playSnare() {
	System.out.println("bang bang ba-bang");
     }
 
  void playTopHat()  {
        System.out.println("ding ding da-ding");
    }
}

class DrumKitTestDrive  {
   public static void main (String[] args)  {

  int fill = 3;  //I added a loop to the exercise

  while (fill > 0)  {  //second part of the loop
        
   DrumKit d = new DrumKit();

   if  (d.snare = true) {
    d.playSnare();
   }
   
   d.snare = false;
   d.playTopHat();

   fill = fill - 1;  // last part of the loop
      }
    }
}
 
