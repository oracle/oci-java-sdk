/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * TimeRange Object <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReportTimeRange.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReportTimeRange
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeFrom", "timeUntil"})
    public ReportTimeRange(java.util.Date timeFrom, java.util.Date timeUntil) {
        super();
        this.timeFrom = timeFrom;
        this.timeUntil = timeUntil;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Start Date for the report. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFrom")
        private java.util.Date timeFrom;

        /**
         * Start Date for the report. An RFC3339 formatted datetime string
         *
         * @param timeFrom the value to set
         * @return this builder
         */
        public Builder timeFrom(java.util.Date timeFrom) {
            this.timeFrom = timeFrom;
            this.__explicitlySet__.add("timeFrom");
            return this;
        }
        /** End Date for the report. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUntil")
        private java.util.Date timeUntil;

        /**
         * End Date for the report. An RFC3339 formatted datetime string
         *
         * @param timeUntil the value to set
         * @return this builder
         */
        public Builder timeUntil(java.util.Date timeUntil) {
            this.timeUntil = timeUntil;
            this.__explicitlySet__.add("timeUntil");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReportTimeRange build() {
            ReportTimeRange model = new ReportTimeRange(this.timeFrom, this.timeUntil);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReportTimeRange model) {
            if (model.wasPropertyExplicitlySet("timeFrom")) {
                this.timeFrom(model.getTimeFrom());
            }
            if (model.wasPropertyExplicitlySet("timeUntil")) {
                this.timeUntil(model.getTimeUntil());
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

    /** Start Date for the report. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFrom")
    private final java.util.Date timeFrom;

    /**
     * Start Date for the report. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeFrom() {
        return timeFrom;
    }

    /** End Date for the report. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUntil")
    private final java.util.Date timeUntil;

    /**
     * End Date for the report. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUntil() {
        return timeUntil;
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
        sb.append("ReportTimeRange(");
        sb.append("super=").append(super.toString());
        sb.append("timeFrom=").append(String.valueOf(this.timeFrom));
        sb.append(", timeUntil=").append(String.valueOf(this.timeUntil));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReportTimeRange)) {
            return false;
        }

        ReportTimeRange other = (ReportTimeRange) o;
        return java.util.Objects.equals(this.timeFrom, other.timeFrom)
                && java.util.Objects.equals(this.timeUntil, other.timeUntil)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeFrom == null ? 43 : this.timeFrom.hashCode());
        result = (result * PRIME) + (this.timeUntil == null ? 43 : this.timeUntil.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
