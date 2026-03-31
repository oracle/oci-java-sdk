/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a Ops Insights chargeback plan.
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
    builder = ChargebackPlanSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChargebackPlanSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "planName",
        "planDescription",
        "planType",
        "planCategory",
        "isCustomizable",
        "entitySource",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags",
        "lifecycleState",
        "lifecycleDetails",
        "planCustomItems"
    })
    public ChargebackPlanSummary(
            String id,
            String compartmentId,
            String planName,
            String planDescription,
            String planType,
            ChargebackPlanCategory planCategory,
            Boolean isCustomizable,
            ChargebackPlanEntitySource entitySource,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.List<CreatePlanCustomItemDetails> planCustomItems) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.planName = planName;
        this.planDescription = planDescription;
        this.planType = planType;
        this.planCategory = planCategory;
        this.isCustomizable = isCustomizable;
        this.entitySource = entitySource;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.planCustomItems = planCustomItems;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI Chargeback plan resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI Chargeback plan resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Name for the OPSI Chargeback plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planName")
        private String planName;

        /**
         * Name for the OPSI Chargeback plan.
         * @param planName the value to set
         * @return this builder
         **/
        public Builder planName(String planName) {
            this.planName = planName;
            this.__explicitlySet__.add("planName");
            return this;
        }
        /**
         * Description of OPSI Chargeback Plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planDescription")
        private String planDescription;

        /**
         * Description of OPSI Chargeback Plan.
         * @param planDescription the value to set
         * @return this builder
         **/
        public Builder planDescription(String planDescription) {
            this.planDescription = planDescription;
            this.__explicitlySet__.add("planDescription");
            return this;
        }
        /**
         * Chargeback Plan type of the chargeback entity. For an Exadata it can be WEIGHTED_ALLOCATION, EQUAL_ALLOCATION, UNUSED_ALLOCATION.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planType")
        private String planType;

        /**
         * Chargeback Plan type of the chargeback entity. For an Exadata it can be WEIGHTED_ALLOCATION, EQUAL_ALLOCATION, UNUSED_ALLOCATION.
         *
         * @param planType the value to set
         * @return this builder
         **/
        public Builder planType(String planType) {
            this.planType = planType;
            this.__explicitlySet__.add("planType");
            return this;
        }
        /**
         * Chargeback Plan category of the chargeback entity. It can be OOB, or CUSTOM.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planCategory")
        private ChargebackPlanCategory planCategory;

        /**
         * Chargeback Plan category of the chargeback entity. It can be OOB, or CUSTOM.
         * @param planCategory the value to set
         * @return this builder
         **/
        public Builder planCategory(ChargebackPlanCategory planCategory) {
            this.planCategory = planCategory;
            this.__explicitlySet__.add("planCategory");
            return this;
        }
        /**
         * Indicates whether the chargeback plan can be customized.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomizable")
        private Boolean isCustomizable;

        /**
         * Indicates whether the chargeback plan can be customized.
         * @param isCustomizable the value to set
         * @return this builder
         **/
        public Builder isCustomizable(Boolean isCustomizable) {
            this.isCustomizable = isCustomizable;
            this.__explicitlySet__.add("isCustomizable");
            return this;
        }
        /**
         * Source of the chargeback plan.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entitySource")
        private ChargebackPlanEntitySource entitySource;

        /**
         * Source of the chargeback plan.
         * @param entitySource the value to set
         * @return this builder
         **/
        public Builder entitySource(ChargebackPlanEntitySource entitySource) {
            this.entitySource = entitySource;
            this.__explicitlySet__.add("entitySource");
            return this;
        }
        /**
         * The date and time the chargeback plan was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the chargeback plan was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time chargeback plan was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time chargeback plan was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * Chargeback Plan lifecycle states
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Chargeback Plan lifecycle states
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * List of chargeback plan customizations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planCustomItems")
        private java.util.List<CreatePlanCustomItemDetails> planCustomItems;

        /**
         * List of chargeback plan customizations.
         * @param planCustomItems the value to set
         * @return this builder
         **/
        public Builder planCustomItems(
                java.util.List<CreatePlanCustomItemDetails> planCustomItems) {
            this.planCustomItems = planCustomItems;
            this.__explicitlySet__.add("planCustomItems");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChargebackPlanSummary build() {
            ChargebackPlanSummary model =
                    new ChargebackPlanSummary(
                            this.id,
                            this.compartmentId,
                            this.planName,
                            this.planDescription,
                            this.planType,
                            this.planCategory,
                            this.isCustomizable,
                            this.entitySource,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.planCustomItems);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChargebackPlanSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("planName")) {
                this.planName(model.getPlanName());
            }
            if (model.wasPropertyExplicitlySet("planDescription")) {
                this.planDescription(model.getPlanDescription());
            }
            if (model.wasPropertyExplicitlySet("planType")) {
                this.planType(model.getPlanType());
            }
            if (model.wasPropertyExplicitlySet("planCategory")) {
                this.planCategory(model.getPlanCategory());
            }
            if (model.wasPropertyExplicitlySet("isCustomizable")) {
                this.isCustomizable(model.getIsCustomizable());
            }
            if (model.wasPropertyExplicitlySet("entitySource")) {
                this.entitySource(model.getEntitySource());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("planCustomItems")) {
                this.planCustomItems(model.getPlanCustomItems());
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
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI Chargeback plan resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI Chargeback plan resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Name for the OPSI Chargeback plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planName")
    private final String planName;

    /**
     * Name for the OPSI Chargeback plan.
     * @return the value
     **/
    public String getPlanName() {
        return planName;
    }

    /**
     * Description of OPSI Chargeback Plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planDescription")
    private final String planDescription;

    /**
     * Description of OPSI Chargeback Plan.
     * @return the value
     **/
    public String getPlanDescription() {
        return planDescription;
    }

    /**
     * Chargeback Plan type of the chargeback entity. For an Exadata it can be WEIGHTED_ALLOCATION, EQUAL_ALLOCATION, UNUSED_ALLOCATION.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planType")
    private final String planType;

    /**
     * Chargeback Plan type of the chargeback entity. For an Exadata it can be WEIGHTED_ALLOCATION, EQUAL_ALLOCATION, UNUSED_ALLOCATION.
     *
     * @return the value
     **/
    public String getPlanType() {
        return planType;
    }

    /**
     * Chargeback Plan category of the chargeback entity. It can be OOB, or CUSTOM.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planCategory")
    private final ChargebackPlanCategory planCategory;

    /**
     * Chargeback Plan category of the chargeback entity. It can be OOB, or CUSTOM.
     * @return the value
     **/
    public ChargebackPlanCategory getPlanCategory() {
        return planCategory;
    }

    /**
     * Indicates whether the chargeback plan can be customized.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomizable")
    private final Boolean isCustomizable;

    /**
     * Indicates whether the chargeback plan can be customized.
     * @return the value
     **/
    public Boolean getIsCustomizable() {
        return isCustomizable;
    }

    /**
     * Source of the chargeback plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitySource")
    private final ChargebackPlanEntitySource entitySource;

    /**
     * Source of the chargeback plan.
     * @return the value
     **/
    public ChargebackPlanEntitySource getEntitySource() {
        return entitySource;
    }

    /**
     * The date and time the chargeback plan was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the chargeback plan was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time chargeback plan was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time chargeback plan was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Chargeback Plan lifecycle states
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Chargeback Plan lifecycle states
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * List of chargeback plan customizations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planCustomItems")
    private final java.util.List<CreatePlanCustomItemDetails> planCustomItems;

    /**
     * List of chargeback plan customizations.
     * @return the value
     **/
    public java.util.List<CreatePlanCustomItemDetails> getPlanCustomItems() {
        return planCustomItems;
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
        sb.append("ChargebackPlanSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", planName=").append(String.valueOf(this.planName));
        sb.append(", planDescription=").append(String.valueOf(this.planDescription));
        sb.append(", planType=").append(String.valueOf(this.planType));
        sb.append(", planCategory=").append(String.valueOf(this.planCategory));
        sb.append(", isCustomizable=").append(String.valueOf(this.isCustomizable));
        sb.append(", entitySource=").append(String.valueOf(this.entitySource));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", planCustomItems=").append(String.valueOf(this.planCustomItems));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChargebackPlanSummary)) {
            return false;
        }

        ChargebackPlanSummary other = (ChargebackPlanSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.planName, other.planName)
                && java.util.Objects.equals(this.planDescription, other.planDescription)
                && java.util.Objects.equals(this.planType, other.planType)
                && java.util.Objects.equals(this.planCategory, other.planCategory)
                && java.util.Objects.equals(this.isCustomizable, other.isCustomizable)
                && java.util.Objects.equals(this.entitySource, other.entitySource)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.planCustomItems, other.planCustomItems)
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
        result = (result * PRIME) + (this.planName == null ? 43 : this.planName.hashCode());
        result =
                (result * PRIME)
                        + (this.planDescription == null ? 43 : this.planDescription.hashCode());
        result = (result * PRIME) + (this.planType == null ? 43 : this.planType.hashCode());
        result = (result * PRIME) + (this.planCategory == null ? 43 : this.planCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.isCustomizable == null ? 43 : this.isCustomizable.hashCode());
        result = (result * PRIME) + (this.entitySource == null ? 43 : this.entitySource.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.planCustomItems == null ? 43 : this.planCustomItems.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
