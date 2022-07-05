/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class BulkDeleteVirtualCircuitPublicPrefixesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    BulkDeleteVirtualCircuitPublicPrefixesConverter.class);

    public static com.oracle.bmc.core.requests.BulkDeleteVirtualCircuitPublicPrefixesRequest
            interceptRequest(
                    com.oracle.bmc.core.requests.BulkDeleteVirtualCircuitPublicPrefixesRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.core.requests.BulkDeleteVirtualCircuitPublicPrefixesRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getVirtualCircuitId(), "virtualCircuitId must not be blank");
        Validate.notNull(
                request.getBulkDeleteVirtualCircuitPublicPrefixesDetails(),
                "bulkDeleteVirtualCircuitPublicPrefixesDetails is required");

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

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.core.responses.BulkDeleteVirtualCircuitPublicPrefixesResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.core.responses.BulkDeleteVirtualCircuitPublicPrefixesResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.core.responses
                                .BulkDeleteVirtualCircuitPublicPrefixesResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.core.responses
                                        .BulkDeleteVirtualCircuitPublicPrefixesResponse>() {
                            @Override
                            public com.oracle.bmc.core.responses
                                            .BulkDeleteVirtualCircuitPublicPrefixesResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.core.responses.BulkDeleteVirtualCircuitPublicPrefixesResponse");
                                final com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    serviceDetails.get());
                                } else {
                                    responseFn = RESPONSE_CONVERSION_FACTORY.create();
                                }

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.core.responses
                                                .BulkDeleteVirtualCircuitPublicPrefixesResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.core.responses
                                                        .BulkDeleteVirtualCircuitPublicPrefixesResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                com.oracle.bmc.core.responses
                                                .BulkDeleteVirtualCircuitPublicPrefixesResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
