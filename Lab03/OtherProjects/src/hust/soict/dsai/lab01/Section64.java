package hust.soict.dsai.lab01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Section64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Year
        String year = "";
        boolean valid_year = false;
        String year_regex = "^[1-9][0-9]{3}$";
        Pattern p = Pattern.compile(year_regex);

        while (!valid_year){
            System.out.println("Input the year:");
            year = sc.nextLine();

            Matcher m = p.matcher(year);
            if (m.find()){
                valid_year = true;
            }
            else{
                System.out.println("Invalid year. Please enter again.");
            }
        }


        //Month
        boolean valid_month = false;
        while (!valid_month) {
            System.out.println("Input the month:");
            String month = sc.nextLine();

            String[] _31days = {"January","Jan.","Jan","1","March","Mar.","Mar","3","May","5","July","Jul","7",
                                    "August","Aug.","Aug","8","October","Oct.","Oct","10","December","Dec.","Dec","12"};
            String[] _30days = {"April","Apr.","Apr","4","June","Jun","6","September","Sep.","Sep","9","November","Nov.","Nov","11"};
            String[] _February = {"February","Feb.","Feb","2"};


            if (Arrays.asList(_February).contains(month)){
                valid_month = true;
                int numYear = Integer.parseInt(year);
                if (numYear - (numYear / 100)*100 == 0){
                    if (numYear - (numYear / 400)*400 == 0){
                        System.out.println("There are 29 days.");
                    }
                    else {
                        System.out.println("There are 28 days.");
                    }
                }
                else if (numYear - (numYear/4)*4 == 0){
                    System.out.println("There are 29 days.");
                }
                else{
                    System.out.println("There are 28 days.");
                }
            }

            else if (Arrays.asList(_30days).contains(month)){
                valid_month = true;
                System.out.println("There are 30 days.");
            }

            else if (Arrays.asList(_31days).contains(month)){
                valid_month = true;
                System.out.println("There are 31 days.");
            }
            else{
                System.out.println("Invalid month. Please enter again.");
            }
        }


    }
}

