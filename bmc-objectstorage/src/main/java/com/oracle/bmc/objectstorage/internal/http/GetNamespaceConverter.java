/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.internal.http;

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
import com.oracle.bmc.objectstorage.model.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class GetNamespaceConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static Invocation.Builder fromRequest(RestClient client, GetNamespaceRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        WebTarget target = client.getBaseTarget().path("/").path("n");

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getOpcClientRequestId() != null) {
            ib.header("opc-client-request-id", request.getOpcClientRequestId());
        }

        return ib;
    }

    public static Function<Response, GetNamespaceResponse> fromResponse() {
        final Function<Response, GetNamespaceResponse> transformer =
                new Function<Response, GetNamespaceResponse>() {
                    @Override
                    public GetNamespaceResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for GetNamespaceResponse");
                        Function<Response, WithHeaders<String>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(String.class);

                        WithHeaders<String> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        GetNamespaceResponse.Builder builder = GetNamespaceResponse.builder();

                        builder.value(response.getItem());

                        GetNamespaceResponse responseWrapper = builder.build();
                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
