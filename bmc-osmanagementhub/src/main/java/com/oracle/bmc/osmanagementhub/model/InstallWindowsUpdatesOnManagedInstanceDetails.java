/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to install Windows updates on a managed instance. <br>
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
        builder = InstallWindowsUpdatesOnManagedInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstallWindowsUpdatesOnManagedInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "windowsUpdateName",
        "windowsUpdateTypes",
        "workRequestDetails"
    })
    public InstallWindowsUpdatesOnManagedInstanceDetails(
            java.util.List<String> windowsUpdateName,
            java.util.List<WindowsUpdateTypes> windowsUpdateTypes,
            WorkRequestDetails workRequestDetails) {
        super();
        this.windowsUpdateName = windowsUpdateName;
        this.windowsUpdateTypes = windowsUpdateTypes;
        this.workRequestDetails = workRequestDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of Windows update unique identifiers. Note that this is not an OCID, but is a
         * unique identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("windowsUpdateName")
        private java.util.List<String> windowsUpdateName;

        /**
         * The list of Windows update unique identifiers. Note that this is not an OCID, but is a
         * unique identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
         *
         * @param windowsUpdateName the value to set
         * @return this builder
         */
        public Builder windowsUpdateName(java.util.List<String> windowsUpdateName) {
            this.windowsUpdateName = windowsUpdateName;
            this.__explicitlySet__.add("windowsUpdateName");
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

        public InstallWindowsUpdatesOnManagedInstanceDetails build() {
            InstallWindowsUpdatesOnManagedInstanceDetails model =
                    new InstallWindowsUpdatesOnManagedInstanceDetails(
                            this.windowsUpdateName,
                            this.windowsUpdateTypes,
                            this.workRequestDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallWindowsUpdatesOnManagedInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("windowsUpdateName")) {
                this.windowsUpdateName(model.getWindowsUpdateName());
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
     * The list of Windows update unique identifiers. Note that this is not an OCID, but is a unique
     * identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("windowsUpdateName")
    private final java.util.List<String> windowsUpdateName;

    /**
     * The list of Windows update unique identifiers. Note that this is not an OCID, but is a unique
     * identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
     *
     * @return the value
     */
    public java.util.List<String> getWindowsUpdateName() {
        return windowsUpdateName;
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
        sb.append("InstallWindowsUpdatesOnManagedInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("windowsUpdateName=").append(String.valueOf(this.windowsUpdateName));
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
        if (!(o instanceof InstallWindowsUpdatesOnManagedInstanceDetails)) {
            return false;
        }

        InstallWindowsUpdatesOnManagedInstanceDetails other =
                (InstallWindowsUpdatesOnManagedInstanceDetails) o;
        return java.util.Objects.equals(this.windowsUpdateName, other.windowsUpdateName)
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
                        + (this.windowsUpdateName == null ? 43 : this.windowsUpdateName.hashCode());
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
