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
public class GetWorkRequestConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static GetWorkRequestRequest interceptRequest(GetWorkRequestRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(RestClient client, GetWorkRequestRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getWorkRequestId() == null) {
            throw new NullPointerException("workRequestId is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20170115")
                        .path("loadBalancerWorkRequests")
                        .path(encodePathSegment(request.getWorkRequestId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static Function<Response, GetWorkRequestResponse> fromResponse() {
        final Function<Response, GetWorkRequestResponse> transformer =
                new Function<Response, GetWorkRequestResponse>() {
                    @Override
                    public GetWorkRequestResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for GetWorkRequestResponse");
                        Function<Response, WithHeaders<WorkRequest>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(WorkRequest.class);

                        WithHeaders<WorkRequest> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetWorkRequestResponse.Builder builder = GetWorkRequestResponse.builder();

                        builder.workRequest(response.getItem());

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        GetWorkRequestResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
