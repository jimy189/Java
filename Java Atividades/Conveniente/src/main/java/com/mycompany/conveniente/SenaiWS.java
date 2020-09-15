/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conveniente;

import com.google.gson.Gson;
import javax.management.Query;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author aluno
 */
@Path("generic")
public class SenaiWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SenaiWS
     */
    public SenaiWS() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.conveniente.SenaiWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        return "teste";
    }

    /**
     * PUT method for updating or creating an instance of SenaiWS
     * @param content representation for the resource
     */
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/subtrair")
    public String subtrair(@QueryParam("v1") String v1, @QueryParam("v2") String v2) {
        double v11=Double.parseDouble(v1);
        double v12=Double.parseDouble(v2);
        double res=v11-v12;
        return String.valueOf(res);
    }
    
    
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/somar")
    public String somar(@QueryParam("v1") String v1, @QueryParam("v2") String v2) {
        double v11=Double.parseDouble(v1);
        double v12=Double.parseDouble(v2);
        double res=v11+v12;
        return String.valueOf(res);
    }
    
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/json;charset=UTF-8")
    @Path("/objeto")
    public Aluno getObjeto(@QueryParam("nome") String nome) {
        return new Aluno(1,nome);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/objeto2")
    public String getObjeto2(@QueryParam("nome") String nome) {
        Gson gson = new Gson();
        return (gson.toJson(new Aluno(1,nome)));
    }
    
    
    
     
}
