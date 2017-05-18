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
public class CreateIdentityProviderConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static CreateIdentityProviderRequest interceptRequest(
            CreateIdentityProviderRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, CreateIdentityProviderRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCreateIdentityProviderDetails() == null) {
            throw new NullPointerException("createIdentityProviderDetails is required");
        }

        WebTarget target = client.getBaseTarget().path("/20160918").path("identityProviders");

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        return ib;
    }

    public static Function<Response, CreateIdentityProviderResponse> fromResponse() {
        final Function<Response, CreateIdentityProviderResponse> transformer =
                new Function<Response, CreateIdentityProviderResponse>() {
                    @Override
                    public CreateIdentityProviderResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for CreateIdentityProviderResponse");
                        Function<Response, WithHeaders<IdentityProvider>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(IdentityProvider.class);

                        WithHeaders<IdentityProvider> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        CreateIdentityProviderResponse.Builder builder =
                                CreateIdentityProviderResponse.builder();

                        builder.identityProvider(response.getItem());

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

                        CreateIdentityProviderResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
