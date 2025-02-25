/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.opsi.model.*;
import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetAwrDatabaseSqlReportConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetAwrDatabaseSqlReportConverter.class);

    public static com.oracle.bmc.opsi.requests.GetAwrDatabaseSqlReportRequest interceptRequest(
            com.oracle.bmc.opsi.requests.GetAwrDatabaseSqlReportRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.opsi.requests.GetAwrDatabaseSqlReportRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAwrHubId(), "awrHubId must not be blank");
        Validate.notNull(
                request.getAwrSourceDatabaseIdentifier(),
                "awrSourceDatabaseIdentifier is required");
        Validate.notNull(request.getSqlId(), "sqlId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200630")
                        .path("awrHubs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getAwrHubId()))
                        .path("awrDatabaseSqlReport");

        target =
                target.queryParam(
                        "awrSourceDatabaseIdentifier",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getAwrSourceDatabaseIdentifier()));

        if (request.getInstanceNumber() != null) {
            target =
                    target.queryParam(
                            "instanceNumber",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getInstanceNumber()));
        }

        if (request.getBeginSnapshotIdentifierGreaterThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "beginSnapshotIdentifierGreaterThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getBeginSnapshotIdentifierGreaterThanOrEqualTo()));
        }

        if (request.getEndSnapshotIdentifierLessThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "endSnapshotIdentifierLessThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getEndSnapshotIdentifierLessThanOrEqualTo()));
        }

        if (request.getTimeGreaterThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "timeGreaterThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeGreaterThanOrEqualTo()));
        }

        if (request.getTimeLessThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "timeLessThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeLessThanOrEqualTo()));
        }

        target =
                target.queryParam(
                        "sqlId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getSqlId()));

        if (request.getReportFormat() != null) {
            target =
                    target.queryParam(
                            "reportFormat",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getReportFormat().getValue()));
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
                    com.oracle.bmc.opsi.responses.GetAwrDatabaseSqlReportResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.opsi.responses.GetAwrDatabaseSqlReportResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.opsi.responses.GetAwrDatabaseSqlReportResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.opsi.responses.GetAwrDatabaseSqlReportResponse>() {
                            @Override
                            public com.oracle.bmc.opsi.responses.GetAwrDatabaseSqlReportResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.opsi.responses.GetAwrDatabaseSqlReportResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.opsi.model
                                                                .AwrDatabaseSqlReport>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.opsi.model.AwrDatabaseSqlReport
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.opsi.model.AwrDatabaseSqlReport
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.opsi.model.AwrDatabaseSqlReport>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.opsi.responses.GetAwrDatabaseSqlReportResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.opsi.responses
                                                        .GetAwrDatabaseSqlReportResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.awrDatabaseSqlReport(response.getItem());

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

                                com.oracle.bmc.opsi.responses.GetAwrDatabaseSqlReportResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
