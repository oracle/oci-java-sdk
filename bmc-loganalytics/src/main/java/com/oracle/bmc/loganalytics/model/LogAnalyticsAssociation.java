/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsAssociation
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
    builder = LogAnalyticsAssociation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsAssociation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("failureMessage")
        private String failureMessage;

        public Builder failureMessage(String failureMessage) {
            this.failureMessage = failureMessage;
            this.__explicitlySet__.add("failureMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastAttempted")
        private java.util.Date timeLastAttempted;

        public Builder timeLastAttempted(java.util.Date timeLastAttempted) {
            this.timeLastAttempted = timeLastAttempted;
            this.__explicitlySet__.add("timeLastAttempted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryCount")
        private Long retryCount;

        public Builder retryCount(Long retryCount) {
            this.retryCount = retryCount;
            this.__explicitlySet__.add("retryCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
        private String sourceDisplayName;

        public Builder sourceDisplayName(String sourceDisplayName) {
            this.sourceDisplayName = sourceDisplayName;
            this.__explicitlySet__.add("sourceDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceTypeName")
        private String sourceTypeName;

        public Builder sourceTypeName(String sourceTypeName) {
            this.sourceTypeName = sourceTypeName;
            this.__explicitlySet__.add("sourceTypeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifeCycleState")
        private LifeCycleState lifeCycleState;

        public Builder lifeCycleState(LifeCycleState lifeCycleState) {
            this.lifeCycleState = lifeCycleState;
            this.__explicitlySet__.add("lifeCycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
        private String entityTypeName;

        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = entityTypeName;
            this.__explicitlySet__.add("entityTypeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentEntityName")
        private String agentEntityName;

        public Builder agentEntityName(String agentEntityName) {
            this.agentEntityName = agentEntityName;
            this.__explicitlySet__.add("agentEntityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
        private String entityTypeDisplayName;

        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = entityTypeDisplayName;
            this.__explicitlySet__.add("entityTypeDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logGroupName")
        private String logGroupName;

        public Builder logGroupName(String logGroupName) {
            this.logGroupName = logGroupName;
            this.__explicitlySet__.add("logGroupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logGroupCompartment")
        private String logGroupCompartment;

        public Builder logGroupCompartment(String logGroupCompartment) {
            this.logGroupCompartment = logGroupCompartment;
            this.__explicitlySet__.add("logGroupCompartment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsAssociation build() {
            LogAnalyticsAssociation __instance__ =
                    new LogAnalyticsAssociation(
                            failureMessage,
                            agentId,
                            timeLastAttempted,
                            retryCount,
                            sourceName,
                            sourceDisplayName,
                            sourceTypeName,
                            lifeCycleState,
                            entityId,
                            entityName,
                            entityTypeName,
                            host,
                            agentEntityName,
                            entityTypeDisplayName,
                            logGroupId,
                            logGroupName,
                            logGroupCompartment);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsAssociation o) {
            Builder copiedBuilder =
                    failureMessage(o.getFailureMessage())
                            .agentId(o.getAgentId())
                            .timeLastAttempted(o.getTimeLastAttempted())
                            .retryCount(o.getRetryCount())
                            .sourceName(o.getSourceName())
                            .sourceDisplayName(o.getSourceDisplayName())
                            .sourceTypeName(o.getSourceTypeName())
                            .lifeCycleState(o.getLifeCycleState())
                            .entityId(o.getEntityId())
                            .entityName(o.getEntityName())
                            .entityTypeName(o.getEntityTypeName())
                            .host(o.getHost())
                            .agentEntityName(o.getAgentEntityName())
                            .entityTypeDisplayName(o.getEntityTypeDisplayName())
                            .logGroupId(o.getLogGroupId())
                            .logGroupName(o.getLogGroupName())
                            .logGroupCompartment(o.getLogGroupCompartment());

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
     * The failure message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureMessage")
    String failureMessage;

    /**
     * The agent unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    String agentId;

    /**
     * The last attempt date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastAttempted")
    java.util.Date timeLastAttempted;

    /**
     * The number of times the association will be attempted
     * before failing.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryCount")
    Long retryCount;

    /**
     * The source name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    String sourceName;

    /**
     * The source display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
    String sourceDisplayName;

    /**
     * The source type internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTypeName")
    String sourceTypeName;
    /**
     * The lifecycle status.  Valid values are ACCEPTED, IN_PROGRESS, SUCCEEDED
     * or FAILED.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifeCycleState {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifeCycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifeCycleState v : LifeCycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifeCycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifeCycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifeCycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The lifecycle status.  Valid values are ACCEPTED, IN_PROGRESS, SUCCEEDED
     * or FAILED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifeCycleState")
    LifeCycleState lifeCycleState;

    /**
     * The entity unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    String entityId;

    /**
     * The entity name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    String entityName;

    /**
     * The entity type internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
    String entityTypeName;

    /**
     * The host name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * The name of the entity which contains the agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentEntityName")
    String agentEntityName;

    /**
     * The entity type display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
    String entityTypeDisplayName;

    /**
     * The log group unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    String logGroupId;

    /**
     * The log group name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupName")
    String logGroupName;

    /**
     * The log group compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupCompartment")
    String logGroupCompartment;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
