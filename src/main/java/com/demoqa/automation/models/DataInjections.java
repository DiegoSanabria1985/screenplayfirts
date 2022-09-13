package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjections {

    Faker faker = new Faker(new Locale("on US"));

    private String fullname, currentAdress, email, permanentAdress, filepath, sheetName,
            search, lastname, number, addres, valida, validacion, subject, extensionvalidation, logincredentialName, validationshhet;

    public String getFirstnameweb() {
        return firstnameweb;
    }

    private String firstnameweb;

    public String getLastnameweb() {
        return lastnameweb;
    }

    private String lastnameweb;

    public String getEmailweb() {
        return emailweb;
    }

    private String emailweb;

    public String getAgeweb() {
        return ageweb;
    }

    private String ageweb;

    public String getSalaryweb() {
        return salaryweb;
    }

    private String salaryweb;

    public String getDepartmentweb() {
        return departmentweb;
    }

    private String departmentweb;

    private String fileImput = "imagen.png";

    public String getUsername() {
        return fullname;
    }

    public  String getCurrentAdress(){return currentAdress;}

    public String getValidacion(){return fullname;}

    public String getValida(){return valida;}

    public String getLastname(){return lastname;}



    public String getEmail() {
        return email;
    }

    public String getSubject(){return subject;}

    public String getNumber(){
        return number;
    }

    public String getPermanentAdress() {
        return permanentAdress;
    }

    public String getSearch() {
        return search;
    }

    public String getFileImput(){

        return fileImput;}

    public String getAddres() {
        return addres;
    }

    public String getExtensionvalidation() {
        return extensionvalidation;
    }

    public String getFilepath() {
        return filepath;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getLogincredentialName() {
        return logincredentialName;
    }

    public DataInjections(){
        this.fullname = faker.name().username();
        this.email = faker.internet().emailAddress();
        this.search = faker.expression("laptops");
        this.lastname = faker.name().lastName();
        this.number = faker.expression("3103970950");
        this.fileImput = faker.expression("imagen.png");
        this.addres = faker.expression("carrera 24 # 45-56");
        this.validacion = faker.expression("Thanks for submitting the form");
        this.valida = faker.expression("Thanks for submitting the form");
        this.currentAdress = faker.expression("Uttar Pradesh");
        this.subject = faker.expression("nuevo");
        this.extensionvalidation = "Name:";
        this.permanentAdress = faker.expression("Thanks for submitting the form");
        this.firstnameweb = faker.expression("Diego");
        this.lastnameweb = faker.name().lastName();
        this.emailweb = faker.internet().emailAddress();
        this.ageweb = faker.expression("37");
        this.salaryweb = faker.expression("10000000");
        this.departmentweb = faker.expression("contabilidad");
        this.filepath = "resources/dataExcel.xlsx";
        this.sheetName = "loginCredentials";
        this.logincredentialName = "validations";


    }
}
