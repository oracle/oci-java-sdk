/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.distributeddatabasev26.model.*;
import com.oracle.bmc.distributeddatabasev26.requests.*;
import com.oracle.bmc.distributeddatabasev26.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
public class GetDistributedAutonomousDatabaseRaftMetricConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    GetDistributedAutonomousDatabaseRaftMetricConverter.class);

    public static com.oracle.bmc.distributeddatabasev26.requests
                    .GetDistributedAutonomousDatabaseRaftMetricRequest
            interceptRequest(
                    com.oracle.bmc.distributeddatabasev26.requests
                                    .GetDistributedAutonomousDatabaseRaftMetricRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.distributeddatabasev26.requests
                            .GetDistributedAutonomousDatabaseRaftMetricRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getDistributedAutonomousDatabaseId(),
                "distributedAutonomousDatabaseId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20260101")
                        .path("distributedAutonomousDatabases")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDistributedAutonomousDatabaseId()))
                        .path("raftMetrics");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

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
                    com.oracle.bmc.distributeddatabasev26.responses
                            .GetDistributedAutonomousDatabaseRaftMetricResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.distributeddatabasev26.responses
                            .GetDistributedAutonomousDatabaseRaftMetricResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.distributeddatabasev26.responses
                                .GetDistributedAutonomousDatabaseRaftMetricResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.distributeddatabasev26.responses
                                        .GetDistributedAutonomousDatabaseRaftMetricResponse>() {
                            @Override
                            public com.oracle.bmc.distributeddatabasev26.responses
                                            .GetDistributedAutonomousDatabaseRaftMetricResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.distributeddatabasev26.responses.GetDistributedAutonomousDatabaseRaftMetricResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.distributeddatabasev26.model
                                                                .DistributedAutonomousDatabaseRaftMetric>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.distributeddatabasev26.model
                                                                    .DistributedAutonomousDatabaseRaftMetric
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.distributeddatabasev26.model
                                                                    .DistributedAutonomousDatabaseRaftMetric
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.distributeddatabasev26.model
                                                        .DistributedAutonomousDatabaseRaftMetric>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.distributeddatabasev26.responses
                                                .GetDistributedAutonomousDatabaseRaftMetricResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.distributeddatabasev26.responses
                                                        .GetDistributedAutonomousDatabaseRaftMetricResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.distributedAutonomousDatabaseRaftMetric(response.getItem());

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

                                com.oracle.bmc.distributeddatabasev26.responses
                                                .GetDistributedAutonomousDatabaseRaftMetricResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
