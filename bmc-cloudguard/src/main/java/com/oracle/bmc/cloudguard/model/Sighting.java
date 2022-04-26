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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Sighting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Sighting {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalId")
        private String actorPrincipalId;

        public Builder actorPrincipalId(String actorPrincipalId) {
            this.actorPrincipalId = actorPrincipalId;
            this.__explicitlySet__.add("actorPrincipalId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalName")
        private String actorPrincipalName;

        public Builder actorPrincipalName(String actorPrincipalName) {
            this.actorPrincipalName = actorPrincipalName;
            this.__explicitlySet__.add("actorPrincipalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalType")
        private String actorPrincipalType;

        public Builder actorPrincipalType(String actorPrincipalType) {
            this.actorPrincipalType = actorPrincipalType;
            this.__explicitlySet__.add("actorPrincipalType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("classificationStatus")
        private ClassificationStatus classificationStatus;

        public Builder classificationStatus(ClassificationStatus classificationStatus) {
            this.classificationStatus = classificationStatus;
            this.__explicitlySet__.add("classificationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
        private String sightingType;

        public Builder sightingType(String sightingType) {
            this.sightingType = sightingType;
            this.__explicitlySet__.add("sightingType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
        private String sightingTypeDisplayName;

        public Builder sightingTypeDisplayName(String sightingTypeDisplayName) {
            this.sightingTypeDisplayName = sightingTypeDisplayName;
            this.__explicitlySet__.add("sightingTypeDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tacticName")
        private String tacticName;

        public Builder tacticName(String tacticName) {
            this.tacticName = tacticName;
            this.__explicitlySet__.add("tacticName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("techniqueName")
        private String techniqueName;

        public Builder techniqueName(String techniqueName) {
            this.techniqueName = techniqueName;
            this.__explicitlySet__.add("techniqueName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sightingScore")
        private Integer sightingScore;

        public Builder sightingScore(Integer sightingScore) {
            this.sightingScore = sightingScore;
            this.__explicitlySet__.add("sightingScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Confidence confidence;

        public Builder confidence(Confidence confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
        private java.util.Date timeFirstDetected;

        public Builder timeFirstDetected(java.util.Date timeFirstDetected) {
            this.timeFirstDetected = timeFirstDetected;
            this.__explicitlySet__.add("timeFirstDetected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

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

    /**
     * Unique identifier for sighting event
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Description of the sighting event
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Problem Id to which the Sighting is associated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    String problemId;

    /**
     * Compartment Id where the resource is created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Unique identifier for principal actor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalId")
    String actorPrincipalId;

    /**
     * Name of the principal actor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalName")
    String actorPrincipalName;

    /**
     * Type of the principal actor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalType")
    String actorPrincipalType;

    /**
     * ClassificationStatus of the sighting event
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classificationStatus")
    ClassificationStatus classificationStatus;

    /**
     * Identifier for the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
    String sightingType;

    /**
     * Display name of the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
    String sightingTypeDisplayName;

    /**
     * Name of the Mitre att&ck tactic
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tacticName")
    String tacticName;

    /**
     * Name of the Mitre att&ck technique
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("techniqueName")
    String techniqueName;

    /**
     * Score for the sighting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingScore")
    Integer sightingScore;

    /**
     * Severity of the sighting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    Severity severity;

    /**
     * Confidence of the sighting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    Confidence confidence;

    /**
     * The date and time the sighting was first detected. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
    java.util.Date timeFirstDetected;

    /**
     * The date and time the sighting was last detected. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    java.util.Date timeLastDetected;

    /**
     * regions involved in the sighting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    java.util.List<String> regions;

    /**
     * The additional details of the Sighting
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    java.util.Map<String, String> additionalDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
