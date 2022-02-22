/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Resource profile summary.
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
    builder = ResourceProfileSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResourceProfileSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sightingsCount")
        private Integer sightingsCount;

        public Builder sightingsCount(Integer sightingsCount) {
            this.sightingsCount = sightingsCount;
            this.__explicitlySet__.add("sightingsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
        private Double riskScore;

        public Builder riskScore(Double riskScore) {
            this.riskScore = riskScore;
            this.__explicitlySet__.add("riskScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tactics")
        private java.util.List<TacticSummary> tactics;

        public Builder tactics(java.util.List<TacticSummary> tactics) {
            this.tactics = tactics;
            this.__explicitlySet__.add("tactics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
        private java.util.Date timeFirstDetected;

        public Builder timeFirstDetected(java.util.Date timeFirstDetected) {
            this.timeFirstDetected = timeFirstDetected;
            this.__explicitlySet__.add("timeFirstDetected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemsCount")
        private Integer problemsCount;

        public Builder problemsCount(Integer problemsCount) {
            this.problemsCount = problemsCount;
            this.__explicitlySet__.add("problemsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceProfileSummary build() {
            ResourceProfileSummary __instance__ =
                    new ResourceProfileSummary(
                            sightingsCount,
                            id,
                            resourceId,
                            displayName,
                            type,
                            riskScore,
                            tactics,
                            timeFirstDetected,
                            timeLastDetected,
                            problemsCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceProfileSummary o) {
            Builder copiedBuilder =
                    sightingsCount(o.getSightingsCount())
                            .id(o.getId())
                            .resourceId(o.getResourceId())
                            .displayName(o.getDisplayName())
                            .type(o.getType())
                            .riskScore(o.getRiskScore())
                            .tactics(o.getTactics())
                            .timeFirstDetected(o.getTimeFirstDetected())
                            .timeLastDetected(o.getTimeLastDetected())
                            .problemsCount(o.getProblemsCount());

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
     * Number of sightings associated with this resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingsCount")
    Integer sightingsCount;

    /**
     * Unique identifier for resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Unique identifier for resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * Resource name for resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Resource type for resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    String type;

    /**
     * Risk Score for the resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
    Double riskScore;

    /**
     * List of tactic summary associated with the resource profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tactics")
    java.util.List<TacticSummary> tactics;

    /**
     * The date and time the resource profile was first detected. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
    java.util.Date timeFirstDetected;

    /**
     * The date and time the resource profile was last detected. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    java.util.Date timeLastDetected;

    /**
     * Number of problems associated with this resource profile
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemsCount")
    Integer problemsCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
