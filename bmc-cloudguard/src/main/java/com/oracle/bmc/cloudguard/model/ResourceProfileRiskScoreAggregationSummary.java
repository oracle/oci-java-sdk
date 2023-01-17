/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Resource profile risk score trend-line <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceProfileRiskScoreAggregationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ResourceProfileRiskScoreAggregationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceProfileId",
        "resourceProfileDisplayName",
        "riskThreshold",
        "items"
    })
    public ResourceProfileRiskScoreAggregationSummary(
            String resourceProfileId,
            String resourceProfileDisplayName,
            Integer riskThreshold,
            java.util.List<ResourceRiskScoreAggregation> items) {
        super();
        this.resourceProfileId = resourceProfileId;
        this.resourceProfileDisplayName = resourceProfileDisplayName;
        this.riskThreshold = riskThreshold;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID for the resource profile */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceProfileId")
        private String resourceProfileId;

        /**
         * OCID for the resource profile
         *
         * @param resourceProfileId the value to set
         * @return this builder
         */
        public Builder resourceProfileId(String resourceProfileId) {
            this.resourceProfileId = resourceProfileId;
            this.__explicitlySet__.add("resourceProfileId");
            return this;
        }
        /** Display name for the resource profile */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceProfileDisplayName")
        private String resourceProfileDisplayName;

        /**
         * Display name for the resource profile
         *
         * @param resourceProfileDisplayName the value to set
         * @return this builder
         */
        public Builder resourceProfileDisplayName(String resourceProfileDisplayName) {
            this.resourceProfileDisplayName = resourceProfileDisplayName;
            this.__explicitlySet__.add("resourceProfileDisplayName");
            return this;
        }
        /** Risk threshold */
        @com.fasterxml.jackson.annotation.JsonProperty("riskThreshold")
        private Integer riskThreshold;

        /**
         * Risk threshold
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

        public ResourceProfileRiskScoreAggregationSummary build() {
            ResourceProfileRiskScoreAggregationSummary model =
                    new ResourceProfileRiskScoreAggregationSummary(
                            this.resourceProfileId,
                            this.resourceProfileDisplayName,
                            this.riskThreshold,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceProfileRiskScoreAggregationSummary model) {
            if (model.wasPropertyExplicitlySet("resourceProfileId")) {
                this.resourceProfileId(model.getResourceProfileId());
            }
            if (model.wasPropertyExplicitlySet("resourceProfileDisplayName")) {
                this.resourceProfileDisplayName(model.getResourceProfileDisplayName());
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

    /** OCID for the resource profile */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceProfileId")
    private final String resourceProfileId;

    /**
     * OCID for the resource profile
     *
     * @return the value
     */
    public String getResourceProfileId() {
        return resourceProfileId;
    }

    /** Display name for the resource profile */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceProfileDisplayName")
    private final String resourceProfileDisplayName;

    /**
     * Display name for the resource profile
     *
     * @return the value
     */
    public String getResourceProfileDisplayName() {
        return resourceProfileDisplayName;
    }

    /** Risk threshold */
    @com.fasterxml.jackson.annotation.JsonProperty("riskThreshold")
    private final Integer riskThreshold;

    /**
     * Risk threshold
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
        sb.append("ResourceProfileRiskScoreAggregationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("resourceProfileId=").append(String.valueOf(this.resourceProfileId));
        sb.append(", resourceProfileDisplayName=")
                .append(String.valueOf(this.resourceProfileDisplayName));
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
        if (!(o instanceof ResourceProfileRiskScoreAggregationSummary)) {
            return false;
        }

        ResourceProfileRiskScoreAggregationSummary other =
                (ResourceProfileRiskScoreAggregationSummary) o;
        return java.util.Objects.equals(this.resourceProfileId, other.resourceProfileId)
                && java.util.Objects.equals(
                        this.resourceProfileDisplayName, other.resourceProfileDisplayName)
                && java.util.Objects.equals(this.riskThreshold, other.riskThreshold)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceProfileId == null ? 43 : this.resourceProfileId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceProfileDisplayName == null
                                ? 43
                                : this.resourceProfileDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.riskThreshold == null ? 43 : this.riskThreshold.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
