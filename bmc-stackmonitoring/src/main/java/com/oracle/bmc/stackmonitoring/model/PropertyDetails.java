/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Property Details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PropertyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PropertyDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"propertiesMap"})
    public PropertyDetails(java.util.Map<String, String> propertiesMap) {
        super();
        this.propertiesMap = propertiesMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Key/Value pair of Property
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("propertiesMap")
        private java.util.Map<String, String> propertiesMap;

        /**
         * Key/Value pair of Property
         * @param propertiesMap the value to set
         * @return this builder
         **/
        public Builder propertiesMap(java.util.Map<String, String> propertiesMap) {
            this.propertiesMap = propertiesMap;
            this.__explicitlySet__.add("propertiesMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PropertyDetails build() {
            PropertyDetails __instance__ = new PropertyDetails(propertiesMap);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PropertyDetails o) {
            Builder copiedBuilder = propertiesMap(o.getPropertiesMap());

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
     * Key/Value pair of Property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertiesMap")
    private final java.util.Map<String, String> propertiesMap;

    /**
     * Key/Value pair of Property
     * @return the value
     **/
    public java.util.Map<String, String> getPropertiesMap() {
        return propertiesMap;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PropertyDetails(");
        sb.append("propertiesMap=").append(String.valueOf(this.propertiesMap));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PropertyDetails)) {
            return false;
        }

        PropertyDetails other = (PropertyDetails) o;
        return java.util.Objects.equals(this.propertiesMap, other.propertiesMap)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.propertiesMap == null ? 43 : this.propertiesMap.hashCode());
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
