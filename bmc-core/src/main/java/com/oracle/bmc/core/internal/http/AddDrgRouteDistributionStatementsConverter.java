/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class AddDrgRouteDistributionStatementsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AddDrgRouteDistributionStatementsConverter.class);

    public static com.oracle.bmc.core.requests.AddDrgRouteDistributionStatementsRequest
            interceptRequest(
                    com.oracle.bmc.core.requests.AddDrgRouteDistributionStatementsRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.core.requests.AddDrgRouteDistributionStatementsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getDrgRouteDistributionId(), "drgRouteDistributionId must not be blank");
        Validate.notNull(
                request.getAddDrgRouteDistributionStatementsDetails(),
                "addDrgRouteDistributionStatementsDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("drgRouteDistributions")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDrgRouteDistributionId()))
                        .path("actions")
                        .path("addDrgRouteDistributionStatements");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.core.responses.AddDrgRouteDistributionStatementsResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.core.responses.AddDrgRouteDistributionStatementsResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.core.responses.AddDrgRouteDistributionStatementsResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.core.responses
                                        .AddDrgRouteDistributionStatementsResponse>() {
                            @Override
                            public com.oracle.bmc.core.responses
                                            .AddDrgRouteDistributionStatementsResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.core.responses.AddDrgRouteDistributionStatementsResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.util.List<
                                                                com.oracle.bmc.core.model
                                                                        .DrgRouteDistributionStatement>>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    new javax.ws.rs.core.GenericType<
                                                            java.util.List<
                                                                    com.oracle.bmc.core.model
                                                                            .DrgRouteDistributionStatement>>() {},
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    new javax.ws.rs.core.GenericType<
                                                            java.util.List<
                                                                    com.oracle.bmc.core.model
                                                                            .DrgRouteDistributionStatement>>() {});
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                java.util.List<
                                                        com.oracle.bmc.core.model
                                                                .DrgRouteDistributionStatement>>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.core.responses
                                                .AddDrgRouteDistributionStatementsResponse.Builder
                                        builder =
                                                com.oracle.bmc.core.responses
                                                        .AddDrgRouteDistributionStatementsResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.items(response.getItem());

                                java.util.Optional<java.util.List<String>> opcRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.core.responses
                                                .AddDrgRouteDistributionStatementsResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
