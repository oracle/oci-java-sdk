/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * configuration item for multi list data type
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ConfigValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConfigValue {
    @Deprecated
    @java.beans.ConstructorProperties({"listType", "managedListType", "value"})
    public ConfigValue(ConfigurationListItemType listType, String managedListType, String value) {
        super();
        this.listType = listType;
        this.managedListType = managedListType;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * configuration list item type, either CUSTOM or MANAGED
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listType")
        private ConfigurationListItemType listType;

        /**
         * configuration list item type, either CUSTOM or MANAGED
         * @param listType the value to set
         * @return this builder
         **/
        public Builder listType(ConfigurationListItemType listType) {
            this.listType = listType;
            this.__explicitlySet__.add("listType");
            return this;
        }
        /**
         * type of the managed list
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedListType")
        private String managedListType;

        /**
         * type of the managed list
         * @param managedListType the value to set
         * @return this builder
         **/
        public Builder managedListType(String managedListType) {
            this.managedListType = managedListType;
            this.__explicitlySet__.add("managedListType");
            return this;
        }
        /**
         * configuration value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * configuration value
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigValue build() {
            ConfigValue __instance__ = new ConfigValue(listType, managedListType, value);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigValue o) {
            Builder copiedBuilder =
                    listType(o.getListType())
                            .managedListType(o.getManagedListType())
                            .value(o.getValue());

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
     * configuration list item type, either CUSTOM or MANAGED
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listType")
    private final ConfigurationListItemType listType;

    /**
     * configuration list item type, either CUSTOM or MANAGED
     * @return the value
     **/
    public ConfigurationListItemType getListType() {
        return listType;
    }

    /**
     * type of the managed list
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedListType")
    private final String managedListType;

    /**
     * type of the managed list
     * @return the value
     **/
    public String getManagedListType() {
        return managedListType;
    }

    /**
     * configuration value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * configuration value
     * @return the value
     **/
    public String getValue() {
        return value;
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
        sb.append("ConfigValue(");
        sb.append("listType=").append(String.valueOf(this.listType));
        sb.append(", managedListType=").append(String.valueOf(this.managedListType));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigValue)) {
            return false;
        }

        ConfigValue other = (ConfigValue) o;
        return java.util.Objects.equals(this.listType, other.listType)
                && java.util.Objects.equals(this.managedListType, other.managedListType)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.listType == null ? 43 : this.listType.hashCode());
        result =
                (result * PRIME)
                        + (this.managedListType == null ? 43 : this.managedListType.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
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
