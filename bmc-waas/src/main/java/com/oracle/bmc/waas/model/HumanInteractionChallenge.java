/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The human interaction challenge settings. The human interaction challenge checks various event listeners in the user's browser to determine if there is a human user making a request.
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
    builder = HumanInteractionChallenge.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HumanInteractionChallenge {
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

        @com.fasterxml.jackson.annotation.JsonProperty("interactionThreshold")
        private Integer interactionThreshold;

        public Builder interactionThreshold(Integer interactionThreshold) {
            this.interactionThreshold = interactionThreshold;
            this.__explicitlySet__.add("interactionThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recordingPeriodInSeconds")
        private Integer recordingPeriodInSeconds;

        public Builder recordingPeriodInSeconds(Integer recordingPeriodInSeconds) {
            this.recordingPeriodInSeconds = recordingPeriodInSeconds;
            this.__explicitlySet__.add("recordingPeriodInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("setHttpHeader")
        private Header setHttpHeader;

        public Builder setHttpHeader(Header setHttpHeader) {
            this.setHttpHeader = setHttpHeader;
            this.__explicitlySet__.add("setHttpHeader");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("challengeSettings")
        private BlockChallengeSettings challengeSettings;

        public Builder challengeSettings(BlockChallengeSettings challengeSettings) {
            this.challengeSettings = challengeSettings;
            this.__explicitlySet__.add("challengeSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isNatEnabled")
        private Boolean isNatEnabled;

        public Builder isNatEnabled(Boolean isNatEnabled) {
            this.isNatEnabled = isNatEnabled;
            this.__explicitlySet__.add("isNatEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HumanInteractionChallenge build() {
            HumanInteractionChallenge __instance__ =
                    new HumanInteractionChallenge(
                            isEnabled,
                            action,
                            failureThreshold,
                            actionExpirationInSeconds,
                            failureThresholdExpirationInSeconds,
                            interactionThreshold,
                            recordingPeriodInSeconds,
                            setHttpHeader,
                            challengeSettings,
                            isNatEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HumanInteractionChallenge o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .action(o.getAction())
                            .failureThreshold(o.getFailureThreshold())
                            .actionExpirationInSeconds(o.getActionExpirationInSeconds())
                            .failureThresholdExpirationInSeconds(
                                    o.getFailureThresholdExpirationInSeconds())
                            .interactionThreshold(o.getInteractionThreshold())
                            .recordingPeriodInSeconds(o.getRecordingPeriodInSeconds())
                            .setHttpHeader(o.getSetHttpHeader())
                            .challengeSettings(o.getChallengeSettings())
                            .isNatEnabled(o.getIsNatEnabled());

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
     * Enables or disables the human interaction challenge Web Application Firewall feature.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;
    /**
     * The action to take against requests from detected bots. If unspecified, defaults to `DETECT`.
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
     * The action to take against requests from detected bots. If unspecified, defaults to `DETECT`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    Action action;

    /**
     * The number of failed requests before taking action. If unspecified, defaults to `10`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    Integer failureThreshold;

    /**
     * The number of seconds between challenges for the same IP address. If unspecified, defaults to `60`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionExpirationInSeconds")
    Integer actionExpirationInSeconds;

    /**
     * The number of seconds before the failure threshold resets. If unspecified, defaults to  `60`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureThresholdExpirationInSeconds")
    Integer failureThresholdExpirationInSeconds;

    /**
     * The number of interactions required to pass the challenge. If unspecified, defaults to `3`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("interactionThreshold")
    Integer interactionThreshold;

    /**
     * The number of seconds to record the interactions from the user. If unspecified, defaults to `15`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordingPeriodInSeconds")
    Integer recordingPeriodInSeconds;

    /**
     * Adds an additional HTTP header to requests that fail the challenge before being passed to the origin. Only applicable when the `action` is set to `DETECT`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("setHttpHeader")
    Header setHttpHeader;

    @com.fasterxml.jackson.annotation.JsonProperty("challengeSettings")
    BlockChallengeSettings challengeSettings;

    /**
     * When enabled, the user is identified not only by the IP address but also by an unique additional hash, which prevents blocking visitors with shared IP addresses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNatEnabled")
    Boolean isNatEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
