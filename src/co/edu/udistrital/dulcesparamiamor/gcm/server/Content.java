package co.edu.udistrital.dulcesparamiamor.gcm.server;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Oscar
 */
public class Content implements Serializable {

    private List<String> registration_ids;
    private Map<String,String> data;

    public void addRegId(String regId){
        if(registration_ids == null){
            registration_ids = new LinkedList();
        }
        registration_ids.add(regId);
    }

    public void createData(String title, String message){
        if(data == null){
            data = new HashMap();
        }

        data.put("title", title);
        data.put("message", message);
    }
}