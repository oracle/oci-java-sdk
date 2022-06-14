/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestRateLimitingConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequestRateLimitingConfiguration {
    @Deprecated
    @java.beans.ConstructorProperties({
        "periodInSeconds",
        "requestsLimit",
        "actionDurationInSeconds"
    })
    public RequestRateLimitingConfiguration(
            Integer periodInSeconds, Integer requestsLimit, Integer actionDurationInSeconds) {
        super();
        this.periodInSeconds = periodInSeconds;
        this.requestsLimit = requestsLimit;
        this.actionDurationInSeconds = actionDurationInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Evaluation period in seconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("periodInSeconds")
        private Integer periodInSeconds;

        /**
         * Evaluation period in seconds.
         * @param periodInSeconds the value to set
         * @return this builder
         **/
        public Builder periodInSeconds(Integer periodInSeconds) {
            this.periodInSeconds = periodInSeconds;
            this.__explicitlySet__.add("periodInSeconds");
            return this;
        }
        /**
         * Requests allowed per evaluation period.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestsLimit")
        private Integer requestsLimit;

        /**
         * Requests allowed per evaluation period.
         * @param requestsLimit the value to set
         * @return this builder
         **/
        public Builder requestsLimit(Integer requestsLimit) {
            this.requestsLimit = requestsLimit;
            this.__explicitlySet__.add("requestsLimit");
            return this;
        }
        /**
         * Duration of block action application in seconds when {@code requestsLimit} is reached. Optional and can be 0 (no block duration).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionDurationInSeconds")
        private Integer actionDurationInSeconds;

        /**
         * Duration of block action application in seconds when {@code requestsLimit} is reached. Optional and can be 0 (no block duration).
         * @param actionDurationInSeconds the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Evaluation period in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("periodInSeconds")
    private final Integer periodInSeconds;

    /**
     * Evaluation period in seconds.
     * @return the value
     **/
    public Integer getPeriodInSeconds() {
        return periodInSeconds;
    }

    /**
     * Requests allowed per evaluation period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestsLimit")
    private final Integer requestsLimit;

    /**
     * Requests allowed per evaluation period.
     * @return the value
     **/
    public Integer getRequestsLimit() {
        return requestsLimit;
    }

    /**
     * Duration of block action application in seconds when {@code requestsLimit} is reached. Optional and can be 0 (no block duration).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionDurationInSeconds")
    private final Integer actionDurationInSeconds;

    /**
     * Duration of block action application in seconds when {@code requestsLimit} is reached. Optional and can be 0 (no block duration).
     * @return the value
     **/
    public Integer getActionDurationInSeconds() {
        return actionDurationInSeconds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RequestRateLimitingConfiguration(");
        sb.append("periodInSeconds=").append(String.valueOf(this.periodInSeconds));
        sb.append(", requestsLimit=").append(String.valueOf(this.requestsLimit));
        sb.append(", actionDurationInSeconds=")
                .append(String.valueOf(this.actionDurationInSeconds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestRateLimitingConfiguration)) {
            return false;
        }

        RequestRateLimitingConfiguration other = (RequestRateLimitingConfiguration) o;
        return java.util.Objects.equals(this.periodInSeconds, other.periodInSeconds)
                && java.util.Objects.equals(this.requestsLimit, other.requestsLimit)
                && java.util.Objects.equals(
                        this.actionDurationInSeconds, other.actionDurationInSeconds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.periodInSeconds == null ? 43 : this.periodInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.requestsLimit == null ? 43 : this.requestsLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.actionDurationInSeconds == null
                                ? 43
                                : this.actionDurationInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
