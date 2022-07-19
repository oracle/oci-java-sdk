/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * TCP Application used on the firewall policy rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TcpApplication.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TcpApplication extends Application {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The minimum port in the range (inclusive), or the sole port of a single-port range.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minimumPort")
        private Integer minimumPort;

        /**
         * The minimum port in the range (inclusive), or the sole port of a single-port range.
         * @param minimumPort the value to set
         * @return this builder
         **/
        public Builder minimumPort(Integer minimumPort) {
            this.minimumPort = minimumPort;
            this.__explicitlySet__.add("minimumPort");
            return this;
        }
        /**
         * The maximum port in the range (inclusive), which may be absent for a single-port range.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maximumPort")
        private Integer maximumPort;

        /**
         * The maximum port in the range (inclusive), which may be absent for a single-port range.
         * @param maximumPort the value to set
         * @return this builder
         **/
        public Builder maximumPort(Integer maximumPort) {
            this.maximumPort = maximumPort;
            this.__explicitlySet__.add("maximumPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TcpApplication build() {
            TcpApplication __instance__ = new TcpApplication(minimumPort, maximumPort);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TcpApplication o) {
            Builder copiedBuilder = minimumPort(o.getMinimumPort()).maximumPort(o.getMaximumPort());

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

    @Deprecated
    public TcpApplication(Integer minimumPort, Integer maximumPort) {
        super();
        this.minimumPort = minimumPort;
        this.maximumPort = maximumPort;
    }

    /**
     * The minimum port in the range (inclusive), or the sole port of a single-port range.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimumPort")
    private final Integer minimumPort;

    /**
     * The minimum port in the range (inclusive), or the sole port of a single-port range.
     * @return the value
     **/
    public Integer getMinimumPort() {
        return minimumPort;
    }

    /**
     * The maximum port in the range (inclusive), which may be absent for a single-port range.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumPort")
    private final Integer maximumPort;

    /**
     * The maximum port in the range (inclusive), which may be absent for a single-port range.
     * @return the value
     **/
    public Integer getMaximumPort() {
        return maximumPort;
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
        sb.append("TcpApplication(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", minimumPort=").append(String.valueOf(this.minimumPort));
        sb.append(", maximumPort=").append(String.valueOf(this.maximumPort));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TcpApplication)) {
            return false;
        }

        TcpApplication other = (TcpApplication) o;
        return java.util.Objects.equals(this.minimumPort, other.minimumPort)
                && java.util.Objects.equals(this.maximumPort, other.maximumPort)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.minimumPort == null ? 43 : this.minimumPort.hashCode());
        result = (result * PRIME) + (this.maximumPort == null ? 43 : this.maximumPort.hashCode());
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
