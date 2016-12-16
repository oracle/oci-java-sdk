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
public class DeleteConsoleHistoryConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static Invocation.Builder fromRequest(
            RestClient client, DeleteConsoleHistoryRequest request) {
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
                        .path(encodePathSegment(request.getInstanceConsoleHistoryId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        return ib;
    }

    public static Function<Response, DeleteConsoleHistoryResponse> fromResponse() {
        final Function<Response, DeleteConsoleHistoryResponse> transformer =
                new Function<Response, DeleteConsoleHistoryResponse>() {
                    @Override
                    public DeleteConsoleHistoryResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for DeleteConsoleHistoryResponse");
                        Function<Response, WithHeaders<Void>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create();

                        WithHeaders<Void> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        DeleteConsoleHistoryResponse.Builder builder =
                                DeleteConsoleHistoryResponse.builder();

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        DeleteConsoleHistoryResponse responseWrapper = builder.build();
                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
