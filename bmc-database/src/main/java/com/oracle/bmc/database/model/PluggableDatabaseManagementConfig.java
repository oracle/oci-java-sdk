/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration of the Pluggable Database Management service.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PluggableDatabaseManagementConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PluggableDatabaseManagementConfig
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"managementStatus"})
    public PluggableDatabaseManagementConfig(ManagementStatus managementStatus) {
        super();
        this.managementStatus = managementStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The status of the Pluggable Database Management service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementStatus")
        private ManagementStatus managementStatus;

        /**
         * The status of the Pluggable Database Management service.
         * @param managementStatus the value to set
         * @return this builder
         **/
        public Builder managementStatus(ManagementStatus managementStatus) {
            this.managementStatus = managementStatus;
            this.__explicitlySet__.add("managementStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PluggableDatabaseManagementConfig build() {
            PluggableDatabaseManagementConfig model =
                    new PluggableDatabaseManagementConfig(this.managementStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PluggableDatabaseManagementConfig model) {
            if (model.wasPropertyExplicitlySet("managementStatus")) {
                this.managementStatus(model.getManagementStatus());
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
     * The status of the Pluggable Database Management service.
     **/
    public enum ManagementStatus {
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        Disabled("DISABLED"),
        Updating("UPDATING"),
        FailedEnabling("FAILED_ENABLING"),
        FailedDisabling("FAILED_DISABLING"),
        FailedUpdating("FAILED_UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ManagementStatus.class);

        private final String value;
        private static java.util.Map<String, ManagementStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagementStatus v : ManagementStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagementStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagementStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagementStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the Pluggable Database Management service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementStatus")
    private final ManagementStatus managementStatus;

    /**
     * The status of the Pluggable Database Management service.
     * @return the value
     **/
    public ManagementStatus getManagementStatus() {
        return managementStatus;
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
        sb.append("PluggableDatabaseManagementConfig(");
        sb.append("super=").append(super.toString());
        sb.append("managementStatus=").append(String.valueOf(this.managementStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluggableDatabaseManagementConfig)) {
            return false;
        }

        PluggableDatabaseManagementConfig other = (PluggableDatabaseManagementConfig) o;
        return java.util.Objects.equals(this.managementStatus, other.managementStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managementStatus == null ? 43 : this.managementStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
