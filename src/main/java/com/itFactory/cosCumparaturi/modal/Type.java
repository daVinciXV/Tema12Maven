package com.itFactory.cosCumparaturi.modal;

public enum Type {

    MEAT,
    DAIRYPRODUCT,
    VEGAN;

    private String tip;

    Type(String tip) {
        this.tip = tip;
    }

    Type() {
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }




}
