import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter weight in kg: ");
    double weight = input.nextDouble();
    System.out.print("Enter height in m: ");
    double height = input.nextDouble();
    double bmi = weight/(height * height) ;

    System.out.println("Your bmi is " + bmi);
    input.close();
  }
}
