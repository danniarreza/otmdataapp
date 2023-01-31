package nl.utwente.clicksproject.otmdataapp.model.arbitrary;

import java.util.List;

public class TransportOrder {
    
    private String transport_order_id;
    private String transport_order_description;
    private List<Consignment> consignments;

    public TransportOrder() {
    }

    public TransportOrder(String transport_order_id, String transport_order_description) {
        this.transport_order_id = transport_order_id;
        this.transport_order_description = transport_order_description;
    }

    public TransportOrder(String transport_order_id, String transport_order_description, List<Consignment> consignments) {
        this.transport_order_id = transport_order_id;
        this.transport_order_description = transport_order_description;
        this.consignments = consignments;
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

    public List<Consignment> getConsignments() {
        return this.consignments;
    }

    public void setConsignments(List<Consignment> consignments) {
        this.consignments = consignments;
    }

}
