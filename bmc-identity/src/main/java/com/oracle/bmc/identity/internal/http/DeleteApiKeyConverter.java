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
public class DeleteApiKeyConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static Invocation.Builder fromRequest(RestClient client, DeleteApiKeyRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getUserId() == null) {
            throw new NullPointerException("userId is required");
        }

        if (request.getFingerprint() == null) {
            throw new NullPointerException("fingerprint is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("users")
                        .path(encodePathSegment(request.getUserId()))
                        .path("apiKeys")
                        .path(encodePathSegment(request.getFingerprint()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        return ib;
    }

    public static Function<Response, DeleteApiKeyResponse> fromResponse() {
        final Function<Response, DeleteApiKeyResponse> transformer =
                new Function<Response, DeleteApiKeyResponse>() {
                    @Override
                    public DeleteApiKeyResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for DeleteApiKeyResponse");
                        Function<Response, WithHeaders<Void>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create();

                        WithHeaders<Void> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        DeleteApiKeyResponse.Builder builder = DeleteApiKeyResponse.builder();

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        DeleteApiKeyResponse responseWrapper = builder.build();
                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
