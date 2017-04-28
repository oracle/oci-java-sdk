/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.internal.http;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.http.internal.*;
import static com.oracle.bmc.util.internal.HttpUtils.*;
import com.oracle.bmc.model.*;
import com.oracle.bmc.loadbalancer.model.*;
import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Slf4j
public class GetBackendSetConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static GetBackendSetRequest interceptRequest(GetBackendSetRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(RestClient client, GetBackendSetRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getLoadBalancerId() == null) {
            throw new NullPointerException("loadBalancerId is required");
        }

        if (request.getBackendSetName() == null) {
            throw new NullPointerException("backendSetName is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20170115")
                        .path("loadBalancers")
                        .path(encodePathSegment(request.getLoadBalancerId()))
                        .path("backendSets")
                        .path(encodePathSegment(request.getBackendSetName()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static Function<Response, GetBackendSetResponse> fromResponse() {
        final Function<Response, GetBackendSetResponse> transformer =
                new Function<Response, GetBackendSetResponse>() {
                    @Override
                    public GetBackendSetResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for GetBackendSetResponse");
                        Function<Response, WithHeaders<BackendSet>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(BackendSet.class);

                        WithHeaders<BackendSet> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetBackendSetResponse.Builder builder = GetBackendSetResponse.builder();

                        builder.backendSet(response.getItem());

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        GetBackendSetResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
