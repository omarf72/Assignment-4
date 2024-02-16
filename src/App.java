
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);

        String[] snacks = {"Chips : $1.70", "Soda : $1.30 ", "Pretzels : $2.00", "Candy :$1.00"};

        for(int i=0; i<snacks.length; i++){
            System.out.println(snacks[i]);
        }

        //welcoming the user
        System.out.println("Hello welcome, type the snack you want.");

        //reading the user's choice of snack
        String choice=scan.next();

        //just making sure that their choice matches the exact string value
        choice=choice.substring(0,1).toUpperCase()+choice.substring(1);

        //corresponding prices 
        double [] prices={1.70,1.30,2.00,1.00};


        //looping through the snacks array

        for(int index=0;index<snacks.length;index++)
        {
            //separting the snack and the price 
            String [] parts=snacks[index].split(":");


            //making sure they are split into two parts
            if(parts.length==2)
            {
                //trimming any white space and just getting the snack name
                String snackName=parts[0].trim();

                //checking if the their choice matches the snack that available
                if(choice.equals(snackName))
                {

                    //for testing
                    //System.out.println("Hi");

                    //for testing
                    System.out.println(" The price will be  $" +String.format("%.2f",prices[index]));

                }

                
            }

           
        }

        
    }
}