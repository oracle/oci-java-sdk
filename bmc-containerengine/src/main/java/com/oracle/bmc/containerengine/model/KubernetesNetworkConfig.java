/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define the network configuration for Kubernetes. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KubernetesNetworkConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KubernetesNetworkConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"podsCidr", "servicesCidr"})
    public KubernetesNetworkConfig(String podsCidr, String servicesCidr) {
        super();
        this.podsCidr = podsCidr;
        this.servicesCidr = servicesCidr;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16. */
        @com.fasterxml.jackson.annotation.JsonProperty("podsCidr")
        private String podsCidr;

        /**
         * The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16.
         *
         * @param podsCidr the value to set
         * @return this builder
         */
        public Builder podsCidr(String podsCidr) {
            this.podsCidr = podsCidr;
            this.__explicitlySet__.add("podsCidr");
            return this;
        }
        /** The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16. */
        @com.fasterxml.jackson.annotation.JsonProperty("servicesCidr")
        private String servicesCidr;

        /**
         * The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16.
         *
         * @param servicesCidr the value to set
         * @return this builder
         */
        public Builder servicesCidr(String servicesCidr) {
            this.servicesCidr = servicesCidr;
            this.__explicitlySet__.add("servicesCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KubernetesNetworkConfig build() {
            KubernetesNetworkConfig model =
                    new KubernetesNetworkConfig(this.podsCidr, this.servicesCidr);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KubernetesNetworkConfig model) {
            if (model.wasPropertyExplicitlySet("podsCidr")) {
                this.podsCidr(model.getPodsCidr());
            }
            if (model.wasPropertyExplicitlySet("servicesCidr")) {
                this.servicesCidr(model.getServicesCidr());
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

    /** The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16. */
    @com.fasterxml.jackson.annotation.JsonProperty("podsCidr")
    private final String podsCidr;

    /**
     * The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16.
     *
     * @return the value
     */
    public String getPodsCidr() {
        return podsCidr;
    }

    /** The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16. */
    @com.fasterxml.jackson.annotation.JsonProperty("servicesCidr")
    private final String servicesCidr;

    /**
     * The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16.
     *
     * @return the value
     */
    public String getServicesCidr() {
        return servicesCidr;
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
        sb.append("KubernetesNetworkConfig(");
        sb.append("super=").append(super.toString());
        sb.append("podsCidr=").append(String.valueOf(this.podsCidr));
        sb.append(", servicesCidr=").append(String.valueOf(this.servicesCidr));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.podsCidr == null ? 43 : this.podsCidr.hashCode());
        result = (result * PRIME) + (this.servicesCidr == null ? 43 : this.servicesCidr.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
