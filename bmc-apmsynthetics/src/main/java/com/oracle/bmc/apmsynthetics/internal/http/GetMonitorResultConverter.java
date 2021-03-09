/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.apmsynthetics.model.*;
import com.oracle.bmc.apmsynthetics.requests.*;
import com.oracle.bmc.apmsynthetics.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.extern.slf4j.Slf4j
public class GetMonitorResultConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.apmsynthetics.requests.GetMonitorResultRequest interceptRequest(
            com.oracle.bmc.apmsynthetics.requests.GetMonitorResultRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.apmsynthetics.requests.GetMonitorResultRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getApmDomainId(), "apmDomainId is required");
        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Validate.notNull(request.getVantagePoint(), "vantagePoint is required");
        Validate.notNull(request.getResultType(), "resultType is required");
        Validate.notNull(request.getResultContentType(), "resultContentType is required");
        Validate.notBlank(request.getExecutionTime(), "executionTime must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200630")
                        .path("monitors")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getMonitorId()))
                        .path("results")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getExecutionTime()));

        target =
                target.queryParam(
                        "apmDomainId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getApmDomainId()));

        target =
                target.queryParam(
                        "vantagePoint",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getVantagePoint()));

        target =
                target.queryParam(
                        "resultType",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getResultType()));

        target =
                target.queryParam(
                        "resultContentType",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getResultContentType()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.apmsynthetics.responses.GetMonitorResultResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.apmsynthetics.responses.GetMonitorResultResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.apmsynthetics.responses.GetMonitorResultResponse>() {
                            @Override
                            public com.oracle.bmc.apmsynthetics.responses.GetMonitorResultResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.apmsynthetics.responses.GetMonitorResultResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        MonitorResult>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        MonitorResult.class);

                                com.oracle.bmc.http.internal.WithHeaders<MonitorResult> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.apmsynthetics.responses.GetMonitorResultResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.apmsynthetics.responses
                                                        .GetMonitorResultResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.monitorResult(response.getItem());

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

                                com.oracle.bmc.apmsynthetics.responses.GetMonitorResultResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
