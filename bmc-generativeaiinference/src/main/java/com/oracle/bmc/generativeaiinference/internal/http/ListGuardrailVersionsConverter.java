/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.generativeaiinference.model.*;
import com.oracle.bmc.generativeaiinference.requests.*;
import com.oracle.bmc.generativeaiinference.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class ListGuardrailVersionsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListGuardrailVersionsConverter.class);

    public static com.oracle.bmc.generativeaiinference.requests.ListGuardrailVersionsRequest
            interceptRequest(
                    com.oracle.bmc.generativeaiinference.requests.ListGuardrailVersionsRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.generativeaiinference.requests.ListGuardrailVersionsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getOpcCompartmentId(), "opcCompartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        com.oracle.bmc.http.internal.WrappedWebTarget newBaseTarget =
                com.oracle.bmc.internal.EndpointBuilder.populateServiceParametersInEndpoint(
                        client, requiredParametersMap);

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                newBaseTarget.path("/20231130").path("guardrailVersions");

        if (request.getState() != null) {
            target =
                    target.queryParam(
                            "state",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getState().getValue()));
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

        ib.header("opc-compartment-id", request.getOpcCompartmentId());

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.generativeaiinference.responses.ListGuardrailVersionsResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.generativeaiinference.responses.ListGuardrailVersionsResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.generativeaiinference.responses
                                .ListGuardrailVersionsResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.generativeaiinference.responses
                                        .ListGuardrailVersionsResponse>() {
                            @Override
                            public com.oracle.bmc.generativeaiinference.responses
                                            .ListGuardrailVersionsResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.generativeaiinference.responses.ListGuardrailVersionsResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.generativeaiinference.model
                                                                .GuardrailVersionCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.generativeaiinference.model
                                                                    .GuardrailVersionCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.generativeaiinference.model
                                                                    .GuardrailVersionCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.generativeaiinference.model
                                                        .GuardrailVersionCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.generativeaiinference.responses
                                                .ListGuardrailVersionsResponse.Builder
                                        builder =
                                                com.oracle.bmc.generativeaiinference.responses
                                                        .ListGuardrailVersionsResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.guardrailVersionCollection(response.getItem());

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

                                com.oracle.bmc.generativeaiinference.responses
                                                .ListGuardrailVersionsResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
