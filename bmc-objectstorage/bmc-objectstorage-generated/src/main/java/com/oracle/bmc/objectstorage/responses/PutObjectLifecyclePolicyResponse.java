/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class PutObjectLifecyclePolicyResponse extends com.oracle.bmc.responses.BmcResponse {
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
    private com.oracle.bmc.objectstorage.model.ObjectLifecyclePolicy objectLifecyclePolicy;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcClientRequestId",
        "eTag",
        "objectLifecyclePolicy"
    })
    private PutObjectLifecyclePolicyResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcClientRequestId,
            String eTag,
            com.oracle.bmc.objectstorage.model.ObjectLifecyclePolicy objectLifecyclePolicy) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcClientRequestId = opcClientRequestId;
        this.eTag = eTag;
        this.objectLifecyclePolicy = objectLifecyclePolicy;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(PutObjectLifecyclePolicyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcClientRequestId(o.getOpcClientRequestId());
            eTag(o.getETag());
            objectLifecyclePolicy(o.getObjectLifecyclePolicy());

            return this;
        }

        public PutObjectLifecyclePolicyResponse build() {
            return new PutObjectLifecyclePolicyResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcClientRequestId,
                    eTag,
                    objectLifecyclePolicy);
        }
    }
}
