/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration Phase Summary of details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MigrationPhaseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MigrationPhaseSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private OdmsJobPhases name;

        public Builder name(OdmsJobPhases name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
        private OdmsPhaseActions recommendedAction;

        public Builder recommendedAction(OdmsPhaseActions recommendedAction) {
            this.recommendedAction = recommendedAction;
            this.__explicitlySet__.add("recommendedAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedActions")
        private java.util.List<OdmsPhaseActions> supportedActions;

        public Builder supportedActions(java.util.List<OdmsPhaseActions> supportedActions) {
            this.supportedActions = supportedActions;
            this.__explicitlySet__.add("supportedActions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationPhaseSummary build() {
            MigrationPhaseSummary __instance__ =
                    new MigrationPhaseSummary(name, recommendedAction, supportedActions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationPhaseSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .recommendedAction(o.getRecommendedAction())
                            .supportedActions(o.getSupportedActions());

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
     * ODMS Job phase name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    OdmsJobPhases name;

    /**
     * Action recommended for this phase. If not included in the response, there is no recommended action for the phase.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
    OdmsPhaseActions recommendedAction;

    /**
     * Array of actions for the corresponding phase. Empty array would indicate there is no supported action for the phase.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedActions")
    java.util.List<OdmsPhaseActions> supportedActions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
