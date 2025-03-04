/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The details of a hostname resource associated with a load balancer. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostnameDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostnameDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "hostname"})
    public HostnameDetails(String name, String hostname) {
        super();
        this.name = name;
        this.hostname = hostname;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the hostname resource.
         *
         * <p>Example: {@code example_hostname_001}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the hostname resource.
         *
         * <p>Example: {@code example_hostname_001}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A virtual hostname. For more information about virtual hostname string construction, see
         * [Managing Request
         * Routing](https://docs.oracle.com/iaas/Content/Balance/Tasks/managingrequest.htm#routing).
         *
         * <p>Example: {@code app.example.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * A virtual hostname. For more information about virtual hostname string construction, see
         * [Managing Request
         * Routing](https://docs.oracle.com/iaas/Content/Balance/Tasks/managingrequest.htm#routing).
         *
         * <p>Example: {@code app.example.com}
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostnameDetails build() {
            HostnameDetails model = new HostnameDetails(this.name, this.hostname);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostnameDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
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

    /**
     * The name of the hostname resource.
     *
     * <p>Example: {@code example_hostname_001}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the hostname resource.
     *
     * <p>Example: {@code example_hostname_001}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * A virtual hostname. For more information about virtual hostname string construction, see
     * [Managing Request
     * Routing](https://docs.oracle.com/iaas/Content/Balance/Tasks/managingrequest.htm#routing).
     *
     * <p>Example: {@code app.example.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * A virtual hostname. For more information about virtual hostname string construction, see
     * [Managing Request
     * Routing](https://docs.oracle.com/iaas/Content/Balance/Tasks/managingrequest.htm#routing).
     *
     * <p>Example: {@code app.example.com}
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
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
        sb.append("HostnameDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostnameDetails)) {
            return false;
        }

        HostnameDetails other = (HostnameDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
