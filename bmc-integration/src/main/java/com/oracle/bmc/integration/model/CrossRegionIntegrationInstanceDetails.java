/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Details of integration instance created in cross region for disaster recovery. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CrossRegionIntegrationInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CrossRegionIntegrationInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"role", "id", "region", "timeRoleChanged"})
    public CrossRegionIntegrationInstanceDetails(
            Role role, String id, String region, java.util.Date timeRoleChanged) {
        super();
        this.role = role;
        this.id = id;
        this.region = region;
        this.timeRoleChanged = timeRoleChanged;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Role of the integration instance in the region */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * Role of the integration instance in the region
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /** Cross region integration instance identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Cross region integration instance identifier
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Cross region where integration instance is created */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Cross region where integration instance is created
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** Time when cross region integration instance role was changed */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRoleChanged")
        private java.util.Date timeRoleChanged;

        /**
         * Time when cross region integration instance role was changed
         *
         * @param timeRoleChanged the value to set
         * @return this builder
         */
        public Builder timeRoleChanged(java.util.Date timeRoleChanged) {
            this.timeRoleChanged = timeRoleChanged;
            this.__explicitlySet__.add("timeRoleChanged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossRegionIntegrationInstanceDetails build() {
            CrossRegionIntegrationInstanceDetails model =
                    new CrossRegionIntegrationInstanceDetails(
                            this.role, this.id, this.region, this.timeRoleChanged);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossRegionIntegrationInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("timeRoleChanged")) {
                this.timeRoleChanged(model.getTimeRoleChanged());
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

    /** Role of the integration instance in the region */
    public enum Role implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Secondary("SECONDARY"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Role.class);

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Role(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Role create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Role', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** Role of the integration instance in the region */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * Role of the integration instance in the region
     *
     * @return the value
     */
    public Role getRole() {
        return role;
    }

    /** Cross region integration instance identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Cross region integration instance identifier
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Cross region where integration instance is created */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Cross region where integration instance is created
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** Time when cross region integration instance role was changed */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRoleChanged")
    private final java.util.Date timeRoleChanged;

    /**
     * Time when cross region integration instance role was changed
     *
     * @return the value
     */
    public java.util.Date getTimeRoleChanged() {
        return timeRoleChanged;
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
        sb.append("CrossRegionIntegrationInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("role=").append(String.valueOf(this.role));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", timeRoleChanged=").append(String.valueOf(this.timeRoleChanged));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrossRegionIntegrationInstanceDetails)) {
            return false;
        }

        CrossRegionIntegrationInstanceDetails other = (CrossRegionIntegrationInstanceDetails) o;
        return java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.timeRoleChanged, other.timeRoleChanged)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRoleChanged == null ? 43 : this.timeRoleChanged.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
