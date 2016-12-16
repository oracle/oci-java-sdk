/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
public class GetObjectConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static Invocation.Builder fromRequest(RestClient client, GetObjectRequest request) {
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

        ib.accept(MediaType.WILDCARD_TYPE);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        if (request.getIfNoneMatch() != null) {
            ib.header("if-none-match", request.getIfNoneMatch());
        }

        if (request.getOpcClientRequestId() != null) {
            ib.header("opc-client-request-id", request.getOpcClientRequestId());
        }

        if (request.getRange() != null) {
            ib.header("range", request.getRange());
        }

        return ib;
    }

    public static Function<Response, GetObjectResponse> fromResponse() {
        final Function<Response, GetObjectResponse> transformer =
                new Function<Response, GetObjectResponse>() {
                    @Override
                    public GetObjectResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for GetObjectResponse");
                        Function<Response, WithHeaders<InputStream>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(InputStream.class);

                        WithHeaders<InputStream> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetObjectResponse.Builder builder = GetObjectResponse.builder();

                        if (response.getStatusCode() != 304) {
                            builder.inputStream(response.getItem());
                            builder.isNotModified(false);
                        } else {
                            builder.isNotModified(true);
                        }

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

                        Optional<List<String>> eTagHeader = HeaderUtils.get(headers, "eTag");
                        if (eTagHeader.isPresent()) {
                            builder.eTag(
                                    HeaderUtils.toValue(
                                            "eTag", eTagHeader.get().get(0), String.class));
                        }

                        Map<String, String> opcMeta = new HashMap<>();
                        String opcMetaPattern = "opc-meta-".toLowerCase();
                        int patternLength = opcMetaPattern.length();
                        for (Map.Entry<String, List<String>> header : headers.entrySet()) {
                            if (header.getKey().toLowerCase().startsWith(opcMetaPattern)) {
                                opcMeta.put(
                                        header.getKey().substring(patternLength),
                                        header.getValue().get(0));
                            }
                        }
                        builder.opcMeta(opcMeta);

                        Optional<List<String>> contentLengthHeader =
                                HeaderUtils.get(headers, "content-length");
                        if (contentLengthHeader.isPresent()) {
                            builder.contentLength(
                                    HeaderUtils.toValue(
                                            "content-length",
                                            contentLengthHeader.get().get(0),
                                            Long.class));
                        }

                        Optional<List<String>> contentRangeHeader =
                                HeaderUtils.get(headers, "content-range");
                        if (contentRangeHeader.isPresent()) {
                            builder.contentRange(
                                    HeaderUtils.toValue(
                                            "content-range",
                                            contentRangeHeader.get().get(0),
                                            Range.class));
                        }

                        Optional<List<String>> contentMd5Header =
                                HeaderUtils.get(headers, "content-md5");
                        if (contentMd5Header.isPresent()) {
                            builder.contentMd5(
                                    HeaderUtils.toValue(
                                            "content-md5",
                                            contentMd5Header.get().get(0),
                                            String.class));
                        }

                        Optional<List<String>> contentTypeHeader =
                                HeaderUtils.get(headers, "content-type");
                        if (contentTypeHeader.isPresent()) {
                            builder.contentType(
                                    HeaderUtils.toValue(
                                            "content-type",
                                            contentTypeHeader.get().get(0),
                                            String.class));
                        }

                        Optional<List<String>> contentLanguageHeader =
                                HeaderUtils.get(headers, "content-language");
                        if (contentLanguageHeader.isPresent()) {
                            builder.contentLanguage(
                                    HeaderUtils.toValue(
                                            "content-language",
                                            contentLanguageHeader.get().get(0),
                                            String.class));
                        }

                        Optional<List<String>> contentEncodingHeader =
                                HeaderUtils.get(headers, "content-encoding");
                        if (contentEncodingHeader.isPresent()) {
                            builder.contentEncoding(
                                    HeaderUtils.toValue(
                                            "content-encoding",
                                            contentEncodingHeader.get().get(0),
                                            String.class));
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

                        GetObjectResponse responseWrapper = builder.build();
                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
