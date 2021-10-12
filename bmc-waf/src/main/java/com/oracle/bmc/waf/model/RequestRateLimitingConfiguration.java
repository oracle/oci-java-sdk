/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Rate limiting configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestRateLimitingConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RequestRateLimitingConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("periodInSeconds")
        private Integer periodInSeconds;

        public Builder periodInSeconds(Integer periodInSeconds) {
            this.periodInSeconds = periodInSeconds;
            this.__explicitlySet__.add("periodInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestsLimit")
        private Integer requestsLimit;

        public Builder requestsLimit(Integer requestsLimit) {
            this.requestsLimit = requestsLimit;
            this.__explicitlySet__.add("requestsLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionDurationInSeconds")
        private Integer actionDurationInSeconds;

        public Builder actionDurationInSeconds(Integer actionDurationInSeconds) {
            this.actionDurationInSeconds = actionDurationInSeconds;
            this.__explicitlySet__.add("actionDurationInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestRateLimitingConfiguration build() {
            RequestRateLimitingConfiguration __instance__ =
                    new RequestRateLimitingConfiguration(
                            periodInSeconds, requestsLimit, actionDurationInSeconds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestRateLimitingConfiguration o) {
            Builder copiedBuilder =
                    periodInSeconds(o.getPeriodInSeconds())
                            .requestsLimit(o.getRequestsLimit())
                            .actionDurationInSeconds(o.getActionDurationInSeconds());

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
     * Evaluation period in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("periodInSeconds")
    Integer periodInSeconds;

    /**
     * Requests allowed per evaluation period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestsLimit")
    Integer requestsLimit;

    /**
     * Duration of block action application in seconds when {@code requestsLimit} is reached. Optional and can be 0 (no block duration).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionDurationInSeconds")
    Integer actionDurationInSeconds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
