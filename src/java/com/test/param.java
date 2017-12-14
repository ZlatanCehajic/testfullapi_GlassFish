/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author ZLATAN
 */
@Path("testparam")
public class param {
    
    @GET
    @Path("/passpath/{id}")
    @Produces("text/plain")
    public String getByPath(@PathParam("id") int id){
        
        return "id : "+id;
    }
    
    
    
    
}
