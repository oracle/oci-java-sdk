/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.osmanagementhub.model.*;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListLifecycleEnvironmentsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListLifecycleEnvironmentsConverter.class);

    public static com.oracle.bmc.osmanagementhub.requests.ListLifecycleEnvironmentsRequest
            interceptRequest(
                    com.oracle.bmc.osmanagementhub.requests.ListLifecycleEnvironmentsRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.osmanagementhub.requests.ListLifecycleEnvironmentsRequest request) {
        Validate.notNull(request, "request instance is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20220901").path("lifecycleEnvironments");

        if (request.getCompartmentId() != null) {
            target =
                    target.queryParam(
                            "compartmentId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getCompartmentId()));
        }

        if (request.getDisplayName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "displayName",
                            request.getDisplayName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getDisplayNameContains() != null) {
            target =
                    target.queryParam(
                            "displayNameContains",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getDisplayNameContains()));
        }

        if (request.getLifecycleEnvironmentId() != null) {
            target =
                    target.queryParam(
                            "lifecycleEnvironmentId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLifecycleEnvironmentId()));
        }

        if (request.getArchType() != null) {
            target =
                    target.queryParam(
                            "archType",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getArchType().getValue()));
        }

        if (request.getOsFamily() != null) {
            target =
                    target.queryParam(
                            "osFamily",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getOsFamily().getValue()));
        }

        if (request.getLocation() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "location",
                            request.getLocation(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getLocationNotEqualTo() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "locationNotEqualTo",
                            request.getLocationNotEqualTo(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
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

        if (request.getLifecycleState() != null) {
            target =
                    target.queryParam(
                            "lifecycleState",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLifecycleState().getValue()));
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
                    com.oracle.bmc.osmanagementhub.responses.ListLifecycleEnvironmentsResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.osmanagementhub.responses.ListLifecycleEnvironmentsResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.osmanagementhub.responses.ListLifecycleEnvironmentsResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.osmanagementhub.responses
                                        .ListLifecycleEnvironmentsResponse>() {
                            @Override
                            public com.oracle.bmc.osmanagementhub.responses
                                            .ListLifecycleEnvironmentsResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.osmanagementhub.responses.ListLifecycleEnvironmentsResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.osmanagementhub.model
                                                                .LifecycleEnvironmentCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.osmanagementhub.model
                                                                    .LifecycleEnvironmentCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.osmanagementhub.model
                                                                    .LifecycleEnvironmentCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.osmanagementhub.model
                                                        .LifecycleEnvironmentCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.osmanagementhub.responses
                                                .ListLifecycleEnvironmentsResponse.Builder
                                        builder =
                                                com.oracle.bmc.osmanagementhub.responses
                                                        .ListLifecycleEnvironmentsResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.lifecycleEnvironmentCollection(response.getItem());

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

                                com.oracle.bmc.osmanagementhub.responses
                                                .ListLifecycleEnvironmentsResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
