/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * The configuration details for the WAAS policy.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PolicyConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class PolicyConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHttpsEnabled")
        private Boolean isHttpsEnabled;

        public Builder isHttpsEnabled(Boolean isHttpsEnabled) {
            this.isHttpsEnabled = isHttpsEnabled;
            this.__explicitlySet__.add("isHttpsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHttpsForced")
        private Boolean isHttpsForced;

        public Builder isHttpsForced(Boolean isHttpsForced) {
            this.isHttpsForced = isHttpsForced;
            this.__explicitlySet__.add("isHttpsForced");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PolicyConfig build() {
            PolicyConfig __instance__ =
                    new PolicyConfig(certificateId, isHttpsEnabled, isHttpsForced);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PolicyConfig o) {
            Builder copiedBuilder =
                    certificateId(o.getCertificateId())
                            .isHttpsEnabled(o.getIsHttpsEnabled())
                            .isHttpsForced(o.getIsHttpsForced());

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
     * The OCID of the SSL certificate to use if HTTPS is supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    String certificateId;

    /**
     * Enable or disable HTTPS support. If true, a `certificateId` is required. If unspecified, defaults to `false`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHttpsEnabled")
    Boolean isHttpsEnabled;

    /**
     * Force HTTP to HTTPS redirection. If unspecified, defaults to `false`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHttpsForced")
    Boolean isHttpsForced;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
