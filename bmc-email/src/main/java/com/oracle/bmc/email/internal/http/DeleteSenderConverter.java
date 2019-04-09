/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.email.internal.http;

import com.oracle.bmc.email.model.*;
import com.oracle.bmc.email.requests.*;
import com.oracle.bmc.email.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@lombok.extern.slf4j.Slf4j
public class DeleteSenderConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static DeleteSenderRequest interceptRequest(DeleteSenderRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, DeleteSenderRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getSenderId(), "senderId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20170907")
                        .path("senders")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getSenderId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSenderResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSenderResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, DeleteSenderResponse>() {
                            @Override
                            public DeleteSenderResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for DeleteSenderResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create();

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                DeleteSenderResponse.Builder builder =
                                        DeleteSenderResponse.builder();

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

                                DeleteSenderResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
