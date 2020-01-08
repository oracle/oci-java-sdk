/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.dts.model.*;
import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.011")
@lombok.extern.slf4j.Slf4j
public class CreateTransferApplianceAdminCredentialsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static CreateTransferApplianceAdminCredentialsRequest interceptRequest(
            CreateTransferApplianceAdminCredentialsRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            CreateTransferApplianceAdminCredentialsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getId(), "id must not be blank");
        Validate.notBlank(
                request.getTransferApplianceLabel(), "transferApplianceLabel must not be blank");
        Validate.notNull(request.getAdminPublicKey(), "adminPublicKey is required");

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
                        .path("admin_credentials");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, CreateTransferApplianceAdminCredentialsResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateTransferApplianceAdminCredentialsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                CreateTransferApplianceAdminCredentialsResponse>() {
                            @Override
                            public CreateTransferApplianceAdminCredentialsResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for CreateTransferApplianceAdminCredentialsResponse");
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

                                CreateTransferApplianceAdminCredentialsResponse.Builder builder =
                                        CreateTransferApplianceAdminCredentialsResponse.builder();

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

                                CreateTransferApplianceAdminCredentialsResponse responseWrapper =
                                        builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
