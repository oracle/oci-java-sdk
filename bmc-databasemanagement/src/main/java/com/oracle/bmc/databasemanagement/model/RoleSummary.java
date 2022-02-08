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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RoleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RoleSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminOption")
        private AdminOption adminOption;

        public Builder adminOption(AdminOption adminOption) {
            this.adminOption = adminOption;
            this.__explicitlySet__.add("adminOption");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("delegateOption")
        private DelegateOption delegateOption;

        public Builder delegateOption(DelegateOption delegateOption) {
            this.delegateOption = delegateOption;
            this.__explicitlySet__.add("delegateOption");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultRole")
        private DefaultRole defaultRole;

        public Builder defaultRole(DefaultRole defaultRole) {
            this.defaultRole = defaultRole;
            this.__explicitlySet__.add("defaultRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("common")
        private Common common;

        public Builder common(Common common) {
            this.common = common;
            this.__explicitlySet__.add("common");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inherited")
        private Inherited inherited;

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

    /**
     * The name of the role granted to the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * Indicates whether the role is granted with the ADMIN OPTION (YES) or not (NO).
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AdminOption {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    AdminOption adminOption;
    /**
     * Indicates whether the role is granted with the DELEGATE OPTION (YES) or not (NO).
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DelegateOption {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    DelegateOption delegateOption;
    /**
     * Indicates whether the role is designated as a DEFAULT ROLE for the user (YES) or not (NO).
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DefaultRole {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    DefaultRole defaultRole;
    /**
     * Indicates how the role was granted. Possible values:
     * YES if the role is granted commonly (CONTAINER=ALL is used)
     * NO if the role is granted locally (CONTAINER=ALL is not used)
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Common {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    Common common;
    /**
     * Indicates whether the granted role is inherited from another container (YES) or not (NO).
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Inherited {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    Inherited inherited;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
