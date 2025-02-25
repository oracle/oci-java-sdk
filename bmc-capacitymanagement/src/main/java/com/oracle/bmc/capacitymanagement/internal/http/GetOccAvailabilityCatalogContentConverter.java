/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.internal.http;

import com.oracle.bmc.capacitymanagement.model.*;
import com.oracle.bmc.capacitymanagement.requests.*;
import com.oracle.bmc.capacitymanagement.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class GetOccAvailabilityCatalogContentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetOccAvailabilityCatalogContentConverter.class);

    public static com.oracle.bmc.capacitymanagement.requests.GetOccAvailabilityCatalogContentRequest
            interceptRequest(
                    com.oracle.bmc.capacitymanagement.requests
                                    .GetOccAvailabilityCatalogContentRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.capacitymanagement.requests.GetOccAvailabilityCatalogContentRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getOccAvailabilityCatalogId(),
                "occAvailabilityCatalogId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20231107")
                        .path("occAvailabilityCatalogs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getOccAvailabilityCatalogId()))
                        .path("content");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept("application/binary");

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.capacitymanagement.responses
                            .GetOccAvailabilityCatalogContentResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.capacitymanagement.responses
                            .GetOccAvailabilityCatalogContentResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.capacitymanagement.responses
                                .GetOccAvailabilityCatalogContentResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.capacitymanagement.responses
                                        .GetOccAvailabilityCatalogContentResponse>() {
                            @Override
                            public com.oracle.bmc.capacitymanagement.responses
                                            .GetOccAvailabilityCatalogContentResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.capacitymanagement.responses.GetOccAvailabilityCatalogContentResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.io.InputStream>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    java.io.InputStream.class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    java.io.InputStream.class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<java.io.InputStream>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.capacitymanagement.responses
                                                .GetOccAvailabilityCatalogContentResponse.Builder
                                        builder =
                                                com.oracle.bmc.capacitymanagement.responses
                                                        .GetOccAvailabilityCatalogContentResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.inputStream(response.getItem());

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

                                com.oracle.bmc.capacitymanagement.responses
                                                .GetOccAvailabilityCatalogContentResponse
                                        responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
