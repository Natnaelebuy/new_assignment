import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        String[] stringArray = new String[] 
          {"pfizer-alpha", "moderna-alpha", 
          "johnson-alpha", "pfizer-omega", "pfizer-kappa", 
          "moderna-delta", "moderna-gamma", "moderna-zeta"};
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your name: ");
        String name= sc.nextLine();
       
        System.out.println("What is your age?");
        int age= sc.nextInt();
        sc.nextLine();
        System.out.println("Do you have a medical condition? Yes or No");
        String medCondition= sc.nextLine();
      
        if ((age>65) || medCondition.equals("Yes")){
          
          System.out.println("Here are all the vaccinations available for you: ");
          for (int i=0; i<stringArray.length; i++)  
              {  
                  System.out.println(stringArray[i]);  
              }
              System.out.println("\nWhich Booster Vaccination did you need to take?");
          String booster= sc.nextLine();
          System.out.println("\n\nName: "+name);
          System.out.println("Age: "+age);
          System.out.println("Vaccination: "+booster);
          
      }
      else System.out.println("You should not get a booster vaccination!");{
    }
  }
    
}
