/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information about the news report to be updated.
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
    builder = UpdateNewsReportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateNewsReportDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "newsFrequency",
        "locale",
        "contentTypes",
        "onsTopicId",
        "freeformTags",
        "definedTags",
        "name",
        "description",
        "dayOfWeek",
        "areChildCompartmentsIncluded"
    })
    public UpdateNewsReportDetails(
            ResourceStatus status,
            NewsFrequency newsFrequency,
            NewsLocale locale,
            NewsContentTypes contentTypes,
            String onsTopicId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String name,
            String description,
            DayOfWeek dayOfWeek,
            Boolean areChildCompartmentsIncluded) {
        super();
        this.status = status;
        this.newsFrequency = newsFrequency;
        this.locale = locale;
        this.contentTypes = contentTypes;
        this.onsTopicId = onsTopicId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.name = name;
        this.description = description;
        this.dayOfWeek = dayOfWeek;
        this.areChildCompartmentsIncluded = areChildCompartmentsIncluded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defines if the news report will be enabled or disabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ResourceStatus status;

        /**
         * Defines if the news report will be enabled or disabled.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(ResourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * News report frequency.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("newsFrequency")
        private NewsFrequency newsFrequency;

        /**
         * News report frequency.
         * @param newsFrequency the value to set
         * @return this builder
         **/
        public Builder newsFrequency(NewsFrequency newsFrequency) {
            this.newsFrequency = newsFrequency;
            this.__explicitlySet__.add("newsFrequency");
            return this;
        }
        /**
         * Language of the news report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("locale")
        private NewsLocale locale;

        /**
         * Language of the news report.
         * @param locale the value to set
         * @return this builder
         **/
        public Builder locale(NewsLocale locale) {
            this.locale = locale;
            this.__explicitlySet__.add("locale");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentTypes")
        private NewsContentTypes contentTypes;

        public Builder contentTypes(NewsContentTypes contentTypes) {
            this.contentTypes = contentTypes;
            this.__explicitlySet__.add("contentTypes");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ONS topic.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("onsTopicId")
        private String onsTopicId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ONS topic.
         * @param onsTopicId the value to set
         * @return this builder
         **/
        public Builder onsTopicId(String onsTopicId) {
            this.onsTopicId = onsTopicId;
            this.__explicitlySet__.add("onsTopicId");
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
         * The news report name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The news report name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The description of the news report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the news report.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Day of the week in which the news report will be sent if the frequency is set to WEEKLY.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        /**
         * Day of the week in which the news report will be sent if the frequency is set to WEEKLY.
         * @param dayOfWeek the value to set
         * @return this builder
         **/
        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }
        /**
         * A flag to consider the resources within a given compartment and all sub-compartments.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areChildCompartmentsIncluded")
        private Boolean areChildCompartmentsIncluded;

        /**
         * A flag to consider the resources within a given compartment and all sub-compartments.
         * @param areChildCompartmentsIncluded the value to set
         * @return this builder
         **/
        public Builder areChildCompartmentsIncluded(Boolean areChildCompartmentsIncluded) {
            this.areChildCompartmentsIncluded = areChildCompartmentsIncluded;
            this.__explicitlySet__.add("areChildCompartmentsIncluded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNewsReportDetails build() {
            UpdateNewsReportDetails model =
                    new UpdateNewsReportDetails(
                            this.status,
                            this.newsFrequency,
                            this.locale,
                            this.contentTypes,
                            this.onsTopicId,
                            this.freeformTags,
                            this.definedTags,
                            this.name,
                            this.description,
                            this.dayOfWeek,
                            this.areChildCompartmentsIncluded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNewsReportDetails model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("newsFrequency")) {
                this.newsFrequency(model.getNewsFrequency());
            }
            if (model.wasPropertyExplicitlySet("locale")) {
                this.locale(model.getLocale());
            }
            if (model.wasPropertyExplicitlySet("contentTypes")) {
                this.contentTypes(model.getContentTypes());
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
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
     * Defines if the news report will be enabled or disabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ResourceStatus status;

    /**
     * Defines if the news report will be enabled or disabled.
     * @return the value
     **/
    public ResourceStatus getStatus() {
        return status;
    }

    /**
     * News report frequency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newsFrequency")
    private final NewsFrequency newsFrequency;

    /**
     * News report frequency.
     * @return the value
     **/
    public NewsFrequency getNewsFrequency() {
        return newsFrequency;
    }

    /**
     * Language of the news report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locale")
    private final NewsLocale locale;

    /**
     * Language of the news report.
     * @return the value
     **/
    public NewsLocale getLocale() {
        return locale;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contentTypes")
    private final NewsContentTypes contentTypes;

    public NewsContentTypes getContentTypes() {
        return contentTypes;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ONS topic.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onsTopicId")
    private final String onsTopicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ONS topic.
     * @return the value
     **/
    public String getOnsTopicId() {
        return onsTopicId;
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
     * The news report name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The news report name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The description of the news report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the news report.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Day of the week in which the news report will be sent if the frequency is set to WEEKLY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    private final DayOfWeek dayOfWeek;

    /**
     * Day of the week in which the news report will be sent if the frequency is set to WEEKLY.
     * @return the value
     **/
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * A flag to consider the resources within a given compartment and all sub-compartments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areChildCompartmentsIncluded")
    private final Boolean areChildCompartmentsIncluded;

    /**
     * A flag to consider the resources within a given compartment and all sub-compartments.
     * @return the value
     **/
    public Boolean getAreChildCompartmentsIncluded() {
        return areChildCompartmentsIncluded;
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
        sb.append("UpdateNewsReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", newsFrequency=").append(String.valueOf(this.newsFrequency));
        sb.append(", locale=").append(String.valueOf(this.locale));
        sb.append(", contentTypes=").append(String.valueOf(this.contentTypes));
        sb.append(", onsTopicId=").append(String.valueOf(this.onsTopicId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
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
        if (!(o instanceof UpdateNewsReportDetails)) {
            return false;
        }

        UpdateNewsReportDetails other = (UpdateNewsReportDetails) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.newsFrequency, other.newsFrequency)
                && java.util.Objects.equals(this.locale, other.locale)
                && java.util.Objects.equals(this.contentTypes, other.contentTypes)
                && java.util.Objects.equals(this.onsTopicId, other.onsTopicId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dayOfWeek, other.dayOfWeek)
                && java.util.Objects.equals(
                        this.areChildCompartmentsIncluded, other.areChildCompartmentsIncluded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.newsFrequency == null ? 43 : this.newsFrequency.hashCode());
        result = (result * PRIME) + (this.locale == null ? 43 : this.locale.hashCode());
        result = (result * PRIME) + (this.contentTypes == null ? 43 : this.contentTypes.hashCode());
        result = (result * PRIME) + (this.onsTopicId == null ? 43 : this.onsTopicId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
