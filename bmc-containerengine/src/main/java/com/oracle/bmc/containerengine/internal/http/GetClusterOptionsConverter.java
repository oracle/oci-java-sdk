/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.containerengine.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.containerengine.model.*;
import com.oracle.bmc.containerengine.requests.*;
import com.oracle.bmc.containerengine.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.extern.slf4j.Slf4j
public class GetClusterOptionsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GetClusterOptionsRequest interceptRequest(GetClusterOptionsRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, GetClusterOptionsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getClusterOptionId(), "clusterOptionId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20180222")
                        .path("clusterOptions")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getClusterOptionId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, GetClusterOptionsResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetClusterOptionsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, GetClusterOptionsResponse>() {
                            @Override
                            public GetClusterOptionsResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for GetClusterOptionsResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        ClusterOptions>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        ClusterOptions.class);

                                com.oracle.bmc.http.internal.WithHeaders<ClusterOptions> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GetClusterOptionsResponse.Builder builder =
                                        GetClusterOptionsResponse.builder();

                                builder.clusterOptions(response.getItem());

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

                                GetClusterOptionsResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
