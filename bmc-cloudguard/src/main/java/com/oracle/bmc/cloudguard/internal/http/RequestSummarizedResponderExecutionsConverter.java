/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.cloudguard.model.*;
import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.extern.slf4j.Slf4j
public class RequestSummarizedResponderExecutionsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.cloudguard.requests.RequestSummarizedResponderExecutionsRequest
            interceptRequest(
                    com.oracle.bmc.cloudguard.requests.RequestSummarizedResponderExecutionsRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.cloudguard.requests.RequestSummarizedResponderExecutionsRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(
                request.getResponderExecutionsDimensions(),
                "responderExecutionsDimensions is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200131")
                        .path("responderExecutions")
                        .path("actions")
                        .path("summarize");

        target =
                com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                        target,
                        "responderExecutionsDimensions",
                        request.getResponderExecutionsDimensions(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi);

        if (request.getResponderTypeFilter() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "responderTypeFilter",
                            request.getResponderTypeFilter(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getResponderExecutionStatusFilter() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "responderExecutionStatusFilter",
                            request.getResponderExecutionStatusFilter(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        if (request.getCompartmentIdInSubtree() != null) {
            target =
                    target.queryParam(
                            "compartmentIdInSubtree",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getCompartmentIdInSubtree()));
        }

        if (request.getAccessLevel() != null) {
            target =
                    target.queryParam(
                            "accessLevel",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getAccessLevel().getValue()));
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

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.cloudguard.responses
                            .RequestSummarizedResponderExecutionsResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.cloudguard.responses
                                .RequestSummarizedResponderExecutionsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.cloudguard.responses
                                        .RequestSummarizedResponderExecutionsResponse>() {
                            @Override
                            public com.oracle.bmc.cloudguard.responses
                                            .RequestSummarizedResponderExecutionsResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.cloudguard.responses.RequestSummarizedResponderExecutionsResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        ResponderExecutionAggregationCollection>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        ResponderExecutionAggregationCollection
                                                                .class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                ResponderExecutionAggregationCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.cloudguard.responses
                                                .RequestSummarizedResponderExecutionsResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.cloudguard.responses
                                                        .RequestSummarizedResponderExecutionsResponse
                                                        .builder();

                                builder.responderExecutionAggregationCollection(response.getItem());

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

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcNextPageHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.cloudguard.responses
                                                .RequestSummarizedResponderExecutionsResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
