/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Virtual machine related properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VmProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VmProperties extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hypervisorVendor", "hypervisorVersion", "hypervisorHost"})
    public VmProperties(String hypervisorVendor, String hypervisorVersion, String hypervisorHost) {
        super();
        this.hypervisorVendor = hypervisorVendor;
        this.hypervisorVersion = hypervisorVersion;
        this.hypervisorHost = hypervisorHost;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Hypervisor vendor. */
        @com.fasterxml.jackson.annotation.JsonProperty("hypervisorVendor")
        private String hypervisorVendor;

        /**
         * Hypervisor vendor.
         *
         * @param hypervisorVendor the value to set
         * @return this builder
         */
        public Builder hypervisorVendor(String hypervisorVendor) {
            this.hypervisorVendor = hypervisorVendor;
            this.__explicitlySet__.add("hypervisorVendor");
            return this;
        }
        /** Hypervisor version. */
        @com.fasterxml.jackson.annotation.JsonProperty("hypervisorVersion")
        private String hypervisorVersion;

        /**
         * Hypervisor version.
         *
         * @param hypervisorVersion the value to set
         * @return this builder
         */
        public Builder hypervisorVersion(String hypervisorVersion) {
            this.hypervisorVersion = hypervisorVersion;
            this.__explicitlySet__.add("hypervisorVersion");
            return this;
        }
        /** Host name/IP address of VM on which the host is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("hypervisorHost")
        private String hypervisorHost;

        /**
         * Host name/IP address of VM on which the host is running.
         *
         * @param hypervisorHost the value to set
         * @return this builder
         */
        public Builder hypervisorHost(String hypervisorHost) {
            this.hypervisorHost = hypervisorHost;
            this.__explicitlySet__.add("hypervisorHost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmProperties build() {
            VmProperties model =
                    new VmProperties(
                            this.hypervisorVendor, this.hypervisorVersion, this.hypervisorHost);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmProperties model) {
            if (model.wasPropertyExplicitlySet("hypervisorVendor")) {
                this.hypervisorVendor(model.getHypervisorVendor());
            }
            if (model.wasPropertyExplicitlySet("hypervisorVersion")) {
                this.hypervisorVersion(model.getHypervisorVersion());
            }
            if (model.wasPropertyExplicitlySet("hypervisorHost")) {
                this.hypervisorHost(model.getHypervisorHost());
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

    /** Hypervisor vendor. */
    @com.fasterxml.jackson.annotation.JsonProperty("hypervisorVendor")
    private final String hypervisorVendor;

    /**
     * Hypervisor vendor.
     *
     * @return the value
     */
    public String getHypervisorVendor() {
        return hypervisorVendor;
    }

    /** Hypervisor version. */
    @com.fasterxml.jackson.annotation.JsonProperty("hypervisorVersion")
    private final String hypervisorVersion;

    /**
     * Hypervisor version.
     *
     * @return the value
     */
    public String getHypervisorVersion() {
        return hypervisorVersion;
    }

    /** Host name/IP address of VM on which the host is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("hypervisorHost")
    private final String hypervisorHost;

    /**
     * Host name/IP address of VM on which the host is running.
     *
     * @return the value
     */
    public String getHypervisorHost() {
        return hypervisorHost;
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
        sb.append("VmProperties(");
        sb.append("super=").append(super.toString());
        sb.append("hypervisorVendor=").append(String.valueOf(this.hypervisorVendor));
        sb.append(", hypervisorVersion=").append(String.valueOf(this.hypervisorVersion));
        sb.append(", hypervisorHost=").append(String.valueOf(this.hypervisorHost));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmProperties)) {
            return false;
        }

        VmProperties other = (VmProperties) o;
        return java.util.Objects.equals(this.hypervisorVendor, other.hypervisorVendor)
                && java.util.Objects.equals(this.hypervisorVersion, other.hypervisorVersion)
                && java.util.Objects.equals(this.hypervisorHost, other.hypervisorHost)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.hypervisorVendor == null ? 43 : this.hypervisorVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.hypervisorVersion == null ? 43 : this.hypervisorVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.hypervisorHost == null ? 43 : this.hypervisorHost.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
