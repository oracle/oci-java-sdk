/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The settings of the CAPTCHA challenge. If a specific URL should be accessed only by a human, a CAPTCHA challenge can be placed at the URL to protect the web application from bots.
 * <p>
 *Warning:* Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Captcha.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Captcha {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionExpirationInSeconds")
        private Integer sessionExpirationInSeconds;

        public Builder sessionExpirationInSeconds(Integer sessionExpirationInSeconds) {
            this.sessionExpirationInSeconds = sessionExpirationInSeconds;
            this.__explicitlySet__.add("sessionExpirationInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headerText")
        private String headerText;

        public Builder headerText(String headerText) {
            this.headerText = headerText;
            this.__explicitlySet__.add("headerText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("footerText")
        private String footerText;

        public Builder footerText(String footerText) {
            this.footerText = footerText;
            this.__explicitlySet__.add("footerText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failureMessage")
        private String failureMessage;

        public Builder failureMessage(String failureMessage) {
            this.failureMessage = failureMessage;
            this.__explicitlySet__.add("failureMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("submitLabel")
        private String submitLabel;

        public Builder submitLabel(String submitLabel) {
            this.submitLabel = submitLabel;
            this.__explicitlySet__.add("submitLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Captcha build() {
            Captcha __instance__ =
                    new Captcha(
                            url,
                            sessionExpirationInSeconds,
                            title,
                            headerText,
                            footerText,
                            failureMessage,
                            submitLabel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Captcha o) {
            Builder copiedBuilder =
                    url(o.getUrl())
                            .sessionExpirationInSeconds(o.getSessionExpirationInSeconds())
                            .title(o.getTitle())
                            .headerText(o.getHeaderText())
                            .footerText(o.getFooterText())
                            .failureMessage(o.getFailureMessage())
                            .submitLabel(o.getSubmitLabel());

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
     * The unique URL path at which to show the CAPTCHA challenge.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    String url;

    /**
     * The amount of time before the CAPTCHA expires, in seconds. If unspecified, defaults to `300`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionExpirationInSeconds")
    Integer sessionExpirationInSeconds;

    /**
     * The title used when displaying a CAPTCHA challenge. If unspecified, defaults to `Are you human?`
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    String title;

    /**
     * The text to show in the header when showing a CAPTCHA challenge. If unspecified, defaults to 'We have detected an increased number of attempts to access this website. To help us keep this site secure, please let us know that you are not a robot by entering the text from the image below.'
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerText")
    String headerText;

    /**
     * The text to show in the footer when showing a CAPTCHA challenge. If unspecified, defaults to 'Enter the letters and numbers as they are shown in the image above.'
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("footerText")
    String footerText;

    /**
     * The text to show when incorrect CAPTCHA text is entered. If unspecified, defaults to `The CAPTCHA was incorrect. Try again.`
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureMessage")
    String failureMessage;

    /**
     * The text to show on the label of the CAPTCHA challenge submit button. If unspecified, defaults to `Yes, I am human`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("submitLabel")
    String submitLabel;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
