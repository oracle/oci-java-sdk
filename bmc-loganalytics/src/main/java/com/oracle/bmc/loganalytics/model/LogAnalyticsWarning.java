/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsWarning
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsWarning.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsWarning {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleDisplayName")
        private String ruleDisplayName;

        public Builder ruleDisplayName(String ruleDisplayName) {
            this.ruleDisplayName = ruleDisplayName;
            this.__explicitlySet__.add("ruleDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
        private String sourceDisplayName;

        public Builder sourceDisplayName(String sourceDisplayName) {
            this.sourceDisplayName = sourceDisplayName;
            this.__explicitlySet__.add("sourceDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warningId")
        private String warningId;

        public Builder warningId(String warningId) {
            this.warningId = warningId;
            this.__explicitlySet__.add("warningId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfInitialWarning")
        private java.util.Date timeOfInitialWarning;

        public Builder timeOfInitialWarning(java.util.Date timeOfInitialWarning) {
            this.timeOfInitialWarning = timeOfInitialWarning;
            this.__explicitlySet__.add("timeOfInitialWarning");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isActive")
        private Boolean isActive;

        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            this.__explicitlySet__.add("isActive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSuppressed")
        private Boolean isSuppressed;

        public Builder isSuppressed(Boolean isSuppressed) {
            this.isSuppressed = isSuppressed;
            this.__explicitlySet__.add("isSuppressed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestWarning")
        private java.util.Date timeOfLatestWarning;

        public Builder timeOfLatestWarning(java.util.Date timeOfLatestWarning) {
            this.timeOfLatestWarning = timeOfLatestWarning;
            this.__explicitlySet__.add("timeOfLatestWarning");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warningLevel")
        private String warningLevel;

        public Builder warningLevel(String warningLevel) {
            this.warningLevel = warningLevel;
            this.__explicitlySet__.add("warningLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warningMessage")
        private String warningMessage;

        public Builder warningMessage(String warningMessage) {
            this.warningMessage = warningMessage;
            this.__explicitlySet__.add("warningMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patternId")
        private String patternId;

        public Builder patternId(String patternId) {
            this.patternId = patternId;
            this.__explicitlySet__.add("patternId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patternText")
        private String patternText;

        public Builder patternText(String patternText) {
            this.patternText = patternText;
            this.__explicitlySet__.add("patternText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleId")
        private String ruleId;

        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            this.__explicitlySet__.add("ruleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("suppressedBy")
        private String suppressedBy;

        public Builder suppressedBy(String suppressedBy) {
            this.suppressedBy = suppressedBy;
            this.__explicitlySet__.add("suppressedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
        private String entityTypeDisplayName;

        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = entityTypeDisplayName;
            this.__explicitlySet__.add("entityTypeDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeDisplayName")
        private String typeDisplayName;

        public Builder typeDisplayName(String typeDisplayName) {
            this.typeDisplayName = typeDisplayName;
            this.__explicitlySet__.add("typeDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Integer severity;

        public Builder severity(Integer severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsWarning build() {
            LogAnalyticsWarning __instance__ =
                    new LogAnalyticsWarning(
                            agentId,
                            hostName,
                            ruleDisplayName,
                            sourceName,
                            compartmentId,
                            sourceDisplayName,
                            entityName,
                            timeCollected,
                            warningId,
                            timeOfInitialWarning,
                            isActive,
                            isSuppressed,
                            timeOfLatestWarning,
                            warningLevel,
                            warningMessage,
                            patternId,
                            patternText,
                            ruleId,
                            sourceId,
                            suppressedBy,
                            entityId,
                            entityType,
                            entityTypeDisplayName,
                            typeDisplayName,
                            typeName,
                            severity);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsWarning o) {
            Builder copiedBuilder =
                    agentId(o.getAgentId())
                            .hostName(o.getHostName())
                            .ruleDisplayName(o.getRuleDisplayName())
                            .sourceName(o.getSourceName())
                            .compartmentId(o.getCompartmentId())
                            .sourceDisplayName(o.getSourceDisplayName())
                            .entityName(o.getEntityName())
                            .timeCollected(o.getTimeCollected())
                            .warningId(o.getWarningId())
                            .timeOfInitialWarning(o.getTimeOfInitialWarning())
                            .isActive(o.getIsActive())
                            .isSuppressed(o.getIsSuppressed())
                            .timeOfLatestWarning(o.getTimeOfLatestWarning())
                            .warningLevel(o.getWarningLevel())
                            .warningMessage(o.getWarningMessage())
                            .patternId(o.getPatternId())
                            .patternText(o.getPatternText())
                            .ruleId(o.getRuleId())
                            .sourceId(o.getSourceId())
                            .suppressedBy(o.getSuppressedBy())
                            .entityId(o.getEntityId())
                            .entityType(o.getEntityType())
                            .entityTypeDisplayName(o.getEntityTypeDisplayName())
                            .typeDisplayName(o.getTypeDisplayName())
                            .typeName(o.getTypeName())
                            .severity(o.getSeverity());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier of the agent associated with the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    String agentId;

    /**
     * The host containing the agent associated with the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    String hostName;

    /**
     * The display name of the rule which triggered the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleDisplayName")
    String ruleDisplayName;

    /**
     * The name of the source associated with the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    String sourceName;

    /**
     * The entity compartment ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The display name of the source associated with the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
    String sourceDisplayName;

    /**
     * The name of the entity associated with the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    String entityName;

    /**
     * The time at which the warning was most recently collected
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    java.util.Date timeCollected;

    /**
     * The unique identifier of the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningId")
    String warningId;

    /**
     * The date at which the warning was initially triggered
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfInitialWarning")
    java.util.Date timeOfInitialWarning;

    /**
     * A flag indicating if the warning is currently active
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActive")
    Boolean isActive;

    /**
     * A flag indicating if the warning is currently suppressed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSuppressed")
    Boolean isSuppressed;

    /**
     * The most recent date on which the warning was triggered
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestWarning")
    java.util.Date timeOfLatestWarning;

    /**
     * The warning level - either pattern, rule, or source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningLevel")
    String warningLevel;

    /**
     * A description of the warning intended for the consumer of the warning.  It will
     * usually detail the cause of the warning, may suggest a remedy, and can contain any
     * other relevant information the consumer might find useful
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningMessage")
    String warningMessage;

    /**
     * The unique identifier of the warning pattern
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternId")
    String patternId;

    /**
     * The text of the pattern used by the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternText")
    String patternText;

    /**
     * The unique identifier of the rule associated with the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleId")
    String ruleId;

    /**
     * The unique identifier of the source associated with the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    String sourceId;

    /**
     * The user who suppressed the warning, or empty if the warning is not suppressed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suppressedBy")
    String suppressedBy;

    /**
     * The unique identifier of the entity associated with the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    String entityId;

    /**
     * The type of the entity associated with the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    String entityType;

    /**
     * The display name of the entity type associated with the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
    String entityTypeDisplayName;

    /**
     * The display name of the warning type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeDisplayName")
    String typeDisplayName;

    /**
     * The internal name of the warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    String typeName;

    /**
     * The warning severity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    Integer severity;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
