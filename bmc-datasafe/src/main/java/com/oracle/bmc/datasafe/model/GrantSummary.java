/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The summary of user grants. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GrantSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GrantSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "grantName",
        "privilegeType",
        "privilegeCategory",
        "depthLevel"
    })
    public GrantSummary(
            String key,
            String grantName,
            PrivilegeType privilegeType,
            PrivilegeCategory privilegeCategory,
            Integer depthLevel) {
        super();
        this.key = key;
        this.grantName = grantName;
        this.privilegeType = privilegeType;
        this.privilegeCategory = privilegeCategory;
        this.depthLevel = depthLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique key of a user grant. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key of a user grant.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The name of a user grant. */
        @com.fasterxml.jackson.annotation.JsonProperty("grantName")
        private String grantName;

        /**
         * The name of a user grant.
         *
         * @param grantName the value to set
         * @return this builder
         */
        public Builder grantName(String grantName) {
            this.grantName = grantName;
            this.__explicitlySet__.add("grantName");
            return this;
        }
        /** The type of a user grant. */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegeType")
        private PrivilegeType privilegeType;

        /**
         * The type of a user grant.
         *
         * @param privilegeType the value to set
         * @return this builder
         */
        public Builder privilegeType(PrivilegeType privilegeType) {
            this.privilegeType = privilegeType;
            this.__explicitlySet__.add("privilegeType");
            return this;
        }
        /** The privilege category. */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegeCategory")
        private PrivilegeCategory privilegeCategory;

        /**
         * The privilege category.
         *
         * @param privilegeCategory the value to set
         * @return this builder
         */
        public Builder privilegeCategory(PrivilegeCategory privilegeCategory) {
            this.privilegeCategory = privilegeCategory;
            this.__explicitlySet__.add("privilegeCategory");
            return this;
        }
        /**
         * The grant depth level of the indirect grant. An indirectly granted role/privilege is
         * granted to the user through another role. The depth level indicates how deep a privilege
         * is within the grant hierarchy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("depthLevel")
        private Integer depthLevel;

        /**
         * The grant depth level of the indirect grant. An indirectly granted role/privilege is
         * granted to the user through another role. The depth level indicates how deep a privilege
         * is within the grant hierarchy.
         *
         * @param depthLevel the value to set
         * @return this builder
         */
        public Builder depthLevel(Integer depthLevel) {
            this.depthLevel = depthLevel;
            this.__explicitlySet__.add("depthLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GrantSummary build() {
            GrantSummary model =
                    new GrantSummary(
                            this.key,
                            this.grantName,
                            this.privilegeType,
                            this.privilegeCategory,
                            this.depthLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GrantSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("grantName")) {
                this.grantName(model.getGrantName());
            }
            if (model.wasPropertyExplicitlySet("privilegeType")) {
                this.privilegeType(model.getPrivilegeType());
            }
            if (model.wasPropertyExplicitlySet("privilegeCategory")) {
                this.privilegeCategory(model.getPrivilegeCategory());
            }
            if (model.wasPropertyExplicitlySet("depthLevel")) {
                this.depthLevel(model.getDepthLevel());
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

    /** The unique key of a user grant. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key of a user grant.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The name of a user grant. */
    @com.fasterxml.jackson.annotation.JsonProperty("grantName")
    private final String grantName;

    /**
     * The name of a user grant.
     *
     * @return the value
     */
    public String getGrantName() {
        return grantName;
    }

    /** The type of a user grant. */
    public enum PrivilegeType implements com.oracle.bmc.http.internal.BmcEnum {
        SystemPrivilege("SYSTEM_PRIVILEGE"),
        ObjectPrivilege("OBJECT_PRIVILEGE"),
        AdminPrivilege("ADMIN_PRIVILEGE"),
        Role("ROLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PrivilegeType.class);

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
    /** The type of a user grant. */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegeType")
    private final PrivilegeType privilegeType;

    /**
     * The type of a user grant.
     *
     * @return the value
     */
    public PrivilegeType getPrivilegeType() {
        return privilegeType;
    }

    /** The privilege category. */
    public enum PrivilegeCategory implements com.oracle.bmc.http.internal.BmcEnum {
        Critical("CRITICAL"),
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PrivilegeCategory.class);

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
    /** The privilege category. */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegeCategory")
    private final PrivilegeCategory privilegeCategory;

    /**
     * The privilege category.
     *
     * @return the value
     */
    public PrivilegeCategory getPrivilegeCategory() {
        return privilegeCategory;
    }

    /**
     * The grant depth level of the indirect grant. An indirectly granted role/privilege is granted
     * to the user through another role. The depth level indicates how deep a privilege is within
     * the grant hierarchy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("depthLevel")
    private final Integer depthLevel;

    /**
     * The grant depth level of the indirect grant. An indirectly granted role/privilege is granted
     * to the user through another role. The depth level indicates how deep a privilege is within
     * the grant hierarchy.
     *
     * @return the value
     */
    public Integer getDepthLevel() {
        return depthLevel;
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
        sb.append("GrantSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", grantName=").append(String.valueOf(this.grantName));
        sb.append(", privilegeType=").append(String.valueOf(this.privilegeType));
        sb.append(", privilegeCategory=").append(String.valueOf(this.privilegeCategory));
        sb.append(", depthLevel=").append(String.valueOf(this.depthLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GrantSummary)) {
            return false;
        }

        GrantSummary other = (GrantSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.grantName, other.grantName)
                && java.util.Objects.equals(this.privilegeType, other.privilegeType)
                && java.util.Objects.equals(this.privilegeCategory, other.privilegeCategory)
                && java.util.Objects.equals(this.depthLevel, other.depthLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.grantName == null ? 43 : this.grantName.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegeType == null ? 43 : this.privilegeType.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegeCategory == null ? 43 : this.privilegeCategory.hashCode());
        result = (result * PRIME) + (this.depthLevel == null ? 43 : this.depthLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
