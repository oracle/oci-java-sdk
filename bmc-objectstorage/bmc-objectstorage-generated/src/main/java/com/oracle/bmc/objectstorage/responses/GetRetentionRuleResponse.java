/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetRetentionRuleResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The entity tag (ETag) for the retention rule.
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The time the retention rule was last modified, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29)
     */
    private java.util.Date lastModified;

    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * The returned RetentionRule instance.
     */
    private com.oracle.bmc.objectstorage.model.RetentionRule retentionRule;

    public com.oracle.bmc.objectstorage.model.RetentionRule getRetentionRule() {
        return retentionRule;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcClientRequestId",
        "opcRequestId",
        "etag",
        "lastModified",
        "retentionRule"
    })
    private GetRetentionRuleResponse(
            int __httpStatusCode__,
            String opcClientRequestId,
            String opcRequestId,
            String etag,
            java.util.Date lastModified,
            com.oracle.bmc.objectstorage.model.RetentionRule retentionRule) {
        super(__httpStatusCode__);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.lastModified = lastModified;
        this.retentionRule = retentionRule;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcClientRequestId;

        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private java.util.Date lastModified;

        public Builder lastModified(java.util.Date lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        private com.oracle.bmc.objectstorage.model.RetentionRule retentionRule;

        public Builder retentionRule(
                com.oracle.bmc.objectstorage.model.RetentionRule retentionRule) {
            this.retentionRule = retentionRule;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetRetentionRuleResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            lastModified(o.getLastModified());
            retentionRule(o.getRetentionRule());

            return this;
        }

        public GetRetentionRuleResponse build() {
            return new GetRetentionRuleResponse(
                    __httpStatusCode__,
                    opcClientRequestId,
                    opcRequestId,
                    etag,
                    lastModified,
                    retentionRule);
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
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",lastModified=").append(String.valueOf(lastModified));
        sb.append(",retentionRule=").append(String.valueOf(retentionRule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRetentionRuleResponse)) {
            return false;
        }

        GetRetentionRuleResponse other = (GetRetentionRuleResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.lastModified, other.lastModified)
                && java.util.Objects.equals(this.retentionRule, other.retentionRule);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.lastModified == null ? 43 : this.lastModified.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionRule == null ? 43 : this.retentionRule.hashCode());
        return result;
    }
}
