/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class UpdateDrgRouteRulesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.core.requests.UpdateDrgRouteRulesRequest interceptRequest(
            com.oracle.bmc.core.requests.UpdateDrgRouteRulesRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.core.requests.UpdateDrgRouteRulesRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getDrgRouteTableId(), "drgRouteTableId must not be blank");
        Validate.notNull(
                request.getUpdateDrgRouteRulesDetails(), "updateDrgRouteRulesDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("drgRouteTables")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDrgRouteTableId()))
                        .path("actions")
                        .path("updateDrgRouteRules");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.core.responses.UpdateDrgRouteRulesResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.core.responses.UpdateDrgRouteRulesResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.core.responses.UpdateDrgRouteRulesResponse>() {
                            @Override
                            public com.oracle.bmc.core.responses.UpdateDrgRouteRulesResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.core.responses.UpdateDrgRouteRulesResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.util.List<DrgRouteRule>>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        new javax.ws.rs.core.GenericType<
                                                                java.util.List<DrgRouteRule>>() {});

                                com.oracle.bmc.http.internal.WithHeaders<
                                                java.util.List<DrgRouteRule>>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.core.responses.UpdateDrgRouteRulesResponse.Builder
                                        builder =
                                                com.oracle.bmc.core.responses
                                                        .UpdateDrgRouteRulesResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.items(response.getItem());

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

                                com.oracle.bmc.core.responses.UpdateDrgRouteRulesResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
