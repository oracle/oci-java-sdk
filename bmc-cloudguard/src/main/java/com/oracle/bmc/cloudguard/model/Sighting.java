/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Sighting details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Sighting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Sighting {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "description",
        "problemId",
        "compartmentId",
        "actorPrincipalId",
        "actorPrincipalName",
        "actorPrincipalType",
        "classificationStatus",
        "sightingType",
        "sightingTypeDisplayName",
        "tacticName",
        "techniqueName",
        "sightingScore",
        "severity",
        "confidence",
        "timeFirstDetected",
        "timeLastDetected",
        "regions",
        "additionalDetails"
    })
    public Sighting(
            String id,
            String description,
            String problemId,
            String compartmentId,
            String actorPrincipalId,
            String actorPrincipalName,
            String actorPrincipalType,
            ClassificationStatus classificationStatus,
            String sightingType,
            String sightingTypeDisplayName,
            String tacticName,
            String techniqueName,
            Integer sightingScore,
            Severity severity,
            Confidence confidence,
            java.util.Date timeFirstDetected,
            java.util.Date timeLastDetected,
            java.util.List<String> regions,
            java.util.Map<String, String> additionalDetails) {
        super();
        this.id = id;
        this.description = description;
        this.problemId = problemId;
        this.compartmentId = compartmentId;
        this.actorPrincipalId = actorPrincipalId;
        this.actorPrincipalName = actorPrincipalName;
        this.actorPrincipalType = actorPrincipalType;
        this.classificationStatus = classificationStatus;
        this.sightingType = sightingType;
        this.sightingTypeDisplayName = sightingTypeDisplayName;
        this.tacticName = tacticName;
        this.techniqueName = techniqueName;
        this.sightingScore = sightingScore;
        this.severity = severity;
        this.confidence = confidence;
        this.timeFirstDetected = timeFirstDetected;
        this.timeLastDetected = timeLastDetected;
        this.regions = regions;
        this.additionalDetails = additionalDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for sighting event
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for sighting event
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Description of the sighting event
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the sighting event
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Problem Id to which the Sighting is associated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * Problem Id to which the Sighting is associated
         * @param problemId the value to set
         * @return this builder
         **/
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /**
         * Compartment Id where the resource is created
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Id where the resource is created
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Unique identifier for principal actor
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalId")
        private String actorPrincipalId;

        /**
         * Unique identifier for principal actor
         * @param actorPrincipalId the value to set
         * @return this builder
         **/
        public Builder actorPrincipalId(String actorPrincipalId) {
            this.actorPrincipalId = actorPrincipalId;
            this.__explicitlySet__.add("actorPrincipalId");
            return this;
        }
        /**
         * Name of the principal actor
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalName")
        private String actorPrincipalName;

        /**
         * Name of the principal actor
         * @param actorPrincipalName the value to set
         * @return this builder
         **/
        public Builder actorPrincipalName(String actorPrincipalName) {
            this.actorPrincipalName = actorPrincipalName;
            this.__explicitlySet__.add("actorPrincipalName");
            return this;
        }
        /**
         * Type of the principal actor
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalType")
        private String actorPrincipalType;

        /**
         * Type of the principal actor
         * @param actorPrincipalType the value to set
         * @return this builder
         **/
        public Builder actorPrincipalType(String actorPrincipalType) {
            this.actorPrincipalType = actorPrincipalType;
            this.__explicitlySet__.add("actorPrincipalType");
            return this;
        }
        /**
         * ClassificationStatus of the sighting event
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classificationStatus")
        private ClassificationStatus classificationStatus;

        /**
         * ClassificationStatus of the sighting event
         * @param classificationStatus the value to set
         * @return this builder
         **/
        public Builder classificationStatus(ClassificationStatus classificationStatus) {
            this.classificationStatus = classificationStatus;
            this.__explicitlySet__.add("classificationStatus");
            return this;
        }
        /**
         * Identifier for the sighting type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
        private String sightingType;

        /**
         * Identifier for the sighting type
         * @param sightingType the value to set
         * @return this builder
         **/
        public Builder sightingType(String sightingType) {
            this.sightingType = sightingType;
            this.__explicitlySet__.add("sightingType");
            return this;
        }
        /**
         * Display name of the sighting type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
        private String sightingTypeDisplayName;

        /**
         * Display name of the sighting type
         * @param sightingTypeDisplayName the value to set
         * @return this builder
         **/
        public Builder sightingTypeDisplayName(String sightingTypeDisplayName) {
            this.sightingTypeDisplayName = sightingTypeDisplayName;
            this.__explicitlySet__.add("sightingTypeDisplayName");
            return this;
        }
        /**
         * Name of the Mitre att&ck tactic
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tacticName")
        private String tacticName;

        /**
         * Name of the Mitre att&ck tactic
         * @param tacticName the value to set
         * @return this builder
         **/
        public Builder tacticName(String tacticName) {
            this.tacticName = tacticName;
            this.__explicitlySet__.add("tacticName");
            return this;
        }
        /**
         * Name of the Mitre att&ck technique
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("techniqueName")
        private String techniqueName;

        /**
         * Name of the Mitre att&ck technique
         * @param techniqueName the value to set
         * @return this builder
         **/
        public Builder techniqueName(String techniqueName) {
            this.techniqueName = techniqueName;
            this.__explicitlySet__.add("techniqueName");
            return this;
        }
        /**
         * Score for the sighting
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sightingScore")
        private Integer sightingScore;

        /**
         * Score for the sighting
         * @param sightingScore the value to set
         * @return this builder
         **/
        public Builder sightingScore(Integer sightingScore) {
            this.sightingScore = sightingScore;
            this.__explicitlySet__.add("sightingScore");
            return this;
        }
        /**
         * Severity of the sighting
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * Severity of the sighting
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * Confidence of the sighting
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Confidence confidence;

        /**
         * Confidence of the sighting
         * @param confidence the value to set
         * @return this builder
         **/
        public Builder confidence(Confidence confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }
        /**
         * The date and time the sighting was first detected. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
        private java.util.Date timeFirstDetected;

        /**
         * The date and time the sighting was first detected. Format defined by RFC3339.
         * @param timeFirstDetected the value to set
         * @return this builder
         **/
        public Builder timeFirstDetected(java.util.Date timeFirstDetected) {
            this.timeFirstDetected = timeFirstDetected;
            this.__explicitlySet__.add("timeFirstDetected");
            return this;
        }
        /**
         * The date and time the sighting was last detected. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        /**
         * The date and time the sighting was last detected. Format defined by RFC3339.
         * @param timeLastDetected the value to set
         * @return this builder
         **/
        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }
        /**
         * regions involved in the sighting
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        /**
         * regions involved in the sighting
         * @param regions the value to set
         * @return this builder
         **/
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /**
         * The additional details of the Sighting
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        /**
         * The additional details of the Sighting
         * @param additionalDetails the value to set
         * @return this builder
         **/
        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Sighting build() {
            Sighting __instance__ =
                    new Sighting(
                            id,
                            description,
                            problemId,
                            compartmentId,
                            actorPrincipalId,
                            actorPrincipalName,
                            actorPrincipalType,
                            classificationStatus,
                            sightingType,
                            sightingTypeDisplayName,
                            tacticName,
                            techniqueName,
                            sightingScore,
                            severity,
                            confidence,
                            timeFirstDetected,
                            timeLastDetected,
                            regions,
                            additionalDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Sighting o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .description(o.getDescription())
                            .problemId(o.getProblemId())
                            .compartmentId(o.getCompartmentId())
                            .actorPrincipalId(o.getActorPrincipalId())
                            .actorPrincipalName(o.getActorPrincipalName())
                            .actorPrincipalType(o.getActorPrincipalType())
                            .classificationStatus(o.getClassificationStatus())
                            .sightingType(o.getSightingType())
                            .sightingTypeDisplayName(o.getSightingTypeDisplayName())
                            .tacticName(o.getTacticName())
                            .techniqueName(o.getTechniqueName())
                            .sightingScore(o.getSightingScore())
                            .severity(o.getSeverity())
                            .confidence(o.getConfidence())
                            .timeFirstDetected(o.getTimeFirstDetected())
                            .timeLastDetected(o.getTimeLastDetected())
                            .regions(o.getRegions())
                            .additionalDetails(o.getAdditionalDetails());

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
     * Unique identifier for sighting event
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for sighting event
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Description of the sighting event
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the sighting event
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Problem Id to which the Sighting is associated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * Problem Id to which the Sighting is associated
     * @return the value
     **/
    public String getProblemId() {
        return problemId;
    }

    /**
     * Compartment Id where the resource is created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Id where the resource is created
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Unique identifier for principal actor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalId")
    private final String actorPrincipalId;

    /**
     * Unique identifier for principal actor
     * @return the value
     **/
    public String getActorPrincipalId() {
        return actorPrincipalId;
    }

    /**
     * Name of the principal actor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalName")
    private final String actorPrincipalName;

    /**
     * Name of the principal actor
     * @return the value
     **/
    public String getActorPrincipalName() {
        return actorPrincipalName;
    }

    /**
     * Type of the principal actor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalType")
    private final String actorPrincipalType;

    /**
     * Type of the principal actor
     * @return the value
     **/
    public String getActorPrincipalType() {
        return actorPrincipalType;
    }

    /**
     * ClassificationStatus of the sighting event
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classificationStatus")
    private final ClassificationStatus classificationStatus;

    /**
     * ClassificationStatus of the sighting event
     * @return the value
     **/
    public ClassificationStatus getClassificationStatus() {
        return classificationStatus;
    }

    /**
     * Identifier for the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
    private final String sightingType;

    /**
     * Identifier for the sighting type
     * @return the value
     **/
    public String getSightingType() {
        return sightingType;
    }

    /**
     * Display name of the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
    private final String sightingTypeDisplayName;

    /**
     * Display name of the sighting type
     * @return the value
     **/
    public String getSightingTypeDisplayName() {
        return sightingTypeDisplayName;
    }

    /**
     * Name of the Mitre att&ck tactic
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tacticName")
    private final String tacticName;

    /**
     * Name of the Mitre att&ck tactic
     * @return the value
     **/
    public String getTacticName() {
        return tacticName;
    }

    /**
     * Name of the Mitre att&ck technique
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("techniqueName")
    private final String techniqueName;

    /**
     * Name of the Mitre att&ck technique
     * @return the value
     **/
    public String getTechniqueName() {
        return techniqueName;
    }

    /**
     * Score for the sighting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingScore")
    private final Integer sightingScore;

    /**
     * Score for the sighting
     * @return the value
     **/
    public Integer getSightingScore() {
        return sightingScore;
    }

    /**
     * Severity of the sighting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * Severity of the sighting
     * @return the value
     **/
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Confidence of the sighting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Confidence confidence;

    /**
     * Confidence of the sighting
     * @return the value
     **/
    public Confidence getConfidence() {
        return confidence;
    }

    /**
     * The date and time the sighting was first detected. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
    private final java.util.Date timeFirstDetected;

    /**
     * The date and time the sighting was first detected. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeFirstDetected() {
        return timeFirstDetected;
    }

    /**
     * The date and time the sighting was last detected. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    private final java.util.Date timeLastDetected;

    /**
     * The date and time the sighting was last detected. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeLastDetected() {
        return timeLastDetected;
    }

    /**
     * regions involved in the sighting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    /**
     * regions involved in the sighting
     * @return the value
     **/
    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * The additional details of the Sighting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    /**
     * The additional details of the Sighting
     * @return the value
     **/
    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
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
        sb.append("Sighting(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", problemId=").append(String.valueOf(this.problemId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", actorPrincipalId=").append(String.valueOf(this.actorPrincipalId));
        sb.append(", actorPrincipalName=").append(String.valueOf(this.actorPrincipalName));
        sb.append(", actorPrincipalType=").append(String.valueOf(this.actorPrincipalType));
        sb.append(", classificationStatus=").append(String.valueOf(this.classificationStatus));
        sb.append(", sightingType=").append(String.valueOf(this.sightingType));
        sb.append(", sightingTypeDisplayName=")
                .append(String.valueOf(this.sightingTypeDisplayName));
        sb.append(", tacticName=").append(String.valueOf(this.tacticName));
        sb.append(", techniqueName=").append(String.valueOf(this.techniqueName));
        sb.append(", sightingScore=").append(String.valueOf(this.sightingScore));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", timeFirstDetected=").append(String.valueOf(this.timeFirstDetected));
        sb.append(", timeLastDetected=").append(String.valueOf(this.timeLastDetected));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Sighting)) {
            return false;
        }

        Sighting other = (Sighting) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.problemId, other.problemId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.actorPrincipalId, other.actorPrincipalId)
                && java.util.Objects.equals(this.actorPrincipalName, other.actorPrincipalName)
                && java.util.Objects.equals(this.actorPrincipalType, other.actorPrincipalType)
                && java.util.Objects.equals(this.classificationStatus, other.classificationStatus)
                && java.util.Objects.equals(this.sightingType, other.sightingType)
                && java.util.Objects.equals(
                        this.sightingTypeDisplayName, other.sightingTypeDisplayName)
                && java.util.Objects.equals(this.tacticName, other.tacticName)
                && java.util.Objects.equals(this.techniqueName, other.techniqueName)
                && java.util.Objects.equals(this.sightingScore, other.sightingScore)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.timeFirstDetected, other.timeFirstDetected)
                && java.util.Objects.equals(this.timeLastDetected, other.timeLastDetected)
                && java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.problemId == null ? 43 : this.problemId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.actorPrincipalId == null ? 43 : this.actorPrincipalId.hashCode());
        result =
                (result * PRIME)
                        + (this.actorPrincipalName == null
                                ? 43
                                : this.actorPrincipalName.hashCode());
        result =
                (result * PRIME)
                        + (this.actorPrincipalType == null
                                ? 43
                                : this.actorPrincipalType.hashCode());
        result =
                (result * PRIME)
                        + (this.classificationStatus == null
                                ? 43
                                : this.classificationStatus.hashCode());
        result = (result * PRIME) + (this.sightingType == null ? 43 : this.sightingType.hashCode());
        result =
                (result * PRIME)
                        + (this.sightingTypeDisplayName == null
                                ? 43
                                : this.sightingTypeDisplayName.hashCode());
        result = (result * PRIME) + (this.tacticName == null ? 43 : this.tacticName.hashCode());
        result =
                (result * PRIME)
                        + (this.techniqueName == null ? 43 : this.techniqueName.hashCode());
        result =
                (result * PRIME)
                        + (this.sightingScore == null ? 43 : this.sightingScore.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstDetected == null ? 43 : this.timeFirstDetected.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDetected == null ? 43 : this.timeLastDetected.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
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
