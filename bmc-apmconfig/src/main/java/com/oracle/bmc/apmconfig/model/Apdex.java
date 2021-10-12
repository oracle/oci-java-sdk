/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * An Apdex configuration rule.
 * The Apdex Score is computed based on how the response time of a span compares to two predefined threshold values.
 * The first threshold defines the maximum response time that can still be considered satisfactory for the end user.
 * The second one defines the maximum response time that can be considered tolerable. All times larger than that will
 * be considered frustrating for the end user.
 * An Apdex configuration rule works by selecting a subset of spans based on a filter expression and applying the
 * two threshold comparisons to compute a score for each of the selected spans.
 * The rule has a property "isApplyToErrorSpans" that controls whether or not to compute the Apdex for spans that have
 * have been marked as errors. If this property is set to true, then error spans will have their Apdex score computed
 * the same as non-error ones. If set to false, then computation for error spans will be skipped, and the score will
 * be set to "frustrating" regardless of the configured thresholds. The default is "false".
 * The property "isEnabled" controls whether an Apdex score is computed for the spans. Can be used to disable Apdex
 * scores for certain spans. The default is "true".
 * The property "priority" is used to define the importance of the rule when it's part of a rule set.
 * Lower values indicate a higher priority. Rules with higher priorities will be evaluated first in the rule set. The
 * priority of the rules must be unique within a rule set.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Apdex.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Apdex {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("filterText")
        private String filterText;

        public Builder filterText(String filterText) {
            this.filterText = filterText;
            this.__explicitlySet__.add("filterText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("satisfiedResponseTime")
        private Integer satisfiedResponseTime;

        public Builder satisfiedResponseTime(Integer satisfiedResponseTime) {
            this.satisfiedResponseTime = satisfiedResponseTime;
            this.__explicitlySet__.add("satisfiedResponseTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("toleratingResponseTime")
        private Integer toleratingResponseTime;

        public Builder toleratingResponseTime(Integer toleratingResponseTime) {
            this.toleratingResponseTime = toleratingResponseTime;
            this.__explicitlySet__.add("toleratingResponseTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isApplyToErrorSpans")
        private Boolean isApplyToErrorSpans;

        public Builder isApplyToErrorSpans(Boolean isApplyToErrorSpans) {
            this.isApplyToErrorSpans = isApplyToErrorSpans;
            this.__explicitlySet__.add("isApplyToErrorSpans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Apdex build() {
            Apdex __instance__ =
                    new Apdex(
                            filterText,
                            priority,
                            isEnabled,
                            satisfiedResponseTime,
                            toleratingResponseTime,
                            isApplyToErrorSpans,
                            displayName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Apdex o) {
            Builder copiedBuilder =
                    filterText(o.getFilterText())
                            .priority(o.getPriority())
                            .isEnabled(o.getIsEnabled())
                            .satisfiedResponseTime(o.getSatisfiedResponseTime())
                            .toleratingResponseTime(o.getToleratingResponseTime())
                            .isApplyToErrorSpans(o.getIsApplyToErrorSpans())
                            .displayName(o.getDisplayName());

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
     * The string that defines the Span Filter expression.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterText")
    String filterText;

    /**
     * The priority controls the order in which multiple rules in a rule set are applied. Lower values indicate higher
     * priorities. Rules with higher priority are applied first, and once a match is found, the rest of the rules are
     * ignored. Rules within the same rule set cannot have the same priority.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    Integer priority;

    /**
     * Specifies if the Apdex rule will be computed for spans matching the rule. Can be used to make sure certain
     * spans don't get an Apdex score. The default is "true".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * The maximum response time in milliseconds that will be considered satisfactory for the end user.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("satisfiedResponseTime")
    Integer satisfiedResponseTime;

    /**
     * The maximum response time in milliseconds that will be considered tolerable for the end user. Response
     * times beyond this threshold will be considered frustrating.
     * This value cannot be lower than "satisfiedResponseTime".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toleratingResponseTime")
    Integer toleratingResponseTime;

    /**
     * If true, the rule will compute the actual Apdex score for spans that have been marked as errors. If false,
     * the rule will always set the Apdex for error spans to frustrating, regardless of the configured thresholds.
     * Default is false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isApplyToErrorSpans")
    Boolean isApplyToErrorSpans;

    /**
     * A user-friendly name that provides a short description this rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
