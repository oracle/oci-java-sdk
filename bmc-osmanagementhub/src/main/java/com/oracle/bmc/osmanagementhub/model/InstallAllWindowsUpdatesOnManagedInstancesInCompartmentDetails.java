/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to install all Windows updates of a specified type on managed
 * instances within the specified compartment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "windowsUpdateTypes", "workRequestDetails"})
    public InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails(
            String compartmentId,
            java.util.List<WindowsUpdateTypes> windowsUpdateTypes,
            WorkRequestDetails workRequestDetails) {
        super();
        this.compartmentId = compartmentId;
        this.windowsUpdateTypes = windowsUpdateTypes;
        this.workRequestDetails = workRequestDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The types of Windows updates to be installed. */
        @com.fasterxml.jackson.annotation.JsonProperty("windowsUpdateTypes")
        private java.util.List<WindowsUpdateTypes> windowsUpdateTypes;

        /**
         * The types of Windows updates to be installed.
         *
         * @param windowsUpdateTypes the value to set
         * @return this builder
         */
        public Builder windowsUpdateTypes(java.util.List<WindowsUpdateTypes> windowsUpdateTypes) {
            this.windowsUpdateTypes = windowsUpdateTypes;
            this.__explicitlySet__.add("windowsUpdateTypes");
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

        public InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails build() {
            InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails model =
                    new InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails(
                            this.compartmentId, this.windowsUpdateTypes, this.workRequestDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("windowsUpdateTypes")) {
                this.windowsUpdateTypes(model.getWindowsUpdateTypes());
            }
            if (model.wasPropertyExplicitlySet("workRequestDetails")) {
                this.workRequestDetails(model.getWorkRequestDetails());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The types of Windows updates to be installed. */
    @com.fasterxml.jackson.annotation.JsonProperty("windowsUpdateTypes")
    private final java.util.List<WindowsUpdateTypes> windowsUpdateTypes;

    /**
     * The types of Windows updates to be installed.
     *
     * @return the value
     */
    public java.util.List<WindowsUpdateTypes> getWindowsUpdateTypes() {
        return windowsUpdateTypes;
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", windowsUpdateTypes=").append(String.valueOf(this.windowsUpdateTypes));
        sb.append(", workRequestDetails=").append(String.valueOf(this.workRequestDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails)) {
            return false;
        }

        InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails other =
                (InstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.windowsUpdateTypes, other.windowsUpdateTypes)
                && java.util.Objects.equals(this.workRequestDetails, other.workRequestDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.windowsUpdateTypes == null
                                ? 43
                                : this.windowsUpdateTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestDetails == null
                                ? 43
                                : this.workRequestDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
