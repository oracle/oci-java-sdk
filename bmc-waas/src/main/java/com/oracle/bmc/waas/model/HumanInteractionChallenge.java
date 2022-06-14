/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HumanInteractionChallenge.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HumanInteractionChallenge {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "action",
        "failureThreshold",
        "actionExpirationInSeconds",
        "failureThresholdExpirationInSeconds",
        "interactionThreshold",
        "recordingPeriodInSeconds",
        "setHttpHeader",
        "challengeSettings",
        "isNatEnabled"
    })
    public HumanInteractionChallenge(
            Boolean isEnabled,
            Action action,
            Integer failureThreshold,
            Integer actionExpirationInSeconds,
            Integer failureThresholdExpirationInSeconds,
            Integer interactionThreshold,
            Integer recordingPeriodInSeconds,
            Header setHttpHeader,
            BlockChallengeSettings challengeSettings,
            Boolean isNatEnabled) {
        super();
        this.isEnabled = isEnabled;
        this.action = action;
        this.failureThreshold = failureThreshold;
        this.actionExpirationInSeconds = actionExpirationInSeconds;
        this.failureThresholdExpirationInSeconds = failureThresholdExpirationInSeconds;
        this.interactionThreshold = interactionThreshold;
        this.recordingPeriodInSeconds = recordingPeriodInSeconds;
        this.setHttpHeader = setHttpHeader;
        this.challengeSettings = challengeSettings;
        this.isNatEnabled = isNatEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enables or disables the human interaction challenge Web Application Firewall feature.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enables or disables the human interaction challenge Web Application Firewall feature.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The action to take against requests from detected bots. If unspecified, defaults to {@code DETECT}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to take against requests from detected bots. If unspecified, defaults to {@code DETECT}.
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The number of failed requests before taking action. If unspecified, defaults to {@code 10}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
        private Integer failureThreshold;

        /**
         * The number of failed requests before taking action. If unspecified, defaults to {@code 10}.
         * @param failureThreshold the value to set
         * @return this builder
         **/
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            this.__explicitlySet__.add("failureThreshold");
            return this;
        }
        /**
         * The number of seconds between challenges for the same IP address. If unspecified, defaults to {@code 60}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionExpirationInSeconds")
        private Integer actionExpirationInSeconds;

        /**
         * The number of seconds between challenges for the same IP address. If unspecified, defaults to {@code 60}.
         * @param actionExpirationInSeconds the value to set
         * @return this builder
         **/
        public Builder actionExpirationInSeconds(Integer actionExpirationInSeconds) {
            this.actionExpirationInSeconds = actionExpirationInSeconds;
            this.__explicitlySet__.add("actionExpirationInSeconds");
            return this;
        }
        /**
         * The number of seconds before the failure threshold resets. If unspecified, defaults to  {@code 60}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("failureThresholdExpirationInSeconds")
        private Integer failureThresholdExpirationInSeconds;

        /**
         * The number of seconds before the failure threshold resets. If unspecified, defaults to  {@code 60}.
         * @param failureThresholdExpirationInSeconds the value to set
         * @return this builder
         **/
        public Builder failureThresholdExpirationInSeconds(
                Integer failureThresholdExpirationInSeconds) {
            this.failureThresholdExpirationInSeconds = failureThresholdExpirationInSeconds;
            this.__explicitlySet__.add("failureThresholdExpirationInSeconds");
            return this;
        }
        /**
         * The number of interactions required to pass the challenge. If unspecified, defaults to {@code 3}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("interactionThreshold")
        private Integer interactionThreshold;

        /**
         * The number of interactions required to pass the challenge. If unspecified, defaults to {@code 3}.
         * @param interactionThreshold the value to set
         * @return this builder
         **/
        public Builder interactionThreshold(Integer interactionThreshold) {
            this.interactionThreshold = interactionThreshold;
            this.__explicitlySet__.add("interactionThreshold");
            return this;
        }
        /**
         * The number of seconds to record the interactions from the user. If unspecified, defaults to {@code 15}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recordingPeriodInSeconds")
        private Integer recordingPeriodInSeconds;

        /**
         * The number of seconds to record the interactions from the user. If unspecified, defaults to {@code 15}.
         * @param recordingPeriodInSeconds the value to set
         * @return this builder
         **/
        public Builder recordingPeriodInSeconds(Integer recordingPeriodInSeconds) {
            this.recordingPeriodInSeconds = recordingPeriodInSeconds;
            this.__explicitlySet__.add("recordingPeriodInSeconds");
            return this;
        }
        /**
         * Adds an additional HTTP header to requests that fail the challenge before being passed to the origin. Only applicable when the {@code action} is set to {@code DETECT}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("setHttpHeader")
        private Header setHttpHeader;

        /**
         * Adds an additional HTTP header to requests that fail the challenge before being passed to the origin. Only applicable when the {@code action} is set to {@code DETECT}.
         * @param setHttpHeader the value to set
         * @return this builder
         **/
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
        /**
         * When enabled, the user is identified not only by the IP address but also by an unique additional hash, which prevents blocking visitors with shared IP addresses.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isNatEnabled")
        private Boolean isNatEnabled;

        /**
         * When enabled, the user is identified not only by the IP address but also by an unique additional hash, which prevents blocking visitors with shared IP addresses.
         * @param isNatEnabled the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Enables or disables the human interaction challenge Web Application Firewall feature.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enables or disables the human interaction challenge Web Application Firewall feature.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The action to take against requests from detected bots. If unspecified, defaults to {@code DETECT}.
     **/
    public enum Action {
        Detect("DETECT"),
        Block("BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

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
     * The action to take against requests from detected bots. If unspecified, defaults to {@code DETECT}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to take against requests from detected bots. If unspecified, defaults to {@code DETECT}.
     * @return the value
     **/
    public Action getAction() {
        return action;
    }

    /**
     * The number of failed requests before taking action. If unspecified, defaults to {@code 10}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    private final Integer failureThreshold;

    /**
     * The number of failed requests before taking action. If unspecified, defaults to {@code 10}.
     * @return the value
     **/
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * The number of seconds between challenges for the same IP address. If unspecified, defaults to {@code 60}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionExpirationInSeconds")
    private final Integer actionExpirationInSeconds;

    /**
     * The number of seconds between challenges for the same IP address. If unspecified, defaults to {@code 60}.
     * @return the value
     **/
    public Integer getActionExpirationInSeconds() {
        return actionExpirationInSeconds;
    }

    /**
     * The number of seconds before the failure threshold resets. If unspecified, defaults to  {@code 60}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureThresholdExpirationInSeconds")
    private final Integer failureThresholdExpirationInSeconds;

    /**
     * The number of seconds before the failure threshold resets. If unspecified, defaults to  {@code 60}.
     * @return the value
     **/
    public Integer getFailureThresholdExpirationInSeconds() {
        return failureThresholdExpirationInSeconds;
    }

    /**
     * The number of interactions required to pass the challenge. If unspecified, defaults to {@code 3}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("interactionThreshold")
    private final Integer interactionThreshold;

    /**
     * The number of interactions required to pass the challenge. If unspecified, defaults to {@code 3}.
     * @return the value
     **/
    public Integer getInteractionThreshold() {
        return interactionThreshold;
    }

    /**
     * The number of seconds to record the interactions from the user. If unspecified, defaults to {@code 15}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordingPeriodInSeconds")
    private final Integer recordingPeriodInSeconds;

    /**
     * The number of seconds to record the interactions from the user. If unspecified, defaults to {@code 15}.
     * @return the value
     **/
    public Integer getRecordingPeriodInSeconds() {
        return recordingPeriodInSeconds;
    }

    /**
     * Adds an additional HTTP header to requests that fail the challenge before being passed to the origin. Only applicable when the {@code action} is set to {@code DETECT}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("setHttpHeader")
    private final Header setHttpHeader;

    /**
     * Adds an additional HTTP header to requests that fail the challenge before being passed to the origin. Only applicable when the {@code action} is set to {@code DETECT}.
     * @return the value
     **/
    public Header getSetHttpHeader() {
        return setHttpHeader;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("challengeSettings")
    private final BlockChallengeSettings challengeSettings;

    public BlockChallengeSettings getChallengeSettings() {
        return challengeSettings;
    }

    /**
     * When enabled, the user is identified not only by the IP address but also by an unique additional hash, which prevents blocking visitors with shared IP addresses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNatEnabled")
    private final Boolean isNatEnabled;

    /**
     * When enabled, the user is identified not only by the IP address but also by an unique additional hash, which prevents blocking visitors with shared IP addresses.
     * @return the value
     **/
    public Boolean getIsNatEnabled() {
        return isNatEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HumanInteractionChallenge(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", failureThreshold=").append(String.valueOf(this.failureThreshold));
        sb.append(", actionExpirationInSeconds=")
                .append(String.valueOf(this.actionExpirationInSeconds));
        sb.append(", failureThresholdExpirationInSeconds=")
                .append(String.valueOf(this.failureThresholdExpirationInSeconds));
        sb.append(", interactionThreshold=").append(String.valueOf(this.interactionThreshold));
        sb.append(", recordingPeriodInSeconds=")
                .append(String.valueOf(this.recordingPeriodInSeconds));
        sb.append(", setHttpHeader=").append(String.valueOf(this.setHttpHeader));
        sb.append(", challengeSettings=").append(String.valueOf(this.challengeSettings));
        sb.append(", isNatEnabled=").append(String.valueOf(this.isNatEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HumanInteractionChallenge)) {
            return false;
        }

        HumanInteractionChallenge other = (HumanInteractionChallenge) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.failureThreshold, other.failureThreshold)
                && java.util.Objects.equals(
                        this.actionExpirationInSeconds, other.actionExpirationInSeconds)
                && java.util.Objects.equals(
                        this.failureThresholdExpirationInSeconds,
                        other.failureThresholdExpirationInSeconds)
                && java.util.Objects.equals(this.interactionThreshold, other.interactionThreshold)
                && java.util.Objects.equals(
                        this.recordingPeriodInSeconds, other.recordingPeriodInSeconds)
                && java.util.Objects.equals(this.setHttpHeader, other.setHttpHeader)
                && java.util.Objects.equals(this.challengeSettings, other.challengeSettings)
                && java.util.Objects.equals(this.isNatEnabled, other.isNatEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.failureThreshold == null ? 43 : this.failureThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.actionExpirationInSeconds == null
                                ? 43
                                : this.actionExpirationInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.failureThresholdExpirationInSeconds == null
                                ? 43
                                : this.failureThresholdExpirationInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.interactionThreshold == null
                                ? 43
                                : this.interactionThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.recordingPeriodInSeconds == null
                                ? 43
                                : this.recordingPeriodInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.setHttpHeader == null ? 43 : this.setHttpHeader.hashCode());
        result =
                (result * PRIME)
                        + (this.challengeSettings == null ? 43 : this.challengeSettings.hashCode());
        result = (result * PRIME) + (this.isNatEnabled == null ? 43 : this.isNatEnabled.hashCode());
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
