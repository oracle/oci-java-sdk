/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class ConnectLocalPeeringGatewaysConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static ConnectLocalPeeringGatewaysRequest interceptRequest(
            ConnectLocalPeeringGatewaysRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            ConnectLocalPeeringGatewaysRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getLocalPeeringGatewayId() == null) {
            throw new NullPointerException("localPeeringGatewayId is required");
        }

        if (request.getConnectLocalPeeringGatewaysDetails() == null) {
            throw new NullPointerException("connectLocalPeeringGatewaysDetails is required");
        }

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("localPeeringGateways")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getLocalPeeringGatewayId()))
                        .path("actions")
                        .path("connect");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, ConnectLocalPeeringGatewaysResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ConnectLocalPeeringGatewaysResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, ConnectLocalPeeringGatewaysResponse>() {
                            @Override
                            public ConnectLocalPeeringGatewaysResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for ConnectLocalPeeringGatewaysResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create();

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                ConnectLocalPeeringGatewaysResponse.Builder builder =
                                        ConnectLocalPeeringGatewaysResponse.builder();

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

                                ConnectLocalPeeringGatewaysResponse responseWrapper =
                                        builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
