/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The metric dimension details.
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
    builder = MetricDimensionDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MetricDimensionDefinition {
    @Deprecated
    @java.beans.ConstructorProperties({"dimensionName", "dimensionValue"})
    public MetricDimensionDefinition(String dimensionName, String dimensionValue) {
        super();
        this.dimensionName = dimensionName;
        this.dimensionValue = dimensionValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the dimension.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionName")
        private String dimensionName;

        /**
         * The name of the dimension.
         * @param dimensionName the value to set
         * @return this builder
         **/
        public Builder dimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            this.__explicitlySet__.add("dimensionName");
            return this;
        }
        /**
         * The value of the dimension.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionValue")
        private String dimensionValue;

        /**
         * The value of the dimension.
         * @param dimensionValue the value to set
         * @return this builder
         **/
        public Builder dimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            this.__explicitlySet__.add("dimensionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricDimensionDefinition build() {
            MetricDimensionDefinition __instance__ =
                    new MetricDimensionDefinition(dimensionName, dimensionValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricDimensionDefinition o) {
            Builder copiedBuilder =
                    dimensionName(o.getDimensionName()).dimensionValue(o.getDimensionValue());

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
     * The name of the dimension.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionName")
    private final String dimensionName;

    /**
     * The name of the dimension.
     * @return the value
     **/
    public String getDimensionName() {
        return dimensionName;
    }

    /**
     * The value of the dimension.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionValue")
    private final String dimensionValue;

    /**
     * The value of the dimension.
     * @return the value
     **/
    public String getDimensionValue() {
        return dimensionValue;
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
        sb.append("MetricDimensionDefinition(");
        sb.append("dimensionName=").append(String.valueOf(this.dimensionName));
        sb.append(", dimensionValue=").append(String.valueOf(this.dimensionValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricDimensionDefinition)) {
            return false;
        }

        MetricDimensionDefinition other = (MetricDimensionDefinition) o;
        return java.util.Objects.equals(this.dimensionName, other.dimensionName)
                && java.util.Objects.equals(this.dimensionValue, other.dimensionValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dimensionName == null ? 43 : this.dimensionName.hashCode());
        result =
                (result * PRIME)
                        + (this.dimensionValue == null ? 43 : this.dimensionValue.hashCode());
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
