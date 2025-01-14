/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A content access rule. An access rule specifies an action to take if a set of criteria is matched
 * by a request. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AccessRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AccessRule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "criteria",
        "action",
        "blockAction",
        "blockResponseCode",
        "blockErrorPageMessage",
        "blockErrorPageCode",
        "blockErrorPageDescription",
        "bypassChallenges",
        "redirectUrl",
        "redirectResponseCode",
        "captchaTitle",
        "captchaHeader",
        "captchaFooter",
        "captchaSubmitLabel",
        "responseHeaderManipulation"
    })
    public AccessRule(
            String name,
            java.util.List<AccessRuleCriteria> criteria,
            Action action,
            BlockAction blockAction,
            Integer blockResponseCode,
            String blockErrorPageMessage,
            String blockErrorPageCode,
            String blockErrorPageDescription,
            java.util.List<BypassChallenges> bypassChallenges,
            String redirectUrl,
            RedirectResponseCode redirectResponseCode,
            String captchaTitle,
            String captchaHeader,
            String captchaFooter,
            String captchaSubmitLabel,
            java.util.List<HeaderManipulationAction> responseHeaderManipulation) {
        super();
        this.name = name;
        this.criteria = criteria;
        this.action = action;
        this.blockAction = blockAction;
        this.blockResponseCode = blockResponseCode;
        this.blockErrorPageMessage = blockErrorPageMessage;
        this.blockErrorPageCode = blockErrorPageCode;
        this.blockErrorPageDescription = blockErrorPageDescription;
        this.bypassChallenges = bypassChallenges;
        this.redirectUrl = redirectUrl;
        this.redirectResponseCode = redirectResponseCode;
        this.captchaTitle = captchaTitle;
        this.captchaHeader = captchaHeader;
        this.captchaFooter = captchaFooter;
        this.captchaSubmitLabel = captchaSubmitLabel;
        this.responseHeaderManipulation = responseHeaderManipulation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique name of the access rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The unique name of the access rule.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The list of access rule criteria. The rule would be applied only for the requests that
         * matched all the listed conditions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("criteria")
        private java.util.List<AccessRuleCriteria> criteria;

        /**
         * The list of access rule criteria. The rule would be applied only for the requests that
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
         * The action to take when the access criteria are met for a rule. If unspecified, defaults
         * to {@code ALLOW}.
         *
         * <p>- **ALLOW:** Takes no action, just logs the request.
         *
         * <p>- **DETECT:** Takes no action, but creates an alert for the request.
         *
         * <p>- **BLOCK:** Blocks the request by returning specified response code or showing error
         * page.
         *
         * <p>- **BYPASS:** Bypasses some or all challenges.
         *
         * <p>- **REDIRECT:** Redirects the request to the specified URL. These fields are required
         * when {@code REDIRECT} is selected: {@code redirectUrl}, {@code redirectResponseCode}.
         *
         * <p>- **SHOW_CAPTCHA:** Show a CAPTCHA Challenge page instead of the requested page.
         *
         * <p>Regardless of action, no further rules are processed once a rule is matched.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to take when the access criteria are met for a rule. If unspecified, defaults
         * to {@code ALLOW}.
         *
         * <p>- **ALLOW:** Takes no action, just logs the request.
         *
         * <p>- **DETECT:** Takes no action, but creates an alert for the request.
         *
         * <p>- **BLOCK:** Blocks the request by returning specified response code or showing error
         * page.
         *
         * <p>- **BYPASS:** Bypasses some or all challenges.
         *
         * <p>- **REDIRECT:** Redirects the request to the specified URL. These fields are required
         * when {@code REDIRECT} is selected: {@code redirectUrl}, {@code redirectResponseCode}.
         *
         * <p>- **SHOW_CAPTCHA:** Show a CAPTCHA Challenge page instead of the requested page.
         *
         * <p>Regardless of action, no further rules are processed once a rule is matched.
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
         * The method used to block requests if {@code action} is set to {@code BLOCK} and the
         * access criteria are met. If unspecified, defaults to {@code SET_RESPONSE_CODE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
        private BlockAction blockAction;

        /**
         * The method used to block requests if {@code action} is set to {@code BLOCK} and the
         * access criteria are met. If unspecified, defaults to {@code SET_RESPONSE_CODE}.
         *
         * @param blockAction the value to set
         * @return this builder
         */
        public Builder blockAction(BlockAction blockAction) {
            this.blockAction = blockAction;
            this.__explicitlySet__.add("blockAction");
            return this;
        }
        /**
         * The response status code to return when {@code action} is set to {@code BLOCK}, {@code
         * blockAction} is set to {@code SET_RESPONSE_CODE}, and the access criteria are met. If
         * unspecified, defaults to {@code 403}. The list of available response codes: {@code 200},
         * {@code 201}, {@code 202}, {@code 204}, {@code 206}, {@code 300}, {@code 301}, {@code
         * 302}, {@code 303}, {@code 304}, {@code 307}, {@code 400}, {@code 401}, {@code 403},
         * {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code
         * 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 444}, {@code 494},
         * {@code 495}, {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code
         * 502}, {@code 503}, {@code 504}, {@code 507}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
        private Integer blockResponseCode;

        /**
         * The response status code to return when {@code action} is set to {@code BLOCK}, {@code
         * blockAction} is set to {@code SET_RESPONSE_CODE}, and the access criteria are met. If
         * unspecified, defaults to {@code 403}. The list of available response codes: {@code 200},
         * {@code 201}, {@code 202}, {@code 204}, {@code 206}, {@code 300}, {@code 301}, {@code
         * 302}, {@code 303}, {@code 304}, {@code 307}, {@code 400}, {@code 401}, {@code 403},
         * {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code
         * 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 444}, {@code 494},
         * {@code 495}, {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code
         * 502}, {@code 503}, {@code 504}, {@code 507}.
         *
         * @param blockResponseCode the value to set
         * @return this builder
         */
        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = blockResponseCode;
            this.__explicitlySet__.add("blockResponseCode");
            return this;
        }
        /**
         * The message to show on the error page when {@code action} is set to {@code BLOCK}, {@code
         * blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria are met. If
         * unspecified, defaults to 'Access to the website is blocked.'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
        private String blockErrorPageMessage;

        /**
         * The message to show on the error page when {@code action} is set to {@code BLOCK}, {@code
         * blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria are met. If
         * unspecified, defaults to 'Access to the website is blocked.'
         *
         * @param blockErrorPageMessage the value to set
         * @return this builder
         */
        public Builder blockErrorPageMessage(String blockErrorPageMessage) {
            this.blockErrorPageMessage = blockErrorPageMessage;
            this.__explicitlySet__.add("blockErrorPageMessage");
            return this;
        }
        /**
         * The error code to show on the error page when {@code action} is set to {@code BLOCK},
         * {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria are met.
         * If unspecified, defaults to 'Access rules'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
        private String blockErrorPageCode;

        /**
         * The error code to show on the error page when {@code action} is set to {@code BLOCK},
         * {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria are met.
         * If unspecified, defaults to 'Access rules'.
         *
         * @param blockErrorPageCode the value to set
         * @return this builder
         */
        public Builder blockErrorPageCode(String blockErrorPageCode) {
            this.blockErrorPageCode = blockErrorPageCode;
            this.__explicitlySet__.add("blockErrorPageCode");
            return this;
        }
        /**
         * The description text to show on the error page when {@code action} is set to {@code
         * BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria
         * are met. If unspecified, defaults to 'Access blocked by website owner. Please contact
         * support.'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
        private String blockErrorPageDescription;

        /**
         * The description text to show on the error page when {@code action} is set to {@code
         * BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria
         * are met. If unspecified, defaults to 'Access blocked by website owner. Please contact
         * support.'
         *
         * @param blockErrorPageDescription the value to set
         * @return this builder
         */
        public Builder blockErrorPageDescription(String blockErrorPageDescription) {
            this.blockErrorPageDescription = blockErrorPageDescription;
            this.__explicitlySet__.add("blockErrorPageDescription");
            return this;
        }
        /**
         * The list of challenges to bypass when {@code action} is set to {@code BYPASS}. If
         * unspecified or empty, all challenges are bypassed.
         *
         * <p>- **JS_CHALLENGE:** Bypasses JavaScript Challenge.
         *
         * <p>- **DEVICE_FINGERPRINT_CHALLENGE:** Bypasses Device Fingerprint Challenge.
         *
         * <p>- **HUMAN_INTERACTION_CHALLENGE:** Bypasses Human Interaction Challenge.
         *
         * <p>- **CAPTCHA:** Bypasses CAPTCHA Challenge.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bypassChallenges")
        private java.util.List<BypassChallenges> bypassChallenges;

        /**
         * The list of challenges to bypass when {@code action} is set to {@code BYPASS}. If
         * unspecified or empty, all challenges are bypassed.
         *
         * <p>- **JS_CHALLENGE:** Bypasses JavaScript Challenge.
         *
         * <p>- **DEVICE_FINGERPRINT_CHALLENGE:** Bypasses Device Fingerprint Challenge.
         *
         * <p>- **HUMAN_INTERACTION_CHALLENGE:** Bypasses Human Interaction Challenge.
         *
         * <p>- **CAPTCHA:** Bypasses CAPTCHA Challenge.
         *
         * @param bypassChallenges the value to set
         * @return this builder
         */
        public Builder bypassChallenges(java.util.List<BypassChallenges> bypassChallenges) {
            this.bypassChallenges = bypassChallenges;
            this.__explicitlySet__.add("bypassChallenges");
            return this;
        }
        /**
         * The target to which the request should be redirected, represented as a URI reference.
         * Required when {@code action} is {@code REDIRECT}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
        private String redirectUrl;

        /**
         * The target to which the request should be redirected, represented as a URI reference.
         * Required when {@code action} is {@code REDIRECT}.
         *
         * @param redirectUrl the value to set
         * @return this builder
         */
        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            this.__explicitlySet__.add("redirectUrl");
            return this;
        }
        /**
         * The response status code to return when {@code action} is set to {@code REDIRECT}.
         *
         * <p>- **MOVED_PERMANENTLY:** Used for designating the permanent movement of a page
         * (numerical code - 301).
         *
         * <p>- **FOUND:** Used for designating the temporary movement of a page (numerical code -
         * 302).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("redirectResponseCode")
        private RedirectResponseCode redirectResponseCode;

        /**
         * The response status code to return when {@code action} is set to {@code REDIRECT}.
         *
         * <p>- **MOVED_PERMANENTLY:** Used for designating the permanent movement of a page
         * (numerical code - 301).
         *
         * <p>- **FOUND:** Used for designating the temporary movement of a page (numerical code -
         * 302).
         *
         * @param redirectResponseCode the value to set
         * @return this builder
         */
        public Builder redirectResponseCode(RedirectResponseCode redirectResponseCode) {
            this.redirectResponseCode = redirectResponseCode;
            this.__explicitlySet__.add("redirectResponseCode");
            return this;
        }
        /**
         * The title used when showing a CAPTCHA challenge when {@code action} is set to {@code
         * SHOW_CAPTCHA} and the request is challenged.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("captchaTitle")
        private String captchaTitle;

        /**
         * The title used when showing a CAPTCHA challenge when {@code action} is set to {@code
         * SHOW_CAPTCHA} and the request is challenged.
         *
         * @param captchaTitle the value to set
         * @return this builder
         */
        public Builder captchaTitle(String captchaTitle) {
            this.captchaTitle = captchaTitle;
            this.__explicitlySet__.add("captchaTitle");
            return this;
        }
        /**
         * The text to show in the header when showing a CAPTCHA challenge when {@code action} is
         * set to {@code SHOW_CAPTCHA} and the request is challenged.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("captchaHeader")
        private String captchaHeader;

        /**
         * The text to show in the header when showing a CAPTCHA challenge when {@code action} is
         * set to {@code SHOW_CAPTCHA} and the request is challenged.
         *
         * @param captchaHeader the value to set
         * @return this builder
         */
        public Builder captchaHeader(String captchaHeader) {
            this.captchaHeader = captchaHeader;
            this.__explicitlySet__.add("captchaHeader");
            return this;
        }
        /**
         * The text to show in the footer when showing a CAPTCHA challenge when {@code action} is
         * set to {@code SHOW_CAPTCHA} and the request is challenged.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("captchaFooter")
        private String captchaFooter;

        /**
         * The text to show in the footer when showing a CAPTCHA challenge when {@code action} is
         * set to {@code SHOW_CAPTCHA} and the request is challenged.
         *
         * @param captchaFooter the value to set
         * @return this builder
         */
        public Builder captchaFooter(String captchaFooter) {
            this.captchaFooter = captchaFooter;
            this.__explicitlySet__.add("captchaFooter");
            return this;
        }
        /**
         * The text to show on the label of the CAPTCHA challenge submit button when {@code action}
         * is set to {@code SHOW_CAPTCHA} and the request is challenged.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("captchaSubmitLabel")
        private String captchaSubmitLabel;

        /**
         * The text to show on the label of the CAPTCHA challenge submit button when {@code action}
         * is set to {@code SHOW_CAPTCHA} and the request is challenged.
         *
         * @param captchaSubmitLabel the value to set
         * @return this builder
         */
        public Builder captchaSubmitLabel(String captchaSubmitLabel) {
            this.captchaSubmitLabel = captchaSubmitLabel;
            this.__explicitlySet__.add("captchaSubmitLabel");
            return this;
        }
        /**
         * An object that represents an action to apply to an HTTP response headers if all rule
         * criteria will be matched regardless of {@code action} value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("responseHeaderManipulation")
        private java.util.List<HeaderManipulationAction> responseHeaderManipulation;

        /**
         * An object that represents an action to apply to an HTTP response headers if all rule
         * criteria will be matched regardless of {@code action} value.
         *
         * @param responseHeaderManipulation the value to set
         * @return this builder
         */
        public Builder responseHeaderManipulation(
                java.util.List<HeaderManipulationAction> responseHeaderManipulation) {
            this.responseHeaderManipulation = responseHeaderManipulation;
            this.__explicitlySet__.add("responseHeaderManipulation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessRule build() {
            AccessRule model =
                    new AccessRule(
                            this.name,
                            this.criteria,
                            this.action,
                            this.blockAction,
                            this.blockResponseCode,
                            this.blockErrorPageMessage,
                            this.blockErrorPageCode,
                            this.blockErrorPageDescription,
                            this.bypassChallenges,
                            this.redirectUrl,
                            this.redirectResponseCode,
                            this.captchaTitle,
                            this.captchaHeader,
                            this.captchaFooter,
                            this.captchaSubmitLabel,
                            this.responseHeaderManipulation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRule model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("criteria")) {
                this.criteria(model.getCriteria());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("blockAction")) {
                this.blockAction(model.getBlockAction());
            }
            if (model.wasPropertyExplicitlySet("blockResponseCode")) {
                this.blockResponseCode(model.getBlockResponseCode());
            }
            if (model.wasPropertyExplicitlySet("blockErrorPageMessage")) {
                this.blockErrorPageMessage(model.getBlockErrorPageMessage());
            }
            if (model.wasPropertyExplicitlySet("blockErrorPageCode")) {
                this.blockErrorPageCode(model.getBlockErrorPageCode());
            }
            if (model.wasPropertyExplicitlySet("blockErrorPageDescription")) {
                this.blockErrorPageDescription(model.getBlockErrorPageDescription());
            }
            if (model.wasPropertyExplicitlySet("bypassChallenges")) {
                this.bypassChallenges(model.getBypassChallenges());
            }
            if (model.wasPropertyExplicitlySet("redirectUrl")) {
                this.redirectUrl(model.getRedirectUrl());
            }
            if (model.wasPropertyExplicitlySet("redirectResponseCode")) {
                this.redirectResponseCode(model.getRedirectResponseCode());
            }
            if (model.wasPropertyExplicitlySet("captchaTitle")) {
                this.captchaTitle(model.getCaptchaTitle());
            }
            if (model.wasPropertyExplicitlySet("captchaHeader")) {
                this.captchaHeader(model.getCaptchaHeader());
            }
            if (model.wasPropertyExplicitlySet("captchaFooter")) {
                this.captchaFooter(model.getCaptchaFooter());
            }
            if (model.wasPropertyExplicitlySet("captchaSubmitLabel")) {
                this.captchaSubmitLabel(model.getCaptchaSubmitLabel());
            }
            if (model.wasPropertyExplicitlySet("responseHeaderManipulation")) {
                this.responseHeaderManipulation(model.getResponseHeaderManipulation());
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

    /** The unique name of the access rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The unique name of the access rule.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The list of access rule criteria. The rule would be applied only for the requests that
     * matched all the listed conditions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    private final java.util.List<AccessRuleCriteria> criteria;

    /**
     * The list of access rule criteria. The rule would be applied only for the requests that
     * matched all the listed conditions.
     *
     * @return the value
     */
    public java.util.List<AccessRuleCriteria> getCriteria() {
        return criteria;
    }

    /**
     * The action to take when the access criteria are met for a rule. If unspecified, defaults to
     * {@code ALLOW}.
     *
     * <p>- **ALLOW:** Takes no action, just logs the request.
     *
     * <p>- **DETECT:** Takes no action, but creates an alert for the request.
     *
     * <p>- **BLOCK:** Blocks the request by returning specified response code or showing error
     * page.
     *
     * <p>- **BYPASS:** Bypasses some or all challenges.
     *
     * <p>- **REDIRECT:** Redirects the request to the specified URL. These fields are required when
     * {@code REDIRECT} is selected: {@code redirectUrl}, {@code redirectResponseCode}.
     *
     * <p>- **SHOW_CAPTCHA:** Show a CAPTCHA Challenge page instead of the requested page.
     *
     * <p>Regardless of action, no further rules are processed once a rule is matched.
     */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Allow("ALLOW"),
        Detect("DETECT"),
        Block("BLOCK"),
        Bypass("BYPASS"),
        Redirect("REDIRECT"),
        ShowCaptcha("SHOW_CAPTCHA"),

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
     * The action to take when the access criteria are met for a rule. If unspecified, defaults to
     * {@code ALLOW}.
     *
     * <p>- **ALLOW:** Takes no action, just logs the request.
     *
     * <p>- **DETECT:** Takes no action, but creates an alert for the request.
     *
     * <p>- **BLOCK:** Blocks the request by returning specified response code or showing error
     * page.
     *
     * <p>- **BYPASS:** Bypasses some or all challenges.
     *
     * <p>- **REDIRECT:** Redirects the request to the specified URL. These fields are required when
     * {@code REDIRECT} is selected: {@code redirectUrl}, {@code redirectResponseCode}.
     *
     * <p>- **SHOW_CAPTCHA:** Show a CAPTCHA Challenge page instead of the requested page.
     *
     * <p>Regardless of action, no further rules are processed once a rule is matched.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to take when the access criteria are met for a rule. If unspecified, defaults to
     * {@code ALLOW}.
     *
     * <p>- **ALLOW:** Takes no action, just logs the request.
     *
     * <p>- **DETECT:** Takes no action, but creates an alert for the request.
     *
     * <p>- **BLOCK:** Blocks the request by returning specified response code or showing error
     * page.
     *
     * <p>- **BYPASS:** Bypasses some or all challenges.
     *
     * <p>- **REDIRECT:** Redirects the request to the specified URL. These fields are required when
     * {@code REDIRECT} is selected: {@code redirectUrl}, {@code redirectResponseCode}.
     *
     * <p>- **SHOW_CAPTCHA:** Show a CAPTCHA Challenge page instead of the requested page.
     *
     * <p>Regardless of action, no further rules are processed once a rule is matched.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * The method used to block requests if {@code action} is set to {@code BLOCK} and the access
     * criteria are met. If unspecified, defaults to {@code SET_RESPONSE_CODE}.
     */
    public enum BlockAction implements com.oracle.bmc.http.internal.BmcEnum {
        SetResponseCode("SET_RESPONSE_CODE"),
        ShowErrorPage("SHOW_ERROR_PAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BlockAction.class);

        private final String value;
        private static java.util.Map<String, BlockAction> map;

        static {
            map = new java.util.HashMap<>();
            for (BlockAction v : BlockAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BlockAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BlockAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BlockAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The method used to block requests if {@code action} is set to {@code BLOCK} and the access
     * criteria are met. If unspecified, defaults to {@code SET_RESPONSE_CODE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
    private final BlockAction blockAction;

    /**
     * The method used to block requests if {@code action} is set to {@code BLOCK} and the access
     * criteria are met. If unspecified, defaults to {@code SET_RESPONSE_CODE}.
     *
     * @return the value
     */
    public BlockAction getBlockAction() {
        return blockAction;
    }

    /**
     * The response status code to return when {@code action} is set to {@code BLOCK}, {@code
     * blockAction} is set to {@code SET_RESPONSE_CODE}, and the access criteria are met. If
     * unspecified, defaults to {@code 403}. The list of available response codes: {@code 200},
     * {@code 201}, {@code 202}, {@code 204}, {@code 206}, {@code 300}, {@code 301}, {@code 302},
     * {@code 303}, {@code 304}, {@code 307}, {@code 400}, {@code 401}, {@code 403}, {@code 404},
     * {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413}, {@code 414},
     * {@code 415}, {@code 416}, {@code 422}, {@code 444}, {@code 494}, {@code 495}, {@code 496},
     * {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504},
     * {@code 507}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
    private final Integer blockResponseCode;

    /**
     * The response status code to return when {@code action} is set to {@code BLOCK}, {@code
     * blockAction} is set to {@code SET_RESPONSE_CODE}, and the access criteria are met. If
     * unspecified, defaults to {@code 403}. The list of available response codes: {@code 200},
     * {@code 201}, {@code 202}, {@code 204}, {@code 206}, {@code 300}, {@code 301}, {@code 302},
     * {@code 303}, {@code 304}, {@code 307}, {@code 400}, {@code 401}, {@code 403}, {@code 404},
     * {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413}, {@code 414},
     * {@code 415}, {@code 416}, {@code 422}, {@code 444}, {@code 494}, {@code 495}, {@code 496},
     * {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504},
     * {@code 507}.
     *
     * @return the value
     */
    public Integer getBlockResponseCode() {
        return blockResponseCode;
    }

    /**
     * The message to show on the error page when {@code action} is set to {@code BLOCK}, {@code
     * blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria are met. If
     * unspecified, defaults to 'Access to the website is blocked.'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
    private final String blockErrorPageMessage;

    /**
     * The message to show on the error page when {@code action} is set to {@code BLOCK}, {@code
     * blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria are met. If
     * unspecified, defaults to 'Access to the website is blocked.'
     *
     * @return the value
     */
    public String getBlockErrorPageMessage() {
        return blockErrorPageMessage;
    }

    /**
     * The error code to show on the error page when {@code action} is set to {@code BLOCK}, {@code
     * blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria are met. If
     * unspecified, defaults to 'Access rules'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
    private final String blockErrorPageCode;

    /**
     * The error code to show on the error page when {@code action} is set to {@code BLOCK}, {@code
     * blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria are met. If
     * unspecified, defaults to 'Access rules'.
     *
     * @return the value
     */
    public String getBlockErrorPageCode() {
        return blockErrorPageCode;
    }

    /**
     * The description text to show on the error page when {@code action} is set to {@code BLOCK},
     * {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria are met. If
     * unspecified, defaults to 'Access blocked by website owner. Please contact support.'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
    private final String blockErrorPageDescription;

    /**
     * The description text to show on the error page when {@code action} is set to {@code BLOCK},
     * {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the access criteria are met. If
     * unspecified, defaults to 'Access blocked by website owner. Please contact support.'
     *
     * @return the value
     */
    public String getBlockErrorPageDescription() {
        return blockErrorPageDescription;
    }

    /** */
    public enum BypassChallenges implements com.oracle.bmc.http.internal.BmcEnum {
        JsChallenge("JS_CHALLENGE"),
        DeviceFingerprintChallenge("DEVICE_FINGERPRINT_CHALLENGE"),
        HumanInteractionChallenge("HUMAN_INTERACTION_CHALLENGE"),
        Captcha("CAPTCHA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BypassChallenges.class);

        private final String value;
        private static java.util.Map<String, BypassChallenges> map;

        static {
            map = new java.util.HashMap<>();
            for (BypassChallenges v : BypassChallenges.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BypassChallenges(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BypassChallenges create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BypassChallenges', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The list of challenges to bypass when {@code action} is set to {@code BYPASS}. If unspecified
     * or empty, all challenges are bypassed.
     *
     * <p>- **JS_CHALLENGE:** Bypasses JavaScript Challenge.
     *
     * <p>- **DEVICE_FINGERPRINT_CHALLENGE:** Bypasses Device Fingerprint Challenge.
     *
     * <p>- **HUMAN_INTERACTION_CHALLENGE:** Bypasses Human Interaction Challenge.
     *
     * <p>- **CAPTCHA:** Bypasses CAPTCHA Challenge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bypassChallenges")
    private final java.util.List<BypassChallenges> bypassChallenges;

    /**
     * The list of challenges to bypass when {@code action} is set to {@code BYPASS}. If unspecified
     * or empty, all challenges are bypassed.
     *
     * <p>- **JS_CHALLENGE:** Bypasses JavaScript Challenge.
     *
     * <p>- **DEVICE_FINGERPRINT_CHALLENGE:** Bypasses Device Fingerprint Challenge.
     *
     * <p>- **HUMAN_INTERACTION_CHALLENGE:** Bypasses Human Interaction Challenge.
     *
     * <p>- **CAPTCHA:** Bypasses CAPTCHA Challenge.
     *
     * @return the value
     */
    public java.util.List<BypassChallenges> getBypassChallenges() {
        return bypassChallenges;
    }

    /**
     * The target to which the request should be redirected, represented as a URI reference.
     * Required when {@code action} is {@code REDIRECT}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
    private final String redirectUrl;

    /**
     * The target to which the request should be redirected, represented as a URI reference.
     * Required when {@code action} is {@code REDIRECT}.
     *
     * @return the value
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * The response status code to return when {@code action} is set to {@code REDIRECT}.
     *
     * <p>- **MOVED_PERMANENTLY:** Used for designating the permanent movement of a page (numerical
     * code - 301).
     *
     * <p>- **FOUND:** Used for designating the temporary movement of a page (numerical code - 302).
     */
    public enum RedirectResponseCode implements com.oracle.bmc.http.internal.BmcEnum {
        MovedPermanently("MOVED_PERMANENTLY"),
        Found("FOUND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RedirectResponseCode.class);

        private final String value;
        private static java.util.Map<String, RedirectResponseCode> map;

        static {
            map = new java.util.HashMap<>();
            for (RedirectResponseCode v : RedirectResponseCode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RedirectResponseCode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RedirectResponseCode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RedirectResponseCode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The response status code to return when {@code action} is set to {@code REDIRECT}.
     *
     * <p>- **MOVED_PERMANENTLY:** Used for designating the permanent movement of a page (numerical
     * code - 301).
     *
     * <p>- **FOUND:** Used for designating the temporary movement of a page (numerical code - 302).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redirectResponseCode")
    private final RedirectResponseCode redirectResponseCode;

    /**
     * The response status code to return when {@code action} is set to {@code REDIRECT}.
     *
     * <p>- **MOVED_PERMANENTLY:** Used for designating the permanent movement of a page (numerical
     * code - 301).
     *
     * <p>- **FOUND:** Used for designating the temporary movement of a page (numerical code - 302).
     *
     * @return the value
     */
    public RedirectResponseCode getRedirectResponseCode() {
        return redirectResponseCode;
    }

    /**
     * The title used when showing a CAPTCHA challenge when {@code action} is set to {@code
     * SHOW_CAPTCHA} and the request is challenged.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("captchaTitle")
    private final String captchaTitle;

    /**
     * The title used when showing a CAPTCHA challenge when {@code action} is set to {@code
     * SHOW_CAPTCHA} and the request is challenged.
     *
     * @return the value
     */
    public String getCaptchaTitle() {
        return captchaTitle;
    }

    /**
     * The text to show in the header when showing a CAPTCHA challenge when {@code action} is set to
     * {@code SHOW_CAPTCHA} and the request is challenged.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("captchaHeader")
    private final String captchaHeader;

    /**
     * The text to show in the header when showing a CAPTCHA challenge when {@code action} is set to
     * {@code SHOW_CAPTCHA} and the request is challenged.
     *
     * @return the value
     */
    public String getCaptchaHeader() {
        return captchaHeader;
    }

    /**
     * The text to show in the footer when showing a CAPTCHA challenge when {@code action} is set to
     * {@code SHOW_CAPTCHA} and the request is challenged.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("captchaFooter")
    private final String captchaFooter;

    /**
     * The text to show in the footer when showing a CAPTCHA challenge when {@code action} is set to
     * {@code SHOW_CAPTCHA} and the request is challenged.
     *
     * @return the value
     */
    public String getCaptchaFooter() {
        return captchaFooter;
    }

    /**
     * The text to show on the label of the CAPTCHA challenge submit button when {@code action} is
     * set to {@code SHOW_CAPTCHA} and the request is challenged.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("captchaSubmitLabel")
    private final String captchaSubmitLabel;

    /**
     * The text to show on the label of the CAPTCHA challenge submit button when {@code action} is
     * set to {@code SHOW_CAPTCHA} and the request is challenged.
     *
     * @return the value
     */
    public String getCaptchaSubmitLabel() {
        return captchaSubmitLabel;
    }

    /**
     * An object that represents an action to apply to an HTTP response headers if all rule criteria
     * will be matched regardless of {@code action} value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responseHeaderManipulation")
    private final java.util.List<HeaderManipulationAction> responseHeaderManipulation;

    /**
     * An object that represents an action to apply to an HTTP response headers if all rule criteria
     * will be matched regardless of {@code action} value.
     *
     * @return the value
     */
    public java.util.List<HeaderManipulationAction> getResponseHeaderManipulation() {
        return responseHeaderManipulation;
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
        sb.append("AccessRule(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", criteria=").append(String.valueOf(this.criteria));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", blockAction=").append(String.valueOf(this.blockAction));
        sb.append(", blockResponseCode=").append(String.valueOf(this.blockResponseCode));
        sb.append(", blockErrorPageMessage=").append(String.valueOf(this.blockErrorPageMessage));
        sb.append(", blockErrorPageCode=").append(String.valueOf(this.blockErrorPageCode));
        sb.append(", blockErrorPageDescription=")
                .append(String.valueOf(this.blockErrorPageDescription));
        sb.append(", bypassChallenges=").append(String.valueOf(this.bypassChallenges));
        sb.append(", redirectUrl=").append(String.valueOf(this.redirectUrl));
        sb.append(", redirectResponseCode=").append(String.valueOf(this.redirectResponseCode));
        sb.append(", captchaTitle=").append(String.valueOf(this.captchaTitle));
        sb.append(", captchaHeader=").append(String.valueOf(this.captchaHeader));
        sb.append(", captchaFooter=").append(String.valueOf(this.captchaFooter));
        sb.append(", captchaSubmitLabel=").append(String.valueOf(this.captchaSubmitLabel));
        sb.append(", responseHeaderManipulation=")
                .append(String.valueOf(this.responseHeaderManipulation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessRule)) {
            return false;
        }

        AccessRule other = (AccessRule) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.criteria, other.criteria)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.blockAction, other.blockAction)
                && java.util.Objects.equals(this.blockResponseCode, other.blockResponseCode)
                && java.util.Objects.equals(this.blockErrorPageMessage, other.blockErrorPageMessage)
                && java.util.Objects.equals(this.blockErrorPageCode, other.blockErrorPageCode)
                && java.util.Objects.equals(
                        this.blockErrorPageDescription, other.blockErrorPageDescription)
                && java.util.Objects.equals(this.bypassChallenges, other.bypassChallenges)
                && java.util.Objects.equals(this.redirectUrl, other.redirectUrl)
                && java.util.Objects.equals(this.redirectResponseCode, other.redirectResponseCode)
                && java.util.Objects.equals(this.captchaTitle, other.captchaTitle)
                && java.util.Objects.equals(this.captchaHeader, other.captchaHeader)
                && java.util.Objects.equals(this.captchaFooter, other.captchaFooter)
                && java.util.Objects.equals(this.captchaSubmitLabel, other.captchaSubmitLabel)
                && java.util.Objects.equals(
                        this.responseHeaderManipulation, other.responseHeaderManipulation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.criteria == null ? 43 : this.criteria.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.blockAction == null ? 43 : this.blockAction.hashCode());
        result =
                (result * PRIME)
                        + (this.blockResponseCode == null ? 43 : this.blockResponseCode.hashCode());
        result =
                (result * PRIME)
                        + (this.blockErrorPageMessage == null
                                ? 43
                                : this.blockErrorPageMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.blockErrorPageCode == null
                                ? 43
                                : this.blockErrorPageCode.hashCode());
        result =
                (result * PRIME)
                        + (this.blockErrorPageDescription == null
                                ? 43
                                : this.blockErrorPageDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.bypassChallenges == null ? 43 : this.bypassChallenges.hashCode());
        result = (result * PRIME) + (this.redirectUrl == null ? 43 : this.redirectUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.redirectResponseCode == null
                                ? 43
                                : this.redirectResponseCode.hashCode());
        result = (result * PRIME) + (this.captchaTitle == null ? 43 : this.captchaTitle.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaHeader == null ? 43 : this.captchaHeader.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaFooter == null ? 43 : this.captchaFooter.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaSubmitLabel == null
                                ? 43
                                : this.captchaSubmitLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.responseHeaderManipulation == null
                                ? 43
                                : this.responseHeaderManipulation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
