/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary information for a resource profile. <br>
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
        builder = ResourceProfileSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceProfileSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sightingsCount",
        "id",
        "resourceId",
        "displayName",
        "type",
        "riskScore",
        "tactics",
        "timeFirstDetected",
        "timeLastDetected",
        "timeFirstOccurred",
        "timeLastOccurred",
        "problemsCount"
    })
    public ResourceProfileSummary(
            Integer sightingsCount,
            String id,
            String resourceId,
            String displayName,
            String type,
            Double riskScore,
            java.util.List<TacticSummary> tactics,
            java.util.Date timeFirstDetected,
            java.util.Date timeLastDetected,
            java.util.Date timeFirstOccurred,
            java.util.Date timeLastOccurred,
            Integer problemsCount) {
        super();
        this.sightingsCount = sightingsCount;
        this.id = id;
        this.resourceId = resourceId;
        this.displayName = displayName;
        this.type = type;
        this.riskScore = riskScore;
        this.tactics = tactics;
        this.timeFirstDetected = timeFirstDetected;
        this.timeLastDetected = timeLastDetected;
        this.timeFirstOccurred = timeFirstOccurred;
        this.timeLastOccurred = timeLastOccurred;
        this.problemsCount = problemsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of sightings associated with the resource profile */
        @com.fasterxml.jackson.annotation.JsonProperty("sightingsCount")
        private Integer sightingsCount;

        /**
         * Number of sightings associated with the resource profile
         *
         * @param sightingsCount the value to set
         * @return this builder
         */
        public Builder sightingsCount(Integer sightingsCount) {
            this.sightingsCount = sightingsCount;
            this.__explicitlySet__.add("sightingsCount");
            return this;
        }
        /** Unique identifier for the resource profile */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for the resource profile
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Unique identifier for the resource associated with the resource profile */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Unique identifier for the resource associated with the resource profile
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Display name for the resource profile */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the resource profile
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Resource type for the resource profile */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Resource type for the resource profile
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Risk score for the resource profile */
        @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
        private Double riskScore;

        /**
         * Risk score for the resource profile
         *
         * @param riskScore the value to set
         * @return this builder
         */
        public Builder riskScore(Double riskScore) {
            this.riskScore = riskScore;
            this.__explicitlySet__.add("riskScore");
            return this;
        }
        /** List of tactic summaries associated with the resource profile */
        @com.fasterxml.jackson.annotation.JsonProperty("tactics")
        private java.util.List<TacticSummary> tactics;

        /**
         * List of tactic summaries associated with the resource profile
         *
         * @param tactics the value to set
         * @return this builder
         */
        public Builder tactics(java.util.List<TacticSummary> tactics) {
            this.tactics = tactics;
            this.__explicitlySet__.add("tactics");
            return this;
        }
        /** Time the activities were first detected. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
        private java.util.Date timeFirstDetected;

        /**
         * Time the activities were first detected. Format defined by RFC3339.
         *
         * @param timeFirstDetected the value to set
         * @return this builder
         */
        public Builder timeFirstDetected(java.util.Date timeFirstDetected) {
            this.timeFirstDetected = timeFirstDetected;
            this.__explicitlySet__.add("timeFirstDetected");
            return this;
        }
        /** Time the activities were last detected. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        /**
         * Time the activities were last detected. Format defined by RFC3339.
         *
         * @param timeLastDetected the value to set
         * @return this builder
         */
        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }
        /** Time the activities were first performed. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstOccurred")
        private java.util.Date timeFirstOccurred;

        /**
         * Time the activities were first performed. Format defined by RFC3339.
         *
         * @param timeFirstOccurred the value to set
         * @return this builder
         */
        public Builder timeFirstOccurred(java.util.Date timeFirstOccurred) {
            this.timeFirstOccurred = timeFirstOccurred;
            this.__explicitlySet__.add("timeFirstOccurred");
            return this;
        }
        /** Time the activities were last performed. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastOccurred")
        private java.util.Date timeLastOccurred;

        /**
         * Time the activities were last performed. Format defined by RFC3339.
         *
         * @param timeLastOccurred the value to set
         * @return this builder
         */
        public Builder timeLastOccurred(java.util.Date timeLastOccurred) {
            this.timeLastOccurred = timeLastOccurred;
            this.__explicitlySet__.add("timeLastOccurred");
            return this;
        }
        /** Number of problems associated with this resource profile */
        @com.fasterxml.jackson.annotation.JsonProperty("problemsCount")
        private Integer problemsCount;

        /**
         * Number of problems associated with this resource profile
         *
         * @param problemsCount the value to set
         * @return this builder
         */
        public Builder problemsCount(Integer problemsCount) {
            this.problemsCount = problemsCount;
            this.__explicitlySet__.add("problemsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceProfileSummary build() {
            ResourceProfileSummary model =
                    new ResourceProfileSummary(
                            this.sightingsCount,
                            this.id,
                            this.resourceId,
                            this.displayName,
                            this.type,
                            this.riskScore,
                            this.tactics,
                            this.timeFirstDetected,
                            this.timeLastDetected,
                            this.timeFirstOccurred,
                            this.timeLastOccurred,
                            this.problemsCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceProfileSummary model) {
            if (model.wasPropertyExplicitlySet("sightingsCount")) {
                this.sightingsCount(model.getSightingsCount());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("riskScore")) {
                this.riskScore(model.getRiskScore());
            }
            if (model.wasPropertyExplicitlySet("tactics")) {
                this.tactics(model.getTactics());
            }
            if (model.wasPropertyExplicitlySet("timeFirstDetected")) {
                this.timeFirstDetected(model.getTimeFirstDetected());
            }
            if (model.wasPropertyExplicitlySet("timeLastDetected")) {
                this.timeLastDetected(model.getTimeLastDetected());
            }
            if (model.wasPropertyExplicitlySet("timeFirstOccurred")) {
                this.timeFirstOccurred(model.getTimeFirstOccurred());
            }
            if (model.wasPropertyExplicitlySet("timeLastOccurred")) {
                this.timeLastOccurred(model.getTimeLastOccurred());
            }
            if (model.wasPropertyExplicitlySet("problemsCount")) {
                this.problemsCount(model.getProblemsCount());
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

    /** Number of sightings associated with the resource profile */
    @com.fasterxml.jackson.annotation.JsonProperty("sightingsCount")
    private final Integer sightingsCount;

    /**
     * Number of sightings associated with the resource profile
     *
     * @return the value
     */
    public Integer getSightingsCount() {
        return sightingsCount;
    }

    /** Unique identifier for the resource profile */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for the resource profile
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Unique identifier for the resource associated with the resource profile */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Unique identifier for the resource associated with the resource profile
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Display name for the resource profile */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the resource profile
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Resource type for the resource profile */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Resource type for the resource profile
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Risk score for the resource profile */
    @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
    private final Double riskScore;

    /**
     * Risk score for the resource profile
     *
     * @return the value
     */
    public Double getRiskScore() {
        return riskScore;
    }

    /** List of tactic summaries associated with the resource profile */
    @com.fasterxml.jackson.annotation.JsonProperty("tactics")
    private final java.util.List<TacticSummary> tactics;

    /**
     * List of tactic summaries associated with the resource profile
     *
     * @return the value
     */
    public java.util.List<TacticSummary> getTactics() {
        return tactics;
    }

    /** Time the activities were first detected. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
    private final java.util.Date timeFirstDetected;

    /**
     * Time the activities were first detected. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeFirstDetected() {
        return timeFirstDetected;
    }

    /** Time the activities were last detected. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    private final java.util.Date timeLastDetected;

    /**
     * Time the activities were last detected. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeLastDetected() {
        return timeLastDetected;
    }

    /** Time the activities were first performed. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstOccurred")
    private final java.util.Date timeFirstOccurred;

    /**
     * Time the activities were first performed. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeFirstOccurred() {
        return timeFirstOccurred;
    }

    /** Time the activities were last performed. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastOccurred")
    private final java.util.Date timeLastOccurred;

    /**
     * Time the activities were last performed. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeLastOccurred() {
        return timeLastOccurred;
    }

    /** Number of problems associated with this resource profile */
    @com.fasterxml.jackson.annotation.JsonProperty("problemsCount")
    private final Integer problemsCount;

    /**
     * Number of problems associated with this resource profile
     *
     * @return the value
     */
    public Integer getProblemsCount() {
        return problemsCount;
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
        sb.append("ResourceProfileSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sightingsCount=").append(String.valueOf(this.sightingsCount));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", riskScore=").append(String.valueOf(this.riskScore));
        sb.append(", tactics=").append(String.valueOf(this.tactics));
        sb.append(", timeFirstDetected=").append(String.valueOf(this.timeFirstDetected));
        sb.append(", timeLastDetected=").append(String.valueOf(this.timeLastDetected));
        sb.append(", timeFirstOccurred=").append(String.valueOf(this.timeFirstOccurred));
        sb.append(", timeLastOccurred=").append(String.valueOf(this.timeLastOccurred));
        sb.append(", problemsCount=").append(String.valueOf(this.problemsCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceProfileSummary)) {
            return false;
        }

        ResourceProfileSummary other = (ResourceProfileSummary) o;
        return java.util.Objects.equals(this.sightingsCount, other.sightingsCount)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.riskScore, other.riskScore)
                && java.util.Objects.equals(this.tactics, other.tactics)
                && java.util.Objects.equals(this.timeFirstDetected, other.timeFirstDetected)
                && java.util.Objects.equals(this.timeLastDetected, other.timeLastDetected)
                && java.util.Objects.equals(this.timeFirstOccurred, other.timeFirstOccurred)
                && java.util.Objects.equals(this.timeLastOccurred, other.timeLastOccurred)
                && java.util.Objects.equals(this.problemsCount, other.problemsCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sightingsCount == null ? 43 : this.sightingsCount.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.riskScore == null ? 43 : this.riskScore.hashCode());
        result = (result * PRIME) + (this.tactics == null ? 43 : this.tactics.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstDetected == null ? 43 : this.timeFirstDetected.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDetected == null ? 43 : this.timeLastDetected.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstOccurred == null ? 43 : this.timeFirstOccurred.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastOccurred == null ? 43 : this.timeLastOccurred.hashCode());
        result =
                (result * PRIME)
                        + (this.problemsCount == null ? 43 : this.problemsCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
