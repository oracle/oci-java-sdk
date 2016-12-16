/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
public class UpdateDrgAttachmentConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static Invocation.Builder fromRequest(
            RestClient client, UpdateDrgAttachmentRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getDrgAttachmentId() == null) {
            throw new NullPointerException("drgAttachmentId is required");
        }

        if (request.getUpdateDrgAttachmentDetails() == null) {
            throw new NullPointerException("updateDrgAttachmentDetails is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("drgAttachments")
                        .path(encodePathSegment(request.getDrgAttachmentId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        return ib;
    }

    public static Function<Response, UpdateDrgAttachmentResponse> fromResponse() {
        final Function<Response, UpdateDrgAttachmentResponse> transformer =
                new Function<Response, UpdateDrgAttachmentResponse>() {
                    @Override
                    public UpdateDrgAttachmentResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for UpdateDrgAttachmentResponse");
                        Function<Response, WithHeaders<DrgAttachment>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(DrgAttachment.class);

                        WithHeaders<DrgAttachment> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        UpdateDrgAttachmentResponse.Builder builder =
                                UpdateDrgAttachmentResponse.builder();

                        builder.drgAttachment(response.getItem());

                        Optional<List<String>> etagHeader = HeaderUtils.get(headers, "etag");
                        if (etagHeader.isPresent()) {
                            builder.etag(
                                    HeaderUtils.toValue(
                                            "etag", etagHeader.get().get(0), String.class));
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

                        UpdateDrgAttachmentResponse responseWrapper = builder.build();
                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
