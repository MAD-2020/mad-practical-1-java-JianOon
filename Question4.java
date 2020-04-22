import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    	
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    while(number>0){
      for(int i =number;i>0;i--){
        System.out.print('*');

      }
      System.out.println();
      number = number-1;
    }
    input.close();
    
  }
}
