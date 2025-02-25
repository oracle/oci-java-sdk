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
public class ListInternalOccHandoverResourceBlockDetailsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    ListInternalOccHandoverResourceBlockDetailsConverter.class);

    public static com.oracle.bmc.capacitymanagement.requests
                    .ListInternalOccHandoverResourceBlockDetailsRequest
            interceptRequest(
                    com.oracle.bmc.capacitymanagement.requests
                                    .ListInternalOccHandoverResourceBlockDetailsRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.capacitymanagement.requests
                            .ListInternalOccHandoverResourceBlockDetailsRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(
                request.getOccHandoverResourceBlockId(), "occHandoverResourceBlockId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20231107")
                        .path("internal")
                        .path("occHandoverResourceBlockDetails");

        target =
                target.queryParam(
                        "occHandoverResourceBlockId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getOccHandoverResourceBlockId()));

        if (request.getHostId() != null) {
            target =
                    target.queryParam(
                            "hostId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getHostId()));
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
                            .ListInternalOccHandoverResourceBlockDetailsResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.capacitymanagement.responses
                            .ListInternalOccHandoverResourceBlockDetailsResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.capacitymanagement.responses
                                .ListInternalOccHandoverResourceBlockDetailsResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.capacitymanagement.responses
                                        .ListInternalOccHandoverResourceBlockDetailsResponse>() {
                            @Override
                            public com.oracle.bmc.capacitymanagement.responses
                                            .ListInternalOccHandoverResourceBlockDetailsResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.capacitymanagement.responses.ListInternalOccHandoverResourceBlockDetailsResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.capacitymanagement.model
                                                                .OccHandoverResourceBlockDetailCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.capacitymanagement.model
                                                                    .OccHandoverResourceBlockDetailCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.capacitymanagement.model
                                                                    .OccHandoverResourceBlockDetailCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.capacitymanagement.model
                                                        .OccHandoverResourceBlockDetailCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.capacitymanagement.responses
                                                .ListInternalOccHandoverResourceBlockDetailsResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.capacitymanagement.responses
                                                        .ListInternalOccHandoverResourceBlockDetailsResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.occHandoverResourceBlockDetailCollection(
                                        response.getItem());

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
                                                .ListInternalOccHandoverResourceBlockDetailsResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
