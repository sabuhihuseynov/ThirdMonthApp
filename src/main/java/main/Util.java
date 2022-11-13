package main;

import java.util.Scanner;

public class Util {
    public static User getUserNameAndSurname()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa Adinizi ve Soyadinizi (aralarinda bir bosluq olmaqla) daxil edin :");
        String str = sc.nextLine();

        String[] str1 = str.split(" ");
        User u = new User(str1[0], str1[1]);
        return u;
    }

}
