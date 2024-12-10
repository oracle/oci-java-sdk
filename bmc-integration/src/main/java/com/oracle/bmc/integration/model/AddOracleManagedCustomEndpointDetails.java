/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Details for enabling Oracle Managed custom endpoint
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddOracleManagedCustomEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddOracleManagedCustomEndpointDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hostname", "dnsType", "dnsZoneName"})
    public AddOracleManagedCustomEndpointDetails(
            String hostname, DnsType dnsType, String dnsZoneName) {
        super();
        this.hostname = hostname;
        this.dnsType = dnsType;
        this.dnsZoneName = dnsZoneName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Oracle managed custom hostname
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * Oracle managed custom hostname
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * Type of DNS.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsType")
        private DnsType dnsType;

        /**
         * Type of DNS.
         * @param dnsType the value to set
         * @return this builder
         **/
        public Builder dnsType(DnsType dnsType) {
            this.dnsType = dnsType;
            this.__explicitlySet__.add("dnsType");
            return this;
        }
        /**
         * DNS Zone name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsZoneName")
        private String dnsZoneName;

        /**
         * DNS Zone name
         * @param dnsZoneName the value to set
         * @return this builder
         **/
        public Builder dnsZoneName(String dnsZoneName) {
            this.dnsZoneName = dnsZoneName;
            this.__explicitlySet__.add("dnsZoneName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddOracleManagedCustomEndpointDetails build() {
            AddOracleManagedCustomEndpointDetails model =
                    new AddOracleManagedCustomEndpointDetails(
                            this.hostname, this.dnsType, this.dnsZoneName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddOracleManagedCustomEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("dnsType")) {
                this.dnsType(model.getDnsType());
            }
            if (model.wasPropertyExplicitlySet("dnsZoneName")) {
                this.dnsZoneName(model.getDnsZoneName());
            }
            return this;
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
     * Oracle managed custom hostname
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * Oracle managed custom hostname
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * Type of DNS.
     **/
    public enum DnsType {
        Oci("OCI"),
        ;

        private final String value;
        private static java.util.Map<String, DnsType> map;

        static {
            map = new java.util.HashMap<>();
            for (DnsType v : DnsType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DnsType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DnsType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DnsType: " + key);
        }
    };
    /**
     * Type of DNS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsType")
    private final DnsType dnsType;

    /**
     * Type of DNS.
     * @return the value
     **/
    public DnsType getDnsType() {
        return dnsType;
    }

    /**
     * DNS Zone name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsZoneName")
    private final String dnsZoneName;

    /**
     * DNS Zone name
     * @return the value
     **/
    public String getDnsZoneName() {
        return dnsZoneName;
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
        sb.append("AddOracleManagedCustomEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hostname=").append(String.valueOf(this.hostname));
        sb.append(", dnsType=").append(String.valueOf(this.dnsType));
        sb.append(", dnsZoneName=").append(String.valueOf(this.dnsZoneName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddOracleManagedCustomEndpointDetails)) {
            return false;
        }

        AddOracleManagedCustomEndpointDetails other = (AddOracleManagedCustomEndpointDetails) o;
        return java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.dnsType, other.dnsType)
                && java.util.Objects.equals(this.dnsZoneName, other.dnsZoneName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.dnsType == null ? 43 : this.dnsType.hashCode());
        result = (result * PRIME) + (this.dnsZoneName == null ? 43 : this.dnsZoneName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
