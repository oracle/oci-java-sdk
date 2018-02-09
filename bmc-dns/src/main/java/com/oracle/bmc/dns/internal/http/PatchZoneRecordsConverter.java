/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.internal.http;

import com.oracle.bmc.dns.model.*;
import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.extern.slf4j.Slf4j
public class PatchZoneRecordsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static PatchZoneRecordsRequest interceptRequest(PatchZoneRecordsRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, PatchZoneRecordsRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getZoneNameOrId() == null) {
            throw new NullPointerException("zoneNameOrId is required");
        }

        if (request.getPatchZoneRecordsDetails() == null) {
            throw new NullPointerException("patchZoneRecordsDetails is required");
        }

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20180115")
                        .path("zones")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getZoneNameOrId()))
                        .path("records");

        if (request.getCompartmentId() != null) {
            target =
                    target.queryParam(
                            "compartmentId",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getCompartmentId()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("If-Match", request.getIfMatch());
        }

        if (request.getIfUnmodifiedSince() != null) {
            ib.header("If-Unmodified-Since", request.getIfUnmodifiedSince());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, PatchZoneRecordsResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, PatchZoneRecordsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, PatchZoneRecordsResponse>() {
                            @Override
                            public PatchZoneRecordsResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for PatchZoneRecordsResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        RecordCollection>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        RecordCollection.class);

                                com.oracle.bmc.http.internal.WithHeaders<RecordCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                PatchZoneRecordsResponse.Builder builder =
                                        PatchZoneRecordsResponse.builder();

                                builder.recordCollection(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcNextPageHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcTotalItemsHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-total-items");
                                if (opcTotalItemsHeader.isPresent()) {
                                    builder.opcTotalItems(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-total-items",
                                                    opcTotalItemsHeader.get().get(0),
                                                    Integer.class));
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

                                com.google.common.base.Optional<java.util.List<String>> eTagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "eTag");
                                if (eTagHeader.isPresent()) {
                                    builder.eTag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "eTag", eTagHeader.get().get(0), String.class));
                                }

                                PatchZoneRecordsResponse responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
