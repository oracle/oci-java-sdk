/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class CreateVcnConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static CreateVcnRequest interceptRequest(CreateVcnRequest request) {

        return request;
    }

    public static javax.ws.rs.client.Invocation.Builder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, CreateVcnRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCreateVcnDetails() == null) {
            throw new NullPointerException("createVcnDetails is required");
        }

        javax.ws.rs.client.WebTarget target = client.getBaseTarget().path("/20160918").path("vcns");

        javax.ws.rs.client.Invocation.Builder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, CreateVcnResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateVcnResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, CreateVcnResponse>() {
                            @Override
                            public CreateVcnResponse apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for CreateVcnResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Vcn>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create(Vcn.class);

                                com.oracle.bmc.http.internal.WithHeaders<Vcn> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                CreateVcnResponse.Builder builder = CreateVcnResponse.builder();

                                builder.vcn(response.getItem());

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

                                CreateVcnResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
