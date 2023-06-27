/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * The managed instances to attach to the lifecycle stage.
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
    builder = AttachManagedInstancesToLifecycleStageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttachManagedInstancesToLifecycleStageDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"managedInstanceDetails"})
    public AttachManagedInstancesToLifecycleStageDetails(
            ManagedInstancesDetails managedInstanceDetails) {
        super();
        this.managedInstanceDetails = managedInstanceDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceDetails")
        private ManagedInstancesDetails managedInstanceDetails;

        public Builder managedInstanceDetails(ManagedInstancesDetails managedInstanceDetails) {
            this.managedInstanceDetails = managedInstanceDetails;
            this.__explicitlySet__.add("managedInstanceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachManagedInstancesToLifecycleStageDetails build() {
            AttachManagedInstancesToLifecycleStageDetails model =
                    new AttachManagedInstancesToLifecycleStageDetails(this.managedInstanceDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachManagedInstancesToLifecycleStageDetails model) {
            if (model.wasPropertyExplicitlySet("managedInstanceDetails")) {
                this.managedInstanceDetails(model.getManagedInstanceDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceDetails")
    private final ManagedInstancesDetails managedInstanceDetails;

    public ManagedInstancesDetails getManagedInstanceDetails() {
        return managedInstanceDetails;
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
        sb.append("AttachManagedInstancesToLifecycleStageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstanceDetails=").append(String.valueOf(this.managedInstanceDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachManagedInstancesToLifecycleStageDetails)) {
            return false;
        }

        AttachManagedInstancesToLifecycleStageDetails other =
                (AttachManagedInstancesToLifecycleStageDetails) o;
        return java.util.Objects.equals(this.managedInstanceDetails, other.managedInstanceDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managedInstanceDetails == null
                                ? 43
                                : this.managedInstanceDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
