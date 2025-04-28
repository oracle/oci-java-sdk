/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The details of the Fusion environment family to be updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateFusionEnvironmentFamilyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateFusionEnvironmentFamilyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "familyMaintenancePolicy",
        "subscriptionIds",
        "freeformTags",
        "definedTags"
    })
    public UpdateFusionEnvironmentFamilyDetails(
            String displayName,
            UpdateFamilyMaintenancePolicyDetails familyMaintenancePolicy,
            java.util.List<String> subscriptionIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.familyMaintenancePolicy = familyMaintenancePolicy;
        this.subscriptionIds = subscriptionIds;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A friendly name for the environment family. The name must contain only letters, numbers,
         * dashes, and underscores. Can be changed later.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A friendly name for the environment family. The name must contain only letters, numbers,
         * dashes, and underscores. Can be changed later.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("familyMaintenancePolicy")
        private UpdateFamilyMaintenancePolicyDetails familyMaintenancePolicy;

        public Builder familyMaintenancePolicy(
                UpdateFamilyMaintenancePolicyDetails familyMaintenancePolicy) {
            this.familyMaintenancePolicy = familyMaintenancePolicy;
            this.__explicitlySet__.add("familyMaintenancePolicy");
            return this;
        }
        /**
         * The list of the IDs of the applications subscriptions that are associated with the
         * environment family.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
        private java.util.List<String> subscriptionIds;

        /**
         * The list of the IDs of the applications subscriptions that are associated with the
         * environment family.
         *
         * @param subscriptionIds the value to set
         * @return this builder
         */
        public Builder subscriptionIds(java.util.List<String> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            this.__explicitlySet__.add("subscriptionIds");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateFusionEnvironmentFamilyDetails build() {
            UpdateFusionEnvironmentFamilyDetails model =
                    new UpdateFusionEnvironmentFamilyDetails(
                            this.displayName,
                            this.familyMaintenancePolicy,
                            this.subscriptionIds,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFusionEnvironmentFamilyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("familyMaintenancePolicy")) {
                this.familyMaintenancePolicy(model.getFamilyMaintenancePolicy());
            }
            if (model.wasPropertyExplicitlySet("subscriptionIds")) {
                this.subscriptionIds(model.getSubscriptionIds());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A friendly name for the environment family. The name must contain only letters, numbers,
     * dashes, and underscores. Can be changed later.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A friendly name for the environment family. The name must contain only letters, numbers,
     * dashes, and underscores. Can be changed later.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("familyMaintenancePolicy")
    private final UpdateFamilyMaintenancePolicyDetails familyMaintenancePolicy;

    public UpdateFamilyMaintenancePolicyDetails getFamilyMaintenancePolicy() {
        return familyMaintenancePolicy;
    }

    /**
     * The list of the IDs of the applications subscriptions that are associated with the
     * environment family.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
    private final java.util.List<String> subscriptionIds;

    /**
     * The list of the IDs of the applications subscriptions that are associated with the
     * environment family.
     *
     * @return the value
     */
    public java.util.List<String> getSubscriptionIds() {
        return subscriptionIds;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateFusionEnvironmentFamilyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", familyMaintenancePolicy=")
                .append(String.valueOf(this.familyMaintenancePolicy));
        sb.append(", subscriptionIds=").append(String.valueOf(this.subscriptionIds));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateFusionEnvironmentFamilyDetails)) {
            return false;
        }

        UpdateFusionEnvironmentFamilyDetails other = (UpdateFusionEnvironmentFamilyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.familyMaintenancePolicy, other.familyMaintenancePolicy)
                && java.util.Objects.equals(this.subscriptionIds, other.subscriptionIds)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.familyMaintenancePolicy == null
                                ? 43
                                : this.familyMaintenancePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionIds == null ? 43 : this.subscriptionIds.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
