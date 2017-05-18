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
public class GetIdpGroupMappingConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static GetIdpGroupMappingRequest interceptRequest(GetIdpGroupMappingRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, GetIdpGroupMappingRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getIdentityProviderId() == null) {
            throw new NullPointerException("identityProviderId is required");
        }

        if (request.getMappingId() == null) {
            throw new NullPointerException("mappingId is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("identityProviders")
                        .path(encodePathSegment(request.getIdentityProviderId()))
                        .path("groupMappings")
                        .path(encodePathSegment(request.getMappingId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        return ib;
    }

    public static Function<Response, GetIdpGroupMappingResponse> fromResponse() {
        final Function<Response, GetIdpGroupMappingResponse> transformer =
                new Function<Response, GetIdpGroupMappingResponse>() {
                    @Override
                    public GetIdpGroupMappingResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for GetIdpGroupMappingResponse");
                        Function<Response, WithHeaders<IdpGroupMapping>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(IdpGroupMapping.class);

                        WithHeaders<IdpGroupMapping> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetIdpGroupMappingResponse.Builder builder =
                                GetIdpGroupMappingResponse.builder();

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

                        GetIdpGroupMappingResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
