/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of consumer group privileges.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConsumerGroupPrivilegeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConsumerGroupPrivilegeSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "grantOption", "initialGroup"})
    public ConsumerGroupPrivilegeSummary(
            String name, GrantOption grantOption, InitialGroup initialGroup) {
        super();
        this.name = name;
        this.grantOption = grantOption;
        this.initialGroup = initialGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the granted consumer group privilege.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the granted consumer group privilege.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Indicates whether the privilege is granted with the GRANT option (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("grantOption")
        private GrantOption grantOption;

        /**
         * Indicates whether the privilege is granted with the GRANT option (YES) or not (NO).
         * @param grantOption the value to set
         * @return this builder
         **/
        public Builder grantOption(GrantOption grantOption) {
            this.grantOption = grantOption;
            this.__explicitlySet__.add("grantOption");
            return this;
        }
        /**
         * Indicates whether the consumer group is designated as the default for this user or role (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialGroup")
        private InitialGroup initialGroup;

        /**
         * Indicates whether the consumer group is designated as the default for this user or role (YES) or not (NO).
         * @param initialGroup the value to set
         * @return this builder
         **/
        public Builder initialGroup(InitialGroup initialGroup) {
            this.initialGroup = initialGroup;
            this.__explicitlySet__.add("initialGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConsumerGroupPrivilegeSummary build() {
            ConsumerGroupPrivilegeSummary model =
                    new ConsumerGroupPrivilegeSummary(
                            this.name, this.grantOption, this.initialGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConsumerGroupPrivilegeSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("grantOption")) {
                this.grantOption(model.getGrantOption());
            }
            if (model.wasPropertyExplicitlySet("initialGroup")) {
                this.initialGroup(model.getInitialGroup());
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
     * The name of the granted consumer group privilege.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the granted consumer group privilege.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Indicates whether the privilege is granted with the GRANT option (YES) or not (NO).
     **/
    public enum GrantOption {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GrantOption.class);

        private final String value;
        private static java.util.Map<String, GrantOption> map;

        static {
            map = new java.util.HashMap<>();
            for (GrantOption v : GrantOption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GrantOption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GrantOption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GrantOption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the privilege is granted with the GRANT option (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("grantOption")
    private final GrantOption grantOption;

    /**
     * Indicates whether the privilege is granted with the GRANT option (YES) or not (NO).
     * @return the value
     **/
    public GrantOption getGrantOption() {
        return grantOption;
    }

    /**
     * Indicates whether the consumer group is designated as the default for this user or role (YES) or not (NO).
     **/
    public enum InitialGroup {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InitialGroup.class);

        private final String value;
        private static java.util.Map<String, InitialGroup> map;

        static {
            map = new java.util.HashMap<>();
            for (InitialGroup v : InitialGroup.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InitialGroup(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InitialGroup create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InitialGroup', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the consumer group is designated as the default for this user or role (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialGroup")
    private final InitialGroup initialGroup;

    /**
     * Indicates whether the consumer group is designated as the default for this user or role (YES) or not (NO).
     * @return the value
     **/
    public InitialGroup getInitialGroup() {
        return initialGroup;
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
        sb.append("ConsumerGroupPrivilegeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", grantOption=").append(String.valueOf(this.grantOption));
        sb.append(", initialGroup=").append(String.valueOf(this.initialGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConsumerGroupPrivilegeSummary)) {
            return false;
        }

        ConsumerGroupPrivilegeSummary other = (ConsumerGroupPrivilegeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.grantOption, other.grantOption)
                && java.util.Objects.equals(this.initialGroup, other.initialGroup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.grantOption == null ? 43 : this.grantOption.hashCode());
        result = (result * PRIME) + (this.initialGroup == null ? 43 : this.initialGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
