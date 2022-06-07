/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class GetSteeringPolicyAttachmentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String eTag;

    public String getETag() {
        return eTag;
    }

    /**
     * The returned SteeringPolicyAttachment instance, or null if {@link #isNotModified()} is true.
     */
    private com.oracle.bmc.dns.model.SteeringPolicyAttachment steeringPolicyAttachment;

    public com.oracle.bmc.dns.model.SteeringPolicyAttachment getSteeringPolicyAttachment() {
        return steeringPolicyAttachment;
    }

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    public boolean isNotModified() {
        return isNotModified;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "eTag",
        "steeringPolicyAttachment",
        "isNotModified"
    })
    private GetSteeringPolicyAttachmentResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String eTag,
            com.oracle.bmc.dns.model.SteeringPolicyAttachment steeringPolicyAttachment,
            boolean isNotModified) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.eTag = eTag;
        this.steeringPolicyAttachment = steeringPolicyAttachment;
        this.isNotModified = isNotModified;
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

        private String eTag;

        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        private com.oracle.bmc.dns.model.SteeringPolicyAttachment steeringPolicyAttachment;

        public Builder steeringPolicyAttachment(
                com.oracle.bmc.dns.model.SteeringPolicyAttachment steeringPolicyAttachment) {
            this.steeringPolicyAttachment = steeringPolicyAttachment;
            return this;
        }

        private boolean isNotModified;

        public Builder isNotModified(boolean isNotModified) {
            this.isNotModified = isNotModified;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetSteeringPolicyAttachmentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            steeringPolicyAttachment(o.getSteeringPolicyAttachment());
            isNotModified(o.isNotModified());
            return this;
        }

        public GetSteeringPolicyAttachmentResponse build() {
            return new GetSteeringPolicyAttachmentResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    eTag,
                    steeringPolicyAttachment,
                    isNotModified);
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
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",steeringPolicyAttachment=").append(String.valueOf(steeringPolicyAttachment));
        sb.append(",isNotModified=").append(isNotModified);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSteeringPolicyAttachmentResponse)) {
            return false;
        }

        GetSteeringPolicyAttachmentResponse other = (GetSteeringPolicyAttachmentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(
                        this.steeringPolicyAttachment, other.steeringPolicyAttachment)
                && this.isNotModified == other.isNotModified;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result =
                (result * PRIME)
                        + (this.steeringPolicyAttachment == null
                                ? 43
                                : this.steeringPolicyAttachment.hashCode());
        result = (result * PRIME) + (this.isNotModified ? 79 : 97);
        return result;
    }
}
