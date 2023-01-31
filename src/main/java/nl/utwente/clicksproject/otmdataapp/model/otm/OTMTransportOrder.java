package nl.utwente.clicksproject.otmdataapp.model.otm;

import java.util.List;

public class OTMTransportOrder {
    
    private String id;
    private String description;
    private List<OTMConsignment> consignments;     

    public OTMTransportOrder() {
    }

    public OTMTransportOrder(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public OTMTransportOrder(String id, String description, List<OTMConsignment> consignments) {
        this.id = id;
        this.description = description;
        this.consignments = consignments;
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

    public List<OTMConsignment> getConsignments() {
        return this.consignments;
    }

    public void setConsignments(List<OTMConsignment> consignments) {
        this.consignments = consignments;
    }


}
