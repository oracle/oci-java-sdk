/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * one available refresh time.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TimeAvailableForRefreshSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TimeAvailableForRefreshSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeAvailableForRefresh"})
    public TimeAvailableForRefreshSummary(java.util.Date timeAvailableForRefresh) {
        super();
        this.timeAvailableForRefresh = timeAvailableForRefresh;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * refresh time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAvailableForRefresh")
        private java.util.Date timeAvailableForRefresh;

        /**
         * refresh time.
         * @param timeAvailableForRefresh the value to set
         * @return this builder
         **/
        public Builder timeAvailableForRefresh(java.util.Date timeAvailableForRefresh) {
            this.timeAvailableForRefresh = timeAvailableForRefresh;
            this.__explicitlySet__.add("timeAvailableForRefresh");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TimeAvailableForRefreshSummary build() {
            TimeAvailableForRefreshSummary model =
                    new TimeAvailableForRefreshSummary(this.timeAvailableForRefresh);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TimeAvailableForRefreshSummary model) {
            if (model.wasPropertyExplicitlySet("timeAvailableForRefresh")) {
                this.timeAvailableForRefresh(model.getTimeAvailableForRefresh());
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
     * refresh time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAvailableForRefresh")
    private final java.util.Date timeAvailableForRefresh;

    /**
     * refresh time.
     * @return the value
     **/
    public java.util.Date getTimeAvailableForRefresh() {
        return timeAvailableForRefresh;
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
        sb.append("TimeAvailableForRefreshSummary(");
        sb.append("super=").append(super.toString());
        sb.append("timeAvailableForRefresh=").append(String.valueOf(this.timeAvailableForRefresh));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeAvailableForRefreshSummary)) {
            return false;
        }

        TimeAvailableForRefreshSummary other = (TimeAvailableForRefreshSummary) o;
        return java.util.Objects.equals(this.timeAvailableForRefresh, other.timeAvailableForRefresh)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeAvailableForRefresh == null
                                ? 43
                                : this.timeAvailableForRefresh.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
