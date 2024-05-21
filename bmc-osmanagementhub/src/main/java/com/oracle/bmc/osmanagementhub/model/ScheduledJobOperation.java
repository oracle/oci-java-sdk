/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Defines an operation that is performed by a scheduled job.
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
    builder = ScheduledJobOperation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduledJobOperation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationType",
        "packageNames",
        "windowsUpdateNames",
        "manageModuleStreamsDetails",
        "switchModuleStreamsDetails",
        "softwareSourceIds"
    })
    public ScheduledJobOperation(
            OperationTypes operationType,
            java.util.List<String> packageNames,
            java.util.List<String> windowsUpdateNames,
            ManageModuleStreamsInScheduledJobDetails manageModuleStreamsDetails,
            ModuleStreamDetails switchModuleStreamsDetails,
            java.util.List<String> softwareSourceIds) {
        super();
        this.operationType = operationType;
        this.packageNames = packageNames;
        this.windowsUpdateNames = windowsUpdateNames;
        this.manageModuleStreamsDetails = manageModuleStreamsDetails;
        this.switchModuleStreamsDetails = switchModuleStreamsDetails;
        this.softwareSourceIds = softwareSourceIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of operation this scheduled job performs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationTypes operationType;

        /**
         * The type of operation this scheduled job performs.
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(OperationTypes operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * The names of the target packages. This parameter only applies when the scheduled job is for installing, updating, or removing packages.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
        private java.util.List<String> packageNames;

        /**
         * The names of the target packages. This parameter only applies when the scheduled job is for installing, updating, or removing packages.
         * @param packageNames the value to set
         * @return this builder
         **/
        public Builder packageNames(java.util.List<String> packageNames) {
            this.packageNames = packageNames;
            this.__explicitlySet__.add("packageNames");
            return this;
        }
        /**
         * Unique identifier for the Windows update. This parameter only applies if the scheduled job is for installing Windows updates.
         * Note that this is not an OCID, but is a unique identifier assigned by Microsoft.
         * For example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("windowsUpdateNames")
        private java.util.List<String> windowsUpdateNames;

        /**
         * Unique identifier for the Windows update. This parameter only applies if the scheduled job is for installing Windows updates.
         * Note that this is not an OCID, but is a unique identifier assigned by Microsoft.
         * For example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'.
         *
         * @param windowsUpdateNames the value to set
         * @return this builder
         **/
        public Builder windowsUpdateNames(java.util.List<String> windowsUpdateNames) {
            this.windowsUpdateNames = windowsUpdateNames;
            this.__explicitlySet__.add("windowsUpdateNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("manageModuleStreamsDetails")
        private ManageModuleStreamsInScheduledJobDetails manageModuleStreamsDetails;

        public Builder manageModuleStreamsDetails(
                ManageModuleStreamsInScheduledJobDetails manageModuleStreamsDetails) {
            this.manageModuleStreamsDetails = manageModuleStreamsDetails;
            this.__explicitlySet__.add("manageModuleStreamsDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("switchModuleStreamsDetails")
        private ModuleStreamDetails switchModuleStreamsDetails;

        public Builder switchModuleStreamsDetails(ModuleStreamDetails switchModuleStreamsDetails) {
            this.switchModuleStreamsDetails = switchModuleStreamsDetails;
            this.__explicitlySet__.add("switchModuleStreamsDetails");
            return this;
        }
        /**
         * The software source [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * This parameter only applies when the scheduled job is for attaching or detaching software sources.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
        private java.util.List<String> softwareSourceIds;

        /**
         * The software source [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * This parameter only applies when the scheduled job is for attaching or detaching software sources.
         *
         * @param softwareSourceIds the value to set
         * @return this builder
         **/
        public Builder softwareSourceIds(java.util.List<String> softwareSourceIds) {
            this.softwareSourceIds = softwareSourceIds;
            this.__explicitlySet__.add("softwareSourceIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledJobOperation build() {
            ScheduledJobOperation model =
                    new ScheduledJobOperation(
                            this.operationType,
                            this.packageNames,
                            this.windowsUpdateNames,
                            this.manageModuleStreamsDetails,
                            this.switchModuleStreamsDetails,
                            this.softwareSourceIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledJobOperation model) {
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("packageNames")) {
                this.packageNames(model.getPackageNames());
            }
            if (model.wasPropertyExplicitlySet("windowsUpdateNames")) {
                this.windowsUpdateNames(model.getWindowsUpdateNames());
            }
            if (model.wasPropertyExplicitlySet("manageModuleStreamsDetails")) {
                this.manageModuleStreamsDetails(model.getManageModuleStreamsDetails());
            }
            if (model.wasPropertyExplicitlySet("switchModuleStreamsDetails")) {
                this.switchModuleStreamsDetails(model.getSwitchModuleStreamsDetails());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceIds")) {
                this.softwareSourceIds(model.getSoftwareSourceIds());
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
     * The type of operation this scheduled job performs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationTypes operationType;

    /**
     * The type of operation this scheduled job performs.
     * @return the value
     **/
    public OperationTypes getOperationType() {
        return operationType;
    }

    /**
     * The names of the target packages. This parameter only applies when the scheduled job is for installing, updating, or removing packages.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageNames")
    private final java.util.List<String> packageNames;

    /**
     * The names of the target packages. This parameter only applies when the scheduled job is for installing, updating, or removing packages.
     * @return the value
     **/
    public java.util.List<String> getPackageNames() {
        return packageNames;
    }

    /**
     * Unique identifier for the Windows update. This parameter only applies if the scheduled job is for installing Windows updates.
     * Note that this is not an OCID, but is a unique identifier assigned by Microsoft.
     * For example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("windowsUpdateNames")
    private final java.util.List<String> windowsUpdateNames;

    /**
     * Unique identifier for the Windows update. This parameter only applies if the scheduled job is for installing Windows updates.
     * Note that this is not an OCID, but is a unique identifier assigned by Microsoft.
     * For example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'.
     *
     * @return the value
     **/
    public java.util.List<String> getWindowsUpdateNames() {
        return windowsUpdateNames;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("manageModuleStreamsDetails")
    private final ManageModuleStreamsInScheduledJobDetails manageModuleStreamsDetails;

    public ManageModuleStreamsInScheduledJobDetails getManageModuleStreamsDetails() {
        return manageModuleStreamsDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("switchModuleStreamsDetails")
    private final ModuleStreamDetails switchModuleStreamsDetails;

    public ModuleStreamDetails getSwitchModuleStreamsDetails() {
        return switchModuleStreamsDetails;
    }

    /**
     * The software source [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * This parameter only applies when the scheduled job is for attaching or detaching software sources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
    private final java.util.List<String> softwareSourceIds;

    /**
     * The software source [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * This parameter only applies when the scheduled job is for attaching or detaching software sources.
     *
     * @return the value
     **/
    public java.util.List<String> getSoftwareSourceIds() {
        return softwareSourceIds;
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
        sb.append("ScheduledJobOperation(");
        sb.append("super=").append(super.toString());
        sb.append("operationType=").append(String.valueOf(this.operationType));
        sb.append(", packageNames=").append(String.valueOf(this.packageNames));
        sb.append(", windowsUpdateNames=").append(String.valueOf(this.windowsUpdateNames));
        sb.append(", manageModuleStreamsDetails=")
                .append(String.valueOf(this.manageModuleStreamsDetails));
        sb.append(", switchModuleStreamsDetails=")
                .append(String.valueOf(this.switchModuleStreamsDetails));
        sb.append(", softwareSourceIds=").append(String.valueOf(this.softwareSourceIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledJobOperation)) {
            return false;
        }

        ScheduledJobOperation other = (ScheduledJobOperation) o;
        return java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.packageNames, other.packageNames)
                && java.util.Objects.equals(this.windowsUpdateNames, other.windowsUpdateNames)
                && java.util.Objects.equals(
                        this.manageModuleStreamsDetails, other.manageModuleStreamsDetails)
                && java.util.Objects.equals(
                        this.switchModuleStreamsDetails, other.switchModuleStreamsDetails)
                && java.util.Objects.equals(this.softwareSourceIds, other.softwareSourceIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.packageNames == null ? 43 : this.packageNames.hashCode());
        result =
                (result * PRIME)
                        + (this.windowsUpdateNames == null
                                ? 43
                                : this.windowsUpdateNames.hashCode());
        result =
                (result * PRIME)
                        + (this.manageModuleStreamsDetails == null
                                ? 43
                                : this.manageModuleStreamsDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.switchModuleStreamsDetails == null
                                ? 43
                                : this.switchModuleStreamsDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceIds == null ? 43 : this.softwareSourceIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
