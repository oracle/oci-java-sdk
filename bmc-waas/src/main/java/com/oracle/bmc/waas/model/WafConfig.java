/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * The Web Application Firewall configuration for the WAAS policy.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WafConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WafConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("accessRules")
        private java.util.List<AccessRule> accessRules;

        public Builder accessRules(java.util.List<AccessRule> accessRules) {
            this.accessRules = accessRules;
            this.__explicitlySet__.add("accessRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addressRateLimiting")
        private AddressRateLimiting addressRateLimiting;

        public Builder addressRateLimiting(AddressRateLimiting addressRateLimiting) {
            this.addressRateLimiting = addressRateLimiting;
            this.__explicitlySet__.add("addressRateLimiting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchas")
        private java.util.List<Captcha> captchas;

        public Builder captchas(java.util.List<Captcha> captchas) {
            this.captchas = captchas;
            this.__explicitlySet__.add("captchas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deviceFingerprintChallenge")
        private DeviceFingerprintChallenge deviceFingerprintChallenge;

        public Builder deviceFingerprintChallenge(
                DeviceFingerprintChallenge deviceFingerprintChallenge) {
            this.deviceFingerprintChallenge = deviceFingerprintChallenge;
            this.__explicitlySet__.add("deviceFingerprintChallenge");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("goodBots")
        private java.util.List<GoodBot> goodBots;

        public Builder goodBots(java.util.List<GoodBot> goodBots) {
            this.goodBots = goodBots;
            this.__explicitlySet__.add("goodBots");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("humanInteractionChallenge")
        private HumanInteractionChallenge humanInteractionChallenge;

        public Builder humanInteractionChallenge(
                HumanInteractionChallenge humanInteractionChallenge) {
            this.humanInteractionChallenge = humanInteractionChallenge;
            this.__explicitlySet__.add("humanInteractionChallenge");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jsChallenge")
        private JsChallenge jsChallenge;

        public Builder jsChallenge(JsChallenge jsChallenge) {
            this.jsChallenge = jsChallenge;
            this.__explicitlySet__.add("jsChallenge");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("origin")
        private String origin;

        public Builder origin(String origin) {
            this.origin = origin;
            this.__explicitlySet__.add("origin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cachingRules")
        private java.util.List<CachingRule> cachingRules;

        public Builder cachingRules(java.util.List<CachingRule> cachingRules) {
            this.cachingRules = cachingRules;
            this.__explicitlySet__.add("cachingRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customProtectionRules")
        private java.util.List<CustomProtectionRuleSetting> customProtectionRules;

        public Builder customProtectionRules(
                java.util.List<CustomProtectionRuleSetting> customProtectionRules) {
            this.customProtectionRules = customProtectionRules;
            this.__explicitlySet__.add("customProtectionRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originGroups")
        private java.util.List<String> originGroups;

        public Builder originGroups(java.util.List<String> originGroups) {
            this.originGroups = originGroups;
            this.__explicitlySet__.add("originGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionRules")
        private java.util.List<ProtectionRule> protectionRules;

        public Builder protectionRules(java.util.List<ProtectionRule> protectionRules) {
            this.protectionRules = protectionRules;
            this.__explicitlySet__.add("protectionRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionSettings")
        private ProtectionSettings protectionSettings;

        public Builder protectionSettings(ProtectionSettings protectionSettings) {
            this.protectionSettings = protectionSettings;
            this.__explicitlySet__.add("protectionSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("threatFeeds")
        private java.util.List<ThreatFeed> threatFeeds;

        public Builder threatFeeds(java.util.List<ThreatFeed> threatFeeds) {
            this.threatFeeds = threatFeeds;
            this.__explicitlySet__.add("threatFeeds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("whitelists")
        private java.util.List<Whitelist> whitelists;

        public Builder whitelists(java.util.List<Whitelist> whitelists) {
            this.whitelists = whitelists;
            this.__explicitlySet__.add("whitelists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WafConfig build() {
            WafConfig __instance__ =
                    new WafConfig(
                            accessRules,
                            addressRateLimiting,
                            captchas,
                            deviceFingerprintChallenge,
                            goodBots,
                            humanInteractionChallenge,
                            jsChallenge,
                            origin,
                            cachingRules,
                            customProtectionRules,
                            originGroups,
                            protectionRules,
                            protectionSettings,
                            threatFeeds,
                            whitelists);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WafConfig o) {
            Builder copiedBuilder =
                    accessRules(o.getAccessRules())
                            .addressRateLimiting(o.getAddressRateLimiting())
                            .captchas(o.getCaptchas())
                            .deviceFingerprintChallenge(o.getDeviceFingerprintChallenge())
                            .goodBots(o.getGoodBots())
                            .humanInteractionChallenge(o.getHumanInteractionChallenge())
                            .jsChallenge(o.getJsChallenge())
                            .origin(o.getOrigin())
                            .cachingRules(o.getCachingRules())
                            .customProtectionRules(o.getCustomProtectionRules())
                            .originGroups(o.getOriginGroups())
                            .protectionRules(o.getProtectionRules())
                            .protectionSettings(o.getProtectionSettings())
                            .threatFeeds(o.getThreatFeeds())
                            .whitelists(o.getWhitelists());

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
     * The access rules applied to the Web Application Firewall. Used for defining custom access policies with the combination of `ALLOW`, `DETECT`, and `BLOCK` rules, based on different criteria.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessRules")
    java.util.List<AccessRule> accessRules;

    /**
     * The IP address rate limiting settings used to limit the number of requests from an address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressRateLimiting")
    AddressRateLimiting addressRateLimiting;

    /**
     * A list of CAPTCHA challenge settings. These are used to challenge requests with a CAPTCHA to block bots.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchas")
    java.util.List<Captcha> captchas;

    /**
     * The device fingerprint challenge settings. Used to detect unique devices based on the device fingerprint information collected in order to block bots.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deviceFingerprintChallenge")
    DeviceFingerprintChallenge deviceFingerprintChallenge;

    /**
     * A list of bots allowed to access the web application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("goodBots")
    java.util.List<GoodBot> goodBots;

    /**
     * The human interaction challenge settings. Used to look for natural human interactions such as mouse movements, time on site, and page scrolling to identify bots.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("humanInteractionChallenge")
    HumanInteractionChallenge humanInteractionChallenge;

    /**
     * The JavaScript challenge settings. Used to challenge requests with a JavaScript challenge and take the action if a browser has no JavaScript support in order to block bots.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jsChallenge")
    JsChallenge jsChallenge;

    /**
     * The key in the map of origins referencing the origin used for the Web Application Firewall. The origin must already be included in `Origins`. Required when creating the `WafConfig` resource, but not on update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    String origin;

    /**
     * A list of caching rules applied to the web application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cachingRules")
    java.util.List<CachingRule> cachingRules;

    /**
     * A list of the custom protection rule OCIDs and their actions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customProtectionRules")
    java.util.List<CustomProtectionRuleSetting> customProtectionRules;

    /**
     * The list of origin group references that provide support for additional origin servers. A list of combined unique origin servers from `origin` and `originGroups` will be used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originGroups")
    java.util.List<String> originGroups;

    /**
     * A list of the protection rules and their details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionRules")
    java.util.List<ProtectionRule> protectionRules;

    /**
     * The settings to apply to protection rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionSettings")
    ProtectionSettings protectionSettings;

    /**
     * A list of threat intelligence feeds and the actions to apply to known malicious traffic based on internet intelligence.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threatFeeds")
    java.util.List<ThreatFeed> threatFeeds;

    /**
     * A list of IP addresses that bypass the Web Application Firewall.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("whitelists")
    java.util.List<Whitelist> whitelists;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
