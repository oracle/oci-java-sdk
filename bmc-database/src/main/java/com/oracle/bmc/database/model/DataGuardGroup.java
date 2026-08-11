/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of Data Guard setup that the given database is part of.
 * Also includes information about databases part of this Data Guard group and properties for their Data Guard configuration.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataGuardGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataGuardGroup extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"members", "protectionMode", "managedAutoFailOverReadiness"})
    public DataGuardGroup(
            java.util.List<DataGuardGroupMember> members,
            ProtectionMode protectionMode,
            ManagedAutoFailOverReadiness managedAutoFailOverReadiness) {
        super();
        this.members = members;
        this.protectionMode = protectionMode;
        this.managedAutoFailOverReadiness = managedAutoFailOverReadiness;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of Data Guard members, representing each database that is part of Data Guard.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("members")
        private java.util.List<DataGuardGroupMember> members;

        /**
         * List of Data Guard members, representing each database that is part of Data Guard.
         * @param members the value to set
         * @return this builder
         **/
        public Builder members(java.util.List<DataGuardGroupMember> members) {
            this.members = members;
            this.__explicitlySet__.add("members");
            return this;
        }
        /**
         * The protection mode of this Data Guard. For more information, see
         * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        /**
         * The protection mode of this Data Guard. For more information, see
         * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         *
         * @param protectionMode the value to set
         * @return this builder
         **/
        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /**
         * Specifies readiness of Managed Automatic failover.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedAutoFailOverReadiness")
        private ManagedAutoFailOverReadiness managedAutoFailOverReadiness;

        /**
         * Specifies readiness of Managed Automatic failover.
         * @param managedAutoFailOverReadiness the value to set
         * @return this builder
         **/
        public Builder managedAutoFailOverReadiness(
                ManagedAutoFailOverReadiness managedAutoFailOverReadiness) {
            this.managedAutoFailOverReadiness = managedAutoFailOverReadiness;
            this.__explicitlySet__.add("managedAutoFailOverReadiness");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataGuardGroup build() {
            DataGuardGroup model =
                    new DataGuardGroup(
                            this.members, this.protectionMode, this.managedAutoFailOverReadiness);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataGuardGroup model) {
            if (model.wasPropertyExplicitlySet("members")) {
                this.members(model.getMembers());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("managedAutoFailOverReadiness")) {
                this.managedAutoFailOverReadiness(model.getManagedAutoFailOverReadiness());
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
     * List of Data Guard members, representing each database that is part of Data Guard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("members")
    private final java.util.List<DataGuardGroupMember> members;

    /**
     * List of Data Guard members, representing each database that is part of Data Guard.
     * @return the value
     **/
    public java.util.List<DataGuardGroupMember> getMembers() {
        return members;
    }

    /**
     * The protection mode of this Data Guard. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    public enum ProtectionMode {
        MaximumAvailability("MAXIMUM_AVAILABILITY"),
        MaximumPerformance("MAXIMUM_PERFORMANCE"),
        MaximumProtection("MAXIMUM_PROTECTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ProtectionMode.class);

        private final String value;
        private static java.util.Map<String, ProtectionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ProtectionMode v : ProtectionMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ProtectionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProtectionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ProtectionMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The protection mode of this Data Guard. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode of this Data Guard. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     **/
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /**
     * Specifies readiness of Managed Automatic failover.
     **/
    public enum ManagedAutoFailOverReadiness {
        Healthy("HEALTHY"),
        Critical("CRITICAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ManagedAutoFailOverReadiness.class);

        private final String value;
        private static java.util.Map<String, ManagedAutoFailOverReadiness> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagedAutoFailOverReadiness v : ManagedAutoFailOverReadiness.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagedAutoFailOverReadiness(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagedAutoFailOverReadiness create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagedAutoFailOverReadiness', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies readiness of Managed Automatic failover.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedAutoFailOverReadiness")
    private final ManagedAutoFailOverReadiness managedAutoFailOverReadiness;

    /**
     * Specifies readiness of Managed Automatic failover.
     * @return the value
     **/
    public ManagedAutoFailOverReadiness getManagedAutoFailOverReadiness() {
        return managedAutoFailOverReadiness;
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
        sb.append("DataGuardGroup(");
        sb.append("super=").append(super.toString());
        sb.append("members=").append(String.valueOf(this.members));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", managedAutoFailOverReadiness=")
                .append(String.valueOf(this.managedAutoFailOverReadiness));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataGuardGroup)) {
            return false;
        }

        DataGuardGroup other = (DataGuardGroup) o;
        return java.util.Objects.equals(this.members, other.members)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(
                        this.managedAutoFailOverReadiness, other.managedAutoFailOverReadiness)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.members == null ? 43 : this.members.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.managedAutoFailOverReadiness == null
                                ? 43
                                : this.managedAutoFailOverReadiness.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
