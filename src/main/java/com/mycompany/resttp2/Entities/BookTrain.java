package com.mycompany.resttp2.Entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BookTrain {
    
    private String booknumber;
    private Train currentTrain;
    private int numberPlaces;

    public BookTrain(String booknumber, Train currentTrain, int numberPlaces) {
        this.booknumber = booknumber;
        this.currentTrain = currentTrain;
        this.numberPlaces = numberPlaces;
    }

    public BookTrain() {
    }

    public String getBooknumber() {
        return booknumber;
    }

    public Train getCurrentTrain() {
        return currentTrain;
    }

    public int getNumberPlaces() {
        return numberPlaces;
    }

    public void setBooknumber(String booknumber) {
        this.booknumber = booknumber;
    }

    public void setCurrentTrain(Train currentTrain) {
        this.currentTrain = currentTrain;
    }

    public void setNumberPlaces(int numberPlaces) {
        this.numberPlaces = numberPlaces;
    }
    
    
}
