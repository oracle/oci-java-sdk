/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the autoscale configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateAutoScalingConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateAutoScalingConfigurationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "isEnabled",
        "clusterAdminPassword",
        "policy",
        "policyDetails"
    })
    public UpdateAutoScalingConfigurationDetails(
            String displayName,
            Boolean isEnabled,
            String clusterAdminPassword,
            AutoScalePolicy policy,
            UpdateAutoScalePolicyDetails policyDetails) {
        super();
        this.displayName = displayName;
        this.isEnabled = isEnabled;
        this.clusterAdminPassword = clusterAdminPassword;
        this.policy = policy;
        this.policyDetails = policyDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Whether the autoscale configuration is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether the autoscale configuration is enabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         * @param clusterAdminPassword the value to set
         * @return this builder
         **/
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private AutoScalePolicy policy;

        public Builder policy(AutoScalePolicy policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyDetails")
        private UpdateAutoScalePolicyDetails policyDetails;

        public Builder policyDetails(UpdateAutoScalePolicyDetails policyDetails) {
            this.policyDetails = policyDetails;
            this.__explicitlySet__.add("policyDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAutoScalingConfigurationDetails build() {
            UpdateAutoScalingConfigurationDetails __instance__ =
                    new UpdateAutoScalingConfigurationDetails(
                            displayName, isEnabled, clusterAdminPassword, policy, policyDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAutoScalingConfigurationDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .isEnabled(o.getIsEnabled())
                            .clusterAdminPassword(o.getClusterAdminPassword())
                            .policy(o.getPolicy())
                            .policyDetails(o.getPolicyDetails());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * A user-friendly name. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Whether the autoscale configuration is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether the autoscale configuration is enabled.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     * @return the value
     **/
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    private final AutoScalePolicy policy;

    public AutoScalePolicy getPolicy() {
        return policy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("policyDetails")
    private final UpdateAutoScalePolicyDetails policyDetails;

    public UpdateAutoScalePolicyDetails getPolicyDetails() {
        return policyDetails;
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
        sb.append("UpdateAutoScalingConfigurationDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", clusterAdminPassword=").append(String.valueOf(this.clusterAdminPassword));
        sb.append(", policy=").append(String.valueOf(this.policy));
        sb.append(", policyDetails=").append(String.valueOf(this.policyDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutoScalingConfigurationDetails)) {
            return false;
        }

        UpdateAutoScalingConfigurationDetails other = (UpdateAutoScalingConfigurationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.policy, other.policy)
                && java.util.Objects.equals(this.policyDetails, other.policyDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result = (result * PRIME) + (this.policy == null ? 43 : this.policy.hashCode());
        result =
                (result * PRIME)
                        + (this.policyDetails == null ? 43 : this.policyDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
