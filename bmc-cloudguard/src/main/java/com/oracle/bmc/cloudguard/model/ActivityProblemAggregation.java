/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Provides the parameters and their corresponding count. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ActivityProblemAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ActivityProblemAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The key-value pairs of dimensions and their names */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
        private java.util.Map<String, String> dimensionsMap;

        /**
         * The key-value pairs of dimensions and their names
         *
         * @param dimensionsMap the value to set
         * @return this builder
         */
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
        /** The number of occurrences with given dimensions */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * The number of occurrences with given dimensions
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivityProblemAggregation build() {
            ActivityProblemAggregation model =
                    new ActivityProblemAggregation(
                            this.dimensionsMap,
                            this.politicalLocation,
                            this.geographicalLocation,
                            this.count);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivityProblemAggregation model) {
            if (model.wasPropertyExplicitlySet("dimensionsMap")) {
                this.dimensionsMap(model.getDimensionsMap());
            }
            if (model.wasPropertyExplicitlySet("politicalLocation")) {
                this.politicalLocation(model.getPoliticalLocation());
            }
            if (model.wasPropertyExplicitlySet("geographicalLocation")) {
                this.geographicalLocation(model.getGeographicalLocation());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
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

    /** The key-value pairs of dimensions and their names */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
    private final java.util.Map<String, String> dimensionsMap;

    /**
     * The key-value pairs of dimensions and their names
     *
     * @return the value
     */
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

    /** The number of occurrences with given dimensions */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * The number of occurrences with given dimensions
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
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
        sb.append("ActivityProblemAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("dimensionsMap=").append(String.valueOf(this.dimensionsMap));
        sb.append(", politicalLocation=").append(String.valueOf(this.politicalLocation));
        sb.append(", geographicalLocation=").append(String.valueOf(this.geographicalLocation));
        sb.append(", count=").append(String.valueOf(this.count));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
