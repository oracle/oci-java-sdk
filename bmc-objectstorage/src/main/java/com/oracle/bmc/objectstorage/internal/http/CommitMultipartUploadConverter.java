/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.internal.http;

import com.oracle.bmc.objectstorage.model.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class CommitMultipartUploadConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static CommitMultipartUploadRequest interceptRequest(
            CommitMultipartUploadRequest request) {

        return request;
    }

    public static javax.ws.rs.client.Invocation.Builder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, CommitMultipartUploadRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getNamespaceName() == null) {
            throw new NullPointerException("namespaceName is required");
        }

        if (request.getBucketName() == null) {
            throw new NullPointerException("bucketName is required");
        }

        if (request.getObjectName() == null) {
            throw new NullPointerException("objectName is required");
        }

        if (request.getUploadId() == null) {
            throw new NullPointerException("uploadId is required");
        }

        if (request.getCommitMultipartUploadDetails() == null) {
            throw new NullPointerException("commitMultipartUploadDetails is required");
        }

        javax.ws.rs.client.WebTarget target =
                client.getBaseTarget()
                        .path("/")
                        .path("n")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getNamespaceName()))
                        .path("b")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getBucketName()))
                        .path("u")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getObjectName()));

        target =
                target.queryParam(
                        "uploadId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getUploadId()));

        javax.ws.rs.client.Invocation.Builder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        if (request.getIfNoneMatch() != null) {
            ib.header("if-none-match", request.getIfNoneMatch());
        }

        if (request.getOpcClientRequestId() != null) {
            ib.header("opc-client-request-id", request.getOpcClientRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, CommitMultipartUploadResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CommitMultipartUploadResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, CommitMultipartUploadResponse>() {
                            @Override
                            public CommitMultipartUploadResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for CommitMultipartUploadResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create();

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                CommitMultipartUploadResponse.Builder builder =
                                        CommitMultipartUploadResponse.builder();

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcClientRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-client-request-id");
                                if (opcClientRequestIdHeader.isPresent()) {
                                    builder.opcClientRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-client-request-id",
                                                    opcClientRequestIdHeader.get().get(0),
                                                    String.class));
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

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcMultipartMd5Header =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-multipart-md5");
                                if (opcMultipartMd5Header.isPresent()) {
                                    builder.opcMultipartMd5(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-multipart-md5",
                                                    opcMultipartMd5Header.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>> eTagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "eTag");
                                if (eTagHeader.isPresent()) {
                                    builder.eTag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "eTag", eTagHeader.get().get(0), String.class));
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

                                CommitMultipartUploadResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
