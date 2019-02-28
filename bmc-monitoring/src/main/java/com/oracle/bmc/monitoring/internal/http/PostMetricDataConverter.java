/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.monitoring.internal.http;

import com.oracle.bmc.monitoring.model.*;
import com.oracle.bmc.monitoring.requests.*;
import com.oracle.bmc.monitoring.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@lombok.extern.slf4j.Slf4j
public class PostMetricDataConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static PostMetricDataRequest interceptRequest(PostMetricDataRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, PostMetricDataRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getPostMetricDataDetails(), "postMetricDataDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20180401").path("metrics");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, PostMetricDataResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, PostMetricDataResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, PostMetricDataResponse>() {
                            @Override
                            public PostMetricDataResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for PostMetricDataResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        PostMetricDataResponseDetails>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        PostMetricDataResponseDetails.class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                PostMetricDataResponseDetails>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                PostMetricDataResponse.Builder builder =
                                        PostMetricDataResponse.builder();

                                builder.postMetricDataResponseDetails(response.getItem());

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

                                PostMetricDataResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
