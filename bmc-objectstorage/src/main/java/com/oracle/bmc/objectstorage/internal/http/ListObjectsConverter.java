/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.internal.http;

import com.oracle.bmc.objectstorage.model.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class ListObjectsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static ListObjectsRequest interceptRequest(ListObjectsRequest request) {

        return request;
    }

    public static javax.ws.rs.client.Invocation.Builder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, ListObjectsRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getNamespaceName() == null) {
            throw new NullPointerException("namespaceName is required");
        }

        if (request.getBucketName() == null) {
            throw new NullPointerException("bucketName is required");
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
                        .path("o");

        if (request.getPrefix() != null) {
            target =
                    target.queryParam(
                            "prefix",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPrefix()));
        }

        if (request.getStart() != null) {
            target =
                    target.queryParam(
                            "start",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getStart()));
        }

        if (request.getEnd() != null) {
            target =
                    target.queryParam(
                            "end",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getEnd()));
        }

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        if (request.getDelimiter() != null) {
            target =
                    target.queryParam(
                            "delimiter",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getDelimiter()));
        }

        if (request.getFields() != null) {
            target =
                    target.queryParam(
                            "fields",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getFields()));
        }

        javax.ws.rs.client.Invocation.Builder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcClientRequestId() != null) {
            ib.header("opc-client-request-id", request.getOpcClientRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, ListObjectsResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListObjectsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, ListObjectsResponse>() {
                            @Override
                            public ListObjectsResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for ListObjectsResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        ListObjects>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        ListObjects.class);

                                com.oracle.bmc.http.internal.WithHeaders<ListObjects> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                ListObjectsResponse.Builder builder = ListObjectsResponse.builder();

                                builder.listObjects(response.getItem());

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

                                ListObjectsResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
