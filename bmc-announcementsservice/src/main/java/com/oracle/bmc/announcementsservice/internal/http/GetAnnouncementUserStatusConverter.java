/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.announcementsservice.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.announcementsservice.model.*;
import com.oracle.bmc.announcementsservice.requests.*;
import com.oracle.bmc.announcementsservice.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@lombok.extern.slf4j.Slf4j
public class GetAnnouncementUserStatusConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static GetAnnouncementUserStatusRequest interceptRequest(
            GetAnnouncementUserStatusRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            GetAnnouncementUserStatusRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAnnouncementId(), "announcementId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20180904")
                        .path("announcements")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getAnnouncementId()))
                        .path("userStatus");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, GetAnnouncementUserStatusResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetAnnouncementUserStatusResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, GetAnnouncementUserStatusResponse>() {
                            @Override
                            public GetAnnouncementUserStatusResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for GetAnnouncementUserStatusResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        AnnouncementUserStatusDetails>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        AnnouncementUserStatusDetails.class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                AnnouncementUserStatusDetails>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                GetAnnouncementUserStatusResponse.Builder builder =
                                        GetAnnouncementUserStatusResponse.builder();

                                builder.announcementUserStatusDetails(response.getItem());

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

                                GetAnnouncementUserStatusResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
