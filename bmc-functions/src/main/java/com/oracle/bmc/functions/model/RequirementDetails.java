/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Minimum memory required by this PBF. The user should use memory greater than or equal to this value
 * while configuring the Function.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequirementDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequirementDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"minMemoryRequiredInMBs", "policies"})
    public RequirementDetails(Long minMemoryRequiredInMBs, java.util.List<PolicyDetails> policies) {
        super();
        this.minMemoryRequiredInMBs = minMemoryRequiredInMBs;
        this.policies = policies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Minimum memory required by this PBF. The user should use memory greater than or equal to
         * this value while configuring the Function.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minMemoryRequiredInMBs")
        private Long minMemoryRequiredInMBs;

        /**
         * Minimum memory required by this PBF. The user should use memory greater than or equal to
         * this value while configuring the Function.
         *
         * @param minMemoryRequiredInMBs the value to set
         * @return this builder
         **/
        public Builder minMemoryRequiredInMBs(Long minMemoryRequiredInMBs) {
            this.minMemoryRequiredInMBs = minMemoryRequiredInMBs;
            this.__explicitlySet__.add("minMemoryRequiredInMBs");
            return this;
        }
        /**
         * List of policies required for this PBF execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policies")
        private java.util.List<PolicyDetails> policies;

        /**
         * List of policies required for this PBF execution.
         * @param policies the value to set
         * @return this builder
         **/
        public Builder policies(java.util.List<PolicyDetails> policies) {
            this.policies = policies;
            this.__explicitlySet__.add("policies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequirementDetails build() {
            RequirementDetails model =
                    new RequirementDetails(this.minMemoryRequiredInMBs, this.policies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequirementDetails model) {
            if (model.wasPropertyExplicitlySet("minMemoryRequiredInMBs")) {
                this.minMemoryRequiredInMBs(model.getMinMemoryRequiredInMBs());
            }
            if (model.wasPropertyExplicitlySet("policies")) {
                this.policies(model.getPolicies());
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
     * Minimum memory required by this PBF. The user should use memory greater than or equal to
     * this value while configuring the Function.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minMemoryRequiredInMBs")
    private final Long minMemoryRequiredInMBs;

    /**
     * Minimum memory required by this PBF. The user should use memory greater than or equal to
     * this value while configuring the Function.
     *
     * @return the value
     **/
    public Long getMinMemoryRequiredInMBs() {
        return minMemoryRequiredInMBs;
    }

    /**
     * List of policies required for this PBF execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policies")
    private final java.util.List<PolicyDetails> policies;

    /**
     * List of policies required for this PBF execution.
     * @return the value
     **/
    public java.util.List<PolicyDetails> getPolicies() {
        return policies;
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
        sb.append("RequirementDetails(");
        sb.append("super=").append(super.toString());
        sb.append("minMemoryRequiredInMBs=").append(String.valueOf(this.minMemoryRequiredInMBs));
        sb.append(", policies=").append(String.valueOf(this.policies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequirementDetails)) {
            return false;
        }

        RequirementDetails other = (RequirementDetails) o;
        return java.util.Objects.equals(this.minMemoryRequiredInMBs, other.minMemoryRequiredInMBs)
                && java.util.Objects.equals(this.policies, other.policies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.minMemoryRequiredInMBs == null
                                ? 43
                                : this.minMemoryRequiredInMBs.hashCode());
        result = (result * PRIME) + (this.policies == null ? 43 : this.policies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
