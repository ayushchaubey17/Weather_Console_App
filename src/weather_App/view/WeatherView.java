package weather_App.view;

import weather_App.viewModel.WeatherNotifyingSystemModelView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeatherView {
    private  static Scanner scanner= new Scanner(System.in);
    public void printPrompt() {
        String str = """
                  Welcome to weather Application ::
                  
                  1. add Subscriber
                  2. remove Subscriber
                  3. notify Weather   
                  4. exit    
                  
                  please enter your choice   
                """;

        System.out.println(str);
    }


    public int takePrompt() throws InputMismatchException {


       while (true){

           System.out.println("enter your choice");
           try {
               int choice = scanner.nextInt();

               if (choice==4)System.exit(0);
               WeatherNotifyingSystemModelView.fun(choice);
           }
           catch (InputMismatchException e){
               System.out.println("please enter valid choice");
               scanner.next();
           }

       }

    }

    public String getName( String prompt) {
        System.out.println(prompt);
        String nane =  scanner.next();
        return nane;
    }

    public float takeDetails(String prompt) {
        System.out.println(prompt);
        return scanner.nextFloat();
    }
}
