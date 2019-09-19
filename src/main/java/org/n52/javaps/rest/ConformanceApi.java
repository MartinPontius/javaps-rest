package org.n52.javaps.rest;

import io.swagger.model.ReqClasses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface ConformanceApi {

    String BASE_URL = RootApi.BASE_URL + "/conformance";

    @ResponseBody
    @GetMapping(value = BASE_URL, produces = MediaTypes.APPLICATION_JSON)
    ReqClasses getConformanceClasses();
}