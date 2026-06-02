/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.databasetoolsruntime.model.*;
import com.oracle.bmc.databasetoolsruntime.requests.*;
import com.oracle.bmc.databasetoolsruntime.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class GetDatabaseToolsDatabaseApiGatewayConfigGlobalConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalConverter.class);

    public static com.oracle.bmc.databasetoolsruntime.requests
                    .GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest
            interceptRequest(
                    com.oracle.bmc.databasetoolsruntime.requests
                                    .GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.databasetoolsruntime.requests
                            .GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");
        Validate.notBlank(request.getGlobalKey().getValue(), "globalKey must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20230222")
                        .path("databaseToolsDatabaseApiGatewayConfigs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDatabaseToolsDatabaseApiGatewayConfigId()))
                        .path("globals")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getGlobalKey().getValue()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.databasetoolsruntime.responses
                            .GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.databasetoolsruntime.responses
                            .GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.databasetoolsruntime.responses
                                .GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.databasetoolsruntime.responses
                                        .GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>() {
                            @Override
                            public com.oracle.bmc.databasetoolsruntime.responses
                                            .GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.databasetoolsruntime.responses.GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.databasetoolsruntime.model
                                                                .DatabaseToolsDatabaseApiGatewayConfigGlobal>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.databasetoolsruntime.model
                                                                    .DatabaseToolsDatabaseApiGatewayConfigGlobal
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.databasetoolsruntime.model
                                                                    .DatabaseToolsDatabaseApiGatewayConfigGlobal
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.databasetoolsruntime.model
                                                        .DatabaseToolsDatabaseApiGatewayConfigGlobal>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.databasetoolsruntime.responses
                                                .GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.databasetoolsruntime.responses
                                                        .GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.databaseToolsDatabaseApiGatewayConfigGlobal(
                                        response.getItem());

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

                                com.oracle.bmc.databasetoolsruntime.responses
                                                .GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
