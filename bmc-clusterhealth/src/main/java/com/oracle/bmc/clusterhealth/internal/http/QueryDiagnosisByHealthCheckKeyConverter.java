/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.clusterhealth.model.*;
import com.oracle.bmc.clusterhealth.requests.*;
import com.oracle.bmc.clusterhealth.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
public class QueryDiagnosisByHealthCheckKeyConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(QueryDiagnosisByHealthCheckKeyConverter.class);

    public static com.oracle.bmc.clusterhealth.requests.QueryDiagnosisByHealthCheckKeyRequest
            interceptRequest(
                    com.oracle.bmc.clusterhealth.requests.QueryDiagnosisByHealthCheckKeyRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.clusterhealth.requests.QueryDiagnosisByHealthCheckKeyRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Validate.notNull(
                request.getQueryDiagnosisByHealthCheckKeyDetails(),
                "queryDiagnosisByHealthCheckKeyDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20260331")
                        .path("diagnosisStores")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDiagnosisStoreId()))
                        .path("actions")
                        .path("queryDiagnosisByHealthCheckKey");

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
                    com.oracle.bmc.clusterhealth.responses.QueryDiagnosisByHealthCheckKeyResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.clusterhealth.responses.QueryDiagnosisByHealthCheckKeyResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.clusterhealth.responses
                                .QueryDiagnosisByHealthCheckKeyResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.clusterhealth.responses
                                        .QueryDiagnosisByHealthCheckKeyResponse>() {
                            @Override
                            public com.oracle.bmc.clusterhealth.responses
                                            .QueryDiagnosisByHealthCheckKeyResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.clusterhealth.responses.QueryDiagnosisByHealthCheckKeyResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.clusterhealth.model
                                                                .RecommendationReport>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.clusterhealth.model
                                                                    .RecommendationReport
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.clusterhealth.model
                                                                    .RecommendationReport
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.clusterhealth.model
                                                        .RecommendationReport>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.clusterhealth.responses
                                                .QueryDiagnosisByHealthCheckKeyResponse.Builder
                                        builder =
                                                com.oracle.bmc.clusterhealth.responses
                                                        .QueryDiagnosisByHealthCheckKeyResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.recommendationReport(response.getItem());

                                java.util.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

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

                                com.oracle.bmc.clusterhealth.responses
                                                .QueryDiagnosisByHealthCheckKeyResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
