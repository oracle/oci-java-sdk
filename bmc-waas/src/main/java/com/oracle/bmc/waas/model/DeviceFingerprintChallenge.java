/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The device fingerprint challenge settings. The device fingerprint challenge generates hashed signatures of both virtual and real browsers to identify and block malicious bots.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeviceFingerprintChallenge.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DeviceFingerprintChallenge {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
        private Integer failureThreshold;

        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            this.__explicitlySet__.add("failureThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionExpirationInSeconds")
        private Integer actionExpirationInSeconds;

        public Builder actionExpirationInSeconds(Integer actionExpirationInSeconds) {
            this.actionExpirationInSeconds = actionExpirationInSeconds;
            this.__explicitlySet__.add("actionExpirationInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failureThresholdExpirationInSeconds")
        private Integer failureThresholdExpirationInSeconds;

        public Builder failureThresholdExpirationInSeconds(
                Integer failureThresholdExpirationInSeconds) {
            this.failureThresholdExpirationInSeconds = failureThresholdExpirationInSeconds;
            this.__explicitlySet__.add("failureThresholdExpirationInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxAddressCount")
        private Integer maxAddressCount;

        public Builder maxAddressCount(Integer maxAddressCount) {
            this.maxAddressCount = maxAddressCount;
            this.__explicitlySet__.add("maxAddressCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxAddressCountExpirationInSeconds")
        private Integer maxAddressCountExpirationInSeconds;

        public Builder maxAddressCountExpirationInSeconds(
                Integer maxAddressCountExpirationInSeconds) {
            this.maxAddressCountExpirationInSeconds = maxAddressCountExpirationInSeconds;
            this.__explicitlySet__.add("maxAddressCountExpirationInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("challengeSettings")
        private BlockChallengeSettings challengeSettings;

        public Builder challengeSettings(BlockChallengeSettings challengeSettings) {
            this.challengeSettings = challengeSettings;
            this.__explicitlySet__.add("challengeSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeviceFingerprintChallenge build() {
            DeviceFingerprintChallenge __instance__ =
                    new DeviceFingerprintChallenge(
                            isEnabled,
                            action,
                            failureThreshold,
                            actionExpirationInSeconds,
                            failureThresholdExpirationInSeconds,
                            maxAddressCount,
                            maxAddressCountExpirationInSeconds,
                            challengeSettings);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeviceFingerprintChallenge o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .action(o.getAction())
                            .failureThreshold(o.getFailureThreshold())
                            .actionExpirationInSeconds(o.getActionExpirationInSeconds())
                            .failureThresholdExpirationInSeconds(
                                    o.getFailureThresholdExpirationInSeconds())
                            .maxAddressCount(o.getMaxAddressCount())
                            .maxAddressCountExpirationInSeconds(
                                    o.getMaxAddressCountExpirationInSeconds())
                            .challengeSettings(o.getChallengeSettings());

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
     * Enables or disables the device fingerprint challenge Web Application Firewall feature.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;
    /**
     * The action to take on requests from detected bots. If unspecified, defaults to {@code DETECT}.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Action {
        Detect("DETECT"),
        Block("BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action to take on requests from detected bots. If unspecified, defaults to {@code DETECT}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    Action action;

    /**
     * The number of failed requests allowed before taking action. If unspecified, defaults to {@code 10}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    Integer failureThreshold;

    /**
     * The number of seconds between challenges for the same IP address. If unspecified, defaults to {@code 60}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionExpirationInSeconds")
    Integer actionExpirationInSeconds;

    /**
     * The number of seconds before the failure threshold resets. If unspecified, defaults to {@code 60}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureThresholdExpirationInSeconds")
    Integer failureThresholdExpirationInSeconds;

    /**
     * The maximum number of IP addresses permitted with the same device fingerprint. If unspecified, defaults to {@code 20}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxAddressCount")
    Integer maxAddressCount;

    /**
     * The number of seconds before the maximum addresses count resets. If unspecified, defaults to {@code 60}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxAddressCountExpirationInSeconds")
    Integer maxAddressCountExpirationInSeconds;

    @com.fasterxml.jackson.annotation.JsonProperty("challengeSettings")
    BlockChallengeSettings challengeSettings;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
