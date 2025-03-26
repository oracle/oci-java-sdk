/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.objectstorage.model.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UploadPartConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UploadPartConverter.class);

    public static com.oracle.bmc.objectstorage.requests.UploadPartRequest interceptRequest(
            com.oracle.bmc.objectstorage.requests.UploadPartRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.objectstorage.requests.UploadPartRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Validate.notNull(request.getUploadId(), "uploadId is required");
        Validate.notNull(request.getUploadPartNum(), "uploadPartNum is required");
        Validate.notNull(request.getUploadPartBody(), "uploadPartBody is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        requiredParametersMap.put("uploadId", request.getUploadId());
        requiredParametersMap.put("uploadPartNum", request.getUploadPartNum());
        com.oracle.bmc.http.internal.WrappedWebTarget newBaseTarget =
                com.oracle.bmc.internal.EndpointBuilder.populateServiceParametersInEndpoint(
                        client, requiredParametersMap);

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                newBaseTarget
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

        target =
                target.queryParam(
                        "uploadPartNum",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getUploadPartNum()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcClientRequestId() != null) {
            ib.header("opc-client-request-id", request.getOpcClientRequestId());
        }

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        if (request.getIfNoneMatch() != null) {
            ib.header("if-none-match", request.getIfNoneMatch());
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

        if (request.getOpcChecksumAlgorithm() != null) {
            ib.header("opc-checksum-algorithm", request.getOpcChecksumAlgorithm().getValue());
        }

        if (request.getOpcContentCrc32c() != null) {
            ib.header("opc-content-crc32c", request.getOpcContentCrc32c());
        }

        if (request.getOpcContentSha256() != null) {
            ib.header("opc-content-sha256", request.getOpcContentSha256());
        }

        if (request.getOpcContentSha384() != null) {
            ib.header("opc-content-sha384", request.getOpcContentSha384());
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

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.objectstorage.responses.UploadPartResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.objectstorage.responses.UploadPartResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.objectstorage.responses.UploadPartResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.objectstorage.responses.UploadPartResponse>() {
                            @Override
                            public com.oracle.bmc.objectstorage.responses.UploadPartResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.objectstorage.responses.UploadPartResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    serviceDetails.get());
                                } else {
                                    responseFn = RESPONSE_CONVERSION_FACTORY.create();
                                }

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.objectstorage.responses.UploadPartResponse.Builder
                                        builder =
                                                com.oracle.bmc.objectstorage.responses
                                                        .UploadPartResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                java.util.Optional<java.util.List<String>>
                                        opcClientRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils
                                                        .getHeadersWithName(
                                                                headers, "opc-client-request-id");
                                if (opcClientRequestIdHeader.isPresent()) {
                                    builder.opcClientRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-client-request-id",
                                                    opcClientRequestIdHeader.get().get(0),
                                                    String.class));
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

                                java.util.Optional<java.util.List<String>> opcContentMd5Header =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-content-md5");
                                if (opcContentMd5Header.isPresent()) {
                                    builder.opcContentMd5(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-content-md5",
                                                    opcContentMd5Header.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcContentCrc32cHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-content-crc32c");
                                if (opcContentCrc32cHeader.isPresent()) {
                                    builder.opcContentCrc32c(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-content-crc32c",
                                                    opcContentCrc32cHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcContentSha256Header =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-content-sha256");
                                if (opcContentSha256Header.isPresent()) {
                                    builder.opcContentSha256(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-content-sha256",
                                                    opcContentSha256Header.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcContentSha384Header =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-content-sha384");
                                if (opcContentSha384Header.isPresent()) {
                                    builder.opcContentSha384(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-content-sha384",
                                                    opcContentSha384Header.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> eTagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "ETag");
                                if (eTagHeader.isPresent()) {
                                    builder.eTag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "ETag", eTagHeader.get().get(0), String.class));
                                }

                                com.oracle.bmc.objectstorage.responses.UploadPartResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
