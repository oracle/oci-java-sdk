/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of each role.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RoleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RoleSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "adminOption",
        "delegateOption",
        "defaultRole",
        "common",
        "inherited"
    })
    public RoleSummary(
            String name,
            AdminOption adminOption,
            DelegateOption delegateOption,
            DefaultRole defaultRole,
            Common common,
            Inherited inherited) {
        super();
        this.name = name;
        this.adminOption = adminOption;
        this.delegateOption = delegateOption;
        this.defaultRole = defaultRole;
        this.common = common;
        this.inherited = inherited;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the role granted to the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the role granted to the user.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Indicates whether the role is granted with the ADMIN OPTION (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminOption")
        private AdminOption adminOption;

        /**
         * Indicates whether the role is granted with the ADMIN OPTION (YES) or not (NO).
         * @param adminOption the value to set
         * @return this builder
         **/
        public Builder adminOption(AdminOption adminOption) {
            this.adminOption = adminOption;
            this.__explicitlySet__.add("adminOption");
            return this;
        }
        /**
         * Indicates whether the role is granted with the DELEGATE OPTION (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("delegateOption")
        private DelegateOption delegateOption;

        /**
         * Indicates whether the role is granted with the DELEGATE OPTION (YES) or not (NO).
         * @param delegateOption the value to set
         * @return this builder
         **/
        public Builder delegateOption(DelegateOption delegateOption) {
            this.delegateOption = delegateOption;
            this.__explicitlySet__.add("delegateOption");
            return this;
        }
        /**
         * Indicates whether the role is designated as a DEFAULT ROLE for the user (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultRole")
        private DefaultRole defaultRole;

        /**
         * Indicates whether the role is designated as a DEFAULT ROLE for the user (YES) or not (NO).
         * @param defaultRole the value to set
         * @return this builder
         **/
        public Builder defaultRole(DefaultRole defaultRole) {
            this.defaultRole = defaultRole;
            this.__explicitlySet__.add("defaultRole");
            return this;
        }
        /**
         * Indicates how the role was granted. Possible values:
         * YES if the role is granted commonly (CONTAINER=ALL is used)
         * NO if the role is granted locally (CONTAINER=ALL is not used)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("common")
        private Common common;

        /**
         * Indicates how the role was granted. Possible values:
         * YES if the role is granted commonly (CONTAINER=ALL is used)
         * NO if the role is granted locally (CONTAINER=ALL is not used)
         *
         * @param common the value to set
         * @return this builder
         **/
        public Builder common(Common common) {
            this.common = common;
            this.__explicitlySet__.add("common");
            return this;
        }
        /**
         * Indicates whether the granted role is inherited from another container (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inherited")
        private Inherited inherited;

        /**
         * Indicates whether the granted role is inherited from another container (YES) or not (NO).
         * @param inherited the value to set
         * @return this builder
         **/
        public Builder inherited(Inherited inherited) {
            this.inherited = inherited;
            this.__explicitlySet__.add("inherited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoleSummary build() {
            RoleSummary __instance__ =
                    new RoleSummary(
                            name, adminOption, delegateOption, defaultRole, common, inherited);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoleSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .adminOption(o.getAdminOption())
                            .delegateOption(o.getDelegateOption())
                            .defaultRole(o.getDefaultRole())
                            .common(o.getCommon())
                            .inherited(o.getInherited());

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
     * The name of the role granted to the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the role granted to the user.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Indicates whether the role is granted with the ADMIN OPTION (YES) or not (NO).
     **/
    public enum AdminOption {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Indicates whether the role is granted with the ADMIN OPTION (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminOption")
    private final AdminOption adminOption;

    /**
     * Indicates whether the role is granted with the ADMIN OPTION (YES) or not (NO).
     * @return the value
     **/
    public AdminOption getAdminOption() {
        return adminOption;
    }

    /**
     * Indicates whether the role is granted with the DELEGATE OPTION (YES) or not (NO).
     **/
    public enum DelegateOption {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DelegateOption.class);

        private final String value;
        private static java.util.Map<String, DelegateOption> map;

        static {
            map = new java.util.HashMap<>();
            for (DelegateOption v : DelegateOption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DelegateOption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DelegateOption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DelegateOption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the role is granted with the DELEGATE OPTION (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("delegateOption")
    private final DelegateOption delegateOption;

    /**
     * Indicates whether the role is granted with the DELEGATE OPTION (YES) or not (NO).
     * @return the value
     **/
    public DelegateOption getDelegateOption() {
        return delegateOption;
    }

    /**
     * Indicates whether the role is designated as a DEFAULT ROLE for the user (YES) or not (NO).
     **/
    public enum DefaultRole {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultRole.class);

        private final String value;
        private static java.util.Map<String, DefaultRole> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultRole v : DefaultRole.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultRole(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultRole create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultRole', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the role is designated as a DEFAULT ROLE for the user (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultRole")
    private final DefaultRole defaultRole;

    /**
     * Indicates whether the role is designated as a DEFAULT ROLE for the user (YES) or not (NO).
     * @return the value
     **/
    public DefaultRole getDefaultRole() {
        return defaultRole;
    }

    /**
     * Indicates how the role was granted. Possible values:
     * YES if the role is granted commonly (CONTAINER=ALL is used)
     * NO if the role is granted locally (CONTAINER=ALL is not used)
     *
     **/
    public enum Common {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Indicates how the role was granted. Possible values:
     * YES if the role is granted commonly (CONTAINER=ALL is used)
     * NO if the role is granted locally (CONTAINER=ALL is not used)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("common")
    private final Common common;

    /**
     * Indicates how the role was granted. Possible values:
     * YES if the role is granted commonly (CONTAINER=ALL is used)
     * NO if the role is granted locally (CONTAINER=ALL is not used)
     *
     * @return the value
     **/
    public Common getCommon() {
        return common;
    }

    /**
     * Indicates whether the granted role is inherited from another container (YES) or not (NO).
     **/
    public enum Inherited {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Indicates whether the granted role is inherited from another container (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inherited")
    private final Inherited inherited;

    /**
     * Indicates whether the granted role is inherited from another container (YES) or not (NO).
     * @return the value
     **/
    public Inherited getInherited() {
        return inherited;
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
        sb.append("RoleSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", adminOption=").append(String.valueOf(this.adminOption));
        sb.append(", delegateOption=").append(String.valueOf(this.delegateOption));
        sb.append(", defaultRole=").append(String.valueOf(this.defaultRole));
        sb.append(", common=").append(String.valueOf(this.common));
        sb.append(", inherited=").append(String.valueOf(this.inherited));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoleSummary)) {
            return false;
        }

        RoleSummary other = (RoleSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.adminOption, other.adminOption)
                && java.util.Objects.equals(this.delegateOption, other.delegateOption)
                && java.util.Objects.equals(this.defaultRole, other.defaultRole)
                && java.util.Objects.equals(this.common, other.common)
                && java.util.Objects.equals(this.inherited, other.inherited)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.adminOption == null ? 43 : this.adminOption.hashCode());
        result =
                (result * PRIME)
                        + (this.delegateOption == null ? 43 : this.delegateOption.hashCode());
        result = (result * PRIME) + (this.defaultRole == null ? 43 : this.defaultRole.hashCode());
        result = (result * PRIME) + (this.common == null ? 43 : this.common.hashCode());
        result = (result * PRIME) + (this.inherited == null ? 43 : this.inherited.hashCode());
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
