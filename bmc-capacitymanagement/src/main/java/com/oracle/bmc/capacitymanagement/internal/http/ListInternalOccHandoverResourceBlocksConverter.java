/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.capacitymanagement.model.*;
import com.oracle.bmc.capacitymanagement.requests.*;
import com.oracle.bmc.capacitymanagement.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class ListInternalOccHandoverResourceBlocksConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListInternalOccHandoverResourceBlocksConverter.class);

    public static com.oracle.bmc.capacitymanagement.requests
                    .ListInternalOccHandoverResourceBlocksRequest
            interceptRequest(
                    com.oracle.bmc.capacitymanagement.requests
                                    .ListInternalOccHandoverResourceBlocksRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.capacitymanagement.requests.ListInternalOccHandoverResourceBlocksRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getNamespace(), "namespace is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");
        Validate.notNull(request.getOccCustomerGroupId(), "occCustomerGroupId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20231107")
                        .path("internal")
                        .path("occHandoverResourceBlocks");

        target =
                target.queryParam(
                        "namespace",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getNamespace().getValue()));

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        target =
                target.queryParam(
                        "occCustomerGroupId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getOccCustomerGroupId()));

        if (request.getHandoverResourceName() != null) {
            target =
                    target.queryParam(
                            "handoverResourceName",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getHandoverResourceName()));
        }

        if (request.getHandoverDateGreaterThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "handoverDateGreaterThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getHandoverDateGreaterThanOrEqualTo()));
        }

        if (request.getHandoverDateLessThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "handoverDateLessThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getHandoverDateLessThanOrEqualTo()));
        }

        if (request.getOccHandoverResourceBlockId() != null) {
            target =
                    target.queryParam(
                            "occHandoverResourceBlockId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getOccHandoverResourceBlockId()));
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
                    com.oracle.bmc.capacitymanagement.responses
                            .ListInternalOccHandoverResourceBlocksResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.capacitymanagement.responses
                            .ListInternalOccHandoverResourceBlocksResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.capacitymanagement.responses
                                .ListInternalOccHandoverResourceBlocksResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.capacitymanagement.responses
                                        .ListInternalOccHandoverResourceBlocksResponse>() {
                            @Override
                            public com.oracle.bmc.capacitymanagement.responses
                                            .ListInternalOccHandoverResourceBlocksResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.capacitymanagement.responses.ListInternalOccHandoverResourceBlocksResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.capacitymanagement.model
                                                                .OccHandoverResourceBlockCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.capacitymanagement.model
                                                                    .OccHandoverResourceBlockCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.capacitymanagement.model
                                                                    .OccHandoverResourceBlockCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.capacitymanagement.model
                                                        .OccHandoverResourceBlockCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.capacitymanagement.responses
                                                .ListInternalOccHandoverResourceBlocksResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.capacitymanagement.responses
                                                        .ListInternalOccHandoverResourceBlocksResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.occHandoverResourceBlockCollection(response.getItem());

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

                                com.oracle.bmc.capacitymanagement.responses
                                                .ListInternalOccHandoverResourceBlocksResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
