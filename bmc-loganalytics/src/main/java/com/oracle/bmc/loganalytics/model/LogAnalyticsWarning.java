/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsWarning <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsWarning.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsWarning
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "agentId",
        "hostName",
        "ruleDisplayName",
        "sourceName",
        "compartmentId",
        "sourceDisplayName",
        "entityName",
        "timeCollected",
        "warningId",
        "timeOfInitialWarning",
        "isActive",
        "isSuppressed",
        "timeOfLatestWarning",
        "warningLevel",
        "warningMessage",
        "patternId",
        "patternText",
        "ruleId",
        "sourceId",
        "suppressedBy",
        "entityId",
        "entityType",
        "entityTypeDisplayName",
        "typeDisplayName",
        "typeName",
        "severity"
    })
    public LogAnalyticsWarning(
            String agentId,
            String hostName,
            String ruleDisplayName,
            String sourceName,
            String compartmentId,
            String sourceDisplayName,
            String entityName,
            java.util.Date timeCollected,
            String warningId,
            java.util.Date timeOfInitialWarning,
            Boolean isActive,
            Boolean isSuppressed,
            java.util.Date timeOfLatestWarning,
            String warningLevel,
            String warningMessage,
            String patternId,
            String patternText,
            String ruleId,
            String sourceId,
            String suppressedBy,
            String entityId,
            String entityType,
            String entityTypeDisplayName,
            String typeDisplayName,
            String typeName,
            Integer severity) {
        super();
        this.agentId = agentId;
        this.hostName = hostName;
        this.ruleDisplayName = ruleDisplayName;
        this.sourceName = sourceName;
        this.compartmentId = compartmentId;
        this.sourceDisplayName = sourceDisplayName;
        this.entityName = entityName;
        this.timeCollected = timeCollected;
        this.warningId = warningId;
        this.timeOfInitialWarning = timeOfInitialWarning;
        this.isActive = isActive;
        this.isSuppressed = isSuppressed;
        this.timeOfLatestWarning = timeOfLatestWarning;
        this.warningLevel = warningLevel;
        this.warningMessage = warningMessage;
        this.patternId = patternId;
        this.patternText = patternText;
        this.ruleId = ruleId;
        this.sourceId = sourceId;
        this.suppressedBy = suppressedBy;
        this.entityId = entityId;
        this.entityType = entityType;
        this.entityTypeDisplayName = entityTypeDisplayName;
        this.typeDisplayName = typeDisplayName;
        this.typeName = typeName;
        this.severity = severity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique identifier of the agent associated with the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The unique identifier of the agent associated with the warning
         *
         * @param agentId the value to set
         * @return this builder
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /** The host containing the agent associated with the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The host containing the agent associated with the warning
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The display name of the rule which triggered the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleDisplayName")
        private String ruleDisplayName;

        /**
         * The display name of the rule which triggered the warning
         *
         * @param ruleDisplayName the value to set
         * @return this builder
         */
        public Builder ruleDisplayName(String ruleDisplayName) {
            this.ruleDisplayName = ruleDisplayName;
            this.__explicitlySet__.add("ruleDisplayName");
            return this;
        }
        /** The name of the source associated with the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * The name of the source associated with the warning
         *
         * @param sourceName the value to set
         * @return this builder
         */
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }
        /** The entity compartment ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The entity compartment ID.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the source associated with the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
        private String sourceDisplayName;

        /**
         * The display name of the source associated with the warning
         *
         * @param sourceDisplayName the value to set
         * @return this builder
         */
        public Builder sourceDisplayName(String sourceDisplayName) {
            this.sourceDisplayName = sourceDisplayName;
            this.__explicitlySet__.add("sourceDisplayName");
            return this;
        }
        /** The name of the entity associated with the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * The name of the entity associated with the warning
         *
         * @param entityName the value to set
         * @return this builder
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /** The time at which the warning was most recently collected */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        /**
         * The time at which the warning was most recently collected
         *
         * @param timeCollected the value to set
         * @return this builder
         */
        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** The unique identifier of the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("warningId")
        private String warningId;

        /**
         * The unique identifier of the warning
         *
         * @param warningId the value to set
         * @return this builder
         */
        public Builder warningId(String warningId) {
            this.warningId = warningId;
            this.__explicitlySet__.add("warningId");
            return this;
        }
        /** The date at which the warning was initially triggered */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfInitialWarning")
        private java.util.Date timeOfInitialWarning;

        /**
         * The date at which the warning was initially triggered
         *
         * @param timeOfInitialWarning the value to set
         * @return this builder
         */
        public Builder timeOfInitialWarning(java.util.Date timeOfInitialWarning) {
            this.timeOfInitialWarning = timeOfInitialWarning;
            this.__explicitlySet__.add("timeOfInitialWarning");
            return this;
        }
        /** A flag indicating if the warning is currently active */
        @com.fasterxml.jackson.annotation.JsonProperty("isActive")
        private Boolean isActive;

        /**
         * A flag indicating if the warning is currently active
         *
         * @param isActive the value to set
         * @return this builder
         */
        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            this.__explicitlySet__.add("isActive");
            return this;
        }
        /** A flag indicating if the warning is currently suppressed */
        @com.fasterxml.jackson.annotation.JsonProperty("isSuppressed")
        private Boolean isSuppressed;

        /**
         * A flag indicating if the warning is currently suppressed
         *
         * @param isSuppressed the value to set
         * @return this builder
         */
        public Builder isSuppressed(Boolean isSuppressed) {
            this.isSuppressed = isSuppressed;
            this.__explicitlySet__.add("isSuppressed");
            return this;
        }
        /** The most recent date on which the warning was triggered */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestWarning")
        private java.util.Date timeOfLatestWarning;

        /**
         * The most recent date on which the warning was triggered
         *
         * @param timeOfLatestWarning the value to set
         * @return this builder
         */
        public Builder timeOfLatestWarning(java.util.Date timeOfLatestWarning) {
            this.timeOfLatestWarning = timeOfLatestWarning;
            this.__explicitlySet__.add("timeOfLatestWarning");
            return this;
        }
        /** The warning level - either pattern, rule, or source. */
        @com.fasterxml.jackson.annotation.JsonProperty("warningLevel")
        private String warningLevel;

        /**
         * The warning level - either pattern, rule, or source.
         *
         * @param warningLevel the value to set
         * @return this builder
         */
        public Builder warningLevel(String warningLevel) {
            this.warningLevel = warningLevel;
            this.__explicitlySet__.add("warningLevel");
            return this;
        }
        /**
         * A description of the warning intended for the consumer of the warning. It will usually
         * detail the cause of the warning, may suggest a remedy, and can contain any other relevant
         * information the consumer might find useful
         */
        @com.fasterxml.jackson.annotation.JsonProperty("warningMessage")
        private String warningMessage;

        /**
         * A description of the warning intended for the consumer of the warning. It will usually
         * detail the cause of the warning, may suggest a remedy, and can contain any other relevant
         * information the consumer might find useful
         *
         * @param warningMessage the value to set
         * @return this builder
         */
        public Builder warningMessage(String warningMessage) {
            this.warningMessage = warningMessage;
            this.__explicitlySet__.add("warningMessage");
            return this;
        }
        /** The unique identifier of the warning pattern */
        @com.fasterxml.jackson.annotation.JsonProperty("patternId")
        private String patternId;

        /**
         * The unique identifier of the warning pattern
         *
         * @param patternId the value to set
         * @return this builder
         */
        public Builder patternId(String patternId) {
            this.patternId = patternId;
            this.__explicitlySet__.add("patternId");
            return this;
        }
        /** The text of the pattern used by the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("patternText")
        private String patternText;

        /**
         * The text of the pattern used by the warning
         *
         * @param patternText the value to set
         * @return this builder
         */
        public Builder patternText(String patternText) {
            this.patternText = patternText;
            this.__explicitlySet__.add("patternText");
            return this;
        }
        /** The unique identifier of the rule associated with the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleId")
        private String ruleId;

        /**
         * The unique identifier of the rule associated with the warning
         *
         * @param ruleId the value to set
         * @return this builder
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            this.__explicitlySet__.add("ruleId");
            return this;
        }
        /** The unique identifier of the source associated with the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The unique identifier of the source associated with the warning
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /** The user who suppressed the warning, or empty if the warning is not suppressed */
        @com.fasterxml.jackson.annotation.JsonProperty("suppressedBy")
        private String suppressedBy;

        /**
         * The user who suppressed the warning, or empty if the warning is not suppressed
         *
         * @param suppressedBy the value to set
         * @return this builder
         */
        public Builder suppressedBy(String suppressedBy) {
            this.suppressedBy = suppressedBy;
            this.__explicitlySet__.add("suppressedBy");
            return this;
        }
        /** The unique identifier of the entity associated with the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The unique identifier of the entity associated with the warning
         *
         * @param entityId the value to set
         * @return this builder
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /** The type of the entity associated with the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The type of the entity associated with the warning
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /** The display name of the entity type associated with the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
        private String entityTypeDisplayName;

        /**
         * The display name of the entity type associated with the warning
         *
         * @param entityTypeDisplayName the value to set
         * @return this builder
         */
        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = entityTypeDisplayName;
            this.__explicitlySet__.add("entityTypeDisplayName");
            return this;
        }
        /** The display name of the warning type */
        @com.fasterxml.jackson.annotation.JsonProperty("typeDisplayName")
        private String typeDisplayName;

        /**
         * The display name of the warning type
         *
         * @param typeDisplayName the value to set
         * @return this builder
         */
        public Builder typeDisplayName(String typeDisplayName) {
            this.typeDisplayName = typeDisplayName;
            this.__explicitlySet__.add("typeDisplayName");
            return this;
        }
        /** The internal name of the warning */
        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        /**
         * The internal name of the warning
         *
         * @param typeName the value to set
         * @return this builder
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }
        /** The warning severity */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Integer severity;

        /**
         * The warning severity
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Integer severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsWarning build() {
            LogAnalyticsWarning model =
                    new LogAnalyticsWarning(
                            this.agentId,
                            this.hostName,
                            this.ruleDisplayName,
                            this.sourceName,
                            this.compartmentId,
                            this.sourceDisplayName,
                            this.entityName,
                            this.timeCollected,
                            this.warningId,
                            this.timeOfInitialWarning,
                            this.isActive,
                            this.isSuppressed,
                            this.timeOfLatestWarning,
                            this.warningLevel,
                            this.warningMessage,
                            this.patternId,
                            this.patternText,
                            this.ruleId,
                            this.sourceId,
                            this.suppressedBy,
                            this.entityId,
                            this.entityType,
                            this.entityTypeDisplayName,
                            this.typeDisplayName,
                            this.typeName,
                            this.severity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsWarning model) {
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("ruleDisplayName")) {
                this.ruleDisplayName(model.getRuleDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sourceDisplayName")) {
                this.sourceDisplayName(model.getSourceDisplayName());
            }
            if (model.wasPropertyExplicitlySet("entityName")) {
                this.entityName(model.getEntityName());
            }
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("warningId")) {
                this.warningId(model.getWarningId());
            }
            if (model.wasPropertyExplicitlySet("timeOfInitialWarning")) {
                this.timeOfInitialWarning(model.getTimeOfInitialWarning());
            }
            if (model.wasPropertyExplicitlySet("isActive")) {
                this.isActive(model.getIsActive());
            }
            if (model.wasPropertyExplicitlySet("isSuppressed")) {
                this.isSuppressed(model.getIsSuppressed());
            }
            if (model.wasPropertyExplicitlySet("timeOfLatestWarning")) {
                this.timeOfLatestWarning(model.getTimeOfLatestWarning());
            }
            if (model.wasPropertyExplicitlySet("warningLevel")) {
                this.warningLevel(model.getWarningLevel());
            }
            if (model.wasPropertyExplicitlySet("warningMessage")) {
                this.warningMessage(model.getWarningMessage());
            }
            if (model.wasPropertyExplicitlySet("patternId")) {
                this.patternId(model.getPatternId());
            }
            if (model.wasPropertyExplicitlySet("patternText")) {
                this.patternText(model.getPatternText());
            }
            if (model.wasPropertyExplicitlySet("ruleId")) {
                this.ruleId(model.getRuleId());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("suppressedBy")) {
                this.suppressedBy(model.getSuppressedBy());
            }
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("entityTypeDisplayName")) {
                this.entityTypeDisplayName(model.getEntityTypeDisplayName());
            }
            if (model.wasPropertyExplicitlySet("typeDisplayName")) {
                this.typeDisplayName(model.getTypeDisplayName());
            }
            if (model.wasPropertyExplicitlySet("typeName")) {
                this.typeName(model.getTypeName());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
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

    /** The unique identifier of the agent associated with the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The unique identifier of the agent associated with the warning
     *
     * @return the value
     */
    public String getAgentId() {
        return agentId;
    }

    /** The host containing the agent associated with the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The host containing the agent associated with the warning
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The display name of the rule which triggered the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleDisplayName")
    private final String ruleDisplayName;

    /**
     * The display name of the rule which triggered the warning
     *
     * @return the value
     */
    public String getRuleDisplayName() {
        return ruleDisplayName;
    }

    /** The name of the source associated with the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * The name of the source associated with the warning
     *
     * @return the value
     */
    public String getSourceName() {
        return sourceName;
    }

    /** The entity compartment ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The entity compartment ID.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the source associated with the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
    private final String sourceDisplayName;

    /**
     * The display name of the source associated with the warning
     *
     * @return the value
     */
    public String getSourceDisplayName() {
        return sourceDisplayName;
    }

    /** The name of the entity associated with the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * The name of the entity associated with the warning
     *
     * @return the value
     */
    public String getEntityName() {
        return entityName;
    }

    /** The time at which the warning was most recently collected */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * The time at which the warning was most recently collected
     *
     * @return the value
     */
    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /** The unique identifier of the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("warningId")
    private final String warningId;

    /**
     * The unique identifier of the warning
     *
     * @return the value
     */
    public String getWarningId() {
        return warningId;
    }

    /** The date at which the warning was initially triggered */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfInitialWarning")
    private final java.util.Date timeOfInitialWarning;

    /**
     * The date at which the warning was initially triggered
     *
     * @return the value
     */
    public java.util.Date getTimeOfInitialWarning() {
        return timeOfInitialWarning;
    }

    /** A flag indicating if the warning is currently active */
    @com.fasterxml.jackson.annotation.JsonProperty("isActive")
    private final Boolean isActive;

    /**
     * A flag indicating if the warning is currently active
     *
     * @return the value
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /** A flag indicating if the warning is currently suppressed */
    @com.fasterxml.jackson.annotation.JsonProperty("isSuppressed")
    private final Boolean isSuppressed;

    /**
     * A flag indicating if the warning is currently suppressed
     *
     * @return the value
     */
    public Boolean getIsSuppressed() {
        return isSuppressed;
    }

    /** The most recent date on which the warning was triggered */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestWarning")
    private final java.util.Date timeOfLatestWarning;

    /**
     * The most recent date on which the warning was triggered
     *
     * @return the value
     */
    public java.util.Date getTimeOfLatestWarning() {
        return timeOfLatestWarning;
    }

    /** The warning level - either pattern, rule, or source. */
    @com.fasterxml.jackson.annotation.JsonProperty("warningLevel")
    private final String warningLevel;

    /**
     * The warning level - either pattern, rule, or source.
     *
     * @return the value
     */
    public String getWarningLevel() {
        return warningLevel;
    }

    /**
     * A description of the warning intended for the consumer of the warning. It will usually detail
     * the cause of the warning, may suggest a remedy, and can contain any other relevant
     * information the consumer might find useful
     */
    @com.fasterxml.jackson.annotation.JsonProperty("warningMessage")
    private final String warningMessage;

    /**
     * A description of the warning intended for the consumer of the warning. It will usually detail
     * the cause of the warning, may suggest a remedy, and can contain any other relevant
     * information the consumer might find useful
     *
     * @return the value
     */
    public String getWarningMessage() {
        return warningMessage;
    }

    /** The unique identifier of the warning pattern */
    @com.fasterxml.jackson.annotation.JsonProperty("patternId")
    private final String patternId;

    /**
     * The unique identifier of the warning pattern
     *
     * @return the value
     */
    public String getPatternId() {
        return patternId;
    }

    /** The text of the pattern used by the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("patternText")
    private final String patternText;

    /**
     * The text of the pattern used by the warning
     *
     * @return the value
     */
    public String getPatternText() {
        return patternText;
    }

    /** The unique identifier of the rule associated with the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleId")
    private final String ruleId;

    /**
     * The unique identifier of the rule associated with the warning
     *
     * @return the value
     */
    public String getRuleId() {
        return ruleId;
    }

    /** The unique identifier of the source associated with the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The unique identifier of the source associated with the warning
     *
     * @return the value
     */
    public String getSourceId() {
        return sourceId;
    }

    /** The user who suppressed the warning, or empty if the warning is not suppressed */
    @com.fasterxml.jackson.annotation.JsonProperty("suppressedBy")
    private final String suppressedBy;

    /**
     * The user who suppressed the warning, or empty if the warning is not suppressed
     *
     * @return the value
     */
    public String getSuppressedBy() {
        return suppressedBy;
    }

    /** The unique identifier of the entity associated with the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The unique identifier of the entity associated with the warning
     *
     * @return the value
     */
    public String getEntityId() {
        return entityId;
    }

    /** The type of the entity associated with the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The type of the entity associated with the warning
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
    }

    /** The display name of the entity type associated with the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
    private final String entityTypeDisplayName;

    /**
     * The display name of the entity type associated with the warning
     *
     * @return the value
     */
    public String getEntityTypeDisplayName() {
        return entityTypeDisplayName;
    }

    /** The display name of the warning type */
    @com.fasterxml.jackson.annotation.JsonProperty("typeDisplayName")
    private final String typeDisplayName;

    /**
     * The display name of the warning type
     *
     * @return the value
     */
    public String getTypeDisplayName() {
        return typeDisplayName;
    }

    /** The internal name of the warning */
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    /**
     * The internal name of the warning
     *
     * @return the value
     */
    public String getTypeName() {
        return typeName;
    }

    /** The warning severity */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Integer severity;

    /**
     * The warning severity
     *
     * @return the value
     */
    public Integer getSeverity() {
        return severity;
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
        sb.append("LogAnalyticsWarning(");
        sb.append("super=").append(super.toString());
        sb.append("agentId=").append(String.valueOf(this.agentId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", ruleDisplayName=").append(String.valueOf(this.ruleDisplayName));
        sb.append(", sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceDisplayName=").append(String.valueOf(this.sourceDisplayName));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", warningId=").append(String.valueOf(this.warningId));
        sb.append(", timeOfInitialWarning=").append(String.valueOf(this.timeOfInitialWarning));
        sb.append(", isActive=").append(String.valueOf(this.isActive));
        sb.append(", isSuppressed=").append(String.valueOf(this.isSuppressed));
        sb.append(", timeOfLatestWarning=").append(String.valueOf(this.timeOfLatestWarning));
        sb.append(", warningLevel=").append(String.valueOf(this.warningLevel));
        sb.append(", warningMessage=").append(String.valueOf(this.warningMessage));
        sb.append(", patternId=").append(String.valueOf(this.patternId));
        sb.append(", patternText=").append(String.valueOf(this.patternText));
        sb.append(", ruleId=").append(String.valueOf(this.ruleId));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", suppressedBy=").append(String.valueOf(this.suppressedBy));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", entityTypeDisplayName=").append(String.valueOf(this.entityTypeDisplayName));
        sb.append(", typeDisplayName=").append(String.valueOf(this.typeDisplayName));
        sb.append(", typeName=").append(String.valueOf(this.typeName));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsWarning)) {
            return false;
        }

        LogAnalyticsWarning other = (LogAnalyticsWarning) o;
        return java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.ruleDisplayName, other.ruleDisplayName)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sourceDisplayName, other.sourceDisplayName)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.warningId, other.warningId)
                && java.util.Objects.equals(this.timeOfInitialWarning, other.timeOfInitialWarning)
                && java.util.Objects.equals(this.isActive, other.isActive)
                && java.util.Objects.equals(this.isSuppressed, other.isSuppressed)
                && java.util.Objects.equals(this.timeOfLatestWarning, other.timeOfLatestWarning)
                && java.util.Objects.equals(this.warningLevel, other.warningLevel)
                && java.util.Objects.equals(this.warningMessage, other.warningMessage)
                && java.util.Objects.equals(this.patternId, other.patternId)
                && java.util.Objects.equals(this.patternText, other.patternText)
                && java.util.Objects.equals(this.ruleId, other.ruleId)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.suppressedBy, other.suppressedBy)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.entityTypeDisplayName, other.entityTypeDisplayName)
                && java.util.Objects.equals(this.typeDisplayName, other.typeDisplayName)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.severity, other.severity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.ruleDisplayName == null ? 43 : this.ruleDisplayName.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDisplayName == null ? 43 : this.sourceDisplayName.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + (this.warningId == null ? 43 : this.warningId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfInitialWarning == null
                                ? 43
                                : this.timeOfInitialWarning.hashCode());
        result = (result * PRIME) + (this.isActive == null ? 43 : this.isActive.hashCode());
        result = (result * PRIME) + (this.isSuppressed == null ? 43 : this.isSuppressed.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLatestWarning == null
                                ? 43
                                : this.timeOfLatestWarning.hashCode());
        result = (result * PRIME) + (this.warningLevel == null ? 43 : this.warningLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.warningMessage == null ? 43 : this.warningMessage.hashCode());
        result = (result * PRIME) + (this.patternId == null ? 43 : this.patternId.hashCode());
        result = (result * PRIME) + (this.patternText == null ? 43 : this.patternText.hashCode());
        result = (result * PRIME) + (this.ruleId == null ? 43 : this.ruleId.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.suppressedBy == null ? 43 : this.suppressedBy.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeDisplayName == null
                                ? 43
                                : this.entityTypeDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.typeDisplayName == null ? 43 : this.typeDisplayName.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
