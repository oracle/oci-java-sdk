/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Recommendation Definition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RecommendationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecommendationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "type",
        "tenantId",
        "compartmentId",
        "targetId",
        "details",
        "riskLevel",
        "problemCount",
        "lifecycleState",
        "lifecycleDetail",
        "timeCreated",
        "timeUpdated",
        "name",
        "description"
    })
    public RecommendationSummary(
            String id,
            RecommendationType type,
            String tenantId,
            String compartmentId,
            String targetId,
            java.util.Map<String, String> details,
            RiskLevel riskLevel,
            Long problemCount,
            LifecycleState lifecycleState,
            RecommendationLifecycleDetail lifecycleDetail,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String name,
            String description) {
        super();
        this.id = id;
        this.type = type;
        this.tenantId = tenantId;
        this.compartmentId = compartmentId;
        this.targetId = targetId;
        this.details = details;
        this.riskLevel = riskLevel;
        this.problemCount = problemCount;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetail = lifecycleDetail;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.name = name;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for Recommendation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for Recommendation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Recommendation type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private RecommendationType type;

        /**
         * Recommendation type
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(RecommendationType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Tenant Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * Tenant Identifier
         * @param tenantId the value to set
         * @return this builder
         **/
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * targetId associated with the problem
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * targetId associated with the problem
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * Recommendation details
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private java.util.Map<String, String> details;

        /**
         * Recommendation details
         * @param details the value to set
         * @return this builder
         **/
        public Builder details(java.util.Map<String, String> details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /**
         * The Risk Level
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        /**
         * The Risk Level
         * @param riskLevel the value to set
         * @return this builder
         **/
        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }
        /**
         * Count number of the problem
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemCount")
        private Long problemCount;

        /**
         * Count number of the problem
         * @param problemCount the value to set
         * @return this builder
         **/
        public Builder problemCount(Long problemCount) {
            this.problemCount = problemCount;
            this.__explicitlySet__.add("problemCount");
            return this;
        }
        /**
         * The current state of the Recommendation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Recommendation.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The lifecycleDetail will give more detail on the substate of the lifecycleState.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
        private RecommendationLifecycleDetail lifecycleDetail;

        /**
         * The lifecycleDetail will give more detail on the substate of the lifecycleState.
         * @param lifecycleDetail the value to set
         * @return this builder
         **/
        public Builder lifecycleDetail(RecommendationLifecycleDetail lifecycleDetail) {
            this.lifecycleDetail = lifecycleDetail;
            this.__explicitlySet__.add("lifecycleDetail");
            return this;
        }
        /**
         * problem creating time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * problem creating time
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * problem updating time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * problem updating time
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * recommendation string showing on UX
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * recommendation string showing on UX
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * description of the recommendation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * description of the recommendation
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecommendationSummary build() {
            RecommendationSummary model =
                    new RecommendationSummary(
                            this.id,
                            this.type,
                            this.tenantId,
                            this.compartmentId,
                            this.targetId,
                            this.details,
                            this.riskLevel,
                            this.problemCount,
                            this.lifecycleState,
                            this.lifecycleDetail,
                            this.timeCreated,
                            this.timeUpdated,
                            this.name,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecommendationSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
            }
            if (model.wasPropertyExplicitlySet("riskLevel")) {
                this.riskLevel(model.getRiskLevel());
            }
            if (model.wasPropertyExplicitlySet("problemCount")) {
                this.problemCount(model.getProblemCount());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetail")) {
                this.lifecycleDetail(model.getLifecycleDetail());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
     * Unique identifier for Recommendation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for Recommendation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Recommendation type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final RecommendationType type;

    /**
     * Recommendation type
     * @return the value
     **/
    public RecommendationType getType() {
        return type;
    }

    /**
     * Tenant Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * Tenant Identifier
     * @return the value
     **/
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * targetId associated with the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * targetId associated with the problem
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * Recommendation details
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final java.util.Map<String, String> details;

    /**
     * Recommendation details
     * @return the value
     **/
    public java.util.Map<String, String> getDetails() {
        return details;
    }

    /**
     * The Risk Level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    /**
     * The Risk Level
     * @return the value
     **/
    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /**
     * Count number of the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemCount")
    private final Long problemCount;

    /**
     * Count number of the problem
     * @return the value
     **/
    public Long getProblemCount() {
        return problemCount;
    }

    /**
     * The current state of the Recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Recommendation.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The lifecycleDetail will give more detail on the substate of the lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
    private final RecommendationLifecycleDetail lifecycleDetail;

    /**
     * The lifecycleDetail will give more detail on the substate of the lifecycleState.
     * @return the value
     **/
    public RecommendationLifecycleDetail getLifecycleDetail() {
        return lifecycleDetail;
    }

    /**
     * problem creating time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * problem creating time
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * problem updating time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * problem updating time
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * recommendation string showing on UX
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * recommendation string showing on UX
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * description of the recommendation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * description of the recommendation
     * @return the value
     **/
    public String getDescription() {
        return description;
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
        sb.append("RecommendationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", problemCount=").append(String.valueOf(this.problemCount));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetail=").append(String.valueOf(this.lifecycleDetail));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendationSummary)) {
            return false;
        }

        RecommendationSummary other = (RecommendationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.problemCount, other.problemCount)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetail, other.lifecycleDetail)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result = (result * PRIME) + (this.problemCount == null ? 43 : this.problemCount.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetail == null ? 43 : this.lifecycleDetail.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
