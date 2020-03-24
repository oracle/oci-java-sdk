/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * The JavaScript challenge settings. JavaScript Challenge is the function to filter abnormal or malicious bots and allow access to real clients.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JsChallenge.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class JsChallenge {
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

        @com.fasterxml.jackson.annotation.JsonProperty("areRedirectsChallenged")
        private Boolean areRedirectsChallenged;

        public Builder areRedirectsChallenged(Boolean areRedirectsChallenged) {
            this.areRedirectsChallenged = areRedirectsChallenged;
            this.__explicitlySet__.add("areRedirectsChallenged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("criteria")
        private java.util.List<AccessRuleCriteria> criteria;

        public Builder criteria(java.util.List<AccessRuleCriteria> criteria) {
            this.criteria = criteria;
            this.__explicitlySet__.add("criteria");
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

        public JsChallenge build() {
            JsChallenge __instance__ =
                    new JsChallenge(
                            isEnabled,
                            action,
                            failureThreshold,
                            actionExpirationInSeconds,
                            setHttpHeader,
                            challengeSettings,
                            areRedirectsChallenged,
                            criteria,
                            isNatEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JsChallenge o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .action(o.getAction())
                            .failureThreshold(o.getFailureThreshold())
                            .actionExpirationInSeconds(o.getActionExpirationInSeconds())
                            .setHttpHeader(o.getSetHttpHeader())
                            .challengeSettings(o.getChallengeSettings())
                            .areRedirectsChallenged(o.getAreRedirectsChallenged())
                            .criteria(o.getCriteria())
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
     * Enables or disables the JavaScript challenge Web Application Firewall feature.
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
     * The number of seconds between challenges from the same IP address. If unspecified, defaults to `60`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionExpirationInSeconds")
    Integer actionExpirationInSeconds;

    /**
     * Adds an additional HTTP header to requests that fail the challenge before being passed to the origin. Only applicable when the `action` is set to `DETECT`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("setHttpHeader")
    Header setHttpHeader;

    @com.fasterxml.jackson.annotation.JsonProperty("challengeSettings")
    BlockChallengeSettings challengeSettings;

    /**
     * When enabled, redirect responses from the origin will also be challenged. This will change HTTP 301/302 responses from origin to HTTP 200 with an HTML body containing JavaScript page redirection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areRedirectsChallenged")
    Boolean areRedirectsChallenged;

    /**
     * When defined, the JavaScript Challenge would be applied only for the requests that matched all the listed conditions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    java.util.List<AccessRuleCriteria> criteria;

    /**
     * When enabled, the user is identified not only by the IP address but also by an unique additional hash, which prevents blocking visitors with shared IP addresses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNatEnabled")
    Boolean isNatEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
