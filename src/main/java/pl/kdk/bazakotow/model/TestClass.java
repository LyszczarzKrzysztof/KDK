package pl.kdk.bazakotow.model;




import pl.kdk.bazakotow.koty.domain.Cat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Float.valueOf;

public class TestClass {


    public static void main(String[] args){

        Cat cat1 = new Cat();

        log("Podaj imie kota: ");
        cat1.setNameOfCat(getUserStringInput());

        log("Podaj imie wlasciciela: ");
        cat1.setNameOfOwner(getUserStringInput());

        log("Podaj date urodzenia kota: ");
        cat1.setBirthdayDate(parseStringToDate(getUserStringInput()));

        log("Podaj wagę kota z przecinkiem: ");
        try {
            cat1.setWeightOfCat(valueOf(getUserStringInput()));
        }catch (NumberFormatException pe){
            System.out.println("Wrong number format.");

        }

        System.out.println(cat1.getNameOfCat());
        System.out.println(cat1.getNameOfOwner());
        System.out.println(cat1.getBirthdayDate());
        System.out.println(cat1.getWeightOfCat());


    }

    //---------------------------------


    //--------------------------------------

    public static void log(String text){
        System.out.println(text);
    }

    //--------------------------------------

    static Scanner entry = new Scanner(System.in);
    public static String getUserStringInput(){
        return entry.nextLine();
    }

    //--------------------------------------

    public static Date parseStringToDate(String dateInString){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        Date date = null;

        try{
            date = sdf.parse(dateInString);
        } catch (ParseException pe){
            System.out.println("Wrong date format.");
        }

        return date;
    }

    //--------------------------------------


}
