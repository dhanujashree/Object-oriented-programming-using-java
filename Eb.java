import java.util.Scanner;
public class Eb
{ 
  public static void main(String args[])
  {  
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the Consumer Id :");
      int consumerno=input.nextInt();
      input.nextLine();
      System.out.println("Enter the consumer name:");
      String consumername=input.nextLine();
      System.out.println("Enter the type of Connection(domestic/commercial):");
      String connection=input.nextLine();
      System.out.println("Enter the previous month reading:");
      int prev=input.nextInt();
      System.out.println("Enter the current month Reading:");
      int curr=input.nextInt();
      input.nextLine();
      int unit=curr-prev;
      double amount=0;
      if(connection.equalsIgnoreCase("domestic"))
      {
        if(unit<=100 && unit>=1)
        {
          amount=unit*1;
        }
        else if(unit>=101 && unit<=200)
        {
          amount=unit*2.50;
        }
         else if(unit>=201 && unit<=500)
        {
          amount=unit*4;
        }
        else if(unit>=501)
        {
          amount=unit*6;
        }
        else
        {
          System.out.println("Invalid Unit");
          return;
        }
      }   
      else if(connection.equalsIgnoreCase("commercial"))
      {
        if(unit<=100 && unit>=1)
        {
          amount=unit*2;
        }
        else if(unit>=101 && unit<=200)
        {
          amount=unit*4.50;
        }
         else if(unit>=201 && unit<=500)
        {
          amount=unit*6;
        }
        else if(unit>=501)
        {
          amount=unit*7;
        }
        else
        {
          System.out.println("Invalid Unit");
          return;
        }
      }   
      else
      {
          System.out.println("Invalid connection type");
          return;
      }
      System.out.println("Consumer Number :"+consumerno);
      System.out.println("Consumer Name :"+consumername);
      System.out.println("Connection type:"+connection);
      System.out.println("units used:"+ unit);
      System.out.println("Total Bill rs :" + amount);
   }
}    
               
