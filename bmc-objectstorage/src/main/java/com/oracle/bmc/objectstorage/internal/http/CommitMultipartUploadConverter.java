/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.internal.http;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.http.internal.*;
import static com.oracle.bmc.util.internal.HttpUtils.*;
import com.oracle.bmc.model.*;
import com.oracle.bmc.objectstorage.model.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class CommitMultipartUploadConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static CommitMultipartUploadRequest interceptRequest(
            CommitMultipartUploadRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, CommitMultipartUploadRequest request) {
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

        WebTarget target =
                client.getBaseTarget()
                        .path("/")
                        .path("n")
                        .path(encodePathSegment(request.getNamespaceName()))
                        .path("b")
                        .path(encodePathSegment(request.getBucketName()))
                        .path("u")
                        .path(encodePathSegment(request.getObjectName()));

        target = target.queryParam("uploadId", attemptEncodeQueryParam(request.getUploadId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

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

    public static Function<Response, CommitMultipartUploadResponse> fromResponse() {
        final Function<Response, CommitMultipartUploadResponse> transformer =
                new Function<Response, CommitMultipartUploadResponse>() {
                    @Override
                    public CommitMultipartUploadResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for CommitMultipartUploadResponse");
                        Function<Response, WithHeaders<Void>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create();

                        WithHeaders<Void> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        CommitMultipartUploadResponse.Builder builder =
                                CommitMultipartUploadResponse.builder();

                        Optional<List<String>> opcClientRequestIdHeader =
                                HeaderUtils.get(headers, "opc-client-request-id");
                        if (opcClientRequestIdHeader.isPresent()) {
                            builder.opcClientRequestId(
                                    HeaderUtils.toValue(
                                            "opc-client-request-id",
                                            opcClientRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        Optional<List<String>> opcMultipartMd5Header =
                                HeaderUtils.get(headers, "opc-multipart-md5");
                        if (opcMultipartMd5Header.isPresent()) {
                            builder.opcMultipartMd5(
                                    HeaderUtils.toValue(
                                            "opc-multipart-md5",
                                            opcMultipartMd5Header.get().get(0),
                                            String.class));
                        }

                        Optional<List<String>> eTagHeader = HeaderUtils.get(headers, "eTag");
                        if (eTagHeader.isPresent()) {
                            builder.eTag(
                                    HeaderUtils.toValue(
                                            "eTag", eTagHeader.get().get(0), String.class));
                        }

                        Optional<List<String>> lastModifiedHeader =
                                HeaderUtils.get(headers, "last-modified");
                        if (lastModifiedHeader.isPresent()) {
                            builder.lastModified(
                                    HeaderUtils.toValue(
                                            "last-modified",
                                            lastModifiedHeader.get().get(0),
                                            Date.class));
                        }

                        CommitMultipartUploadResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
