/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * A dimension name and value. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DimensionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DimensionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "dimensionValue"})
    public DimensionDetails(String name, DimensionValueDetails dimensionValue) {
        super();
        this.name = name;
        this.dimensionValue = dimensionValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Dimension key. A valid dimension key includes only printable ASCII, excluding periods (.)
         * and spaces. Custom dimension keys are acceptable. Avoid entering confidential
         * information. Due to use by Connector Hub, the following dimension names are reserved:
         * {@code connectorId}, {@code connectorName}, {@code connectorSourceType}. For information
         * on valid dimension keys and values, see {@link
         * #metricDataDetails(MetricDataDetailsRequest) metricDataDetails}. Example: {@code type}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Dimension key. A valid dimension key includes only printable ASCII, excluding periods (.)
         * and spaces. Custom dimension keys are acceptable. Avoid entering confidential
         * information. Due to use by Connector Hub, the following dimension names are reserved:
         * {@code connectorId}, {@code connectorName}, {@code connectorSourceType}. For information
         * on valid dimension keys and values, see {@link
         * #metricDataDetails(MetricDataDetailsRequest) metricDataDetails}. Example: {@code type}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensionValue")
        private DimensionValueDetails dimensionValue;

        public Builder dimensionValue(DimensionValueDetails dimensionValue) {
            this.dimensionValue = dimensionValue;
            this.__explicitlySet__.add("dimensionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DimensionDetails build() {
            DimensionDetails model = new DimensionDetails(this.name, this.dimensionValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DimensionDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    /**
     * Dimension key. A valid dimension key includes only printable ASCII, excluding periods (.) and
     * spaces. Custom dimension keys are acceptable. Avoid entering confidential information. Due to
     * use by Connector Hub, the following dimension names are reserved: {@code connectorId}, {@code
     * connectorName}, {@code connectorSourceType}. For information on valid dimension keys and
     * values, see {@link #metricDataDetails(MetricDataDetailsRequest) metricDataDetails}. Example:
     * {@code type}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Dimension key. A valid dimension key includes only printable ASCII, excluding periods (.) and
     * spaces. Custom dimension keys are acceptable. Avoid entering confidential information. Due to
     * use by Connector Hub, the following dimension names are reserved: {@code connectorId}, {@code
     * connectorName}, {@code connectorSourceType}. For information on valid dimension keys and
     * values, see {@link #metricDataDetails(MetricDataDetailsRequest) metricDataDetails}. Example:
     * {@code type}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dimensionValue")
    private final DimensionValueDetails dimensionValue;

    public DimensionValueDetails getDimensionValue() {
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
        sb.append("DimensionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", dimensionValue=").append(String.valueOf(this.dimensionValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DimensionDetails)) {
            return false;
        }

        DimensionDetails other = (DimensionDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.dimensionValue, other.dimensionValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.dimensionValue == null ? 43 : this.dimensionValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
