/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.streaming.model.*;
import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.extern.slf4j.Slf4j
public class ChangeConnectHarnessCompartmentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static ChangeConnectHarnessCompartmentRequest interceptRequest(
            ChangeConnectHarnessCompartmentRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            ChangeConnectHarnessCompartmentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getConnectHarnessId(), "connectHarnessId must not be blank");
        Validate.notNull(
                request.getChangeConnectHarnessCompartmentDetails(),
                "changeConnectHarnessCompartmentDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20180418")
                        .path("connectharnesses")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getConnectHarnessId()))
                        .path("actions")
                        .path("changeCompartment");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, ChangeConnectHarnessCompartmentResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeConnectHarnessCompartmentResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                ChangeConnectHarnessCompartmentResponse>() {
                            @Override
                            public ChangeConnectHarnessCompartmentResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for ChangeConnectHarnessCompartmentResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create();

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                ChangeConnectHarnessCompartmentResponse.Builder builder =
                                        ChangeConnectHarnessCompartmentResponse.builder();

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

                                ChangeConnectHarnessCompartmentResponse responseWrapper =
                                        builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
