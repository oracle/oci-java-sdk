/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Details about management station actions.
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
    builder = WorkRequestManagementStationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestManagementStationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"managementStationVersion", "config", "softwareSourceIds"})
    public WorkRequestManagementStationDetails(
            String managementStationVersion,
            byte[] config,
            java.util.List<String> softwareSourceIds) {
        super();
        this.managementStationVersion = managementStationVersion;
        this.config = config;
        this.softwareSourceIds = softwareSourceIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Target version to update the management station software.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementStationVersion")
        private String managementStationVersion;

        /**
         * Target version to update the management station software.
         * @param managementStationVersion the value to set
         * @return this builder
         **/
        public Builder managementStationVersion(String managementStationVersion) {
            this.managementStationVersion = managementStationVersion;
            this.__explicitlySet__.add("managementStationVersion");
            return this;
        }
        /**
         * The configuration of the management station.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private byte[] config;

        /**
         * The configuration of the management station.
         * @param config the value to set
         * @return this builder
         **/
        public Builder config(byte[] config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }
        /**
         * Optional list for mirrors to sync.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
        private java.util.List<String> softwareSourceIds;

        /**
         * Optional list for mirrors to sync.
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

        public WorkRequestManagementStationDetails build() {
            WorkRequestManagementStationDetails model =
                    new WorkRequestManagementStationDetails(
                            this.managementStationVersion, this.config, this.softwareSourceIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestManagementStationDetails model) {
            if (model.wasPropertyExplicitlySet("managementStationVersion")) {
                this.managementStationVersion(model.getManagementStationVersion());
            }
            if (model.wasPropertyExplicitlySet("config")) {
                this.config(model.getConfig());
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
     * Target version to update the management station software.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementStationVersion")
    private final String managementStationVersion;

    /**
     * Target version to update the management station software.
     * @return the value
     **/
    public String getManagementStationVersion() {
        return managementStationVersion;
    }

    /**
     * The configuration of the management station.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final byte[] config;

    /**
     * The configuration of the management station.
     * @return the value
     **/
    public byte[] getConfig() {
        return config;
    }

    /**
     * Optional list for mirrors to sync.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
    private final java.util.List<String> softwareSourceIds;

    /**
     * Optional list for mirrors to sync.
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
        sb.append("WorkRequestManagementStationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("managementStationVersion=")
                .append(String.valueOf(this.managementStationVersion));
        sb.append(", config=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.config)
                                : (String.valueOf(this.config)
                                        + (this.config != null
                                                ? " (byte[" + this.config.length + "])"
                                                : ""))));
        sb.append(", softwareSourceIds=").append(String.valueOf(this.softwareSourceIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestManagementStationDetails)) {
            return false;
        }

        WorkRequestManagementStationDetails other = (WorkRequestManagementStationDetails) o;
        return java.util.Objects.equals(
                        this.managementStationVersion, other.managementStationVersion)
                && java.util.Arrays.equals(this.config, other.config)
                && java.util.Objects.equals(this.softwareSourceIds, other.softwareSourceIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managementStationVersion == null
                                ? 43
                                : this.managementStationVersion.hashCode());
        result = (result * PRIME) + java.util.Arrays.hashCode(this.config);
        result =
                (result * PRIME)
                        + (this.softwareSourceIds == null ? 43 : this.softwareSourceIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
