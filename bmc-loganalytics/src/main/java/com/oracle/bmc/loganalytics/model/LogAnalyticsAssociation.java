/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsAssociation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsAssociation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "failureMessage",
        "agentId",
        "timeLastAttempted",
        "retryCount",
        "sourceName",
        "sourceDisplayName",
        "sourceTypeName",
        "lifeCycleState",
        "entityId",
        "entityName",
        "entityTypeName",
        "host",
        "agentEntityName",
        "entityTypeDisplayName",
        "logGroupId",
        "logGroupName",
        "logGroupCompartment"
    })
    public LogAnalyticsAssociation(
            String failureMessage,
            String agentId,
            java.util.Date timeLastAttempted,
            Long retryCount,
            String sourceName,
            String sourceDisplayName,
            String sourceTypeName,
            LifeCycleState lifeCycleState,
            String entityId,
            String entityName,
            String entityTypeName,
            String host,
            String agentEntityName,
            String entityTypeDisplayName,
            String logGroupId,
            String logGroupName,
            String logGroupCompartment) {
        super();
        this.failureMessage = failureMessage;
        this.agentId = agentId;
        this.timeLastAttempted = timeLastAttempted;
        this.retryCount = retryCount;
        this.sourceName = sourceName;
        this.sourceDisplayName = sourceDisplayName;
        this.sourceTypeName = sourceTypeName;
        this.lifeCycleState = lifeCycleState;
        this.entityId = entityId;
        this.entityName = entityName;
        this.entityTypeName = entityTypeName;
        this.host = host;
        this.agentEntityName = agentEntityName;
        this.entityTypeDisplayName = entityTypeDisplayName;
        this.logGroupId = logGroupId;
        this.logGroupName = logGroupName;
        this.logGroupCompartment = logGroupCompartment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The failure message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("failureMessage")
        private String failureMessage;

        /**
         * The failure message.
         * @param failureMessage the value to set
         * @return this builder
         **/
        public Builder failureMessage(String failureMessage) {
            this.failureMessage = failureMessage;
            this.__explicitlySet__.add("failureMessage");
            return this;
        }
        /**
         * The agent unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The agent unique identifier.
         * @param agentId the value to set
         * @return this builder
         **/
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /**
         * The last attempt date.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastAttempted")
        private java.util.Date timeLastAttempted;

        /**
         * The last attempt date.
         * @param timeLastAttempted the value to set
         * @return this builder
         **/
        public Builder timeLastAttempted(java.util.Date timeLastAttempted) {
            this.timeLastAttempted = timeLastAttempted;
            this.__explicitlySet__.add("timeLastAttempted");
            return this;
        }
        /**
         * The number of times the association will be attempted
         * before failing.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("retryCount")
        private Long retryCount;

        /**
         * The number of times the association will be attempted
         * before failing.
         *
         * @param retryCount the value to set
         * @return this builder
         **/
        public Builder retryCount(Long retryCount) {
            this.retryCount = retryCount;
            this.__explicitlySet__.add("retryCount");
            return this;
        }
        /**
         * The source name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * The source name.
         * @param sourceName the value to set
         * @return this builder
         **/
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }
        /**
         * The source display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
        private String sourceDisplayName;

        /**
         * The source display name.
         * @param sourceDisplayName the value to set
         * @return this builder
         **/
        public Builder sourceDisplayName(String sourceDisplayName) {
            this.sourceDisplayName = sourceDisplayName;
            this.__explicitlySet__.add("sourceDisplayName");
            return this;
        }
        /**
         * The source type internal name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceTypeName")
        private String sourceTypeName;

        /**
         * The source type internal name.
         * @param sourceTypeName the value to set
         * @return this builder
         **/
        public Builder sourceTypeName(String sourceTypeName) {
            this.sourceTypeName = sourceTypeName;
            this.__explicitlySet__.add("sourceTypeName");
            return this;
        }
        /**
         * The lifecycle status.  Valid values are ACCEPTED, IN_PROGRESS, SUCCEEDED
         * or FAILED.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifeCycleState")
        private LifeCycleState lifeCycleState;

        /**
         * The lifecycle status.  Valid values are ACCEPTED, IN_PROGRESS, SUCCEEDED
         * or FAILED.
         *
         * @param lifeCycleState the value to set
         * @return this builder
         **/
        public Builder lifeCycleState(LifeCycleState lifeCycleState) {
            this.lifeCycleState = lifeCycleState;
            this.__explicitlySet__.add("lifeCycleState");
            return this;
        }
        /**
         * The entity unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The entity unique identifier.
         * @param entityId the value to set
         * @return this builder
         **/
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /**
         * The entity name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * The entity name.
         * @param entityName the value to set
         * @return this builder
         **/
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /**
         * The entity type internal name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
        private String entityTypeName;

        /**
         * The entity type internal name.
         * @param entityTypeName the value to set
         * @return this builder
         **/
        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = entityTypeName;
            this.__explicitlySet__.add("entityTypeName");
            return this;
        }
        /**
         * The host name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The host name.
         * @param host the value to set
         * @return this builder
         **/
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /**
         * The name of the entity which contains the agent.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentEntityName")
        private String agentEntityName;

        /**
         * The name of the entity which contains the agent.
         * @param agentEntityName the value to set
         * @return this builder
         **/
        public Builder agentEntityName(String agentEntityName) {
            this.agentEntityName = agentEntityName;
            this.__explicitlySet__.add("agentEntityName");
            return this;
        }
        /**
         * The entity type display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
        private String entityTypeDisplayName;

        /**
         * The entity type display name.
         * @param entityTypeDisplayName the value to set
         * @return this builder
         **/
        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = entityTypeDisplayName;
            this.__explicitlySet__.add("entityTypeDisplayName");
            return this;
        }
        /**
         * The log group unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        /**
         * The log group unique identifier.
         * @param logGroupId the value to set
         * @return this builder
         **/
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }
        /**
         * The log group name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupName")
        private String logGroupName;

        /**
         * The log group name.
         * @param logGroupName the value to set
         * @return this builder
         **/
        public Builder logGroupName(String logGroupName) {
            this.logGroupName = logGroupName;
            this.__explicitlySet__.add("logGroupName");
            return this;
        }
        /**
         * The log group compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupCompartment")
        private String logGroupCompartment;

        /**
         * The log group compartment.
         * @param logGroupCompartment the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The failure message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureMessage")
    private final String failureMessage;

    /**
     * The failure message.
     * @return the value
     **/
    public String getFailureMessage() {
        return failureMessage;
    }

    /**
     * The agent unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The agent unique identifier.
     * @return the value
     **/
    public String getAgentId() {
        return agentId;
    }

    /**
     * The last attempt date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastAttempted")
    private final java.util.Date timeLastAttempted;

    /**
     * The last attempt date.
     * @return the value
     **/
    public java.util.Date getTimeLastAttempted() {
        return timeLastAttempted;
    }

    /**
     * The number of times the association will be attempted
     * before failing.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryCount")
    private final Long retryCount;

    /**
     * The number of times the association will be attempted
     * before failing.
     *
     * @return the value
     **/
    public Long getRetryCount() {
        return retryCount;
    }

    /**
     * The source name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * The source name.
     * @return the value
     **/
    public String getSourceName() {
        return sourceName;
    }

    /**
     * The source display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
    private final String sourceDisplayName;

    /**
     * The source display name.
     * @return the value
     **/
    public String getSourceDisplayName() {
        return sourceDisplayName;
    }

    /**
     * The source type internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTypeName")
    private final String sourceTypeName;

    /**
     * The source type internal name.
     * @return the value
     **/
    public String getSourceTypeName() {
        return sourceTypeName;
    }

    /**
     * The lifecycle status.  Valid values are ACCEPTED, IN_PROGRESS, SUCCEEDED
     * or FAILED.
     *
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifeCycleState.class);

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
    private final LifeCycleState lifeCycleState;

    /**
     * The lifecycle status.  Valid values are ACCEPTED, IN_PROGRESS, SUCCEEDED
     * or FAILED.
     *
     * @return the value
     **/
    public LifeCycleState getLifeCycleState() {
        return lifeCycleState;
    }

    /**
     * The entity unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The entity unique identifier.
     * @return the value
     **/
    public String getEntityId() {
        return entityId;
    }

    /**
     * The entity name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * The entity name.
     * @return the value
     **/
    public String getEntityName() {
        return entityName;
    }

    /**
     * The entity type internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
    private final String entityTypeName;

    /**
     * The entity type internal name.
     * @return the value
     **/
    public String getEntityTypeName() {
        return entityTypeName;
    }

    /**
     * The host name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The host name.
     * @return the value
     **/
    public String getHost() {
        return host;
    }

    /**
     * The name of the entity which contains the agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentEntityName")
    private final String agentEntityName;

    /**
     * The name of the entity which contains the agent.
     * @return the value
     **/
    public String getAgentEntityName() {
        return agentEntityName;
    }

    /**
     * The entity type display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
    private final String entityTypeDisplayName;

    /**
     * The entity type display name.
     * @return the value
     **/
    public String getEntityTypeDisplayName() {
        return entityTypeDisplayName;
    }

    /**
     * The log group unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

    /**
     * The log group unique identifier.
     * @return the value
     **/
    public String getLogGroupId() {
        return logGroupId;
    }

    /**
     * The log group name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupName")
    private final String logGroupName;

    /**
     * The log group name.
     * @return the value
     **/
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * The log group compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupCompartment")
    private final String logGroupCompartment;

    /**
     * The log group compartment.
     * @return the value
     **/
    public String getLogGroupCompartment() {
        return logGroupCompartment;
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
        sb.append("LogAnalyticsAssociation(");
        sb.append("failureMessage=").append(String.valueOf(this.failureMessage));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", timeLastAttempted=").append(String.valueOf(this.timeLastAttempted));
        sb.append(", retryCount=").append(String.valueOf(this.retryCount));
        sb.append(", sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", sourceDisplayName=").append(String.valueOf(this.sourceDisplayName));
        sb.append(", sourceTypeName=").append(String.valueOf(this.sourceTypeName));
        sb.append(", lifeCycleState=").append(String.valueOf(this.lifeCycleState));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", entityTypeName=").append(String.valueOf(this.entityTypeName));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", agentEntityName=").append(String.valueOf(this.agentEntityName));
        sb.append(", entityTypeDisplayName=").append(String.valueOf(this.entityTypeDisplayName));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(", logGroupName=").append(String.valueOf(this.logGroupName));
        sb.append(", logGroupCompartment=").append(String.valueOf(this.logGroupCompartment));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsAssociation)) {
            return false;
        }

        LogAnalyticsAssociation other = (LogAnalyticsAssociation) o;
        return java.util.Objects.equals(this.failureMessage, other.failureMessage)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.timeLastAttempted, other.timeLastAttempted)
                && java.util.Objects.equals(this.retryCount, other.retryCount)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.sourceDisplayName, other.sourceDisplayName)
                && java.util.Objects.equals(this.sourceTypeName, other.sourceTypeName)
                && java.util.Objects.equals(this.lifeCycleState, other.lifeCycleState)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.entityTypeName, other.entityTypeName)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.agentEntityName, other.agentEntityName)
                && java.util.Objects.equals(this.entityTypeDisplayName, other.entityTypeDisplayName)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.logGroupName, other.logGroupName)
                && java.util.Objects.equals(this.logGroupCompartment, other.logGroupCompartment)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.failureMessage == null ? 43 : this.failureMessage.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastAttempted == null ? 43 : this.timeLastAttempted.hashCode());
        result = (result * PRIME) + (this.retryCount == null ? 43 : this.retryCount.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDisplayName == null ? 43 : this.sourceDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceTypeName == null ? 43 : this.sourceTypeName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifeCycleState == null ? 43 : this.lifeCycleState.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeName == null ? 43 : this.entityTypeName.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result =
                (result * PRIME)
                        + (this.agentEntityName == null ? 43 : this.agentEntityName.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeDisplayName == null
                                ? 43
                                : this.entityTypeDisplayName.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.logGroupName == null ? 43 : this.logGroupName.hashCode());
        result =
                (result * PRIME)
                        + (this.logGroupCompartment == null
                                ? 43
                                : this.logGroupCompartment.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
