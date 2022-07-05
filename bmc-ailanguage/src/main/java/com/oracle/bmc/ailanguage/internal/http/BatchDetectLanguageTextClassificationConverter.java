/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.ailanguage.model.*;
import com.oracle.bmc.ailanguage.requests.*;
import com.oracle.bmc.ailanguage.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class BatchDetectLanguageTextClassificationConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BatchDetectLanguageTextClassificationConverter.class);

    public static com.oracle.bmc.ailanguage.requests.BatchDetectLanguageTextClassificationRequest
            interceptRequest(
                    com.oracle.bmc.ailanguage.requests.BatchDetectLanguageTextClassificationRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.ailanguage.requests.BatchDetectLanguageTextClassificationRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(
                request.getBatchDetectLanguageTextClassificationDetails(),
                "batchDetectLanguageTextClassificationDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20210101")
                        .path("actions")
                        .path("batchDetectLanguageTextClassification");

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

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.ailanguage.responses
                            .BatchDetectLanguageTextClassificationResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.ailanguage.responses
                            .BatchDetectLanguageTextClassificationResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.ailanguage.responses
                                .BatchDetectLanguageTextClassificationResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.ailanguage.responses
                                        .BatchDetectLanguageTextClassificationResponse>() {
                            @Override
                            public com.oracle.bmc.ailanguage.responses
                                            .BatchDetectLanguageTextClassificationResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.ailanguage.responses.BatchDetectLanguageTextClassificationResponse");
                                final com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.ailanguage.model
                                                                .BatchDetectLanguageTextClassificationResult>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.ailanguage.model
                                                                    .BatchDetectLanguageTextClassificationResult
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.ailanguage.model
                                                                    .BatchDetectLanguageTextClassificationResult
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.ailanguage.model
                                                        .BatchDetectLanguageTextClassificationResult>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.ailanguage.responses
                                                .BatchDetectLanguageTextClassificationResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.ailanguage.responses
                                                        .BatchDetectLanguageTextClassificationResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.batchDetectLanguageTextClassificationResult(
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

                                com.oracle.bmc.ailanguage.responses
                                                .BatchDetectLanguageTextClassificationResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
