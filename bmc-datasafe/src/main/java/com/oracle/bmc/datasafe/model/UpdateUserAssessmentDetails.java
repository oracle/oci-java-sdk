/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Updates one or more attributes of the specified user assessment. <br>
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
        builder = UpdateUserAssessmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateUserAssessmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "displayName",
        "schedule",
        "freeformTags",
        "definedTags"
    })
    public UpdateUserAssessmentDetails(
            String description,
            String displayName,
            String schedule,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.displayName = displayName;
        this.schedule = schedule;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The description of the user assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the user assessment.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The display name of the user assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the user assessment.
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
         * The schedule for periodically saving the assessment. This is applicable only for
         * assessments of type save schedule and latest assessment. It updates the existing schedule
         * in a specified format: <version-string>;<version-specific-schedule>
         *
         * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
         * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints.
         * A workrequest is created only when clock time satisfies all the constraints. Constraints
         * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes =
         * <mm> (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range
         * for <hh> is [0, 23]) <day-of-week> can be either '*' (without quotes or a number between
         * 1(Monday) and 7(Sunday)) 4. No constraint introduced when it is '*'. When not, day of
         * week must equal the given value <day-of-month> can be either '*' (without quotes or a
         * number between 1 and 28) 5. No constraint introduced when it is '*'. When not, day of
         * month must equal the given value
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * The schedule for periodically saving the assessment. This is applicable only for
         * assessments of type save schedule and latest assessment. It updates the existing schedule
         * in a specified format: <version-string>;<version-specific-schedule>
         *
         * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
         * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints.
         * A workrequest is created only when clock time satisfies all the constraints. Constraints
         * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes =
         * <mm> (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range
         * for <hh> is [0, 23]) <day-of-week> can be either '*' (without quotes or a number between
         * 1(Monday) and 7(Sunday)) 4. No constraint introduced when it is '*'. When not, day of
         * week must equal the given value <day-of-month> can be either '*' (without quotes or a
         * number between 1 and 28) 5. No constraint introduced when it is '*'. When not, day of
         * month must equal the given value
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateUserAssessmentDetails build() {
            UpdateUserAssessmentDetails model =
                    new UpdateUserAssessmentDetails(
                            this.description,
                            this.displayName,
                            this.schedule,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateUserAssessmentDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
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

    /** The description of the user assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the user assessment.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The display name of the user assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the user assessment.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The schedule for periodically saving the assessment. This is applicable only for assessments
     * of type save schedule and latest assessment. It updates the existing schedule in a specified
     * format: <version-string>;<version-specific-schedule>
     *
     * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
     * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints. A
     * workrequest is created only when clock time satisfies all the constraints. Constraints
     * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes = <mm>
     * (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range for <hh>
     * is [0, 23]) <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and
     * 7(Sunday)) 4. No constraint introduced when it is '*'. When not, day of week must equal the
     * given value <day-of-month> can be either '*' (without quotes or a number between 1 and 28) 5.
     * No constraint introduced when it is '*'. When not, day of month must equal the given value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * The schedule for periodically saving the assessment. This is applicable only for assessments
     * of type save schedule and latest assessment. It updates the existing schedule in a specified
     * format: <version-string>;<version-specific-schedule>
     *
     * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
     * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints. A
     * workrequest is created only when clock time satisfies all the constraints. Constraints
     * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes = <mm>
     * (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range for <hh>
     * is [0, 23]) <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and
     * 7(Sunday)) 4. No constraint introduced when it is '*'. When not, day of week must equal the
     * given value <day-of-month> can be either '*' (without quotes or a number between 1 and 28) 5.
     * No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     * @return the value
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("UpdateUserAssessmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
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
        if (!(o instanceof UpdateUserAssessmentDetails)) {
            return false;
        }

        UpdateUserAssessmentDetails other = (UpdateUserAssessmentDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
