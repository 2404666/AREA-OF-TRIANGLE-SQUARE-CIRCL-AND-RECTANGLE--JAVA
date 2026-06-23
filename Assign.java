import java.util.Scanner;
 public class Assign{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the width:");
        double width=input.nextDouble();
        System.out.print("Enter the length:");
        double length=input.nextDouble();
        double area1= width*length;

        System.out.print("Enter the side:");
        double side=input.nextDouble();
         double area2=side*side;

         System.out.print("Enter the base:");
        double base=input.nextDouble();
        System.out.print("Enter the height:");
        double height=input.nextDouble();
         double area3=(1/2)*base*height;

         System.out.print("Enter the radius:");
        double radius=input.nextDouble();
        double area4=Math.PI*radius*radius;
        System.out.println("--- SOLUTIONS ---");
        System.out.println("AREA FOR RECTANGLE:"+ area1);
        System.out.println("AREA FOR SQUARE:"+ area2);
        System.out.println("AREA FOR TRIANGLE:"+ area3);
        System.out.print("AREA FOR CIRCLE:"+ area4);
    }
 }