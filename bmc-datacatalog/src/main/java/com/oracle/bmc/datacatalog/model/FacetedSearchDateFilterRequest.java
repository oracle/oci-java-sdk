/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Object with date filter criteria
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FacetedSearchDateFilterRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FacetedSearchDateFilterRequest {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "timeAfter", "timeBefore"})
    public FacetedSearchDateFilterRequest(
            String fieldName, java.util.Date timeAfter, java.util.Date timeBefore) {
        super();
        this.fieldName = fieldName;
        this.timeAfter = timeAfter;
        this.timeBefore = timeBefore;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Date field name that needs to be filtered by.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * Date field name that needs to be filtered by.
         * @param fieldName the value to set
         * @return this builder
         **/
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /**
         * The date and time the request was created, as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAfter")
        private java.util.Date timeAfter;

        /**
         * The date and time the request was created, as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @param timeAfter the value to set
         * @return this builder
         **/
        public Builder timeAfter(java.util.Date timeAfter) {
            this.timeAfter = timeAfter;
            this.__explicitlySet__.add("timeAfter");
            return this;
        }
        /**
         * The date and time the request was created, as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeBefore")
        private java.util.Date timeBefore;

        /**
         * The date and time the request was created, as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @param timeBefore the value to set
         * @return this builder
         **/
        public Builder timeBefore(java.util.Date timeBefore) {
            this.timeBefore = timeBefore;
            this.__explicitlySet__.add("timeBefore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FacetedSearchDateFilterRequest build() {
            FacetedSearchDateFilterRequest __instance__ =
                    new FacetedSearchDateFilterRequest(fieldName, timeAfter, timeBefore);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FacetedSearchDateFilterRequest o) {
            Builder copiedBuilder =
                    fieldName(o.getFieldName())
                            .timeAfter(o.getTimeAfter())
                            .timeBefore(o.getTimeBefore());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Date field name that needs to be filtered by.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * Date field name that needs to be filtered by.
     * @return the value
     **/
    public String getFieldName() {
        return fieldName;
    }

    /**
     * The date and time the request was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAfter")
    private final java.util.Date timeAfter;

    /**
     * The date and time the request was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     **/
    public java.util.Date getTimeAfter() {
        return timeAfter;
    }

    /**
     * The date and time the request was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBefore")
    private final java.util.Date timeBefore;

    /**
     * The date and time the request was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     **/
    public java.util.Date getTimeBefore() {
        return timeBefore;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FacetedSearchDateFilterRequest(");
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", timeAfter=").append(String.valueOf(this.timeAfter));
        sb.append(", timeBefore=").append(String.valueOf(this.timeBefore));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FacetedSearchDateFilterRequest)) {
            return false;
        }

        FacetedSearchDateFilterRequest other = (FacetedSearchDateFilterRequest) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.timeAfter, other.timeAfter)
                && java.util.Objects.equals(this.timeBefore, other.timeBefore)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.timeAfter == null ? 43 : this.timeAfter.hashCode());
        result = (result * PRIME) + (this.timeBefore == null ? 43 : this.timeBefore.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
