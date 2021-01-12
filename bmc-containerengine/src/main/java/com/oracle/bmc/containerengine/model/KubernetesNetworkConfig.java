/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define the network configuration for Kubernetes.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = KubernetesNetworkConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class KubernetesNetworkConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("podsCidr")
        private String podsCidr;

        public Builder podsCidr(String podsCidr) {
            this.podsCidr = podsCidr;
            this.__explicitlySet__.add("podsCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("servicesCidr")
        private String servicesCidr;

        public Builder servicesCidr(String servicesCidr) {
            this.servicesCidr = servicesCidr;
            this.__explicitlySet__.add("servicesCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KubernetesNetworkConfig build() {
            KubernetesNetworkConfig __instance__ =
                    new KubernetesNetworkConfig(podsCidr, servicesCidr);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KubernetesNetworkConfig o) {
            Builder copiedBuilder = podsCidr(o.getPodsCidr()).servicesCidr(o.getServicesCidr());

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
     * The CIDR block for Kubernetes pods.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("podsCidr")
    String podsCidr;

    /**
     * The CIDR block for Kubernetes services.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("servicesCidr")
    String servicesCidr;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
