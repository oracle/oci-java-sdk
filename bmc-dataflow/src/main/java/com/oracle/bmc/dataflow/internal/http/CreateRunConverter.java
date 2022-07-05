/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.dataflow.model.*;
import com.oracle.bmc.dataflow.requests.*;
import com.oracle.bmc.dataflow.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class CreateRunConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CreateRunConverter.class);

    public static com.oracle.bmc.dataflow.requests.CreateRunRequest interceptRequest(
            com.oracle.bmc.dataflow.requests.CreateRunRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.dataflow.requests.CreateRunRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCreateRunDetails(), "createRunDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20200129").path("runs");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

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
                    javax.ws.rs.core.Response, com.oracle.bmc.dataflow.responses.CreateRunResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, com.oracle.bmc.dataflow.responses.CreateRunResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.dataflow.responses.CreateRunResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.dataflow.responses.CreateRunResponse>() {
                            @Override
                            public com.oracle.bmc.dataflow.responses.CreateRunResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.dataflow.responses.CreateRunResponse");
                                final com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.dataflow.model.Run>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.dataflow.model.Run.class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.dataflow.model.Run.class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.dataflow.model.Run>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.dataflow.responses.CreateRunResponse.Builder
                                        builder =
                                                com.oracle.bmc.dataflow.responses.CreateRunResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.run(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

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

                                com.oracle.bmc.dataflow.responses.CreateRunResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
