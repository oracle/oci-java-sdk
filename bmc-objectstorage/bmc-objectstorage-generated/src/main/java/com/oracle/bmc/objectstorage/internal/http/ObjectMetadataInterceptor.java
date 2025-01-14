/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.internal.http;

import java.util.HashMap;
import java.util.Map;

import com.oracle.bmc.objectstorage.model.CopyObjectDetails;
import com.oracle.bmc.objectstorage.model.CreateMultipartUploadDetails;
import com.oracle.bmc.objectstorage.requests.CopyObjectRequest;
import com.oracle.bmc.objectstorage.requests.CreateMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.responses.HeadObjectResponse;

/**
 * Custom interceptor for all requests that deal with user metadata. This interceptor injects the
 * prefix during PUT/POST calls, and strips the prefix during GET/HEAD.
 */
public class ObjectMetadataInterceptor {
    private static final String USER_METADATA_PREFIX = "opc-meta-";

    public static CreateMultipartUploadRequest intercept(CreateMultipartUploadRequest request) {
        Map<String, String> newMetadata =
                toServiceMeta(request.getCreateMultipartUploadDetails().getMetadata());
        CreateMultipartUploadDetails newDetails =
                CreateMultipartUploadDetails.builder()
                        .copy(request.getCreateMultipartUploadDetails())
                        .metadata(newMetadata)
                        .build();
        return CreateMultipartUploadRequest.builder()
                .copy(request)
                .createMultipartUploadDetails(newDetails)
                .build();
    }

    public static CopyObjectRequest intercept(CopyObjectRequest request) {
        if (request.getCopyObjectDetails().getDestinationObjectMetadata() == null) {
            return request;
        }
        Map<String, String> newMetadata =
                toServiceMeta(request.getCopyObjectDetails().getDestinationObjectMetadata());
        CopyObjectDetails newDetails =
                CopyObjectDetails.builder()
                        .copy(request.getCopyObjectDetails())
                        .destinationObjectMetadata(newMetadata)
                        .build();
        return CopyObjectRequest.builder().copy(request).copyObjectDetails(newDetails).build();
    }

    public static PutObjectRequest intercept(PutObjectRequest request) {
        Map<String, String> newMetadata = toServiceMeta(request.getOpcMeta());
        return PutObjectRequest.builder().copy(request).opcMeta(newMetadata).build();
    }

    public static HeadObjectResponse intercept(HeadObjectResponse response) {
        Map<String, String> newMetadata = fromServiceMeta(response.getOpcMeta());
        return HeadObjectResponse.builder().copy(response).opcMeta(newMetadata).build();
    }

    public static GetObjectResponse intercept(GetObjectResponse response) {
        Map<String, String> newMetadata = fromServiceMeta(response.getOpcMeta());
        return GetObjectResponse.builder().copy(response).opcMeta(newMetadata).build();
    }

    private static Map<String, String> toServiceMeta(Map<String, String> metadata) {
        Map<String, String> metadataCopy = null;
        if (metadata != null) {
            metadataCopy = new HashMap<>();
            for (Map.Entry<String, String> entry : metadata.entrySet()) {
                metadataCopy.put(USER_METADATA_PREFIX + entry.getKey(), entry.getValue());
            }
        }
        return metadataCopy;
    }

    private static Map<String, String> fromServiceMeta(Map<String, String> metadata) {
        Map<String, String> metadataCopy = null;
        if (metadata != null) {
            metadataCopy = new HashMap<>();
            for (Map.Entry<String, String> entry : metadata.entrySet()) {
                metadataCopy.put(
                        entry.getKey().substring(USER_METADATA_PREFIX.length()), entry.getValue());
            }
        }
        return metadataCopy;
    }
}
