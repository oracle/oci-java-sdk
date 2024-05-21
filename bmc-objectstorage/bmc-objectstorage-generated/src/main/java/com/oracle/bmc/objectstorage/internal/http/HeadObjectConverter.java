/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.objectstorage.model.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class HeadObjectConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(HeadObjectConverter.class);

    public static com.oracle.bmc.objectstorage.requests.HeadObjectRequest interceptRequest(
            com.oracle.bmc.objectstorage.requests.HeadObjectRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.objectstorage.requests.HeadObjectRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
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
                        .path("o")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getObjectName()));

        if (request.getVersionId() != null) {
            target =
                    target.queryParam(
                            "versionId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getVersionId()));
        }

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

        if (request.getOpcSseCustomerAlgorithm() != null) {
            ib.header("opc-sse-customer-algorithm", request.getOpcSseCustomerAlgorithm());
        }

        if (request.getOpcSseCustomerKey() != null) {
            ib.header("opc-sse-customer-key", request.getOpcSseCustomerKey());
        }

        if (request.getOpcSseCustomerKeySha256() != null) {
            ib.header("opc-sse-customer-key-sha256", request.getOpcSseCustomerKeySha256());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.objectstorage.responses.HeadObjectResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.objectstorage.responses.HeadObjectResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.objectstorage.responses.HeadObjectResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.objectstorage.responses.HeadObjectResponse>() {
                            @Override
                            public com.oracle.bmc.objectstorage.responses.HeadObjectResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.objectstorage.responses.HeadObjectResponse");
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

                                com.oracle.bmc.objectstorage.responses.HeadObjectResponse.Builder
                                        builder =
                                                com.oracle.bmc.objectstorage.responses
                                                        .HeadObjectResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                if (response.getStatusCode() != 304) {
                                    builder.isNotModified(false);
                                } else {
                                    builder.isNotModified(true);
                                }

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

                                java.util.Optional<java.util.List<String>> eTagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "ETag");
                                if (eTagHeader.isPresent()) {
                                    builder.eTag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "ETag", eTagHeader.get().get(0), String.class));
                                }

                                java.util.Map<String, String> opcMeta = new java.util.HashMap<>();
                                String opcMetaPattern =
                                        "opc-meta-".toLowerCase(java.util.Locale.ROOT);
                                for (java.util.Map.Entry<String, java.util.List<String>> header :
                                        headers.entrySet()) {
                                    if (header.getKey()
                                            .toLowerCase(java.util.Locale.ROOT)
                                            .startsWith(opcMetaPattern)) {
                                        opcMeta.put(header.getKey(), header.getValue().get(0));
                                    }
                                }
                                if (opcMeta.size() > 0) {
                                    builder.opcMeta(opcMeta);
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

                                java.util.Optional<java.util.List<String>> contentMd5Header =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "content-md5");
                                if (contentMd5Header.isPresent()) {
                                    builder.contentMd5(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-md5",
                                                    contentMd5Header.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcMultipartMd5Header =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-multipart-md5");
                                if (opcMultipartMd5Header.isPresent()) {
                                    builder.opcMultipartMd5(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-multipart-md5",
                                                    opcMultipartMd5Header.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> contentTypeHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "content-type");
                                if (contentTypeHeader.isPresent()) {
                                    builder.contentType(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-type",
                                                    contentTypeHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> contentLanguageHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "content-language");
                                if (contentLanguageHeader.isPresent()) {
                                    builder.contentLanguage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-language",
                                                    contentLanguageHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> contentEncodingHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "content-encoding");
                                if (contentEncodingHeader.isPresent()) {
                                    builder.contentEncoding(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-encoding",
                                                    contentEncodingHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> cacheControlHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "cache-control");
                                if (cacheControlHeader.isPresent()) {
                                    builder.cacheControl(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "cache-control",
                                                    cacheControlHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>>
                                        contentDispositionHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils
                                                        .getHeadersWithName(
                                                                headers, "content-disposition");
                                if (contentDispositionHeader.isPresent()) {
                                    builder.contentDisposition(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-disposition",
                                                    contentDispositionHeader.get().get(0),
                                                    String.class));
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

                                java.util.Optional<java.util.List<String>> storageTierHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "storage-tier");
                                if (storageTierHeader.isPresent()) {
                                    builder.storageTier(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "storage-tier",
                                                    storageTierHeader.get().get(0),
                                                    StorageTier.class));
                                }

                                java.util.Optional<java.util.List<String>> archivalStateHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "archival-state");
                                if (archivalStateHeader.isPresent()) {
                                    builder.archivalState(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "archival-state",
                                                    archivalStateHeader.get().get(0),
                                                    ArchivalState.class));
                                }

                                java.util.Optional<java.util.List<String>> timeOfArchivalHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "time-of-archival");
                                if (timeOfArchivalHeader.isPresent()) {
                                    builder.timeOfArchival(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "time-of-archival",
                                                    timeOfArchivalHeader.get().get(0),
                                                    java.util.Date.class));
                                }

                                java.util.Optional<java.util.List<String>> versionIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "version-id");
                                if (versionIdHeader.isPresent()) {
                                    builder.versionId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "version-id",
                                                    versionIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.objectstorage.responses.HeadObjectResponse
                                        responseWrapper = builder.build();
                                responseWrapper =
                                        ObjectMetadataInterceptor.intercept(responseWrapper);
                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
