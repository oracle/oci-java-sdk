/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.events.responses;

import com.oracle.bmc.events.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateRuleResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. Add this value to the {@code if-match} parameter
     * in a PUT or DELETE operation. The resource will be updated only if the value you
     * provide matches the {@code etag} on the resource.
     *
     */
    private String etag;

    /**
     * For optimistic concurrency control. Add this value to the {@code if-match} parameter
     * in a PUT or DELETE operation. The resource will be updated only if the value you
     * provide matches the {@code etag} on the resource.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned Rule instance.
     */
    private com.oracle.bmc.events.model.Rule rule;

    /**
     * The returned Rule instance.
     * @return the value
     */
    public com.oracle.bmc.events.model.Rule getRule() {
        return rule;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "etag", "opcRequestId", "rule"})
    private UpdateRuleResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.events.model.Rule rule) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.rule = rule;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * For optimistic concurrency control. Add this value to the {@code if-match} parameter
         * in a PUT or DELETE operation. The resource will be updated only if the value you
         * provide matches the {@code etag} on the resource.
         *
         */
        private String etag;

        /**
         * For optimistic concurrency control. Add this value to the {@code if-match} parameter
         * in a PUT or DELETE operation. The resource will be updated only if the value you
         * provide matches the {@code etag} on the resource.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned Rule instance.
         */
        private com.oracle.bmc.events.model.Rule rule;

        /**
         * The returned Rule instance.
         * @param rule the value to set
         * @return this builder
         */
        public Builder rule(com.oracle.bmc.events.model.Rule rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateRuleResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            rule(o.getRule());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateRuleResponse build() {
            return new UpdateRuleResponse(__httpStatusCode__, etag, opcRequestId, rule);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",rule=").append(String.valueOf(rule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRuleResponse)) {
            return false;
        }

        UpdateRuleResponse other = (UpdateRuleResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.rule, other.rule);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.rule == null ? 43 : this.rule.hashCode());
        return result;
    }
}
