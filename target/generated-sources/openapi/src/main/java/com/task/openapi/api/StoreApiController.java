package com.task.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-13T22:31:27.904128+01:00[Europe/Madrid]")
@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:/v2}")
public class StoreApiController implements StoreApi {

    private final StoreApiDelegate delegate;

    public StoreApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) StoreApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new StoreApiDelegate() {});
    }

    @Override
    public StoreApiDelegate getDelegate() {
        return delegate;
    }

}
