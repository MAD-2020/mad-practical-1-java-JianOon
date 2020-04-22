import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    	
    
    System.out.print("Enter integer: ");
    int number = input.nextInt();
    int out = number*number;
    System.out.println(out);
  
    input.close();
    
  }
}
