package com.udea.workshop.motorcycleapi.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ResponseWrapper<R> extends ResourceSupport {

    private R response;
}
