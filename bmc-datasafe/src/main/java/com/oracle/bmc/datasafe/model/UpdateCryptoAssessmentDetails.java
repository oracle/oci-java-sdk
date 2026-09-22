/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Updates one or more attributes of the specified crypto assessment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateCryptoAssessmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateCryptoAssessmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "schedule",
        "isAssessmentScheduled",
        "freeformTags",
        "definedTags"
    })
    public UpdateCryptoAssessmentDetails(
            String displayName,
            String schedule,
            Boolean isAssessmentScheduled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.schedule = schedule;
        this.isAssessmentScheduled = isAssessmentScheduled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The display name of the crypto assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the crypto assessment.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Updates the schedule associated with this latest crypto assessment. The schedule uses the
         * format: <version-string>;<version-specific-schedule>
         *
         * <p>For v1, the version-specific schedule format is: <ss> <mm> <hh> <day-of-week>
         * <day-of-month>
         *
         * <p>Specify either day-of-week for weekly schedules or day-of-month for monthly schedules.
         * Do not specify both. For monthly schedules, day-of-month must be between 1 and 28. If the
         * service generates a default monthly schedule for an assessment created on day 29, 30, or
         * 31 of a month, it uses day 28. Schedule updates are supported only for assessments of
         * type LATEST.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * Updates the schedule associated with this latest crypto assessment. The schedule uses the
         * format: <version-string>;<version-specific-schedule>
         *
         * <p>For v1, the version-specific schedule format is: <ss> <mm> <hh> <day-of-week>
         * <day-of-month>
         *
         * <p>Specify either day-of-week for weekly schedules or day-of-month for monthly schedules.
         * Do not specify both. For monthly schedules, day-of-month must be between 1 and 28. If the
         * service generates a default monthly schedule for an assessment created on day 29, 30, or
         * 31 of a month, it uses day 28. Schedule updates are supported only for assessments of
         * type LATEST.
         *
         * @param schedule the value to set
         * @return this builder
         */
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }
        /**
         * Indicates whether scheduled execution is active for this latest crypto assessment. When
         * set to true, the existing schedule is used unless a new schedule is provided. When set to
         * false, the schedule value is retained but scheduled execution is paused. Schedule state
         * updates are supported only for assessments of type LATEST.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAssessmentScheduled")
        private Boolean isAssessmentScheduled;

        /**
         * Indicates whether scheduled execution is active for this latest crypto assessment. When
         * set to true, the existing schedule is used unless a new schedule is provided. When set to
         * false, the schedule value is retained but scheduled execution is paused. Schedule state
         * updates are supported only for assessments of type LATEST.
         *
         * @param isAssessmentScheduled the value to set
         * @return this builder
         */
        public Builder isAssessmentScheduled(Boolean isAssessmentScheduled) {
            this.isAssessmentScheduled = isAssessmentScheduled;
            this.__explicitlySet__.add("isAssessmentScheduled");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCryptoAssessmentDetails build() {
            UpdateCryptoAssessmentDetails model =
                    new UpdateCryptoAssessmentDetails(
                            this.displayName,
                            this.schedule,
                            this.isAssessmentScheduled,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCryptoAssessmentDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
            }
            if (model.wasPropertyExplicitlySet("isAssessmentScheduled")) {
                this.isAssessmentScheduled(model.getIsAssessmentScheduled());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The display name of the crypto assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the crypto assessment.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Updates the schedule associated with this latest crypto assessment. The schedule uses the
     * format: <version-string>;<version-specific-schedule>
     *
     * <p>For v1, the version-specific schedule format is: <ss> <mm> <hh> <day-of-week>
     * <day-of-month>
     *
     * <p>Specify either day-of-week for weekly schedules or day-of-month for monthly schedules. Do
     * not specify both. For monthly schedules, day-of-month must be between 1 and 28. If the
     * service generates a default monthly schedule for an assessment created on day 29, 30, or 31
     * of a month, it uses day 28. Schedule updates are supported only for assessments of type
     * LATEST.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * Updates the schedule associated with this latest crypto assessment. The schedule uses the
     * format: <version-string>;<version-specific-schedule>
     *
     * <p>For v1, the version-specific schedule format is: <ss> <mm> <hh> <day-of-week>
     * <day-of-month>
     *
     * <p>Specify either day-of-week for weekly schedules or day-of-month for monthly schedules. Do
     * not specify both. For monthly schedules, day-of-month must be between 1 and 28. If the
     * service generates a default monthly schedule for an assessment created on day 29, 30, or 31
     * of a month, it uses day 28. Schedule updates are supported only for assessments of type
     * LATEST.
     *
     * @return the value
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Indicates whether scheduled execution is active for this latest crypto assessment. When set
     * to true, the existing schedule is used unless a new schedule is provided. When set to false,
     * the schedule value is retained but scheduled execution is paused. Schedule state updates are
     * supported only for assessments of type LATEST.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAssessmentScheduled")
    private final Boolean isAssessmentScheduled;

    /**
     * Indicates whether scheduled execution is active for this latest crypto assessment. When set
     * to true, the existing schedule is used unless a new schedule is provided. When set to false,
     * the schedule value is retained but scheduled execution is paused. Schedule state updates are
     * supported only for assessments of type LATEST.
     *
     * @return the value
     */
    public Boolean getIsAssessmentScheduled() {
        return isAssessmentScheduled;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateCryptoAssessmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", isAssessmentScheduled=").append(String.valueOf(this.isAssessmentScheduled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCryptoAssessmentDetails)) {
            return false;
        }

        UpdateCryptoAssessmentDetails other = (UpdateCryptoAssessmentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.isAssessmentScheduled, other.isAssessmentScheduled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result =
                (result * PRIME)
                        + (this.isAssessmentScheduled == null
                                ? 43
                                : this.isAssessmentScheduled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
