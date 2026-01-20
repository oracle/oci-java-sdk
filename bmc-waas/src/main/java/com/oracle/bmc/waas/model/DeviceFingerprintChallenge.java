/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The device fingerprint challenge settings. The device fingerprint challenge generates hashed
 * signatures of both virtual and real browsers to identify and block malicious bots. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeviceFingerprintChallenge.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeviceFingerprintChallenge
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "action",
        "failureThreshold",
        "actionExpirationInSeconds",
        "failureThresholdExpirationInSeconds",
        "maxAddressCount",
        "maxAddressCountExpirationInSeconds",
        "challengeSettings"
    })
    public DeviceFingerprintChallenge(
            Boolean isEnabled,
            Action action,
            Integer failureThreshold,
            Integer actionExpirationInSeconds,
            Integer failureThresholdExpirationInSeconds,
            Integer maxAddressCount,
            Integer maxAddressCountExpirationInSeconds,
            BlockChallengeSettings challengeSettings) {
        super();
        this.isEnabled = isEnabled;
        this.action = action;
        this.failureThreshold = failureThreshold;
        this.actionExpirationInSeconds = actionExpirationInSeconds;
        this.failureThresholdExpirationInSeconds = failureThresholdExpirationInSeconds;
        this.maxAddressCount = maxAddressCount;
        this.maxAddressCountExpirationInSeconds = maxAddressCountExpirationInSeconds;
        this.challengeSettings = challengeSettings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enables or disables the device fingerprint challenge Web Application Firewall feature.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enables or disables the device fingerprint challenge Web Application Firewall feature.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The action to take on requests from detected bots. If unspecified, defaults to {@code
         * DETECT}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to take on requests from detected bots. If unspecified, defaults to {@code
         * DETECT}.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The number of failed requests allowed before taking action. If unspecified, defaults to
         * {@code 10}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
        private Integer failureThreshold;

        /**
         * The number of failed requests allowed before taking action. If unspecified, defaults to
         * {@code 10}.
         *
         * @param failureThreshold the value to set
         * @return this builder
         */
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            this.__explicitlySet__.add("failureThreshold");
            return this;
        }
        /**
         * The number of seconds between challenges for the same IP address. If unspecified,
         * defaults to {@code 60}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("actionExpirationInSeconds")
        private Integer actionExpirationInSeconds;

        /**
         * The number of seconds between challenges for the same IP address. If unspecified,
         * defaults to {@code 60}.
         *
         * @param actionExpirationInSeconds the value to set
         * @return this builder
         */
        public Builder actionExpirationInSeconds(Integer actionExpirationInSeconds) {
            this.actionExpirationInSeconds = actionExpirationInSeconds;
            this.__explicitlySet__.add("actionExpirationInSeconds");
            return this;
        }
        /**
         * The number of seconds before the failure threshold resets. If unspecified, defaults to
         * {@code 60}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("failureThresholdExpirationInSeconds")
        private Integer failureThresholdExpirationInSeconds;

        /**
         * The number of seconds before the failure threshold resets. If unspecified, defaults to
         * {@code 60}.
         *
         * @param failureThresholdExpirationInSeconds the value to set
         * @return this builder
         */
        public Builder failureThresholdExpirationInSeconds(
                Integer failureThresholdExpirationInSeconds) {
            this.failureThresholdExpirationInSeconds = failureThresholdExpirationInSeconds;
            this.__explicitlySet__.add("failureThresholdExpirationInSeconds");
            return this;
        }
        /**
         * The maximum number of IP addresses permitted with the same device fingerprint. If
         * unspecified, defaults to {@code 20}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxAddressCount")
        private Integer maxAddressCount;

        /**
         * The maximum number of IP addresses permitted with the same device fingerprint. If
         * unspecified, defaults to {@code 20}.
         *
         * @param maxAddressCount the value to set
         * @return this builder
         */
        public Builder maxAddressCount(Integer maxAddressCount) {
            this.maxAddressCount = maxAddressCount;
            this.__explicitlySet__.add("maxAddressCount");
            return this;
        }
        /**
         * The number of seconds before the maximum addresses count resets. If unspecified, defaults
         * to {@code 60}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxAddressCountExpirationInSeconds")
        private Integer maxAddressCountExpirationInSeconds;

        /**
         * The number of seconds before the maximum addresses count resets. If unspecified, defaults
         * to {@code 60}.
         *
         * @param maxAddressCountExpirationInSeconds the value to set
         * @return this builder
         */
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
            DeviceFingerprintChallenge model =
                    new DeviceFingerprintChallenge(
                            this.isEnabled,
                            this.action,
                            this.failureThreshold,
                            this.actionExpirationInSeconds,
                            this.failureThresholdExpirationInSeconds,
                            this.maxAddressCount,
                            this.maxAddressCountExpirationInSeconds,
                            this.challengeSettings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeviceFingerprintChallenge model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("failureThreshold")) {
                this.failureThreshold(model.getFailureThreshold());
            }
            if (model.wasPropertyExplicitlySet("actionExpirationInSeconds")) {
                this.actionExpirationInSeconds(model.getActionExpirationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("failureThresholdExpirationInSeconds")) {
                this.failureThresholdExpirationInSeconds(
                        model.getFailureThresholdExpirationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("maxAddressCount")) {
                this.maxAddressCount(model.getMaxAddressCount());
            }
            if (model.wasPropertyExplicitlySet("maxAddressCountExpirationInSeconds")) {
                this.maxAddressCountExpirationInSeconds(
                        model.getMaxAddressCountExpirationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("challengeSettings")) {
                this.challengeSettings(model.getChallengeSettings());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Enables or disables the device fingerprint challenge Web Application Firewall feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enables or disables the device fingerprint challenge Web Application Firewall feature.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The action to take on requests from detected bots. If unspecified, defaults to {@code
     * DETECT}.
     */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Detect("DETECT"),
        Block("BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * The action to take on requests from detected bots. If unspecified, defaults to {@code
     * DETECT}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to take on requests from detected bots. If unspecified, defaults to {@code
     * DETECT}.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * The number of failed requests allowed before taking action. If unspecified, defaults to
     * {@code 10}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    private final Integer failureThreshold;

    /**
     * The number of failed requests allowed before taking action. If unspecified, defaults to
     * {@code 10}.
     *
     * @return the value
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * The number of seconds between challenges for the same IP address. If unspecified, defaults to
     * {@code 60}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actionExpirationInSeconds")
    private final Integer actionExpirationInSeconds;

    /**
     * The number of seconds between challenges for the same IP address. If unspecified, defaults to
     * {@code 60}.
     *
     * @return the value
     */
    public Integer getActionExpirationInSeconds() {
        return actionExpirationInSeconds;
    }

    /**
     * The number of seconds before the failure threshold resets. If unspecified, defaults to {@code
     * 60}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failureThresholdExpirationInSeconds")
    private final Integer failureThresholdExpirationInSeconds;

    /**
     * The number of seconds before the failure threshold resets. If unspecified, defaults to {@code
     * 60}.
     *
     * @return the value
     */
    public Integer getFailureThresholdExpirationInSeconds() {
        return failureThresholdExpirationInSeconds;
    }

    /**
     * The maximum number of IP addresses permitted with the same device fingerprint. If
     * unspecified, defaults to {@code 20}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxAddressCount")
    private final Integer maxAddressCount;

    /**
     * The maximum number of IP addresses permitted with the same device fingerprint. If
     * unspecified, defaults to {@code 20}.
     *
     * @return the value
     */
    public Integer getMaxAddressCount() {
        return maxAddressCount;
    }

    /**
     * The number of seconds before the maximum addresses count resets. If unspecified, defaults to
     * {@code 60}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxAddressCountExpirationInSeconds")
    private final Integer maxAddressCountExpirationInSeconds;

    /**
     * The number of seconds before the maximum addresses count resets. If unspecified, defaults to
     * {@code 60}.
     *
     * @return the value
     */
    public Integer getMaxAddressCountExpirationInSeconds() {
        return maxAddressCountExpirationInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("challengeSettings")
    private final BlockChallengeSettings challengeSettings;

    public BlockChallengeSettings getChallengeSettings() {
        return challengeSettings;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeviceFingerprintChallenge(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", failureThreshold=").append(String.valueOf(this.failureThreshold));
        sb.append(", actionExpirationInSeconds=")
                .append(String.valueOf(this.actionExpirationInSeconds));
        sb.append(", failureThresholdExpirationInSeconds=")
                .append(String.valueOf(this.failureThresholdExpirationInSeconds));
        sb.append(", maxAddressCount=").append(String.valueOf(this.maxAddressCount));
        sb.append(", maxAddressCountExpirationInSeconds=")
                .append(String.valueOf(this.maxAddressCountExpirationInSeconds));
        sb.append(", challengeSettings=").append(String.valueOf(this.challengeSettings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeviceFingerprintChallenge)) {
            return false;
        }

        DeviceFingerprintChallenge other = (DeviceFingerprintChallenge) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.failureThreshold, other.failureThreshold)
                && java.util.Objects.equals(
                        this.actionExpirationInSeconds, other.actionExpirationInSeconds)
                && java.util.Objects.equals(
                        this.failureThresholdExpirationInSeconds,
                        other.failureThresholdExpirationInSeconds)
                && java.util.Objects.equals(this.maxAddressCount, other.maxAddressCount)
                && java.util.Objects.equals(
                        this.maxAddressCountExpirationInSeconds,
                        other.maxAddressCountExpirationInSeconds)
                && java.util.Objects.equals(this.challengeSettings, other.challengeSettings)
                && super.equals(other);
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
                        + (this.maxAddressCount == null ? 43 : this.maxAddressCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maxAddressCountExpirationInSeconds == null
                                ? 43
                                : this.maxAddressCountExpirationInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.challengeSettings == null ? 43 : this.challengeSettings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
