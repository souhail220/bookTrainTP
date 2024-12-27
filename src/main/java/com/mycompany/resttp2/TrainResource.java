package com.mycompany.resttp2;

import com.mycompany.resttp2.Entities.Train;
import com.mycompany.resttp2.Entities.TrainListWrapper;
import com.mycompany.resttp2.Services.BookTrainBD;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("/trains")
@RequestScoped
public class TrainResource {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response getTrains() {
        TrainListWrapper trainList = new TrainListWrapper(BookTrainBD.getTrains());
        
        return Response.ok(trainList).build();
    }
    
    @GET
    @Path("numTrain{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Response getTrain(@PathParam("id") String numTrain){
        Train train = BookTrainBD.getTrainById(numTrain);
        if(train.getNumTrain() != null){
            return Response
                .status(Status.CREATED)
                .entity(train)
                .build();
        }else{
            return Response
                .status(Status.NOT_FOUND)
                .entity("Train not found")
                .build();
        }
        
    }
    
    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_XML)
    public Response searchTrainsByCriteria(
            @QueryParam("departure") String departure,
            @QueryParam("arrival") String arrival,
            @QueryParam("heureDepart") int heureDepart
            ){
        List<Train> listTrains = BookTrainBD.searchTrainsByCriteria(departure, arrival, heureDepart);
        
        TrainListWrapper wrapper = new TrainListWrapper(listTrains);
        
        return Response
            .status(Status.OK)
            .entity(wrapper)
            .build();
    }
}
