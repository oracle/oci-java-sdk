/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Problem History Definition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProblemHistorySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProblemHistorySummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actorType")
        private ActorType actorType;

        public Builder actorType(ActorType actorType) {
            this.actorType = actorType;
            this.__explicitlySet__.add("actorType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actorName")
        private String actorName;

        public Builder actorName(String actorName) {
            this.actorName = actorName;
            this.__explicitlySet__.add("actorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("explanation")
        private String explanation;

        public Builder explanation(String explanation) {
            this.explanation = explanation;
            this.__explicitlySet__.add("explanation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
        private ProblemLifecycleDetail lifecycleDetail;

        public Builder lifecycleDetail(ProblemLifecycleDetail lifecycleDetail) {
            this.lifecycleDetail = lifecycleDetail;
            this.__explicitlySet__.add("lifecycleDetail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventStatus")
        private EventStatus eventStatus;

        public Builder eventStatus(EventStatus eventStatus) {
            this.eventStatus = eventStatus;
            this.__explicitlySet__.add("eventStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("delta")
        private String delta;

        public Builder delta(String delta) {
            this.delta = delta;
            this.__explicitlySet__.add("delta");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProblemHistorySummary build() {
            ProblemHistorySummary __instance__ =
                    new ProblemHistorySummary(
                            id,
                            problemId,
                            actorType,
                            actorName,
                            explanation,
                            lifecycleDetail,
                            eventStatus,
                            timeCreated,
                            delta,
                            comment);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProblemHistorySummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .problemId(o.getProblemId())
                            .actorType(o.getActorType())
                            .actorName(o.getActorName())
                            .explanation(o.getExplanation())
                            .lifecycleDetail(o.getLifecycleDetail())
                            .eventStatus(o.getEventStatus())
                            .timeCreated(o.getTimeCreated())
                            .delta(o.getDelta())
                            .comment(o.getComment());

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
     * Unique identifier for the history record
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * problemId for which history is associated to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    String problemId;

    /**
     * Actor type who performed the operation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actorType")
    ActorType actorType;

    /**
     * Resource Name who performed activity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actorName")
    String actorName;

    /**
     * Activity explanation details
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("explanation")
    String explanation;

    /**
     * Problem Lifecycle Detail Status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
    ProblemLifecycleDetail lifecycleDetail;

    /**
     * Event status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventStatus")
    EventStatus eventStatus;

    /**
     * Type of the Entity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Impacted Resource Names in a comma-separated string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("delta")
    String delta;

    /**
     * User Defined Comments
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    String comment;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
