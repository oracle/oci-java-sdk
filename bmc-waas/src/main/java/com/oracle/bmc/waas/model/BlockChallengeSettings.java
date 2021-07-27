/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The challenge settings if {@code action} is set to {@code BLOCK}.
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
    builder = BlockChallengeSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BlockChallengeSettings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
        private BlockAction blockAction;

        public Builder blockAction(BlockAction blockAction) {
            this.blockAction = blockAction;
            this.__explicitlySet__.add("blockAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
        private Integer blockResponseCode;

        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = blockResponseCode;
            this.__explicitlySet__.add("blockResponseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
        private String blockErrorPageMessage;

        public Builder blockErrorPageMessage(String blockErrorPageMessage) {
            this.blockErrorPageMessage = blockErrorPageMessage;
            this.__explicitlySet__.add("blockErrorPageMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
        private String blockErrorPageDescription;

        public Builder blockErrorPageDescription(String blockErrorPageDescription) {
            this.blockErrorPageDescription = blockErrorPageDescription;
            this.__explicitlySet__.add("blockErrorPageDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
        private String blockErrorPageCode;

        public Builder blockErrorPageCode(String blockErrorPageCode) {
            this.blockErrorPageCode = blockErrorPageCode;
            this.__explicitlySet__.add("blockErrorPageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaTitle")
        private String captchaTitle;

        public Builder captchaTitle(String captchaTitle) {
            this.captchaTitle = captchaTitle;
            this.__explicitlySet__.add("captchaTitle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaHeader")
        private String captchaHeader;

        public Builder captchaHeader(String captchaHeader) {
            this.captchaHeader = captchaHeader;
            this.__explicitlySet__.add("captchaHeader");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaFooter")
        private String captchaFooter;

        public Builder captchaFooter(String captchaFooter) {
            this.captchaFooter = captchaFooter;
            this.__explicitlySet__.add("captchaFooter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaSubmitLabel")
        private String captchaSubmitLabel;

        public Builder captchaSubmitLabel(String captchaSubmitLabel) {
            this.captchaSubmitLabel = captchaSubmitLabel;
            this.__explicitlySet__.add("captchaSubmitLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlockChallengeSettings build() {
            BlockChallengeSettings __instance__ =
                    new BlockChallengeSettings(
                            blockAction,
                            blockResponseCode,
                            blockErrorPageMessage,
                            blockErrorPageDescription,
                            blockErrorPageCode,
                            captchaTitle,
                            captchaHeader,
                            captchaFooter,
                            captchaSubmitLabel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockChallengeSettings o) {
            Builder copiedBuilder =
                    blockAction(o.getBlockAction())
                            .blockResponseCode(o.getBlockResponseCode())
                            .blockErrorPageMessage(o.getBlockErrorPageMessage())
                            .blockErrorPageDescription(o.getBlockErrorPageDescription())
                            .blockErrorPageCode(o.getBlockErrorPageCode())
                            .captchaTitle(o.getCaptchaTitle())
                            .captchaHeader(o.getCaptchaHeader())
                            .captchaFooter(o.getCaptchaFooter())
                            .captchaSubmitLabel(o.getCaptchaSubmitLabel());

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
     * The method used to block requests that fail the challenge, if {@code action} is set to {@code BLOCK}. If unspecified, defaults to {@code SHOW_ERROR_PAGE}.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BlockAction {
        SetResponseCode("SET_RESPONSE_CODE"),
        ShowErrorPage("SHOW_ERROR_PAGE"),
        ShowCaptcha("SHOW_CAPTCHA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The method used to block requests that fail the challenge, if {@code action} is set to {@code BLOCK}. If unspecified, defaults to {@code SHOW_ERROR_PAGE}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
    BlockAction blockAction;

    /**
     * The response status code to return when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SET_RESPONSE_CODE} or {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code 403}. The list of available response codes: {@code 200}, {@code 201}, {@code 202}, {@code 204}, {@code 206}, {@code 300}, {@code 301}, {@code 302}, {@code 303}, {@code 304}, {@code 307}, {@code 400}, {@code 401}, {@code 403}, {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 444}, {@code 494}, {@code 495}, {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504}, {@code 507}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
    Integer blockResponseCode;

    /**
     * The message to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code Access to the website is blocked}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
    String blockErrorPageMessage;

    /**
     * The description text to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code Access blocked by website owner. Please contact support.}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
    String blockErrorPageDescription;

    /**
     * The error code to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE} and the request is blocked. If unspecified, defaults to {@code 403}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
    String blockErrorPageCode;

    /**
     * The title used when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code Are you human?}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaTitle")
    String captchaTitle;

    /**
     * The text to show in the header when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code We have detected an increased number of attempts to access this webapp. To help us keep this webapp secure, please let us know that you are not a robot by entering the text from captcha below.}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaHeader")
    String captchaHeader;

    /**
     * The text to show in the footer when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, default to {@code Enter the letters and numbers as they are shown in image above}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaFooter")
    String captchaFooter;

    /**
     * The text to show on the label of the CAPTCHA challenge submit button when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code Yes, I am human}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaSubmitLabel")
    String captchaSubmitLabel;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
