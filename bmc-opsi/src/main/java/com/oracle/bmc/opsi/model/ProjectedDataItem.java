/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The timestamp of the projected event and their corresponding resource value. {@code highValue}
 * and {@code lowValue} are the uncertainty bounds of the corresponding value. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProjectedDataItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ProjectedDataItem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"endTimestamp", "usage", "highValue", "lowValue"})
    public ProjectedDataItem(
            java.util.Date endTimestamp, Double usage, Double highValue, Double lowValue) {
        super();
        this.endTimestamp = endTimestamp;
        this.usage = usage;
        this.highValue = highValue;
        this.lowValue = lowValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The timestamp in which the current sampling period ends in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
        private java.util.Date endTimestamp;

        /**
         * The timestamp in which the current sampling period ends in RFC 3339 format.
         *
         * @param endTimestamp the value to set
         * @return this builder
         */
        public Builder endTimestamp(java.util.Date endTimestamp) {
            this.endTimestamp = endTimestamp;
            this.__explicitlySet__.add("endTimestamp");
            return this;
        }
        /** Total amount used of the resource metric type (CPU, STORAGE). */
        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Double usage;

        /**
         * Total amount used of the resource metric type (CPU, STORAGE).
         *
         * @param usage the value to set
         * @return this builder
         */
        public Builder usage(Double usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }
        /** Upper uncertainty bound of the current usage value. */
        @com.fasterxml.jackson.annotation.JsonProperty("highValue")
        private Double highValue;

        /**
         * Upper uncertainty bound of the current usage value.
         *
         * @param highValue the value to set
         * @return this builder
         */
        public Builder highValue(Double highValue) {
            this.highValue = highValue;
            this.__explicitlySet__.add("highValue");
            return this;
        }
        /** Lower uncertainty bound of the current usage value. */
        @com.fasterxml.jackson.annotation.JsonProperty("lowValue")
        private Double lowValue;

        /**
         * Lower uncertainty bound of the current usage value.
         *
         * @param lowValue the value to set
         * @return this builder
         */
        public Builder lowValue(Double lowValue) {
            this.lowValue = lowValue;
            this.__explicitlySet__.add("lowValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProjectedDataItem build() {
            ProjectedDataItem model =
                    new ProjectedDataItem(
                            this.endTimestamp, this.usage, this.highValue, this.lowValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProjectedDataItem model) {
            if (model.wasPropertyExplicitlySet("endTimestamp")) {
                this.endTimestamp(model.getEndTimestamp());
            }
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
            }
            if (model.wasPropertyExplicitlySet("highValue")) {
                this.highValue(model.getHighValue());
            }
            if (model.wasPropertyExplicitlySet("lowValue")) {
                this.lowValue(model.getLowValue());
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

    /** The timestamp in which the current sampling period ends in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    private final java.util.Date endTimestamp;

    /**
     * The timestamp in which the current sampling period ends in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getEndTimestamp() {
        return endTimestamp;
    }

    /** Total amount used of the resource metric type (CPU, STORAGE). */
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final Double usage;

    /**
     * Total amount used of the resource metric type (CPU, STORAGE).
     *
     * @return the value
     */
    public Double getUsage() {
        return usage;
    }

    /** Upper uncertainty bound of the current usage value. */
    @com.fasterxml.jackson.annotation.JsonProperty("highValue")
    private final Double highValue;

    /**
     * Upper uncertainty bound of the current usage value.
     *
     * @return the value
     */
    public Double getHighValue() {
        return highValue;
    }

    /** Lower uncertainty bound of the current usage value. */
    @com.fasterxml.jackson.annotation.JsonProperty("lowValue")
    private final Double lowValue;

    /**
     * Lower uncertainty bound of the current usage value.
     *
     * @return the value
     */
    public Double getLowValue() {
        return lowValue;
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
        sb.append("ProjectedDataItem(");
        sb.append("super=").append(super.toString());
        sb.append("endTimestamp=").append(String.valueOf(this.endTimestamp));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(", highValue=").append(String.valueOf(this.highValue));
        sb.append(", lowValue=").append(String.valueOf(this.lowValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProjectedDataItem)) {
            return false;
        }

        ProjectedDataItem other = (ProjectedDataItem) o;
        return java.util.Objects.equals(this.endTimestamp, other.endTimestamp)
                && java.util.Objects.equals(this.usage, other.usage)
                && java.util.Objects.equals(this.highValue, other.highValue)
                && java.util.Objects.equals(this.lowValue, other.lowValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endTimestamp == null ? 43 : this.endTimestamp.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        result = (result * PRIME) + (this.highValue == null ? 43 : this.highValue.hashCode());
        result = (result * PRIME) + (this.lowValue == null ? 43 : this.lowValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
