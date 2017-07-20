/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.internal.http;

import com.oracle.bmc.identity.model.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class ListUserGroupMembershipsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static ListUserGroupMembershipsRequest interceptRequest(
            ListUserGroupMembershipsRequest request) {

        return request;
    }

    public static javax.ws.rs.client.Invocation.Builder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            ListUserGroupMembershipsRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCompartmentId() == null) {
            throw new NullPointerException("compartmentId is required");
        }

        javax.ws.rs.client.WebTarget target =
                client.getBaseTarget().path("/20160918").path("userGroupMemberships");

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        if (request.getUserId() != null) {
            target =
                    target.queryParam(
                            "userId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getUserId()));
        }

        if (request.getGroupId() != null) {
            target =
                    target.queryParam(
                            "groupId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getGroupId()));
        }

        if (request.getPage() != null) {
            target =
                    target.queryParam(
                            "page",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPage()));
        }

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        javax.ws.rs.client.Invocation.Builder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, ListUserGroupMembershipsResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListUserGroupMembershipsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, ListUserGroupMembershipsResponse>() {
                            @Override
                            public ListUserGroupMembershipsResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for ListUserGroupMembershipsResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.util.List<UserGroupMembership>>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        new javax.ws.rs.core.GenericType<
                                                                java.util.List<
                                                                        UserGroupMembership>>() {});

                                com.oracle.bmc.http.internal.WithHeaders<
                                                java.util.List<UserGroupMembership>>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                ListUserGroupMembershipsResponse.Builder builder =
                                        ListUserGroupMembershipsResponse.builder();

                                builder.items(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcNextPageHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                ListUserGroupMembershipsResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
