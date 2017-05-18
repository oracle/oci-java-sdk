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
public class GetCrossConnectStatusConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static GetCrossConnectStatusRequest interceptRequest(
            GetCrossConnectStatusRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, GetCrossConnectStatusRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCrossConnectId() == null) {
            throw new NullPointerException("crossConnectId is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("crossConnects")
                        .path(encodePathSegment(request.getCrossConnectId()))
                        .path("status");

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        return ib;
    }

    public static Function<Response, GetCrossConnectStatusResponse> fromResponse() {
        final Function<Response, GetCrossConnectStatusResponse> transformer =
                new Function<Response, GetCrossConnectStatusResponse>() {
                    @Override
                    public GetCrossConnectStatusResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for GetCrossConnectStatusResponse");
                        Function<Response, WithHeaders<CrossConnectStatus>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(CrossConnectStatus.class);

                        WithHeaders<CrossConnectStatus> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetCrossConnectStatusResponse.Builder builder =
                                GetCrossConnectStatusResponse.builder();

                        builder.crossConnectStatus(response.getItem());

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        GetCrossConnectStatusResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
