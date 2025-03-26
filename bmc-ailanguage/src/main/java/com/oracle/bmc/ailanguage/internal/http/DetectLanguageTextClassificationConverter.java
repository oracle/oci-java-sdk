/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.ailanguage.model.*;
import com.oracle.bmc.ailanguage.requests.*;
import com.oracle.bmc.ailanguage.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class DetectLanguageTextClassificationConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DetectLanguageTextClassificationConverter.class);

    public static com.oracle.bmc.ailanguage.requests.DetectLanguageTextClassificationRequest
            interceptRequest(
                    com.oracle.bmc.ailanguage.requests.DetectLanguageTextClassificationRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.ailanguage.requests.DetectLanguageTextClassificationRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(
                request.getDetectLanguageTextClassificationDetails(),
                "detectLanguageTextClassificationDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20221001")
                        .path("actions")
                        .path("detectLanguageTextClassification");

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
                    com.oracle.bmc.ailanguage.responses.DetectLanguageTextClassificationResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.ailanguage.responses.DetectLanguageTextClassificationResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.ailanguage.responses
                                .DetectLanguageTextClassificationResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.ailanguage.responses
                                        .DetectLanguageTextClassificationResponse>() {
                            @Override
                            public com.oracle.bmc.ailanguage.responses
                                            .DetectLanguageTextClassificationResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.ailanguage.responses.DetectLanguageTextClassificationResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.ailanguage.model
                                                                .DetectLanguageTextClassificationResult>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.ailanguage.model
                                                                    .DetectLanguageTextClassificationResult
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.ailanguage.model
                                                                    .DetectLanguageTextClassificationResult
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.ailanguage.model
                                                        .DetectLanguageTextClassificationResult>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.ailanguage.responses
                                                .DetectLanguageTextClassificationResponse.Builder
                                        builder =
                                                com.oracle.bmc.ailanguage.responses
                                                        .DetectLanguageTextClassificationResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.detectLanguageTextClassificationResult(response.getItem());

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

                                java.util.Optional<java.util.List<String>> sunsetHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "sunset");
                                if (sunsetHeader.isPresent()) {
                                    builder.sunset(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "sunset",
                                                    sunsetHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.ailanguage.responses
                                                .DetectLanguageTextClassificationResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
