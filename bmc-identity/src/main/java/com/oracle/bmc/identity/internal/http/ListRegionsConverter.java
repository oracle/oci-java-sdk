/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.internal.http;

import com.oracle.bmc.identity.model.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class ListRegionsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static ListRegionsRequest interceptRequest(ListRegionsRequest request) {

        return request;
    }

    public static javax.ws.rs.client.Invocation.Builder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, ListRegionsRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        javax.ws.rs.client.WebTarget target =
                client.getBaseTarget().path("/20160918").path("regions");

        javax.ws.rs.client.Invocation.Builder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, ListRegionsResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListRegionsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, ListRegionsResponse>() {
                            @Override
                            public ListRegionsResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for ListRegionsResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.util.List<Region>>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        new javax.ws.rs.core.GenericType<
                                                                java.util.List<Region>>() {});

                                com.oracle.bmc.http.internal.WithHeaders<java.util.List<Region>>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                ListRegionsResponse.Builder builder = ListRegionsResponse.builder();

                                builder.items(response.getItem());

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

                                ListRegionsResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
