/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.dns.model.*;
import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.extern.slf4j.Slf4j
public class UpdateTsigKeyConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static UpdateTsigKeyRequest interceptRequest(UpdateTsigKeyRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, UpdateTsigKeyRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getTsigKeyId(), "tsigKeyId must not be blank");
        Validate.notNull(request.getUpdateTsigKeyDetails(), "updateTsigKeyDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20180115")
                        .path("tsigKeys")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getTsigKeyId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("If-Match", request.getIfMatch());
        }

        if (request.getIfUnmodifiedSince() != null) {
            ib.header("If-Unmodified-Since", request.getIfUnmodifiedSince());
        }

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTsigKeyResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTsigKeyResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, UpdateTsigKeyResponse>() {
                            @Override
                            public UpdateTsigKeyResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for UpdateTsigKeyResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<TsigKey>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(TsigKey.class);

                                com.oracle.bmc.http.internal.WithHeaders<TsigKey> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                UpdateTsigKeyResponse.Builder builder =
                                        UpdateTsigKeyResponse.builder();

                                builder.tsigKey(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>> eTagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "ETag");
                                if (eTagHeader.isPresent()) {
                                    builder.eTag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "ETag", eTagHeader.get().get(0), String.class));
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

                                UpdateTsigKeyResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
