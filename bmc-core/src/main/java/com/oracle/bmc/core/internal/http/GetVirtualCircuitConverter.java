/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

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
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class GetVirtualCircuitConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static GetVirtualCircuitRequest interceptRequest(GetVirtualCircuitRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, GetVirtualCircuitRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getVirtualCircuitId() == null) {
            throw new NullPointerException("virtualCircuitId is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("virtualCircuits")
                        .path(encodePathSegment(request.getVirtualCircuitId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        return ib;
    }

    public static Function<Response, GetVirtualCircuitResponse> fromResponse() {
        final Function<Response, GetVirtualCircuitResponse> transformer =
                new Function<Response, GetVirtualCircuitResponse>() {
                    @Override
                    public GetVirtualCircuitResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for GetVirtualCircuitResponse");
                        Function<Response, WithHeaders<VirtualCircuit>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(VirtualCircuit.class);

                        WithHeaders<VirtualCircuit> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetVirtualCircuitResponse.Builder builder =
                                GetVirtualCircuitResponse.builder();

                        builder.virtualCircuit(response.getItem());

                        Optional<List<String>> etagHeader = HeaderUtils.get(headers, "etag");
                        if (etagHeader.isPresent()) {
                            builder.etag(
                                    HeaderUtils.toValue(
                                            "etag", etagHeader.get().get(0), String.class));
                        }

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        GetVirtualCircuitResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
