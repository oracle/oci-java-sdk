/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.internal.http;

import com.oracle.bmc.database.model.*;
import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class FailoverDataGuardAssociationConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static FailoverDataGuardAssociationRequest interceptRequest(
            FailoverDataGuardAssociationRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            FailoverDataGuardAssociationRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getDatabaseId() == null) {
            throw new NullPointerException("databaseId is required");
        }

        if (request.getDataGuardAssociationId() == null) {
            throw new NullPointerException("dataGuardAssociationId is required");
        }

        if (request.getFailoverDataGuardAssociationDetails() == null) {
            throw new NullPointerException("failoverDataGuardAssociationDetails is required");
        }

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("databases")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDatabaseId()))
                        .path("dataGuardAssociations")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDataGuardAssociationId()))
                        .path("actions")
                        .path("failover");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, FailoverDataGuardAssociationResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, FailoverDataGuardAssociationResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, FailoverDataGuardAssociationResponse>() {
                            @Override
                            public FailoverDataGuardAssociationResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for FailoverDataGuardAssociationResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        DataGuardAssociation>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        DataGuardAssociation.class);

                                com.oracle.bmc.http.internal.WithHeaders<DataGuardAssociation>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                FailoverDataGuardAssociationResponse.Builder builder =
                                        FailoverDataGuardAssociationResponse.builder();

                                builder.dataGuardAssociation(response.getItem());

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

                                FailoverDataGuardAssociationResponse responseWrapper =
                                        builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
