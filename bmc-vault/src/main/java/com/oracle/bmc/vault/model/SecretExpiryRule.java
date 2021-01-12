/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * A rule that helps enforce the expiration of a secret's contents.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecretExpiryRule.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "ruleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SecretExpiryRule extends SecretRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("secretVersionExpiryInterval")
        private String secretVersionExpiryInterval;

        public Builder secretVersionExpiryInterval(String secretVersionExpiryInterval) {
            this.secretVersionExpiryInterval = secretVersionExpiryInterval;
            this.__explicitlySet__.add("secretVersionExpiryInterval");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAbsoluteExpiry")
        private java.util.Date timeOfAbsoluteExpiry;

        public Builder timeOfAbsoluteExpiry(java.util.Date timeOfAbsoluteExpiry) {
            this.timeOfAbsoluteExpiry = timeOfAbsoluteExpiry;
            this.__explicitlySet__.add("timeOfAbsoluteExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSecretContentRetrievalBlockedOnExpiry")
        private Boolean isSecretContentRetrievalBlockedOnExpiry;

        public Builder isSecretContentRetrievalBlockedOnExpiry(
                Boolean isSecretContentRetrievalBlockedOnExpiry) {
            this.isSecretContentRetrievalBlockedOnExpiry = isSecretContentRetrievalBlockedOnExpiry;
            this.__explicitlySet__.add("isSecretContentRetrievalBlockedOnExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecretExpiryRule build() {
            SecretExpiryRule __instance__ =
                    new SecretExpiryRule(
                            secretVersionExpiryInterval,
                            timeOfAbsoluteExpiry,
                            isSecretContentRetrievalBlockedOnExpiry);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretExpiryRule o) {
            Builder copiedBuilder =
                    secretVersionExpiryInterval(o.getSecretVersionExpiryInterval())
                            .timeOfAbsoluteExpiry(o.getTimeOfAbsoluteExpiry())
                            .isSecretContentRetrievalBlockedOnExpiry(
                                    o.getIsSecretContentRetrievalBlockedOnExpiry());

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
    public SecretExpiryRule(
            String secretVersionExpiryInterval,
            java.util.Date timeOfAbsoluteExpiry,
            Boolean isSecretContentRetrievalBlockedOnExpiry) {
        super();
        this.secretVersionExpiryInterval = secretVersionExpiryInterval;
        this.timeOfAbsoluteExpiry = timeOfAbsoluteExpiry;
        this.isSecretContentRetrievalBlockedOnExpiry = isSecretContentRetrievalBlockedOnExpiry;
    }

    /**
     * A property indicating how long the secret contents will be considered valid, expressed in
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format. The secret needs to be
     * updated when the secret content expires. No enforcement mechanism exists at this time, but audit logs
     * record the expiration on the appropriate date, according to the time interval specified in the rule.
     * The timer resets after you update the secret contents.
     * The minimum value is 1 day and the maximum value is 90 days for this property. Currently, only intervals expressed in days are supported.
     * For example, pass `P3D` to have the secret version expire every 3 days.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretVersionExpiryInterval")
    String secretVersionExpiryInterval;

    /**
     * An optional property indicating the absolute time when this secret will expire, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * The minimum number of days from current time is 1 day and the maximum number of days from current time is 365 days.
     * Example: `2019-04-03T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAbsoluteExpiry")
    java.util.Date timeOfAbsoluteExpiry;

    /**
     * A property indicating whether to block retrieval of the secret content, on expiry. The default is false.
     * If the secret has already expired and you would like to retrieve the secret contents,
     * you need to edit the secret rule to disable this property, to allow reading the secret content.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecretContentRetrievalBlockedOnExpiry")
    Boolean isSecretContentRetrievalBlockedOnExpiry;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
