package com.revature;

import io.javalin.Javalin;

/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * problem1: retrieve the song object from the request body and return the artist name.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem1", ctx -> {
                String jsonString = ctx.body();

                ObjectMapper om = new ObjectMapper();

                problem1 sn = om.readValue(jsonString, problem1.class);

                problem1 an = om.readValue(jsonString, problem1.class);

                String jsonToBeReturned = om.writeValueAsString(sn);

                ctx.result(jsonToBeReturned);

                String jsonToBeReturnedA = om.writeValueAsString(an);

                ctx.result(jsonToBeReturnedA);
        });

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem2", ctx -> {
            String jsonString = ctx.body();

            ObjectMapper om = new ObjectMapper();
            problem2 user = om.readValue(jsonString, problem2.class);
        
            ctx.contentType("application/songName"); 
        
            user.setLastname("Beatles");
            
            String jsonStringToBeReturned = om.writeValueAsString(user);
        
            ctx.result(jsonStringToBeReturned);
        });


        return app;
    }
    
}
