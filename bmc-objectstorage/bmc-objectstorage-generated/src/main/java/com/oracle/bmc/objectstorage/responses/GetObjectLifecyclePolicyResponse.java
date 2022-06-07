/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetObjectLifecyclePolicyResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * provide this request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * The entity tag (ETag) for the object lifecycle policy.
     */
    private String eTag;

    public String getETag() {
        return eTag;
    }

    /**
     * The returned ObjectLifecyclePolicy instance.
     */
    private com.oracle.bmc.objectstorage.model.ObjectLifecyclePolicy objectLifecyclePolicy;

    public com.oracle.bmc.objectstorage.model.ObjectLifecyclePolicy getObjectLifecyclePolicy() {
        return objectLifecyclePolicy;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcClientRequestId",
        "eTag",
        "objectLifecyclePolicy"
    })
    private GetObjectLifecyclePolicyResponse(
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

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcClientRequestId;

        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        private String eTag;

        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        private com.oracle.bmc.objectstorage.model.ObjectLifecyclePolicy objectLifecyclePolicy;

        public Builder objectLifecyclePolicy(
                com.oracle.bmc.objectstorage.model.ObjectLifecyclePolicy objectLifecyclePolicy) {
            this.objectLifecyclePolicy = objectLifecyclePolicy;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetObjectLifecyclePolicyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcClientRequestId(o.getOpcClientRequestId());
            eTag(o.getETag());
            objectLifecyclePolicy(o.getObjectLifecyclePolicy());

            return this;
        }

        public GetObjectLifecyclePolicyResponse build() {
            return new GetObjectLifecyclePolicyResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcClientRequestId,
                    eTag,
                    objectLifecyclePolicy);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",objectLifecyclePolicy=").append(String.valueOf(objectLifecyclePolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetObjectLifecyclePolicyResponse)) {
            return false;
        }

        GetObjectLifecyclePolicyResponse other = (GetObjectLifecyclePolicyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(
                        this.objectLifecyclePolicy, other.objectLifecyclePolicy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result =
                (result * PRIME)
                        + (this.objectLifecyclePolicy == null
                                ? 43
                                : this.objectLifecyclePolicy.hashCode());
        return result;
    }
}
