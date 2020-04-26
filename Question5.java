import java.util.Scanner;
import java.util.HashMap;
public class Question5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    HashMap<String,Integer> numbers = new HashMap<String,Integer> ();
    System.out.print("Enter an the number of integers: ");
    int no = input.nextInt();
    for(Integer i=0;i<no;i++){
      Boolean flag = true;
      System.out.print("Enter the integers: ");
      int integer = input.nextInt();
      
      for (String c : numbers.keySet()){
        
        if (c.equals(Integer.toString(integer))){
          int old = numbers.get(c);
          int update = old + 1;
          numbers.replace(c,update);
          flag = false;

        }
        
      }
      if (flag == true){
          numbers.put(Integer.toString(integer),1);
        }
    }
    int highest = 0;
    for(String o : numbers.keySet()){
      int compare = numbers.get(o); 
      if(compare > highest){
        highest = compare;
      }
    }
    for (String k : numbers.keySet()) {
      if(numbers.get(k) == highest){
        System.out.println("The number with highest mode is " + k);
      }
      break;
    }

    

    input.close();
    
    
  }
}
