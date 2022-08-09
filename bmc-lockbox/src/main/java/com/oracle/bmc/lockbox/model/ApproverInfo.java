/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.model;

/**
 * The approver data for this approver level.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApproverInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApproverInfo extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"approverType", "approverId"})
    public ApproverInfo(ApproverType approverType, String approverId) {
        super();
        this.approverType = approverType;
        this.approverId = approverId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The approver type of this approver level.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approverType")
        private ApproverType approverType;

        /**
         * The approver type of this approver level.
         * @param approverType the value to set
         * @return this builder
         **/
        public Builder approverType(ApproverType approverType) {
            this.approverType = approverType;
            this.__explicitlySet__.add("approverType");
            return this;
        }
        /**
         * The group or user ocid of the approver for this approver level.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approverId")
        private String approverId;

        /**
         * The group or user ocid of the approver for this approver level.
         * @param approverId the value to set
         * @return this builder
         **/
        public Builder approverId(String approverId) {
            this.approverId = approverId;
            this.__explicitlySet__.add("approverId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApproverInfo build() {
            ApproverInfo model = new ApproverInfo(this.approverType, this.approverId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApproverInfo model) {
            if (model.wasPropertyExplicitlySet("approverType")) {
                this.approverType(model.getApproverType());
            }
            if (model.wasPropertyExplicitlySet("approverId")) {
                this.approverId(model.getApproverId());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The approver type of this approver level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverType")
    private final ApproverType approverType;

    /**
     * The approver type of this approver level.
     * @return the value
     **/
    public ApproverType getApproverType() {
        return approverType;
    }

    /**
     * The group or user ocid of the approver for this approver level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverId")
    private final String approverId;

    /**
     * The group or user ocid of the approver for this approver level.
     * @return the value
     **/
    public String getApproverId() {
        return approverId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApproverInfo(");
        sb.append("super=").append(super.toString());
        sb.append("approverType=").append(String.valueOf(this.approverType));
        sb.append(", approverId=").append(String.valueOf(this.approverId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApproverInfo)) {
            return false;
        }

        ApproverInfo other = (ApproverInfo) o;
        return java.util.Objects.equals(this.approverType, other.approverType)
                && java.util.Objects.equals(this.approverId, other.approverId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.approverType == null ? 43 : this.approverType.hashCode());
        result = (result * PRIME) + (this.approverId == null ? 43 : this.approverId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
