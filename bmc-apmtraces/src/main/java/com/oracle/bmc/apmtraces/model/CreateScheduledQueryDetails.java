/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Object that contains the details about the scheduled query to be created. <br>
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
        builder = CreateScheduledQueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateScheduledQueryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "scheduledQueryName",
        "scheduledQueryProcessingType",
        "scheduledQueryText",
        "scheduledQuerySchedule",
        "scheduledQueryDescription",
        "scheduledQueryMaximumRuntimeInSeconds",
        "scheduledQueryRetentionPeriodInMs",
        "scheduledQueryProcessingSubType",
        "scheduledQueryProcessingConfiguration",
        "scheduledQueryRetentionCriteria",
        "freeformTags",
        "definedTags"
    })
    public CreateScheduledQueryDetails(
            String scheduledQueryName,
            ScheduledQueryProcessingType scheduledQueryProcessingType,
            String scheduledQueryText,
            String scheduledQuerySchedule,
            String scheduledQueryDescription,
            Long scheduledQueryMaximumRuntimeInSeconds,
            Long scheduledQueryRetentionPeriodInMs,
            ScheduledQueryProcessingSubType scheduledQueryProcessingSubType,
            ScheduledQueryProcessingConfig scheduledQueryProcessingConfiguration,
            ScheduledQueryRetentionCriteria scheduledQueryRetentionCriteria,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.scheduledQueryName = scheduledQueryName;
        this.scheduledQueryProcessingType = scheduledQueryProcessingType;
        this.scheduledQueryText = scheduledQueryText;
        this.scheduledQuerySchedule = scheduledQuerySchedule;
        this.scheduledQueryDescription = scheduledQueryDescription;
        this.scheduledQueryMaximumRuntimeInSeconds = scheduledQueryMaximumRuntimeInSeconds;
        this.scheduledQueryRetentionPeriodInMs = scheduledQueryRetentionPeriodInMs;
        this.scheduledQueryProcessingSubType = scheduledQueryProcessingSubType;
        this.scheduledQueryProcessingConfiguration = scheduledQueryProcessingConfiguration;
        this.scheduledQueryRetentionCriteria = scheduledQueryRetentionCriteria;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the scheduled query. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryName")
        private String scheduledQueryName;

        /**
         * Name of the scheduled query.
         *
         * @param scheduledQueryName the value to set
         * @return this builder
         */
        public Builder scheduledQueryName(String scheduledQueryName) {
            this.scheduledQueryName = scheduledQueryName;
            this.__explicitlySet__.add("scheduledQueryName");
            return this;
        }
        /** Type of the scheduled query. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryProcessingType")
        private ScheduledQueryProcessingType scheduledQueryProcessingType;

        /**
         * Type of the scheduled query.
         *
         * @param scheduledQueryProcessingType the value to set
         * @return this builder
         */
        public Builder scheduledQueryProcessingType(
                ScheduledQueryProcessingType scheduledQueryProcessingType) {
            this.scheduledQueryProcessingType = scheduledQueryProcessingType;
            this.__explicitlySet__.add("scheduledQueryProcessingType");
            return this;
        }
        /** Scheduled query to be run. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryText")
        private String scheduledQueryText;

        /**
         * Scheduled query to be run.
         *
         * @param scheduledQueryText the value to set
         * @return this builder
         */
        public Builder scheduledQueryText(String scheduledQueryText) {
            this.scheduledQueryText = scheduledQueryText;
            this.__explicitlySet__.add("scheduledQueryText");
            return this;
        }
        /** Schedule for the scheduled query. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQuerySchedule")
        private String scheduledQuerySchedule;

        /**
         * Schedule for the scheduled query.
         *
         * @param scheduledQuerySchedule the value to set
         * @return this builder
         */
        public Builder scheduledQuerySchedule(String scheduledQuerySchedule) {
            this.scheduledQuerySchedule = scheduledQuerySchedule;
            this.__explicitlySet__.add("scheduledQuerySchedule");
            return this;
        }
        /** Description for the scheduled query. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryDescription")
        private String scheduledQueryDescription;

        /**
         * Description for the scheduled query.
         *
         * @param scheduledQueryDescription the value to set
         * @return this builder
         */
        public Builder scheduledQueryDescription(String scheduledQueryDescription) {
            this.scheduledQueryDescription = scheduledQueryDescription;
            this.__explicitlySet__.add("scheduledQueryDescription");
            return this;
        }
        /** Maximum runtime for the scheduled query in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryMaximumRuntimeInSeconds")
        private Long scheduledQueryMaximumRuntimeInSeconds;

        /**
         * Maximum runtime for the scheduled query in seconds.
         *
         * @param scheduledQueryMaximumRuntimeInSeconds the value to set
         * @return this builder
         */
        public Builder scheduledQueryMaximumRuntimeInSeconds(
                Long scheduledQueryMaximumRuntimeInSeconds) {
            this.scheduledQueryMaximumRuntimeInSeconds = scheduledQueryMaximumRuntimeInSeconds;
            this.__explicitlySet__.add("scheduledQueryMaximumRuntimeInSeconds");
            return this;
        }
        /** Retention period for the scheduled query in milliseconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryRetentionPeriodInMs")
        private Long scheduledQueryRetentionPeriodInMs;

        /**
         * Retention period for the scheduled query in milliseconds.
         *
         * @param scheduledQueryRetentionPeriodInMs the value to set
         * @return this builder
         */
        public Builder scheduledQueryRetentionPeriodInMs(Long scheduledQueryRetentionPeriodInMs) {
            this.scheduledQueryRetentionPeriodInMs = scheduledQueryRetentionPeriodInMs;
            this.__explicitlySet__.add("scheduledQueryRetentionPeriodInMs");
            return this;
        }
        /** Processing sub type of the scheduled query. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryProcessingSubType")
        private ScheduledQueryProcessingSubType scheduledQueryProcessingSubType;

        /**
         * Processing sub type of the scheduled query.
         *
         * @param scheduledQueryProcessingSubType the value to set
         * @return this builder
         */
        public Builder scheduledQueryProcessingSubType(
                ScheduledQueryProcessingSubType scheduledQueryProcessingSubType) {
            this.scheduledQueryProcessingSubType = scheduledQueryProcessingSubType;
            this.__explicitlySet__.add("scheduledQueryProcessingSubType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryProcessingConfiguration")
        private ScheduledQueryProcessingConfig scheduledQueryProcessingConfiguration;

        public Builder scheduledQueryProcessingConfiguration(
                ScheduledQueryProcessingConfig scheduledQueryProcessingConfiguration) {
            this.scheduledQueryProcessingConfiguration = scheduledQueryProcessingConfiguration;
            this.__explicitlySet__.add("scheduledQueryProcessingConfiguration");
            return this;
        }
        /** Retention criteria for the scheduled query. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryRetentionCriteria")
        private ScheduledQueryRetentionCriteria scheduledQueryRetentionCriteria;

        /**
         * Retention criteria for the scheduled query.
         *
         * @param scheduledQueryRetentionCriteria the value to set
         * @return this builder
         */
        public Builder scheduledQueryRetentionCriteria(
                ScheduledQueryRetentionCriteria scheduledQueryRetentionCriteria) {
            this.scheduledQueryRetentionCriteria = scheduledQueryRetentionCriteria;
            this.__explicitlySet__.add("scheduledQueryRetentionCriteria");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateScheduledQueryDetails build() {
            CreateScheduledQueryDetails model =
                    new CreateScheduledQueryDetails(
                            this.scheduledQueryName,
                            this.scheduledQueryProcessingType,
                            this.scheduledQueryText,
                            this.scheduledQuerySchedule,
                            this.scheduledQueryDescription,
                            this.scheduledQueryMaximumRuntimeInSeconds,
                            this.scheduledQueryRetentionPeriodInMs,
                            this.scheduledQueryProcessingSubType,
                            this.scheduledQueryProcessingConfiguration,
                            this.scheduledQueryRetentionCriteria,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateScheduledQueryDetails model) {
            if (model.wasPropertyExplicitlySet("scheduledQueryName")) {
                this.scheduledQueryName(model.getScheduledQueryName());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryProcessingType")) {
                this.scheduledQueryProcessingType(model.getScheduledQueryProcessingType());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryText")) {
                this.scheduledQueryText(model.getScheduledQueryText());
            }
            if (model.wasPropertyExplicitlySet("scheduledQuerySchedule")) {
                this.scheduledQuerySchedule(model.getScheduledQuerySchedule());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryDescription")) {
                this.scheduledQueryDescription(model.getScheduledQueryDescription());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryMaximumRuntimeInSeconds")) {
                this.scheduledQueryMaximumRuntimeInSeconds(
                        model.getScheduledQueryMaximumRuntimeInSeconds());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryRetentionPeriodInMs")) {
                this.scheduledQueryRetentionPeriodInMs(
                        model.getScheduledQueryRetentionPeriodInMs());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryProcessingSubType")) {
                this.scheduledQueryProcessingSubType(model.getScheduledQueryProcessingSubType());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryProcessingConfiguration")) {
                this.scheduledQueryProcessingConfiguration(
                        model.getScheduledQueryProcessingConfiguration());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryRetentionCriteria")) {
                this.scheduledQueryRetentionCriteria(model.getScheduledQueryRetentionCriteria());
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

    /** Name of the scheduled query. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryName")
    private final String scheduledQueryName;

    /**
     * Name of the scheduled query.
     *
     * @return the value
     */
    public String getScheduledQueryName() {
        return scheduledQueryName;
    }

    /** Type of the scheduled query. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryProcessingType")
    private final ScheduledQueryProcessingType scheduledQueryProcessingType;

    /**
     * Type of the scheduled query.
     *
     * @return the value
     */
    public ScheduledQueryProcessingType getScheduledQueryProcessingType() {
        return scheduledQueryProcessingType;
    }

    /** Scheduled query to be run. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryText")
    private final String scheduledQueryText;

    /**
     * Scheduled query to be run.
     *
     * @return the value
     */
    public String getScheduledQueryText() {
        return scheduledQueryText;
    }

    /** Schedule for the scheduled query. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQuerySchedule")
    private final String scheduledQuerySchedule;

    /**
     * Schedule for the scheduled query.
     *
     * @return the value
     */
    public String getScheduledQuerySchedule() {
        return scheduledQuerySchedule;
    }

    /** Description for the scheduled query. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryDescription")
    private final String scheduledQueryDescription;

    /**
     * Description for the scheduled query.
     *
     * @return the value
     */
    public String getScheduledQueryDescription() {
        return scheduledQueryDescription;
    }

    /** Maximum runtime for the scheduled query in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryMaximumRuntimeInSeconds")
    private final Long scheduledQueryMaximumRuntimeInSeconds;

    /**
     * Maximum runtime for the scheduled query in seconds.
     *
     * @return the value
     */
    public Long getScheduledQueryMaximumRuntimeInSeconds() {
        return scheduledQueryMaximumRuntimeInSeconds;
    }

    /** Retention period for the scheduled query in milliseconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryRetentionPeriodInMs")
    private final Long scheduledQueryRetentionPeriodInMs;

    /**
     * Retention period for the scheduled query in milliseconds.
     *
     * @return the value
     */
    public Long getScheduledQueryRetentionPeriodInMs() {
        return scheduledQueryRetentionPeriodInMs;
    }

    /** Processing sub type of the scheduled query. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryProcessingSubType")
    private final ScheduledQueryProcessingSubType scheduledQueryProcessingSubType;

    /**
     * Processing sub type of the scheduled query.
     *
     * @return the value
     */
    public ScheduledQueryProcessingSubType getScheduledQueryProcessingSubType() {
        return scheduledQueryProcessingSubType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryProcessingConfiguration")
    private final ScheduledQueryProcessingConfig scheduledQueryProcessingConfiguration;

    public ScheduledQueryProcessingConfig getScheduledQueryProcessingConfiguration() {
        return scheduledQueryProcessingConfiguration;
    }

    /** Retention criteria for the scheduled query. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryRetentionCriteria")
    private final ScheduledQueryRetentionCriteria scheduledQueryRetentionCriteria;

    /**
     * Retention criteria for the scheduled query.
     *
     * @return the value
     */
    public ScheduledQueryRetentionCriteria getScheduledQueryRetentionCriteria() {
        return scheduledQueryRetentionCriteria;
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
        sb.append("CreateScheduledQueryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("scheduledQueryName=").append(String.valueOf(this.scheduledQueryName));
        sb.append(", scheduledQueryProcessingType=")
                .append(String.valueOf(this.scheduledQueryProcessingType));
        sb.append(", scheduledQueryText=").append(String.valueOf(this.scheduledQueryText));
        sb.append(", scheduledQuerySchedule=").append(String.valueOf(this.scheduledQuerySchedule));
        sb.append(", scheduledQueryDescription=")
                .append(String.valueOf(this.scheduledQueryDescription));
        sb.append(", scheduledQueryMaximumRuntimeInSeconds=")
                .append(String.valueOf(this.scheduledQueryMaximumRuntimeInSeconds));
        sb.append(", scheduledQueryRetentionPeriodInMs=")
                .append(String.valueOf(this.scheduledQueryRetentionPeriodInMs));
        sb.append(", scheduledQueryProcessingSubType=")
                .append(String.valueOf(this.scheduledQueryProcessingSubType));
        sb.append(", scheduledQueryProcessingConfiguration=")
                .append(String.valueOf(this.scheduledQueryProcessingConfiguration));
        sb.append(", scheduledQueryRetentionCriteria=")
                .append(String.valueOf(this.scheduledQueryRetentionCriteria));
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
        if (!(o instanceof CreateScheduledQueryDetails)) {
            return false;
        }

        CreateScheduledQueryDetails other = (CreateScheduledQueryDetails) o;
        return java.util.Objects.equals(this.scheduledQueryName, other.scheduledQueryName)
                && java.util.Objects.equals(
                        this.scheduledQueryProcessingType, other.scheduledQueryProcessingType)
                && java.util.Objects.equals(this.scheduledQueryText, other.scheduledQueryText)
                && java.util.Objects.equals(
                        this.scheduledQuerySchedule, other.scheduledQuerySchedule)
                && java.util.Objects.equals(
                        this.scheduledQueryDescription, other.scheduledQueryDescription)
                && java.util.Objects.equals(
                        this.scheduledQueryMaximumRuntimeInSeconds,
                        other.scheduledQueryMaximumRuntimeInSeconds)
                && java.util.Objects.equals(
                        this.scheduledQueryRetentionPeriodInMs,
                        other.scheduledQueryRetentionPeriodInMs)
                && java.util.Objects.equals(
                        this.scheduledQueryProcessingSubType, other.scheduledQueryProcessingSubType)
                && java.util.Objects.equals(
                        this.scheduledQueryProcessingConfiguration,
                        other.scheduledQueryProcessingConfiguration)
                && java.util.Objects.equals(
                        this.scheduledQueryRetentionCriteria, other.scheduledQueryRetentionCriteria)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.scheduledQueryName == null
                                ? 43
                                : this.scheduledQueryName.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryProcessingType == null
                                ? 43
                                : this.scheduledQueryProcessingType.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryText == null
                                ? 43
                                : this.scheduledQueryText.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQuerySchedule == null
                                ? 43
                                : this.scheduledQuerySchedule.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryDescription == null
                                ? 43
                                : this.scheduledQueryDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryMaximumRuntimeInSeconds == null
                                ? 43
                                : this.scheduledQueryMaximumRuntimeInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryRetentionPeriodInMs == null
                                ? 43
                                : this.scheduledQueryRetentionPeriodInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryProcessingSubType == null
                                ? 43
                                : this.scheduledQueryProcessingSubType.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryProcessingConfiguration == null
                                ? 43
                                : this.scheduledQueryProcessingConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryRetentionCriteria == null
                                ? 43
                                : this.scheduledQueryRetentionCriteria.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
