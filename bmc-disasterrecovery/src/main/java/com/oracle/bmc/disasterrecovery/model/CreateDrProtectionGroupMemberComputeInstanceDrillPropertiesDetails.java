/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create properties for DR drill-specific settings. Use these when the properties for DR drills
 * differ from the properties used for DR operations such as switchover and failover. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vnicMappings"})
    public CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails(
            java.util.List<ComputeInstanceMovableVnicMapping> vnicMappings) {
        super();
        this.vnicMappings = vnicMappings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A list of compute instance VNIC mappings to use for DR drills. */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicMappings")
        private java.util.List<ComputeInstanceMovableVnicMapping> vnicMappings;

        /**
         * A list of compute instance VNIC mappings to use for DR drills.
         *
         * @param vnicMappings the value to set
         * @return this builder
         */
        public Builder vnicMappings(
                java.util.List<ComputeInstanceMovableVnicMapping> vnicMappings) {
            this.vnicMappings = vnicMappings;
            this.__explicitlySet__.add("vnicMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails build() {
            CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails model =
                    new CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails(
                            this.vnicMappings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails model) {
            if (model.wasPropertyExplicitlySet("vnicMappings")) {
                this.vnicMappings(model.getVnicMappings());
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

    /** A list of compute instance VNIC mappings to use for DR drills. */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicMappings")
    private final java.util.List<ComputeInstanceMovableVnicMapping> vnicMappings;

    /**
     * A list of compute instance VNIC mappings to use for DR drills.
     *
     * @return the value
     */
    public java.util.List<ComputeInstanceMovableVnicMapping> getVnicMappings() {
        return vnicMappings;
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
        sb.append("CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vnicMappings=").append(String.valueOf(this.vnicMappings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails)) {
            return false;
        }

        CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails other =
                (CreateDrProtectionGroupMemberComputeInstanceDrillPropertiesDetails) o;
        return java.util.Objects.equals(this.vnicMappings, other.vnicMappings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vnicMappings == null ? 43 : this.vnicMappings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
