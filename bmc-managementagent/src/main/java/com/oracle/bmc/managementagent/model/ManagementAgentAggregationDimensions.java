/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The Aggregation of Management Agent Dimensions
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementAgentAggregationDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementAgentAggregationDimensions {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityStatus",
        "platformType",
        "version",
        "hasPlugins",
        "installType"
    })
    public ManagementAgentAggregationDimensions(
            AvailabilityStatus availabilityStatus,
            PlatformTypes platformType,
            String version,
            Boolean hasPlugins,
            InstallTypes installType) {
        super();
        this.availabilityStatus = availabilityStatus;
        this.platformType = platformType;
        this.version = version;
        this.hasPlugins = hasPlugins;
        this.installType = installType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability status of managementAgent
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
        private AvailabilityStatus availabilityStatus;

        /**
         * The availability status of managementAgent
         * @param availabilityStatus the value to set
         * @return this builder
         **/
        public Builder availabilityStatus(AvailabilityStatus availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            this.__explicitlySet__.add("availabilityStatus");
            return this;
        }
        /**
         * Platform Type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformTypes platformType;

        /**
         * Platform Type
         * @param platformType the value to set
         * @return this builder
         **/
        public Builder platformType(PlatformTypes platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }
        /**
         * Agent image version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Agent image version
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Whether or not a managementAgent has at least one plugin
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hasPlugins")
        private Boolean hasPlugins;

        /**
         * Whether or not a managementAgent has at least one plugin
         * @param hasPlugins the value to set
         * @return this builder
         **/
        public Builder hasPlugins(Boolean hasPlugins) {
            this.hasPlugins = hasPlugins;
            this.__explicitlySet__.add("hasPlugins");
            return this;
        }
        /**
         * The install type, either AGENT or GATEWAY
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("installType")
        private InstallTypes installType;

        /**
         * The install type, either AGENT or GATEWAY
         * @param installType the value to set
         * @return this builder
         **/
        public Builder installType(InstallTypes installType) {
            this.installType = installType;
            this.__explicitlySet__.add("installType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementAgentAggregationDimensions build() {
            ManagementAgentAggregationDimensions __instance__ =
                    new ManagementAgentAggregationDimensions(
                            availabilityStatus, platformType, version, hasPlugins, installType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementAgentAggregationDimensions o) {
            Builder copiedBuilder =
                    availabilityStatus(o.getAvailabilityStatus())
                            .platformType(o.getPlatformType())
                            .version(o.getVersion())
                            .hasPlugins(o.getHasPlugins())
                            .installType(o.getInstallType());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The availability status of managementAgent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
    private final AvailabilityStatus availabilityStatus;

    /**
     * The availability status of managementAgent
     * @return the value
     **/
    public AvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * Platform Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    private final PlatformTypes platformType;

    /**
     * Platform Type
     * @return the value
     **/
    public PlatformTypes getPlatformType() {
        return platformType;
    }

    /**
     * Agent image version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Agent image version
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * Whether or not a managementAgent has at least one plugin
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hasPlugins")
    private final Boolean hasPlugins;

    /**
     * Whether or not a managementAgent has at least one plugin
     * @return the value
     **/
    public Boolean getHasPlugins() {
        return hasPlugins;
    }

    /**
     * The install type, either AGENT or GATEWAY
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installType")
    private final InstallTypes installType;

    /**
     * The install type, either AGENT or GATEWAY
     * @return the value
     **/
    public InstallTypes getInstallType() {
        return installType;
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
        sb.append("ManagementAgentAggregationDimensions(");
        sb.append("availabilityStatus=").append(String.valueOf(this.availabilityStatus));
        sb.append(", platformType=").append(String.valueOf(this.platformType));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", hasPlugins=").append(String.valueOf(this.hasPlugins));
        sb.append(", installType=").append(String.valueOf(this.installType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementAgentAggregationDimensions)) {
            return false;
        }

        ManagementAgentAggregationDimensions other = (ManagementAgentAggregationDimensions) o;
        return java.util.Objects.equals(this.availabilityStatus, other.availabilityStatus)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.hasPlugins, other.hasPlugins)
                && java.util.Objects.equals(this.installType, other.installType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityStatus == null
                                ? 43
                                : this.availabilityStatus.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.hasPlugins == null ? 43 : this.hasPlugins.hashCode());
        result = (result * PRIME) + (this.installType == null ? 43 : this.installType.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
