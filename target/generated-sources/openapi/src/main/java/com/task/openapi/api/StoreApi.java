/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.task.openapi.api;

import com.task.openapi.model.Order;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-13T22:31:27.904128+01:00[Europe/Madrid]")
@Validated
@Api(value = "store", description = "the store API")
public interface StoreApi {

    default StoreApiDelegate getDelegate() {
        return new StoreApiDelegate() {};
    }

    /**
     * POST /store/order : Place an order for a pet
     *
     * @param body order placed for purchasing the pet (required)
     * @return successful operation (status code 200)
     *         or Invalid Order (status code 400)
     */
    @ApiOperation(value = "Place an order for a pet", nickname = "placeOrder", notes = "", response = Order.class, tags={ "store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid Order") })
    @PostMapping(
        value = "/store/order",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true )  @Valid @RequestBody Order body) {
        return getDelegate().placeOrder(body);
    }

}
