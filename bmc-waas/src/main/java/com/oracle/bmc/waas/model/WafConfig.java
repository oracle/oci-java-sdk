/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The Web Application Firewall configuration for the WAAS policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WafConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class WafConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "accessRules",
        "addressRateLimiting",
        "captchas",
        "deviceFingerprintChallenge",
        "goodBots",
        "humanInteractionChallenge",
        "jsChallenge",
        "origin",
        "cachingRules",
        "customProtectionRules",
        "originGroups",
        "protectionRules",
        "protectionSettings",
        "threatFeeds",
        "whitelists"
    })
    public WafConfig(
            java.util.List<AccessRule> accessRules,
            AddressRateLimiting addressRateLimiting,
            java.util.List<Captcha> captchas,
            DeviceFingerprintChallenge deviceFingerprintChallenge,
            java.util.List<GoodBot> goodBots,
            HumanInteractionChallenge humanInteractionChallenge,
            JsChallenge jsChallenge,
            String origin,
            java.util.List<CachingRule> cachingRules,
            java.util.List<CustomProtectionRuleSetting> customProtectionRules,
            java.util.List<String> originGroups,
            java.util.List<ProtectionRule> protectionRules,
            ProtectionSettings protectionSettings,
            java.util.List<ThreatFeed> threatFeeds,
            java.util.List<Whitelist> whitelists) {
        super();
        this.accessRules = accessRules;
        this.addressRateLimiting = addressRateLimiting;
        this.captchas = captchas;
        this.deviceFingerprintChallenge = deviceFingerprintChallenge;
        this.goodBots = goodBots;
        this.humanInteractionChallenge = humanInteractionChallenge;
        this.jsChallenge = jsChallenge;
        this.origin = origin;
        this.cachingRules = cachingRules;
        this.customProtectionRules = customProtectionRules;
        this.originGroups = originGroups;
        this.protectionRules = protectionRules;
        this.protectionSettings = protectionSettings;
        this.threatFeeds = threatFeeds;
        this.whitelists = whitelists;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The access rules applied to the Web Application Firewall. Used for defining custom access
         * policies with the combination of {@code ALLOW}, {@code DETECT}, and {@code BLOCK} rules,
         * based on different criteria.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessRules")
        private java.util.List<AccessRule> accessRules;

        /**
         * The access rules applied to the Web Application Firewall. Used for defining custom access
         * policies with the combination of {@code ALLOW}, {@code DETECT}, and {@code BLOCK} rules,
         * based on different criteria.
         *
         * @param accessRules the value to set
         * @return this builder
         */
        public Builder accessRules(java.util.List<AccessRule> accessRules) {
            this.accessRules = accessRules;
            this.__explicitlySet__.add("accessRules");
            return this;
        }
        /**
         * The IP address rate limiting settings used to limit the number of requests from an
         * address.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("addressRateLimiting")
        private AddressRateLimiting addressRateLimiting;

        /**
         * The IP address rate limiting settings used to limit the number of requests from an
         * address.
         *
         * @param addressRateLimiting the value to set
         * @return this builder
         */
        public Builder addressRateLimiting(AddressRateLimiting addressRateLimiting) {
            this.addressRateLimiting = addressRateLimiting;
            this.__explicitlySet__.add("addressRateLimiting");
            return this;
        }
        /**
         * A list of CAPTCHA challenge settings. These are used to challenge requests with a CAPTCHA
         * to block bots.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("captchas")
        private java.util.List<Captcha> captchas;

        /**
         * A list of CAPTCHA challenge settings. These are used to challenge requests with a CAPTCHA
         * to block bots.
         *
         * @param captchas the value to set
         * @return this builder
         */
        public Builder captchas(java.util.List<Captcha> captchas) {
            this.captchas = captchas;
            this.__explicitlySet__.add("captchas");
            return this;
        }
        /**
         * The device fingerprint challenge settings. Used to detect unique devices based on the
         * device fingerprint information collected in order to block bots.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deviceFingerprintChallenge")
        private DeviceFingerprintChallenge deviceFingerprintChallenge;

        /**
         * The device fingerprint challenge settings. Used to detect unique devices based on the
         * device fingerprint information collected in order to block bots.
         *
         * @param deviceFingerprintChallenge the value to set
         * @return this builder
         */
        public Builder deviceFingerprintChallenge(
                DeviceFingerprintChallenge deviceFingerprintChallenge) {
            this.deviceFingerprintChallenge = deviceFingerprintChallenge;
            this.__explicitlySet__.add("deviceFingerprintChallenge");
            return this;
        }
        /** A list of bots allowed to access the web application. */
        @com.fasterxml.jackson.annotation.JsonProperty("goodBots")
        private java.util.List<GoodBot> goodBots;

        /**
         * A list of bots allowed to access the web application.
         *
         * @param goodBots the value to set
         * @return this builder
         */
        public Builder goodBots(java.util.List<GoodBot> goodBots) {
            this.goodBots = goodBots;
            this.__explicitlySet__.add("goodBots");
            return this;
        }
        /**
         * The human interaction challenge settings. Used to look for natural human interactions
         * such as mouse movements, time on site, and page scrolling to identify bots.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("humanInteractionChallenge")
        private HumanInteractionChallenge humanInteractionChallenge;

        /**
         * The human interaction challenge settings. Used to look for natural human interactions
         * such as mouse movements, time on site, and page scrolling to identify bots.
         *
         * @param humanInteractionChallenge the value to set
         * @return this builder
         */
        public Builder humanInteractionChallenge(
                HumanInteractionChallenge humanInteractionChallenge) {
            this.humanInteractionChallenge = humanInteractionChallenge;
            this.__explicitlySet__.add("humanInteractionChallenge");
            return this;
        }
        /**
         * The JavaScript challenge settings. Used to challenge requests with a JavaScript challenge
         * and take the action if a browser has no JavaScript support in order to block bots.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jsChallenge")
        private JsChallenge jsChallenge;

        /**
         * The JavaScript challenge settings. Used to challenge requests with a JavaScript challenge
         * and take the action if a browser has no JavaScript support in order to block bots.
         *
         * @param jsChallenge the value to set
         * @return this builder
         */
        public Builder jsChallenge(JsChallenge jsChallenge) {
            this.jsChallenge = jsChallenge;
            this.__explicitlySet__.add("jsChallenge");
            return this;
        }
        /**
         * The key in the map of origins referencing the origin used for the Web Application
         * Firewall. The origin must already be included in {@code Origins}. Required when creating
         * the {@code WafConfig} resource, but not on update.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("origin")
        private String origin;

        /**
         * The key in the map of origins referencing the origin used for the Web Application
         * Firewall. The origin must already be included in {@code Origins}. Required when creating
         * the {@code WafConfig} resource, but not on update.
         *
         * @param origin the value to set
         * @return this builder
         */
        public Builder origin(String origin) {
            this.origin = origin;
            this.__explicitlySet__.add("origin");
            return this;
        }
        /** A list of caching rules applied to the web application. */
        @com.fasterxml.jackson.annotation.JsonProperty("cachingRules")
        private java.util.List<CachingRule> cachingRules;

        /**
         * A list of caching rules applied to the web application.
         *
         * @param cachingRules the value to set
         * @return this builder
         */
        public Builder cachingRules(java.util.List<CachingRule> cachingRules) {
            this.cachingRules = cachingRules;
            this.__explicitlySet__.add("cachingRules");
            return this;
        }
        /** A list of the custom protection rule OCIDs and their actions. */
        @com.fasterxml.jackson.annotation.JsonProperty("customProtectionRules")
        private java.util.List<CustomProtectionRuleSetting> customProtectionRules;

        /**
         * A list of the custom protection rule OCIDs and their actions.
         *
         * @param customProtectionRules the value to set
         * @return this builder
         */
        public Builder customProtectionRules(
                java.util.List<CustomProtectionRuleSetting> customProtectionRules) {
            this.customProtectionRules = customProtectionRules;
            this.__explicitlySet__.add("customProtectionRules");
            return this;
        }
        /**
         * The map of origin groups and their keys used to associate origins to the {@code
         * wafConfig}. Origin groups allow you to apply weights to groups of origins for load
         * balancing purposes. Origins with higher weights will receive larger proportions of client
         * requests. To add additional origins to your WAAS policy, update the {@code origins} field
         * of a {@code UpdateWaasPolicy} request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("originGroups")
        private java.util.List<String> originGroups;

        /**
         * The map of origin groups and their keys used to associate origins to the {@code
         * wafConfig}. Origin groups allow you to apply weights to groups of origins for load
         * balancing purposes. Origins with higher weights will receive larger proportions of client
         * requests. To add additional origins to your WAAS policy, update the {@code origins} field
         * of a {@code UpdateWaasPolicy} request.
         *
         * @param originGroups the value to set
         * @return this builder
         */
        public Builder originGroups(java.util.List<String> originGroups) {
            this.originGroups = originGroups;
            this.__explicitlySet__.add("originGroups");
            return this;
        }
        /** A list of the protection rules and their details. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionRules")
        private java.util.List<ProtectionRule> protectionRules;

        /**
         * A list of the protection rules and their details.
         *
         * @param protectionRules the value to set
         * @return this builder
         */
        public Builder protectionRules(java.util.List<ProtectionRule> protectionRules) {
            this.protectionRules = protectionRules;
            this.__explicitlySet__.add("protectionRules");
            return this;
        }
        /** The settings to apply to protection rules. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionSettings")
        private ProtectionSettings protectionSettings;

        /**
         * The settings to apply to protection rules.
         *
         * @param protectionSettings the value to set
         * @return this builder
         */
        public Builder protectionSettings(ProtectionSettings protectionSettings) {
            this.protectionSettings = protectionSettings;
            this.__explicitlySet__.add("protectionSettings");
            return this;
        }
        /**
         * A list of threat intelligence feeds and the actions to apply to known malicious traffic
         * based on internet intelligence.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threatFeeds")
        private java.util.List<ThreatFeed> threatFeeds;

        /**
         * A list of threat intelligence feeds and the actions to apply to known malicious traffic
         * based on internet intelligence.
         *
         * @param threatFeeds the value to set
         * @return this builder
         */
        public Builder threatFeeds(java.util.List<ThreatFeed> threatFeeds) {
            this.threatFeeds = threatFeeds;
            this.__explicitlySet__.add("threatFeeds");
            return this;
        }
        /** A list of IP addresses that bypass the Web Application Firewall. */
        @com.fasterxml.jackson.annotation.JsonProperty("whitelists")
        private java.util.List<Whitelist> whitelists;

        /**
         * A list of IP addresses that bypass the Web Application Firewall.
         *
         * @param whitelists the value to set
         * @return this builder
         */
        public Builder whitelists(java.util.List<Whitelist> whitelists) {
            this.whitelists = whitelists;
            this.__explicitlySet__.add("whitelists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WafConfig build() {
            WafConfig model =
                    new WafConfig(
                            this.accessRules,
                            this.addressRateLimiting,
                            this.captchas,
                            this.deviceFingerprintChallenge,
                            this.goodBots,
                            this.humanInteractionChallenge,
                            this.jsChallenge,
                            this.origin,
                            this.cachingRules,
                            this.customProtectionRules,
                            this.originGroups,
                            this.protectionRules,
                            this.protectionSettings,
                            this.threatFeeds,
                            this.whitelists);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WafConfig model) {
            if (model.wasPropertyExplicitlySet("accessRules")) {
                this.accessRules(model.getAccessRules());
            }
            if (model.wasPropertyExplicitlySet("addressRateLimiting")) {
                this.addressRateLimiting(model.getAddressRateLimiting());
            }
            if (model.wasPropertyExplicitlySet("captchas")) {
                this.captchas(model.getCaptchas());
            }
            if (model.wasPropertyExplicitlySet("deviceFingerprintChallenge")) {
                this.deviceFingerprintChallenge(model.getDeviceFingerprintChallenge());
            }
            if (model.wasPropertyExplicitlySet("goodBots")) {
                this.goodBots(model.getGoodBots());
            }
            if (model.wasPropertyExplicitlySet("humanInteractionChallenge")) {
                this.humanInteractionChallenge(model.getHumanInteractionChallenge());
            }
            if (model.wasPropertyExplicitlySet("jsChallenge")) {
                this.jsChallenge(model.getJsChallenge());
            }
            if (model.wasPropertyExplicitlySet("origin")) {
                this.origin(model.getOrigin());
            }
            if (model.wasPropertyExplicitlySet("cachingRules")) {
                this.cachingRules(model.getCachingRules());
            }
            if (model.wasPropertyExplicitlySet("customProtectionRules")) {
                this.customProtectionRules(model.getCustomProtectionRules());
            }
            if (model.wasPropertyExplicitlySet("originGroups")) {
                this.originGroups(model.getOriginGroups());
            }
            if (model.wasPropertyExplicitlySet("protectionRules")) {
                this.protectionRules(model.getProtectionRules());
            }
            if (model.wasPropertyExplicitlySet("protectionSettings")) {
                this.protectionSettings(model.getProtectionSettings());
            }
            if (model.wasPropertyExplicitlySet("threatFeeds")) {
                this.threatFeeds(model.getThreatFeeds());
            }
            if (model.wasPropertyExplicitlySet("whitelists")) {
                this.whitelists(model.getWhitelists());
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

    /**
     * The access rules applied to the Web Application Firewall. Used for defining custom access
     * policies with the combination of {@code ALLOW}, {@code DETECT}, and {@code BLOCK} rules,
     * based on different criteria.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessRules")
    private final java.util.List<AccessRule> accessRules;

    /**
     * The access rules applied to the Web Application Firewall. Used for defining custom access
     * policies with the combination of {@code ALLOW}, {@code DETECT}, and {@code BLOCK} rules,
     * based on different criteria.
     *
     * @return the value
     */
    public java.util.List<AccessRule> getAccessRules() {
        return accessRules;
    }

    /**
     * The IP address rate limiting settings used to limit the number of requests from an address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addressRateLimiting")
    private final AddressRateLimiting addressRateLimiting;

    /**
     * The IP address rate limiting settings used to limit the number of requests from an address.
     *
     * @return the value
     */
    public AddressRateLimiting getAddressRateLimiting() {
        return addressRateLimiting;
    }

    /**
     * A list of CAPTCHA challenge settings. These are used to challenge requests with a CAPTCHA to
     * block bots.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("captchas")
    private final java.util.List<Captcha> captchas;

    /**
     * A list of CAPTCHA challenge settings. These are used to challenge requests with a CAPTCHA to
     * block bots.
     *
     * @return the value
     */
    public java.util.List<Captcha> getCaptchas() {
        return captchas;
    }

    /**
     * The device fingerprint challenge settings. Used to detect unique devices based on the device
     * fingerprint information collected in order to block bots.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deviceFingerprintChallenge")
    private final DeviceFingerprintChallenge deviceFingerprintChallenge;

    /**
     * The device fingerprint challenge settings. Used to detect unique devices based on the device
     * fingerprint information collected in order to block bots.
     *
     * @return the value
     */
    public DeviceFingerprintChallenge getDeviceFingerprintChallenge() {
        return deviceFingerprintChallenge;
    }

    /** A list of bots allowed to access the web application. */
    @com.fasterxml.jackson.annotation.JsonProperty("goodBots")
    private final java.util.List<GoodBot> goodBots;

    /**
     * A list of bots allowed to access the web application.
     *
     * @return the value
     */
    public java.util.List<GoodBot> getGoodBots() {
        return goodBots;
    }

    /**
     * The human interaction challenge settings. Used to look for natural human interactions such as
     * mouse movements, time on site, and page scrolling to identify bots.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("humanInteractionChallenge")
    private final HumanInteractionChallenge humanInteractionChallenge;

    /**
     * The human interaction challenge settings. Used to look for natural human interactions such as
     * mouse movements, time on site, and page scrolling to identify bots.
     *
     * @return the value
     */
    public HumanInteractionChallenge getHumanInteractionChallenge() {
        return humanInteractionChallenge;
    }

    /**
     * The JavaScript challenge settings. Used to challenge requests with a JavaScript challenge and
     * take the action if a browser has no JavaScript support in order to block bots.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jsChallenge")
    private final JsChallenge jsChallenge;

    /**
     * The JavaScript challenge settings. Used to challenge requests with a JavaScript challenge and
     * take the action if a browser has no JavaScript support in order to block bots.
     *
     * @return the value
     */
    public JsChallenge getJsChallenge() {
        return jsChallenge;
    }

    /**
     * The key in the map of origins referencing the origin used for the Web Application Firewall.
     * The origin must already be included in {@code Origins}. Required when creating the {@code
     * WafConfig} resource, but not on update.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    private final String origin;

    /**
     * The key in the map of origins referencing the origin used for the Web Application Firewall.
     * The origin must already be included in {@code Origins}. Required when creating the {@code
     * WafConfig} resource, but not on update.
     *
     * @return the value
     */
    public String getOrigin() {
        return origin;
    }

    /** A list of caching rules applied to the web application. */
    @com.fasterxml.jackson.annotation.JsonProperty("cachingRules")
    private final java.util.List<CachingRule> cachingRules;

    /**
     * A list of caching rules applied to the web application.
     *
     * @return the value
     */
    public java.util.List<CachingRule> getCachingRules() {
        return cachingRules;
    }

    /** A list of the custom protection rule OCIDs and their actions. */
    @com.fasterxml.jackson.annotation.JsonProperty("customProtectionRules")
    private final java.util.List<CustomProtectionRuleSetting> customProtectionRules;

    /**
     * A list of the custom protection rule OCIDs and their actions.
     *
     * @return the value
     */
    public java.util.List<CustomProtectionRuleSetting> getCustomProtectionRules() {
        return customProtectionRules;
    }

    /**
     * The map of origin groups and their keys used to associate origins to the {@code wafConfig}.
     * Origin groups allow you to apply weights to groups of origins for load balancing purposes.
     * Origins with higher weights will receive larger proportions of client requests. To add
     * additional origins to your WAAS policy, update the {@code origins} field of a {@code
     * UpdateWaasPolicy} request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("originGroups")
    private final java.util.List<String> originGroups;

    /**
     * The map of origin groups and their keys used to associate origins to the {@code wafConfig}.
     * Origin groups allow you to apply weights to groups of origins for load balancing purposes.
     * Origins with higher weights will receive larger proportions of client requests. To add
     * additional origins to your WAAS policy, update the {@code origins} field of a {@code
     * UpdateWaasPolicy} request.
     *
     * @return the value
     */
    public java.util.List<String> getOriginGroups() {
        return originGroups;
    }

    /** A list of the protection rules and their details. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionRules")
    private final java.util.List<ProtectionRule> protectionRules;

    /**
     * A list of the protection rules and their details.
     *
     * @return the value
     */
    public java.util.List<ProtectionRule> getProtectionRules() {
        return protectionRules;
    }

    /** The settings to apply to protection rules. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionSettings")
    private final ProtectionSettings protectionSettings;

    /**
     * The settings to apply to protection rules.
     *
     * @return the value
     */
    public ProtectionSettings getProtectionSettings() {
        return protectionSettings;
    }

    /**
     * A list of threat intelligence feeds and the actions to apply to known malicious traffic based
     * on internet intelligence.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threatFeeds")
    private final java.util.List<ThreatFeed> threatFeeds;

    /**
     * A list of threat intelligence feeds and the actions to apply to known malicious traffic based
     * on internet intelligence.
     *
     * @return the value
     */
    public java.util.List<ThreatFeed> getThreatFeeds() {
        return threatFeeds;
    }

    /** A list of IP addresses that bypass the Web Application Firewall. */
    @com.fasterxml.jackson.annotation.JsonProperty("whitelists")
    private final java.util.List<Whitelist> whitelists;

    /**
     * A list of IP addresses that bypass the Web Application Firewall.
     *
     * @return the value
     */
    public java.util.List<Whitelist> getWhitelists() {
        return whitelists;
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
        sb.append("WafConfig(");
        sb.append("super=").append(super.toString());
        sb.append("accessRules=").append(String.valueOf(this.accessRules));
        sb.append(", addressRateLimiting=").append(String.valueOf(this.addressRateLimiting));
        sb.append(", captchas=").append(String.valueOf(this.captchas));
        sb.append(", deviceFingerprintChallenge=")
                .append(String.valueOf(this.deviceFingerprintChallenge));
        sb.append(", goodBots=").append(String.valueOf(this.goodBots));
        sb.append(", humanInteractionChallenge=")
                .append(String.valueOf(this.humanInteractionChallenge));
        sb.append(", jsChallenge=").append(String.valueOf(this.jsChallenge));
        sb.append(", origin=").append(String.valueOf(this.origin));
        sb.append(", cachingRules=").append(String.valueOf(this.cachingRules));
        sb.append(", customProtectionRules=").append(String.valueOf(this.customProtectionRules));
        sb.append(", originGroups=").append(String.valueOf(this.originGroups));
        sb.append(", protectionRules=").append(String.valueOf(this.protectionRules));
        sb.append(", protectionSettings=").append(String.valueOf(this.protectionSettings));
        sb.append(", threatFeeds=").append(String.valueOf(this.threatFeeds));
        sb.append(", whitelists=").append(String.valueOf(this.whitelists));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WafConfig)) {
            return false;
        }

        WafConfig other = (WafConfig) o;
        return java.util.Objects.equals(this.accessRules, other.accessRules)
                && java.util.Objects.equals(this.addressRateLimiting, other.addressRateLimiting)
                && java.util.Objects.equals(this.captchas, other.captchas)
                && java.util.Objects.equals(
                        this.deviceFingerprintChallenge, other.deviceFingerprintChallenge)
                && java.util.Objects.equals(this.goodBots, other.goodBots)
                && java.util.Objects.equals(
                        this.humanInteractionChallenge, other.humanInteractionChallenge)
                && java.util.Objects.equals(this.jsChallenge, other.jsChallenge)
                && java.util.Objects.equals(this.origin, other.origin)
                && java.util.Objects.equals(this.cachingRules, other.cachingRules)
                && java.util.Objects.equals(this.customProtectionRules, other.customProtectionRules)
                && java.util.Objects.equals(this.originGroups, other.originGroups)
                && java.util.Objects.equals(this.protectionRules, other.protectionRules)
                && java.util.Objects.equals(this.protectionSettings, other.protectionSettings)
                && java.util.Objects.equals(this.threatFeeds, other.threatFeeds)
                && java.util.Objects.equals(this.whitelists, other.whitelists)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.accessRules == null ? 43 : this.accessRules.hashCode());
        result =
                (result * PRIME)
                        + (this.addressRateLimiting == null
                                ? 43
                                : this.addressRateLimiting.hashCode());
        result = (result * PRIME) + (this.captchas == null ? 43 : this.captchas.hashCode());
        result =
                (result * PRIME)
                        + (this.deviceFingerprintChallenge == null
                                ? 43
                                : this.deviceFingerprintChallenge.hashCode());
        result = (result * PRIME) + (this.goodBots == null ? 43 : this.goodBots.hashCode());
        result =
                (result * PRIME)
                        + (this.humanInteractionChallenge == null
                                ? 43
                                : this.humanInteractionChallenge.hashCode());
        result = (result * PRIME) + (this.jsChallenge == null ? 43 : this.jsChallenge.hashCode());
        result = (result * PRIME) + (this.origin == null ? 43 : this.origin.hashCode());
        result = (result * PRIME) + (this.cachingRules == null ? 43 : this.cachingRules.hashCode());
        result =
                (result * PRIME)
                        + (this.customProtectionRules == null
                                ? 43
                                : this.customProtectionRules.hashCode());
        result = (result * PRIME) + (this.originGroups == null ? 43 : this.originGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionRules == null ? 43 : this.protectionRules.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionSettings == null
                                ? 43
                                : this.protectionSettings.hashCode());
        result = (result * PRIME) + (this.threatFeeds == null ? 43 : this.threatFeeds.hashCode());
        result = (result * PRIME) + (this.whitelists == null ? 43 : this.whitelists.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
