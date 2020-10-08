
package com.company ;

import javax.swing.plaf.IconUIResource;
import java.lang.module.FindException;
import java.util.Random;
import java.util.Scanner;






public class Project2 {


    public static void main(String[] args) {
        Random rnd = new Random();
        String A[] = {"phone", "car", "mobile" , "computer"  };
        int index = rnd.nextInt(5);
        // System.out.println(A[index]);
        int B = A[index].length();
        int Count = 0;
        int C = 0 ;
        System.out.println("The word is from " + B + " chars " );
        System.out.println("Enter a character ");
        Scanner sc = new Scanner(System.in);
        String Try = sc.next();
        while ( C < 5 ) {


            if (A[index].contains(Try) == true) {

                System.out.println("This char is in the word, the char number is " + (A[index].indexOf(Try) + 1));
                System.out.println("Enter another char");
                Try = sc.next();
                Count = Count + 1;

                if (Count == (B-1))  {
                    System.out.println("The word is " + " ( " +  A[index] + " ) " ) ;
                    break;

                }

            }
            else if (A[index].contains(Try) == false) {

                C = C + 1 ;
                System.out.println("That char is wrong ,you lost  " + C + " of your chances" );
                System.out.println("Enter a char again");

                Try = sc.next();
                if ( C == 5 ) {
                    System.out.println("Your chances are done,SORRY!");
                }



            }

        }


    }



}

















