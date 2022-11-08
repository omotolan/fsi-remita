package controller;


import dtos.AuthRequest;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("api/v1/auth")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthenticationController {
//    @Inject
//    AuthService authService;

    @POST
    public Response authenticate(@Valid AuthRequest authRequest) {
        return Response.ok()
                .build();
    }
}
