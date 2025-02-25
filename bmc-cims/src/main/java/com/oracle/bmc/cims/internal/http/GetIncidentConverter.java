/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.cims.model.*;
import com.oracle.bmc.cims.requests.*;
import com.oracle.bmc.cims.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class GetIncidentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetIncidentConverter.class);

    public static com.oracle.bmc.cims.requests.GetIncidentRequest interceptRequest(
            com.oracle.bmc.cims.requests.GetIncidentRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.cims.requests.GetIncidentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getIncidentKey(), "incidentKey must not be blank");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20181231")
                        .path("v2")
                        .path("incidents")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getIncidentKey()));

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getCsi() != null) {
            ib.header("csi", request.getCsi());
        }

        if (request.getOcid() != null) {
            ib.header("ocid", request.getOcid());
        }

        if (request.getHomeregion() != null) {
            ib.header("homeregion", request.getHomeregion());
        }

        if (request.getProblemtype() != null) {
            ib.header("problemtype", request.getProblemtype());
        }

        if (request.getBearertokentype() != null) {
            ib.header("bearertokentype", request.getBearertokentype());
        }

        if (request.getBearertoken() != null) {
            ib.header("bearertoken", request.getBearertoken());
        }

        if (request.getIdtoken() != null) {
            ib.header("idtoken", request.getIdtoken());
        }

        if (request.getDomainid() != null) {
            ib.header("domainid", request.getDomainid());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response, com.oracle.bmc.cims.responses.GetIncidentResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response, com.oracle.bmc.cims.responses.GetIncidentResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.cims.responses.GetIncidentResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.cims.responses.GetIncidentResponse>() {
                            @Override
                            public com.oracle.bmc.cims.responses.GetIncidentResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.cims.responses.GetIncidentResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.cims.model.Incident>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.cims.model.Incident.class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.cims.model.Incident.class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.cims.model.Incident>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.cims.responses.GetIncidentResponse.Builder builder =
                                        com.oracle.bmc.cims.responses.GetIncidentResponse.builder()
                                                .__httpStatusCode__(rawResponse.getStatus())
                                                .headers(headers);

                                builder.incident(response.getItem());

                                java.util.Optional<java.util.List<String>> opcRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.cims.responses.GetIncidentResponse responseWrapper =
                                        builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
