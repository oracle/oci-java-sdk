/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Provides the dimensions and their corresponding count.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ActivityProblemAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ActivityProblemAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dimensionsMap",
        "politicalLocation",
        "geographicalLocation",
        "count"
    })
    public ActivityProblemAggregation(
            java.util.Map<String, String> dimensionsMap,
            PoliticalLocation politicalLocation,
            GeographicalLocation geographicalLocation,
            Integer count) {
        super();
        this.dimensionsMap = dimensionsMap;
        this.politicalLocation = politicalLocation;
        this.geographicalLocation = geographicalLocation;
        this.count = count;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key-value pairs of dimensions and their names.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
        private java.util.Map<String, String> dimensionsMap;

        /**
         * The key-value pairs of dimensions and their names.
         * @param dimensionsMap the value to set
         * @return this builder
         **/
        public Builder dimensionsMap(java.util.Map<String, String> dimensionsMap) {
            this.dimensionsMap = dimensionsMap;
            this.__explicitlySet__.add("dimensionsMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("politicalLocation")
        private PoliticalLocation politicalLocation;

        public Builder politicalLocation(PoliticalLocation politicalLocation) {
            this.politicalLocation = politicalLocation;
            this.__explicitlySet__.add("politicalLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("geographicalLocation")
        private GeographicalLocation geographicalLocation;

        public Builder geographicalLocation(GeographicalLocation geographicalLocation) {
            this.geographicalLocation = geographicalLocation;
            this.__explicitlySet__.add("geographicalLocation");
            return this;
        }
        /**
         * The number of occurences with given dimension/s
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * The number of occurences with given dimension/s
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivityProblemAggregation build() {
            ActivityProblemAggregation __instance__ =
                    new ActivityProblemAggregation(
                            dimensionsMap, politicalLocation, geographicalLocation, count);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivityProblemAggregation o) {
            Builder copiedBuilder =
                    dimensionsMap(o.getDimensionsMap())
                            .politicalLocation(o.getPoliticalLocation())
                            .geographicalLocation(o.getGeographicalLocation())
                            .count(o.getCount());

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
     * The key-value pairs of dimensions and their names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
    private final java.util.Map<String, String> dimensionsMap;

    /**
     * The key-value pairs of dimensions and their names.
     * @return the value
     **/
    public java.util.Map<String, String> getDimensionsMap() {
        return dimensionsMap;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("politicalLocation")
    private final PoliticalLocation politicalLocation;

    public PoliticalLocation getPoliticalLocation() {
        return politicalLocation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("geographicalLocation")
    private final GeographicalLocation geographicalLocation;

    public GeographicalLocation getGeographicalLocation() {
        return geographicalLocation;
    }

    /**
     * The number of occurences with given dimension/s
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * The number of occurences with given dimension/s
     * @return the value
     **/
    public Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ActivityProblemAggregation(");
        sb.append("dimensionsMap=").append(String.valueOf(this.dimensionsMap));
        sb.append(", politicalLocation=").append(String.valueOf(this.politicalLocation));
        sb.append(", geographicalLocation=").append(String.valueOf(this.geographicalLocation));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityProblemAggregation)) {
            return false;
        }

        ActivityProblemAggregation other = (ActivityProblemAggregation) o;
        return java.util.Objects.equals(this.dimensionsMap, other.dimensionsMap)
                && java.util.Objects.equals(this.politicalLocation, other.politicalLocation)
                && java.util.Objects.equals(this.geographicalLocation, other.geographicalLocation)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dimensionsMap == null ? 43 : this.dimensionsMap.hashCode());
        result =
                (result * PRIME)
                        + (this.politicalLocation == null ? 43 : this.politicalLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.geographicalLocation == null
                                ? 43
                                : this.geographicalLocation.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
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
