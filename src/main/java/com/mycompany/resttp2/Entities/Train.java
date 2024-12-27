package com.mycompany.resttp2.Entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="train")
public class Train {
    
    private String numTrain;
    private String villeDepart;
    private String villaArrive;
    private int heureDepart;
    
    public Train(){
        
    }

    public Train(String numTrain, String villeDepart, String villaArrive, int heureDepart) {
        this.numTrain = numTrain;
        this.villeDepart = villeDepart;
        this.villaArrive = villaArrive;
        this.heureDepart = heureDepart;
    }

    public String getNumTrain() {
        return numTrain;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public String getVillaArrive() {
        return villaArrive;
    }

    public int getHeureDepart() {
        return heureDepart;
    }

    public void setNumTrain(String numTrain) {
        this.numTrain = numTrain;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public void setVillaArrive(String villaArrive) {
        this.villaArrive = villaArrive;
    }

    public void setHeureDepart(int heureDepart) {
        this.heureDepart = heureDepart;
    }
    
    
}
