package nl.utwente.clicksproject.otmdataapp.controller;

import lombok.RequiredArgsConstructor;
import nl.utwente.clicksproject.otmdataapp.model.arbitrary.TransportOrder;
import nl.utwente.clicksproject.otmdataapp.model.otm.OTMTransportOrder;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/transportorder")
@Tag(name = "Transport Order", description = "Transform Transport Order data structure to OTM compliant.")
public class TransportOrderController {

    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200", 
            description = "OK",
            content = {@Content(
                mediaType = "application/json", 
                schema = @Schema(
                        implementation = OTMTransportOrder.class
                    )
                )
            }
        )
    })
    @PostMapping()
    public ResponseEntity<?> create(@RequestBody TransportOrder transportOrder) {

        
        try {
            //TODO Implement Your Logic To Save Data And Return Result Through ResponseEntity



            OTMTransportOrder otmTransportOrder = new OTMTransportOrder(
                transportOrder.getTransport_order_id(), 
                transportOrder.getTransport_order_description()
            );

            return new ResponseEntity<>(otmTransportOrder, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
