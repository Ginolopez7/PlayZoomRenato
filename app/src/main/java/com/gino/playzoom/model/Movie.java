package com.gino.playzoom.model;

public class Movie extends Shows {
    private String sagaName;

    public String getSagaName() {
        return sagaName;
    }

    public void setSagaName(String sagaName) {
        this.sagaName = sagaName;
    }

    public Movie(String name, String imgUrl, String sagaName) {
        super(name, imgUrl);
        this.sagaName= sagaName;


    }
}
