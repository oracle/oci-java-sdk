/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Aggregated snapshots of all spans. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AggregatedSnapshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AggregatedSnapshot
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"details", "aggregatedStackTraces"})
    public AggregatedSnapshot(
            java.util.List<SnapshotDetail> details,
            java.util.List<AggregatedStackTrace> aggregatedStackTraces) {
        super();
        this.details = details;
        this.aggregatedStackTraces = aggregatedStackTraces;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Aggregated snapshot details. */
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private java.util.List<SnapshotDetail> details;

        /**
         * Aggregated snapshot details.
         *
         * @param details the value to set
         * @return this builder
         */
        public Builder details(java.util.List<SnapshotDetail> details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /** List of aggregated stack trace. */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatedStackTraces")
        private java.util.List<AggregatedStackTrace> aggregatedStackTraces;

        /**
         * List of aggregated stack trace.
         *
         * @param aggregatedStackTraces the value to set
         * @return this builder
         */
        public Builder aggregatedStackTraces(
                java.util.List<AggregatedStackTrace> aggregatedStackTraces) {
            this.aggregatedStackTraces = aggregatedStackTraces;
            this.__explicitlySet__.add("aggregatedStackTraces");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AggregatedSnapshot build() {
            AggregatedSnapshot model =
                    new AggregatedSnapshot(this.details, this.aggregatedStackTraces);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AggregatedSnapshot model) {
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
            }
            if (model.wasPropertyExplicitlySet("aggregatedStackTraces")) {
                this.aggregatedStackTraces(model.getAggregatedStackTraces());
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

    /** Aggregated snapshot details. */
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final java.util.List<SnapshotDetail> details;

    /**
     * Aggregated snapshot details.
     *
     * @return the value
     */
    public java.util.List<SnapshotDetail> getDetails() {
        return details;
    }

    /** List of aggregated stack trace. */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedStackTraces")
    private final java.util.List<AggregatedStackTrace> aggregatedStackTraces;

    /**
     * List of aggregated stack trace.
     *
     * @return the value
     */
    public java.util.List<AggregatedStackTrace> getAggregatedStackTraces() {
        return aggregatedStackTraces;
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
        sb.append("AggregatedSnapshot(");
        sb.append("super=").append(super.toString());
        sb.append("details=").append(String.valueOf(this.details));
        sb.append(", aggregatedStackTraces=").append(String.valueOf(this.aggregatedStackTraces));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AggregatedSnapshot)) {
            return false;
        }

        AggregatedSnapshot other = (AggregatedSnapshot) o;
        return java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.aggregatedStackTraces, other.aggregatedStackTraces)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregatedStackTraces == null
                                ? 43
                                : this.aggregatedStackTraces.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
