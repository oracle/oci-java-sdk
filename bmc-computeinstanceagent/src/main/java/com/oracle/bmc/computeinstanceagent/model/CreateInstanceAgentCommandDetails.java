/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * Creation details for an Oracle Cloud Agent command.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateInstanceAgentCommandDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateInstanceAgentCommandDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "executionTimeOutInSeconds",
        "displayName",
        "target",
        "content"
    })
    public CreateInstanceAgentCommandDetails(
            String compartmentId,
            Integer executionTimeOutInSeconds,
            String displayName,
            InstanceAgentCommandTarget target,
            InstanceAgentCommandContent content) {
        super();
        this.compartmentId = compartmentId;
        this.executionTimeOutInSeconds = executionTimeOutInSeconds;
        this.displayName = displayName;
        this.target = target;
        this.content = content;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionTimeOutInSeconds")
        private Integer executionTimeOutInSeconds;

        public Builder executionTimeOutInSeconds(Integer executionTimeOutInSeconds) {
            this.executionTimeOutInSeconds = executionTimeOutInSeconds;
            this.__explicitlySet__.add("executionTimeOutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private InstanceAgentCommandTarget target;

        public Builder target(InstanceAgentCommandTarget target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private InstanceAgentCommandContent content;

        public Builder content(InstanceAgentCommandContent content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateInstanceAgentCommandDetails build() {
            CreateInstanceAgentCommandDetails __instance__ =
                    new CreateInstanceAgentCommandDetails(
                            compartmentId, executionTimeOutInSeconds, displayName, target, content);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateInstanceAgentCommandDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .executionTimeOutInSeconds(o.getExecutionTimeOutInSeconds())
                            .displayName(o.getDisplayName())
                            .target(o.getTarget())
                            .content(o.getContent());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment to create the command in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The amount of time that Oracle Cloud Agent is given to run the command on the instance before timing
     * out. The timer starts when Oracle Cloud Agent starts the command. Zero means no timeout.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionTimeOutInSeconds")
    private final Integer executionTimeOutInSeconds;

    public Integer getExecutionTimeOutInSeconds() {
        return executionTimeOutInSeconds;
    }

    /**
     * A user-friendly name for the command. It does not have to be unique.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code Database Backup Script}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The target instance to run the command on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final InstanceAgentCommandTarget target;

    public InstanceAgentCommandTarget getTarget() {
        return target;
    }

    /**
     * The contents of the command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final InstanceAgentCommandContent content;

    public InstanceAgentCommandContent getContent() {
        return content;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateInstanceAgentCommandDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", executionTimeOutInSeconds=")
                .append(String.valueOf(this.executionTimeOutInSeconds));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateInstanceAgentCommandDetails)) {
            return false;
        }

        CreateInstanceAgentCommandDetails other = (CreateInstanceAgentCommandDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.executionTimeOutInSeconds, other.executionTimeOutInSeconds)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.executionTimeOutInSeconds == null
                                ? 43
                                : this.executionTimeOutInSeconds.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
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
