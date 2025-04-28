/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * An update available for installation on the Windows managed instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AvailableWindowsUpdateSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AvailableWindowsUpdateSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "name",
        "updateType",
        "isEligibleForInstallation",
        "isRebootRequiredForInstallation"
    })
    public AvailableWindowsUpdateSummary(
            String displayName,
            String name,
            UpdateTypes updateType,
            IsEligibleForInstallation isEligibleForInstallation,
            Boolean isRebootRequiredForInstallation) {
        super();
        this.displayName = displayName;
        this.name = name;
        this.updateType = updateType;
        this.isEligibleForInstallation = isEligibleForInstallation;
        this.isRebootRequiredForInstallation = isRebootRequiredForInstallation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Windows Update name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Windows Update name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Unique identifier for the Windows update. NOTE - This is not an OCID, but is a unique
         * identifier assigned by Microsoft. Example: {@code 6981d463-cd91-4a26-b7c4-ea4ded9183ed}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique identifier for the Windows update. NOTE - This is not an OCID, but is a unique
         * identifier assigned by Microsoft. Example: {@code 6981d463-cd91-4a26-b7c4-ea4ded9183ed}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The purpose of this update. */
        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private UpdateTypes updateType;

        /**
         * The purpose of this update.
         *
         * @param updateType the value to set
         * @return this builder
         */
        public Builder updateType(UpdateTypes updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }
        /** Indicates whether the update can be installed using OSMS. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEligibleForInstallation")
        private IsEligibleForInstallation isEligibleForInstallation;

        /**
         * Indicates whether the update can be installed using OSMS.
         *
         * @param isEligibleForInstallation the value to set
         * @return this builder
         */
        public Builder isEligibleForInstallation(
                IsEligibleForInstallation isEligibleForInstallation) {
            this.isEligibleForInstallation = isEligibleForInstallation;
            this.__explicitlySet__.add("isEligibleForInstallation");
            return this;
        }
        /** Indicates whether a reboot may be required to complete installation of this update. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequiredForInstallation")
        private Boolean isRebootRequiredForInstallation;

        /**
         * Indicates whether a reboot may be required to complete installation of this update.
         *
         * @param isRebootRequiredForInstallation the value to set
         * @return this builder
         */
        public Builder isRebootRequiredForInstallation(Boolean isRebootRequiredForInstallation) {
            this.isRebootRequiredForInstallation = isRebootRequiredForInstallation;
            this.__explicitlySet__.add("isRebootRequiredForInstallation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailableWindowsUpdateSummary build() {
            AvailableWindowsUpdateSummary model =
                    new AvailableWindowsUpdateSummary(
                            this.displayName,
                            this.name,
                            this.updateType,
                            this.isEligibleForInstallation,
                            this.isRebootRequiredForInstallation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailableWindowsUpdateSummary model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("updateType")) {
                this.updateType(model.getUpdateType());
            }
            if (model.wasPropertyExplicitlySet("isEligibleForInstallation")) {
                this.isEligibleForInstallation(model.getIsEligibleForInstallation());
            }
            if (model.wasPropertyExplicitlySet("isRebootRequiredForInstallation")) {
                this.isRebootRequiredForInstallation(model.getIsRebootRequiredForInstallation());
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

    /** Windows Update name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Windows Update name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Unique identifier for the Windows update. NOTE - This is not an OCID, but is a unique
     * identifier assigned by Microsoft. Example: {@code 6981d463-cd91-4a26-b7c4-ea4ded9183ed}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique identifier for the Windows update. NOTE - This is not an OCID, but is a unique
     * identifier assigned by Microsoft. Example: {@code 6981d463-cd91-4a26-b7c4-ea4ded9183ed}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The purpose of this update. */
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    private final UpdateTypes updateType;

    /**
     * The purpose of this update.
     *
     * @return the value
     */
    public UpdateTypes getUpdateType() {
        return updateType;
    }

    /** Indicates whether the update can be installed using OSMS. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEligibleForInstallation")
    private final IsEligibleForInstallation isEligibleForInstallation;

    /**
     * Indicates whether the update can be installed using OSMS.
     *
     * @return the value
     */
    public IsEligibleForInstallation getIsEligibleForInstallation() {
        return isEligibleForInstallation;
    }

    /** Indicates whether a reboot may be required to complete installation of this update. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequiredForInstallation")
    private final Boolean isRebootRequiredForInstallation;

    /**
     * Indicates whether a reboot may be required to complete installation of this update.
     *
     * @return the value
     */
    public Boolean getIsRebootRequiredForInstallation() {
        return isRebootRequiredForInstallation;
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
        sb.append("AvailableWindowsUpdateSummary(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(", isEligibleForInstallation=")
                .append(String.valueOf(this.isEligibleForInstallation));
        sb.append(", isRebootRequiredForInstallation=")
                .append(String.valueOf(this.isRebootRequiredForInstallation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailableWindowsUpdateSummary)) {
            return false;
        }

        AvailableWindowsUpdateSummary other = (AvailableWindowsUpdateSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.updateType, other.updateType)
                && java.util.Objects.equals(
                        this.isEligibleForInstallation, other.isEligibleForInstallation)
                && java.util.Objects.equals(
                        this.isRebootRequiredForInstallation, other.isRebootRequiredForInstallation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result =
                (result * PRIME)
                        + (this.isEligibleForInstallation == null
                                ? 43
                                : this.isEligibleForInstallation.hashCode());
        result =
                (result * PRIME)
                        + (this.isRebootRequiredForInstallation == null
                                ? 43
                                : this.isRebootRequiredForInstallation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
