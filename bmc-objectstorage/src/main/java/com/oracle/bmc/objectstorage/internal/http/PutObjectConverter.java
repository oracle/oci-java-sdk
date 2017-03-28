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
public class PutObjectConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static PutObjectRequest interceptRequest(PutObjectRequest request) {
        request = ObjectMetadataInterceptor.intercept(request);
        return request;
    }

    public static Invocation.Builder fromRequest(RestClient client, PutObjectRequest request) {
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

        if (request.getPutObjectBody() == null) {
            throw new NullPointerException("putObjectBody is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/")
                        .path("n")
                        .path(encodePathSegment(request.getNamespaceName()))
                        .path("b")
                        .path(encodePathSegment(request.getBucketName()))
                        .path("o")
                        .path(encodePathSegment(request.getObjectName()));

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

        if (request.getOpcMeta() != null) {
            for (Map.Entry<String, String> header : request.getOpcMeta().entrySet()) {
                ib.header(header.getKey(), header.getValue());
            }
        }

        return ib;
    }

    public static Function<Response, PutObjectResponse> fromResponse() {
        final Function<Response, PutObjectResponse> transformer =
                new Function<Response, PutObjectResponse>() {
                    @Override
                    public PutObjectResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for PutObjectResponse");
                        Function<Response, WithHeaders<Void>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create();

                        WithHeaders<Void> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        PutObjectResponse.Builder builder = PutObjectResponse.builder();

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

                        Optional<List<String>> opcContentMd5Header =
                                HeaderUtils.get(headers, "opc-content-md5");
                        if (opcContentMd5Header.isPresent()) {
                            builder.opcContentMd5(
                                    HeaderUtils.toValue(
                                            "opc-content-md5",
                                            opcContentMd5Header.get().get(0),
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

                        PutObjectResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
