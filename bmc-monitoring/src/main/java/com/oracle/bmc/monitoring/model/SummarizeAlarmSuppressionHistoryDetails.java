/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The configuration details for returning history of suppressions for the specified alarm. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SummarizeAlarmSuppressionHistoryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SummarizeAlarmSuppressionHistoryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dimensions",
        "timeSuppressFromGreaterThanOrEqualTo",
        "timeSuppressFromLessThan"
    })
    public SummarizeAlarmSuppressionHistoryDetails(
            java.util.Map<String, String> dimensions,
            java.util.Date timeSuppressFromGreaterThanOrEqualTo,
            java.util.Date timeSuppressFromLessThan) {
        super();
        this.dimensions = dimensions;
        this.timeSuppressFromGreaterThanOrEqualTo = timeSuppressFromGreaterThanOrEqualTo;
        this.timeSuppressFromLessThan = timeSuppressFromLessThan;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A filter to suppress only alarm state entries that include the set of specified dimension
         * key-value pairs. If you specify {"availabilityDomain": "phx-ad-1"} and the alarm state
         * entry corresponds to the set {"availabilityDomain": "phx-ad-1" and "resourceId":
         * "ocid1.instance.region1.phx.exampleuniqueID"}, then this alarm will be included for
         * suppression.
         *
         * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * A filter to suppress only alarm state entries that include the set of specified dimension
         * key-value pairs. If you specify {"availabilityDomain": "phx-ad-1"} and the alarm state
         * entry corresponds to the set {"availabilityDomain": "phx-ad-1" and "resourceId":
         * "ocid1.instance.region1.phx.exampleuniqueID"}, then this alarm will be included for
         * suppression.
         *
         * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * A filter to return only entries with "timeSuppressFrom" time occurring on or after the
         * specified time.
         *
         * <p>The value cannot be a future time. Format defined by RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFromGreaterThanOrEqualTo")
        private java.util.Date timeSuppressFromGreaterThanOrEqualTo;

        /**
         * A filter to return only entries with "timeSuppressFrom" time occurring on or after the
         * specified time.
         *
         * <p>The value cannot be a future time. Format defined by RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         *
         * @param timeSuppressFromGreaterThanOrEqualTo the value to set
         * @return this builder
         */
        public Builder timeSuppressFromGreaterThanOrEqualTo(
                java.util.Date timeSuppressFromGreaterThanOrEqualTo) {
            this.timeSuppressFromGreaterThanOrEqualTo = timeSuppressFromGreaterThanOrEqualTo;
            this.__explicitlySet__.add("timeSuppressFromGreaterThanOrEqualTo");
            return this;
        }
        /**
         * A filter to return only entries with "timeSuppressFrom" time occurring before the
         * specified time.
         *
         * <p>The value cannot be a future time. Format defined by RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFromLessThan")
        private java.util.Date timeSuppressFromLessThan;

        /**
         * A filter to return only entries with "timeSuppressFrom" time occurring before the
         * specified time.
         *
         * <p>The value cannot be a future time. Format defined by RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         *
         * @param timeSuppressFromLessThan the value to set
         * @return this builder
         */
        public Builder timeSuppressFromLessThan(java.util.Date timeSuppressFromLessThan) {
            this.timeSuppressFromLessThan = timeSuppressFromLessThan;
            this.__explicitlySet__.add("timeSuppressFromLessThan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeAlarmSuppressionHistoryDetails build() {
            SummarizeAlarmSuppressionHistoryDetails model =
                    new SummarizeAlarmSuppressionHistoryDetails(
                            this.dimensions,
                            this.timeSuppressFromGreaterThanOrEqualTo,
                            this.timeSuppressFromLessThan);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeAlarmSuppressionHistoryDetails model) {
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("timeSuppressFromGreaterThanOrEqualTo")) {
                this.timeSuppressFromGreaterThanOrEqualTo(
                        model.getTimeSuppressFromGreaterThanOrEqualTo());
            }
            if (model.wasPropertyExplicitlySet("timeSuppressFromLessThan")) {
                this.timeSuppressFromLessThan(model.getTimeSuppressFromLessThan());
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
     * A filter to suppress only alarm state entries that include the set of specified dimension
     * key-value pairs. If you specify {"availabilityDomain": "phx-ad-1"} and the alarm state entry
     * corresponds to the set {"availabilityDomain": "phx-ad-1" and "resourceId":
     * "ocid1.instance.region1.phx.exampleuniqueID"}, then this alarm will be included for
     * suppression.
     *
     * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * A filter to suppress only alarm state entries that include the set of specified dimension
     * key-value pairs. If you specify {"availabilityDomain": "phx-ad-1"} and the alarm state entry
     * corresponds to the set {"availabilityDomain": "phx-ad-1" and "resourceId":
     * "ocid1.instance.region1.phx.exampleuniqueID"}, then this alarm will be included for
     * suppression.
     *
     * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * A filter to return only entries with "timeSuppressFrom" time occurring on or after the
     * specified time.
     *
     * <p>The value cannot be a future time. Format defined by RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFromGreaterThanOrEqualTo")
    private final java.util.Date timeSuppressFromGreaterThanOrEqualTo;

    /**
     * A filter to return only entries with "timeSuppressFrom" time occurring on or after the
     * specified time.
     *
     * <p>The value cannot be a future time. Format defined by RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeSuppressFromGreaterThanOrEqualTo() {
        return timeSuppressFromGreaterThanOrEqualTo;
    }

    /**
     * A filter to return only entries with "timeSuppressFrom" time occurring before the specified
     * time.
     *
     * <p>The value cannot be a future time. Format defined by RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFromLessThan")
    private final java.util.Date timeSuppressFromLessThan;

    /**
     * A filter to return only entries with "timeSuppressFrom" time occurring before the specified
     * time.
     *
     * <p>The value cannot be a future time. Format defined by RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeSuppressFromLessThan() {
        return timeSuppressFromLessThan;
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
        sb.append("SummarizeAlarmSuppressionHistoryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", timeSuppressFromGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeSuppressFromGreaterThanOrEqualTo));
        sb.append(", timeSuppressFromLessThan=")
                .append(String.valueOf(this.timeSuppressFromLessThan));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeAlarmSuppressionHistoryDetails)) {
            return false;
        }

        SummarizeAlarmSuppressionHistoryDetails other = (SummarizeAlarmSuppressionHistoryDetails) o;
        return java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(
                        this.timeSuppressFromGreaterThanOrEqualTo,
                        other.timeSuppressFromGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeSuppressFromLessThan, other.timeSuppressFromLessThan)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSuppressFromGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeSuppressFromGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSuppressFromLessThan == null
                                ? 43
                                : this.timeSuppressFromLessThan.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
