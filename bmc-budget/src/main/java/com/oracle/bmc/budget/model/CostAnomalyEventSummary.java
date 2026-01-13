/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/**
 * A CostAnomalyEvent. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CostAnomalyEventSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CostAnomalyEventSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "costAnomalyName",
        "compartmentId",
        "costMonitorId",
        "costMonitorName",
        "costMonitorType",
        "lifecycleState",
        "targetResourceFilter",
        "rootCauseDetail",
        "timeAnomalyEventDate",
        "costImpact",
        "costVariancePercentage",
        "definedTags",
        "freeformTags",
        "systemTags"
    })
    public CostAnomalyEventSummary(
            String id,
            String costAnomalyName,
            String compartmentId,
            String costMonitorId,
            String costMonitorName,
            MonitorType costMonitorType,
            CostAnomalyEvent.LifecycleState lifecycleState,
            TargetResourceFilter targetResourceFilter,
            RootCauseDetail rootCauseDetail,
            java.util.Date timeAnomalyEventDate,
            Double costImpact,
            Double costVariancePercentage,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.costAnomalyName = costAnomalyName;
        this.compartmentId = compartmentId;
        this.costMonitorId = costMonitorId;
        this.costMonitorName = costMonitorName;
        this.costMonitorType = costMonitorType;
        this.lifecycleState = lifecycleState;
        this.targetResourceFilter = targetResourceFilter;
        this.rootCauseDetail = rootCauseDetail;
        this.timeAnomalyEventDate = timeAnomalyEventDate;
        this.costImpact = costImpact;
        this.costVariancePercentage = costVariancePercentage;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the Cost Anomaly Event. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Cost Anomaly Event.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the associated cost Anomaly. */
        @com.fasterxml.jackson.annotation.JsonProperty("costAnomalyName")
        private String costAnomalyName;

        /**
         * The name of the associated cost Anomaly.
         *
         * @param costAnomalyName the value to set
         * @return this builder
         */
        public Builder costAnomalyName(String costAnomalyName) {
            this.costAnomalyName = costAnomalyName;
            this.__explicitlySet__.add("costAnomalyName");
            return this;
        }
        /** The OCID of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the associated cost monitor. */
        @com.fasterxml.jackson.annotation.JsonProperty("costMonitorId")
        private String costMonitorId;

        /**
         * The OCID of the associated cost monitor.
         *
         * @param costMonitorId the value to set
         * @return this builder
         */
        public Builder costMonitorId(String costMonitorId) {
            this.costMonitorId = costMonitorId;
            this.__explicitlySet__.add("costMonitorId");
            return this;
        }
        /** The name of the associated cost monitor. */
        @com.fasterxml.jackson.annotation.JsonProperty("costMonitorName")
        private String costMonitorName;

        /**
         * The name of the associated cost monitor.
         *
         * @param costMonitorName the value to set
         * @return this builder
         */
        public Builder costMonitorName(String costMonitorName) {
            this.costMonitorName = costMonitorName;
            this.__explicitlySet__.add("costMonitorName");
            return this;
        }
        /** Type of cost monitor */
        @com.fasterxml.jackson.annotation.JsonProperty("costMonitorType")
        private MonitorType costMonitorType;

        /**
         * Type of cost monitor
         *
         * @param costMonitorType the value to set
         * @return this builder
         */
        public Builder costMonitorType(MonitorType costMonitorType) {
            this.costMonitorType = costMonitorType;
            this.__explicitlySet__.add("costMonitorType");
            return this;
        }
        /** The current state of the cost anomaly event. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CostAnomalyEvent.LifecycleState lifecycleState;

        /**
         * The current state of the cost anomaly event.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(CostAnomalyEvent.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceFilter")
        private TargetResourceFilter targetResourceFilter;

        public Builder targetResourceFilter(TargetResourceFilter targetResourceFilter) {
            this.targetResourceFilter = targetResourceFilter;
            this.__explicitlySet__.add("targetResourceFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rootCauseDetail")
        private RootCauseDetail rootCauseDetail;

        public Builder rootCauseDetail(RootCauseDetail rootCauseDetail) {
            this.rootCauseDetail = rootCauseDetail;
            this.__explicitlySet__.add("rootCauseDetail");
            return this;
        }
        /** The event date of the anomaly event. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAnomalyEventDate")
        private java.util.Date timeAnomalyEventDate;

        /**
         * The event date of the anomaly event.
         *
         * @param timeAnomalyEventDate the value to set
         * @return this builder
         */
        public Builder timeAnomalyEventDate(java.util.Date timeAnomalyEventDate) {
            this.timeAnomalyEventDate = timeAnomalyEventDate;
            this.__explicitlySet__.add("timeAnomalyEventDate");
            return this;
        }
        /** The cost impact of the detected anomaly. */
        @com.fasterxml.jackson.annotation.JsonProperty("costImpact")
        private Double costImpact;

        /**
         * The cost impact of the detected anomaly.
         *
         * @param costImpact the value to set
         * @return this builder
         */
        public Builder costImpact(Double costImpact) {
            this.costImpact = costImpact;
            this.__explicitlySet__.add("costImpact");
            return this;
        }
        /** The cost variance percentage of the detected anomaly. */
        @com.fasterxml.jackson.annotation.JsonProperty("costVariancePercentage")
        private Double costVariancePercentage;

        /**
         * The cost variance percentage of the detected anomaly.
         *
         * @param costVariancePercentage the value to set
         * @return this builder
         */
        public Builder costVariancePercentage(Double costVariancePercentage) {
            this.costVariancePercentage = costVariancePercentage;
            this.__explicitlySet__.add("costVariancePercentage");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CostAnomalyEventSummary build() {
            CostAnomalyEventSummary model =
                    new CostAnomalyEventSummary(
                            this.id,
                            this.costAnomalyName,
                            this.compartmentId,
                            this.costMonitorId,
                            this.costMonitorName,
                            this.costMonitorType,
                            this.lifecycleState,
                            this.targetResourceFilter,
                            this.rootCauseDetail,
                            this.timeAnomalyEventDate,
                            this.costImpact,
                            this.costVariancePercentage,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CostAnomalyEventSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("costAnomalyName")) {
                this.costAnomalyName(model.getCostAnomalyName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("costMonitorId")) {
                this.costMonitorId(model.getCostMonitorId());
            }
            if (model.wasPropertyExplicitlySet("costMonitorName")) {
                this.costMonitorName(model.getCostMonitorName());
            }
            if (model.wasPropertyExplicitlySet("costMonitorType")) {
                this.costMonitorType(model.getCostMonitorType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("targetResourceFilter")) {
                this.targetResourceFilter(model.getTargetResourceFilter());
            }
            if (model.wasPropertyExplicitlySet("rootCauseDetail")) {
                this.rootCauseDetail(model.getRootCauseDetail());
            }
            if (model.wasPropertyExplicitlySet("timeAnomalyEventDate")) {
                this.timeAnomalyEventDate(model.getTimeAnomalyEventDate());
            }
            if (model.wasPropertyExplicitlySet("costImpact")) {
                this.costImpact(model.getCostImpact());
            }
            if (model.wasPropertyExplicitlySet("costVariancePercentage")) {
                this.costVariancePercentage(model.getCostVariancePercentage());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** The OCID of the Cost Anomaly Event. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Cost Anomaly Event.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the associated cost Anomaly. */
    @com.fasterxml.jackson.annotation.JsonProperty("costAnomalyName")
    private final String costAnomalyName;

    /**
     * The name of the associated cost Anomaly.
     *
     * @return the value
     */
    public String getCostAnomalyName() {
        return costAnomalyName;
    }

    /** The OCID of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the associated cost monitor. */
    @com.fasterxml.jackson.annotation.JsonProperty("costMonitorId")
    private final String costMonitorId;

    /**
     * The OCID of the associated cost monitor.
     *
     * @return the value
     */
    public String getCostMonitorId() {
        return costMonitorId;
    }

    /** The name of the associated cost monitor. */
    @com.fasterxml.jackson.annotation.JsonProperty("costMonitorName")
    private final String costMonitorName;

    /**
     * The name of the associated cost monitor.
     *
     * @return the value
     */
    public String getCostMonitorName() {
        return costMonitorName;
    }

    /** Type of cost monitor */
    @com.fasterxml.jackson.annotation.JsonProperty("costMonitorType")
    private final MonitorType costMonitorType;

    /**
     * Type of cost monitor
     *
     * @return the value
     */
    public MonitorType getCostMonitorType() {
        return costMonitorType;
    }

    /** The current state of the cost anomaly event. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CostAnomalyEvent.LifecycleState lifecycleState;

    /**
     * The current state of the cost anomaly event.
     *
     * @return the value
     */
    public CostAnomalyEvent.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceFilter")
    private final TargetResourceFilter targetResourceFilter;

    public TargetResourceFilter getTargetResourceFilter() {
        return targetResourceFilter;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rootCauseDetail")
    private final RootCauseDetail rootCauseDetail;

    public RootCauseDetail getRootCauseDetail() {
        return rootCauseDetail;
    }

    /** The event date of the anomaly event. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAnomalyEventDate")
    private final java.util.Date timeAnomalyEventDate;

    /**
     * The event date of the anomaly event.
     *
     * @return the value
     */
    public java.util.Date getTimeAnomalyEventDate() {
        return timeAnomalyEventDate;
    }

    /** The cost impact of the detected anomaly. */
    @com.fasterxml.jackson.annotation.JsonProperty("costImpact")
    private final Double costImpact;

    /**
     * The cost impact of the detected anomaly.
     *
     * @return the value
     */
    public Double getCostImpact() {
        return costImpact;
    }

    /** The cost variance percentage of the detected anomaly. */
    @com.fasterxml.jackson.annotation.JsonProperty("costVariancePercentage")
    private final Double costVariancePercentage;

    /**
     * The cost variance percentage of the detected anomaly.
     *
     * @return the value
     */
    public Double getCostVariancePercentage() {
        return costVariancePercentage;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("CostAnomalyEventSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", costAnomalyName=").append(String.valueOf(this.costAnomalyName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", costMonitorId=").append(String.valueOf(this.costMonitorId));
        sb.append(", costMonitorName=").append(String.valueOf(this.costMonitorName));
        sb.append(", costMonitorType=").append(String.valueOf(this.costMonitorType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", targetResourceFilter=").append(String.valueOf(this.targetResourceFilter));
        sb.append(", rootCauseDetail=").append(String.valueOf(this.rootCauseDetail));
        sb.append(", timeAnomalyEventDate=").append(String.valueOf(this.timeAnomalyEventDate));
        sb.append(", costImpact=").append(String.valueOf(this.costImpact));
        sb.append(", costVariancePercentage=").append(String.valueOf(this.costVariancePercentage));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CostAnomalyEventSummary)) {
            return false;
        }

        CostAnomalyEventSummary other = (CostAnomalyEventSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.costAnomalyName, other.costAnomalyName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.costMonitorId, other.costMonitorId)
                && java.util.Objects.equals(this.costMonitorName, other.costMonitorName)
                && java.util.Objects.equals(this.costMonitorType, other.costMonitorType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.targetResourceFilter, other.targetResourceFilter)
                && java.util.Objects.equals(this.rootCauseDetail, other.rootCauseDetail)
                && java.util.Objects.equals(this.timeAnomalyEventDate, other.timeAnomalyEventDate)
                && java.util.Objects.equals(this.costImpact, other.costImpact)
                && java.util.Objects.equals(
                        this.costVariancePercentage, other.costVariancePercentage)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.costAnomalyName == null ? 43 : this.costAnomalyName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.costMonitorId == null ? 43 : this.costMonitorId.hashCode());
        result =
                (result * PRIME)
                        + (this.costMonitorName == null ? 43 : this.costMonitorName.hashCode());
        result =
                (result * PRIME)
                        + (this.costMonitorType == null ? 43 : this.costMonitorType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceFilter == null
                                ? 43
                                : this.targetResourceFilter.hashCode());
        result =
                (result * PRIME)
                        + (this.rootCauseDetail == null ? 43 : this.rootCauseDetail.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAnomalyEventDate == null
                                ? 43
                                : this.timeAnomalyEventDate.hashCode());
        result = (result * PRIME) + (this.costImpact == null ? 43 : this.costImpact.hashCode());
        result =
                (result * PRIME)
                        + (this.costVariancePercentage == null
                                ? 43
                                : this.costVariancePercentage.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
