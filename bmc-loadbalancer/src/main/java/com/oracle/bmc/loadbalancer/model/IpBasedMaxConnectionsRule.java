/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the action of configuring an IP max connection rule which specifies how
 * many connections IPs can make to a listener. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IpBasedMaxConnectionsRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "action")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IpBasedMaxConnectionsRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum number of connections that the any IP can make to a listener unless the IP is
         * mentioned in maxConnections. If no defaultMaxConnections is specified the default is
         * unlimited.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultMaxConnections")
        private Integer defaultMaxConnections;

        /**
         * The maximum number of connections that the any IP can make to a listener unless the IP is
         * mentioned in maxConnections. If no defaultMaxConnections is specified the default is
         * unlimited.
         *
         * @param defaultMaxConnections the value to set
         * @return this builder
         */
        public Builder defaultMaxConnections(Integer defaultMaxConnections) {
            this.defaultMaxConnections = defaultMaxConnections;
            this.__explicitlySet__.add("defaultMaxConnections");
            return this;
        }
        /**
         * An array of IPs that have a maxConnection setting different than the default and what
         * that maxConnection setting is
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipMaxConnections")
        private java.util.List<IpMaxConnections> ipMaxConnections;

        /**
         * An array of IPs that have a maxConnection setting different than the default and what
         * that maxConnection setting is
         *
         * @param ipMaxConnections the value to set
         * @return this builder
         */
        public Builder ipMaxConnections(java.util.List<IpMaxConnections> ipMaxConnections) {
            this.ipMaxConnections = ipMaxConnections;
            this.__explicitlySet__.add("ipMaxConnections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpBasedMaxConnectionsRule build() {
            IpBasedMaxConnectionsRule model =
                    new IpBasedMaxConnectionsRule(
                            this.defaultMaxConnections, this.ipMaxConnections);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpBasedMaxConnectionsRule model) {
            if (model.wasPropertyExplicitlySet("defaultMaxConnections")) {
                this.defaultMaxConnections(model.getDefaultMaxConnections());
            }
            if (model.wasPropertyExplicitlySet("ipMaxConnections")) {
                this.ipMaxConnections(model.getIpMaxConnections());
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

    @Deprecated
    public IpBasedMaxConnectionsRule(
            Integer defaultMaxConnections, java.util.List<IpMaxConnections> ipMaxConnections) {
        super();
        this.defaultMaxConnections = defaultMaxConnections;
        this.ipMaxConnections = ipMaxConnections;
    }

    /**
     * The maximum number of connections that the any IP can make to a listener unless the IP is
     * mentioned in maxConnections. If no defaultMaxConnections is specified the default is
     * unlimited.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMaxConnections")
    private final Integer defaultMaxConnections;

    /**
     * The maximum number of connections that the any IP can make to a listener unless the IP is
     * mentioned in maxConnections. If no defaultMaxConnections is specified the default is
     * unlimited.
     *
     * @return the value
     */
    public Integer getDefaultMaxConnections() {
        return defaultMaxConnections;
    }

    /**
     * An array of IPs that have a maxConnection setting different than the default and what that
     * maxConnection setting is
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipMaxConnections")
    private final java.util.List<IpMaxConnections> ipMaxConnections;

    /**
     * An array of IPs that have a maxConnection setting different than the default and what that
     * maxConnection setting is
     *
     * @return the value
     */
    public java.util.List<IpMaxConnections> getIpMaxConnections() {
        return ipMaxConnections;
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
        sb.append("IpBasedMaxConnectionsRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", defaultMaxConnections=").append(String.valueOf(this.defaultMaxConnections));
        sb.append(", ipMaxConnections=").append(String.valueOf(this.ipMaxConnections));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpBasedMaxConnectionsRule)) {
            return false;
        }

        IpBasedMaxConnectionsRule other = (IpBasedMaxConnectionsRule) o;
        return java.util.Objects.equals(this.defaultMaxConnections, other.defaultMaxConnections)
                && java.util.Objects.equals(this.ipMaxConnections, other.ipMaxConnections)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.defaultMaxConnections == null
                                ? 43
                                : this.defaultMaxConnections.hashCode());
        result =
                (result * PRIME)
                        + (this.ipMaxConnections == null ? 43 : this.ipMaxConnections.hashCode());
        return result;
    }
}
