/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Configuration details for the BROWSER monitor type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BrowserMonitorConfiguration.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BrowserMonitorConfiguration extends MonitorConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
        private Boolean isFailureRetried;

        public Builder isFailureRetried(Boolean isFailureRetried) {
            this.isFailureRetried = isFailureRetried;
            this.__explicitlySet__.add("isFailureRetried");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCertificateValidationEnabled")
        private Boolean isCertificateValidationEnabled;

        public Builder isCertificateValidationEnabled(Boolean isCertificateValidationEnabled) {
            this.isCertificateValidationEnabled = isCertificateValidationEnabled;
            this.__explicitlySet__.add("isCertificateValidationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("verifyTexts")
        private java.util.List<VerifyText> verifyTexts;

        public Builder verifyTexts(java.util.List<VerifyText> verifyTexts) {
            this.verifyTexts = verifyTexts;
            this.__explicitlySet__.add("verifyTexts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BrowserMonitorConfiguration build() {
            BrowserMonitorConfiguration __instance__ =
                    new BrowserMonitorConfiguration(
                            isFailureRetried, isCertificateValidationEnabled, verifyTexts);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BrowserMonitorConfiguration o) {
            Builder copiedBuilder =
                    isFailureRetried(o.getIsFailureRetried())
                            .isCertificateValidationEnabled(o.getIsCertificateValidationEnabled())
                            .verifyTexts(o.getVerifyTexts());

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

    @Deprecated
    public BrowserMonitorConfiguration(
            Boolean isFailureRetried,
            Boolean isCertificateValidationEnabled,
            java.util.List<VerifyText> verifyTexts) {
        super(isFailureRetried);
        this.isCertificateValidationEnabled = isCertificateValidationEnabled;
        this.verifyTexts = verifyTexts;
    }

    /**
     * If certificate validation is enabled, then the call will fail in case of certification errors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCertificateValidationEnabled")
    Boolean isCertificateValidationEnabled;

    /**
     * Verify all the search strings present in response.
     * If any search string is not present in the response, then it will be considered as a failure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyTexts")
    java.util.List<VerifyText> verifyTexts;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
