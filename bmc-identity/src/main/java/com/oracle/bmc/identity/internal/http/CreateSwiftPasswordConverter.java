/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.internal.http;

import com.oracle.bmc.identity.model.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class CreateSwiftPasswordConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static CreateSwiftPasswordRequest interceptRequest(CreateSwiftPasswordRequest request) {

        return request;
    }

    public static javax.ws.rs.client.Invocation.Builder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, CreateSwiftPasswordRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCreateSwiftPasswordDetails() == null) {
            throw new NullPointerException("createSwiftPasswordDetails is required");
        }

        if (request.getUserId() == null) {
            throw new NullPointerException("userId is required");
        }

        javax.ws.rs.client.WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("users")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getUserId()))
                        .path("swiftPasswords");

        javax.ws.rs.client.Invocation.Builder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, CreateSwiftPasswordResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateSwiftPasswordResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, CreateSwiftPasswordResponse>() {
                            @Override
                            public CreateSwiftPasswordResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for CreateSwiftPasswordResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        SwiftPassword>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        SwiftPassword.class);

                                com.oracle.bmc.http.internal.WithHeaders<SwiftPassword> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                CreateSwiftPasswordResponse.Builder builder =
                                        CreateSwiftPasswordResponse.builder();

                                builder.swiftPassword(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

                                CreateSwiftPasswordResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
