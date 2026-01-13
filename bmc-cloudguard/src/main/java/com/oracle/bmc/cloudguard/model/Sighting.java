/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Sighting details. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Sighting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Sighting extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "timeFirstOccurred",
        "timeLastOccurred",
        "regions",
        "additionalDetails",
        "locks"
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
            java.util.Date timeFirstOccurred,
            java.util.Date timeLastOccurred,
            java.util.List<String> regions,
            java.util.Map<String, String> additionalDetails,
            java.util.List<ResourceLock> locks) {
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
        this.timeFirstOccurred = timeFirstOccurred;
        this.timeLastOccurred = timeLastOccurred;
        this.regions = regions;
        this.additionalDetails = additionalDetails;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for the sighting
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Description of the sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the sighting
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Problem ID associated the sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * Problem ID associated the sighting
         *
         * @param problemId the value to set
         * @return this builder
         */
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /** Compartment OCID where the resource is created */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID where the resource is created
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Unique identifier for principal actor */
        @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalId")
        private String actorPrincipalId;

        /**
         * Unique identifier for principal actor
         *
         * @param actorPrincipalId the value to set
         * @return this builder
         */
        public Builder actorPrincipalId(String actorPrincipalId) {
            this.actorPrincipalId = actorPrincipalId;
            this.__explicitlySet__.add("actorPrincipalId");
            return this;
        }
        /** Name of the principal actor */
        @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalName")
        private String actorPrincipalName;

        /**
         * Name of the principal actor
         *
         * @param actorPrincipalName the value to set
         * @return this builder
         */
        public Builder actorPrincipalName(String actorPrincipalName) {
            this.actorPrincipalName = actorPrincipalName;
            this.__explicitlySet__.add("actorPrincipalName");
            return this;
        }
        /** Type of the principal actor */
        @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalType")
        private String actorPrincipalType;

        /**
         * Type of the principal actor
         *
         * @param actorPrincipalType the value to set
         * @return this builder
         */
        public Builder actorPrincipalType(String actorPrincipalType) {
            this.actorPrincipalType = actorPrincipalType;
            this.__explicitlySet__.add("actorPrincipalType");
            return this;
        }
        /** Classification status of the sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("classificationStatus")
        private ClassificationStatus classificationStatus;

        /**
         * Classification status of the sighting
         *
         * @param classificationStatus the value to set
         * @return this builder
         */
        public Builder classificationStatus(ClassificationStatus classificationStatus) {
            this.classificationStatus = classificationStatus;
            this.__explicitlySet__.add("classificationStatus");
            return this;
        }
        /** Type of sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
        private String sightingType;

        /**
         * Type of sighting
         *
         * @param sightingType the value to set
         * @return this builder
         */
        public Builder sightingType(String sightingType) {
            this.sightingType = sightingType;
            this.__explicitlySet__.add("sightingType");
            return this;
        }
        /** Display name of the sighting type */
        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
        private String sightingTypeDisplayName;

        /**
         * Display name of the sighting type
         *
         * @param sightingTypeDisplayName the value to set
         * @return this builder
         */
        public Builder sightingTypeDisplayName(String sightingTypeDisplayName) {
            this.sightingTypeDisplayName = sightingTypeDisplayName;
            this.__explicitlySet__.add("sightingTypeDisplayName");
            return this;
        }
        /** Name of the MITRE ATT@CK framework tactic */
        @com.fasterxml.jackson.annotation.JsonProperty("tacticName")
        private String tacticName;

        /**
         * Name of the MITRE ATT@CK framework tactic
         *
         * @param tacticName the value to set
         * @return this builder
         */
        public Builder tacticName(String tacticName) {
            this.tacticName = tacticName;
            this.__explicitlySet__.add("tacticName");
            return this;
        }
        /** Name of the MITRE ATT@CK framework technique */
        @com.fasterxml.jackson.annotation.JsonProperty("techniqueName")
        private String techniqueName;

        /**
         * Name of the MITRE ATT@CK framework technique
         *
         * @param techniqueName the value to set
         * @return this builder
         */
        public Builder techniqueName(String techniqueName) {
            this.techniqueName = techniqueName;
            this.__explicitlySet__.add("techniqueName");
            return this;
        }
        /** Score for the sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("sightingScore")
        private Integer sightingScore;

        /**
         * Score for the sighting
         *
         * @param sightingScore the value to set
         * @return this builder
         */
        public Builder sightingScore(Integer sightingScore) {
            this.sightingScore = sightingScore;
            this.__explicitlySet__.add("sightingScore");
            return this;
        }
        /** Severity of the sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * Severity of the sighting
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** Level of confidence that the sighting is not a false positive */
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Confidence confidence;

        /**
         * Level of confidence that the sighting is not a false positive
         *
         * @param confidence the value to set
         * @return this builder
         */
        public Builder confidence(Confidence confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
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
        /** List of regions involved in the sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        /**
         * List of regions involved in the sighting
         *
         * @param regions the value to set
         * @return this builder
         */
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /** The additional details for the sighting */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        /**
         * The additional details for the sighting
         *
         * @param additionalDetails the value to set
         * @return this builder
         */
        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Sighting build() {
            Sighting model =
                    new Sighting(
                            this.id,
                            this.description,
                            this.problemId,
                            this.compartmentId,
                            this.actorPrincipalId,
                            this.actorPrincipalName,
                            this.actorPrincipalType,
                            this.classificationStatus,
                            this.sightingType,
                            this.sightingTypeDisplayName,
                            this.tacticName,
                            this.techniqueName,
                            this.sightingScore,
                            this.severity,
                            this.confidence,
                            this.timeFirstDetected,
                            this.timeLastDetected,
                            this.timeFirstOccurred,
                            this.timeLastOccurred,
                            this.regions,
                            this.additionalDetails,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Sighting model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("problemId")) {
                this.problemId(model.getProblemId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("actorPrincipalId")) {
                this.actorPrincipalId(model.getActorPrincipalId());
            }
            if (model.wasPropertyExplicitlySet("actorPrincipalName")) {
                this.actorPrincipalName(model.getActorPrincipalName());
            }
            if (model.wasPropertyExplicitlySet("actorPrincipalType")) {
                this.actorPrincipalType(model.getActorPrincipalType());
            }
            if (model.wasPropertyExplicitlySet("classificationStatus")) {
                this.classificationStatus(model.getClassificationStatus());
            }
            if (model.wasPropertyExplicitlySet("sightingType")) {
                this.sightingType(model.getSightingType());
            }
            if (model.wasPropertyExplicitlySet("sightingTypeDisplayName")) {
                this.sightingTypeDisplayName(model.getSightingTypeDisplayName());
            }
            if (model.wasPropertyExplicitlySet("tacticName")) {
                this.tacticName(model.getTacticName());
            }
            if (model.wasPropertyExplicitlySet("techniqueName")) {
                this.techniqueName(model.getTechniqueName());
            }
            if (model.wasPropertyExplicitlySet("sightingScore")) {
                this.sightingScore(model.getSightingScore());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
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
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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

    /** Unique identifier for the sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for the sighting
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Description of the sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the sighting
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Problem ID associated the sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * Problem ID associated the sighting
     *
     * @return the value
     */
    public String getProblemId() {
        return problemId;
    }

    /** Compartment OCID where the resource is created */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID where the resource is created
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Unique identifier for principal actor */
    @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalId")
    private final String actorPrincipalId;

    /**
     * Unique identifier for principal actor
     *
     * @return the value
     */
    public String getActorPrincipalId() {
        return actorPrincipalId;
    }

    /** Name of the principal actor */
    @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalName")
    private final String actorPrincipalName;

    /**
     * Name of the principal actor
     *
     * @return the value
     */
    public String getActorPrincipalName() {
        return actorPrincipalName;
    }

    /** Type of the principal actor */
    @com.fasterxml.jackson.annotation.JsonProperty("actorPrincipalType")
    private final String actorPrincipalType;

    /**
     * Type of the principal actor
     *
     * @return the value
     */
    public String getActorPrincipalType() {
        return actorPrincipalType;
    }

    /** Classification status of the sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("classificationStatus")
    private final ClassificationStatus classificationStatus;

    /**
     * Classification status of the sighting
     *
     * @return the value
     */
    public ClassificationStatus getClassificationStatus() {
        return classificationStatus;
    }

    /** Type of sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
    private final String sightingType;

    /**
     * Type of sighting
     *
     * @return the value
     */
    public String getSightingType() {
        return sightingType;
    }

    /** Display name of the sighting type */
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
    private final String sightingTypeDisplayName;

    /**
     * Display name of the sighting type
     *
     * @return the value
     */
    public String getSightingTypeDisplayName() {
        return sightingTypeDisplayName;
    }

    /** Name of the MITRE ATT@CK framework tactic */
    @com.fasterxml.jackson.annotation.JsonProperty("tacticName")
    private final String tacticName;

    /**
     * Name of the MITRE ATT@CK framework tactic
     *
     * @return the value
     */
    public String getTacticName() {
        return tacticName;
    }

    /** Name of the MITRE ATT@CK framework technique */
    @com.fasterxml.jackson.annotation.JsonProperty("techniqueName")
    private final String techniqueName;

    /**
     * Name of the MITRE ATT@CK framework technique
     *
     * @return the value
     */
    public String getTechniqueName() {
        return techniqueName;
    }

    /** Score for the sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("sightingScore")
    private final Integer sightingScore;

    /**
     * Score for the sighting
     *
     * @return the value
     */
    public Integer getSightingScore() {
        return sightingScore;
    }

    /** Severity of the sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * Severity of the sighting
     *
     * @return the value
     */
    public Severity getSeverity() {
        return severity;
    }

    /** Level of confidence that the sighting is not a false positive */
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Confidence confidence;

    /**
     * Level of confidence that the sighting is not a false positive
     *
     * @return the value
     */
    public Confidence getConfidence() {
        return confidence;
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

    /** List of regions involved in the sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    /**
     * List of regions involved in the sighting
     *
     * @return the value
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /** The additional details for the sighting */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    /**
     * The additional details for the sighting
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("Sighting(");
        sb.append("super=").append(super.toString());
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
        sb.append(", timeFirstOccurred=").append(String.valueOf(this.timeFirstOccurred));
        sb.append(", timeLastOccurred=").append(String.valueOf(this.timeLastOccurred));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", locks=").append(String.valueOf(this.locks));
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
                && java.util.Objects.equals(this.timeFirstOccurred, other.timeFirstOccurred)
                && java.util.Objects.equals(this.timeLastOccurred, other.timeLastOccurred)
                && java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
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
        result =
                (result * PRIME)
                        + (this.timeFirstOccurred == null ? 43 : this.timeFirstOccurred.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastOccurred == null ? 43 : this.timeLastOccurred.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
