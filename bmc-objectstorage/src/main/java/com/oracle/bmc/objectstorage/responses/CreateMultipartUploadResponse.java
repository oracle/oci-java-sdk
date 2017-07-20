/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateMultipartUploadResponse {

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, please provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * The full path to the new upload.
     */
    private String location;

    /**
     * The returned MultipartUpload instance.
     */
    private MultipartUpload multipartUpload;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateMultipartUploadResponse o) {
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            multipartUpload(o.getMultipartUpload());

            return this;
        }
    }
}
