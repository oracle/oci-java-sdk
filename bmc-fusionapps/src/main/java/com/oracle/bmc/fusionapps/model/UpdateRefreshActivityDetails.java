/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The information about scheduled refresh.
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
    builder = UpdateRefreshActivityDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateRefreshActivityDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeScheduledStart"})
    public UpdateRefreshActivityDetails(java.util.Date timeScheduledStart) {
        super();
        this.timeScheduledStart = timeScheduledStart;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Time the refresh activity is scheduled to start. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledStart")
        private java.util.Date timeScheduledStart;

        /**
         * Time the refresh activity is scheduled to start. An RFC3339 formatted datetime string.
         * @param timeScheduledStart the value to set
         * @return this builder
         **/
        public Builder timeScheduledStart(java.util.Date timeScheduledStart) {
            this.timeScheduledStart = timeScheduledStart;
            this.__explicitlySet__.add("timeScheduledStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRefreshActivityDetails build() {
            UpdateRefreshActivityDetails model =
                    new UpdateRefreshActivityDetails(this.timeScheduledStart);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRefreshActivityDetails model) {
            if (model.wasPropertyExplicitlySet("timeScheduledStart")) {
                this.timeScheduledStart(model.getTimeScheduledStart());
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
     * Time the refresh activity is scheduled to start. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledStart")
    private final java.util.Date timeScheduledStart;

    /**
     * Time the refresh activity is scheduled to start. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeScheduledStart() {
        return timeScheduledStart;
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
        sb.append("UpdateRefreshActivityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeScheduledStart=").append(String.valueOf(this.timeScheduledStart));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRefreshActivityDetails)) {
            return false;
        }

        UpdateRefreshActivityDetails other = (UpdateRefreshActivityDetails) o;
        return java.util.Objects.equals(this.timeScheduledStart, other.timeScheduledStart)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeScheduledStart == null
                                ? 43
                                : this.timeScheduledStart.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
