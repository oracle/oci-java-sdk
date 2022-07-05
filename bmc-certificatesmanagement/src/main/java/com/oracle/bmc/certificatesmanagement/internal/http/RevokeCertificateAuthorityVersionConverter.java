/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.certificatesmanagement.model.*;
import com.oracle.bmc.certificatesmanagement.requests.*;
import com.oracle.bmc.certificatesmanagement.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class RevokeCertificateAuthorityVersionConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RevokeCertificateAuthorityVersionConverter.class);

    public static com.oracle.bmc.certificatesmanagement.requests
                    .RevokeCertificateAuthorityVersionRequest
            interceptRequest(
                    com.oracle.bmc.certificatesmanagement.requests
                                    .RevokeCertificateAuthorityVersionRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.certificatesmanagement.requests.RevokeCertificateAuthorityVersionRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");
        Validate.notNull(
                request.getRevokeCertificateAuthorityVersionDetails(),
                "revokeCertificateAuthorityVersionDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20210224")
                        .path("certificateAuthorities")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getCertificateAuthorityId()))
                        .path("version")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getCertificateAuthorityVersionNumber()))
                        .path("actions")
                        .path("revoke");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.certificatesmanagement.responses
                            .RevokeCertificateAuthorityVersionResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.certificatesmanagement.responses
                            .RevokeCertificateAuthorityVersionResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.certificatesmanagement.responses
                                .RevokeCertificateAuthorityVersionResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.certificatesmanagement.responses
                                        .RevokeCertificateAuthorityVersionResponse>() {
                            @Override
                            public com.oracle.bmc.certificatesmanagement.responses
                                            .RevokeCertificateAuthorityVersionResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.certificatesmanagement.responses.RevokeCertificateAuthorityVersionResponse");
                                final com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    serviceDetails.get());
                                } else {
                                    responseFn = RESPONSE_CONVERSION_FACTORY.create();
                                }

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.certificatesmanagement.responses
                                                .RevokeCertificateAuthorityVersionResponse.Builder
                                        builder =
                                                com.oracle.bmc.certificatesmanagement.responses
                                                        .RevokeCertificateAuthorityVersionResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

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

                                com.oracle.bmc.certificatesmanagement.responses
                                                .RevokeCertificateAuthorityVersionResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
