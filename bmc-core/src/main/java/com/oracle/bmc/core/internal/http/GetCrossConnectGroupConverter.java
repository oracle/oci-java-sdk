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
public class GetCrossConnectGroupConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static GetCrossConnectGroupRequest interceptRequest(
            GetCrossConnectGroupRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, GetCrossConnectGroupRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCrossConnectGroupId() == null) {
            throw new NullPointerException("crossConnectGroupId is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("crossConnectGroups")
                        .path(encodePathSegment(request.getCrossConnectGroupId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        return ib;
    }

    public static Function<Response, GetCrossConnectGroupResponse> fromResponse() {
        final Function<Response, GetCrossConnectGroupResponse> transformer =
                new Function<Response, GetCrossConnectGroupResponse>() {
                    @Override
                    public GetCrossConnectGroupResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for GetCrossConnectGroupResponse");
                        Function<Response, WithHeaders<CrossConnectGroup>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(CrossConnectGroup.class);

                        WithHeaders<CrossConnectGroup> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetCrossConnectGroupResponse.Builder builder =
                                GetCrossConnectGroupResponse.builder();

                        builder.crossConnectGroup(response.getItem());

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

                        GetCrossConnectGroupResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
