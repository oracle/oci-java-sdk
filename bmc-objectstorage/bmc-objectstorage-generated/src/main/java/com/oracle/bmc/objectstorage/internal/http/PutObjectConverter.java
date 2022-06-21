/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.objectstorage.model.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class PutObjectConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PutObjectConverter.class);

    public static com.oracle.bmc.objectstorage.requests.PutObjectRequest interceptRequest(
            com.oracle.bmc.objectstorage.requests.PutObjectRequest request) {
        request = ObjectMetadataInterceptor.intercept(request);
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.objectstorage.requests.PutObjectRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Validate.notNull(request.getPutObjectBody(), "putObjectBody is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
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
                        .path("o")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getObjectName()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

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

        if (request.getExpect() != null) {
            ib.header("Expect", request.getExpect());
        }

        if (request.getContentLength() != null) {
            ib.header("Content-Length", request.getContentLength());
        }

        if (request.getContentMD5() != null) {
            ib.header("Content-MD5", request.getContentMD5());
        }

        if (request.getContentType() != null) {
            ib.header("Content-Type", request.getContentType());
        }

        if (request.getContentLanguage() != null) {
            ib.header("Content-Language", request.getContentLanguage());
        }

        if (request.getContentEncoding() != null) {
            ib.header("Content-Encoding", request.getContentEncoding());
        }

        if (request.getContentDisposition() != null) {
            ib.header("Content-Disposition", request.getContentDisposition());
        }

        if (request.getCacheControl() != null) {
            ib.header("Cache-Control", request.getCacheControl());
        }

        if (request.getOpcSseCustomerAlgorithm() != null) {
            ib.header("opc-sse-customer-algorithm", request.getOpcSseCustomerAlgorithm());
        }

        if (request.getOpcSseCustomerKey() != null) {
            ib.header("opc-sse-customer-key", request.getOpcSseCustomerKey());
        }

        if (request.getOpcSseCustomerKeySha256() != null) {
            ib.header("opc-sse-customer-key-sha256", request.getOpcSseCustomerKeySha256());
        }

        if (request.getOpcSseKmsKeyId() != null) {
            ib.header("opc-sse-kms-key-id", request.getOpcSseKmsKeyId());
        }

        if (request.getStorageTier() != null) {
            ib.header("storage-tier", request.getStorageTier().getValue());
        }

        if (request.getOpcMeta() != null) {
            for (java.util.Map.Entry<String, String> header : request.getOpcMeta().entrySet()) {
                ib.header(header.getKey(), header.getValue());
            }
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.objectstorage.responses.PutObjectResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.objectstorage.responses.PutObjectResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.objectstorage.responses.PutObjectResponse>() {
                            @Override
                            public com.oracle.bmc.objectstorage.responses.PutObjectResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.objectstorage.responses.PutObjectResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create();

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.objectstorage.responses.PutObjectResponse.Builder
                                        builder =
                                                com.oracle.bmc.objectstorage.responses
                                                        .PutObjectResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

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
                                        opcContentMd5Header =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-content-md5");
                                if (opcContentMd5Header.isPresent()) {
                                    builder.opcContentMd5(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-content-md5",
                                                    opcContentMd5Header.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>> eTagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "ETag");
                                if (eTagHeader.isPresent()) {
                                    builder.eTag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "ETag", eTagHeader.get().get(0), String.class));
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
                                        versionIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "version-id");
                                if (versionIdHeader.isPresent()) {
                                    builder.versionId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "version-id",
                                                    versionIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.objectstorage.responses.PutObjectResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
