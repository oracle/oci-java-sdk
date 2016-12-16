/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

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
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class GetConsoleHistoryContentConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static Invocation.Builder fromRequest(
            RestClient client, GetConsoleHistoryContentRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getInstanceConsoleHistoryId() == null) {
            throw new NullPointerException("instanceConsoleHistoryId is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("instanceConsoleHistories")
                        .path(encodePathSegment(request.getInstanceConsoleHistoryId()))
                        .path("data");

        if (request.getOffset() != null) {
            target = target.queryParam("offset", attemptEncodeQueryParam(request.getOffset()));
        }

        if (request.getLength() != null) {
            target = target.queryParam("length", attemptEncodeQueryParam(request.getLength()));
        }

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        return ib;
    }

    public static Function<Response, GetConsoleHistoryContentResponse> fromResponse() {
        final Function<Response, GetConsoleHistoryContentResponse> transformer =
                new Function<Response, GetConsoleHistoryContentResponse>() {
                    @Override
                    public GetConsoleHistoryContentResponse apply(Response rawResponse) {
                        LOG.trace(
                                "Transform function invoked for GetConsoleHistoryContentResponse");
                        Function<Response, WithHeaders<String>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(String.class);

                        WithHeaders<String> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetConsoleHistoryContentResponse.Builder builder =
                                GetConsoleHistoryContentResponse.builder();

                        builder.value(response.getItem());

                        Optional<List<String>> opcBytesRemainingHeader =
                                HeaderUtils.get(headers, "opc-bytes-remaining");
                        if (opcBytesRemainingHeader.isPresent()) {
                            builder.opcBytesRemaining(
                                    HeaderUtils.toValue(
                                            "opc-bytes-remaining",
                                            opcBytesRemainingHeader.get().get(0),
                                            Integer.class));
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

                        GetConsoleHistoryContentResponse responseWrapper = builder.build();
                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
