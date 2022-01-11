/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Public endpoint configuration details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PublicEndpointDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "networkEndpointType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PublicEndpointDetails extends NetworkEndpointDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpIps")
        private java.util.List<String> allowlistedHttpIps;

        public Builder allowlistedHttpIps(java.util.List<String> allowlistedHttpIps) {
            this.allowlistedHttpIps = allowlistedHttpIps;
            this.__explicitlySet__.add("allowlistedHttpIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpVcns")
        private java.util.List<VirtualCloudNetwork> allowlistedHttpVcns;

        public Builder allowlistedHttpVcns(
                java.util.List<VirtualCloudNetwork> allowlistedHttpVcns) {
            this.allowlistedHttpVcns = allowlistedHttpVcns;
            this.__explicitlySet__.add("allowlistedHttpVcns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIntegrationVcnAllowlisted")
        private Boolean isIntegrationVcnAllowlisted;

        public Builder isIntegrationVcnAllowlisted(Boolean isIntegrationVcnAllowlisted) {
            this.isIntegrationVcnAllowlisted = isIntegrationVcnAllowlisted;
            this.__explicitlySet__.add("isIntegrationVcnAllowlisted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PublicEndpointDetails build() {
            PublicEndpointDetails __instance__ =
                    new PublicEndpointDetails(
                            allowlistedHttpIps, allowlistedHttpVcns, isIntegrationVcnAllowlisted);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublicEndpointDetails o) {
            Builder copiedBuilder =
                    allowlistedHttpIps(o.getAllowlistedHttpIps())
                            .allowlistedHttpVcns(o.getAllowlistedHttpVcns())
                            .isIntegrationVcnAllowlisted(o.getIsIntegrationVcnAllowlisted());

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
    public PublicEndpointDetails(
            java.util.List<String> allowlistedHttpIps,
            java.util.List<VirtualCloudNetwork> allowlistedHttpVcns,
            Boolean isIntegrationVcnAllowlisted) {
        super();
        this.allowlistedHttpIps = allowlistedHttpIps;
        this.allowlistedHttpVcns = allowlistedHttpVcns;
        this.isIntegrationVcnAllowlisted = isIntegrationVcnAllowlisted;
    }

    /**
     * Source IP addresses or IP address ranges ingress rules.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpIps")
    java.util.List<String> allowlistedHttpIps;

    /**
     * Virtual Cloud Networks allowed to access this network endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowlistedHttpVcns")
    java.util.List<VirtualCloudNetwork> allowlistedHttpVcns;

    /**
     * The Integration service's VCN is allow-listed to allow integrations to call back into other integrations
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIntegrationVcnAllowlisted")
    Boolean isIntegrationVcnAllowlisted;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
