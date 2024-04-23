/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary information for a problem. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProblemSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProblemSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "detectorRuleId",
        "riskLevel",
        "riskScore",
        "resourceId",
        "resourceName",
        "resourceType",
        "labels",
        "timeFirstDetected",
        "timeLastDetected",
        "lifecycleState",
        "lifecycleDetail",
        "detectorId",
        "region",
        "regions",
        "targetId",
        "locks"
    })
    public ProblemSummary(
            String id,
            String compartmentId,
            String detectorRuleId,
            RiskLevel riskLevel,
            Double riskScore,
            String resourceId,
            String resourceName,
            String resourceType,
            java.util.List<String> labels,
            java.util.Date timeFirstDetected,
            java.util.Date timeLastDetected,
            ProblemLifecycleState lifecycleState,
            ProblemLifecycleDetail lifecycleDetail,
            DetectorEnum detectorId,
            String region,
            java.util.List<String> regions,
            String targetId,
            java.util.List<ResourceLock> locks) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.detectorRuleId = detectorRuleId;
        this.riskLevel = riskLevel;
        this.riskScore = riskScore;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.labels = labels;
        this.timeFirstDetected = timeFirstDetected;
        this.timeLastDetected = timeLastDetected;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetail = lifecycleDetail;
        this.detectorId = detectorId;
        this.region = region;
        this.regions = regions;
        this.targetId = targetId;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that can't be changed after creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that can't be changed after creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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
        /** Unique identifier of the detector rule */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
        private String detectorRuleId;

        /**
         * Unique identifier of the detector rule
         *
         * @param detectorRuleId the value to set
         * @return this builder
         */
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            this.__explicitlySet__.add("detectorRuleId");
            return this;
        }
        /** The risk level of the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        /**
         * The risk level of the problem
         *
         * @param riskLevel the value to set
         * @return this builder
         */
        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }
        /** The risk score for the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
        private Double riskScore;

        /**
         * The risk score for the problem
         *
         * @param riskScore the value to set
         * @return this builder
         */
        public Builder riskScore(Double riskScore) {
            this.riskScore = riskScore;
            this.__explicitlySet__.add("riskScore");
            return this;
        }
        /** Unique identifier of the resource that's impacted by the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Unique identifier of the resource that's impacted by the problem
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Display name of the resource impacted by the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * Display name of the resource impacted by the problem
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** Type of the resource impacted by the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Type of the resource impacted by the problem
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** User-defined labels on the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * User-defined labels on the problem
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
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
        /** The current lifecycle state of the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ProblemLifecycleState lifecycleState;

        /**
         * The current lifecycle state of the problem
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ProblemLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional details on the substate of the lifecycle state */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
        private ProblemLifecycleDetail lifecycleDetail;

        /**
         * Additional details on the substate of the lifecycle state
         *
         * @param lifecycleDetail the value to set
         * @return this builder
         */
        public Builder lifecycleDetail(ProblemLifecycleDetail lifecycleDetail) {
            this.lifecycleDetail = lifecycleDetail;
            this.__explicitlySet__.add("lifecycleDetail");
            return this;
        }
        /** Unique identifier of the detector associated with the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("detectorId")
        private DetectorEnum detectorId;

        /**
         * Unique identifier of the detector associated with the problem
         *
         * @param detectorId the value to set
         * @return this builder
         */
        public Builder detectorId(DetectorEnum detectorId) {
            this.detectorId = detectorId;
            this.__explicitlySet__.add("detectorId");
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
        /** List of regions where the problem is found */
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        /**
         * List of regions where the problem is found
         *
         * @param regions the value to set
         * @return this builder
         */
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /** Unique target identifier associated with the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * Unique target identifier associated with the problem
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
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

        public ProblemSummary build() {
            ProblemSummary model =
                    new ProblemSummary(
                            this.id,
                            this.compartmentId,
                            this.detectorRuleId,
                            this.riskLevel,
                            this.riskScore,
                            this.resourceId,
                            this.resourceName,
                            this.resourceType,
                            this.labels,
                            this.timeFirstDetected,
                            this.timeLastDetected,
                            this.lifecycleState,
                            this.lifecycleDetail,
                            this.detectorId,
                            this.region,
                            this.regions,
                            this.targetId,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProblemSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("detectorRuleId")) {
                this.detectorRuleId(model.getDetectorRuleId());
            }
            if (model.wasPropertyExplicitlySet("riskLevel")) {
                this.riskLevel(model.getRiskLevel());
            }
            if (model.wasPropertyExplicitlySet("riskScore")) {
                this.riskScore(model.getRiskScore());
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
            if (model.wasPropertyExplicitlySet("timeFirstDetected")) {
                this.timeFirstDetected(model.getTimeFirstDetected());
            }
            if (model.wasPropertyExplicitlySet("timeLastDetected")) {
                this.timeLastDetected(model.getTimeLastDetected());
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
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
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

    /** Unique identifier that can't be changed after creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that can't be changed after creation
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /** Unique identifier of the detector rule */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
    private final String detectorRuleId;

    /**
     * Unique identifier of the detector rule
     *
     * @return the value
     */
    public String getDetectorRuleId() {
        return detectorRuleId;
    }

    /** The risk level of the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    /**
     * The risk level of the problem
     *
     * @return the value
     */
    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /** The risk score for the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
    private final Double riskScore;

    /**
     * The risk score for the problem
     *
     * @return the value
     */
    public Double getRiskScore() {
        return riskScore;
    }

    /** Unique identifier of the resource that's impacted by the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Unique identifier of the resource that's impacted by the problem
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Display name of the resource impacted by the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * Display name of the resource impacted by the problem
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** Type of the resource impacted by the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Type of the resource impacted by the problem
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** User-defined labels on the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * User-defined labels on the problem
     *
     * @return the value
     */
    public java.util.List<String> getLabels() {
        return labels;
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

    /** The current lifecycle state of the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ProblemLifecycleState lifecycleState;

    /**
     * The current lifecycle state of the problem
     *
     * @return the value
     */
    public ProblemLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional details on the substate of the lifecycle state */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
    private final ProblemLifecycleDetail lifecycleDetail;

    /**
     * Additional details on the substate of the lifecycle state
     *
     * @return the value
     */
    public ProblemLifecycleDetail getLifecycleDetail() {
        return lifecycleDetail;
    }

    /** Unique identifier of the detector associated with the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("detectorId")
    private final DetectorEnum detectorId;

    /**
     * Unique identifier of the detector associated with the problem
     *
     * @return the value
     */
    public DetectorEnum getDetectorId() {
        return detectorId;
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

    /** List of regions where the problem is found */
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    /**
     * List of regions where the problem is found
     *
     * @return the value
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /** Unique target identifier associated with the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * Unique target identifier associated with the problem
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
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
        sb.append("ProblemSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", detectorRuleId=").append(String.valueOf(this.detectorRuleId));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", riskScore=").append(String.valueOf(this.riskScore));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", timeFirstDetected=").append(String.valueOf(this.timeFirstDetected));
        sb.append(", timeLastDetected=").append(String.valueOf(this.timeLastDetected));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetail=").append(String.valueOf(this.lifecycleDetail));
        sb.append(", detectorId=").append(String.valueOf(this.detectorId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProblemSummary)) {
            return false;
        }

        ProblemSummary other = (ProblemSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.detectorRuleId, other.detectorRuleId)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.riskScore, other.riskScore)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.timeFirstDetected, other.timeFirstDetected)
                && java.util.Objects.equals(this.timeLastDetected, other.timeLastDetected)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetail, other.lifecycleDetail)
                && java.util.Objects.equals(this.detectorId, other.detectorId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.locks, other.locks)
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
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result = (result * PRIME) + (this.riskScore == null ? 43 : this.riskScore.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstDetected == null ? 43 : this.timeFirstDetected.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDetected == null ? 43 : this.timeLastDetected.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetail == null ? 43 : this.lifecycleDetail.hashCode());
        result = (result * PRIME) + (this.detectorId == null ? 43 : this.detectorId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
