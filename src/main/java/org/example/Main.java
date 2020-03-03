package org.example;

import java.net.SocketOption;
import java.util.Scanner;


public class Main {
    public static void main(String args[])
    {
        Collection collection = new Collection();
        Scanner s = new Scanner(System.in);
        int ch = 1;
        while (ch!=0)
        {
            System.out.println("\nEnter 1 to ADD Element");
            System.out.println("Enter 2 to GET position of SPECIFIC Element");
            System.out.println("Enter 3 to REMOVE Element");
            System.out.println("Enter 4 to Print LIST");
            System.out.println("Enter 0 to EXIT");

            ch=s.nextInt();

            if(ch==1)
            {
                System.out.println("\nEnter Element :-");
                collection.addElement(s.nextInt());
            }
            else if(ch==2)
            {
                System.out.println("\nEnter Element");
                System.out.println("Position is : " + collection.position(s.nextInt()));
            }
            else if(ch==3)
            {
                System.out.println("\nEnter Element to remove :-");
                collection.removeElement(s.nextInt());
            }
            else if(ch==4)
            {
                System.out.println("\nThe List :- ");
                collection.print();
            }
        }
    }
}
