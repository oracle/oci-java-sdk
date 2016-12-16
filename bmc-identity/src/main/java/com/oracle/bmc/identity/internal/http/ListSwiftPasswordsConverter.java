/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.internal.http;

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
import com.oracle.bmc.identity.model.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class ListSwiftPasswordsConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static Invocation.Builder fromRequest(
            RestClient client, ListSwiftPasswordsRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getUserId() == null) {
            throw new NullPointerException("userId is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("users")
                        .path(encodePathSegment(request.getUserId()))
                        .path("swiftPasswords");

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        return ib;
    }

    public static Function<Response, ListSwiftPasswordsResponse> fromResponse() {
        final Function<Response, ListSwiftPasswordsResponse> transformer =
                new Function<Response, ListSwiftPasswordsResponse>() {
                    @Override
                    public ListSwiftPasswordsResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for ListSwiftPasswordsResponse");
                        Function<Response, WithHeaders<List<SwiftPassword>>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(
                                        new GenericType<List<SwiftPassword>>() {});

                        WithHeaders<List<SwiftPassword>> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        ListSwiftPasswordsResponse.Builder builder =
                                ListSwiftPasswordsResponse.builder();

                        builder.items(response.getItem());

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

                        ListSwiftPasswordsResponse responseWrapper = builder.build();
                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
