/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.goldengate.model.*;
import com.oracle.bmc.goldengate.requests.*;
import com.oracle.bmc.goldengate.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@lombok.extern.slf4j.Slf4j
public class GetDatabaseRegistrationConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.goldengate.requests.GetDatabaseRegistrationRequest
            interceptRequest(
                    com.oracle.bmc.goldengate.requests.GetDatabaseRegistrationRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.goldengate.requests.GetDatabaseRegistrationRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getDatabaseRegistrationId(), "databaseRegistrationId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200407")
                        .path("databaseRegistrations")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDatabaseRegistrationId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.goldengate.responses.GetDatabaseRegistrationResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.goldengate.responses.GetDatabaseRegistrationResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.goldengate.responses
                                        .GetDatabaseRegistrationResponse>() {
                            @Override
                            public com.oracle.bmc.goldengate.responses
                                            .GetDatabaseRegistrationResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.goldengate.responses.GetDatabaseRegistrationResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        DatabaseRegistration>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        DatabaseRegistration.class);

                                com.oracle.bmc.http.internal.WithHeaders<DatabaseRegistration>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.goldengate.responses.GetDatabaseRegistrationResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.goldengate.responses
                                                        .GetDatabaseRegistrationResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.databaseRegistration(response.getItem());

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

                                com.oracle.bmc.goldengate.responses.GetDatabaseRegistrationResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
