/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.ospgateway.model.*;
import com.oracle.bmc.ospgateway.requests.*;
import com.oracle.bmc.ospgateway.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@lombok.extern.slf4j.Slf4j
public class AuthorizeSubscriptionPaymentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.ospgateway.requests.AuthorizeSubscriptionPaymentRequest
            interceptRequest(
                    com.oracle.bmc.ospgateway.requests.AuthorizeSubscriptionPaymentRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.ospgateway.requests.AuthorizeSubscriptionPaymentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getOspHomeRegion(), "ospHomeRegion is required");
        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");
        Validate.notNull(
                request.getAuthorizeSubscriptionPaymentDetails(),
                "authorizeSubscriptionPaymentDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20191001")
                        .path("subscriptions")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getSubscriptionId()))
                        .path("actions")
                        .path("psd2auth");

        target =
                target.queryParam(
                        "ospHomeRegion",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getOspHomeRegion()));

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

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

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.ospgateway.responses.AuthorizeSubscriptionPaymentResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.ospgateway.responses.AuthorizeSubscriptionPaymentResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.ospgateway.responses
                                        .AuthorizeSubscriptionPaymentResponse>() {
                            @Override
                            public com.oracle.bmc.ospgateway.responses
                                            .AuthorizeSubscriptionPaymentResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.ospgateway.responses.AuthorizeSubscriptionPaymentResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.ospgateway.model
                                                                .AuthorizeSubscriptionPaymentReceipt>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        com.oracle.bmc.ospgateway.model
                                                                        .AuthorizeSubscriptionPaymentReceipt
                                                                .class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.ospgateway.model
                                                        .AuthorizeSubscriptionPaymentReceipt>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.ospgateway.responses
                                                .AuthorizeSubscriptionPaymentResponse.Builder
                                        builder =
                                                com.oracle.bmc.ospgateway.responses
                                                        .AuthorizeSubscriptionPaymentResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.authorizeSubscriptionPaymentReceipt(response.getItem());

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

                                com.google.common.base.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

                                com.oracle.bmc.ospgateway.responses
                                                .AuthorizeSubscriptionPaymentResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
