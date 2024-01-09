/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The metric dimension details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MetricDimensionDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MetricDimensionDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dimensionName", "dimensionValue"})
    public MetricDimensionDefinition(String dimensionName, String dimensionValue) {
        super();
        this.dimensionName = dimensionName;
        this.dimensionValue = dimensionValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the dimension. */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionName")
        private String dimensionName;

        /**
         * The name of the dimension.
         *
         * @param dimensionName the value to set
         * @return this builder
         */
        public Builder dimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            this.__explicitlySet__.add("dimensionName");
            return this;
        }
        /** The value of the dimension. */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionValue")
        private String dimensionValue;

        /**
         * The value of the dimension.
         *
         * @param dimensionValue the value to set
         * @return this builder
         */
        public Builder dimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            this.__explicitlySet__.add("dimensionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricDimensionDefinition build() {
            MetricDimensionDefinition model =
                    new MetricDimensionDefinition(this.dimensionName, this.dimensionValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricDimensionDefinition model) {
            if (model.wasPropertyExplicitlySet("dimensionName")) {
                this.dimensionName(model.getDimensionName());
            }
            if (model.wasPropertyExplicitlySet("dimensionValue")) {
                this.dimensionValue(model.getDimensionValue());
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

    /** The name of the dimension. */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionName")
    private final String dimensionName;

    /**
     * The name of the dimension.
     *
     * @return the value
     */
    public String getDimensionName() {
        return dimensionName;
    }

    /** The value of the dimension. */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionValue")
    private final String dimensionValue;

    /**
     * The value of the dimension.
     *
     * @return the value
     */
    public String getDimensionValue() {
        return dimensionValue;
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
        sb.append("MetricDimensionDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("dimensionName=").append(String.valueOf(this.dimensionName));
        sb.append(", dimensionValue=").append(String.valueOf(this.dimensionValue));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
