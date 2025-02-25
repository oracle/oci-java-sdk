/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.datacatalog.model.*;
import com.oracle.bmc.datacatalog.requests.*;
import com.oracle.bmc.datacatalog.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ListJobsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListJobsConverter.class);

    public static com.oracle.bmc.datacatalog.requests.ListJobsRequest interceptRequest(
            com.oracle.bmc.datacatalog.requests.ListJobsRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.datacatalog.requests.ListJobsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20190325")
                        .path("catalogs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getCatalogId()))
                        .path("jobs");

        if (request.getDisplayName() != null) {
            target =
                    target.queryParam(
                            "displayName",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getDisplayName()));
        }

        if (request.getDisplayNameContains() != null) {
            target =
                    target.queryParam(
                            "displayNameContains",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getDisplayNameContains()));
        }

        if (request.getLifecycleState() != null) {
            target =
                    target.queryParam(
                            "lifecycleState",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLifecycleState().getValue()));
        }

        if (request.getTimeCreated() != null) {
            target =
                    target.queryParam(
                            "timeCreated",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeCreated()));
        }

        if (request.getTimeUpdated() != null) {
            target =
                    target.queryParam(
                            "timeUpdated",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeUpdated()));
        }

        if (request.getCreatedById() != null) {
            target =
                    target.queryParam(
                            "createdById",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getCreatedById()));
        }

        if (request.getUpdatedById() != null) {
            target =
                    target.queryParam(
                            "updatedById",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getUpdatedById()));
        }

        if (request.getJobType() != null) {
            target =
                    target.queryParam(
                            "jobType",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getJobType().getValue()));
        }

        if (request.getJobDefinitionKey() != null) {
            target =
                    target.queryParam(
                            "jobDefinitionKey",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getJobDefinitionKey()));
        }

        if (request.getDataAssetKey() != null) {
            target =
                    target.queryParam(
                            "dataAssetKey",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getDataAssetKey()));
        }

        if (request.getGlossaryKey() != null) {
            target =
                    target.queryParam(
                            "glossaryKey",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getGlossaryKey()));
        }

        if (request.getScheduleCronExpression() != null) {
            target =
                    target.queryParam(
                            "scheduleCronExpression",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getScheduleCronExpression()));
        }

        if (request.getTimeScheduleBegin() != null) {
            target =
                    target.queryParam(
                            "timeScheduleBegin",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeScheduleBegin()));
        }

        if (request.getTimeScheduleEnd() != null) {
            target =
                    target.queryParam(
                            "timeScheduleEnd",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeScheduleEnd()));
        }

        if (request.getScheduleType() != null) {
            target =
                    target.queryParam(
                            "scheduleType",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getScheduleType().getValue()));
        }

        if (request.getConnectionKey() != null) {
            target =
                    target.queryParam(
                            "connectionKey",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getConnectionKey()));
        }

        if (request.getFields() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "fields",
                            request.getFields(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getExecutionCount() != null) {
            target =
                    target.queryParam(
                            "executionCount",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getExecutionCount()));
        }

        if (request.getTimeOfLatestExecution() != null) {
            target =
                    target.queryParam(
                            "timeOfLatestExecution",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeOfLatestExecution()));
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

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        if (request.getPage() != null) {
            target =
                    target.queryParam(
                            "page",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPage()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.datacatalog.responses.ListJobsResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.datacatalog.responses.ListJobsResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.datacatalog.responses.ListJobsResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.datacatalog.responses.ListJobsResponse>() {
                            @Override
                            public com.oracle.bmc.datacatalog.responses.ListJobsResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.datacatalog.responses.ListJobsResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.datacatalog.model
                                                                .JobCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.datacatalog.model.JobCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.datacatalog.model.JobCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.datacatalog.model.JobCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.datacatalog.responses.ListJobsResponse.Builder
                                        builder =
                                                com.oracle.bmc.datacatalog.responses
                                                        .ListJobsResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.jobCollection(response.getItem());

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

                                com.oracle.bmc.datacatalog.responses.ListJobsResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
