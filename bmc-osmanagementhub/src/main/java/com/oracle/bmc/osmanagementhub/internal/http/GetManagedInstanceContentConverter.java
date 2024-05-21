/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.internal.http;

import com.oracle.bmc.osmanagementhub.model.*;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class GetManagedInstanceContentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetManagedInstanceContentConverter.class);

    public static com.oracle.bmc.osmanagementhub.requests.GetManagedInstanceContentRequest
            interceptRequest(
                    com.oracle.bmc.osmanagementhub.requests.GetManagedInstanceContentRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.osmanagementhub.requests.GetManagedInstanceContentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Validate.notNull(request.getVulnerabilityType(), "vulnerabilityType is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20220901")
                        .path("managedInstances")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getManagedInstanceId()))
                        .path("content");

        if (request.getAdvisoryName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "advisoryName",
                            request.getAdvisoryName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getAdvisoryNameContains() != null) {
            target =
                    target.queryParam(
                            "advisoryNameContains",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getAdvisoryNameContains()));
        }

        if (request.getAdvisoryType() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "advisoryType",
                            request.getAdvisoryType(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getVulnerabilityName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "vulnerabilityName",
                            request.getVulnerabilityName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getVulnerabilityNameContains() != null) {
            target =
                    target.queryParam(
                            "vulnerabilityNameContains",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getVulnerabilityNameContains()));
        }

        target =
                com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                        target,
                        "vulnerabilityType",
                        request.getVulnerabilityType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi);

        if (request.getReportFormat() != null) {
            target =
                    target.queryParam(
                            "reportFormat",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getReportFormat().getValue()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept("application/x-yaml");

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
                    com.oracle.bmc.osmanagementhub.responses.GetManagedInstanceContentResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.osmanagementhub.responses.GetManagedInstanceContentResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.osmanagementhub.responses.GetManagedInstanceContentResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.osmanagementhub.responses
                                        .GetManagedInstanceContentResponse>() {
                            @Override
                            public com.oracle.bmc.osmanagementhub.responses
                                            .GetManagedInstanceContentResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.osmanagementhub.responses.GetManagedInstanceContentResponse");
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

                                com.oracle.bmc.osmanagementhub.responses
                                                .GetManagedInstanceContentResponse.Builder
                                        builder =
                                                com.oracle.bmc.osmanagementhub.responses
                                                        .GetManagedInstanceContentResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.inputStream(response.getItem());

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

                                com.oracle.bmc.osmanagementhub.responses
                                                .GetManagedInstanceContentResponse
                                        responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
