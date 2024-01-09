/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Collection of Resource risk scores <br>
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
        builder = ResourceRiskScoreAggregationCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceRiskScoreAggregationCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"filterType", "filterId", "riskThreshold", "items"})
    public ResourceRiskScoreAggregationCollection(
            String filterType,
            String filterId,
            Integer riskThreshold,
            java.util.List<ResourceRiskScoreAggregation> items) {
        super();
        this.filterType = filterType;
        this.filterId = filterId;
        this.riskThreshold = riskThreshold;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of filter. Valid Values - problem_id and resource_id */
        @com.fasterxml.jackson.annotation.JsonProperty("filterType")
        private String filterType;

        /**
         * Type of filter. Valid Values - problem_id and resource_id
         *
         * @param filterType the value to set
         * @return this builder
         */
        public Builder filterType(String filterType) {
            this.filterType = filterType;
            this.__explicitlySet__.add("filterType");
            return this;
        }
        /** Id value on which risk scores are filtered */
        @com.fasterxml.jackson.annotation.JsonProperty("filterId")
        private String filterId;

        /**
         * Id value on which risk scores are filtered
         *
         * @param filterId the value to set
         * @return this builder
         */
        public Builder filterId(String filterId) {
            this.filterId = filterId;
            this.__explicitlySet__.add("filterId");
            return this;
        }
        /** Risk Score */
        @com.fasterxml.jackson.annotation.JsonProperty("riskThreshold")
        private Integer riskThreshold;

        /**
         * Risk Score
         *
         * @param riskThreshold the value to set
         * @return this builder
         */
        public Builder riskThreshold(Integer riskThreshold) {
            this.riskThreshold = riskThreshold;
            this.__explicitlySet__.add("riskThreshold");
            return this;
        }
        /** List of ResourceRiskScoreAggregation */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ResourceRiskScoreAggregation> items;

        /**
         * List of ResourceRiskScoreAggregation
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<ResourceRiskScoreAggregation> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceRiskScoreAggregationCollection build() {
            ResourceRiskScoreAggregationCollection model =
                    new ResourceRiskScoreAggregationCollection(
                            this.filterType, this.filterId, this.riskThreshold, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceRiskScoreAggregationCollection model) {
            if (model.wasPropertyExplicitlySet("filterType")) {
                this.filterType(model.getFilterType());
            }
            if (model.wasPropertyExplicitlySet("filterId")) {
                this.filterId(model.getFilterId());
            }
            if (model.wasPropertyExplicitlySet("riskThreshold")) {
                this.riskThreshold(model.getRiskThreshold());
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

    /** Type of filter. Valid Values - problem_id and resource_id */
    @com.fasterxml.jackson.annotation.JsonProperty("filterType")
    private final String filterType;

    /**
     * Type of filter. Valid Values - problem_id and resource_id
     *
     * @return the value
     */
    public String getFilterType() {
        return filterType;
    }

    /** Id value on which risk scores are filtered */
    @com.fasterxml.jackson.annotation.JsonProperty("filterId")
    private final String filterId;

    /**
     * Id value on which risk scores are filtered
     *
     * @return the value
     */
    public String getFilterId() {
        return filterId;
    }

    /** Risk Score */
    @com.fasterxml.jackson.annotation.JsonProperty("riskThreshold")
    private final Integer riskThreshold;

    /**
     * Risk Score
     *
     * @return the value
     */
    public Integer getRiskThreshold() {
        return riskThreshold;
    }

    /** List of ResourceRiskScoreAggregation */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ResourceRiskScoreAggregation> items;

    /**
     * List of ResourceRiskScoreAggregation
     *
     * @return the value
     */
    public java.util.List<ResourceRiskScoreAggregation> getItems() {
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
        sb.append("ResourceRiskScoreAggregationCollection(");
        sb.append("super=").append(super.toString());
        sb.append("filterType=").append(String.valueOf(this.filterType));
        sb.append(", filterId=").append(String.valueOf(this.filterId));
        sb.append(", riskThreshold=").append(String.valueOf(this.riskThreshold));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceRiskScoreAggregationCollection)) {
            return false;
        }

        ResourceRiskScoreAggregationCollection other = (ResourceRiskScoreAggregationCollection) o;
        return java.util.Objects.equals(this.filterType, other.filterType)
                && java.util.Objects.equals(this.filterId, other.filterId)
                && java.util.Objects.equals(this.riskThreshold, other.riskThreshold)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.filterType == null ? 43 : this.filterType.hashCode());
        result = (result * PRIME) + (this.filterId == null ? 43 : this.filterId.hashCode());
        result =
                (result * PRIME)
                        + (this.riskThreshold == null ? 43 : this.riskThreshold.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
