package com.itFactory.problemeMatematica;

public class Maths {

    public double calculeazaPret(User user) {
        if (user.getKg() > 0) {
            double pretTotal = user.getKg() * user.getPret();
            return pretTotal;
        } else {
            return 0;
        }
    }

    public User getUser(double pret, double kg) {
        if (pret > 50 && kg < 3) {
            return new User("KAKI", 2, 60, 120);
        }
        return null;
    }

    public String vindem(User user) {
        if (user.getKg() >= 1) {
            return "vindem ceva";
        } else {
            return "nu vindem nimic";
        }
    }

    public double careEstePretul(User user) {
        if (user.getKg() >= 1 && user.getTotal() >= 1) {
            double pretPerKg = user.getTotal() / user.getKg();
            return pretPerKg;
        } else {
            return 0;
        }
    }

    public double cateKgAvem(User user) {
        if (user.getPret() >= 1 && user.getTotal() >= 1) {
            double cantitateKg = user.getTotal() / user.getPret();
            return cantitateKg;
        } else {
            return 0;
        }
    }
}
