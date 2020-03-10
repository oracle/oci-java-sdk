/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcesearch.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.resourcesearch.model.*;
import com.oracle.bmc.resourcesearch.requests.*;
import com.oracle.bmc.resourcesearch.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.4")
@lombok.extern.slf4j.Slf4j
public class GetResourceTypeConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.resourcesearch.requests.GetResourceTypeRequest interceptRequest(
            com.oracle.bmc.resourcesearch.requests.GetResourceTypeRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.resourcesearch.requests.GetResourceTypeRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getName(), "name must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20180409")
                        .path("resourceTypes")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getName()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.resourcesearch.responses.GetResourceTypeResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.resourcesearch.responses.GetResourceTypeResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.resourcesearch.responses.GetResourceTypeResponse>() {
                            @Override
                            public com.oracle.bmc.resourcesearch.responses.GetResourceTypeResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.resourcesearch.responses.GetResourceTypeResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        ResourceType>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        ResourceType.class);

                                com.oracle.bmc.http.internal.WithHeaders<ResourceType> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.resourcesearch.responses.GetResourceTypeResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.resourcesearch.responses
                                                        .GetResourceTypeResponse.builder();

                                builder.resourceType(response.getItem());

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

                                com.oracle.bmc.resourcesearch.responses.GetResourceTypeResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
