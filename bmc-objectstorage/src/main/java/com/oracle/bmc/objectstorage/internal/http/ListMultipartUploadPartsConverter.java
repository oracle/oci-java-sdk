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
public class ListMultipartUploadPartsConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static ListMultipartUploadPartsRequest interceptRequest(
            ListMultipartUploadPartsRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, ListMultipartUploadPartsRequest request) {
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

        if (request.getLimit() != null) {
            target = target.queryParam("limit", attemptEncodeQueryParam(request.getLimit()));
        }

        if (request.getPage() != null) {
            target = target.queryParam("page", attemptEncodeQueryParam(request.getPage()));
        }

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getOpcClientRequestId() != null) {
            ib.header("opc-client-request-id", request.getOpcClientRequestId());
        }

        return ib;
    }

    public static Function<Response, ListMultipartUploadPartsResponse> fromResponse() {
        final Function<Response, ListMultipartUploadPartsResponse> transformer =
                new Function<Response, ListMultipartUploadPartsResponse>() {
                    @Override
                    public ListMultipartUploadPartsResponse apply(Response rawResponse) {
                        LOG.trace(
                                "Transform function invoked for ListMultipartUploadPartsResponse");
                        Function<Response, WithHeaders<List<MultipartUploadPartSummary>>>
                                responseFn =
                                        RESPONSE_CONVERSION_FACTORY.create(
                                                new GenericType<
                                                        List<MultipartUploadPartSummary>>() {});

                        WithHeaders<List<MultipartUploadPartSummary>> response =
                                responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        ListMultipartUploadPartsResponse.Builder builder =
                                ListMultipartUploadPartsResponse.builder();

                        builder.items(response.getItem());

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

                        Optional<List<String>> opcNextPageHeader =
                                HeaderUtils.get(headers, "opc-next-page");
                        if (opcNextPageHeader.isPresent()) {
                            builder.opcNextPage(
                                    HeaderUtils.toValue(
                                            "opc-next-page",
                                            opcNextPageHeader.get().get(0),
                                            String.class));
                        }

                        ListMultipartUploadPartsResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
