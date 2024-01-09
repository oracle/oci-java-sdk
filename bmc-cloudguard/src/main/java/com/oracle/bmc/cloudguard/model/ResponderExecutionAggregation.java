/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Provides the dimensions and their corresponding count value. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResponderExecutionAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResponderExecutionAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dimensionsMap", "count"})
    public ResponderExecutionAggregation(
            java.util.Map<String, String> dimensionsMap, Integer count) {
        super();
        this.dimensionsMap = dimensionsMap;
        this.count = count;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key-value pairs of dimensions and their names. The key corresponds to the Analytic
         * Dimension(s) chosen, and the value corresponds to the value of the dimension from the
         * data. E.g. if the Analytic Dimension chosen is "RISK_LEVEL", then the value will be like
         * "CRITICAL". If the Analytic Dimensions chosen are "RISK_LEVEL" and "RESOURCE_TYPE", then
         * the map will have two key-value pairs of form {"RISK_LEVEL" &#58; "CRITICAL,
         * "RESOURCE_TYPE" &#58; "LOAD_BALANCER"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
        private java.util.Map<String, String> dimensionsMap;

        /**
         * The key-value pairs of dimensions and their names. The key corresponds to the Analytic
         * Dimension(s) chosen, and the value corresponds to the value of the dimension from the
         * data. E.g. if the Analytic Dimension chosen is "RISK_LEVEL", then the value will be like
         * "CRITICAL". If the Analytic Dimensions chosen are "RISK_LEVEL" and "RESOURCE_TYPE", then
         * the map will have two key-value pairs of form {"RISK_LEVEL" &#58; "CRITICAL,
         * "RESOURCE_TYPE" &#58; "LOAD_BALANCER"}
         *
         * @param dimensionsMap the value to set
         * @return this builder
         */
        public Builder dimensionsMap(java.util.Map<String, String> dimensionsMap) {
            this.dimensionsMap = dimensionsMap;
            this.__explicitlySet__.add("dimensionsMap");
            return this;
        }
        /** The number of occurences with given dimension(s) */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * The number of occurences with given dimension(s)
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResponderExecutionAggregation build() {
            ResponderExecutionAggregation model =
                    new ResponderExecutionAggregation(this.dimensionsMap, this.count);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResponderExecutionAggregation model) {
            if (model.wasPropertyExplicitlySet("dimensionsMap")) {
                this.dimensionsMap(model.getDimensionsMap());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
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

    /**
     * The key-value pairs of dimensions and their names. The key corresponds to the Analytic
     * Dimension(s) chosen, and the value corresponds to the value of the dimension from the data.
     * E.g. if the Analytic Dimension chosen is "RISK_LEVEL", then the value will be like
     * "CRITICAL". If the Analytic Dimensions chosen are "RISK_LEVEL" and "RESOURCE_TYPE", then the
     * map will have two key-value pairs of form {"RISK_LEVEL" &#58; "CRITICAL, "RESOURCE_TYPE"
     * &#58; "LOAD_BALANCER"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
    private final java.util.Map<String, String> dimensionsMap;

    /**
     * The key-value pairs of dimensions and their names. The key corresponds to the Analytic
     * Dimension(s) chosen, and the value corresponds to the value of the dimension from the data.
     * E.g. if the Analytic Dimension chosen is "RISK_LEVEL", then the value will be like
     * "CRITICAL". If the Analytic Dimensions chosen are "RISK_LEVEL" and "RESOURCE_TYPE", then the
     * map will have two key-value pairs of form {"RISK_LEVEL" &#58; "CRITICAL, "RESOURCE_TYPE"
     * &#58; "LOAD_BALANCER"}
     *
     * @return the value
     */
    public java.util.Map<String, String> getDimensionsMap() {
        return dimensionsMap;
    }

    /** The number of occurences with given dimension(s) */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * The number of occurences with given dimension(s)
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
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
        sb.append("ResponderExecutionAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("dimensionsMap=").append(String.valueOf(this.dimensionsMap));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponderExecutionAggregation)) {
            return false;
        }

        ResponderExecutionAggregation other = (ResponderExecutionAggregation) o;
        return java.util.Objects.equals(this.dimensionsMap, other.dimensionsMap)
                && java.util.Objects.equals(this.count, other.count)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dimensionsMap == null ? 43 : this.dimensionsMap.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
