/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details of recommendation to be processed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProcessRecommendationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProcessRecommendationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"recommendationKey", "recommendationStatus", "properties"})
    public ProcessRecommendationDetails(
            String recommendationKey,
            RecommendationStatus recommendationStatus,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.recommendationKey = recommendationKey;
        this.recommendationStatus = recommendationStatus;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier of the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendationKey")
        private String recommendationKey;

        /**
         * Unique identifier of the recommendation.
         *
         * @param recommendationKey the value to set
         * @return this builder
         */
        public Builder recommendationKey(String recommendationKey) {
            this.recommendationKey = recommendationKey;
            this.__explicitlySet__.add("recommendationKey");
            return this;
        }
        /** The status of a recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendationStatus")
        private RecommendationStatus recommendationStatus;

        /**
         * The status of a recommendation.
         *
         * @param recommendationStatus the value to set
         * @return this builder
         */
        public Builder recommendationStatus(RecommendationStatus recommendationStatus) {
            this.recommendationStatus = recommendationStatus;
            this.__explicitlySet__.add("recommendationStatus");
            return this;
        }
        /**
         * A map of maps that contains additional properties which are specific to the associated
         * objects. Each associated object defines it's set of required and optional properties.
         * Example: {@code { "DataEntity": { "parentId": "entityId" }, "Term": { "parentId":
         * "glossaryId" } }}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains additional properties which are specific to the associated
         * objects. Each associated object defines it's set of required and optional properties.
         * Example: {@code { "DataEntity": { "parentId": "entityId" }, "Term": { "parentId":
         * "glossaryId" } }}
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProcessRecommendationDetails build() {
            ProcessRecommendationDetails model =
                    new ProcessRecommendationDetails(
                            this.recommendationKey, this.recommendationStatus, this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProcessRecommendationDetails model) {
            if (model.wasPropertyExplicitlySet("recommendationKey")) {
                this.recommendationKey(model.getRecommendationKey());
            }
            if (model.wasPropertyExplicitlySet("recommendationStatus")) {
                this.recommendationStatus(model.getRecommendationStatus());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /** Unique identifier of the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationKey")
    private final String recommendationKey;

    /**
     * Unique identifier of the recommendation.
     *
     * @return the value
     */
    public String getRecommendationKey() {
        return recommendationKey;
    }

    /** The status of a recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationStatus")
    private final RecommendationStatus recommendationStatus;

    /**
     * The status of a recommendation.
     *
     * @return the value
     */
    public RecommendationStatus getRecommendationStatus() {
        return recommendationStatus;
    }

    /**
     * A map of maps that contains additional properties which are specific to the associated
     * objects. Each associated object defines it's set of required and optional properties.
     * Example: {@code { "DataEntity": { "parentId": "entityId" }, "Term": { "parentId":
     * "glossaryId" } }}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains additional properties which are specific to the associated
     * objects. Each associated object defines it's set of required and optional properties.
     * Example: {@code { "DataEntity": { "parentId": "entityId" }, "Term": { "parentId":
     * "glossaryId" } }}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
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
        sb.append("ProcessRecommendationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("recommendationKey=").append(String.valueOf(this.recommendationKey));
        sb.append(", recommendationStatus=").append(String.valueOf(this.recommendationStatus));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProcessRecommendationDetails)) {
            return false;
        }

        ProcessRecommendationDetails other = (ProcessRecommendationDetails) o;
        return java.util.Objects.equals(this.recommendationKey, other.recommendationKey)
                && java.util.Objects.equals(this.recommendationStatus, other.recommendationStatus)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.recommendationKey == null ? 43 : this.recommendationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationStatus == null
                                ? 43
                                : this.recommendationStatus.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
