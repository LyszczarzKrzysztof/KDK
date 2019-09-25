package pl.kdk.bazakotow.model;

import java.util.Scanner;

import static pl.kdk.bazakotow.model.TestClass.parseStringToDate;

public class TestClass3 {

    public static void main(String[] args) {


        Scanner entry = new Scanner(System.in);
        CatDAO listOfCats = new CatDAO();


        int breaker = 0;

        String sign;
        do {

            System.out.println("1 - dodaj kota do listy");
            System.out.println("2 - wyswietl liste kotow");
            System.out.println("x - zakoncz program");


            sign=entry.nextLine();





            switch (sign) {
                case "1":
                    Cat cat = new Cat();
                    System.out.println("Podaj imie kota:");
                    cat.setNameOfCat(entry.nextLine());
                    System.out.println("Podaj imie wlasciciela");
                    cat.setNameOfOwner(entry.nextLine());
                    System.out.println("Podaj date urodzenia kota");
                    cat.setBirthdayDate(parseStringToDate(entry.nextLine()));
                    System.out.println("Podaj wage kota: ");
                    cat.setWeightOfCat(entry.nextFloat());
                    //System.out.println(listOfCats);
                    listOfCats.addCatToList(cat);
                    //System.out.println(listOfCats);

                    break;
                case "2":

                    if (listOfCats.cats.size() != 0) {
                        listOfCats.printListOfCats();
                        break;
                    } else {
                        System.out.println("Nie ma zadnego kota na liscie");
                        breaker=1;
                        break;
                    }



                case "x":

                    sign="x";

                    break;

            }
        }while (sign.compareTo("x")!=0&&breaker==0);



    }
}
