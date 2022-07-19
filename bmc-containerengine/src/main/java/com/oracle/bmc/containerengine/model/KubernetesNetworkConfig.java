/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = KubernetesNetworkConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KubernetesNetworkConfig {
    @Deprecated
    @java.beans.ConstructorProperties({"podsCidr", "servicesCidr"})
    public KubernetesNetworkConfig(String podsCidr, String servicesCidr) {
        super();
        this.podsCidr = podsCidr;
        this.servicesCidr = servicesCidr;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("podsCidr")
        private String podsCidr;

        /**
         * The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16.
         * @param podsCidr the value to set
         * @return this builder
         **/
        public Builder podsCidr(String podsCidr) {
            this.podsCidr = podsCidr;
            this.__explicitlySet__.add("podsCidr");
            return this;
        }
        /**
         * The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("servicesCidr")
        private String servicesCidr;

        /**
         * The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16.
         * @param servicesCidr the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("podsCidr")
    private final String podsCidr;

    /**
     * The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16.
     * @return the value
     **/
    public String getPodsCidr() {
        return podsCidr;
    }

    /**
     * The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("servicesCidr")
    private final String servicesCidr;

    /**
     * The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16.
     * @return the value
     **/
    public String getServicesCidr() {
        return servicesCidr;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("KubernetesNetworkConfig(");
        sb.append("podsCidr=").append(String.valueOf(this.podsCidr));
        sb.append(", servicesCidr=").append(String.valueOf(this.servicesCidr));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KubernetesNetworkConfig)) {
            return false;
        }

        KubernetesNetworkConfig other = (KubernetesNetworkConfig) o;
        return java.util.Objects.equals(this.podsCidr, other.podsCidr)
                && java.util.Objects.equals(this.servicesCidr, other.servicesCidr)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.podsCidr == null ? 43 : this.podsCidr.hashCode());
        result = (result * PRIME) + (this.servicesCidr == null ? 43 : this.servicesCidr.hashCode());
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
