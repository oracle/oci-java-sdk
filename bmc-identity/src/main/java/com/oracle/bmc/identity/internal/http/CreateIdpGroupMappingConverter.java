/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.internal.http;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.http.internal.*;
import static com.oracle.bmc.util.internal.HttpUtils.*;
import com.oracle.bmc.model.*;
import com.oracle.bmc.identity.model.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class CreateIdpGroupMappingConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static CreateIdpGroupMappingRequest interceptRequest(
            CreateIdpGroupMappingRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, CreateIdpGroupMappingRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCreateIdpGroupMappingDetails() == null) {
            throw new NullPointerException("createIdpGroupMappingDetails is required");
        }

        if (request.getIdentityProviderId() == null) {
            throw new NullPointerException("identityProviderId is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("identityProviders")
                        .path(encodePathSegment(request.getIdentityProviderId()))
                        .path("groupMappings");

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        return ib;
    }

    public static Function<Response, CreateIdpGroupMappingResponse> fromResponse() {
        final Function<Response, CreateIdpGroupMappingResponse> transformer =
                new Function<Response, CreateIdpGroupMappingResponse>() {
                    @Override
                    public CreateIdpGroupMappingResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for CreateIdpGroupMappingResponse");
                        Function<Response, WithHeaders<IdpGroupMapping>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(IdpGroupMapping.class);

                        WithHeaders<IdpGroupMapping> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        CreateIdpGroupMappingResponse.Builder builder =
                                CreateIdpGroupMappingResponse.builder();

                        builder.idpGroupMapping(response.getItem());

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        Optional<List<String>> etagHeader = HeaderUtils.get(headers, "etag");
                        if (etagHeader.isPresent()) {
                            builder.etag(
                                    HeaderUtils.toValue(
                                            "etag", etagHeader.get().get(0), String.class));
                        }

                        CreateIdpGroupMappingResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
