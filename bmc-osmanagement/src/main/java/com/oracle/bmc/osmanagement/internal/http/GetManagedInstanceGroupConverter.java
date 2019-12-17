/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.osmanagement.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.osmanagement.model.*;
import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.extern.slf4j.Slf4j
public class GetManagedInstanceGroupConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GetManagedInstanceGroupRequest interceptRequest(
            GetManagedInstanceGroupRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            GetManagedInstanceGroupRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getManagedInstanceGroupId(), "managedInstanceGroupId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20190801")
                        .path("managedInstanceGroups")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getManagedInstanceGroupId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, GetManagedInstanceGroupResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetManagedInstanceGroupResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, GetManagedInstanceGroupResponse>() {
                            @Override
                            public GetManagedInstanceGroupResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for GetManagedInstanceGroupResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        ManagedInstanceGroup>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        ManagedInstanceGroup.class);

                                com.oracle.bmc.http.internal.WithHeaders<ManagedInstanceGroup>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GetManagedInstanceGroupResponse.Builder builder =
                                        GetManagedInstanceGroupResponse.builder();

                                builder.managedInstanceGroup(response.getItem());

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

                                com.google.common.base.Optional<java.util.List<String>>
                                        retryAfterHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "retry-after");
                                if (retryAfterHeader.isPresent()) {
                                    builder.retryAfter(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "retry-after",
                                                    retryAfterHeader.get().get(0),
                                                    Float.class));
                                }

                                GetManagedInstanceGroupResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
