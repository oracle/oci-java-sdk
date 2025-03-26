/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetVcnOverlapConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetVcnOverlapConverter.class);

    public static com.oracle.bmc.core.requests.GetVcnOverlapRequest interceptRequest(
            com.oracle.bmc.core.requests.GetVcnOverlapRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.core.requests.GetVcnOverlapRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");
        Validate.notNull(request.getGetVcnOverlapDetails(), "getVcnOverlapDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("ipInventory")
                        .path("vcns")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getVcnId()))
                        .path("overlaps");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response, com.oracle.bmc.core.responses.GetVcnOverlapResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response, com.oracle.bmc.core.responses.GetVcnOverlapResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.core.responses.GetVcnOverlapResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.core.responses.GetVcnOverlapResponse>() {
                            @Override
                            public com.oracle.bmc.core.responses.GetVcnOverlapResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.core.responses.GetVcnOverlapResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.core.model
                                                                .IpInventoryVcnOverlapCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.core.model
                                                                    .IpInventoryVcnOverlapCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.core.model
                                                                    .IpInventoryVcnOverlapCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.core.model
                                                        .IpInventoryVcnOverlapCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.core.responses.GetVcnOverlapResponse.Builder
                                        builder =
                                                com.oracle.bmc.core.responses.GetVcnOverlapResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.ipInventoryVcnOverlapCollection(response.getItem());

                                java.util.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

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

                                java.util.Optional<java.util.List<String>> opcTotalItemsHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-total-items");
                                if (opcTotalItemsHeader.isPresent()) {
                                    builder.opcTotalItems(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-total-items",
                                                    opcTotalItemsHeader.get().get(0),
                                                    Integer.class));
                                }

                                java.util.Optional<java.util.List<String>> opcWorkRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-work-request-id");
                                if (opcWorkRequestIdHeader.isPresent()) {
                                    builder.opcWorkRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-work-request-id",
                                                    opcWorkRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> lifecycleStateHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "lifecycle-state");
                                if (lifecycleStateHeader.isPresent()) {
                                    builder.lifecycleState(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "lifecycle-state",
                                                    lifecycleStateHeader.get().get(0),
                                                    com.oracle.bmc.core.responses
                                                                    .GetVcnOverlapResponse
                                                                    .LifecycleState
                                                            .class));
                                }

                                java.util.Optional<java.util.List<String>> dataRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "data-request-id");
                                if (dataRequestIdHeader.isPresent()) {
                                    builder.dataRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "data-request-id",
                                                    dataRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.core.responses.GetVcnOverlapResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
