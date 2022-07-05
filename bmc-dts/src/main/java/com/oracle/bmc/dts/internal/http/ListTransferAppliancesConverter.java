/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.dts.model.*;
import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
public class ListTransferAppliancesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListTransferAppliancesConverter.class);

    public static com.oracle.bmc.dts.requests.ListTransferAppliancesRequest interceptRequest(
            com.oracle.bmc.dts.requests.ListTransferAppliancesRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.dts.requests.ListTransferAppliancesRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getId(), "id must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20171001")
                        .path("transferJobs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getId()))
                        .path("transferAppliances");

        if (request.getLifecycleState() != null) {
            target =
                    target.queryParam(
                            "lifecycleState",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLifecycleState().getValue()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.dts.responses.ListTransferAppliancesResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.dts.responses.ListTransferAppliancesResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.dts.responses.ListTransferAppliancesResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.dts.responses.ListTransferAppliancesResponse>() {
                            @Override
                            public com.oracle.bmc.dts.responses.ListTransferAppliancesResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.dts.responses.ListTransferAppliancesResponse");
                                final com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.dts.model
                                                                .MultipleTransferAppliances>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.dts.model
                                                                    .MultipleTransferAppliances
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.dts.model
                                                                    .MultipleTransferAppliances
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.dts.model.MultipleTransferAppliances>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.dts.responses.ListTransferAppliancesResponse.Builder
                                        builder =
                                                com.oracle.bmc.dts.responses
                                                        .ListTransferAppliancesResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.multipleTransferAppliances(response.getItem());

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

                                com.oracle.bmc.dts.responses.ListTransferAppliancesResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
