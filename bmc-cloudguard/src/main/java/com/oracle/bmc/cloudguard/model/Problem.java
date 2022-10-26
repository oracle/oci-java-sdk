/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Problem Definition. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Problem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Problem extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "detectorRuleId",
        "region",
        "regions",
        "riskLevel",
        "riskScore",
        "peakRiskScoreDate",
        "peakRiskScore",
        "autoResolveDate",
        "peakRiskScoreLookupPeriodInDays",
        "resourceId",
        "resourceName",
        "resourceType",
        "labels",
        "timeLastDetected",
        "timeFirstDetected",
        "lifecycleState",
        "lifecycleDetail",
        "detectorId",
        "targetId",
        "additionalDetails",
        "description",
        "recommendation",
        "comment",
        "impactedResourceId",
        "impactedResourceName",
        "impactedResourceType"
    })
    public Problem(
            String id,
            String compartmentId,
            String detectorRuleId,
            String region,
            java.util.List<String> regions,
            RiskLevel riskLevel,
            Double riskScore,
            String peakRiskScoreDate,
            Double peakRiskScore,
            String autoResolveDate,
            Integer peakRiskScoreLookupPeriodInDays,
            String resourceId,
            String resourceName,
            String resourceType,
            java.util.List<String> labels,
            java.util.Date timeLastDetected,
            java.util.Date timeFirstDetected,
            ProblemLifecycleState lifecycleState,
            ProblemLifecycleDetail lifecycleDetail,
            DetectorEnum detectorId,
            String targetId,
            java.util.Map<String, String> additionalDetails,
            String description,
            String recommendation,
            String comment,
            String impactedResourceId,
            String impactedResourceName,
            String impactedResourceType) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.detectorRuleId = detectorRuleId;
        this.region = region;
        this.regions = regions;
        this.riskLevel = riskLevel;
        this.riskScore = riskScore;
        this.peakRiskScoreDate = peakRiskScoreDate;
        this.peakRiskScore = peakRiskScore;
        this.autoResolveDate = autoResolveDate;
        this.peakRiskScoreLookupPeriodInDays = peakRiskScoreLookupPeriodInDays;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.labels = labels;
        this.timeLastDetected = timeLastDetected;
        this.timeFirstDetected = timeFirstDetected;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetail = lifecycleDetail;
        this.detectorId = detectorId;
        this.targetId = targetId;
        this.additionalDetails = additionalDetails;
        this.description = description;
        this.recommendation = recommendation;
        this.comment = comment;
        this.impactedResourceId = impactedResourceId;
        this.impactedResourceName = impactedResourceName;
        this.impactedResourceType = impactedResourceType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Compartment Identifier where the resource is created */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier where the resource is created
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Identifier of the rule */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
        private String detectorRuleId;

        /**
         * Identifier of the rule
         *
         * @param detectorRuleId the value to set
         * @return this builder
         */
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            this.__explicitlySet__.add("detectorRuleId");
            return this;
        }
        /** DEPRECATED */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * DEPRECATED
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** Regions where the problem is found */
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        /**
         * Regions where the problem is found
         *
         * @param regions the value to set
         * @return this builder
         */
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /** The Risk Level */
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        /**
         * The Risk Level
         *
         * @param riskLevel the value to set
         * @return this builder
         */
        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }
        /** Risk Score for the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
        private Double riskScore;

        /**
         * Risk Score for the problem
         *
         * @param riskScore the value to set
         * @return this builder
         */
        public Builder riskScore(Double riskScore) {
            this.riskScore = riskScore;
            this.__explicitlySet__.add("riskScore");
            return this;
        }
        /**
         * The date and time for the peak risk score that is observed. Format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScoreDate")
        private String peakRiskScoreDate;

        /**
         * The date and time for the peak risk score that is observed. Format defined by RFC3339.
         *
         * @param peakRiskScoreDate the value to set
         * @return this builder
         */
        public Builder peakRiskScoreDate(String peakRiskScoreDate) {
            this.peakRiskScoreDate = peakRiskScoreDate;
            this.__explicitlySet__.add("peakRiskScoreDate");
            return this;
        }
        /** Peak risk score for the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScore")
        private Double peakRiskScore;

        /**
         * Peak risk score for the problem
         *
         * @param peakRiskScore the value to set
         * @return this builder
         */
        public Builder peakRiskScore(Double peakRiskScore) {
            this.peakRiskScore = peakRiskScore;
            this.__explicitlySet__.add("peakRiskScore");
            return this;
        }
        /** The date and time when the problem will be auto resolved. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("autoResolveDate")
        private String autoResolveDate;

        /**
         * The date and time when the problem will be auto resolved. Format defined by RFC3339.
         *
         * @param autoResolveDate the value to set
         * @return this builder
         */
        public Builder autoResolveDate(String autoResolveDate) {
            this.autoResolveDate = autoResolveDate;
            this.__explicitlySet__.add("autoResolveDate");
            return this;
        }
        /** Number of days for which peak score is calculated for the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScoreLookupPeriodInDays")
        private Integer peakRiskScoreLookupPeriodInDays;

        /**
         * Number of days for which peak score is calculated for the problem
         *
         * @param peakRiskScoreLookupPeriodInDays the value to set
         * @return this builder
         */
        public Builder peakRiskScoreLookupPeriodInDays(Integer peakRiskScoreLookupPeriodInDays) {
            this.peakRiskScoreLookupPeriodInDays = peakRiskScoreLookupPeriodInDays;
            this.__explicitlySet__.add("peakRiskScoreLookupPeriodInDays");
            return this;
        }
        /** Identifier of the Resource */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Identifier of the Resource
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** DisplayName of the Resource */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * DisplayName of the Resource
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** Type of the Resource */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Type of the Resource
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** user defined labels on the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * user defined labels on the problem
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /** The date and time the problem was last detected. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        /**
         * The date and time the problem was last detected. Format defined by RFC3339.
         *
         * @param timeLastDetected the value to set
         * @return this builder
         */
        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }
        /** The date and time the problem was first detected. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
        private java.util.Date timeFirstDetected;

        /**
         * The date and time the problem was first detected. Format defined by RFC3339.
         *
         * @param timeFirstDetected the value to set
         * @return this builder
         */
        public Builder timeFirstDetected(java.util.Date timeFirstDetected) {
            this.timeFirstDetected = timeFirstDetected;
            this.__explicitlySet__.add("timeFirstDetected");
            return this;
        }
        /** The current state of the Problem. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ProblemLifecycleState lifecycleState;

        /**
         * The current state of the Problem.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ProblemLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The lifecycleDetail will give more detail on the substate of the lifecycleState. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
        private ProblemLifecycleDetail lifecycleDetail;

        /**
         * The lifecycleDetail will give more detail on the substate of the lifecycleState.
         *
         * @param lifecycleDetail the value to set
         * @return this builder
         */
        public Builder lifecycleDetail(ProblemLifecycleDetail lifecycleDetail) {
            this.lifecycleDetail = lifecycleDetail;
            this.__explicitlySet__.add("lifecycleDetail");
            return this;
        }
        /** Id of the detector associated with the Problem. */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorId")
        private DetectorEnum detectorId;

        /**
         * Id of the detector associated with the Problem.
         *
         * @param detectorId the value to set
         * @return this builder
         */
        public Builder detectorId(DetectorEnum detectorId) {
            this.detectorId = detectorId;
            this.__explicitlySet__.add("detectorId");
            return this;
        }
        /** targetId of the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * targetId of the problem
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The additional details of the Problem */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        /**
         * The additional details of the Problem
         *
         * @param additionalDetails the value to set
         * @return this builder
         */
        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /** Description of the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the problem
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Recommendation for the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
        private String recommendation;

        /**
         * Recommendation for the problem
         *
         * @param recommendation the value to set
         * @return this builder
         */
        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            this.__explicitlySet__.add("recommendation");
            return this;
        }
        /** User Comments */
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * User Comments
         *
         * @param comment the value to set
         * @return this builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /** Identifier of the impacted Resource */
        @com.fasterxml.jackson.annotation.JsonProperty("impactedResourceId")
        private String impactedResourceId;

        /**
         * Identifier of the impacted Resource
         *
         * @param impactedResourceId the value to set
         * @return this builder
         */
        public Builder impactedResourceId(String impactedResourceId) {
            this.impactedResourceId = impactedResourceId;
            this.__explicitlySet__.add("impactedResourceId");
            return this;
        }
        /** DisplayName of the impacted Resource */
        @com.fasterxml.jackson.annotation.JsonProperty("impactedResourceName")
        private String impactedResourceName;

        /**
         * DisplayName of the impacted Resource
         *
         * @param impactedResourceName the value to set
         * @return this builder
         */
        public Builder impactedResourceName(String impactedResourceName) {
            this.impactedResourceName = impactedResourceName;
            this.__explicitlySet__.add("impactedResourceName");
            return this;
        }
        /** Type of the impacted Resource */
        @com.fasterxml.jackson.annotation.JsonProperty("impactedResourceType")
        private String impactedResourceType;

        /**
         * Type of the impacted Resource
         *
         * @param impactedResourceType the value to set
         * @return this builder
         */
        public Builder impactedResourceType(String impactedResourceType) {
            this.impactedResourceType = impactedResourceType;
            this.__explicitlySet__.add("impactedResourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Problem build() {
            Problem model =
                    new Problem(
                            this.id,
                            this.compartmentId,
                            this.detectorRuleId,
                            this.region,
                            this.regions,
                            this.riskLevel,
                            this.riskScore,
                            this.peakRiskScoreDate,
                            this.peakRiskScore,
                            this.autoResolveDate,
                            this.peakRiskScoreLookupPeriodInDays,
                            this.resourceId,
                            this.resourceName,
                            this.resourceType,
                            this.labels,
                            this.timeLastDetected,
                            this.timeFirstDetected,
                            this.lifecycleState,
                            this.lifecycleDetail,
                            this.detectorId,
                            this.targetId,
                            this.additionalDetails,
                            this.description,
                            this.recommendation,
                            this.comment,
                            this.impactedResourceId,
                            this.impactedResourceName,
                            this.impactedResourceType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Problem model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("detectorRuleId")) {
                this.detectorRuleId(model.getDetectorRuleId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
            }
            if (model.wasPropertyExplicitlySet("riskLevel")) {
                this.riskLevel(model.getRiskLevel());
            }
            if (model.wasPropertyExplicitlySet("riskScore")) {
                this.riskScore(model.getRiskScore());
            }
            if (model.wasPropertyExplicitlySet("peakRiskScoreDate")) {
                this.peakRiskScoreDate(model.getPeakRiskScoreDate());
            }
            if (model.wasPropertyExplicitlySet("peakRiskScore")) {
                this.peakRiskScore(model.getPeakRiskScore());
            }
            if (model.wasPropertyExplicitlySet("autoResolveDate")) {
                this.autoResolveDate(model.getAutoResolveDate());
            }
            if (model.wasPropertyExplicitlySet("peakRiskScoreLookupPeriodInDays")) {
                this.peakRiskScoreLookupPeriodInDays(model.getPeakRiskScoreLookupPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
            }
            if (model.wasPropertyExplicitlySet("timeLastDetected")) {
                this.timeLastDetected(model.getTimeLastDetected());
            }
            if (model.wasPropertyExplicitlySet("timeFirstDetected")) {
                this.timeFirstDetected(model.getTimeFirstDetected());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetail")) {
                this.lifecycleDetail(model.getLifecycleDetail());
            }
            if (model.wasPropertyExplicitlySet("detectorId")) {
                this.detectorId(model.getDetectorId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("recommendation")) {
                this.recommendation(model.getRecommendation());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("impactedResourceId")) {
                this.impactedResourceId(model.getImpactedResourceId());
            }
            if (model.wasPropertyExplicitlySet("impactedResourceName")) {
                this.impactedResourceName(model.getImpactedResourceName());
            }
            if (model.wasPropertyExplicitlySet("impactedResourceType")) {
                this.impactedResourceType(model.getImpactedResourceType());
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

    /** Unique identifier that is immutable on creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Compartment Identifier where the resource is created */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier where the resource is created
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Identifier of the rule */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
    private final String detectorRuleId;

    /**
     * Identifier of the rule
     *
     * @return the value
     */
    public String getDetectorRuleId() {
        return detectorRuleId;
    }

    /** DEPRECATED */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * DEPRECATED
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** Regions where the problem is found */
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    /**
     * Regions where the problem is found
     *
     * @return the value
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /** The Risk Level */
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    /**
     * The Risk Level
     *
     * @return the value
     */
    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /** Risk Score for the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
    private final Double riskScore;

    /**
     * Risk Score for the problem
     *
     * @return the value
     */
    public Double getRiskScore() {
        return riskScore;
    }

    /** The date and time for the peak risk score that is observed. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScoreDate")
    private final String peakRiskScoreDate;

    /**
     * The date and time for the peak risk score that is observed. Format defined by RFC3339.
     *
     * @return the value
     */
    public String getPeakRiskScoreDate() {
        return peakRiskScoreDate;
    }

    /** Peak risk score for the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScore")
    private final Double peakRiskScore;

    /**
     * Peak risk score for the problem
     *
     * @return the value
     */
    public Double getPeakRiskScore() {
        return peakRiskScore;
    }

    /** The date and time when the problem will be auto resolved. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("autoResolveDate")
    private final String autoResolveDate;

    /**
     * The date and time when the problem will be auto resolved. Format defined by RFC3339.
     *
     * @return the value
     */
    public String getAutoResolveDate() {
        return autoResolveDate;
    }

    /** Number of days for which peak score is calculated for the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScoreLookupPeriodInDays")
    private final Integer peakRiskScoreLookupPeriodInDays;

    /**
     * Number of days for which peak score is calculated for the problem
     *
     * @return the value
     */
    public Integer getPeakRiskScoreLookupPeriodInDays() {
        return peakRiskScoreLookupPeriodInDays;
    }

    /** Identifier of the Resource */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Identifier of the Resource
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** DisplayName of the Resource */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * DisplayName of the Resource
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** Type of the Resource */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Type of the Resource
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** user defined labels on the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * user defined labels on the problem
     *
     * @return the value
     */
    public java.util.List<String> getLabels() {
        return labels;
    }

    /** The date and time the problem was last detected. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    private final java.util.Date timeLastDetected;

    /**
     * The date and time the problem was last detected. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeLastDetected() {
        return timeLastDetected;
    }

    /** The date and time the problem was first detected. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
    private final java.util.Date timeFirstDetected;

    /**
     * The date and time the problem was first detected. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeFirstDetected() {
        return timeFirstDetected;
    }

    /** The current state of the Problem. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ProblemLifecycleState lifecycleState;

    /**
     * The current state of the Problem.
     *
     * @return the value
     */
    public ProblemLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The lifecycleDetail will give more detail on the substate of the lifecycleState. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
    private final ProblemLifecycleDetail lifecycleDetail;

    /**
     * The lifecycleDetail will give more detail on the substate of the lifecycleState.
     *
     * @return the value
     */
    public ProblemLifecycleDetail getLifecycleDetail() {
        return lifecycleDetail;
    }

    /** Id of the detector associated with the Problem. */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorId")
    private final DetectorEnum detectorId;

    /**
     * Id of the detector associated with the Problem.
     *
     * @return the value
     */
    public DetectorEnum getDetectorId() {
        return detectorId;
    }

    /** targetId of the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * targetId of the problem
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The additional details of the Problem */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    /**
     * The additional details of the Problem
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /** Description of the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the problem
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Recommendation for the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    private final String recommendation;

    /**
     * Recommendation for the problem
     *
     * @return the value
     */
    public String getRecommendation() {
        return recommendation;
    }

    /** User Comments */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * User Comments
     *
     * @return the value
     */
    public String getComment() {
        return comment;
    }

    /** Identifier of the impacted Resource */
    @com.fasterxml.jackson.annotation.JsonProperty("impactedResourceId")
    private final String impactedResourceId;

    /**
     * Identifier of the impacted Resource
     *
     * @return the value
     */
    public String getImpactedResourceId() {
        return impactedResourceId;
    }

    /** DisplayName of the impacted Resource */
    @com.fasterxml.jackson.annotation.JsonProperty("impactedResourceName")
    private final String impactedResourceName;

    /**
     * DisplayName of the impacted Resource
     *
     * @return the value
     */
    public String getImpactedResourceName() {
        return impactedResourceName;
    }

    /** Type of the impacted Resource */
    @com.fasterxml.jackson.annotation.JsonProperty("impactedResourceType")
    private final String impactedResourceType;

    /**
     * Type of the impacted Resource
     *
     * @return the value
     */
    public String getImpactedResourceType() {
        return impactedResourceType;
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
        sb.append("Problem(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", detectorRuleId=").append(String.valueOf(this.detectorRuleId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", riskScore=").append(String.valueOf(this.riskScore));
        sb.append(", peakRiskScoreDate=").append(String.valueOf(this.peakRiskScoreDate));
        sb.append(", peakRiskScore=").append(String.valueOf(this.peakRiskScore));
        sb.append(", autoResolveDate=").append(String.valueOf(this.autoResolveDate));
        sb.append(", peakRiskScoreLookupPeriodInDays=")
                .append(String.valueOf(this.peakRiskScoreLookupPeriodInDays));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", timeLastDetected=").append(String.valueOf(this.timeLastDetected));
        sb.append(", timeFirstDetected=").append(String.valueOf(this.timeFirstDetected));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetail=").append(String.valueOf(this.lifecycleDetail));
        sb.append(", detectorId=").append(String.valueOf(this.detectorId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", recommendation=").append(String.valueOf(this.recommendation));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", impactedResourceId=").append(String.valueOf(this.impactedResourceId));
        sb.append(", impactedResourceName=").append(String.valueOf(this.impactedResourceName));
        sb.append(", impactedResourceType=").append(String.valueOf(this.impactedResourceType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Problem)) {
            return false;
        }

        Problem other = (Problem) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.detectorRuleId, other.detectorRuleId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.riskScore, other.riskScore)
                && java.util.Objects.equals(this.peakRiskScoreDate, other.peakRiskScoreDate)
                && java.util.Objects.equals(this.peakRiskScore, other.peakRiskScore)
                && java.util.Objects.equals(this.autoResolveDate, other.autoResolveDate)
                && java.util.Objects.equals(
                        this.peakRiskScoreLookupPeriodInDays, other.peakRiskScoreLookupPeriodInDays)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.timeLastDetected, other.timeLastDetected)
                && java.util.Objects.equals(this.timeFirstDetected, other.timeFirstDetected)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetail, other.lifecycleDetail)
                && java.util.Objects.equals(this.detectorId, other.detectorId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.recommendation, other.recommendation)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.impactedResourceId, other.impactedResourceId)
                && java.util.Objects.equals(this.impactedResourceName, other.impactedResourceName)
                && java.util.Objects.equals(this.impactedResourceType, other.impactedResourceType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRuleId == null ? 43 : this.detectorRuleId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result = (result * PRIME) + (this.riskScore == null ? 43 : this.riskScore.hashCode());
        result =
                (result * PRIME)
                        + (this.peakRiskScoreDate == null ? 43 : this.peakRiskScoreDate.hashCode());
        result =
                (result * PRIME)
                        + (this.peakRiskScore == null ? 43 : this.peakRiskScore.hashCode());
        result =
                (result * PRIME)
                        + (this.autoResolveDate == null ? 43 : this.autoResolveDate.hashCode());
        result =
                (result * PRIME)
                        + (this.peakRiskScoreLookupPeriodInDays == null
                                ? 43
                                : this.peakRiskScoreLookupPeriodInDays.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDetected == null ? 43 : this.timeLastDetected.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstDetected == null ? 43 : this.timeFirstDetected.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetail == null ? 43 : this.lifecycleDetail.hashCode());
        result = (result * PRIME) + (this.detectorId == null ? 43 : this.detectorId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendation == null ? 43 : this.recommendation.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result =
                (result * PRIME)
                        + (this.impactedResourceId == null
                                ? 43
                                : this.impactedResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.impactedResourceName == null
                                ? 43
                                : this.impactedResourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.impactedResourceType == null
                                ? 43
                                : this.impactedResourceType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
