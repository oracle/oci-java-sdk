/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class DeleteVolumeBackupConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static DeleteVolumeBackupRequest interceptRequest(DeleteVolumeBackupRequest request) {

        return request;
    }

    public static javax.ws.rs.client.Invocation.Builder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, DeleteVolumeBackupRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getVolumeBackupId() == null) {
            throw new NullPointerException("volumeBackupId is required");
        }

        javax.ws.rs.client.WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("volumeBackups")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getVolumeBackupId()));

        javax.ws.rs.client.Invocation.Builder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, DeleteVolumeBackupResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteVolumeBackupResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, DeleteVolumeBackupResponse>() {
                            @Override
                            public DeleteVolumeBackupResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for DeleteVolumeBackupResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create();

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                DeleteVolumeBackupResponse.Builder builder =
                                        DeleteVolumeBackupResponse.builder();

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

                                DeleteVolumeBackupResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
