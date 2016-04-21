/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.dulcesparamiamor.gcm.server;

/**
 *
 * @author Oscar
 */
public class GCMServer {

    /**
     * @param args the command line arguments
     */
        public static void main( String[] args )
    {
        System.out.println( "Sending POST to GCM" );

        String apiKey = "AIzaSyBTw6dsE3YkhvERyMULDr5W-ohQe-4sBkA";
        Content content = createContent();

        POST2GCM.post(apiKey, content);
    }

    public static Content createContent(){

        Content c = new Content();

        c.addRegId("APA91bFXgT6uHojJxxJ6JFlHwDATp7bcMjafO2E3qHt2oOn-TIiSQoG7OxPCRziW3E2nCMyI5hHO8ePVJDgJa8Y0rAp0lFRVdafTI_w_dstPUGBCGJayVkrRVOeCkayQrJ_UbdL7r9SZiJxJpAPkkFOlWsuQz6ZlQg");
        c.createData("Enviar MSJS", "Esta es una prueba del pushNotifications");

        return c;
    }
}



