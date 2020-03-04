package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class App
{
    private static final Logger LOGGER= Logger.getLogger(App.class.getName());
    
    public static void main( String[] args )
    {
        ListCustom<Integer> newList = new ListCustom<Integer>();
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Enter Size : ");
        int n;
        n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            newList.add(scanner.nextInt());
        }
        newList.display();
        LOGGER.info("Enter index you want to remove :");
        newList.remove(scanner.nextInt());
        newList.display();
        LOGGER.info("Enter number you want to add :");
        newList.add(scanner.nextInt());
        newList.display();
        System.out.println(newList.get(3));
        newList.display();
    }
}
