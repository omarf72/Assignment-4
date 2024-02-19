
import java.text.DecimalFormat;
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

                //Creates a variable for the money the user needs to enter
                Double moneyNeeded = prices[index];

                //checking if the their choice matches the snack that available
                if(choice.equals(snackName))
                {

                    //for testing
                    //System.out.println("Hi");

                    //printing price
                    System.out.println(" The price will be  $" +String.format("%.2f",prices[index]));

                    //Reads how much money the user enters
                    System.out.println("Please insert money($1 bills only): ");
                    int money = scan.nextInt();

                    //Creates a dolar format so numbers print out better
                    DecimalFormat dolarFormat = new DecimalFormat("0.00");
    
                    //Calculates the exact change for the user
                    double change = money - moneyNeeded;

                    //Creates a string for change in dolar format(0.00)
                    String dollarFormatChange = dolarFormat.format(change);

    
                    //If the user didn't enter enough money the program ends
                    if(change < 0) {
                        System.out.println("That is not enough money.");
                        break;
                    } else if(change != 0) {
                        //if the user didn't enter the exact amount needed their change is printed
                        System.out.println("Your change is $" + dollarFormatChange);
                    }

                    //Asks the user to confirm the transaction
                    System.out.println("Would you like to proceed with the transaction?");
                    String proceed = scan.next();

                    //If the user says no their money is refunded
                    if(proceed.toLowerCase().equals("no")) {
                        System.out.println("You will be refunded $" + dolarFormat.format(money));
                    }

                    System.out.println("Thanks for buying. Enjoy!");

                }


                
            }

           
        }

        
    }
}