/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class UpdateDrgAttachmentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static UpdateDrgAttachmentRequest interceptRequest(UpdateDrgAttachmentRequest request) {

        return request;
    }

    public static javax.ws.rs.client.Invocation.Builder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, UpdateDrgAttachmentRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getDrgAttachmentId() == null) {
            throw new NullPointerException("drgAttachmentId is required");
        }

        if (request.getUpdateDrgAttachmentDetails() == null) {
            throw new NullPointerException("updateDrgAttachmentDetails is required");
        }

        javax.ws.rs.client.WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("drgAttachments")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDrgAttachmentId()));

        javax.ws.rs.client.Invocation.Builder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, UpdateDrgAttachmentResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDrgAttachmentResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, UpdateDrgAttachmentResponse>() {
                            @Override
                            public UpdateDrgAttachmentResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for UpdateDrgAttachmentResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        DrgAttachment>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        DrgAttachment.class);

                                com.oracle.bmc.http.internal.WithHeaders<DrgAttachment> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                UpdateDrgAttachmentResponse.Builder builder =
                                        UpdateDrgAttachmentResponse.builder();

                                builder.drgAttachment(response.getItem());

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

                                UpdateDrgAttachmentResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
