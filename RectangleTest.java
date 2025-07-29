import java.util.Scanner;
import java.awt.Rectangle;

//This file has been modified locally

public class RectangleTest {
    public static void main(String[] args) {   
             // Inside main() 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: "); 
        int width = input.nextInt();
        System.out.print("Enter height: "); 
        int height = input.nextInt();
        
        //Orginal Code:
        //Rectangle box1 = new Rectangle(10, 10, 40, 30);
        Rectangle box1 = new Rectangle(10, 10, width, height);
        System.out.println("box1: " + box1);
        
        
        int area = box1.getWidth() * box1.getHeight();
        int expectedArea = width * height;

         if (area == expectedArea) {
            System.out.println("++++ Test passed: Area is correct.");
            } else {
                System.out.println("---- Test failed: Expected " + expectedArea + " but got " + area);
            }


            input.close();

    } 

}
