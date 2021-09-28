/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The summary of user grants.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GrantSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class GrantSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("grantName")
        private String grantName;

        public Builder grantName(String grantName) {
            this.grantName = grantName;
            this.__explicitlySet__.add("grantName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privilegeType")
        private PrivilegeType privilegeType;

        public Builder privilegeType(PrivilegeType privilegeType) {
            this.privilegeType = privilegeType;
            this.__explicitlySet__.add("privilegeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privilegeCategory")
        private PrivilegeCategory privilegeCategory;

        public Builder privilegeCategory(PrivilegeCategory privilegeCategory) {
            this.privilegeCategory = privilegeCategory;
            this.__explicitlySet__.add("privilegeCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("depthLevel")
        private Integer depthLevel;

        public Builder depthLevel(Integer depthLevel) {
            this.depthLevel = depthLevel;
            this.__explicitlySet__.add("depthLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GrantSummary build() {
            GrantSummary __instance__ =
                    new GrantSummary(key, grantName, privilegeType, privilegeCategory, depthLevel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GrantSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .grantName(o.getGrantName())
                            .privilegeType(o.getPrivilegeType())
                            .privilegeCategory(o.getPrivilegeCategory())
                            .depthLevel(o.getDepthLevel());

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
     * The unique key of a user grant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The name of a user grant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("grantName")
    String grantName;
    /**
     * The type of a user grant.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PrivilegeType {
        SystemPrivilege("SYSTEM_PRIVILEGE"),
        ObjectPrivilege("OBJECT_PRIVILEGE"),
        AdminPrivilege("ADMIN_PRIVILEGE"),
        Role("ROLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PrivilegeType> map;

        static {
            map = new java.util.HashMap<>();
            for (PrivilegeType v : PrivilegeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PrivilegeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PrivilegeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PrivilegeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of a user grant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privilegeType")
    PrivilegeType privilegeType;
    /**
     * The privilege category.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PrivilegeCategory {
        Critical("CRITICAL"),
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PrivilegeCategory> map;

        static {
            map = new java.util.HashMap<>();
            for (PrivilegeCategory v : PrivilegeCategory.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PrivilegeCategory(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PrivilegeCategory create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PrivilegeCategory', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The privilege category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privilegeCategory")
    PrivilegeCategory privilegeCategory;

    /**
     * The grant depth level of the indirect grant.
     * An indirectly granted role/privilege is granted to the user through another role.
     * The depth level indicates how deep a privilege is within the grant hierarchy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("depthLevel")
    Integer depthLevel;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
