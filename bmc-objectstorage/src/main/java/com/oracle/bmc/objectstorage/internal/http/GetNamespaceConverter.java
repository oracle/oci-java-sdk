/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.internal.http;

import com.oracle.bmc.objectstorage.model.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class GetNamespaceConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GetNamespaceRequest interceptRequest(GetNamespaceRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, GetNamespaceRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/").path("n");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcClientRequestId() != null) {
            ib.header("opc-client-request-id", request.getOpcClientRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, GetNamespaceResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetNamespaceResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, GetNamespaceResponse>() {
                            @Override
                            public GetNamespaceResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for GetNamespaceResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<String>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(String.class);

                                com.oracle.bmc.http.internal.WithHeaders<String> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GetNamespaceResponse.Builder builder =
                                        GetNamespaceResponse.builder();

                                builder.value(response.getItem());

                                GetNamespaceResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
