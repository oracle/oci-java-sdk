/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.databasemanagement.model.*;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ListSqlPlanBaselinesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListSqlPlanBaselinesConverter.class);

    public static com.oracle.bmc.databasemanagement.requests.ListSqlPlanBaselinesRequest
            interceptRequest(
                    com.oracle.bmc.databasemanagement.requests.ListSqlPlanBaselinesRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.databasemanagement.requests.ListSqlPlanBaselinesRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20201101")
                        .path("managedDatabases")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getManagedDatabaseId()))
                        .path("sqlPlanBaselines");

        if (request.getPlanName() != null) {
            target =
                    target.queryParam(
                            "planName",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPlanName()));
        }

        if (request.getSqlHandle() != null) {
            target =
                    target.queryParam(
                            "sqlHandle",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSqlHandle()));
        }

        if (request.getSqlText() != null) {
            target =
                    target.queryParam(
                            "sqlText",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSqlText()));
        }

        if (request.getIsEnabled() != null) {
            target =
                    target.queryParam(
                            "isEnabled",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsEnabled()));
        }

        if (request.getIsAccepted() != null) {
            target =
                    target.queryParam(
                            "isAccepted",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsAccepted()));
        }

        if (request.getIsReproduced() != null) {
            target =
                    target.queryParam(
                            "isReproduced",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsReproduced()));
        }

        if (request.getIsFixed() != null) {
            target =
                    target.queryParam(
                            "isFixed",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsFixed()));
        }

        if (request.getIsAdaptive() != null) {
            target =
                    target.queryParam(
                            "isAdaptive",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsAdaptive()));
        }

        if (request.getOrigin() != null) {
            target =
                    target.queryParam(
                            "origin",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getOrigin().getValue()));
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

        if (request.getSortBy() != null) {
            target =
                    target.queryParam(
                            "sortBy",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortBy().getValue()));
        }

        if (request.getSortOrder() != null) {
            target =
                    target.queryParam(
                            "sortOrder",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortOrder().getValue()));
        }

        if (request.getIsAutoPurged() != null) {
            target =
                    target.queryParam(
                            "isAutoPurged",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsAutoPurged()));
        }

        if (request.getTimeLastExecutedGreaterThan() != null) {
            target =
                    target.queryParam(
                            "timeLastExecutedGreaterThan",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeLastExecutedGreaterThan()));
        }

        if (request.getTimeLastExecutedLessThan() != null) {
            target =
                    target.queryParam(
                            "timeLastExecutedLessThan",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeLastExecutedLessThan()));
        }

        if (request.getIsNeverExecuted() != null) {
            target =
                    target.queryParam(
                            "isNeverExecuted",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsNeverExecuted()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getOpcNamedCredentialId() != null) {
            ib.header("opc-named-credential-id", request.getOpcNamedCredentialId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.databasemanagement.responses.ListSqlPlanBaselinesResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.databasemanagement.responses.ListSqlPlanBaselinesResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.databasemanagement.responses.ListSqlPlanBaselinesResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.databasemanagement.responses
                                        .ListSqlPlanBaselinesResponse>() {
                            @Override
                            public com.oracle.bmc.databasemanagement.responses
                                            .ListSqlPlanBaselinesResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.databasemanagement.responses.ListSqlPlanBaselinesResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.databasemanagement.model
                                                                .SqlPlanBaselineCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.databasemanagement.model
                                                                    .SqlPlanBaselineCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.databasemanagement.model
                                                                    .SqlPlanBaselineCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.databasemanagement.model
                                                        .SqlPlanBaselineCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.databasemanagement.responses
                                                .ListSqlPlanBaselinesResponse.Builder
                                        builder =
                                                com.oracle.bmc.databasemanagement.responses
                                                        .ListSqlPlanBaselinesResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.sqlPlanBaselineCollection(response.getItem());

                                java.util.Optional<java.util.List<String>> opcRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcNextPageHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.databasemanagement.responses
                                                .ListSqlPlanBaselinesResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
