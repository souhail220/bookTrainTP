package com.mycompany.resttp2.Entities;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "trains")
public class TrainListWrapper {
    
    private List<Train> trains;

    public TrainListWrapper() {
    }

    public TrainListWrapper(List<Train> trains) {
        this.trains = trains;
    }

    @XmlElement(name = "train")
    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }
}
