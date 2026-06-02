/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.jmsutils.model.*;
import com.oracle.bmc.jmsutils.requests.*;
import com.oracle.bmc.jmsutils.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250521")
public class GetJavaMigrationAnalysisConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetJavaMigrationAnalysisConverter.class);

    public static com.oracle.bmc.jmsutils.requests.GetJavaMigrationAnalysisRequest interceptRequest(
            com.oracle.bmc.jmsutils.requests.GetJavaMigrationAnalysisRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.jmsutils.requests.GetJavaMigrationAnalysisRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getJavaMigrationAnalysisId(), "javaMigrationAnalysisId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("javaMigrationAnalysisId", request.getJavaMigrationAnalysisId());
        com.oracle.bmc.http.internal.WrappedWebTarget newBaseTarget =
                com.oracle.bmc.internal.EndpointBuilder.populateServiceParametersInEndpoint(
                        client, requiredParametersMap);

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                newBaseTarget
                        .path("/20250521")
                        .path("javaMigrationAnalysis")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getJavaMigrationAnalysisId()));

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
                    com.oracle.bmc.jmsutils.responses.GetJavaMigrationAnalysisResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.jmsutils.responses.GetJavaMigrationAnalysisResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.jmsutils.responses.GetJavaMigrationAnalysisResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.jmsutils.responses
                                        .GetJavaMigrationAnalysisResponse>() {
                            @Override
                            public com.oracle.bmc.jmsutils.responses
                                            .GetJavaMigrationAnalysisResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.jmsutils.responses.GetJavaMigrationAnalysisResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.jmsutils.model
                                                                .JavaMigrationAnalysis>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.jmsutils.model
                                                                    .JavaMigrationAnalysis
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.jmsutils.model
                                                                    .JavaMigrationAnalysis
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.jmsutils.model.JavaMigrationAnalysis>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.jmsutils.responses.GetJavaMigrationAnalysisResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.jmsutils.responses
                                                        .GetJavaMigrationAnalysisResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.javaMigrationAnalysis(response.getItem());

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

                                com.oracle.bmc.jmsutils.responses.GetJavaMigrationAnalysisResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
