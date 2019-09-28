package pl.kdk.bazakotow.koty.domain;

import java.util.Date;

public class Cat {
    private String nameOfCat;
    private Date birthdayDate;
    private float weightOfCat;
    private String nameOfOwner;

    public Cat() {

    }

    public Cat(String nameOfCat, Date birthdayDate, float weightOfCat, String nameOfOwner) {
        this.nameOfCat = nameOfCat;
        this.birthdayDate = birthdayDate;
        this.weightOfCat = weightOfCat;
        this.nameOfOwner = nameOfOwner;
    }

    @Override
    public String toString(){
        return nameOfCat+" "+nameOfOwner+" "+birthdayDate+" "+weightOfCat;
    }

    public String introduceYourself(){
        return nameOfCat +" "+birthdayDate+" "+ weightOfCat +" "+nameOfOwner;
    }

    public String getNameOfCat() {
        return nameOfCat;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfCat(String nameOfCat) {
        this.nameOfCat = nameOfCat;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public float getWeightOfCat() {
        return weightOfCat;
    }

    public void setWeightOfCat(float weightOfCat) {
        this.weightOfCat = weightOfCat;
    }
}
