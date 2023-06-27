/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * The managed instance OCIDs to detach from the managed instance group.
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
    builder = DetachManagedInstancesFromManagedInstanceGroupDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetachManagedInstancesFromManagedInstanceGroupDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"managedInstances"})
    public DetachManagedInstancesFromManagedInstanceGroupDetails(
            java.util.List<String> managedInstances) {
        super();
        this.managedInstances = managedInstances;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of managed instance OCIDs to be detached.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstances")
        private java.util.List<String> managedInstances;

        /**
         * The list of managed instance OCIDs to be detached.
         * @param managedInstances the value to set
         * @return this builder
         **/
        public Builder managedInstances(java.util.List<String> managedInstances) {
            this.managedInstances = managedInstances;
            this.__explicitlySet__.add("managedInstances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetachManagedInstancesFromManagedInstanceGroupDetails build() {
            DetachManagedInstancesFromManagedInstanceGroupDetails model =
                    new DetachManagedInstancesFromManagedInstanceGroupDetails(
                            this.managedInstances);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetachManagedInstancesFromManagedInstanceGroupDetails model) {
            if (model.wasPropertyExplicitlySet("managedInstances")) {
                this.managedInstances(model.getManagedInstances());
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
     * The list of managed instance OCIDs to be detached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstances")
    private final java.util.List<String> managedInstances;

    /**
     * The list of managed instance OCIDs to be detached.
     * @return the value
     **/
    public java.util.List<String> getManagedInstances() {
        return managedInstances;
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
        sb.append("DetachManagedInstancesFromManagedInstanceGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstances=").append(String.valueOf(this.managedInstances));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachManagedInstancesFromManagedInstanceGroupDetails)) {
            return false;
        }

        DetachManagedInstancesFromManagedInstanceGroupDetails other =
                (DetachManagedInstancesFromManagedInstanceGroupDetails) o;
        return java.util.Objects.equals(this.managedInstances, other.managedInstances)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managedInstances == null ? 43 : this.managedInstances.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
