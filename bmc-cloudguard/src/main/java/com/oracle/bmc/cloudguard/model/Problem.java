/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Problem Definition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Problem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Problem {
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
        "comment"
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
            String comment) {
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
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
        private String detectorRuleId;

        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            this.__explicitlySet__.add("detectorRuleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
        private Double riskScore;

        public Builder riskScore(Double riskScore) {
            this.riskScore = riskScore;
            this.__explicitlySet__.add("riskScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScoreDate")
        private String peakRiskScoreDate;

        public Builder peakRiskScoreDate(String peakRiskScoreDate) {
            this.peakRiskScoreDate = peakRiskScoreDate;
            this.__explicitlySet__.add("peakRiskScoreDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScore")
        private Double peakRiskScore;

        public Builder peakRiskScore(Double peakRiskScore) {
            this.peakRiskScore = peakRiskScore;
            this.__explicitlySet__.add("peakRiskScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoResolveDate")
        private String autoResolveDate;

        public Builder autoResolveDate(String autoResolveDate) {
            this.autoResolveDate = autoResolveDate;
            this.__explicitlySet__.add("autoResolveDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScoreLookupPeriodInDays")
        private Integer peakRiskScoreLookupPeriodInDays;

        public Builder peakRiskScoreLookupPeriodInDays(Integer peakRiskScoreLookupPeriodInDays) {
            this.peakRiskScoreLookupPeriodInDays = peakRiskScoreLookupPeriodInDays;
            this.__explicitlySet__.add("peakRiskScoreLookupPeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
        private java.util.Date timeFirstDetected;

        public Builder timeFirstDetected(java.util.Date timeFirstDetected) {
            this.timeFirstDetected = timeFirstDetected;
            this.__explicitlySet__.add("timeFirstDetected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ProblemLifecycleState lifecycleState;

        public Builder lifecycleState(ProblemLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
        private ProblemLifecycleDetail lifecycleDetail;

        public Builder lifecycleDetail(ProblemLifecycleDetail lifecycleDetail) {
            this.lifecycleDetail = lifecycleDetail;
            this.__explicitlySet__.add("lifecycleDetail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("detectorId")
        private DetectorEnum detectorId;

        public Builder detectorId(DetectorEnum detectorId) {
            this.detectorId = detectorId;
            this.__explicitlySet__.add("detectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
        private String recommendation;

        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            this.__explicitlySet__.add("recommendation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Problem build() {
            Problem __instance__ =
                    new Problem(
                            id,
                            compartmentId,
                            detectorRuleId,
                            region,
                            regions,
                            riskLevel,
                            riskScore,
                            peakRiskScoreDate,
                            peakRiskScore,
                            autoResolveDate,
                            peakRiskScoreLookupPeriodInDays,
                            resourceId,
                            resourceName,
                            resourceType,
                            labels,
                            timeLastDetected,
                            timeFirstDetected,
                            lifecycleState,
                            lifecycleDetail,
                            detectorId,
                            targetId,
                            additionalDetails,
                            description,
                            recommendation,
                            comment);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Problem o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .detectorRuleId(o.getDetectorRuleId())
                            .region(o.getRegion())
                            .regions(o.getRegions())
                            .riskLevel(o.getRiskLevel())
                            .riskScore(o.getRiskScore())
                            .peakRiskScoreDate(o.getPeakRiskScoreDate())
                            .peakRiskScore(o.getPeakRiskScore())
                            .autoResolveDate(o.getAutoResolveDate())
                            .peakRiskScoreLookupPeriodInDays(o.getPeakRiskScoreLookupPeriodInDays())
                            .resourceId(o.getResourceId())
                            .resourceName(o.getResourceName())
                            .resourceType(o.getResourceType())
                            .labels(o.getLabels())
                            .timeLastDetected(o.getTimeLastDetected())
                            .timeFirstDetected(o.getTimeFirstDetected())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetail(o.getLifecycleDetail())
                            .detectorId(o.getDetectorId())
                            .targetId(o.getTargetId())
                            .additionalDetails(o.getAdditionalDetails())
                            .description(o.getDescription())
                            .recommendation(o.getRecommendation())
                            .comment(o.getComment());

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
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * Compartment Identifier where the resource is created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Identifier of the rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
    private final String detectorRuleId;

    public String getDetectorRuleId() {
        return detectorRuleId;
    }

    /**
     * DEPRECATED
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    public String getRegion() {
        return region;
    }

    /**
     * Regions where the problem is found
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * The Risk Level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /**
     * Risk Score for the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
    private final Double riskScore;

    public Double getRiskScore() {
        return riskScore;
    }

    /**
     * The date and time for the peak risk score that is observed. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScoreDate")
    private final String peakRiskScoreDate;

    public String getPeakRiskScoreDate() {
        return peakRiskScoreDate;
    }

    /**
     * Peak risk score for the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScore")
    private final Double peakRiskScore;

    public Double getPeakRiskScore() {
        return peakRiskScore;
    }

    /**
     * The date and time when the problem will be auto resolved. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoResolveDate")
    private final String autoResolveDate;

    public String getAutoResolveDate() {
        return autoResolveDate;
    }

    /**
     * Number of days for which peak score is calculated for the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peakRiskScoreLookupPeriodInDays")
    private final Integer peakRiskScoreLookupPeriodInDays;

    public Integer getPeakRiskScoreLookupPeriodInDays() {
        return peakRiskScoreLookupPeriodInDays;
    }

    /**
     * Identifier of the Resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    public String getResourceId() {
        return resourceId;
    }

    /**
     * DisplayName of the Resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    public String getResourceName() {
        return resourceName;
    }

    /**
     * Type of the Resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    public String getResourceType() {
        return resourceType;
    }

    /**
     * user defined labels on the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * The date and time the problem was last detected. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    private final java.util.Date timeLastDetected;

    public java.util.Date getTimeLastDetected() {
        return timeLastDetected;
    }

    /**
     * The date and time the problem was first detected. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
    private final java.util.Date timeFirstDetected;

    public java.util.Date getTimeFirstDetected() {
        return timeFirstDetected;
    }

    /**
     * The current state of the Problem.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ProblemLifecycleState lifecycleState;

    public ProblemLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The lifecycleDetail will give more detail on the substate of the lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
    private final ProblemLifecycleDetail lifecycleDetail;

    public ProblemLifecycleDetail getLifecycleDetail() {
        return lifecycleDetail;
    }

    /**
     * Id of the detector associated with the Problem.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorId")
    private final DetectorEnum detectorId;

    public DetectorEnum getDetectorId() {
        return detectorId;
    }

    /**
     * targetId of the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    public String getTargetId() {
        return targetId;
    }

    /**
     * The additional details of the Problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Description of the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Recommendation for the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    private final String recommendation;

    public String getRecommendation() {
        return recommendation;
    }

    /**
     * User Comments
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Problem(");
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
