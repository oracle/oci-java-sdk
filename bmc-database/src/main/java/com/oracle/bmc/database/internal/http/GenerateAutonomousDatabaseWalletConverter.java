/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.internal.http;

import com.oracle.bmc.database.model.*;
import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class GenerateAutonomousDatabaseWalletConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GenerateAutonomousDatabaseWalletRequest interceptRequest(
            GenerateAutonomousDatabaseWalletRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            GenerateAutonomousDatabaseWalletRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Validate.notNull(
                request.getGenerateAutonomousDatabaseWalletDetails(),
                "generateAutonomousDatabaseWalletDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("autonomousDatabases")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getAutonomousDatabaseId()))
                        .path("actions")
                        .path("generateWallet");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept("application/octet-stream");

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, GenerateAutonomousDatabaseWalletResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateAutonomousDatabaseWalletResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                GenerateAutonomousDatabaseWalletResponse>() {
                            @Override
                            public GenerateAutonomousDatabaseWalletResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for GenerateAutonomousDatabaseWalletResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.io.InputStream>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        java.io.InputStream.class);

                                com.oracle.bmc.http.internal.WithHeaders<java.io.InputStream>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GenerateAutonomousDatabaseWalletResponse.Builder builder =
                                        GenerateAutonomousDatabaseWalletResponse.builder();

                                builder.inputStream(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        contentLengthHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "content-length");
                                if (contentLengthHeader.isPresent()) {
                                    builder.contentLength(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-length",
                                                    contentLengthHeader.get().get(0),
                                                    Long.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        lastModifiedHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "last-modified");
                                if (lastModifiedHeader.isPresent()) {
                                    builder.lastModified(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "last-modified",
                                                    lastModifiedHeader.get().get(0),
                                                    java.util.Date.class));
                                }

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

                                GenerateAutonomousDatabaseWalletResponse responseWrapper =
                                        builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
