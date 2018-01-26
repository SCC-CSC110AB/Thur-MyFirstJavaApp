package thur.myfirstjavaapp;

/**
 *
 * @author john
 */
public class ThurMyFirstJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value;
        
        value = 5;
        
        System.out.print("The value is ");
        System.out.println(value);
        System.out.println("Done.");
        
        int myFirstInt = 15;
        int mySecondInt = 5;
        
        int myUninitializedInt;
        
        // Uncomment out this line for an error
        // System.out.println(myUninitializedInt);
        
        System.out.println(myFirstInt + mySecondInt);
        System.out.println("The next value is: " + myFirstInt + mySecondInt);
        System.out.println("The _actual_ next value is: " + 
                (myFirstInt + mySecondInt));
        
        int myThirdInt = myFirstInt / mySecondInt;
        
        System.out.println(myThirdInt);
        
        int myFourthInt = 16;
        
        System.out.println(myFourthInt / mySecondInt);
        
        float myFirstFloat = (float)myFourthInt / mySecondInt;
        
        System.out.println(myFirstFloat);
        
        float mySecondFloat = (float)0.1;
        float myThirdFloat = 0.2F;
        
        System.out.println(mySecondFloat + myThirdFloat == 0.3);
        
        short myFirstShort = 1000;
        
        System.out.println(myFirstShort);
        
        short mySecondShort = (short)120192;
        
        System.out.println(mySecondShort);
        
        System.out.println(myFourthInt % mySecondInt);
        
        boolean isDone = false;
        
        System.out.println("Are we done? " + isDone);
        
        char aChar = 'a';
        
        System.out.println(aChar);
        
        char bChar = 'b';
        char cChar = 'c';
        
        System.out.println(aChar + bChar + cChar);
        
        System.out.println("" + aChar + bChar + cChar); // PLZ GOD DON'T DO THIS
        
        // This is a little better
        System.out.println(String.valueOf(aChar) + bChar + cChar);
    }
    
}
