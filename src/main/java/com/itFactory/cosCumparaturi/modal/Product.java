package com.itFactory.cosCumparaturi.modal;

import java.util.Objects;

public class Product {
    String nume;
    double pret;
    int cantitate;
    Type tipProdus;

    public Product(String nume, double pret, int cantitate, Type tipProdus) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
        this.tipProdus = tipProdus;
    }

    public Product() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public Type getTipProdus() {
        return tipProdus;
    }

    public void setTipProdus(Type tipProdus) {
        this.tipProdus = tipProdus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(pret, product.pret) == 0 && cantitate == product.cantitate && Objects.equals(nume, product.nume) && tipProdus == product.tipProdus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, pret, cantitate, tipProdus);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", tipProdus=" + tipProdus +
                '}';
    }
    public double getTotalPrice() {
        return pret*cantitate;
    }

}
