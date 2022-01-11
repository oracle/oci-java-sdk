/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies details of build run through DevOps code repository.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DevopsCodeRepositoryBuildRunSource.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DevopsCodeRepositoryBuildRunSource extends BuildRunSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("triggerId")
        private String triggerId;

        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            this.__explicitlySet__.add("triggerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("triggerInfo")
        private TriggerInfo triggerInfo;

        public Builder triggerInfo(TriggerInfo triggerInfo) {
            this.triggerInfo = triggerInfo;
            this.__explicitlySet__.add("triggerInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DevopsCodeRepositoryBuildRunSource build() {
            DevopsCodeRepositoryBuildRunSource __instance__ =
                    new DevopsCodeRepositoryBuildRunSource(triggerId, triggerInfo, repositoryId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DevopsCodeRepositoryBuildRunSource o) {
            Builder copiedBuilder =
                    triggerId(o.getTriggerId())
                            .triggerInfo(o.getTriggerInfo())
                            .repositoryId(o.getRepositoryId());

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

    @Deprecated
    public DevopsCodeRepositoryBuildRunSource(
            String triggerId, TriggerInfo triggerInfo, String repositoryId) {
        super();
        this.triggerId = triggerId;
        this.triggerInfo = triggerInfo;
        this.repositoryId = repositoryId;
    }

    /**
     * The trigger that invoked the build run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggerId")
    String triggerId;

    @com.fasterxml.jackson.annotation.JsonProperty("triggerInfo")
    TriggerInfo triggerInfo;

    /**
     * The DevOps code repository identifier that invoked the build run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    String repositoryId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
