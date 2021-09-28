package com.company;

class Tourist{
    private String name;
    private String age;
    private String gender;
    private String nationality;
    private String passportNumber;
    private String creditNumber;
    private String visaNumber;
    private String covidVaccineDose;
    private String rtpcrStatus;

    Tourist(String name, String age, String gender, String nationality, String covidVaccineDose, String rtpcrStatus){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.covidVaccineDose = covidVaccineDose;
        this.rtpcrStatus = rtpcrStatus;
    }

    Tourist(String name, String age, String gender, String nationality, String passportNumber, String creditNumber, String visaNumber, String covidVaccineDose, String rtpcrStatus){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.passportNumber = passportNumber;
        this.creditNumber = creditNumber;
        this.visaNumber = visaNumber;
        this.covidVaccineDose = covidVaccineDose;
        this.rtpcrStatus = rtpcrStatus;
    }

    public boolean take_permission(){
        return (covidVaccineDose.charAt(0) == '2' && rtpcrStatus.equals("negative"));
    }

    public String display(){
        if(name.length() == 0 || age.length() == 0 || gender.length() == 0 || nationality.length() == 0)
            return new String("Not Allowed");
        else if(!take_permission())
            return new String("Not Allowed");
        else{
            if(nationality.charAt(0) == 'I') {
                return new String("Allowed");
            }
            else{
                if(creditNumber.length() == 0 || passportNumber.length() == 0 || visaNumber.length() == 0)
                    return new String("Not Allowed");
                return new String("Allowed");
            }
        }
    }
}


public class Main {

    public static void main(String[] args) {
        Tourist obj1 = new Tourist("Raja", "43 years", " Male","Indian", "123456","12996655","555","2 dose completed","negative");
        System.out.println(obj1.display());
        Tourist obj2 = new Tourist("Subha", "13 years","Female", "Indian", "893456","","5985","1 dose completed","negative");
        System.out.println(obj2.display());
        Tourist obj3 = new Tourist("George", "53 years","Male", "American", "198756","57986655","567","2 dose completed","positive");
        System.out.println(obj3.display());
        Tourist obj4 = new Tourist("Frank", "33 years","Male", "German", "678776","4566655","9867","2 dose completed","negative");
        System.out.println(obj4.display());
        Tourist obj5 = new Tourist("Sriparna", "53 years","Female", "Indian", "","","","2 dose completed","negative");
        System.out.println(obj5.display());
        Tourist obj6 = new Tourist("John", "44 years", "Male","British", "196656","","","2 dose completed","negative");
        System.out.println(obj6.display());
        Tourist obj7 = new Tourist("Philips", "46 years", "Male","French", "778756","","997","2 dose completed","negative");
        System.out.println(obj7.display());
        Tourist obj8 = new Tourist("Liza", "33 years", "Female","American", "155556","12386655","227","2 dose completed","negative");
        System.out.println(obj8.display());
        Tourist obj9 = new Tourist("Sanjoy", "63 years","Male", "Indian", "177756","66666655","","2 dose completed","negative");
        System.out.println(obj9.display());
        Tourist obj10 = new Tourist("Sipra", "53 years", "Female","Indian", "","8899955","","2 dose completed","negative");
        System.out.println(obj10.display());
    }
}


//
//-------OUTPUT-------
//
//        Allowed
//        Not Allowed
//        Not Allowed
//        Allowed
//        Allowed
//        Not Allowed
//        Not Allowed
//        Allowed
//        Allowed
//        Allowed
//
