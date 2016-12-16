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
public class ListObjectsConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static Invocation.Builder fromRequest(RestClient client, ListObjectsRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getNamespaceName() == null) {
            throw new NullPointerException("namespaceName is required");
        }

        if (request.getBucketName() == null) {
            throw new NullPointerException("bucketName is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/")
                        .path("n")
                        .path(encodePathSegment(request.getNamespaceName()))
                        .path("b")
                        .path(encodePathSegment(request.getBucketName()))
                        .path("o");

        if (request.getPrefix() != null) {
            target = target.queryParam("prefix", attemptEncodeQueryParam(request.getPrefix()));
        }

        if (request.getStart() != null) {
            target = target.queryParam("start", attemptEncodeQueryParam(request.getStart()));
        }

        if (request.getEnd() != null) {
            target = target.queryParam("end", attemptEncodeQueryParam(request.getEnd()));
        }

        if (request.getLimit() != null) {
            target = target.queryParam("limit", attemptEncodeQueryParam(request.getLimit()));
        }

        if (request.getDelimiter() != null) {
            target =
                    target.queryParam("delimiter", attemptEncodeQueryParam(request.getDelimiter()));
        }

        if (request.getFields() != null) {
            target = target.queryParam("fields", attemptEncodeQueryParam(request.getFields()));
        }

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getOpcClientRequestId() != null) {
            ib.header("opc-client-request-id", request.getOpcClientRequestId());
        }

        return ib;
    }

    public static Function<Response, ListObjectsResponse> fromResponse() {
        final Function<Response, ListObjectsResponse> transformer =
                new Function<Response, ListObjectsResponse>() {
                    @Override
                    public ListObjectsResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for ListObjectsResponse");
                        Function<Response, WithHeaders<ListObjects>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(ListObjects.class);

                        WithHeaders<ListObjects> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        ListObjectsResponse.Builder builder = ListObjectsResponse.builder();

                        builder.listObjects(response.getItem());

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

                        ListObjectsResponse responseWrapper = builder.build();
                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
