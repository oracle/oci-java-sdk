/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Parameters for Extract processes.
 * If an empty object is specified, the stored Extract details will be removed.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateExtract.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateExtract {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("performanceProfile")
        private ExtractPerformanceProfile performanceProfile;

        public Builder performanceProfile(ExtractPerformanceProfile performanceProfile) {
            this.performanceProfile = performanceProfile;
            this.__explicitlySet__.add("performanceProfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("longTransDuration")
        private Integer longTransDuration;

        public Builder longTransDuration(Integer longTransDuration) {
            this.longTransDuration = longTransDuration;
            this.__explicitlySet__.add("longTransDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateExtract build() {
            UpdateExtract __instance__ = new UpdateExtract(performanceProfile, longTransDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExtract o) {
            Builder copiedBuilder =
                    performanceProfile(o.getPerformanceProfile())
                            .longTransDuration(o.getLongTransDuration());

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
     * Extract performance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("performanceProfile")
    ExtractPerformanceProfile performanceProfile;

    /**
     * Length of time (in seconds) that a transaction can be open before Extract generates a warning message that the transaction is long-running.
     * If not specified, Extract will not generate a warning on long-running transactions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longTransDuration")
    Integer longTransDuration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
