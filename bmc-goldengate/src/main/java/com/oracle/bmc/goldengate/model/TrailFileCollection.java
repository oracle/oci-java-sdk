/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * A list of TrailFiles. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TrailFileCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TrailFileCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeLastFetched", "items"})
    public TrailFileCollection(
            java.util.Date timeLastFetched, java.util.List<TrailFileSummary> items) {
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
        /** An array of TrailFiles. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<TrailFileSummary> items;

        /**
         * An array of TrailFiles.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<TrailFileSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TrailFileCollection build() {
            TrailFileCollection model = new TrailFileCollection(this.timeLastFetched, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TrailFileCollection model) {
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

    /** An array of TrailFiles. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<TrailFileSummary> items;

    /**
     * An array of TrailFiles.
     *
     * @return the value
     */
    public java.util.List<TrailFileSummary> getItems() {
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
        sb.append("TrailFileCollection(");
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
        if (!(o instanceof TrailFileCollection)) {
            return false;
        }

        TrailFileCollection other = (TrailFileCollection) o;
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
