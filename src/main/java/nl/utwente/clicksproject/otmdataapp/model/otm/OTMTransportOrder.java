package nl.utwente.clicksproject.otmdataapp.model.otm;

import io.swagger.v3.oas.annotations.media.Schema;

public class OTMTransportOrder {
    
    private String id;
    private String description;
    

    public OTMTransportOrder(String id, String description) {
        this.id = id;
        this.description = description;
    }
    

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
