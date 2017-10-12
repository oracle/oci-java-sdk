/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class GetCrossConnectStatusConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GetCrossConnectStatusRequest interceptRequest(
            GetCrossConnectStatusRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, GetCrossConnectStatusRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCrossConnectId() == null) {
            throw new NullPointerException("crossConnectId is required");
        }

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("crossConnects")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getCrossConnectId()))
                        .path("status");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, GetCrossConnectStatusResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCrossConnectStatusResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, GetCrossConnectStatusResponse>() {
                            @Override
                            public GetCrossConnectStatusResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for GetCrossConnectStatusResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        CrossConnectStatus>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        CrossConnectStatus.class);

                                com.oracle.bmc.http.internal.WithHeaders<CrossConnectStatus>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GetCrossConnectStatusResponse.Builder builder =
                                        GetCrossConnectStatusResponse.builder();

                                builder.crossConnectStatus(response.getItem());

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

                                GetCrossConnectStatusResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
