/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Count based stage approval policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CountBasedApprovalPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "approvalPolicyType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CountBasedApprovalPolicy extends ApprovalPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A minimum number of approvals required for stage to proceed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfApprovalsRequired")
        private Integer numberOfApprovalsRequired;

        /**
         * A minimum number of approvals required for stage to proceed.
         * @param numberOfApprovalsRequired the value to set
         * @return this builder
         **/
        public Builder numberOfApprovalsRequired(Integer numberOfApprovalsRequired) {
            this.numberOfApprovalsRequired = numberOfApprovalsRequired;
            this.__explicitlySet__.add("numberOfApprovalsRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CountBasedApprovalPolicy build() {
            CountBasedApprovalPolicy model =
                    new CountBasedApprovalPolicy(this.numberOfApprovalsRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CountBasedApprovalPolicy model) {
            if (model.wasPropertyExplicitlySet("numberOfApprovalsRequired")) {
                this.numberOfApprovalsRequired(model.getNumberOfApprovalsRequired());
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

    @Deprecated
    public CountBasedApprovalPolicy(Integer numberOfApprovalsRequired) {
        super();
        this.numberOfApprovalsRequired = numberOfApprovalsRequired;
    }

    /**
     * A minimum number of approvals required for stage to proceed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfApprovalsRequired")
    private final Integer numberOfApprovalsRequired;

    /**
     * A minimum number of approvals required for stage to proceed.
     * @return the value
     **/
    public Integer getNumberOfApprovalsRequired() {
        return numberOfApprovalsRequired;
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
        sb.append("CountBasedApprovalPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", numberOfApprovalsRequired=")
                .append(String.valueOf(this.numberOfApprovalsRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CountBasedApprovalPolicy)) {
            return false;
        }

        CountBasedApprovalPolicy other = (CountBasedApprovalPolicy) o;
        return java.util.Objects.equals(
                        this.numberOfApprovalsRequired, other.numberOfApprovalsRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.numberOfApprovalsRequired == null
                                ? 43
                                : this.numberOfApprovalsRequired.hashCode());
        return result;
    }
}
