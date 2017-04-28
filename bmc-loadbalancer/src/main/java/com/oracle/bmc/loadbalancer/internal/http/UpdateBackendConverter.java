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
public class UpdateBackendConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static UpdateBackendRequest interceptRequest(UpdateBackendRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(RestClient client, UpdateBackendRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getUpdateBackendDetails() == null) {
            throw new NullPointerException("updateBackendDetails is required");
        }

        if (request.getLoadBalancerId() == null) {
            throw new NullPointerException("loadBalancerId is required");
        }

        if (request.getBackendSetName() == null) {
            throw new NullPointerException("backendSetName is required");
        }

        if (request.getBackendName() == null) {
            throw new NullPointerException("backendName is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20170115")
                        .path("loadBalancers")
                        .path(encodePathSegment(request.getLoadBalancerId()))
                        .path("backendSets")
                        .path(encodePathSegment(request.getBackendSetName()))
                        .path("backends")
                        .path(encodePathSegment(request.getBackendName()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        return ib;
    }

    public static Function<Response, UpdateBackendResponse> fromResponse() {
        final Function<Response, UpdateBackendResponse> transformer =
                new Function<Response, UpdateBackendResponse>() {
                    @Override
                    public UpdateBackendResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for UpdateBackendResponse");
                        Function<Response, WithHeaders<Void>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create();

                        WithHeaders<Void> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        UpdateBackendResponse.Builder builder = UpdateBackendResponse.builder();

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        Optional<List<String>> opcWorkRequestIdHeader =
                                HeaderUtils.get(headers, "opc-work-request-id");
                        if (opcWorkRequestIdHeader.isPresent()) {
                            builder.opcWorkRequestId(
                                    HeaderUtils.toValue(
                                            "opc-work-request-id",
                                            opcWorkRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        UpdateBackendResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
