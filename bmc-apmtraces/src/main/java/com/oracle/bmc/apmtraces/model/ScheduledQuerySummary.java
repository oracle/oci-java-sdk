/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Scheduled Query object. <br>
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
        builder = ScheduledQuerySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduledQuerySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "scheduledQueryName",
        "scheduledQueryProcessingType",
        "scheduledQueryText",
        "scheduledQuerySchedule",
        "scheduledQueryProcessingSubType",
        "scheduledQueryProcessingConfiguration",
        "scheduledQueryInstances",
        "scheduledQueryNextRunInMs",
        "scheduledQueryRetentionCriteria",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ScheduledQuerySummary(
            String id,
            String scheduledQueryName,
            ScheduledQueryProcessingType scheduledQueryProcessingType,
            String scheduledQueryText,
            String scheduledQuerySchedule,
            ScheduledQueryProcessingSubType scheduledQueryProcessingSubType,
            ScheduledQueryProcessingConfig scheduledQueryProcessingConfiguration,
            String scheduledQueryInstances,
            Long scheduledQueryNextRunInMs,
            ScheduledQueryRetentionCriteria scheduledQueryRetentionCriteria,
            LifecycleStates lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.scheduledQueryName = scheduledQueryName;
        this.scheduledQueryProcessingType = scheduledQueryProcessingType;
        this.scheduledQueryText = scheduledQueryText;
        this.scheduledQuerySchedule = scheduledQuerySchedule;
        this.scheduledQueryProcessingSubType = scheduledQueryProcessingSubType;
        this.scheduledQueryProcessingConfiguration = scheduledQueryProcessingConfiguration;
        this.scheduledQueryInstances = scheduledQueryInstances;
        this.scheduledQueryNextRunInMs = scheduledQueryNextRunInMs;
        this.scheduledQueryRetentionCriteria = scheduledQueryRetentionCriteria;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * scheduled query . An OCID is generated when the scheduled query is created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * scheduled query . An OCID is generated when the scheduled query is created.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
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
        /** Processing type of the scheduled query. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryProcessingType")
        private ScheduledQueryProcessingType scheduledQueryProcessingType;

        /**
         * Processing type of the scheduled query.
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
        /** Scheduled query instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryInstances")
        private String scheduledQueryInstances;

        /**
         * Scheduled query instances.
         *
         * @param scheduledQueryInstances the value to set
         * @return this builder
         */
        public Builder scheduledQueryInstances(String scheduledQueryInstances) {
            this.scheduledQueryInstances = scheduledQueryInstances;
            this.__explicitlySet__.add("scheduledQueryInstances");
            return this;
        }
        /** Next run for the scheduled query. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryNextRunInMs")
        private Long scheduledQueryNextRunInMs;

        /**
         * Next run for the scheduled query.
         *
         * @param scheduledQueryNextRunInMs the value to set
         * @return this builder
         */
        public Builder scheduledQueryNextRunInMs(Long scheduledQueryNextRunInMs) {
            this.scheduledQueryNextRunInMs = scheduledQueryNextRunInMs;
            this.__explicitlySet__.add("scheduledQueryNextRunInMs");
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
        /** The current lifecycle state of the Scheduled Query. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current lifecycle state of the Scheduled Query.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public ScheduledQuerySummary build() {
            ScheduledQuerySummary model =
                    new ScheduledQuerySummary(
                            this.id,
                            this.scheduledQueryName,
                            this.scheduledQueryProcessingType,
                            this.scheduledQueryText,
                            this.scheduledQuerySchedule,
                            this.scheduledQueryProcessingSubType,
                            this.scheduledQueryProcessingConfiguration,
                            this.scheduledQueryInstances,
                            this.scheduledQueryNextRunInMs,
                            this.scheduledQueryRetentionCriteria,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledQuerySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
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
            if (model.wasPropertyExplicitlySet("scheduledQueryProcessingSubType")) {
                this.scheduledQueryProcessingSubType(model.getScheduledQueryProcessingSubType());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryProcessingConfiguration")) {
                this.scheduledQueryProcessingConfiguration(
                        model.getScheduledQueryProcessingConfiguration());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryInstances")) {
                this.scheduledQueryInstances(model.getScheduledQueryInstances());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryNextRunInMs")) {
                this.scheduledQueryNextRunInMs(model.getScheduledQueryNextRunInMs());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryRetentionCriteria")) {
                this.scheduledQueryRetentionCriteria(model.getScheduledQueryRetentionCriteria());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * scheduled query . An OCID is generated when the scheduled query is created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * scheduled query . An OCID is generated when the scheduled query is created.
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /** Processing type of the scheduled query. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryProcessingType")
    private final ScheduledQueryProcessingType scheduledQueryProcessingType;

    /**
     * Processing type of the scheduled query.
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

    /** Scheduled query instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryInstances")
    private final String scheduledQueryInstances;

    /**
     * Scheduled query instances.
     *
     * @return the value
     */
    public String getScheduledQueryInstances() {
        return scheduledQueryInstances;
    }

    /** Next run for the scheduled query. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryNextRunInMs")
    private final Long scheduledQueryNextRunInMs;

    /**
     * Next run for the scheduled query.
     *
     * @return the value
     */
    public Long getScheduledQueryNextRunInMs() {
        return scheduledQueryNextRunInMs;
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

    /** The current lifecycle state of the Scheduled Query. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current lifecycle state of the Scheduled Query.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("ScheduledQuerySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", scheduledQueryName=").append(String.valueOf(this.scheduledQueryName));
        sb.append(", scheduledQueryProcessingType=")
                .append(String.valueOf(this.scheduledQueryProcessingType));
        sb.append(", scheduledQueryText=").append(String.valueOf(this.scheduledQueryText));
        sb.append(", scheduledQuerySchedule=").append(String.valueOf(this.scheduledQuerySchedule));
        sb.append(", scheduledQueryProcessingSubType=")
                .append(String.valueOf(this.scheduledQueryProcessingSubType));
        sb.append(", scheduledQueryProcessingConfiguration=")
                .append(String.valueOf(this.scheduledQueryProcessingConfiguration));
        sb.append(", scheduledQueryInstances=")
                .append(String.valueOf(this.scheduledQueryInstances));
        sb.append(", scheduledQueryNextRunInMs=")
                .append(String.valueOf(this.scheduledQueryNextRunInMs));
        sb.append(", scheduledQueryRetentionCriteria=")
                .append(String.valueOf(this.scheduledQueryRetentionCriteria));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledQuerySummary)) {
            return false;
        }

        ScheduledQuerySummary other = (ScheduledQuerySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.scheduledQueryName, other.scheduledQueryName)
                && java.util.Objects.equals(
                        this.scheduledQueryProcessingType, other.scheduledQueryProcessingType)
                && java.util.Objects.equals(this.scheduledQueryText, other.scheduledQueryText)
                && java.util.Objects.equals(
                        this.scheduledQuerySchedule, other.scheduledQuerySchedule)
                && java.util.Objects.equals(
                        this.scheduledQueryProcessingSubType, other.scheduledQueryProcessingSubType)
                && java.util.Objects.equals(
                        this.scheduledQueryProcessingConfiguration,
                        other.scheduledQueryProcessingConfiguration)
                && java.util.Objects.equals(
                        this.scheduledQueryInstances, other.scheduledQueryInstances)
                && java.util.Objects.equals(
                        this.scheduledQueryNextRunInMs, other.scheduledQueryNextRunInMs)
                && java.util.Objects.equals(
                        this.scheduledQueryRetentionCriteria, other.scheduledQueryRetentionCriteria)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
                        + (this.scheduledQueryInstances == null
                                ? 43
                                : this.scheduledQueryInstances.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryNextRunInMs == null
                                ? 43
                                : this.scheduledQueryNextRunInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryRetentionCriteria == null
                                ? 43
                                : this.scheduledQueryRetentionCriteria.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
