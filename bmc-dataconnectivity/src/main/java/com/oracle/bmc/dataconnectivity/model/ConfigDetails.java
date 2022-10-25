/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The connector-specific engine configurations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConfigDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"configMap"})
    public ConfigDetails(java.util.Map<String, String> configMap) {
        super();
        this.configMap = configMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The connector-specific engine configurations configuration represented in a key-value map. Example - "spark.sql.catalogImplementation", "hive"
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configMap")
        private java.util.Map<String, String> configMap;

        /**
         * The connector-specific engine configurations configuration represented in a key-value map. Example - "spark.sql.catalogImplementation", "hive"
         * @param configMap the value to set
         * @return this builder
         **/
        public Builder configMap(java.util.Map<String, String> configMap) {
            this.configMap = configMap;
            this.__explicitlySet__.add("configMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigDetails build() {
            ConfigDetails model = new ConfigDetails(this.configMap);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigDetails model) {
            if (model.wasPropertyExplicitlySet("configMap")) {
                this.configMap(model.getConfigMap());
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
     * The connector-specific engine configurations configuration represented in a key-value map. Example - "spark.sql.catalogImplementation", "hive"
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    private final java.util.Map<String, String> configMap;

    /**
     * The connector-specific engine configurations configuration represented in a key-value map. Example - "spark.sql.catalogImplementation", "hive"
     * @return the value
     **/
    public java.util.Map<String, String> getConfigMap() {
        return configMap;
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
        sb.append("ConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("configMap=").append(String.valueOf(this.configMap));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigDetails)) {
            return false;
        }

        ConfigDetails other = (ConfigDetails) o;
        return java.util.Objects.equals(this.configMap, other.configMap) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.configMap == null ? 43 : this.configMap.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
