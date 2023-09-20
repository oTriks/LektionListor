import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> allNames = new ArrayList<String>();
        System.out.println(allNames.size());  //listor, size för längd

        allNames.add("David");
        allNames.add("Susan");
        allNames.add("Laura");

        System.out.println(allNames.size());

        System.out.println(allNames.get(1));


        // String name = allNames.get(1);
        // System.out.println(name);

        System.out.println(allNames.contains("Susan"));

        for (String name : allNames) {
            System.out.println(name);
        }


        int[] numbers = {3, 5, 6, 9};
        String[] allNames = {"David", "susan", "Louis", "Laura"};
        String[] moreNames = new String[25];

        String name1 = allNames[1];
        System.out.println(name1);

        for (int i = 0; i < allNames.length; i++) {
            System.out.println(allNames[i]);
        }

        for (String name : allNames) {
            System.out.println(name);
        }
        //    boolean found = contains("Lois", allNames);

        //  static boolean contains( String name, String[] namesArray){
        //      for(String str : namesArray){
        //       if(str.equals(name)){
        //             return true;
        //         }
        //    }

        //    return false;

        // }




        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv 5 namn med komma efter varandra");
        String names = sc.nextLine();
        String seperate [] = names.split("[,]");

        for (String namn1 : seperate) {
            System.out.println(namn1);

        }


    }
}