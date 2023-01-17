/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.internal.http;

import com.oracle.bmc.devops.model.*;
import com.oracle.bmc.devops.requests.*;
import com.oracle.bmc.devops.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetRepositoryArchiveContentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetRepositoryArchiveContentConverter.class);

    public static com.oracle.bmc.devops.requests.GetRepositoryArchiveContentRequest
            interceptRequest(
                    com.oracle.bmc.devops.requests.GetRepositoryArchiveContentRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.devops.requests.GetRepositoryArchiveContentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20210630")
                        .path("repositories")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getRepositoryId()))
                        .path("archive")
                        .path("content");

        if (request.getRefName() != null) {
            target =
                    target.queryParam(
                            "refName",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getRefName()));
        }

        if (request.getFormat() != null) {
            target =
                    target.queryParam(
                            "format",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getFormat()));
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
                    com.oracle.bmc.devops.responses.GetRepositoryArchiveContentResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.devops.responses.GetRepositoryArchiveContentResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.devops.responses.GetRepositoryArchiveContentResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.devops.responses
                                        .GetRepositoryArchiveContentResponse>() {
                            @Override
                            public com.oracle.bmc.devops.responses
                                            .GetRepositoryArchiveContentResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.devops.responses.GetRepositoryArchiveContentResponse");
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

                                com.oracle.bmc.devops.responses.GetRepositoryArchiveContentResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.devops.responses
                                                        .GetRepositoryArchiveContentResponse
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

                                java.util.Optional<java.util.List<String>> contentTypeHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "Content-Type");
                                if (contentTypeHeader.isPresent()) {
                                    builder.contentType(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "Content-Type",
                                                    contentTypeHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>>
                                        contentDispositionHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils
                                                        .getHeadersWithName(
                                                                headers, "Content-Disposition");
                                if (contentDispositionHeader.isPresent()) {
                                    builder.contentDisposition(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "Content-Disposition",
                                                    contentDispositionHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.devops.responses.GetRepositoryArchiveContentResponse
                                        responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
