/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Details for a custom endpoint for the integration instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CustomEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CustomEndpointDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateSecretId")
        private String certificateSecretId;

        public Builder certificateSecretId(String certificateSecretId) {
            this.certificateSecretId = certificateSecretId;
            this.__explicitlySet__.add("certificateSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateSecretVersion")
        private Integer certificateSecretVersion;

        public Builder certificateSecretVersion(Integer certificateSecretVersion) {
            this.certificateSecretVersion = certificateSecretVersion;
            this.__explicitlySet__.add("certificateSecretVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomEndpointDetails build() {
            CustomEndpointDetails __instance__ =
                    new CustomEndpointDetails(
                            hostname, certificateSecretId, certificateSecretVersion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomEndpointDetails o) {
            Builder copiedBuilder =
                    hostname(o.getHostname())
                            .certificateSecretId(o.getCertificateSecretId())
                            .certificateSecretVersion(o.getCertificateSecretVersion());

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
     * A custom hostname to be used for the integration instance URL, in FQDN format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    /**
     * Optional OCID of a vault/secret containing a private SSL certificate bundle to be used for the custom hostname.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateSecretId")
    String certificateSecretId;

    /**
     * The secret version used for the certificate-secret-id (if certificate-secret-id is specified).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateSecretVersion")
    Integer certificateSecretVersion;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
