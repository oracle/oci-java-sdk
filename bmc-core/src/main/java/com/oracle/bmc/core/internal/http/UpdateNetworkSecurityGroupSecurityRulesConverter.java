/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class UpdateNetworkSecurityGroupSecurityRulesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static UpdateNetworkSecurityGroupSecurityRulesRequest interceptRequest(
            UpdateNetworkSecurityGroupSecurityRulesRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            UpdateNetworkSecurityGroupSecurityRulesRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getNetworkSecurityGroupId(), "networkSecurityGroupId must not be blank");
        Validate.notNull(
                request.getUpdateNetworkSecurityGroupSecurityRulesDetails(),
                "updateNetworkSecurityGroupSecurityRulesDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("networkSecurityGroups")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getNetworkSecurityGroupId()))
                        .path("actions")
                        .path("updateSecurityRules");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, UpdateNetworkSecurityGroupSecurityRulesResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateNetworkSecurityGroupSecurityRulesResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                UpdateNetworkSecurityGroupSecurityRulesResponse>() {
                            @Override
                            public UpdateNetworkSecurityGroupSecurityRulesResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for UpdateNetworkSecurityGroupSecurityRulesResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        UpdatedNetworkSecurityGroupSecurityRules>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        UpdatedNetworkSecurityGroupSecurityRules
                                                                .class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                UpdatedNetworkSecurityGroupSecurityRules>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                UpdateNetworkSecurityGroupSecurityRulesResponse.Builder builder =
                                        UpdateNetworkSecurityGroupSecurityRulesResponse.builder();

                                builder.updatedNetworkSecurityGroupSecurityRules(
                                        response.getItem());

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

                                UpdateNetworkSecurityGroupSecurityRulesResponse responseWrapper =
                                        builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
