/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Metric collection dimension field.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DimensionField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DimensionField extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"queryFieldName", "dimensionName"})
    public DimensionField(String queryFieldName, String dimensionName) {
        super();
        this.queryFieldName = queryFieldName;
        this.dimensionName = dimensionName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Output field in the query to be used as the source for the metric dimension.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("queryFieldName")
        private String queryFieldName;

        /**
         * Output field in the query to be used as the source for the metric dimension.
         * @param queryFieldName the value to set
         * @return this builder
         **/
        public Builder queryFieldName(String queryFieldName) {
            this.queryFieldName = queryFieldName;
            this.__explicitlySet__.add("queryFieldName");
            return this;
        }
        /**
         * Dimension name to be stored with the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionName")
        private String dimensionName;

        /**
         * Dimension name to be stored with the metric.
         * @param dimensionName the value to set
         * @return this builder
         **/
        public Builder dimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            this.__explicitlySet__.add("dimensionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DimensionField build() {
            DimensionField model = new DimensionField(this.queryFieldName, this.dimensionName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DimensionField model) {
            if (model.wasPropertyExplicitlySet("queryFieldName")) {
                this.queryFieldName(model.getQueryFieldName());
            }
            if (model.wasPropertyExplicitlySet("dimensionName")) {
                this.dimensionName(model.getDimensionName());
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
     * Output field in the query to be used as the source for the metric dimension.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryFieldName")
    private final String queryFieldName;

    /**
     * Output field in the query to be used as the source for the metric dimension.
     * @return the value
     **/
    public String getQueryFieldName() {
        return queryFieldName;
    }

    /**
     * Dimension name to be stored with the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionName")
    private final String dimensionName;

    /**
     * Dimension name to be stored with the metric.
     * @return the value
     **/
    public String getDimensionName() {
        return dimensionName;
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
        sb.append("DimensionField(");
        sb.append("super=").append(super.toString());
        sb.append("queryFieldName=").append(String.valueOf(this.queryFieldName));
        sb.append(", dimensionName=").append(String.valueOf(this.dimensionName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DimensionField)) {
            return false;
        }

        DimensionField other = (DimensionField) o;
        return java.util.Objects.equals(this.queryFieldName, other.queryFieldName)
                && java.util.Objects.equals(this.dimensionName, other.dimensionName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.queryFieldName == null ? 43 : this.queryFieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.dimensionName == null ? 43 : this.dimensionName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
