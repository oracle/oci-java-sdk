/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Progress details of a Migration Job.
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
    builder = MigrationJobProgressResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MigrationJobProgressResource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("currentStatus")
        private JobPhaseStatus currentStatus;

        public Builder currentStatus(JobPhaseStatus currentStatus) {
            this.currentStatus = currentStatus;
            this.__explicitlySet__.add("currentStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentPhase")
        private OdmsJobPhases currentPhase;

        public Builder currentPhase(OdmsJobPhases currentPhase) {
            this.currentPhase = currentPhase;
            this.__explicitlySet__.add("currentPhase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phases")
        private java.util.List<PhaseStatus> phases;

        public Builder phases(java.util.List<PhaseStatus> phases) {
            this.phases = phases;
            this.__explicitlySet__.add("phases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationJobProgressResource build() {
            MigrationJobProgressResource __instance__ =
                    new MigrationJobProgressResource(currentStatus, currentPhase, phases);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationJobProgressResource o) {
            Builder copiedBuilder =
                    currentStatus(o.getCurrentStatus())
                            .currentPhase(o.getCurrentPhase())
                            .phases(o.getPhases());

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
     * Current status of the job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentStatus")
    JobPhaseStatus currentStatus;

    /**
     * Current phase of the job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentPhase")
    OdmsJobPhases currentPhase;

    /**
     * List of phase status for the job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phases")
    java.util.List<PhaseStatus> phases;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
