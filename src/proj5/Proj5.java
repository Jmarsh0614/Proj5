
package proj5;
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
*    Programmer: Josh D. Marshall  Program Name: Proj5.java      *
*    Course : INT 2200             Instructor : C.A.Thomas       *
*    Assignment : Project # 5      Due Date: 15 Nov 16           *
*    Date Created : 06 Dec 16       Date Revised: 08 Dec 16      *
*    Input: System.in                                            *
*    Output: Screen Report                                       *
*Functions Called: main(),reverse()                              *
*                                                                *
* User Functions Called: reverse()                               *
*                                                                *
* Description: Asks for and reverses 5 digit number              *
*    Other Notes: None                                           *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import java.util.Scanner;

/**
 *
 * @author My Computer
 */
public class Proj5 {

    
    public static String numbers;
 

    public static void main(String[] args) {

        Scanner getit = new Scanner(System.in);
        System.out.println("Please enter 5 numbers: ");
        numbers = getit.nextLine();

        reverse();
    }

    public static void reverse() {
        if (numbers.length() <= 1) {
            System.out.print(numbers);
        } else {
            System.out.print(numbers.charAt(numbers.length() - 1));
            numbers = numbers.substring(0, numbers.length() - 1);
            reverse();
        }
    }
}
