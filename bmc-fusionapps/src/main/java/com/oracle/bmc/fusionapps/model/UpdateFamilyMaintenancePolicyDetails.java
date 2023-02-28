/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The editable settings of the policy that specifies the maintenance and upgrade preferences for an
 * environment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateFamilyMaintenancePolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateFamilyMaintenancePolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isMonthlyPatchingEnabled", "concurrentMaintenance"})
    public UpdateFamilyMaintenancePolicyDetails(
            Boolean isMonthlyPatchingEnabled,
            FamilyMaintenancePolicy.ConcurrentMaintenance concurrentMaintenance) {
        super();
        this.isMonthlyPatchingEnabled = isMonthlyPatchingEnabled;
        this.concurrentMaintenance = concurrentMaintenance;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether the Fusion environment receives monthly patching. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMonthlyPatchingEnabled")
        private Boolean isMonthlyPatchingEnabled;

        /**
         * Whether the Fusion environment receives monthly patching.
         *
         * @param isMonthlyPatchingEnabled the value to set
         * @return this builder
         */
        public Builder isMonthlyPatchingEnabled(Boolean isMonthlyPatchingEnabled) {
            this.isMonthlyPatchingEnabled = isMonthlyPatchingEnabled;
            this.__explicitlySet__.add("isMonthlyPatchingEnabled");
            return this;
        }
        /** Whether production and non-production environments are upgraded concurrently. */
        @com.fasterxml.jackson.annotation.JsonProperty("concurrentMaintenance")
        private FamilyMaintenancePolicy.ConcurrentMaintenance concurrentMaintenance;

        /**
         * Whether production and non-production environments are upgraded concurrently.
         *
         * @param concurrentMaintenance the value to set
         * @return this builder
         */
        public Builder concurrentMaintenance(
                FamilyMaintenancePolicy.ConcurrentMaintenance concurrentMaintenance) {
            this.concurrentMaintenance = concurrentMaintenance;
            this.__explicitlySet__.add("concurrentMaintenance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateFamilyMaintenancePolicyDetails build() {
            UpdateFamilyMaintenancePolicyDetails model =
                    new UpdateFamilyMaintenancePolicyDetails(
                            this.isMonthlyPatchingEnabled, this.concurrentMaintenance);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFamilyMaintenancePolicyDetails model) {
            if (model.wasPropertyExplicitlySet("isMonthlyPatchingEnabled")) {
                this.isMonthlyPatchingEnabled(model.getIsMonthlyPatchingEnabled());
            }
            if (model.wasPropertyExplicitlySet("concurrentMaintenance")) {
                this.concurrentMaintenance(model.getConcurrentMaintenance());
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

    /** Whether the Fusion environment receives monthly patching. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMonthlyPatchingEnabled")
    private final Boolean isMonthlyPatchingEnabled;

    /**
     * Whether the Fusion environment receives monthly patching.
     *
     * @return the value
     */
    public Boolean getIsMonthlyPatchingEnabled() {
        return isMonthlyPatchingEnabled;
    }

    /** Whether production and non-production environments are upgraded concurrently. */
    @com.fasterxml.jackson.annotation.JsonProperty("concurrentMaintenance")
    private final FamilyMaintenancePolicy.ConcurrentMaintenance concurrentMaintenance;

    /**
     * Whether production and non-production environments are upgraded concurrently.
     *
     * @return the value
     */
    public FamilyMaintenancePolicy.ConcurrentMaintenance getConcurrentMaintenance() {
        return concurrentMaintenance;
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
        sb.append("UpdateFamilyMaintenancePolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isMonthlyPatchingEnabled=")
                .append(String.valueOf(this.isMonthlyPatchingEnabled));
        sb.append(", concurrentMaintenance=").append(String.valueOf(this.concurrentMaintenance));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateFamilyMaintenancePolicyDetails)) {
            return false;
        }

        UpdateFamilyMaintenancePolicyDetails other = (UpdateFamilyMaintenancePolicyDetails) o;
        return java.util.Objects.equals(
                        this.isMonthlyPatchingEnabled, other.isMonthlyPatchingEnabled)
                && java.util.Objects.equals(this.concurrentMaintenance, other.concurrentMaintenance)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isMonthlyPatchingEnabled == null
                                ? 43
                                : this.isMonthlyPatchingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.concurrentMaintenance == null
                                ? 43
                                : this.concurrentMaintenance.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
