package com.itFactory.problemeMatematica;

public class User {

    private String fructe;
    private double kg;
    private double pret;
    private double total;

    public User(String fructe, double kg, double pret, double total) {
        this.fructe = fructe;
        this.kg = kg;
        this.pret = pret;
        this.total = total;
    }
    public User(){

    }

    public String getFructe() {
        return fructe;
    }

    public void setFructe(String fructe) {
        this.fructe = fructe;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
