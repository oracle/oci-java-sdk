/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.internal.http;

import com.oracle.bmc.datasafe.model.*;
import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GenerateOnPremConnectorConfigurationConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenerateOnPremConnectorConfigurationConverter.class);

    public static com.oracle.bmc.datasafe.requests.GenerateOnPremConnectorConfigurationRequest
            interceptRequest(
                    com.oracle.bmc.datasafe.requests.GenerateOnPremConnectorConfigurationRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.datasafe.requests.GenerateOnPremConnectorConfigurationRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(
                request.getGenerateOnPremConnectorConfigurationDetails(),
                "generateOnPremConnectorConfigurationDetails is required");
        Validate.notBlank(request.getOnPremConnectorId(), "onPremConnectorId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20181201")
                        .path("onPremConnectors")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getOnPremConnectorId()))
                        .path("actions")
                        .path("generateConfiguration");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept("application/octet-stream");

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
                    com.oracle.bmc.datasafe.responses.GenerateOnPremConnectorConfigurationResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.datasafe.responses.GenerateOnPremConnectorConfigurationResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.datasafe.responses
                                .GenerateOnPremConnectorConfigurationResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.datasafe.responses
                                        .GenerateOnPremConnectorConfigurationResponse>() {
                            @Override
                            public com.oracle.bmc.datasafe.responses
                                            .GenerateOnPremConnectorConfigurationResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.datasafe.responses.GenerateOnPremConnectorConfigurationResponse");
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

                                com.oracle.bmc.datasafe.responses
                                                .GenerateOnPremConnectorConfigurationResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.datasafe.responses
                                                        .GenerateOnPremConnectorConfigurationResponse
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

                                java.util.Optional<java.util.List<String>> contentLengthHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "content-length");
                                if (contentLengthHeader.isPresent()) {
                                    builder.contentLength(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-length",
                                                    contentLengthHeader.get().get(0),
                                                    Long.class));
                                }

                                java.util.Optional<java.util.List<String>> lastModifiedHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "last-modified");
                                if (lastModifiedHeader.isPresent()) {
                                    builder.lastModified(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "last-modified",
                                                    lastModifiedHeader.get().get(0),
                                                    java.util.Date.class));
                                }

                                com.oracle.bmc.datasafe.responses
                                                .GenerateOnPremConnectorConfigurationResponse
                                        responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
