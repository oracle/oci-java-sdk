/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summarizes a specific ADDM finding <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddmDbFindingAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddmDbFindingAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "findingId",
        "categoryName",
        "categoryDisplayName",
        "name",
        "message",
        "impactOverallPercent",
        "impactMaxPercent",
        "impactAvgActiveSessions",
        "frequencyCount",
        "recommendationCount"
    })
    public AddmDbFindingAggregation(
            String id,
            String findingId,
            String categoryName,
            String categoryDisplayName,
            String name,
            String message,
            Double impactOverallPercent,
            Double impactMaxPercent,
            Double impactAvgActiveSessions,
            Integer frequencyCount,
            Integer recommendationCount) {
        super();
        this.id = id;
        this.findingId = findingId;
        this.categoryName = categoryName;
        this.categoryDisplayName = categoryDisplayName;
        this.name = name;
        this.message = message;
        this.impactOverallPercent = impactOverallPercent;
        this.impactMaxPercent = impactMaxPercent;
        this.impactAvgActiveSessions = impactAvgActiveSessions;
        this.frequencyCount = frequencyCount;
        this.recommendationCount = recommendationCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database insight.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database insight.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Unique finding id */
        @com.fasterxml.jackson.annotation.JsonProperty("findingId")
        private String findingId;

        /**
         * Unique finding id
         *
         * @param findingId the value to set
         * @return this builder
         */
        public Builder findingId(String findingId) {
            this.findingId = findingId;
            this.__explicitlySet__.add("findingId");
            return this;
        }
        /** Category name */
        @com.fasterxml.jackson.annotation.JsonProperty("categoryName")
        private String categoryName;

        /**
         * Category name
         *
         * @param categoryName the value to set
         * @return this builder
         */
        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            this.__explicitlySet__.add("categoryName");
            return this;
        }
        /** Category display name */
        @com.fasterxml.jackson.annotation.JsonProperty("categoryDisplayName")
        private String categoryDisplayName;

        /**
         * Category display name
         *
         * @param categoryDisplayName the value to set
         * @return this builder
         */
        public Builder categoryDisplayName(String categoryDisplayName) {
            this.categoryDisplayName = categoryDisplayName;
            this.__explicitlySet__.add("categoryDisplayName");
            return this;
        }
        /** Finding name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Finding name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Finding message */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Finding message
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** Overall impact in terms of percentage of total activity */
        @com.fasterxml.jackson.annotation.JsonProperty("impactOverallPercent")
        private Double impactOverallPercent;

        /**
         * Overall impact in terms of percentage of total activity
         *
         * @param impactOverallPercent the value to set
         * @return this builder
         */
        public Builder impactOverallPercent(Double impactOverallPercent) {
            this.impactOverallPercent = impactOverallPercent;
            this.__explicitlySet__.add("impactOverallPercent");
            return this;
        }
        /** Maximum impact in terms of percentage of total activity */
        @com.fasterxml.jackson.annotation.JsonProperty("impactMaxPercent")
        private Double impactMaxPercent;

        /**
         * Maximum impact in terms of percentage of total activity
         *
         * @param impactMaxPercent the value to set
         * @return this builder
         */
        public Builder impactMaxPercent(Double impactMaxPercent) {
            this.impactMaxPercent = impactMaxPercent;
            this.__explicitlySet__.add("impactMaxPercent");
            return this;
        }
        /** Impact in terms of average active sessions */
        @com.fasterxml.jackson.annotation.JsonProperty("impactAvgActiveSessions")
        private Double impactAvgActiveSessions;

        /**
         * Impact in terms of average active sessions
         *
         * @param impactAvgActiveSessions the value to set
         * @return this builder
         */
        public Builder impactAvgActiveSessions(Double impactAvgActiveSessions) {
            this.impactAvgActiveSessions = impactAvgActiveSessions;
            this.__explicitlySet__.add("impactAvgActiveSessions");
            return this;
        }
        /** Number of occurrences for this finding */
        @com.fasterxml.jackson.annotation.JsonProperty("frequencyCount")
        private Integer frequencyCount;

        /**
         * Number of occurrences for this finding
         *
         * @param frequencyCount the value to set
         * @return this builder
         */
        public Builder frequencyCount(Integer frequencyCount) {
            this.frequencyCount = frequencyCount;
            this.__explicitlySet__.add("frequencyCount");
            return this;
        }
        /** Number of recommendations for this finding */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendationCount")
        private Integer recommendationCount;

        /**
         * Number of recommendations for this finding
         *
         * @param recommendationCount the value to set
         * @return this builder
         */
        public Builder recommendationCount(Integer recommendationCount) {
            this.recommendationCount = recommendationCount;
            this.__explicitlySet__.add("recommendationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddmDbFindingAggregation build() {
            AddmDbFindingAggregation model =
                    new AddmDbFindingAggregation(
                            this.id,
                            this.findingId,
                            this.categoryName,
                            this.categoryDisplayName,
                            this.name,
                            this.message,
                            this.impactOverallPercent,
                            this.impactMaxPercent,
                            this.impactAvgActiveSessions,
                            this.frequencyCount,
                            this.recommendationCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddmDbFindingAggregation model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("findingId")) {
                this.findingId(model.getFindingId());
            }
            if (model.wasPropertyExplicitlySet("categoryName")) {
                this.categoryName(model.getCategoryName());
            }
            if (model.wasPropertyExplicitlySet("categoryDisplayName")) {
                this.categoryDisplayName(model.getCategoryDisplayName());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("impactOverallPercent")) {
                this.impactOverallPercent(model.getImpactOverallPercent());
            }
            if (model.wasPropertyExplicitlySet("impactMaxPercent")) {
                this.impactMaxPercent(model.getImpactMaxPercent());
            }
            if (model.wasPropertyExplicitlySet("impactAvgActiveSessions")) {
                this.impactAvgActiveSessions(model.getImpactAvgActiveSessions());
            }
            if (model.wasPropertyExplicitlySet("frequencyCount")) {
                this.frequencyCount(model.getFrequencyCount());
            }
            if (model.wasPropertyExplicitlySet("recommendationCount")) {
                this.recommendationCount(model.getRecommendationCount());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database insight.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database insight.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Unique finding id */
    @com.fasterxml.jackson.annotation.JsonProperty("findingId")
    private final String findingId;

    /**
     * Unique finding id
     *
     * @return the value
     */
    public String getFindingId() {
        return findingId;
    }

    /** Category name */
    @com.fasterxml.jackson.annotation.JsonProperty("categoryName")
    private final String categoryName;

    /**
     * Category name
     *
     * @return the value
     */
    public String getCategoryName() {
        return categoryName;
    }

    /** Category display name */
    @com.fasterxml.jackson.annotation.JsonProperty("categoryDisplayName")
    private final String categoryDisplayName;

    /**
     * Category display name
     *
     * @return the value
     */
    public String getCategoryDisplayName() {
        return categoryDisplayName;
    }

    /** Finding name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Finding name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Finding message */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Finding message
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** Overall impact in terms of percentage of total activity */
    @com.fasterxml.jackson.annotation.JsonProperty("impactOverallPercent")
    private final Double impactOverallPercent;

    /**
     * Overall impact in terms of percentage of total activity
     *
     * @return the value
     */
    public Double getImpactOverallPercent() {
        return impactOverallPercent;
    }

    /** Maximum impact in terms of percentage of total activity */
    @com.fasterxml.jackson.annotation.JsonProperty("impactMaxPercent")
    private final Double impactMaxPercent;

    /**
     * Maximum impact in terms of percentage of total activity
     *
     * @return the value
     */
    public Double getImpactMaxPercent() {
        return impactMaxPercent;
    }

    /** Impact in terms of average active sessions */
    @com.fasterxml.jackson.annotation.JsonProperty("impactAvgActiveSessions")
    private final Double impactAvgActiveSessions;

    /**
     * Impact in terms of average active sessions
     *
     * @return the value
     */
    public Double getImpactAvgActiveSessions() {
        return impactAvgActiveSessions;
    }

    /** Number of occurrences for this finding */
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyCount")
    private final Integer frequencyCount;

    /**
     * Number of occurrences for this finding
     *
     * @return the value
     */
    public Integer getFrequencyCount() {
        return frequencyCount;
    }

    /** Number of recommendations for this finding */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationCount")
    private final Integer recommendationCount;

    /**
     * Number of recommendations for this finding
     *
     * @return the value
     */
    public Integer getRecommendationCount() {
        return recommendationCount;
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
        sb.append("AddmDbFindingAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", findingId=").append(String.valueOf(this.findingId));
        sb.append(", categoryName=").append(String.valueOf(this.categoryName));
        sb.append(", categoryDisplayName=").append(String.valueOf(this.categoryDisplayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", impactOverallPercent=").append(String.valueOf(this.impactOverallPercent));
        sb.append(", impactMaxPercent=").append(String.valueOf(this.impactMaxPercent));
        sb.append(", impactAvgActiveSessions=")
                .append(String.valueOf(this.impactAvgActiveSessions));
        sb.append(", frequencyCount=").append(String.valueOf(this.frequencyCount));
        sb.append(", recommendationCount=").append(String.valueOf(this.recommendationCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddmDbFindingAggregation)) {
            return false;
        }

        AddmDbFindingAggregation other = (AddmDbFindingAggregation) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.findingId, other.findingId)
                && java.util.Objects.equals(this.categoryName, other.categoryName)
                && java.util.Objects.equals(this.categoryDisplayName, other.categoryDisplayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.impactOverallPercent, other.impactOverallPercent)
                && java.util.Objects.equals(this.impactMaxPercent, other.impactMaxPercent)
                && java.util.Objects.equals(
                        this.impactAvgActiveSessions, other.impactAvgActiveSessions)
                && java.util.Objects.equals(this.frequencyCount, other.frequencyCount)
                && java.util.Objects.equals(this.recommendationCount, other.recommendationCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.findingId == null ? 43 : this.findingId.hashCode());
        result = (result * PRIME) + (this.categoryName == null ? 43 : this.categoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.categoryDisplayName == null
                                ? 43
                                : this.categoryDisplayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.impactOverallPercent == null
                                ? 43
                                : this.impactOverallPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.impactMaxPercent == null ? 43 : this.impactMaxPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.impactAvgActiveSessions == null
                                ? 43
                                : this.impactAvgActiveSessions.hashCode());
        result =
                (result * PRIME)
                        + (this.frequencyCount == null ? 43 : this.frequencyCount.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationCount == null
                                ? 43
                                : this.recommendationCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
