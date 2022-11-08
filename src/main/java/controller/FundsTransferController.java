package controller;


import dtos.BulkPaymentRequest;
import dtos.LookupAccRequest;
import dtos.SinglePaymentRequest;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("api/v1/transfer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FundsTransferController {


    @POST
    @Path("/account-lookup")
    public Response lookupAccount(@Valid LookupAccRequest authRequest) {
        return Response.ok()
                .build();
    }
    @POST
    @Path("/single-payment")
    public Response singlePayment(@Valid SinglePaymentRequest request){
        return Response.ok()
                .build();
    }

    @GET
    @Path("/single-payment/status/{transactionRef}")
    public Response singlePaymentStatus(@PathParam("transactionRef") String transactionRef){
        return Response.ok()
                .build();
    }

    @POST
    @Path("/bulk-payment")
    public Response bulkPayment(@Valid BulkPaymentRequest request){
        return Response.ok()
                .build();
    }

    @GET
    @Path("/bulk-payment/status/{batchTransRef}")
    public Response bulkPaymentStatus(@PathParam("batchTransRef") String batchTransRef){
        return Response.ok()
                .build();
    }

    @GET
    @Path("/active-banks")
    public Response listActiveBanks(){
        return Response.ok()
                .build();
    }
}
