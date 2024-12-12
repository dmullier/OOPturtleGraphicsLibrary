package uk.ac.leedsbeckett.oop;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        new Main(); //create instance of class that extends LBUGraphics (could be separate class without main), gets out of static context
    }

    public Main()
    {
        LBU_GUI LBU = new LBU_GUI();
        Scanner input = new Scanner(System.in);

        String response="";
        do {
            System.out.print("command > ");
            response = input.nextLine().toLowerCase().trim();
            switch(response)
            {
                case "forward":
                    LBU.forward(100);
                    break;
                case "right":
                    LBU.right();
                    break;
                case "dance":
                    LBU.dance(10);
                    break;
                default:
                    System.out.println("No such command");
            }
        System.out.println();
        }while(!response.equals("quit"));
    }
}
