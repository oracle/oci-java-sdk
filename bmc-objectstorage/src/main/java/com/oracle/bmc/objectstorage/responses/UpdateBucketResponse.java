/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class UpdateBucketResponse {

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
     * The entity tag for the updated bucket.
     */
    private String eTag;

    /**
     * The returned Bucket instance.
     */
    private Bucket bucket;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateBucketResponse o) {
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            bucket(o.getBucket());

            return this;
        }
    }
}
