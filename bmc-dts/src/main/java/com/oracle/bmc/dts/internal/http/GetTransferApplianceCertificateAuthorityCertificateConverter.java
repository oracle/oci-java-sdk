/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.dts.model.*;
import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
@lombok.extern.slf4j.Slf4j
public class GetTransferApplianceCertificateAuthorityCertificateConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.dts.requests
                    .GetTransferApplianceCertificateAuthorityCertificateRequest
            interceptRequest(
                    com.oracle.bmc.dts.requests
                                    .GetTransferApplianceCertificateAuthorityCertificateRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.dts.requests.GetTransferApplianceCertificateAuthorityCertificateRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getId(), "id must not be blank");
        Validate.notBlank(
                request.getTransferApplianceLabel(), "transferApplianceLabel must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20171001")
                        .path("transferJobs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getId()))
                        .path("transferAppliances")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getTransferApplianceLabel()))
                        .path("certificate_authority_certificate");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.dts.responses
                            .GetTransferApplianceCertificateAuthorityCertificateResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.dts.responses
                                .GetTransferApplianceCertificateAuthorityCertificateResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.dts.responses
                                        .GetTransferApplianceCertificateAuthorityCertificateResponse>() {
                            @Override
                            public com.oracle.bmc.dts.responses
                                            .GetTransferApplianceCertificateAuthorityCertificateResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.dts.responses.GetTransferApplianceCertificateAuthorityCertificateResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        TransferApplianceCertificate>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        TransferApplianceCertificate.class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                TransferApplianceCertificate>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.dts.responses
                                                .GetTransferApplianceCertificateAuthorityCertificateResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.dts.responses
                                                        .GetTransferApplianceCertificateAuthorityCertificateResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.transferApplianceCertificate(response.getItem());

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

                                com.google.common.base.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

                                com.oracle.bmc.dts.responses
                                                .GetTransferApplianceCertificateAuthorityCertificateResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
