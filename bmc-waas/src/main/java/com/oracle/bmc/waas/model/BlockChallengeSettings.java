/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BlockChallengeSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BlockChallengeSettings {
    @Deprecated
    @java.beans.ConstructorProperties({
        "blockAction",
        "blockResponseCode",
        "blockErrorPageMessage",
        "blockErrorPageDescription",
        "blockErrorPageCode",
        "captchaTitle",
        "captchaHeader",
        "captchaFooter",
        "captchaSubmitLabel"
    })
    public BlockChallengeSettings(
            BlockAction blockAction,
            Integer blockResponseCode,
            String blockErrorPageMessage,
            String blockErrorPageDescription,
            String blockErrorPageCode,
            String captchaTitle,
            String captchaHeader,
            String captchaFooter,
            String captchaSubmitLabel) {
        super();
        this.blockAction = blockAction;
        this.blockResponseCode = blockResponseCode;
        this.blockErrorPageMessage = blockErrorPageMessage;
        this.blockErrorPageDescription = blockErrorPageDescription;
        this.blockErrorPageCode = blockErrorPageCode;
        this.captchaTitle = captchaTitle;
        this.captchaHeader = captchaHeader;
        this.captchaFooter = captchaFooter;
        this.captchaSubmitLabel = captchaSubmitLabel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The method used to block requests that fail the challenge, if {@code action} is set to {@code BLOCK}. If unspecified, defaults to {@code SHOW_ERROR_PAGE}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
        private BlockAction blockAction;

        /**
         * The method used to block requests that fail the challenge, if {@code action} is set to {@code BLOCK}. If unspecified, defaults to {@code SHOW_ERROR_PAGE}.
         * @param blockAction the value to set
         * @return this builder
         **/
        public Builder blockAction(BlockAction blockAction) {
            this.blockAction = blockAction;
            this.__explicitlySet__.add("blockAction");
            return this;
        }
        /**
         * The response status code to return when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SET_RESPONSE_CODE} or {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code 403}. The list of available response codes: {@code 200}, {@code 201}, {@code 202}, {@code 204}, {@code 206}, {@code 300}, {@code 301}, {@code 302}, {@code 303}, {@code 304}, {@code 307}, {@code 400}, {@code 401}, {@code 403}, {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 444}, {@code 494}, {@code 495}, {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504}, {@code 507}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
        private Integer blockResponseCode;

        /**
         * The response status code to return when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SET_RESPONSE_CODE} or {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code 403}. The list of available response codes: {@code 200}, {@code 201}, {@code 202}, {@code 204}, {@code 206}, {@code 300}, {@code 301}, {@code 302}, {@code 303}, {@code 304}, {@code 307}, {@code 400}, {@code 401}, {@code 403}, {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 444}, {@code 494}, {@code 495}, {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504}, {@code 507}.
         * @param blockResponseCode the value to set
         * @return this builder
         **/
        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = blockResponseCode;
            this.__explicitlySet__.add("blockResponseCode");
            return this;
        }
        /**
         * The message to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code Access to the website is blocked}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
        private String blockErrorPageMessage;

        /**
         * The message to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code Access to the website is blocked}.
         * @param blockErrorPageMessage the value to set
         * @return this builder
         **/
        public Builder blockErrorPageMessage(String blockErrorPageMessage) {
            this.blockErrorPageMessage = blockErrorPageMessage;
            this.__explicitlySet__.add("blockErrorPageMessage");
            return this;
        }
        /**
         * The description text to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code Access blocked by website owner. Please contact support.}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
        private String blockErrorPageDescription;

        /**
         * The description text to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code Access blocked by website owner. Please contact support.}
         * @param blockErrorPageDescription the value to set
         * @return this builder
         **/
        public Builder blockErrorPageDescription(String blockErrorPageDescription) {
            this.blockErrorPageDescription = blockErrorPageDescription;
            this.__explicitlySet__.add("blockErrorPageDescription");
            return this;
        }
        /**
         * The error code to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE} and the request is blocked. If unspecified, defaults to {@code 403}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
        private String blockErrorPageCode;

        /**
         * The error code to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE} and the request is blocked. If unspecified, defaults to {@code 403}.
         * @param blockErrorPageCode the value to set
         * @return this builder
         **/
        public Builder blockErrorPageCode(String blockErrorPageCode) {
            this.blockErrorPageCode = blockErrorPageCode;
            this.__explicitlySet__.add("blockErrorPageCode");
            return this;
        }
        /**
         * The title used when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code Are you human?}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("captchaTitle")
        private String captchaTitle;

        /**
         * The title used when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code Are you human?}
         * @param captchaTitle the value to set
         * @return this builder
         **/
        public Builder captchaTitle(String captchaTitle) {
            this.captchaTitle = captchaTitle;
            this.__explicitlySet__.add("captchaTitle");
            return this;
        }
        /**
         * The text to show in the header when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code We have detected an increased number of attempts to access this webapp. To help us keep this webapp secure, please let us know that you are not a robot by entering the text from captcha below.}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("captchaHeader")
        private String captchaHeader;

        /**
         * The text to show in the header when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code We have detected an increased number of attempts to access this webapp. To help us keep this webapp secure, please let us know that you are not a robot by entering the text from captcha below.}
         * @param captchaHeader the value to set
         * @return this builder
         **/
        public Builder captchaHeader(String captchaHeader) {
            this.captchaHeader = captchaHeader;
            this.__explicitlySet__.add("captchaHeader");
            return this;
        }
        /**
         * The text to show in the footer when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, default to {@code Enter the letters and numbers as they are shown in image above}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("captchaFooter")
        private String captchaFooter;

        /**
         * The text to show in the footer when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, default to {@code Enter the letters and numbers as they are shown in image above}.
         * @param captchaFooter the value to set
         * @return this builder
         **/
        public Builder captchaFooter(String captchaFooter) {
            this.captchaFooter = captchaFooter;
            this.__explicitlySet__.add("captchaFooter");
            return this;
        }
        /**
         * The text to show on the label of the CAPTCHA challenge submit button when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code Yes, I am human}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("captchaSubmitLabel")
        private String captchaSubmitLabel;

        /**
         * The text to show on the label of the CAPTCHA challenge submit button when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code Yes, I am human}.
         * @param captchaSubmitLabel the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The method used to block requests that fail the challenge, if {@code action} is set to {@code BLOCK}. If unspecified, defaults to {@code SHOW_ERROR_PAGE}.
     **/
    public enum BlockAction {
        SetResponseCode("SET_RESPONSE_CODE"),
        ShowErrorPage("SHOW_ERROR_PAGE"),
        ShowCaptcha("SHOW_CAPTCHA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The method used to block requests that fail the challenge, if {@code action} is set to {@code BLOCK}. If unspecified, defaults to {@code SHOW_ERROR_PAGE}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
    private final BlockAction blockAction;

    /**
     * The method used to block requests that fail the challenge, if {@code action} is set to {@code BLOCK}. If unspecified, defaults to {@code SHOW_ERROR_PAGE}.
     * @return the value
     **/
    public BlockAction getBlockAction() {
        return blockAction;
    }

    /**
     * The response status code to return when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SET_RESPONSE_CODE} or {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code 403}. The list of available response codes: {@code 200}, {@code 201}, {@code 202}, {@code 204}, {@code 206}, {@code 300}, {@code 301}, {@code 302}, {@code 303}, {@code 304}, {@code 307}, {@code 400}, {@code 401}, {@code 403}, {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 444}, {@code 494}, {@code 495}, {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504}, {@code 507}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
    private final Integer blockResponseCode;

    /**
     * The response status code to return when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SET_RESPONSE_CODE} or {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code 403}. The list of available response codes: {@code 200}, {@code 201}, {@code 202}, {@code 204}, {@code 206}, {@code 300}, {@code 301}, {@code 302}, {@code 303}, {@code 304}, {@code 307}, {@code 400}, {@code 401}, {@code 403}, {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 444}, {@code 494}, {@code 495}, {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504}, {@code 507}.
     * @return the value
     **/
    public Integer getBlockResponseCode() {
        return blockResponseCode;
    }

    /**
     * The message to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code Access to the website is blocked}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
    private final String blockErrorPageMessage;

    /**
     * The message to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code Access to the website is blocked}.
     * @return the value
     **/
    public String getBlockErrorPageMessage() {
        return blockErrorPageMessage;
    }

    /**
     * The description text to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code Access blocked by website owner. Please contact support.}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
    private final String blockErrorPageDescription;

    /**
     * The description text to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE}, and the request is blocked. If unspecified, defaults to {@code Access blocked by website owner. Please contact support.}
     * @return the value
     **/
    public String getBlockErrorPageDescription() {
        return blockErrorPageDescription;
    }

    /**
     * The error code to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE} and the request is blocked. If unspecified, defaults to {@code 403}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
    private final String blockErrorPageCode;

    /**
     * The error code to show on the error page when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_ERROR_PAGE} and the request is blocked. If unspecified, defaults to {@code 403}.
     * @return the value
     **/
    public String getBlockErrorPageCode() {
        return blockErrorPageCode;
    }

    /**
     * The title used when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code Are you human?}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaTitle")
    private final String captchaTitle;

    /**
     * The title used when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code Are you human?}
     * @return the value
     **/
    public String getCaptchaTitle() {
        return captchaTitle;
    }

    /**
     * The text to show in the header when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code We have detected an increased number of attempts to access this webapp. To help us keep this webapp secure, please let us know that you are not a robot by entering the text from captcha below.}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaHeader")
    private final String captchaHeader;

    /**
     * The text to show in the header when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code We have detected an increased number of attempts to access this webapp. To help us keep this webapp secure, please let us know that you are not a robot by entering the text from captcha below.}
     * @return the value
     **/
    public String getCaptchaHeader() {
        return captchaHeader;
    }

    /**
     * The text to show in the footer when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, default to {@code Enter the letters and numbers as they are shown in image above}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaFooter")
    private final String captchaFooter;

    /**
     * The text to show in the footer when showing a CAPTCHA challenge when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, default to {@code Enter the letters and numbers as they are shown in image above}.
     * @return the value
     **/
    public String getCaptchaFooter() {
        return captchaFooter;
    }

    /**
     * The text to show on the label of the CAPTCHA challenge submit button when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code Yes, I am human}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaSubmitLabel")
    private final String captchaSubmitLabel;

    /**
     * The text to show on the label of the CAPTCHA challenge submit button when {@code action} is set to {@code BLOCK}, {@code blockAction} is set to {@code SHOW_CAPTCHA}, and the request is blocked. If unspecified, defaults to {@code Yes, I am human}.
     * @return the value
     **/
    public String getCaptchaSubmitLabel() {
        return captchaSubmitLabel;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BlockChallengeSettings(");
        sb.append("blockAction=").append(String.valueOf(this.blockAction));
        sb.append(", blockResponseCode=").append(String.valueOf(this.blockResponseCode));
        sb.append(", blockErrorPageMessage=").append(String.valueOf(this.blockErrorPageMessage));
        sb.append(", blockErrorPageDescription=")
                .append(String.valueOf(this.blockErrorPageDescription));
        sb.append(", blockErrorPageCode=").append(String.valueOf(this.blockErrorPageCode));
        sb.append(", captchaTitle=").append(String.valueOf(this.captchaTitle));
        sb.append(", captchaHeader=").append(String.valueOf(this.captchaHeader));
        sb.append(", captchaFooter=").append(String.valueOf(this.captchaFooter));
        sb.append(", captchaSubmitLabel=").append(String.valueOf(this.captchaSubmitLabel));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlockChallengeSettings)) {
            return false;
        }

        BlockChallengeSettings other = (BlockChallengeSettings) o;
        return java.util.Objects.equals(this.blockAction, other.blockAction)
                && java.util.Objects.equals(this.blockResponseCode, other.blockResponseCode)
                && java.util.Objects.equals(this.blockErrorPageMessage, other.blockErrorPageMessage)
                && java.util.Objects.equals(
                        this.blockErrorPageDescription, other.blockErrorPageDescription)
                && java.util.Objects.equals(this.blockErrorPageCode, other.blockErrorPageCode)
                && java.util.Objects.equals(this.captchaTitle, other.captchaTitle)
                && java.util.Objects.equals(this.captchaHeader, other.captchaHeader)
                && java.util.Objects.equals(this.captchaFooter, other.captchaFooter)
                && java.util.Objects.equals(this.captchaSubmitLabel, other.captchaSubmitLabel)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
                        + (this.blockErrorPageDescription == null
                                ? 43
                                : this.blockErrorPageDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.blockErrorPageCode == null
                                ? 43
                                : this.blockErrorPageCode.hashCode());
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
