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
public class UpdateVolumeBackupConverter {
    private static final ResponseConversionFunctionFactory RESPONSE_CONVERSION_FACTORY =
            new ResponseConversionFunctionFactory();

    public static UpdateVolumeBackupRequest interceptRequest(UpdateVolumeBackupRequest request) {

        return request;
    }

    public static Invocation.Builder fromRequest(
            RestClient client, UpdateVolumeBackupRequest request) {
        if (request == null) {
            throw new NullPointerException("request instance is required");
        }

        if (request.getVolumeBackupId() == null) {
            throw new NullPointerException("volumeBackupId is required");
        }

        if (request.getUpdateVolumeBackupDetails() == null) {
            throw new NullPointerException("updateVolumeBackupDetails is required");
        }

        WebTarget target =
                client.getBaseTarget()
                        .path("/20160918")
                        .path("volumeBackups")
                        .path(encodePathSegment(request.getVolumeBackupId()));

        Invocation.Builder ib = target.request();

        ib.accept(MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        return ib;
    }

    public static Function<Response, UpdateVolumeBackupResponse> fromResponse() {
        final Function<Response, UpdateVolumeBackupResponse> transformer =
                new Function<Response, UpdateVolumeBackupResponse>() {
                    @Override
                    public UpdateVolumeBackupResponse apply(Response rawResponse) {
                        LOG.trace("Transform function invoked for UpdateVolumeBackupResponse");
                        Function<Response, WithHeaders<VolumeBackup>> responseFn =
                                RESPONSE_CONVERSION_FACTORY.create(VolumeBackup.class);

                        WithHeaders<VolumeBackup> response = responseFn.apply(rawResponse);
                        MultivaluedMap<String, String> headers = response.getHeaders();

                        UpdateVolumeBackupResponse.Builder builder =
                                UpdateVolumeBackupResponse.builder();

                        builder.volumeBackup(response.getItem());

                        Optional<List<String>> etagHeader = HeaderUtils.get(headers, "etag");
                        if (etagHeader.isPresent()) {
                            builder.etag(
                                    HeaderUtils.toValue(
                                            "etag", etagHeader.get().get(0), String.class));
                        }

                        UpdateVolumeBackupResponse responseWrapper = builder.build();

                        return responseWrapper;
                    }
                };
        return transformer;
    }
}
