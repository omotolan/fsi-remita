package controller;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("api/v1/payments")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PaymentController {


    @GET
    @Path("/{transactionId}")
    public Response checkTransactionStatus(@PathParam("transactionId") String transactionId) {
        return Response.ok()
                .build();
    }


}
