/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the recommendation summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RecommendationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecommendationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "categoryId",
        "name",
        "description",
        "importance",
        "resourceCounts",
        "lifecycleState",
        "estimatedCostSaving",
        "status",
        "timeStatusBegin",
        "timeStatusEnd",
        "timeCreated",
        "timeUpdated",
        "supportedLevels",
        "extendedMetadata"
    })
    public RecommendationSummary(
            String id,
            String compartmentId,
            String categoryId,
            String name,
            String description,
            Importance importance,
            java.util.List<ResourceCount> resourceCounts,
            LifecycleState lifecycleState,
            Double estimatedCostSaving,
            Status status,
            java.util.Date timeStatusBegin,
            java.util.Date timeStatusEnd,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            SupportedLevels supportedLevels,
            java.util.Map<String, String> extendedMetadata) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.importance = importance;
        this.resourceCounts = resourceCounts;
        this.lifecycleState = lifecycleState;
        this.estimatedCostSaving = estimatedCostSaving;
        this.status = status;
        this.timeStatusBegin = timeStatusBegin;
        this.timeStatusEnd = timeStatusEnd;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.supportedLevels = supportedLevels;
        this.extendedMetadata = extendedMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique OCID associated with the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique OCID associated with the recommendation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the tenancy. The tenancy is the root compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy. The tenancy is the root compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The unique OCID associated with the category. */
        @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
        private String categoryId;

        /**
         * The unique OCID associated with the category.
         *
         * @param categoryId the value to set
         * @return this builder
         */
        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            this.__explicitlySet__.add("categoryId");
            return this;
        }
        /** The name assigned to the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name assigned to the recommendation.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Text describing the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Text describing the recommendation.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The level of importance assigned to the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("importance")
        private Importance importance;

        /**
         * The level of importance assigned to the recommendation.
         *
         * @param importance the value to set
         * @return this builder
         */
        public Builder importance(Importance importance) {
            this.importance = importance;
            this.__explicitlySet__.add("importance");
            return this;
        }
        /**
         * An array of {@code ResourceCount} objects grouped by the status of the resource actions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceCounts")
        private java.util.List<ResourceCount> resourceCounts;

        /**
         * An array of {@code ResourceCount} objects grouped by the status of the resource actions.
         *
         * @param resourceCounts the value to set
         * @return this builder
         */
        public Builder resourceCounts(java.util.List<ResourceCount> resourceCounts) {
            this.resourceCounts = resourceCounts;
            this.__explicitlySet__.add("resourceCounts");
            return this;
        }
        /** The recommendation's current state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The recommendation's current state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The estimated cost savings, in dollars, for the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedCostSaving")
        private Double estimatedCostSaving;

        /**
         * The estimated cost savings, in dollars, for the recommendation.
         *
         * @param estimatedCostSaving the value to set
         * @return this builder
         */
        public Builder estimatedCostSaving(Double estimatedCostSaving) {
            this.estimatedCostSaving = estimatedCostSaving;
            this.__explicitlySet__.add("estimatedCostSaving");
            return this;
        }
        /** The current status of the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current status of the recommendation.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The date and time that the recommendation entered its current status. The format is
         * defined by RFC3339.
         *
         * <p>For example, "The status of the recommendation changed from {@code pending} to {@code
         * current(ignored)} on this date and time."
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusBegin")
        private java.util.Date timeStatusBegin;

        /**
         * The date and time that the recommendation entered its current status. The format is
         * defined by RFC3339.
         *
         * <p>For example, "The status of the recommendation changed from {@code pending} to {@code
         * current(ignored)} on this date and time."
         *
         * @param timeStatusBegin the value to set
         * @return this builder
         */
        public Builder timeStatusBegin(java.util.Date timeStatusBegin) {
            this.timeStatusBegin = timeStatusBegin;
            this.__explicitlySet__.add("timeStatusBegin");
            return this;
        }
        /**
         * The date and time the current status will change. The format is defined by RFC3339.
         *
         * <p>For example, "The current {@code postponed} status of the recommendation will end and
         * change to {@code pending} on this date and time."
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
        private java.util.Date timeStatusEnd;

        /**
         * The date and time the current status will change. The format is defined by RFC3339.
         *
         * <p>For example, "The current {@code postponed} status of the recommendation will end and
         * change to {@code pending} on this date and time."
         *
         * @param timeStatusEnd the value to set
         * @return this builder
         */
        public Builder timeStatusEnd(java.util.Date timeStatusEnd) {
            this.timeStatusEnd = timeStatusEnd;
            this.__explicitlySet__.add("timeStatusEnd");
            return this;
        }
        /**
         * The date and time the recommendation details were created, in the format defined by
         * RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the recommendation details were created, in the format defined by
         * RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the recommendation details were last updated, in the format defined by
         * RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the recommendation details were last updated, in the format defined by
         * RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedLevels")
        private SupportedLevels supportedLevels;

        public Builder supportedLevels(SupportedLevels supportedLevels) {
            this.supportedLevels = supportedLevels;
            this.__explicitlySet__.add("supportedLevels");
            return this;
        }
        /**
         * Additional metadata key/value pairs for the recommendation summary.
         *
         * <p>For example:
         *
         * <p>{@code {"EstimatedSaving": "200"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, String> extendedMetadata;

        /**
         * Additional metadata key/value pairs for the recommendation summary.
         *
         * <p>For example:
         *
         * <p>{@code {"EstimatedSaving": "200"}}
         *
         * @param extendedMetadata the value to set
         * @return this builder
         */
        public Builder extendedMetadata(java.util.Map<String, String> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecommendationSummary build() {
            RecommendationSummary model =
                    new RecommendationSummary(
                            this.id,
                            this.compartmentId,
                            this.categoryId,
                            this.name,
                            this.description,
                            this.importance,
                            this.resourceCounts,
                            this.lifecycleState,
                            this.estimatedCostSaving,
                            this.status,
                            this.timeStatusBegin,
                            this.timeStatusEnd,
                            this.timeCreated,
                            this.timeUpdated,
                            this.supportedLevels,
                            this.extendedMetadata);
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
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("categoryId")) {
                this.categoryId(model.getCategoryId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("importance")) {
                this.importance(model.getImportance());
            }
            if (model.wasPropertyExplicitlySet("resourceCounts")) {
                this.resourceCounts(model.getResourceCounts());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("estimatedCostSaving")) {
                this.estimatedCostSaving(model.getEstimatedCostSaving());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeStatusBegin")) {
                this.timeStatusBegin(model.getTimeStatusBegin());
            }
            if (model.wasPropertyExplicitlySet("timeStatusEnd")) {
                this.timeStatusEnd(model.getTimeStatusEnd());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("supportedLevels")) {
                this.supportedLevels(model.getSupportedLevels());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
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

    /** The unique OCID associated with the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique OCID associated with the recommendation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the tenancy. The tenancy is the root compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy. The tenancy is the root compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The unique OCID associated with the category. */
    @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
    private final String categoryId;

    /**
     * The unique OCID associated with the category.
     *
     * @return the value
     */
    public String getCategoryId() {
        return categoryId;
    }

    /** The name assigned to the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name assigned to the recommendation.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Text describing the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Text describing the recommendation.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The level of importance assigned to the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("importance")
    private final Importance importance;

    /**
     * The level of importance assigned to the recommendation.
     *
     * @return the value
     */
    public Importance getImportance() {
        return importance;
    }

    /** An array of {@code ResourceCount} objects grouped by the status of the resource actions. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCounts")
    private final java.util.List<ResourceCount> resourceCounts;

    /**
     * An array of {@code ResourceCount} objects grouped by the status of the resource actions.
     *
     * @return the value
     */
    public java.util.List<ResourceCount> getResourceCounts() {
        return resourceCounts;
    }

    /** The recommendation's current state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The recommendation's current state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The estimated cost savings, in dollars, for the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedCostSaving")
    private final Double estimatedCostSaving;

    /**
     * The estimated cost savings, in dollars, for the recommendation.
     *
     * @return the value
     */
    public Double getEstimatedCostSaving() {
        return estimatedCostSaving;
    }

    /** The current status of the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status of the recommendation.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * The date and time that the recommendation entered its current status. The format is defined
     * by RFC3339.
     *
     * <p>For example, "The status of the recommendation changed from {@code pending} to {@code
     * current(ignored)} on this date and time."
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusBegin")
    private final java.util.Date timeStatusBegin;

    /**
     * The date and time that the recommendation entered its current status. The format is defined
     * by RFC3339.
     *
     * <p>For example, "The status of the recommendation changed from {@code pending} to {@code
     * current(ignored)} on this date and time."
     *
     * @return the value
     */
    public java.util.Date getTimeStatusBegin() {
        return timeStatusBegin;
    }

    /**
     * The date and time the current status will change. The format is defined by RFC3339.
     *
     * <p>For example, "The current {@code postponed} status of the recommendation will end and
     * change to {@code pending} on this date and time."
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
    private final java.util.Date timeStatusEnd;

    /**
     * The date and time the current status will change. The format is defined by RFC3339.
     *
     * <p>For example, "The current {@code postponed} status of the recommendation will end and
     * change to {@code pending} on this date and time."
     *
     * @return the value
     */
    public java.util.Date getTimeStatusEnd() {
        return timeStatusEnd;
    }

    /**
     * The date and time the recommendation details were created, in the format defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the recommendation details were created, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the recommendation details were last updated, in the format defined by
     * RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the recommendation details were last updated, in the format defined by
     * RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("supportedLevels")
    private final SupportedLevels supportedLevels;

    public SupportedLevels getSupportedLevels() {
        return supportedLevels;
    }

    /**
     * Additional metadata key/value pairs for the recommendation summary.
     *
     * <p>For example:
     *
     * <p>{@code {"EstimatedSaving": "200"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, String> extendedMetadata;

    /**
     * Additional metadata key/value pairs for the recommendation summary.
     *
     * <p>For example:
     *
     * <p>{@code {"EstimatedSaving": "200"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getExtendedMetadata() {
        return extendedMetadata;
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
        sb.append("RecommendationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", categoryId=").append(String.valueOf(this.categoryId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", importance=").append(String.valueOf(this.importance));
        sb.append(", resourceCounts=").append(String.valueOf(this.resourceCounts));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", estimatedCostSaving=").append(String.valueOf(this.estimatedCostSaving));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStatusBegin=").append(String.valueOf(this.timeStatusBegin));
        sb.append(", timeStatusEnd=").append(String.valueOf(this.timeStatusEnd));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", supportedLevels=").append(String.valueOf(this.supportedLevels));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
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
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.categoryId, other.categoryId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.importance, other.importance)
                && java.util.Objects.equals(this.resourceCounts, other.resourceCounts)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.estimatedCostSaving, other.estimatedCostSaving)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStatusBegin, other.timeStatusBegin)
                && java.util.Objects.equals(this.timeStatusEnd, other.timeStatusEnd)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.supportedLevels, other.supportedLevels)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
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
        result = (result * PRIME) + (this.categoryId == null ? 43 : this.categoryId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.importance == null ? 43 : this.importance.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCounts == null ? 43 : this.resourceCounts.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedCostSaving == null
                                ? 43
                                : this.estimatedCostSaving.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStatusBegin == null ? 43 : this.timeStatusBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStatusEnd == null ? 43 : this.timeStatusEnd.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedLevels == null ? 43 : this.supportedLevels.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
