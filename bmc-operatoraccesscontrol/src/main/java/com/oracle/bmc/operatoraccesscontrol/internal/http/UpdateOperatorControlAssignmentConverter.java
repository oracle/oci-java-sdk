/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.operatoraccesscontrol.model.*;
import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateOperatorControlAssignmentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UpdateOperatorControlAssignmentConverter.class);

    public static com.oracle.bmc.operatoraccesscontrol.requests
                    .UpdateOperatorControlAssignmentRequest
            interceptRequest(
                    com.oracle.bmc.operatoraccesscontrol.requests
                                    .UpdateOperatorControlAssignmentRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.operatoraccesscontrol.requests.UpdateOperatorControlAssignmentRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");
        Validate.notNull(
                request.getUpdateOperatorControlAssignmentDetails(),
                "updateOperatorControlAssignmentDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200630")
                        .path("operatorControlAssignments")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getOperatorControlAssignmentId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
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
                    com.oracle.bmc.operatoraccesscontrol.responses
                            .UpdateOperatorControlAssignmentResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.operatoraccesscontrol.responses
                            .UpdateOperatorControlAssignmentResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.operatoraccesscontrol.responses
                                .UpdateOperatorControlAssignmentResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.operatoraccesscontrol.responses
                                        .UpdateOperatorControlAssignmentResponse>() {
                            @Override
                            public com.oracle.bmc.operatoraccesscontrol.responses
                                            .UpdateOperatorControlAssignmentResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.operatoraccesscontrol.responses.UpdateOperatorControlAssignmentResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.operatoraccesscontrol.model
                                                                .OperatorControlAssignment>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.operatoraccesscontrol.model
                                                                    .OperatorControlAssignment
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.operatoraccesscontrol.model
                                                                    .OperatorControlAssignment
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.operatoraccesscontrol.model
                                                        .OperatorControlAssignment>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.operatoraccesscontrol.responses
                                                .UpdateOperatorControlAssignmentResponse.Builder
                                        builder =
                                                com.oracle.bmc.operatoraccesscontrol.responses
                                                        .UpdateOperatorControlAssignmentResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.operatorControlAssignment(response.getItem());

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

                                com.oracle.bmc.operatoraccesscontrol.responses
                                                .UpdateOperatorControlAssignmentResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
