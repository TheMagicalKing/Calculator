package com.example.calulator;

public class Begregner {
    private int facit;

    protected int getFacit(){
        return facit;

    }

    protected int addFacit(int userinput){
        facit = facit + userinput;
        return facit;

    }
}
