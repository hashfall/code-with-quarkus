package com.hashfall;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/welcome")
public class WelcomeSource {
    @GET
    public String welcomeMessage() {
        return "Welcome to Quarkus";
    }    
}
