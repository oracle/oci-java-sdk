/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * A list of TrailSequences. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TrailSequenceCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TrailSequenceCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeLastFetched", "items"})
    public TrailSequenceCollection(
            java.util.Date timeLastFetched, java.util.List<TrailSequenceSummary> items) {
        super();
        this.timeLastFetched = timeLastFetched;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time the data was last fetched from the deployment. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastFetched")
        private java.util.Date timeLastFetched;

        /**
         * The time the data was last fetched from the deployment. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeLastFetched the value to set
         * @return this builder
         */
        public Builder timeLastFetched(java.util.Date timeLastFetched) {
            this.timeLastFetched = timeLastFetched;
            this.__explicitlySet__.add("timeLastFetched");
            return this;
        }
        /** An array of TrailSequences. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<TrailSequenceSummary> items;

        /**
         * An array of TrailSequences.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<TrailSequenceSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TrailSequenceCollection build() {
            TrailSequenceCollection model =
                    new TrailSequenceCollection(this.timeLastFetched, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TrailSequenceCollection model) {
            if (model.wasPropertyExplicitlySet("timeLastFetched")) {
                this.timeLastFetched(model.getTimeLastFetched());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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
     * The time the data was last fetched from the deployment. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastFetched")
    private final java.util.Date timeLastFetched;

    /**
     * The time the data was last fetched from the deployment. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeLastFetched() {
        return timeLastFetched;
    }

    /** An array of TrailSequences. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<TrailSequenceSummary> items;

    /**
     * An array of TrailSequences.
     *
     * @return the value
     */
    public java.util.List<TrailSequenceSummary> getItems() {
        return items;
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
        sb.append("TrailSequenceCollection(");
        sb.append("super=").append(super.toString());
        sb.append("timeLastFetched=").append(String.valueOf(this.timeLastFetched));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TrailSequenceCollection)) {
            return false;
        }

        TrailSequenceCollection other = (TrailSequenceCollection) o;
        return java.util.Objects.equals(this.timeLastFetched, other.timeLastFetched)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeLastFetched == null ? 43 : this.timeLastFetched.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
