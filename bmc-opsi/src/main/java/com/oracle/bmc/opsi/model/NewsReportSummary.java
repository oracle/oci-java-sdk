/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a news report resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NewsReportSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NewsReportSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "newsFrequency",
        "contentTypes",
        "locale",
        "id",
        "description",
        "compartmentId",
        "name",
        "onsTopicId",
        "freeformTags",
        "definedTags",
        "systemTags",
        "status",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "dayOfWeek",
        "areChildCompartmentsIncluded"
    })
    public NewsReportSummary(
            NewsFrequency newsFrequency,
            NewsContentTypes contentTypes,
            NewsLocale locale,
            String id,
            String description,
            String compartmentId,
            String name,
            String onsTopicId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            ResourceStatus status,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            DayOfWeek dayOfWeek,
            Boolean areChildCompartmentsIncluded) {
        super();
        this.newsFrequency = newsFrequency;
        this.contentTypes = contentTypes;
        this.locale = locale;
        this.id = id;
        this.description = description;
        this.compartmentId = compartmentId;
        this.name = name;
        this.onsTopicId = onsTopicId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.status = status;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.dayOfWeek = dayOfWeek;
        this.areChildCompartmentsIncluded = areChildCompartmentsIncluded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** News report frequency. */
        @com.fasterxml.jackson.annotation.JsonProperty("newsFrequency")
        private NewsFrequency newsFrequency;

        /**
         * News report frequency.
         *
         * @param newsFrequency the value to set
         * @return this builder
         */
        public Builder newsFrequency(NewsFrequency newsFrequency) {
            this.newsFrequency = newsFrequency;
            this.__explicitlySet__.add("newsFrequency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentTypes")
        private NewsContentTypes contentTypes;

        public Builder contentTypes(NewsContentTypes contentTypes) {
            this.contentTypes = contentTypes;
            this.__explicitlySet__.add("contentTypes");
            return this;
        }
        /** Language of the news report. */
        @com.fasterxml.jackson.annotation.JsonProperty("locale")
        private NewsLocale locale;

        /**
         * Language of the news report.
         *
         * @param locale the value to set
         * @return this builder
         */
        public Builder locale(NewsLocale locale) {
            this.locale = locale;
            this.__explicitlySet__.add("locale");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the news report resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the news report resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The description of the news report. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the news report.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The news report name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The news report name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the ONS topic.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onsTopicId")
        private String onsTopicId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the ONS topic.
         *
         * @param onsTopicId the value to set
         * @return this builder
         */
        public Builder onsTopicId(String onsTopicId) {
            this.onsTopicId = onsTopicId;
            this.__explicitlySet__.add("onsTopicId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Indicates the status of a news report in Ops Insights. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ResourceStatus status;

        /**
         * Indicates the status of a news report in Ops Insights.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(ResourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The time the the news report was first enabled. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the news report was first enabled. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the news report was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the news report was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the news report. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the news report.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Day of the week in which the news report will be sent if the frequency is set to WEEKLY.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        /**
         * Day of the week in which the news report will be sent if the frequency is set to WEEKLY.
         *
         * @param dayOfWeek the value to set
         * @return this builder
         */
        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }
        /** A flag to consider the resources within a given compartment and all sub-compartments. */
        @com.fasterxml.jackson.annotation.JsonProperty("areChildCompartmentsIncluded")
        private Boolean areChildCompartmentsIncluded;

        /**
         * A flag to consider the resources within a given compartment and all sub-compartments.
         *
         * @param areChildCompartmentsIncluded the value to set
         * @return this builder
         */
        public Builder areChildCompartmentsIncluded(Boolean areChildCompartmentsIncluded) {
            this.areChildCompartmentsIncluded = areChildCompartmentsIncluded;
            this.__explicitlySet__.add("areChildCompartmentsIncluded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NewsReportSummary build() {
            NewsReportSummary model =
                    new NewsReportSummary(
                            this.newsFrequency,
                            this.contentTypes,
                            this.locale,
                            this.id,
                            this.description,
                            this.compartmentId,
                            this.name,
                            this.onsTopicId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.status,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.dayOfWeek,
                            this.areChildCompartmentsIncluded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NewsReportSummary model) {
            if (model.wasPropertyExplicitlySet("newsFrequency")) {
                this.newsFrequency(model.getNewsFrequency());
            }
            if (model.wasPropertyExplicitlySet("contentTypes")) {
                this.contentTypes(model.getContentTypes());
            }
            if (model.wasPropertyExplicitlySet("locale")) {
                this.locale(model.getLocale());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("onsTopicId")) {
                this.onsTopicId(model.getOnsTopicId());
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
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("dayOfWeek")) {
                this.dayOfWeek(model.getDayOfWeek());
            }
            if (model.wasPropertyExplicitlySet("areChildCompartmentsIncluded")) {
                this.areChildCompartmentsIncluded(model.getAreChildCompartmentsIncluded());
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

    /** News report frequency. */
    @com.fasterxml.jackson.annotation.JsonProperty("newsFrequency")
    private final NewsFrequency newsFrequency;

    /**
     * News report frequency.
     *
     * @return the value
     */
    public NewsFrequency getNewsFrequency() {
        return newsFrequency;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contentTypes")
    private final NewsContentTypes contentTypes;

    public NewsContentTypes getContentTypes() {
        return contentTypes;
    }

    /** Language of the news report. */
    @com.fasterxml.jackson.annotation.JsonProperty("locale")
    private final NewsLocale locale;

    /**
     * Language of the news report.
     *
     * @return the value
     */
    public NewsLocale getLocale() {
        return locale;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the news report resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the news report resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The description of the news report. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the news report.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The news report name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The news report name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the ONS topic.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onsTopicId")
    private final String onsTopicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the ONS topic.
     *
     * @return the value
     */
    public String getOnsTopicId() {
        return onsTopicId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** Indicates the status of a news report in Ops Insights. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ResourceStatus status;

    /**
     * Indicates the status of a news report in Ops Insights.
     *
     * @return the value
     */
    public ResourceStatus getStatus() {
        return status;
    }

    /** The time the the news report was first enabled. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the news report was first enabled. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the news report was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the news report was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the news report. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the news report.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Day of the week in which the news report will be sent if the frequency is set to WEEKLY. */
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    private final DayOfWeek dayOfWeek;

    /**
     * Day of the week in which the news report will be sent if the frequency is set to WEEKLY.
     *
     * @return the value
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /** A flag to consider the resources within a given compartment and all sub-compartments. */
    @com.fasterxml.jackson.annotation.JsonProperty("areChildCompartmentsIncluded")
    private final Boolean areChildCompartmentsIncluded;

    /**
     * A flag to consider the resources within a given compartment and all sub-compartments.
     *
     * @return the value
     */
    public Boolean getAreChildCompartmentsIncluded() {
        return areChildCompartmentsIncluded;
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
        sb.append("NewsReportSummary(");
        sb.append("super=").append(super.toString());
        sb.append("newsFrequency=").append(String.valueOf(this.newsFrequency));
        sb.append(", contentTypes=").append(String.valueOf(this.contentTypes));
        sb.append(", locale=").append(String.valueOf(this.locale));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", onsTopicId=").append(String.valueOf(this.onsTopicId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", dayOfWeek=").append(String.valueOf(this.dayOfWeek));
        sb.append(", areChildCompartmentsIncluded=")
                .append(String.valueOf(this.areChildCompartmentsIncluded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewsReportSummary)) {
            return false;
        }

        NewsReportSummary other = (NewsReportSummary) o;
        return java.util.Objects.equals(this.newsFrequency, other.newsFrequency)
                && java.util.Objects.equals(this.contentTypes, other.contentTypes)
                && java.util.Objects.equals(this.locale, other.locale)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.onsTopicId, other.onsTopicId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.dayOfWeek, other.dayOfWeek)
                && java.util.Objects.equals(
                        this.areChildCompartmentsIncluded, other.areChildCompartmentsIncluded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.newsFrequency == null ? 43 : this.newsFrequency.hashCode());
        result = (result * PRIME) + (this.contentTypes == null ? 43 : this.contentTypes.hashCode());
        result = (result * PRIME) + (this.locale == null ? 43 : this.locale.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.onsTopicId == null ? 43 : this.onsTopicId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.dayOfWeek == null ? 43 : this.dayOfWeek.hashCode());
        result =
                (result * PRIME)
                        + (this.areChildCompartmentsIncluded == null
                                ? 43
                                : this.areChildCompartmentsIncluded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
