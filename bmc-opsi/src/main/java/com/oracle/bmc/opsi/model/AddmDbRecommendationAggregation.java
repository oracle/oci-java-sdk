/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summarizes a specific ADDM recommendation
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddmDbRecommendationAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddmDbRecommendationAggregation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "type",
        "message",
        "requiresDbRestart",
        "implementActions",
        "rationale",
        "maxBenefitPercent",
        "overallBenefitPercent",
        "maxBenefitAvgActiveSessions",
        "frequencyCount",
        "relatedObject"
    })
    public AddmDbRecommendationAggregation(
            String id,
            String type,
            String message,
            String requiresDbRestart,
            java.util.List<String> implementActions,
            String rationale,
            Double maxBenefitPercent,
            Double overallBenefitPercent,
            Double maxBenefitAvgActiveSessions,
            Integer frequencyCount,
            RelatedObjectTypeDetails relatedObject) {
        super();
        this.id = id;
        this.type = type;
        this.message = message;
        this.requiresDbRestart = requiresDbRestart;
        this.implementActions = implementActions;
        this.rationale = rationale;
        this.maxBenefitPercent = maxBenefitPercent;
        this.overallBenefitPercent = overallBenefitPercent;
        this.maxBenefitAvgActiveSessions = maxBenefitAvgActiveSessions;
        this.frequencyCount = frequencyCount;
        this.relatedObject = relatedObject;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Type of recommendation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of recommendation
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Recommendation message
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Recommendation message
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * Indicates implementation of the recommended action requires a database restart in order for it
         * to take effect. Possible values "Y", "N" and null.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requiresDbRestart")
        private String requiresDbRestart;

        /**
         * Indicates implementation of the recommended action requires a database restart in order for it
         * to take effect. Possible values "Y", "N" and null.
         *
         * @param requiresDbRestart the value to set
         * @return this builder
         **/
        public Builder requiresDbRestart(String requiresDbRestart) {
            this.requiresDbRestart = requiresDbRestart;
            this.__explicitlySet__.add("requiresDbRestart");
            return this;
        }
        /**
         * Actions that can be performed to implement the recommendation (such as 'ALTER PARAMETER',
         * 'RUN SQL TUNING ADVISOR')
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("implementActions")
        private java.util.List<String> implementActions;

        /**
         * Actions that can be performed to implement the recommendation (such as 'ALTER PARAMETER',
         * 'RUN SQL TUNING ADVISOR')
         *
         * @param implementActions the value to set
         * @return this builder
         **/
        public Builder implementActions(java.util.List<String> implementActions) {
            this.implementActions = implementActions;
            this.__explicitlySet__.add("implementActions");
            return this;
        }
        /**
         * Recommendation message
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rationale")
        private String rationale;

        /**
         * Recommendation message
         * @param rationale the value to set
         * @return this builder
         **/
        public Builder rationale(String rationale) {
            this.rationale = rationale;
            this.__explicitlySet__.add("rationale");
            return this;
        }
        /**
         * Maximum estimated benefit in terms of percentage of total activity
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitPercent")
        private Double maxBenefitPercent;

        /**
         * Maximum estimated benefit in terms of percentage of total activity
         * @param maxBenefitPercent the value to set
         * @return this builder
         **/
        public Builder maxBenefitPercent(Double maxBenefitPercent) {
            this.maxBenefitPercent = maxBenefitPercent;
            this.__explicitlySet__.add("maxBenefitPercent");
            return this;
        }
        /**
         * Overall estimated benefit in terms of percentage of total activity
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("overallBenefitPercent")
        private Double overallBenefitPercent;

        /**
         * Overall estimated benefit in terms of percentage of total activity
         * @param overallBenefitPercent the value to set
         * @return this builder
         **/
        public Builder overallBenefitPercent(Double overallBenefitPercent) {
            this.overallBenefitPercent = overallBenefitPercent;
            this.__explicitlySet__.add("overallBenefitPercent");
            return this;
        }
        /**
         * Maximum estimated benefit in terms of average active sessions
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitAvgActiveSessions")
        private Double maxBenefitAvgActiveSessions;

        /**
         * Maximum estimated benefit in terms of average active sessions
         * @param maxBenefitAvgActiveSessions the value to set
         * @return this builder
         **/
        public Builder maxBenefitAvgActiveSessions(Double maxBenefitAvgActiveSessions) {
            this.maxBenefitAvgActiveSessions = maxBenefitAvgActiveSessions;
            this.__explicitlySet__.add("maxBenefitAvgActiveSessions");
            return this;
        }
        /**
         * Number of occurrences for this recommendation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("frequencyCount")
        private Integer frequencyCount;

        /**
         * Number of occurrences for this recommendation
         * @param frequencyCount the value to set
         * @return this builder
         **/
        public Builder frequencyCount(Integer frequencyCount) {
            this.frequencyCount = frequencyCount;
            this.__explicitlySet__.add("frequencyCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedObject")
        private RelatedObjectTypeDetails relatedObject;

        public Builder relatedObject(RelatedObjectTypeDetails relatedObject) {
            this.relatedObject = relatedObject;
            this.__explicitlySet__.add("relatedObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddmDbRecommendationAggregation build() {
            AddmDbRecommendationAggregation model =
                    new AddmDbRecommendationAggregation(
                            this.id,
                            this.type,
                            this.message,
                            this.requiresDbRestart,
                            this.implementActions,
                            this.rationale,
                            this.maxBenefitPercent,
                            this.overallBenefitPercent,
                            this.maxBenefitAvgActiveSessions,
                            this.frequencyCount,
                            this.relatedObject);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddmDbRecommendationAggregation model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("requiresDbRestart")) {
                this.requiresDbRestart(model.getRequiresDbRestart());
            }
            if (model.wasPropertyExplicitlySet("implementActions")) {
                this.implementActions(model.getImplementActions());
            }
            if (model.wasPropertyExplicitlySet("rationale")) {
                this.rationale(model.getRationale());
            }
            if (model.wasPropertyExplicitlySet("maxBenefitPercent")) {
                this.maxBenefitPercent(model.getMaxBenefitPercent());
            }
            if (model.wasPropertyExplicitlySet("overallBenefitPercent")) {
                this.overallBenefitPercent(model.getOverallBenefitPercent());
            }
            if (model.wasPropertyExplicitlySet("maxBenefitAvgActiveSessions")) {
                this.maxBenefitAvgActiveSessions(model.getMaxBenefitAvgActiveSessions());
            }
            if (model.wasPropertyExplicitlySet("frequencyCount")) {
                this.frequencyCount(model.getFrequencyCount());
            }
            if (model.wasPropertyExplicitlySet("relatedObject")) {
                this.relatedObject(model.getRelatedObject());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Type of recommendation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of recommendation
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Recommendation message
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Recommendation message
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    /**
     * Indicates implementation of the recommended action requires a database restart in order for it
     * to take effect. Possible values "Y", "N" and null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requiresDbRestart")
    private final String requiresDbRestart;

    /**
     * Indicates implementation of the recommended action requires a database restart in order for it
     * to take effect. Possible values "Y", "N" and null.
     *
     * @return the value
     **/
    public String getRequiresDbRestart() {
        return requiresDbRestart;
    }

    /**
     * Actions that can be performed to implement the recommendation (such as 'ALTER PARAMETER',
     * 'RUN SQL TUNING ADVISOR')
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("implementActions")
    private final java.util.List<String> implementActions;

    /**
     * Actions that can be performed to implement the recommendation (such as 'ALTER PARAMETER',
     * 'RUN SQL TUNING ADVISOR')
     *
     * @return the value
     **/
    public java.util.List<String> getImplementActions() {
        return implementActions;
    }

    /**
     * Recommendation message
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rationale")
    private final String rationale;

    /**
     * Recommendation message
     * @return the value
     **/
    public String getRationale() {
        return rationale;
    }

    /**
     * Maximum estimated benefit in terms of percentage of total activity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitPercent")
    private final Double maxBenefitPercent;

    /**
     * Maximum estimated benefit in terms of percentage of total activity
     * @return the value
     **/
    public Double getMaxBenefitPercent() {
        return maxBenefitPercent;
    }

    /**
     * Overall estimated benefit in terms of percentage of total activity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overallBenefitPercent")
    private final Double overallBenefitPercent;

    /**
     * Overall estimated benefit in terms of percentage of total activity
     * @return the value
     **/
    public Double getOverallBenefitPercent() {
        return overallBenefitPercent;
    }

    /**
     * Maximum estimated benefit in terms of average active sessions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitAvgActiveSessions")
    private final Double maxBenefitAvgActiveSessions;

    /**
     * Maximum estimated benefit in terms of average active sessions
     * @return the value
     **/
    public Double getMaxBenefitAvgActiveSessions() {
        return maxBenefitAvgActiveSessions;
    }

    /**
     * Number of occurrences for this recommendation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyCount")
    private final Integer frequencyCount;

    /**
     * Number of occurrences for this recommendation
     * @return the value
     **/
    public Integer getFrequencyCount() {
        return frequencyCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("relatedObject")
    private final RelatedObjectTypeDetails relatedObject;

    public RelatedObjectTypeDetails getRelatedObject() {
        return relatedObject;
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
        sb.append("AddmDbRecommendationAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", requiresDbRestart=").append(String.valueOf(this.requiresDbRestart));
        sb.append(", implementActions=").append(String.valueOf(this.implementActions));
        sb.append(", rationale=").append(String.valueOf(this.rationale));
        sb.append(", maxBenefitPercent=").append(String.valueOf(this.maxBenefitPercent));
        sb.append(", overallBenefitPercent=").append(String.valueOf(this.overallBenefitPercent));
        sb.append(", maxBenefitAvgActiveSessions=")
                .append(String.valueOf(this.maxBenefitAvgActiveSessions));
        sb.append(", frequencyCount=").append(String.valueOf(this.frequencyCount));
        sb.append(", relatedObject=").append(String.valueOf(this.relatedObject));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddmDbRecommendationAggregation)) {
            return false;
        }

        AddmDbRecommendationAggregation other = (AddmDbRecommendationAggregation) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.requiresDbRestart, other.requiresDbRestart)
                && java.util.Objects.equals(this.implementActions, other.implementActions)
                && java.util.Objects.equals(this.rationale, other.rationale)
                && java.util.Objects.equals(this.maxBenefitPercent, other.maxBenefitPercent)
                && java.util.Objects.equals(this.overallBenefitPercent, other.overallBenefitPercent)
                && java.util.Objects.equals(
                        this.maxBenefitAvgActiveSessions, other.maxBenefitAvgActiveSessions)
                && java.util.Objects.equals(this.frequencyCount, other.frequencyCount)
                && java.util.Objects.equals(this.relatedObject, other.relatedObject)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.requiresDbRestart == null ? 43 : this.requiresDbRestart.hashCode());
        result =
                (result * PRIME)
                        + (this.implementActions == null ? 43 : this.implementActions.hashCode());
        result = (result * PRIME) + (this.rationale == null ? 43 : this.rationale.hashCode());
        result =
                (result * PRIME)
                        + (this.maxBenefitPercent == null ? 43 : this.maxBenefitPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.overallBenefitPercent == null
                                ? 43
                                : this.overallBenefitPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.maxBenefitAvgActiveSessions == null
                                ? 43
                                : this.maxBenefitAvgActiveSessions.hashCode());
        result =
                (result * PRIME)
                        + (this.frequencyCount == null ? 43 : this.frequencyCount.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedObject == null ? 43 : this.relatedObject.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
