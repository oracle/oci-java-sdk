/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.osmanagement.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.osmanagement.model.*;
import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.extern.slf4j.Slf4j
public class GetSoftwarePackageConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GetSoftwarePackageRequest interceptRequest(GetSoftwarePackageRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, GetSoftwarePackageRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getSoftwareSourceId(), "softwareSourceId must not be blank");
        Validate.notBlank(
                request.getSoftwarePackageName(), "softwarePackageName must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20190801")
                        .path("softwareSources")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getSoftwareSourceId()))
                        .path("softwarePackages")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getSoftwarePackageName()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, GetSoftwarePackageResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetSoftwarePackageResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, GetSoftwarePackageResponse>() {
                            @Override
                            public GetSoftwarePackageResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for GetSoftwarePackageResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        SoftwarePackage>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        SoftwarePackage.class);

                                com.oracle.bmc.http.internal.WithHeaders<SoftwarePackage> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GetSoftwarePackageResponse.Builder builder =
                                        GetSoftwarePackageResponse.builder();

                                builder.softwarePackage(response.getItem());

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

                                GetSoftwarePackageResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
