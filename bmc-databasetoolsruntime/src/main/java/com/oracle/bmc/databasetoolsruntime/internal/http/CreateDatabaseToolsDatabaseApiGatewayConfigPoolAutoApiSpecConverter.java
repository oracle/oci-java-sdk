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
public class CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecConverter.class);

    public static com.oracle.bmc.databasetoolsruntime.requests
                    .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest
            interceptRequest(
                    com.oracle.bmc.databasetoolsruntime.requests
                                    .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.databasetoolsruntime.requests
                            .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");
        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");
        Validate.notNull(
                request.getCreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(),
                "createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20230222")
                        .path("databaseToolsDatabaseApiGatewayConfigs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDatabaseToolsDatabaseApiGatewayConfigId()))
                        .path("pools")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getPoolKey()))
                        .path("autoApiSpecs");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.databasetoolsruntime.responses
                            .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.databasetoolsruntime.responses
                            .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.databasetoolsruntime.responses
                                .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.databasetoolsruntime.responses
                                        .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>() {
                            @Override
                            public com.oracle.bmc.databasetoolsruntime.responses
                                            .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.databasetoolsruntime.responses.CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.databasetoolsruntime.model
                                                                .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.databasetoolsruntime.model
                                                                    .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.databasetoolsruntime.model
                                                                    .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.databasetoolsruntime.model
                                                        .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.databasetoolsruntime.responses
                                                .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.databasetoolsruntime.responses
                                                        .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.databaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                                        response.getItem());

                                java.util.Optional<java.util.List<String>> locationHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "location");
                                if (locationHeader.isPresent()) {
                                    builder.location(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "location",
                                                    locationHeader.get().get(0),
                                                    String.class));
                                }

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
                                                .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
