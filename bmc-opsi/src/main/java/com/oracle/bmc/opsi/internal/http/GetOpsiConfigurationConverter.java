/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.opsi.model.*;
import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetOpsiConfigurationConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetOpsiConfigurationConverter.class);

    public static com.oracle.bmc.opsi.requests.GetOpsiConfigurationRequest interceptRequest(
            com.oracle.bmc.opsi.requests.GetOpsiConfigurationRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.opsi.requests.GetOpsiConfigurationRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getOpsiConfigurationId(), "opsiConfigurationId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200630")
                        .path("opsiConfigurations")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getOpsiConfigurationId()));

        if (request.getOpsiConfigField() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "opsiConfigField",
                            request.getOpsiConfigField(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getConfigItemCustomStatus() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "configItemCustomStatus",
                            request.getConfigItemCustomStatus(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getConfigItemsApplicableContext() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "configItemsApplicableContext",
                            request.getConfigItemsApplicableContext(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getConfigItemField() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "configItemField",
                            request.getConfigItemField(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

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
                    com.oracle.bmc.opsi.responses.GetOpsiConfigurationResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.opsi.responses.GetOpsiConfigurationResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.opsi.responses.GetOpsiConfigurationResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.opsi.responses.GetOpsiConfigurationResponse>() {
                            @Override
                            public com.oracle.bmc.opsi.responses.GetOpsiConfigurationResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.opsi.responses.GetOpsiConfigurationResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.opsi.model
                                                                .OpsiConfiguration>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.opsi.model.OpsiConfiguration
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.opsi.model.OpsiConfiguration
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.opsi.model.OpsiConfiguration>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.opsi.responses.GetOpsiConfigurationResponse.Builder
                                        builder =
                                                com.oracle.bmc.opsi.responses
                                                        .GetOpsiConfigurationResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.opsiConfiguration(response.getItem());

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

                                com.oracle.bmc.opsi.responses.GetOpsiConfigurationResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
