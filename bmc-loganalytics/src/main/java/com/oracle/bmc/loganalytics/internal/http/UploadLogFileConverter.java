/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.loganalytics.model.*;
import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UploadLogFileConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UploadLogFileConverter.class);

    public static com.oracle.bmc.loganalytics.requests.UploadLogFileRequest interceptRequest(
            com.oracle.bmc.loganalytics.requests.UploadLogFileRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.loganalytics.requests.UploadLogFileRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Validate.notNull(request.getUploadName(), "uploadName is required");
        Validate.notNull(request.getLogSourceName(), "logSourceName is required");
        Validate.notNull(request.getFilename(), "filename is required");
        Validate.notNull(request.getOpcMetaLoggrpid(), "opcMetaLoggrpid is required");
        Validate.notNull(request.getUploadLogFileBody(), "uploadLogFileBody is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200601")
                        .path("namespaces")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getNamespaceName()))
                        .path("actions")
                        .path("uploadLogFile");

        target =
                target.queryParam(
                        "uploadName",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getUploadName()));

        target =
                target.queryParam(
                        "logSourceName",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getLogSourceName()));

        if (request.getEntityId() != null) {
            target =
                    target.queryParam(
                            "entityId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getEntityId()));
        }

        if (request.getTimezone() != null) {
            target =
                    target.queryParam(
                            "timezone",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimezone()));
        }

        if (request.getCharEncoding() != null) {
            target =
                    target.queryParam(
                            "charEncoding",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getCharEncoding()));
        }

        if (request.getDateFormat() != null) {
            target =
                    target.queryParam(
                            "dateFormat",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getDateFormat()));
        }

        if (request.getDateYear() != null) {
            target =
                    target.queryParam(
                            "dateYear",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getDateYear()));
        }

        if (request.getInvalidateCache() != null) {
            target =
                    target.queryParam(
                            "invalidateCache",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getInvalidateCache()));
        }

        target =
                target.queryParam(
                        "filename",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getFilename()));

        if (request.getLogSet() != null) {
            target =
                    target.queryParam(
                            "logSet",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLogSet()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getContentMd5() != null) {
            ib.header("content-md5", request.getContentMd5());
        }

        if (request.getContentType() != null) {
            ib.header("content-type", request.getContentType());
        }

        ib.header("opc-meta-loggrpid", request.getOpcMetaLoggrpid());

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        if (request.getExpect() != null) {
            ib.header("expect", request.getExpect());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.loganalytics.responses.UploadLogFileResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.loganalytics.responses.UploadLogFileResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.loganalytics.responses.UploadLogFileResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.loganalytics.responses.UploadLogFileResponse>() {
                            @Override
                            public com.oracle.bmc.loganalytics.responses.UploadLogFileResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.loganalytics.responses.UploadLogFileResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.loganalytics.model.Upload>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.loganalytics.model.Upload.class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.loganalytics.model.Upload.class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.loganalytics.model.Upload>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.loganalytics.responses.UploadLogFileResponse.Builder
                                        builder =
                                                com.oracle.bmc.loganalytics.responses
                                                        .UploadLogFileResponse.builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.upload(response.getItem());

                                java.util.Optional<java.util.List<String>> opcRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcContentMd5Header =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-content-md5");
                                if (opcContentMd5Header.isPresent()) {
                                    builder.opcContentMd5(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-content-md5",
                                                    opcContentMd5Header.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcObjectIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-object-id");
                                if (opcObjectIdHeader.isPresent()) {
                                    builder.opcObjectId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-object-id",
                                                    opcObjectIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.loganalytics.responses.UploadLogFileResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
