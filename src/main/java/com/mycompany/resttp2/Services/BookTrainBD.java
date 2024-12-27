package com.mycompany.resttp2.Services;

import com.mycompany.resttp2.Entities.BookTrain;
import com.mycompany.resttp2.Entities.Train;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlRootElement;

public class BookTrainBD {
    
    private static List<Train> trains = new ArrayList<>();
    
    private static List<BookTrain> bookTrains = new ArrayList<>();
    
    static{
        trains.add(new Train("TR123", "Poitiers", "Paris", 1250));
        trains.add(new Train("TR127", "Poitiers", "Paris", 1420));
        trains.add(new Train("TR129", "Poitiers", "Paris", 1710));
        
        
        bookTrains.add(new BookTrain("AB12", trains.get(0), 123));
        bookTrains.add(new BookTrain("XY48", trains.get(1), 245));
        bookTrains.add(new BookTrain("EF86", trains.get(2), 23));
    }
    
    public static List<Train> getTrains(){
        return trains;
    }
    
    
    public static Train getTrainById(String numTrain){
        return trains.stream().filter(t -> t.getNumTrain().equals(numTrain)).findFirst().orElse(new Train());
    }
    
    
    public static List<Train> searchTrainsByCriteria(String departure, String arrival, int heureDepart) {

    List<Train> result = trains.stream()
            .filter(t -> 
                t.getHeureDepart() == heureDepart &&
                t.getVillaArrive().equals(arrival) &&
                t.getVilleDepart().equals(departure))
            .collect(Collectors.toList());
    
    return result.isEmpty() ? new ArrayList<>() : result;
}

    
    public static List<BookTrain> getBookTrains(){
        return bookTrains;
    }
    
    public static BookTrain getBookTrainById(String bookNumber){
        return bookTrains.stream().filter(t ->
                t.getBooknumber().equals(bookNumber)
        ).findFirst().orElse(new BookTrain());
    }
}
