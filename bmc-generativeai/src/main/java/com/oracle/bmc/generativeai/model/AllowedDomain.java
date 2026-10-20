/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Hostnames and ports allowed by a sandbox network policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AllowedDomain.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AllowedDomain extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hostnames", "ports"})
    public AllowedDomain(java.util.List<String> hostnames, java.util.List<Integer> ports) {
        super();
        this.hostnames = hostnames;
        this.ports = ports;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Hostnames allowed by this domain rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
        private java.util.List<String> hostnames;

        /**
         * Hostnames allowed by this domain rule.
         *
         * @param hostnames the value to set
         * @return this builder
         */
        public Builder hostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            this.__explicitlySet__.add("hostnames");
            return this;
        }
        /** Ports allowed by this domain rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("ports")
        private java.util.List<Integer> ports;

        /**
         * Ports allowed by this domain rule.
         *
         * @param ports the value to set
         * @return this builder
         */
        public Builder ports(java.util.List<Integer> ports) {
            this.ports = ports;
            this.__explicitlySet__.add("ports");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AllowedDomain build() {
            AllowedDomain model = new AllowedDomain(this.hostnames, this.ports);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowedDomain model) {
            if (model.wasPropertyExplicitlySet("hostnames")) {
                this.hostnames(model.getHostnames());
            }
            if (model.wasPropertyExplicitlySet("ports")) {
                this.ports(model.getPorts());
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

    /** Hostnames allowed by this domain rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
    private final java.util.List<String> hostnames;

    /**
     * Hostnames allowed by this domain rule.
     *
     * @return the value
     */
    public java.util.List<String> getHostnames() {
        return hostnames;
    }

    /** Ports allowed by this domain rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    private final java.util.List<Integer> ports;

    /**
     * Ports allowed by this domain rule.
     *
     * @return the value
     */
    public java.util.List<Integer> getPorts() {
        return ports;
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
        sb.append("AllowedDomain(");
        sb.append("super=").append(super.toString());
        sb.append("hostnames=").append(String.valueOf(this.hostnames));
        sb.append(", ports=").append(String.valueOf(this.ports));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AllowedDomain)) {
            return false;
        }

        AllowedDomain other = (AllowedDomain) o;
        return java.util.Objects.equals(this.hostnames, other.hostnames)
                && java.util.Objects.equals(this.ports, other.ports)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostnames == null ? 43 : this.hostnames.hashCode());
        result = (result * PRIME) + (this.ports == null ? 43 : this.ports.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
