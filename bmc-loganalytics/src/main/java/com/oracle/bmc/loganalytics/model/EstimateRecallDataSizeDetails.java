/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the input used to estimate the size of data to be recalled
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EstimateRecallDataSizeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EstimateRecallDataSizeDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeDataStarted", "timeDataEnded"})
    public EstimateRecallDataSizeDetails(
            java.util.Date timeDataStarted, java.util.Date timeDataEnded) {
        super();
        this.timeDataStarted = timeDataStarted;
        this.timeDataEnded = timeDataEnded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This is the start of the time range for the data to be recalled
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        /**
         * This is the start of the time range for the data to be recalled
         * @param timeDataStarted the value to set
         * @return this builder
         **/
        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }
        /**
         * This is the end of the time range for the data to be recalled
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        /**
         * This is the end of the time range for the data to be recalled
         * @param timeDataEnded the value to set
         * @return this builder
         **/
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EstimateRecallDataSizeDetails build() {
            EstimateRecallDataSizeDetails model =
                    new EstimateRecallDataSizeDetails(this.timeDataStarted, this.timeDataEnded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EstimateRecallDataSizeDetails model) {
            if (model.wasPropertyExplicitlySet("timeDataStarted")) {
                this.timeDataStarted(model.getTimeDataStarted());
            }
            if (model.wasPropertyExplicitlySet("timeDataEnded")) {
                this.timeDataEnded(model.getTimeDataEnded());
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
     * This is the start of the time range for the data to be recalled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    private final java.util.Date timeDataStarted;

    /**
     * This is the start of the time range for the data to be recalled
     * @return the value
     **/
    public java.util.Date getTimeDataStarted() {
        return timeDataStarted;
    }

    /**
     * This is the end of the time range for the data to be recalled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    private final java.util.Date timeDataEnded;

    /**
     * This is the end of the time range for the data to be recalled
     * @return the value
     **/
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
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
        sb.append("EstimateRecallDataSizeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(", timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EstimateRecallDataSizeDetails)) {
            return false;
        }

        EstimateRecallDataSizeDetails other = (EstimateRecallDataSizeDetails) o;
        return java.util.Objects.equals(this.timeDataStarted, other.timeDataStarted)
                && java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeDataStarted == null ? 43 : this.timeDataStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataEnded == null ? 43 : this.timeDataEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
