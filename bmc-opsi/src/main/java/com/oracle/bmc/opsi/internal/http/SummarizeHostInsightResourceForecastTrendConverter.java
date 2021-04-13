/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.opsi.model.*;
import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.extern.slf4j.Slf4j
public class SummarizeHostInsightResourceForecastTrendConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.opsi.requests.SummarizeHostInsightResourceForecastTrendRequest
            interceptRequest(
                    com.oracle.bmc.opsi.requests.SummarizeHostInsightResourceForecastTrendRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.opsi.requests.SummarizeHostInsightResourceForecastTrendRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");
        Validate.notNull(request.getResourceMetric(), "resourceMetric is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200630")
                        .path("hostInsights")
                        .path("resourceForecastTrend");

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

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

        if (request.getPlatformType() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "platformType",
                            request.getPlatformType(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getId() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "id",
                            request.getId(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getStatistic() != null) {
            target =
                    target.queryParam(
                            "statistic",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getStatistic().getValue()));
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

        if (request.getUtilizationLevel() != null) {
            target =
                    target.queryParam(
                            "utilizationLevel",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getUtilizationLevel().getValue()));
        }

        if (request.getConfidence() != null) {
            target =
                    target.queryParam(
                            "confidence",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getConfidence()));
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

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.opsi.responses.SummarizeHostInsightResourceForecastTrendResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.opsi.responses
                                .SummarizeHostInsightResourceForecastTrendResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.opsi.responses
                                        .SummarizeHostInsightResourceForecastTrendResponse>() {
                            @Override
                            public com.oracle.bmc.opsi.responses
                                            .SummarizeHostInsightResourceForecastTrendResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.opsi.responses.SummarizeHostInsightResourceForecastTrendResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        SummarizeHostInsightResourceForecastTrendAggregation>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        SummarizeHostInsightResourceForecastTrendAggregation
                                                                .class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                SummarizeHostInsightResourceForecastTrendAggregation>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.opsi.responses
                                                .SummarizeHostInsightResourceForecastTrendResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.opsi.responses
                                                        .SummarizeHostInsightResourceForecastTrendResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.summarizeHostInsightResourceForecastTrendAggregation(
                                        response.getItem());

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

                                com.oracle.bmc.opsi.responses
                                                .SummarizeHostInsightResourceForecastTrendResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
