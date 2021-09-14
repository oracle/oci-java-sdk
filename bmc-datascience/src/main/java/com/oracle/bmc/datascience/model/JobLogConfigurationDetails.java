/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Logging configuration for resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JobLogConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class JobLogConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("enableLogging")
        private Boolean enableLogging;

        public Builder enableLogging(Boolean enableLogging) {
            this.enableLogging = enableLogging;
            this.__explicitlySet__.add("enableLogging");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enableAutoLogCreation")
        private Boolean enableAutoLogCreation;

        public Builder enableAutoLogCreation(Boolean enableAutoLogCreation) {
            this.enableAutoLogCreation = enableAutoLogCreation;
            this.__explicitlySet__.add("enableAutoLogCreation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logId")
        private String logId;

        public Builder logId(String logId) {
            this.logId = logId;
            this.__explicitlySet__.add("logId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobLogConfigurationDetails build() {
            JobLogConfigurationDetails __instance__ =
                    new JobLogConfigurationDetails(
                            enableLogging, enableAutoLogCreation, logGroupId, logId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobLogConfigurationDetails o) {
            Builder copiedBuilder =
                    enableLogging(o.getEnableLogging())
                            .enableAutoLogCreation(o.getEnableAutoLogCreation())
                            .logGroupId(o.getLogGroupId())
                            .logId(o.getLogId());

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
     * If customer logging is enabled for job runs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enableLogging")
    Boolean enableLogging;

    /**
     * If automatic on-behalf-of log object creation is enabled for job runs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enableAutoLogCreation")
    Boolean enableAutoLogCreation;

    /**
     * The log group id for where log objects are for job runs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    String logGroupId;

    /**
     * The log id the job run will push logs too.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logId")
    String logId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
