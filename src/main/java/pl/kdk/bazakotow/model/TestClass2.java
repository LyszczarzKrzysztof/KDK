package pl.kdk.bazakotow.model;

import java.util.regex.Pattern;

import static pl.kdk.bazakotow.model.TestClass.*;


public class TestClass2 {
    public static void main(String[] args) {

        String inputFromKeyboard;
        Cat cat1 = new Cat();
        CatDAO listOfCats1 = new CatDAO();

        log("Podaj imie kota: ");
        cat1.setNameOfCat(getUserStringInput());

        log("Podaj imie wlasciciela: ");
        cat1.setNameOfOwner(getUserStringInput());

        // ---------------------------------------------------



        do {
            log("Podaj date urodzenia kota: ");
            inputFromKeyboard = getUserStringInput();
        } while (isDateRegex(inputFromKeyboard) == false);
        cat1.setBirthdayDate(parseStringToDate(inputFromKeyboard));

        Cat cat2 = new Cat("BUrek", parseStringToDate("2019.06.14"),1,"Jozek");
        Cat cat3= new Cat("RUdy", parseStringToDate("1999.05.14"),2,"Franek");

        listOfCats1.addCatToList(cat1);
        listOfCats1.addCatToList(cat2);
        listOfCats1.addCatToList(cat3);

        listOfCats1.printListOfCats();




    }

    //-----------------------------------------------------
    public static boolean isDateRegex(String dateInString) {
        return Pattern.matches("[]0-9]{4}\\.[0-9]{2}\\.[0-9]{2}", dateInString);
    }

}


