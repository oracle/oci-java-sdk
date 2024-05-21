/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.fusionapps.model.*;
import com.oracle.bmc.fusionapps.requests.*;
import com.oracle.bmc.fusionapps.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class ListScheduledActivitiesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListScheduledActivitiesConverter.class);

    public static com.oracle.bmc.fusionapps.requests.ListScheduledActivitiesRequest
            interceptRequest(
                    com.oracle.bmc.fusionapps.requests.ListScheduledActivitiesRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.fusionapps.requests.ListScheduledActivitiesRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getFusionEnvironmentId(), "fusionEnvironmentId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20211201")
                        .path("fusionEnvironments")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getFusionEnvironmentId()))
                        .path("scheduledActivities");

        if (request.getDisplayName() != null) {
            target =
                    target.queryParam(
                            "displayName",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getDisplayName()));
        }

        if (request.getTimeScheduledStartGreaterThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "timeScheduledStartGreaterThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeScheduledStartGreaterThanOrEqualTo()));
        }

        if (request.getTimeExpectedFinishLessThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "timeExpectedFinishLessThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeExpectedFinishLessThanOrEqualTo()));
        }

        if (request.getRunCycle() != null) {
            target =
                    target.queryParam(
                            "runCycle",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getRunCycle().getValue()));
        }

        if (request.getLifecycleState() != null) {
            target =
                    target.queryParam(
                            "lifecycleState",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLifecycleState().getValue()));
        }

        if (request.getScheduledActivityAssociationId() != null) {
            target =
                    target.queryParam(
                            "scheduledActivityAssociationId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getScheduledActivityAssociationId()));
        }

        if (request.getScheduledActivityPhase() != null) {
            target =
                    target.queryParam(
                            "scheduledActivityPhase",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getScheduledActivityPhase().getValue()));
        }

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        if (request.getPage() != null) {
            target =
                    target.queryParam(
                            "page",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPage()));
        }

        if (request.getSortOrder() != null) {
            target =
                    target.queryParam(
                            "sortOrder",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortOrder().getValue()));
        }

        if (request.getSortBy() != null) {
            target =
                    target.queryParam(
                            "sortBy",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortBy().getValue()));
        }

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
                    com.oracle.bmc.fusionapps.responses.ListScheduledActivitiesResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.fusionapps.responses.ListScheduledActivitiesResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.fusionapps.responses.ListScheduledActivitiesResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.fusionapps.responses
                                        .ListScheduledActivitiesResponse>() {
                            @Override
                            public com.oracle.bmc.fusionapps.responses
                                            .ListScheduledActivitiesResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.fusionapps.responses.ListScheduledActivitiesResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.fusionapps.model
                                                                .ScheduledActivityCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.fusionapps.model
                                                                    .ScheduledActivityCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.fusionapps.model
                                                                    .ScheduledActivityCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.fusionapps.model
                                                        .ScheduledActivityCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.fusionapps.responses.ListScheduledActivitiesResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.fusionapps.responses
                                                        .ListScheduledActivitiesResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.scheduledActivityCollection(response.getItem());

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

                                java.util.Optional<java.util.List<String>> opcNextPageHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.fusionapps.responses.ListScheduledActivitiesResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
