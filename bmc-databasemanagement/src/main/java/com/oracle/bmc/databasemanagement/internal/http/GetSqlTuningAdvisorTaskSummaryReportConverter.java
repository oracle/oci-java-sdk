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
public class GetSqlTuningAdvisorTaskSummaryReportConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetSqlTuningAdvisorTaskSummaryReportConverter.class);

    public static com.oracle.bmc.databasemanagement.requests
                    .GetSqlTuningAdvisorTaskSummaryReportRequest
            interceptRequest(
                    com.oracle.bmc.databasemanagement.requests
                                    .GetSqlTuningAdvisorTaskSummaryReportRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.databasemanagement.requests.GetSqlTuningAdvisorTaskSummaryReportRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20201101")
                        .path("managedDatabases")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getManagedDatabaseId()))
                        .path("sqlTuningAdvisorTasks")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getSqlTuningAdvisorTaskId()))
                        .path("summaryReport");

        if (request.getSearchPeriod() != null) {
            target =
                    target.queryParam(
                            "searchPeriod",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSearchPeriod().getValue()));
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

        if (request.getBeginExecIdGreaterThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "beginExecIdGreaterThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getBeginExecIdGreaterThanOrEqualTo()));
        }

        if (request.getEndExecIdLessThanOrEqualTo() != null) {
            target =
                    target.queryParam(
                            "endExecIdLessThanOrEqualTo",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getEndExecIdLessThanOrEqualTo()));
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
                    com.oracle.bmc.databasemanagement.responses
                            .GetSqlTuningAdvisorTaskSummaryReportResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.databasemanagement.responses
                            .GetSqlTuningAdvisorTaskSummaryReportResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.databasemanagement.responses
                                .GetSqlTuningAdvisorTaskSummaryReportResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.databasemanagement.responses
                                        .GetSqlTuningAdvisorTaskSummaryReportResponse>() {
                            @Override
                            public com.oracle.bmc.databasemanagement.responses
                                            .GetSqlTuningAdvisorTaskSummaryReportResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.databasemanagement.responses.GetSqlTuningAdvisorTaskSummaryReportResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.databasemanagement.model
                                                                .SqlTuningAdvisorTaskSummaryReport>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.databasemanagement.model
                                                                    .SqlTuningAdvisorTaskSummaryReport
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.databasemanagement.model
                                                                    .SqlTuningAdvisorTaskSummaryReport
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.databasemanagement.model
                                                        .SqlTuningAdvisorTaskSummaryReport>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.databasemanagement.responses
                                                .GetSqlTuningAdvisorTaskSummaryReportResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.databasemanagement.responses
                                                        .GetSqlTuningAdvisorTaskSummaryReportResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.sqlTuningAdvisorTaskSummaryReport(response.getItem());

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
                                                .GetSqlTuningAdvisorTaskSummaryReportResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
