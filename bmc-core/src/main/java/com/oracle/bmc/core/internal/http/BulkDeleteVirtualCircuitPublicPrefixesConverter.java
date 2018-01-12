/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class BulkDeleteVirtualCircuitPublicPrefixesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static BulkDeleteVirtualCircuitPublicPrefixesRequest interceptRequest(
            BulkDeleteVirtualCircuitPublicPrefixesRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            BulkDeleteVirtualCircuitPublicPrefixesRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getVirtualCircuitId() == null) {
            throw new NullPointerException("virtualCircuitId is required");
        }

        if (request.getBulkDeleteVirtualCircuitPublicPrefixesDetails() == null) {
            throw new NullPointerException(
                    "bulkDeleteVirtualCircuitPublicPrefixesDetails is required");
        }

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("virtualCircuits")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getVirtualCircuitId()))
                        .path("actions")
                        .path("bulkDeletePublicPrefixes");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, BulkDeleteVirtualCircuitPublicPrefixesResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, BulkDeleteVirtualCircuitPublicPrefixesResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                BulkDeleteVirtualCircuitPublicPrefixesResponse>() {
                            @Override
                            public BulkDeleteVirtualCircuitPublicPrefixesResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for BulkDeleteVirtualCircuitPublicPrefixesResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create();

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                BulkDeleteVirtualCircuitPublicPrefixesResponse.Builder builder =
                                        BulkDeleteVirtualCircuitPublicPrefixesResponse.builder();

                                BulkDeleteVirtualCircuitPublicPrefixesResponse responseWrapper =
                                        builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
