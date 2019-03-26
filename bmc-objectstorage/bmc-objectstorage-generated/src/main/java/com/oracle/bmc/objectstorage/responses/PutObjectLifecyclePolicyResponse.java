/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class PutObjectLifecyclePolicyResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * The entity tag (ETag) for the object lifecycle policy.
     */
    private String eTag;

    /**
     * The returned ObjectLifecyclePolicy instance.
     */
    private ObjectLifecyclePolicy objectLifecyclePolicy;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(PutObjectLifecyclePolicyResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcClientRequestId(o.getOpcClientRequestId());
            eTag(o.getETag());
            objectLifecyclePolicy(o.getObjectLifecyclePolicy());

            return this;
        }
    }
}
