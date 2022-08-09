/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.opsi.model.*;
import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeExadataInsightResourceForecastTrendConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    SummarizeExadataInsightResourceForecastTrendConverter.class);

    public static com.oracle.bmc.opsi.requests.SummarizeExadataInsightResourceForecastTrendRequest
            interceptRequest(
                    com.oracle.bmc.opsi.requests.SummarizeExadataInsightResourceForecastTrendRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.opsi.requests.SummarizeExadataInsightResourceForecastTrendRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getResourceType(), "resourceType is required");
        Validate.notNull(request.getResourceMetric(), "resourceMetric is required");
        Validate.notNull(request.getExadataInsightId(), "exadataInsightId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200630")
                        .path("exadataInsights")
                        .path("resourceForecastTrend");

        target =
                target.queryParam(
                        "resourceType",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getResourceType()));

        target =
                target.queryParam(
                        "resourceMetric",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getResourceMetric()));

        if (request.getAnalysisTimeInterval() != null) {
            target =
                    target.queryParam(
                            "analysisTimeInterval",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getAnalysisTimeInterval()));
        }

        if (request.getTimeIntervalStart() != null) {
            target =
                    target.queryParam(
                            "timeIntervalStart",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeIntervalStart()));
        }

        if (request.getTimeIntervalEnd() != null) {
            target =
                    target.queryParam(
                            "timeIntervalEnd",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeIntervalEnd()));
        }

        target =
                target.queryParam(
                        "exadataInsightId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getExadataInsightId()));

        if (request.getDatabaseInsightId() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "databaseInsightId",
                            request.getDatabaseInsightId(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getHostInsightId() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "hostInsightId",
                            request.getHostInsightId(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getStorageServerName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "storageServerName",
                            request.getStorageServerName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getExadataType() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "exadataType",
                            request.getExadataType(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getStatistic() != null) {
            target =
                    target.queryParam(
                            "statistic",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getStatistic().getValue()));
        }

        if (request.getForecastStartDay() != null) {
            target =
                    target.queryParam(
                            "forecastStartDay",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getForecastStartDay()));
        }

        if (request.getForecastDays() != null) {
            target =
                    target.queryParam(
                            "forecastDays",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getForecastDays()));
        }

        if (request.getForecastModel() != null) {
            target =
                    target.queryParam(
                            "forecastModel",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getForecastModel().getValue()));
        }

        if (request.getCdbName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "cdbName",
                            request.getCdbName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getHostName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "hostName",
                            request.getHostName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        if (request.getConfidence() != null) {
            target =
                    target.queryParam(
                            "confidence",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getConfidence()));
        }

        if (request.getSortOrder() != null) {
            target =
                    target.queryParam(
                            "sortOrder",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortOrder().getValue()));
        }

        if (request.getSortBy() != null) {
            target =
                    target.queryParam(
                            "sortBy",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortBy().getValue()));
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
                    com.oracle.bmc.opsi.responses
                            .SummarizeExadataInsightResourceForecastTrendResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.opsi.responses
                            .SummarizeExadataInsightResourceForecastTrendResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.opsi.responses
                                .SummarizeExadataInsightResourceForecastTrendResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.opsi.responses
                                        .SummarizeExadataInsightResourceForecastTrendResponse>() {
                            @Override
                            public com.oracle.bmc.opsi.responses
                                            .SummarizeExadataInsightResourceForecastTrendResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.opsi.responses.SummarizeExadataInsightResourceForecastTrendResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.opsi.model
                                                                .SummarizeExadataInsightResourceForecastTrendCollection>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.opsi.model
                                                                    .SummarizeExadataInsightResourceForecastTrendCollection
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.opsi.model
                                                                    .SummarizeExadataInsightResourceForecastTrendCollection
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.opsi.model
                                                        .SummarizeExadataInsightResourceForecastTrendCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.opsi.responses
                                                .SummarizeExadataInsightResourceForecastTrendResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.opsi.responses
                                                        .SummarizeExadataInsightResourceForecastTrendResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.summarizeExadataInsightResourceForecastTrendCollection(
                                        response.getItem());

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

                                com.oracle.bmc.opsi.responses
                                                .SummarizeExadataInsightResourceForecastTrendResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
