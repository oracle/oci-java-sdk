/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Private source DNS Zone model.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PrivateSourceDnsZone.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PrivateSourceDnsZone {
    @Deprecated
    @java.beans.ConstructorProperties({"dnsZone", "description"})
    public PrivateSourceDnsZone(String dnsZone, String description) {
        super();
        this.dnsZone = dnsZone;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Private Source DNS Zone. Ex: example-vcn.oraclevcn.com, corp.example.com.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsZone")
        private String dnsZone;

        /**
         * Private Source DNS Zone. Ex: example-vcn.oraclevcn.com, corp.example.com.
         *
         * @param dnsZone the value to set
         * @return this builder
         **/
        public Builder dnsZone(String dnsZone) {
            this.dnsZone = dnsZone;
            this.__explicitlySet__.add("dnsZone");
            return this;
        }
        /**
         * Description of private source dns zone.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of private source dns zone.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateSourceDnsZone build() {
            PrivateSourceDnsZone __instance__ = new PrivateSourceDnsZone(dnsZone, description);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateSourceDnsZone o) {
            Builder copiedBuilder = dnsZone(o.getDnsZone()).description(o.getDescription());

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
     * Private Source DNS Zone. Ex: example-vcn.oraclevcn.com, corp.example.com.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsZone")
    private final String dnsZone;

    /**
     * Private Source DNS Zone. Ex: example-vcn.oraclevcn.com, corp.example.com.
     *
     * @return the value
     **/
    public String getDnsZone() {
        return dnsZone;
    }

    /**
     * Description of private source dns zone.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of private source dns zone.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
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
        sb.append("PrivateSourceDnsZone(");
        sb.append("dnsZone=").append(String.valueOf(this.dnsZone));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateSourceDnsZone)) {
            return false;
        }

        PrivateSourceDnsZone other = (PrivateSourceDnsZone) o;
        return java.util.Objects.equals(this.dnsZone, other.dnsZone)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dnsZone == null ? 43 : this.dnsZone.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
