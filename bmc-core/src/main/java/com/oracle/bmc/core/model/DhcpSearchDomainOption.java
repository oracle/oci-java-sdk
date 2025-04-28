/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * DHCP option for specifying a search domain name for DNS queries. For more information, see [DNS
 * in Your Virtual Cloud Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DhcpSearchDomainOption.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DhcpSearchDomainOption extends DhcpOption {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A single search domain name according to [RFC 952](https://tools.ietf.org/html/rfc952)
         * and [RFC 1123](https://tools.ietf.org/html/rfc1123). During a DNS query, the OS will
         * append this search domain name to the value being queried.
         *
         * <p>If you set {@link DhcpDnsOption} to {@code VcnLocalPlusInternet}, and you assign a DNS
         * label to the VCN during creation, the search domain name in the VCN's default set of DHCP
         * options is automatically set to the VCN domain (for example, {@code vcn1.oraclevcn.com}).
         *
         * <p>If you don't want to use a search domain name, omit this option from the set of DHCP
         * options. Do not include this option with an empty list of search domain names, or with an
         * empty string as the value for any search domain name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("searchDomainNames")
        private java.util.List<String> searchDomainNames;

        /**
         * A single search domain name according to [RFC 952](https://tools.ietf.org/html/rfc952)
         * and [RFC 1123](https://tools.ietf.org/html/rfc1123). During a DNS query, the OS will
         * append this search domain name to the value being queried.
         *
         * <p>If you set {@link DhcpDnsOption} to {@code VcnLocalPlusInternet}, and you assign a DNS
         * label to the VCN during creation, the search domain name in the VCN's default set of DHCP
         * options is automatically set to the VCN domain (for example, {@code vcn1.oraclevcn.com}).
         *
         * <p>If you don't want to use a search domain name, omit this option from the set of DHCP
         * options. Do not include this option with an empty list of search domain names, or with an
         * empty string as the value for any search domain name.
         *
         * @param searchDomainNames the value to set
         * @return this builder
         */
        public Builder searchDomainNames(java.util.List<String> searchDomainNames) {
            this.searchDomainNames = searchDomainNames;
            this.__explicitlySet__.add("searchDomainNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DhcpSearchDomainOption build() {
            DhcpSearchDomainOption model = new DhcpSearchDomainOption(this.searchDomainNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DhcpSearchDomainOption model) {
            if (model.wasPropertyExplicitlySet("searchDomainNames")) {
                this.searchDomainNames(model.getSearchDomainNames());
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
    public DhcpSearchDomainOption(java.util.List<String> searchDomainNames) {
        super();
        this.searchDomainNames = searchDomainNames;
    }

    /**
     * A single search domain name according to [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123). During a DNS query, the OS will append this
     * search domain name to the value being queried.
     *
     * <p>If you set {@link DhcpDnsOption} to {@code VcnLocalPlusInternet}, and you assign a DNS
     * label to the VCN during creation, the search domain name in the VCN's default set of DHCP
     * options is automatically set to the VCN domain (for example, {@code vcn1.oraclevcn.com}).
     *
     * <p>If you don't want to use a search domain name, omit this option from the set of DHCP
     * options. Do not include this option with an empty list of search domain names, or with an
     * empty string as the value for any search domain name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchDomainNames")
    private final java.util.List<String> searchDomainNames;

    /**
     * A single search domain name according to [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123). During a DNS query, the OS will append this
     * search domain name to the value being queried.
     *
     * <p>If you set {@link DhcpDnsOption} to {@code VcnLocalPlusInternet}, and you assign a DNS
     * label to the VCN during creation, the search domain name in the VCN's default set of DHCP
     * options is automatically set to the VCN domain (for example, {@code vcn1.oraclevcn.com}).
     *
     * <p>If you don't want to use a search domain name, omit this option from the set of DHCP
     * options. Do not include this option with an empty list of search domain names, or with an
     * empty string as the value for any search domain name.
     *
     * @return the value
     */
    public java.util.List<String> getSearchDomainNames() {
        return searchDomainNames;
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
        sb.append("DhcpSearchDomainOption(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", searchDomainNames=").append(String.valueOf(this.searchDomainNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DhcpSearchDomainOption)) {
            return false;
        }

        DhcpSearchDomainOption other = (DhcpSearchDomainOption) o;
        return java.util.Objects.equals(this.searchDomainNames, other.searchDomainNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.searchDomainNames == null ? 43 : this.searchDomainNames.hashCode());
        return result;
    }
}
