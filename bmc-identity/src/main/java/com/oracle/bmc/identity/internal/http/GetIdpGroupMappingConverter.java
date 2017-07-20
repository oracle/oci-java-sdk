/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.internal.http;

import com.oracle.bmc.identity.model.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class GetIdpGroupMappingConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GetIdpGroupMappingRequest interceptRequest(GetIdpGroupMappingRequest request) {

        return request;
    }

    public static javax.ws.rs.client.Invocation.Builder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, GetIdpGroupMappingRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getIdentityProviderId() == null) {
            throw new NullPointerException("identityProviderId is required");
        }

        if (request.getMappingId() == null) {
            throw new NullPointerException("mappingId is required");
        }

        javax.ws.rs.client.WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("identityProviders")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getIdentityProviderId()))
                        .path("groupMappings")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getMappingId()));

        javax.ws.rs.client.Invocation.Builder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, GetIdpGroupMappingResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetIdpGroupMappingResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, GetIdpGroupMappingResponse>() {
                            @Override
                            public GetIdpGroupMappingResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for GetIdpGroupMappingResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        IdpGroupMapping>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        IdpGroupMapping.class);

                                com.oracle.bmc.http.internal.WithHeaders<IdpGroupMapping> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GetIdpGroupMappingResponse.Builder builder =
                                        GetIdpGroupMappingResponse.builder();

                                builder.idpGroupMapping(response.getItem());

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

                                GetIdpGroupMappingResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
