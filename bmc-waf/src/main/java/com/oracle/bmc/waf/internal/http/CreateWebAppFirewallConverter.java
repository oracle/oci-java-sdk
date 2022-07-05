/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.waf.model.*;
import com.oracle.bmc.waf.requests.*;
import com.oracle.bmc.waf.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class CreateWebAppFirewallConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CreateWebAppFirewallConverter.class);

    public static com.oracle.bmc.waf.requests.CreateWebAppFirewallRequest interceptRequest(
            com.oracle.bmc.waf.requests.CreateWebAppFirewallRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.waf.requests.CreateWebAppFirewallRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(
                request.getCreateWebAppFirewallDetails(),
                "createWebAppFirewallDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20210930").path("webAppFirewalls");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.waf.responses.CreateWebAppFirewallResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.waf.responses.CreateWebAppFirewallResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.waf.responses.CreateWebAppFirewallResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.waf.responses.CreateWebAppFirewallResponse>() {
                            @Override
                            public com.oracle.bmc.waf.responses.CreateWebAppFirewallResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.waf.responses.CreateWebAppFirewallResponse");
                                final com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.waf.model.WebAppFirewall>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.waf.model.WebAppFirewall.class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.waf.model.WebAppFirewall.class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.waf.model.WebAppFirewall>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.waf.responses.CreateWebAppFirewallResponse.Builder
                                        builder =
                                                com.oracle.bmc.waf.responses
                                                        .CreateWebAppFirewallResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.webAppFirewall(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcWorkRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-work-request-id");
                                if (opcWorkRequestIdHeader.isPresent()) {
                                    builder.opcWorkRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-work-request-id",
                                                    opcWorkRequestIdHeader.get().get(0),
                                                    String.class));
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
                                        locationHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "location");
                                if (locationHeader.isPresent()) {
                                    builder.location(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "location",
                                                    locationHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        contentLocationHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "content-location");
                                if (contentLocationHeader.isPresent()) {
                                    builder.contentLocation(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-location",
                                                    contentLocationHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.waf.responses.CreateWebAppFirewallResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
