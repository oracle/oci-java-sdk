/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A Summary of system privileges. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SystemPrivilegeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SystemPrivilegeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "adminOption", "common", "inherited"})
    public SystemPrivilegeSummary(
            String name, AdminOption adminOption, Common common, Inherited inherited) {
        super();
        this.name = name;
        this.adminOption = adminOption;
        this.common = common;
        this.inherited = inherited;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of a system privilege. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of a system privilege.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Indicates whether the system privilege is granted with the ADMIN option (YES) or not
         * (NO).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminOption")
        private AdminOption adminOption;

        /**
         * Indicates whether the system privilege is granted with the ADMIN option (YES) or not
         * (NO).
         *
         * @param adminOption the value to set
         * @return this builder
         */
        public Builder adminOption(AdminOption adminOption) {
            this.adminOption = adminOption;
            this.__explicitlySet__.add("adminOption");
            return this;
        }
        /**
         * Indicates how the system privilege was granted. Possible values: YES if the system
         * privilege is granted commonly (CONTAINER=ALL is used) NO if the system privilege is
         * granted locally (CONTAINER=ALL is not used)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("common")
        private Common common;

        /**
         * Indicates how the system privilege was granted. Possible values: YES if the system
         * privilege is granted commonly (CONTAINER=ALL is used) NO if the system privilege is
         * granted locally (CONTAINER=ALL is not used)
         *
         * @param common the value to set
         * @return this builder
         */
        public Builder common(Common common) {
            this.common = common;
            this.__explicitlySet__.add("common");
            return this;
        }
        /**
         * Indicates whether the granted system privilege is inherited from another container (YES)
         * or not (NO).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inherited")
        private Inherited inherited;

        /**
         * Indicates whether the granted system privilege is inherited from another container (YES)
         * or not (NO).
         *
         * @param inherited the value to set
         * @return this builder
         */
        public Builder inherited(Inherited inherited) {
            this.inherited = inherited;
            this.__explicitlySet__.add("inherited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SystemPrivilegeSummary build() {
            SystemPrivilegeSummary model =
                    new SystemPrivilegeSummary(
                            this.name, this.adminOption, this.common, this.inherited);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SystemPrivilegeSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("adminOption")) {
                this.adminOption(model.getAdminOption());
            }
            if (model.wasPropertyExplicitlySet("common")) {
                this.common(model.getCommon());
            }
            if (model.wasPropertyExplicitlySet("inherited")) {
                this.inherited(model.getInherited());
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

    /** The name of a system privilege. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of a system privilege.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Indicates whether the system privilege is granted with the ADMIN option (YES) or not (NO).
     */
    public enum AdminOption implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AdminOption.class);

        private final String value;
        private static java.util.Map<String, AdminOption> map;

        static {
            map = new java.util.HashMap<>();
            for (AdminOption v : AdminOption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AdminOption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AdminOption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AdminOption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the system privilege is granted with the ADMIN option (YES) or not (NO).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminOption")
    private final AdminOption adminOption;

    /**
     * Indicates whether the system privilege is granted with the ADMIN option (YES) or not (NO).
     *
     * @return the value
     */
    public AdminOption getAdminOption() {
        return adminOption;
    }

    /**
     * Indicates how the system privilege was granted. Possible values: YES if the system privilege
     * is granted commonly (CONTAINER=ALL is used) NO if the system privilege is granted locally
     * (CONTAINER=ALL is not used)
     */
    public enum Common implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Common.class);

        private final String value;
        private static java.util.Map<String, Common> map;

        static {
            map = new java.util.HashMap<>();
            for (Common v : Common.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Common(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Common create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Common', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates how the system privilege was granted. Possible values: YES if the system privilege
     * is granted commonly (CONTAINER=ALL is used) NO if the system privilege is granted locally
     * (CONTAINER=ALL is not used)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("common")
    private final Common common;

    /**
     * Indicates how the system privilege was granted. Possible values: YES if the system privilege
     * is granted commonly (CONTAINER=ALL is used) NO if the system privilege is granted locally
     * (CONTAINER=ALL is not used)
     *
     * @return the value
     */
    public Common getCommon() {
        return common;
    }

    /**
     * Indicates whether the granted system privilege is inherited from another container (YES) or
     * not (NO).
     */
    public enum Inherited implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Inherited.class);

        private final String value;
        private static java.util.Map<String, Inherited> map;

        static {
            map = new java.util.HashMap<>();
            for (Inherited v : Inherited.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Inherited(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Inherited create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Inherited', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the granted system privilege is inherited from another container (YES) or
     * not (NO).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inherited")
    private final Inherited inherited;

    /**
     * Indicates whether the granted system privilege is inherited from another container (YES) or
     * not (NO).
     *
     * @return the value
     */
    public Inherited getInherited() {
        return inherited;
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
        sb.append("SystemPrivilegeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", adminOption=").append(String.valueOf(this.adminOption));
        sb.append(", common=").append(String.valueOf(this.common));
        sb.append(", inherited=").append(String.valueOf(this.inherited));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SystemPrivilegeSummary)) {
            return false;
        }

        SystemPrivilegeSummary other = (SystemPrivilegeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.adminOption, other.adminOption)
                && java.util.Objects.equals(this.common, other.common)
                && java.util.Objects.equals(this.inherited, other.inherited)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.adminOption == null ? 43 : this.adminOption.hashCode());
        result = (result * PRIME) + (this.common == null ? 43 : this.common.hashCode());
        result = (result * PRIME) + (this.inherited == null ? 43 : this.inherited.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
