/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.computecloudatcustomer.model.*;
import com.oracle.bmc.computecloudatcustomer.requests.*;
import com.oracle.bmc.computecloudatcustomer.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
public class ChangeCccUpgradeScheduleCompartmentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ChangeCccUpgradeScheduleCompartmentConverter.class);

    public static com.oracle.bmc.computecloudatcustomer.requests
                    .ChangeCccUpgradeScheduleCompartmentRequest
            interceptRequest(
                    com.oracle.bmc.computecloudatcustomer.requests
                                    .ChangeCccUpgradeScheduleCompartmentRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.computecloudatcustomer.requests
                            .ChangeCccUpgradeScheduleCompartmentRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getCccUpgradeScheduleId(), "cccUpgradeScheduleId must not be blank");
        Validate.notNull(
                request.getChangeCccUpgradeScheduleCompartmentDetails(),
                "changeCccUpgradeScheduleCompartmentDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20221208")
                        .path("cccUpgradeSchedules")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getCccUpgradeScheduleId()))
                        .path("actions")
                        .path("changeCompartment");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

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
                    com.oracle.bmc.computecloudatcustomer.responses
                            .ChangeCccUpgradeScheduleCompartmentResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.computecloudatcustomer.responses
                            .ChangeCccUpgradeScheduleCompartmentResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.computecloudatcustomer.responses
                                .ChangeCccUpgradeScheduleCompartmentResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.computecloudatcustomer.responses
                                        .ChangeCccUpgradeScheduleCompartmentResponse>() {
                            @Override
                            public com.oracle.bmc.computecloudatcustomer.responses
                                            .ChangeCccUpgradeScheduleCompartmentResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.computecloudatcustomer.responses.ChangeCccUpgradeScheduleCompartmentResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    serviceDetails.get());
                                } else {
                                    responseFn = RESPONSE_CONVERSION_FACTORY.create();
                                }

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.computecloudatcustomer.responses
                                                .ChangeCccUpgradeScheduleCompartmentResponse.Builder
                                        builder =
                                                com.oracle.bmc.computecloudatcustomer.responses
                                                        .ChangeCccUpgradeScheduleCompartmentResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

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

                                com.oracle.bmc.computecloudatcustomer.responses
                                                .ChangeCccUpgradeScheduleCompartmentResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
