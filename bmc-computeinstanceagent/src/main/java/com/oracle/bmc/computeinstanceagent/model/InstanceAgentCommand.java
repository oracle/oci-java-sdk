/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The command payload.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceAgentCommand.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstanceAgentCommand {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCanceled")
        private Boolean isCanceled;

        public Builder isCanceled(Boolean isCanceled) {
            this.isCanceled = isCanceled;
            this.__explicitlySet__.add("isCanceled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionTimeOutInSeconds")
        private Integer executionTimeOutInSeconds;

        public Builder executionTimeOutInSeconds(Integer executionTimeOutInSeconds) {
            this.executionTimeOutInSeconds = executionTimeOutInSeconds;
            this.__explicitlySet__.add("executionTimeOutInSeconds");
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

        public InstanceAgentCommand build() {
            InstanceAgentCommand __instance__ =
                    new InstanceAgentCommand(
                            id,
                            compartmentId,
                            displayName,
                            timeCreated,
                            timeUpdated,
                            isCanceled,
                            executionTimeOutInSeconds,
                            target,
                            content);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommand o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .isCanceled(o.getIsCanceled())
                            .executionTimeOutInSeconds(o.getExecutionTimeOutInSeconds())
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

    /**
     * The command OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment the command is created in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The user friendly display name of the command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * the time command was created at.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * the time command was updated at.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Whether the command has been requested to be canceled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCanceled")
    Boolean isCanceled;

    /**
     * Command execution time limit that the instance agent will honor when executing the command inside the instance. This timer starts when the instance agent starts the commond. Zero means no timeout.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionTimeOutInSeconds")
    Integer executionTimeOutInSeconds;

    @com.fasterxml.jackson.annotation.JsonProperty("target")
    InstanceAgentCommandTarget target;

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    InstanceAgentCommandContent content;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
