/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
public class GetTenancyConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static GetTenancyRequest interceptRequest(GetTenancyRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(RestClient client, GetTenancyRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getTenancyId() == null) {
            throw new NullPointerException("tenancyId is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("tenancies")
                        .path(encodePathSegment(request.getTenancyId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        return ib;
    }

    public static Function<Response, GetTenancyResponse> fromResponse() {
        final Function<Response, GetTenancyResponse> transformer =
                new Function<Response, GetTenancyResponse>() {
                    @Override
                    public GetTenancyResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for GetTenancyResponse");
                        Function<Response, WithHeaders<Tenancy>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(Tenancy.class);

                        WithHeaders<Tenancy> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetTenancyResponse.Builder builder = GetTenancyResponse.builder();

                        builder.tenancy(response.getItem());

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        GetTenancyResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
