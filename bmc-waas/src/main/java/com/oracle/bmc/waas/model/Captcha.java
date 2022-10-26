/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The settings of the CAPTCHA challenge. If a specific URL should be accessed only by a human, a
 * CAPTCHA challenge can be placed at the URL to protect the web application from bots.
 *
 * <p>Warning:* Oracle recommends that you avoid using any confidential information when you supply
 * string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Captcha.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Captcha extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "url",
        "sessionExpirationInSeconds",
        "title",
        "headerText",
        "footerText",
        "failureMessage",
        "submitLabel"
    })
    public Captcha(
            String url,
            Integer sessionExpirationInSeconds,
            String title,
            String headerText,
            String footerText,
            String failureMessage,
            String submitLabel) {
        super();
        this.url = url;
        this.sessionExpirationInSeconds = sessionExpirationInSeconds;
        this.title = title;
        this.headerText = headerText;
        this.footerText = footerText;
        this.failureMessage = failureMessage;
        this.submitLabel = submitLabel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique URL path at which to show the CAPTCHA challenge. */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The unique URL path at which to show the CAPTCHA challenge.
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * The amount of time before the CAPTCHA expires, in seconds. If unspecified, defaults to
         * {@code 300}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sessionExpirationInSeconds")
        private Integer sessionExpirationInSeconds;

        /**
         * The amount of time before the CAPTCHA expires, in seconds. If unspecified, defaults to
         * {@code 300}.
         *
         * @param sessionExpirationInSeconds the value to set
         * @return this builder
         */
        public Builder sessionExpirationInSeconds(Integer sessionExpirationInSeconds) {
            this.sessionExpirationInSeconds = sessionExpirationInSeconds;
            this.__explicitlySet__.add("sessionExpirationInSeconds");
            return this;
        }
        /**
         * The title used when displaying a CAPTCHA challenge. If unspecified, defaults to {@code
         * Are you human?}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The title used when displaying a CAPTCHA challenge. If unspecified, defaults to {@code
         * Are you human?}
         *
         * @param title the value to set
         * @return this builder
         */
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * The text to show in the header when showing a CAPTCHA challenge. If unspecified, defaults
         * to 'We have detected an increased number of attempts to access this website. To help us
         * keep this site secure, please let us know that you are not a robot by entering the text
         * from the image below.'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("headerText")
        private String headerText;

        /**
         * The text to show in the header when showing a CAPTCHA challenge. If unspecified, defaults
         * to 'We have detected an increased number of attempts to access this website. To help us
         * keep this site secure, please let us know that you are not a robot by entering the text
         * from the image below.'
         *
         * @param headerText the value to set
         * @return this builder
         */
        public Builder headerText(String headerText) {
            this.headerText = headerText;
            this.__explicitlySet__.add("headerText");
            return this;
        }
        /**
         * The text to show in the footer when showing a CAPTCHA challenge. If unspecified, defaults
         * to 'Enter the letters and numbers as they are shown in the image above.'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("footerText")
        private String footerText;

        /**
         * The text to show in the footer when showing a CAPTCHA challenge. If unspecified, defaults
         * to 'Enter the letters and numbers as they are shown in the image above.'
         *
         * @param footerText the value to set
         * @return this builder
         */
        public Builder footerText(String footerText) {
            this.footerText = footerText;
            this.__explicitlySet__.add("footerText");
            return this;
        }
        /**
         * The text to show when incorrect CAPTCHA text is entered. If unspecified, defaults to
         * {@code The CAPTCHA was incorrect. Try again.}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("failureMessage")
        private String failureMessage;

        /**
         * The text to show when incorrect CAPTCHA text is entered. If unspecified, defaults to
         * {@code The CAPTCHA was incorrect. Try again.}
         *
         * @param failureMessage the value to set
         * @return this builder
         */
        public Builder failureMessage(String failureMessage) {
            this.failureMessage = failureMessage;
            this.__explicitlySet__.add("failureMessage");
            return this;
        }
        /**
         * The text to show on the label of the CAPTCHA challenge submit button. If unspecified,
         * defaults to {@code Yes, I am human}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("submitLabel")
        private String submitLabel;

        /**
         * The text to show on the label of the CAPTCHA challenge submit button. If unspecified,
         * defaults to {@code Yes, I am human}.
         *
         * @param submitLabel the value to set
         * @return this builder
         */
        public Builder submitLabel(String submitLabel) {
            this.submitLabel = submitLabel;
            this.__explicitlySet__.add("submitLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Captcha build() {
            Captcha model =
                    new Captcha(
                            this.url,
                            this.sessionExpirationInSeconds,
                            this.title,
                            this.headerText,
                            this.footerText,
                            this.failureMessage,
                            this.submitLabel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Captcha model) {
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("sessionExpirationInSeconds")) {
                this.sessionExpirationInSeconds(model.getSessionExpirationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("headerText")) {
                this.headerText(model.getHeaderText());
            }
            if (model.wasPropertyExplicitlySet("footerText")) {
                this.footerText(model.getFooterText());
            }
            if (model.wasPropertyExplicitlySet("failureMessage")) {
                this.failureMessage(model.getFailureMessage());
            }
            if (model.wasPropertyExplicitlySet("submitLabel")) {
                this.submitLabel(model.getSubmitLabel());
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

    /** The unique URL path at which to show the CAPTCHA challenge. */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The unique URL path at which to show the CAPTCHA challenge.
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /**
     * The amount of time before the CAPTCHA expires, in seconds. If unspecified, defaults to {@code
     * 300}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sessionExpirationInSeconds")
    private final Integer sessionExpirationInSeconds;

    /**
     * The amount of time before the CAPTCHA expires, in seconds. If unspecified, defaults to {@code
     * 300}.
     *
     * @return the value
     */
    public Integer getSessionExpirationInSeconds() {
        return sessionExpirationInSeconds;
    }

    /**
     * The title used when displaying a CAPTCHA challenge. If unspecified, defaults to {@code Are
     * you human?}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The title used when displaying a CAPTCHA challenge. If unspecified, defaults to {@code Are
     * you human?}
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * The text to show in the header when showing a CAPTCHA challenge. If unspecified, defaults to
     * 'We have detected an increased number of attempts to access this website. To help us keep
     * this site secure, please let us know that you are not a robot by entering the text from the
     * image below.'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headerText")
    private final String headerText;

    /**
     * The text to show in the header when showing a CAPTCHA challenge. If unspecified, defaults to
     * 'We have detected an increased number of attempts to access this website. To help us keep
     * this site secure, please let us know that you are not a robot by entering the text from the
     * image below.'
     *
     * @return the value
     */
    public String getHeaderText() {
        return headerText;
    }

    /**
     * The text to show in the footer when showing a CAPTCHA challenge. If unspecified, defaults to
     * 'Enter the letters and numbers as they are shown in the image above.'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("footerText")
    private final String footerText;

    /**
     * The text to show in the footer when showing a CAPTCHA challenge. If unspecified, defaults to
     * 'Enter the letters and numbers as they are shown in the image above.'
     *
     * @return the value
     */
    public String getFooterText() {
        return footerText;
    }

    /**
     * The text to show when incorrect CAPTCHA text is entered. If unspecified, defaults to {@code
     * The CAPTCHA was incorrect. Try again.}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failureMessage")
    private final String failureMessage;

    /**
     * The text to show when incorrect CAPTCHA text is entered. If unspecified, defaults to {@code
     * The CAPTCHA was incorrect. Try again.}
     *
     * @return the value
     */
    public String getFailureMessage() {
        return failureMessage;
    }

    /**
     * The text to show on the label of the CAPTCHA challenge submit button. If unspecified,
     * defaults to {@code Yes, I am human}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("submitLabel")
    private final String submitLabel;

    /**
     * The text to show on the label of the CAPTCHA challenge submit button. If unspecified,
     * defaults to {@code Yes, I am human}.
     *
     * @return the value
     */
    public String getSubmitLabel() {
        return submitLabel;
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
        sb.append("Captcha(");
        sb.append("super=").append(super.toString());
        sb.append("url=").append(String.valueOf(this.url));
        sb.append(", sessionExpirationInSeconds=")
                .append(String.valueOf(this.sessionExpirationInSeconds));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", headerText=").append(String.valueOf(this.headerText));
        sb.append(", footerText=").append(String.valueOf(this.footerText));
        sb.append(", failureMessage=").append(String.valueOf(this.failureMessage));
        sb.append(", submitLabel=").append(String.valueOf(this.submitLabel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Captcha)) {
            return false;
        }

        Captcha other = (Captcha) o;
        return java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(
                        this.sessionExpirationInSeconds, other.sessionExpirationInSeconds)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.headerText, other.headerText)
                && java.util.Objects.equals(this.footerText, other.footerText)
                && java.util.Objects.equals(this.failureMessage, other.failureMessage)
                && java.util.Objects.equals(this.submitLabel, other.submitLabel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionExpirationInSeconds == null
                                ? 43
                                : this.sessionExpirationInSeconds.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.headerText == null ? 43 : this.headerText.hashCode());
        result = (result * PRIME) + (this.footerText == null ? 43 : this.footerText.hashCode());
        result =
                (result * PRIME)
                        + (this.failureMessage == null ? 43 : this.failureMessage.hashCode());
        result = (result * PRIME) + (this.submitLabel == null ? 43 : this.submitLabel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
