/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * Schedule summary for the list schedule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScheduleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "description",
        "timeNextRun",
        "scheduleRecurrences",
        "timeScheduled",
        "freeformTags",
        "definedTags",
        "systemTags",
        "lifecycleState"
    })
    public ScheduleSummary(
            String id,
            String name,
            String description,
            java.util.Date timeNextRun,
            String scheduleRecurrences,
            java.util.Date timeScheduled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Schedule.LifecycleState lifecycleState) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.timeNextRun = timeNextRun;
        this.scheduleRecurrences = scheduleRecurrences;
        this.timeScheduled = timeScheduled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The schedule OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The schedule OCID.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The unique name of the user-created schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The unique name of the user-created schedule.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The description of the schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the schedule.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The date and time of the next job execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextRun")
        private java.util.Date timeNextRun;

        /**
         * The date and time of the next job execution.
         *
         * @param timeNextRun the value to set
         * @return this builder
         */
        public Builder timeNextRun(java.util.Date timeNextRun) {
            this.timeNextRun = timeNextRun;
            this.__explicitlySet__.add("timeNextRun");
            return this;
        }
        /**
         * Specifies the frequency according to when the schedule will be run, in the
         * x-obmcs-recurring-time format described in [RFC 5545 section
         * 3.3.10](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10). Supported values
         * are : ONE_TIME, DAILY, WEEKLY and MONTHLY.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleRecurrences")
        private String scheduleRecurrences;

        /**
         * Specifies the frequency according to when the schedule will be run, in the
         * x-obmcs-recurring-time format described in [RFC 5545 section
         * 3.3.10](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10). Supported values
         * are : ONE_TIME, DAILY, WEEKLY and MONTHLY.
         *
         * @param scheduleRecurrences the value to set
         * @return this builder
         */
        public Builder scheduleRecurrences(String scheduleRecurrences) {
            this.scheduleRecurrences = scheduleRecurrences;
            this.__explicitlySet__.add("scheduleRecurrences");
            return this;
        }
        /** The date and time of the first time job execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The date and time of the first time job execution.
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
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
        /** The schedule summary lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Schedule.LifecycleState lifecycleState;

        /**
         * The schedule summary lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Schedule.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleSummary build() {
            ScheduleSummary model =
                    new ScheduleSummary(
                            this.id,
                            this.name,
                            this.description,
                            this.timeNextRun,
                            this.scheduleRecurrences,
                            this.timeScheduled,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeNextRun")) {
                this.timeNextRun(model.getTimeNextRun());
            }
            if (model.wasPropertyExplicitlySet("scheduleRecurrences")) {
                this.scheduleRecurrences(model.getScheduleRecurrences());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
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

    /** The schedule OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The schedule OCID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The unique name of the user-created schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The unique name of the user-created schedule.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The description of the schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the schedule.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The date and time of the next job execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextRun")
    private final java.util.Date timeNextRun;

    /**
     * The date and time of the next job execution.
     *
     * @return the value
     */
    public java.util.Date getTimeNextRun() {
        return timeNextRun;
    }

    /**
     * Specifies the frequency according to when the schedule will be run, in the
     * x-obmcs-recurring-time format described in [RFC 5545 section
     * 3.3.10](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10). Supported values are :
     * ONE_TIME, DAILY, WEEKLY and MONTHLY.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleRecurrences")
    private final String scheduleRecurrences;

    /**
     * Specifies the frequency according to when the schedule will be run, in the
     * x-obmcs-recurring-time format described in [RFC 5545 section
     * 3.3.10](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10). Supported values are :
     * ONE_TIME, DAILY, WEEKLY and MONTHLY.
     *
     * @return the value
     */
    public String getScheduleRecurrences() {
        return scheduleRecurrences;
    }

    /** The date and time of the first time job execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The date and time of the first time job execution.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** The schedule summary lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Schedule.LifecycleState lifecycleState;

    /**
     * The schedule summary lifecycle state.
     *
     * @return the value
     */
    public Schedule.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("ScheduleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeNextRun=").append(String.valueOf(this.timeNextRun));
        sb.append(", scheduleRecurrences=").append(String.valueOf(this.scheduleRecurrences));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleSummary)) {
            return false;
        }

        ScheduleSummary other = (ScheduleSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeNextRun, other.timeNextRun)
                && java.util.Objects.equals(this.scheduleRecurrences, other.scheduleRecurrences)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeNextRun == null ? 43 : this.timeNextRun.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleRecurrences == null
                                ? 43
                                : this.scheduleRecurrences.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
