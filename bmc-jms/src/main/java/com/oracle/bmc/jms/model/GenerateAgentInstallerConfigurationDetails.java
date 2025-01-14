/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Attributes to generate agent installer parameters for a fleet. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenerateAgentInstallerConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenerateAgentInstallerConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"installKeyId", "fleetId"})
    public GenerateAgentInstallerConfigurationDetails(String installKeyId, String fleetId) {
        super();
        this.installKeyId = installKeyId;
        this.fleetId = fleetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * install key for which to generate the configuration file.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("installKeyId")
        private String installKeyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * install key for which to generate the configuration file.
         *
         * @param installKeyId the value to set
         * @return this builder
         */
        public Builder installKeyId(String installKeyId) {
            this.installKeyId = installKeyId;
            this.__explicitlySet__.add("installKeyId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * fleet for which to generate the configuration file.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * fleet for which to generate the configuration file.
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateAgentInstallerConfigurationDetails build() {
            GenerateAgentInstallerConfigurationDetails model =
                    new GenerateAgentInstallerConfigurationDetails(this.installKeyId, this.fleetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateAgentInstallerConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("installKeyId")) {
                this.installKeyId(model.getInstallKeyId());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * install key for which to generate the configuration file.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("installKeyId")
    private final String installKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * install key for which to generate the configuration file.
     *
     * @return the value
     */
    public String getInstallKeyId() {
        return installKeyId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * fleet for which to generate the configuration file.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * fleet for which to generate the configuration file.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
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
        sb.append("GenerateAgentInstallerConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("installKeyId=").append(String.valueOf(this.installKeyId));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateAgentInstallerConfigurationDetails)) {
            return false;
        }

        GenerateAgentInstallerConfigurationDetails other =
                (GenerateAgentInstallerConfigurationDetails) o;
        return java.util.Objects.equals(this.installKeyId, other.installKeyId)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.installKeyId == null ? 43 : this.installKeyId.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
