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
public class GetHeatWaveFleetMetricConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetHeatWaveFleetMetricConverter.class);

    public static com.oracle.bmc.databasemanagement.requests.GetHeatWaveFleetMetricRequest
            interceptRequest(
                    com.oracle.bmc.databasemanagement.requests.GetHeatWaveFleetMetricRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.databasemanagement.requests.GetHeatWaveFleetMetricRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");
        Validate.notNull(request.getStartTime(), "startTime is required");
        Validate.notNull(request.getEndTime(), "endTime is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20201101").path("heatWaveFleetMetrics");

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        if (request.getFilterByMetricNames() != null) {
            target =
                    target.queryParam(
                            "filterByMetricNames",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getFilterByMetricNames()));
        }

        target =
                target.queryParam(
                        "startTime",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getStartTime()));

        target =
                target.queryParam(
                        "endTime",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getEndTime()));

        if (request.getFilterByHeatWaveStatus() != null) {
            target =
                    target.queryParam(
                            "filterByHeatWaveStatus",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getFilterByHeatWaveStatus().getValue()));
        }

        if (request.getFilterByHeatWaveShape() != null) {
            target =
                    target.queryParam(
                            "filterByHeatWaveShape",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getFilterByHeatWaveShape()));
        }

        if (request.getIsHeatWaveLakehouseEnabled() != null) {
            target =
                    target.queryParam(
                            "isHeatWaveLakehouseEnabled",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsHeatWaveLakehouseEnabled()));
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
                    com.oracle.bmc.databasemanagement.responses.GetHeatWaveFleetMetricResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.databasemanagement.responses.GetHeatWaveFleetMetricResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.databasemanagement.responses.GetHeatWaveFleetMetricResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.databasemanagement.responses
                                        .GetHeatWaveFleetMetricResponse>() {
                            @Override
                            public com.oracle.bmc.databasemanagement.responses
                                            .GetHeatWaveFleetMetricResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.databasemanagement.responses.GetHeatWaveFleetMetricResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.databasemanagement.model
                                                                .HeatWaveFleetMetrics>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.databasemanagement.model
                                                                    .HeatWaveFleetMetrics
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.databasemanagement.model
                                                                    .HeatWaveFleetMetrics
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.databasemanagement.model
                                                        .HeatWaveFleetMetrics>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.databasemanagement.responses
                                                .GetHeatWaveFleetMetricResponse.Builder
                                        builder =
                                                com.oracle.bmc.databasemanagement.responses
                                                        .GetHeatWaveFleetMetricResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.heatWaveFleetMetrics(response.getItem());

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

                                com.oracle.bmc.databasemanagement.responses
                                                .GetHeatWaveFleetMetricResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
