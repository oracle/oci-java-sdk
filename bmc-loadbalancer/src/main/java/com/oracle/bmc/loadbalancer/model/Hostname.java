/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A hostname resource associated with a load balancer for use by one or more listeners.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Hostname.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Hostname {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "hostname"})
    public Hostname(String name, String hostname) {
        super();
        this.name = name;
        this.hostname = hostname;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A friendly name for the hostname resource. It must be unique and it cannot be changed. Avoid entering confidential
         * information.
         * <p>
         * Example: {@code example_hostname_001}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A friendly name for the hostname resource. It must be unique and it cannot be changed. Avoid entering confidential
         * information.
         * <p>
         * Example: {@code example_hostname_001}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A virtual hostname. For more information about virtual hostname string construction, see
         * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm#routing).
         * <p>
         * Example: {@code app.example.com}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * A virtual hostname. For more information about virtual hostname string construction, see
         * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm#routing).
         * <p>
         * Example: {@code app.example.com}
         *
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Hostname build() {
            Hostname __instance__ = new Hostname(name, hostname);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Hostname o) {
            Builder copiedBuilder = name(o.getName()).hostname(o.getHostname());

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
     * A friendly name for the hostname resource. It must be unique and it cannot be changed. Avoid entering confidential
     * information.
     * <p>
     * Example: {@code example_hostname_001}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A friendly name for the hostname resource. It must be unique and it cannot be changed. Avoid entering confidential
     * information.
     * <p>
     * Example: {@code example_hostname_001}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A virtual hostname. For more information about virtual hostname string construction, see
     * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm#routing).
     * <p>
     * Example: {@code app.example.com}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * A virtual hostname. For more information about virtual hostname string construction, see
     * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm#routing).
     * <p>
     * Example: {@code app.example.com}
     *
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Hostname(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Hostname)) {
            return false;
        }

        Hostname other = (Hostname) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
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
