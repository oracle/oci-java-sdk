/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The JavaScript challenge settings. JavaScript Challenge is the function to filter abnormal or
 * malicious bots and allow access to real clients. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JsChallenge.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JsChallenge extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "action",
        "failureThreshold",
        "actionExpirationInSeconds",
        "setHttpHeader",
        "challengeSettings",
        "areRedirectsChallenged",
        "criteria",
        "isNatEnabled"
    })
    public JsChallenge(
            Boolean isEnabled,
            Action action,
            Integer failureThreshold,
            Integer actionExpirationInSeconds,
            Header setHttpHeader,
            BlockChallengeSettings challengeSettings,
            Boolean areRedirectsChallenged,
            java.util.List<AccessRuleCriteria> criteria,
            Boolean isNatEnabled) {
        super();
        this.isEnabled = isEnabled;
        this.action = action;
        this.failureThreshold = failureThreshold;
        this.actionExpirationInSeconds = actionExpirationInSeconds;
        this.setHttpHeader = setHttpHeader;
        this.challengeSettings = challengeSettings;
        this.areRedirectsChallenged = areRedirectsChallenged;
        this.criteria = criteria;
        this.isNatEnabled = isNatEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Enables or disables the JavaScript challenge Web Application Firewall feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enables or disables the JavaScript challenge Web Application Firewall feature.
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
         * The action to take against requests from detected bots. If unspecified, defaults to
         * {@code DETECT}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to take against requests from detected bots. If unspecified, defaults to
         * {@code DETECT}.
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
         * The number of failed requests before taking action. If unspecified, defaults to {@code
         * 10}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
        private Integer failureThreshold;

        /**
         * The number of failed requests before taking action. If unspecified, defaults to {@code
         * 10}.
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
         * The number of seconds between challenges from the same IP address. If unspecified,
         * defaults to {@code 60}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("actionExpirationInSeconds")
        private Integer actionExpirationInSeconds;

        /**
         * The number of seconds between challenges from the same IP address. If unspecified,
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
         * Adds an additional HTTP header to requests that fail the challenge before being passed to
         * the origin. Only applicable when the {@code action} is set to {@code DETECT}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("setHttpHeader")
        private Header setHttpHeader;

        /**
         * Adds an additional HTTP header to requests that fail the challenge before being passed to
         * the origin. Only applicable when the {@code action} is set to {@code DETECT}.
         *
         * @param setHttpHeader the value to set
         * @return this builder
         */
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
         * When enabled, redirect responses from the origin will also be challenged. This will
         * change HTTP 301/302 responses from origin to HTTP 200 with an HTML body containing
         * JavaScript page redirection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areRedirectsChallenged")
        private Boolean areRedirectsChallenged;

        /**
         * When enabled, redirect responses from the origin will also be challenged. This will
         * change HTTP 301/302 responses from origin to HTTP 200 with an HTML body containing
         * JavaScript page redirection.
         *
         * @param areRedirectsChallenged the value to set
         * @return this builder
         */
        public Builder areRedirectsChallenged(Boolean areRedirectsChallenged) {
            this.areRedirectsChallenged = areRedirectsChallenged;
            this.__explicitlySet__.add("areRedirectsChallenged");
            return this;
        }
        /**
         * When defined, the JavaScript Challenge would be applied only for the requests that
         * matched all the listed conditions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("criteria")
        private java.util.List<AccessRuleCriteria> criteria;

        /**
         * When defined, the JavaScript Challenge would be applied only for the requests that
         * matched all the listed conditions.
         *
         * @param criteria the value to set
         * @return this builder
         */
        public Builder criteria(java.util.List<AccessRuleCriteria> criteria) {
            this.criteria = criteria;
            this.__explicitlySet__.add("criteria");
            return this;
        }
        /**
         * When enabled, the user is identified not only by the IP address but also by an unique
         * additional hash, which prevents blocking visitors with shared IP addresses.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isNatEnabled")
        private Boolean isNatEnabled;

        /**
         * When enabled, the user is identified not only by the IP address but also by an unique
         * additional hash, which prevents blocking visitors with shared IP addresses.
         *
         * @param isNatEnabled the value to set
         * @return this builder
         */
        public Builder isNatEnabled(Boolean isNatEnabled) {
            this.isNatEnabled = isNatEnabled;
            this.__explicitlySet__.add("isNatEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JsChallenge build() {
            JsChallenge model =
                    new JsChallenge(
                            this.isEnabled,
                            this.action,
                            this.failureThreshold,
                            this.actionExpirationInSeconds,
                            this.setHttpHeader,
                            this.challengeSettings,
                            this.areRedirectsChallenged,
                            this.criteria,
                            this.isNatEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JsChallenge model) {
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
            if (model.wasPropertyExplicitlySet("setHttpHeader")) {
                this.setHttpHeader(model.getSetHttpHeader());
            }
            if (model.wasPropertyExplicitlySet("challengeSettings")) {
                this.challengeSettings(model.getChallengeSettings());
            }
            if (model.wasPropertyExplicitlySet("areRedirectsChallenged")) {
                this.areRedirectsChallenged(model.getAreRedirectsChallenged());
            }
            if (model.wasPropertyExplicitlySet("criteria")) {
                this.criteria(model.getCriteria());
            }
            if (model.wasPropertyExplicitlySet("isNatEnabled")) {
                this.isNatEnabled(model.getIsNatEnabled());
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

    /** Enables or disables the JavaScript challenge Web Application Firewall feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enables or disables the JavaScript challenge Web Application Firewall feature.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The action to take against requests from detected bots. If unspecified, defaults to {@code
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
     * The action to take against requests from detected bots. If unspecified, defaults to {@code
     * DETECT}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to take against requests from detected bots. If unspecified, defaults to {@code
     * DETECT}.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * The number of failed requests before taking action. If unspecified, defaults to {@code 10}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    private final Integer failureThreshold;

    /**
     * The number of failed requests before taking action. If unspecified, defaults to {@code 10}.
     *
     * @return the value
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * The number of seconds between challenges from the same IP address. If unspecified, defaults
     * to {@code 60}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actionExpirationInSeconds")
    private final Integer actionExpirationInSeconds;

    /**
     * The number of seconds between challenges from the same IP address. If unspecified, defaults
     * to {@code 60}.
     *
     * @return the value
     */
    public Integer getActionExpirationInSeconds() {
        return actionExpirationInSeconds;
    }

    /**
     * Adds an additional HTTP header to requests that fail the challenge before being passed to the
     * origin. Only applicable when the {@code action} is set to {@code DETECT}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("setHttpHeader")
    private final Header setHttpHeader;

    /**
     * Adds an additional HTTP header to requests that fail the challenge before being passed to the
     * origin. Only applicable when the {@code action} is set to {@code DETECT}.
     *
     * @return the value
     */
    public Header getSetHttpHeader() {
        return setHttpHeader;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("challengeSettings")
    private final BlockChallengeSettings challengeSettings;

    public BlockChallengeSettings getChallengeSettings() {
        return challengeSettings;
    }

    /**
     * When enabled, redirect responses from the origin will also be challenged. This will change
     * HTTP 301/302 responses from origin to HTTP 200 with an HTML body containing JavaScript page
     * redirection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areRedirectsChallenged")
    private final Boolean areRedirectsChallenged;

    /**
     * When enabled, redirect responses from the origin will also be challenged. This will change
     * HTTP 301/302 responses from origin to HTTP 200 with an HTML body containing JavaScript page
     * redirection.
     *
     * @return the value
     */
    public Boolean getAreRedirectsChallenged() {
        return areRedirectsChallenged;
    }

    /**
     * When defined, the JavaScript Challenge would be applied only for the requests that matched
     * all the listed conditions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    private final java.util.List<AccessRuleCriteria> criteria;

    /**
     * When defined, the JavaScript Challenge would be applied only for the requests that matched
     * all the listed conditions.
     *
     * @return the value
     */
    public java.util.List<AccessRuleCriteria> getCriteria() {
        return criteria;
    }

    /**
     * When enabled, the user is identified not only by the IP address but also by an unique
     * additional hash, which prevents blocking visitors with shared IP addresses.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isNatEnabled")
    private final Boolean isNatEnabled;

    /**
     * When enabled, the user is identified not only by the IP address but also by an unique
     * additional hash, which prevents blocking visitors with shared IP addresses.
     *
     * @return the value
     */
    public Boolean getIsNatEnabled() {
        return isNatEnabled;
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
        sb.append("JsChallenge(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", failureThreshold=").append(String.valueOf(this.failureThreshold));
        sb.append(", actionExpirationInSeconds=")
                .append(String.valueOf(this.actionExpirationInSeconds));
        sb.append(", setHttpHeader=").append(String.valueOf(this.setHttpHeader));
        sb.append(", challengeSettings=").append(String.valueOf(this.challengeSettings));
        sb.append(", areRedirectsChallenged=").append(String.valueOf(this.areRedirectsChallenged));
        sb.append(", criteria=").append(String.valueOf(this.criteria));
        sb.append(", isNatEnabled=").append(String.valueOf(this.isNatEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsChallenge)) {
            return false;
        }

        JsChallenge other = (JsChallenge) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.failureThreshold, other.failureThreshold)
                && java.util.Objects.equals(
                        this.actionExpirationInSeconds, other.actionExpirationInSeconds)
                && java.util.Objects.equals(this.setHttpHeader, other.setHttpHeader)
                && java.util.Objects.equals(this.challengeSettings, other.challengeSettings)
                && java.util.Objects.equals(
                        this.areRedirectsChallenged, other.areRedirectsChallenged)
                && java.util.Objects.equals(this.criteria, other.criteria)
                && java.util.Objects.equals(this.isNatEnabled, other.isNatEnabled)
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
                        + (this.setHttpHeader == null ? 43 : this.setHttpHeader.hashCode());
        result =
                (result * PRIME)
                        + (this.challengeSettings == null ? 43 : this.challengeSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.areRedirectsChallenged == null
                                ? 43
                                : this.areRedirectsChallenged.hashCode());
        result = (result * PRIME) + (this.criteria == null ? 43 : this.criteria.hashCode());
        result = (result * PRIME) + (this.isNatEnabled == null ? 43 : this.isNatEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
