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
public class ListRegionSubscriptionsConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static ListRegionSubscriptionsRequest interceptRequest(
            ListRegionSubscriptionsRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, ListRegionSubscriptionsRequest request) {
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
                        .path(encodePathSegment(request.getTenancyId()))
                        .path("regionSubscriptions");

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        return ib;
    }

    public static Function<Response, ListRegionSubscriptionsResponse> fromResponse() {
        final Function<Response, ListRegionSubscriptionsResponse> transformer =
                new Function<Response, ListRegionSubscriptionsResponse>() {
                    @Override
                    public ListRegionSubscriptionsResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for ListRegionSubscriptionsResponse");
                        Function<Response, WithHeaders<List<RegionSubscription>>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(
                                        new GenericType<List<RegionSubscription>>() {});

                        WithHeaders<List<RegionSubscription>> response =
                                responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        ListRegionSubscriptionsResponse.Builder builder =
                                ListRegionSubscriptionsResponse.builder();

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

                        ListRegionSubscriptionsResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
