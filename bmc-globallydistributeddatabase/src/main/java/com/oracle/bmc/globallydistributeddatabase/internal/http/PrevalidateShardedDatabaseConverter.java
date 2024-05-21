/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.globallydistributeddatabase.model.*;
import com.oracle.bmc.globallydistributeddatabase.requests.*;
import com.oracle.bmc.globallydistributeddatabase.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class PrevalidateShardedDatabaseConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PrevalidateShardedDatabaseConverter.class);

    public static com.oracle.bmc.globallydistributeddatabase.requests
                    .PrevalidateShardedDatabaseRequest
            interceptRequest(
                    com.oracle.bmc.globallydistributeddatabase.requests
                                    .PrevalidateShardedDatabaseRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.globallydistributeddatabase.requests.PrevalidateShardedDatabaseRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");
        Validate.notNull(
                request.getPrevalidateShardedDatabaseDetails(),
                "prevalidateShardedDatabaseDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20230301")
                        .path("shardedDatabases")
                        .path("actions")
                        .path("prevalidate");

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.globallydistributeddatabase.responses
                            .PrevalidateShardedDatabaseResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.globallydistributeddatabase.responses
                            .PrevalidateShardedDatabaseResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.globallydistributeddatabase.responses
                                .PrevalidateShardedDatabaseResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.globallydistributeddatabase.responses
                                        .PrevalidateShardedDatabaseResponse>() {
                            @Override
                            public com.oracle.bmc.globallydistributeddatabase.responses
                                            .PrevalidateShardedDatabaseResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.globallydistributeddatabase.responses.PrevalidateShardedDatabaseResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.globallydistributeddatabase
                                                                .model
                                                                .PrevalidateShardedDatabaseResult>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.globallydistributeddatabase.model
                                                                    .PrevalidateShardedDatabaseResult
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.globallydistributeddatabase.model
                                                                    .PrevalidateShardedDatabaseResult
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.globallydistributeddatabase.model
                                                        .PrevalidateShardedDatabaseResult>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.globallydistributeddatabase.responses
                                                .PrevalidateShardedDatabaseResponse.Builder
                                        builder =
                                                com.oracle.bmc.globallydistributeddatabase.responses
                                                        .PrevalidateShardedDatabaseResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.prevalidateShardedDatabaseResult(response.getItem());

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

                                com.oracle.bmc.globallydistributeddatabase.responses
                                                .PrevalidateShardedDatabaseResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
