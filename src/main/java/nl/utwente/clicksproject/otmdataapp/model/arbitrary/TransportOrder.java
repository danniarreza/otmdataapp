package nl.utwente.clicksproject.otmdataapp.model.arbitrary;

public class TransportOrder {
    
    private String transport_order_id;
    private String transport_order_description;


    public TransportOrder(String transport_order_id, String transport_order_description) {
        this.transport_order_id = transport_order_id;
        this.transport_order_description = transport_order_description;
    }


    public String getTransport_order_id() {
        return this.transport_order_id;
    }

    public void setTransport_order_id(String transport_order_id) {
        this.transport_order_id = transport_order_id;
    }

    public String getTransport_order_description() {
        return this.transport_order_description;
    }

    public void setTransport_order_description(String transport_order_description) {
        this.transport_order_description = transport_order_description;
    }


}
