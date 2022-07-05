/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.filestorage.model.*;
import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class ChangeMountTargetCompartmentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ChangeMountTargetCompartmentConverter.class);

    public static com.oracle.bmc.filestorage.requests.ChangeMountTargetCompartmentRequest
            interceptRequest(
                    com.oracle.bmc.filestorage.requests.ChangeMountTargetCompartmentRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.filestorage.requests.ChangeMountTargetCompartmentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getMountTargetId(), "mountTargetId must not be blank");
        Validate.notNull(
                request.getChangeMountTargetCompartmentDetails(),
                "changeMountTargetCompartmentDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20171215")
                        .path("mountTargets")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getMountTargetId()))
                        .path("actions")
                        .path("changeCompartment");

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

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.filestorage.responses.ChangeMountTargetCompartmentResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.filestorage.responses.ChangeMountTargetCompartmentResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.filestorage.responses.ChangeMountTargetCompartmentResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.filestorage.responses
                                        .ChangeMountTargetCompartmentResponse>() {
                            @Override
                            public com.oracle.bmc.filestorage.responses
                                            .ChangeMountTargetCompartmentResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.filestorage.responses.ChangeMountTargetCompartmentResponse");
                                final com.google.common.base.Function<
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

                                com.oracle.bmc.filestorage.responses
                                                .ChangeMountTargetCompartmentResponse.Builder
                                        builder =
                                                com.oracle.bmc.filestorage.responses
                                                        .ChangeMountTargetCompartmentResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

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

                                com.oracle.bmc.filestorage.responses
                                                .ChangeMountTargetCompartmentResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
