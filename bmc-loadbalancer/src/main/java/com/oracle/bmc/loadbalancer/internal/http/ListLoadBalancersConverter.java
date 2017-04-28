/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.internal.http;

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
import com.oracle.bmc.loadbalancer.model.*;
import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Slf4j
public class ListLoadBalancersConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static ListLoadBalancersRequest interceptRequest(ListLoadBalancersRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, ListLoadBalancersRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCompartmentId() == null) {
            throw new NullPointerException("compartmentId is required");
        }

        WebTarget target = client.getBaseTarget().path("/20170115").path("loadBalancers");

        if (request.getLimit() != null) {
            target = target.queryParam("limit", attemptEncodeQueryParam(request.getLimit()));
        }

        if (request.getPage() != null) {
            target = target.queryParam("page", attemptEncodeQueryParam(request.getPage()));
        }

        target =
                target.queryParam(
                        "compartmentId", attemptEncodeQueryParam(request.getCompartmentId()));

        if (request.getDetail() != null) {
            target = target.queryParam("detail", attemptEncodeQueryParam(request.getDetail()));
        }

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static Function<Response, ListLoadBalancersResponse> fromResponse() {
        final Function<Response, ListLoadBalancersResponse> transformer =
                new Function<Response, ListLoadBalancersResponse>() {
                    @Override
                    public ListLoadBalancersResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for ListLoadBalancersResponse");
                        Function<Response, WithHeaders<List<LoadBalancer>>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(
                                        new GenericType<List<LoadBalancer>>() {});

                        WithHeaders<List<LoadBalancer>> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        ListLoadBalancersResponse.Builder builder =
                                ListLoadBalancersResponse.builder();

                        builder.items(response.getItem());

                        Optional<List<String>> opcNextPageHeader =
                                HeaderUtils.get(headers, "opc-next-page");
                        if (opcNextPageHeader.isPresent()) {
                            builder.opcNextPage(
                                    HeaderUtils.toValue(
                                            "opc-next-page",
                                            opcNextPageHeader.get().get(0),
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

                        ListLoadBalancersResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
