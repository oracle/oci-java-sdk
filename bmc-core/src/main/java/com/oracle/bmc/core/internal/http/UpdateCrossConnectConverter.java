/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
public class UpdateCrossConnectConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static UpdateCrossConnectRequest interceptRequest(UpdateCrossConnectRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, UpdateCrossConnectRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCrossConnectId() == null) {
            throw new NullPointerException("crossConnectId is required");
        }

        if (request.getUpdateCrossConnectDetails() == null) {
            throw new NullPointerException("updateCrossConnectDetails is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("crossConnects")
                        .path(encodePathSegment(request.getCrossConnectId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        return ib;
    }

    public static Function<Response, UpdateCrossConnectResponse> fromResponse() {
        final Function<Response, UpdateCrossConnectResponse> transformer =
                new Function<Response, UpdateCrossConnectResponse>() {
                    @Override
                    public UpdateCrossConnectResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for UpdateCrossConnectResponse");
                        Function<Response, WithHeaders<CrossConnect>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(CrossConnect.class);

                        WithHeaders<CrossConnect> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        UpdateCrossConnectResponse.Builder builder =
                                UpdateCrossConnectResponse.builder();

                        builder.crossConnect(response.getItem());

                        Optional<List<String>> etagHeader = HeaderUtils.get(headers, "etag");
                        if (etagHeader.isPresent()) {
                            builder.etag(
                                    HeaderUtils.toValue(
                                            "etag", etagHeader.get().get(0), String.class));
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

                        UpdateCrossConnectResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
