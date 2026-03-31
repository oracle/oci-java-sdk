/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emaildataplane.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.emaildataplane.model.*;
import com.oracle.bmc.emaildataplane.requests.*;
import com.oracle.bmc.emaildataplane.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220926")
public class SubmitRawEmailConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SubmitRawEmailConverter.class);

    public static com.oracle.bmc.emaildataplane.requests.SubmitRawEmailRequest interceptRequest(
            com.oracle.bmc.emaildataplane.requests.SubmitRawEmailRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.emaildataplane.requests.SubmitRawEmailRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getContentType(), "contentType is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");
        Validate.notNull(request.getSender(), "sender is required");
        Validate.notNull(request.getRecipients(), "recipients is required");
        Validate.notNull(request.getRawMessage(), "rawMessage is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20220926").path("actions").path("submitRawEmail");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getContentLength() != null) {
            ib.header("content-length", request.getContentLength());
        }

        ib.header("content-type", request.getContentType().getValue());

        ib.header("compartment-id", request.getCompartmentId());

        ib.header("sender", request.getSender());

        ib.header(
                "recipients",
                com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatHeaderParam(
                        "recipients",
                        request.getRecipients(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated));

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.emaildataplane.responses.SubmitRawEmailResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.emaildataplane.responses.SubmitRawEmailResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.emaildataplane.responses.SubmitRawEmailResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.emaildataplane.responses.SubmitRawEmailResponse>() {
                            @Override
                            public com.oracle.bmc.emaildataplane.responses.SubmitRawEmailResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.emaildataplane.responses.SubmitRawEmailResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.emaildataplane.model
                                                                .EmailRawSubmittedResponse>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.emaildataplane.model
                                                                    .EmailRawSubmittedResponse
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.emaildataplane.model
                                                                    .EmailRawSubmittedResponse
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.emaildataplane.model
                                                        .EmailRawSubmittedResponse>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.emaildataplane.responses.SubmitRawEmailResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.emaildataplane.responses
                                                        .SubmitRawEmailResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.emailRawSubmittedResponse(response.getItem());

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

                                com.oracle.bmc.emaildataplane.responses.SubmitRawEmailResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
