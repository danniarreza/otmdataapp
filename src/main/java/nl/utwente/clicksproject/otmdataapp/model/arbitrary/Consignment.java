package nl.utwente.clicksproject.otmdataapp.model.arbitrary;

public class Consignment {

    private String consignment_id;
    private String consignment_description;

    public Consignment() {
    }

    public Consignment(String consignment_id, String consignment_description) {
        this.consignment_id = consignment_id;
        this.consignment_description = consignment_description;
    }

    public String getConsignment_id() {
        return this.consignment_id;
    }

    public void setConsignment_id(String consignment_id) {
        this.consignment_id = consignment_id;
    }

    public String getConsignment_description() {
        return this.consignment_description;
    }

    public void setConsignment_description(String consignment_description) {
        this.consignment_description = consignment_description;
    }

    
}
