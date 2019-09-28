package pl.kdk.bazakotow.model;



import pl.kdk.bazakotow.koty.domain.Cat;

import java.util.LinkedList;
import java.util.List;

public class CatDAO{

    List<Cat> cats= new LinkedList<>();



    public void addCatToList(Cat cat){
        cats.add(cat);
    }

    public void printListOfCats(){
        for (Object c: cats) {
            System.out.println(c);
        }
    }

    @Override
    public String toString(){
        return ""+cats;
    }

}
