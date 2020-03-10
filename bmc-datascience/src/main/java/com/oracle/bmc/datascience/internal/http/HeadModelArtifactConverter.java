/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datascience.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.datascience.model.*;
import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.extern.slf4j.Slf4j
public class HeadModelArtifactConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.datascience.requests.HeadModelArtifactRequest interceptRequest(
            com.oracle.bmc.datascience.requests.HeadModelArtifactRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.datascience.requests.HeadModelArtifactRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20190101")
                        .path("models")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getModelId()))
                        .path("artifact")
                        .path("content");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.datascience.responses.HeadModelArtifactResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.datascience.responses.HeadModelArtifactResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.datascience.responses.HeadModelArtifactResponse>() {
                            @Override
                            public com.oracle.bmc.datascience.responses.HeadModelArtifactResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.datascience.responses.HeadModelArtifactResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create();

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.datascience.responses.HeadModelArtifactResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.datascience.responses
                                                        .HeadModelArtifactResponse.builder();

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

                                com.google.common.base.Optional<java.util.List<String>>
                                        contentLengthHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "content-length");
                                if (contentLengthHeader.isPresent()) {
                                    builder.contentLength(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-length",
                                                    contentLengthHeader.get().get(0),
                                                    Long.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        contentDispositionHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "content-disposition");
                                if (contentDispositionHeader.isPresent()) {
                                    builder.contentDisposition(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-disposition",
                                                    contentDispositionHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        contentMd5Header =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "content-md5");
                                if (contentMd5Header.isPresent()) {
                                    builder.contentMd5(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-md5",
                                                    contentMd5Header.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        lastModifiedHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "last-modified");
                                if (lastModifiedHeader.isPresent()) {
                                    builder.lastModified(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "last-modified",
                                                    lastModifiedHeader.get().get(0),
                                                    java.util.Date.class));
                                }

                                com.oracle.bmc.datascience.responses.HeadModelArtifactResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
