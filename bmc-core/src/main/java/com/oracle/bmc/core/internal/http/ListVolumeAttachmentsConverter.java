/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.internal.http;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.http.internal.*;
import static com.oracle.bmc.util.internal.HttpUtils.*;
import com.oracle.bmc.model.*;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class ListVolumeAttachmentsConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static ListVolumeAttachmentsRequest interceptRequest(
            ListVolumeAttachmentsRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, ListVolumeAttachmentsRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getCompartmentId() == null) {
            throw new NullPointerException("compartmentId is required");
        }

        WebTarget target = client.getBaseTarget().path("/20160918").path("volumeAttachments");

        if (request.getAvailabilityDomain() != null) {
            target =
                    target.queryParam(
                            "availabilityDomain",
                            attemptEncodeQueryParam(request.getAvailabilityDomain()));
        }

        target =
                target.queryParam(
                        "compartmentId", attemptEncodeQueryParam(request.getCompartmentId()));

        if (request.getLimit() != null) {
            target = target.queryParam("limit", attemptEncodeQueryParam(request.getLimit()));
        }

        if (request.getPage() != null) {
            target = target.queryParam("page", attemptEncodeQueryParam(request.getPage()));
        }

        if (request.getInstanceId() != null) {
            target =
                    target.queryParam(
                            "instanceId", attemptEncodeQueryParam(request.getInstanceId()));
        }

        if (request.getVolumeId() != null) {
            target = target.queryParam("volumeId", attemptEncodeQueryParam(request.getVolumeId()));
        }

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        return ib;
    }

    public static Function<Response, ListVolumeAttachmentsResponse> fromResponse() {
        final Function<Response, ListVolumeAttachmentsResponse> transformer =
                new Function<Response, ListVolumeAttachmentsResponse>() {
                    @Override
                    public ListVolumeAttachmentsResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for ListVolumeAttachmentsResponse");
                        Function<Response, WithHeaders<List<VolumeAttachment>>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(
                                        new GenericType<List<VolumeAttachment>>() {});

                        WithHeaders<List<VolumeAttachment>> response =
                                responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        ListVolumeAttachmentsResponse.Builder builder =
                                ListVolumeAttachmentsResponse.builder();

                        builder.items(response.getItem());

                        Optional<List<String>> opcNextPageHeader =
                                HeaderUtils.get(headers, "opc-next-page");
                        if (opcNextPageHeader.isPresent()) {
                            builder.opcNextPage(
                                    HeaderUtils.toValue(
                                            "opc-next-page",
                                            opcNextPageHeader.get().get(0),
                                            String.class));
                        }

                        Optional<List<String>> opcRequestIdHeader =
                                HeaderUtils.get(headers, "opc-request-id");
                        if (opcRequestIdHeader.isPresent()) {
                            builder.opcRequestId(
                                    HeaderUtils.toValue(
                                            "opc-request-id",
                                            opcRequestIdHeader.get().get(0),
                                            String.class));
                        }

                        ListVolumeAttachmentsResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
