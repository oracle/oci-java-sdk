/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.oce.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.oce.model.*;
import com.oracle.bmc.oce.requests.*;
import com.oracle.bmc.oce.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@lombok.extern.slf4j.Slf4j
public class GetOceInstanceConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GetOceInstanceRequest interceptRequest(GetOceInstanceRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, GetOceInstanceRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getOceInstanceId(), "oceInstanceId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20190912")
                        .path("oceInstances")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getOceInstanceId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, GetOceInstanceResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetOceInstanceResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, GetOceInstanceResponse>() {
                            @Override
                            public GetOceInstanceResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for GetOceInstanceResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        OceInstance>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        OceInstance.class);

                                com.oracle.bmc.http.internal.WithHeaders<OceInstance> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GetOceInstanceResponse.Builder builder =
                                        GetOceInstanceResponse.builder();

                                builder.oceInstance(response.getItem());

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

                                GetOceInstanceResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
