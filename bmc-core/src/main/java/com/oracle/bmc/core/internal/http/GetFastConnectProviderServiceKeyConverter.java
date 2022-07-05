/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetFastConnectProviderServiceKeyConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetFastConnectProviderServiceKeyConverter.class);

    public static com.oracle.bmc.core.requests.GetFastConnectProviderServiceKeyRequest
            interceptRequest(
                    com.oracle.bmc.core.requests.GetFastConnectProviderServiceKeyRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.core.requests.GetFastConnectProviderServiceKeyRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getProviderServiceId(), "providerServiceId must not be blank");
        Validate.notBlank(
                request.getProviderServiceKeyName(), "providerServiceKeyName must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("fastConnectProviderServices")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getProviderServiceId()))
                        .path("providerServiceKeys")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getProviderServiceKeyName()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.core.responses.GetFastConnectProviderServiceKeyResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.core.responses.GetFastConnectProviderServiceKeyResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.core.responses.GetFastConnectProviderServiceKeyResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.core.responses
                                        .GetFastConnectProviderServiceKeyResponse>() {
                            @Override
                            public com.oracle.bmc.core.responses
                                            .GetFastConnectProviderServiceKeyResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.core.responses.GetFastConnectProviderServiceKeyResponse");
                                final com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.core.model
                                                                .FastConnectProviderServiceKey>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.core.model
                                                                    .FastConnectProviderServiceKey
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.core.model
                                                                    .FastConnectProviderServiceKey
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.core.model
                                                        .FastConnectProviderServiceKey>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.core.responses
                                                .GetFastConnectProviderServiceKeyResponse.Builder
                                        builder =
                                                com.oracle.bmc.core.responses
                                                        .GetFastConnectProviderServiceKeyResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.fastConnectProviderServiceKey(response.getItem());

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

                                com.oracle.bmc.core.responses
                                                .GetFastConnectProviderServiceKeyResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
