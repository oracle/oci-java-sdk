/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.identity.model.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UploadApiKeyConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UploadApiKeyConverter.class);

    public static com.oracle.bmc.identity.requests.UploadApiKeyRequest interceptRequest(
            com.oracle.bmc.identity.requests.UploadApiKeyRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.identity.requests.UploadApiKeyRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getUserId(), "userId must not be blank");
        Validate.notNull(request.getCreateApiKeyDetails(), "createApiKeyDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("users")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getUserId()))
                        .path("apiKeys");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.identity.responses.UploadApiKeyResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.identity.responses.UploadApiKeyResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.identity.responses.UploadApiKeyResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.identity.responses.UploadApiKeyResponse>() {
                            @Override
                            public com.oracle.bmc.identity.responses.UploadApiKeyResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.identity.responses.UploadApiKeyResponse");
                                final com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.identity.model.ApiKey>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.identity.model.ApiKey.class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.identity.model.ApiKey.class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.identity.model.ApiKey>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.identity.responses.UploadApiKeyResponse.Builder
                                        builder =
                                                com.oracle.bmc.identity.responses
                                                        .UploadApiKeyResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.apiKey(response.getItem());

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

                                com.oracle.bmc.identity.responses.UploadApiKeyResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
