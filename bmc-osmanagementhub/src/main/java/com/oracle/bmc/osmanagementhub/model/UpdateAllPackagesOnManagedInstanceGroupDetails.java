/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the details for updating the packages on the managed instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateAllPackagesOnManagedInstanceGroupDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateAllPackagesOnManagedInstanceGroupDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"updateTypes", "workRequestDetails"})
    public UpdateAllPackagesOnManagedInstanceGroupDetails(
            java.util.List<UpdateTypes> updateTypes, WorkRequestDetails workRequestDetails) {
        super();
        this.updateTypes = updateTypes;
        this.workRequestDetails = workRequestDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of updates to be applied.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateTypes")
        private java.util.List<UpdateTypes> updateTypes;

        /**
         * The type of updates to be applied.
         * @param updateTypes the value to set
         * @return this builder
         **/
        public Builder updateTypes(java.util.List<UpdateTypes> updateTypes) {
            this.updateTypes = updateTypes;
            this.__explicitlySet__.add("updateTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workRequestDetails")
        private WorkRequestDetails workRequestDetails;

        public Builder workRequestDetails(WorkRequestDetails workRequestDetails) {
            this.workRequestDetails = workRequestDetails;
            this.__explicitlySet__.add("workRequestDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAllPackagesOnManagedInstanceGroupDetails build() {
            UpdateAllPackagesOnManagedInstanceGroupDetails model =
                    new UpdateAllPackagesOnManagedInstanceGroupDetails(
                            this.updateTypes, this.workRequestDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAllPackagesOnManagedInstanceGroupDetails model) {
            if (model.wasPropertyExplicitlySet("updateTypes")) {
                this.updateTypes(model.getUpdateTypes());
            }
            if (model.wasPropertyExplicitlySet("workRequestDetails")) {
                this.workRequestDetails(model.getWorkRequestDetails());
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
     * The type of updates to be applied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateTypes")
    private final java.util.List<UpdateTypes> updateTypes;

    /**
     * The type of updates to be applied.
     * @return the value
     **/
    public java.util.List<UpdateTypes> getUpdateTypes() {
        return updateTypes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("workRequestDetails")
    private final WorkRequestDetails workRequestDetails;

    public WorkRequestDetails getWorkRequestDetails() {
        return workRequestDetails;
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
        sb.append("UpdateAllPackagesOnManagedInstanceGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("updateTypes=").append(String.valueOf(this.updateTypes));
        sb.append(", workRequestDetails=").append(String.valueOf(this.workRequestDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAllPackagesOnManagedInstanceGroupDetails)) {
            return false;
        }

        UpdateAllPackagesOnManagedInstanceGroupDetails other =
                (UpdateAllPackagesOnManagedInstanceGroupDetails) o;
        return java.util.Objects.equals(this.updateTypes, other.updateTypes)
                && java.util.Objects.equals(this.workRequestDetails, other.workRequestDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.updateTypes == null ? 43 : this.updateTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestDetails == null
                                ? 43
                                : this.workRequestDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
