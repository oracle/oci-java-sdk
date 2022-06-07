/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The issuer of the certificate.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateIssuerName.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CertificateIssuerName {
    @Deprecated
    @java.beans.ConstructorProperties({
        "country",
        "stateProvince",
        "locality",
        "organization",
        "organizationalUnit",
        "commonName",
        "emailAddress"
    })
    public CertificateIssuerName(
            String country,
            String stateProvince,
            String locality,
            String organization,
            String organizationalUnit,
            String commonName,
            String emailAddress) {
        super();
        this.country = country;
        this.stateProvince = stateProvince;
        this.locality = locality;
        this.organization = organization;
        this.organizationalUnit = organizationalUnit;
        this.commonName = commonName;
        this.emailAddress = emailAddress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stateProvince")
        private String stateProvince;

        public Builder stateProvince(String stateProvince) {
            this.stateProvince = stateProvince;
            this.__explicitlySet__.add("stateProvince");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locality")
        private String locality;

        public Builder locality(String locality) {
            this.locality = locality;
            this.__explicitlySet__.add("locality");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        private String organization;

        public Builder organization(String organization) {
            this.organization = organization;
            this.__explicitlySet__.add("organization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("organizationalUnit")
        private String organizationalUnit;

        public Builder organizationalUnit(String organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            this.__explicitlySet__.add("organizationalUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commonName")
        private String commonName;

        public Builder commonName(String commonName) {
            this.commonName = commonName;
            this.__explicitlySet__.add("commonName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateIssuerName build() {
            CertificateIssuerName __instance__ =
                    new CertificateIssuerName(
                            country,
                            stateProvince,
                            locality,
                            organization,
                            organizationalUnit,
                            commonName,
                            emailAddress);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateIssuerName o) {
            Builder copiedBuilder =
                    country(o.getCountry())
                            .stateProvince(o.getStateProvince())
                            .locality(o.getLocality())
                            .organization(o.getOrganization())
                            .organizationalUnit(o.getOrganizationalUnit())
                            .commonName(o.getCommonName())
                            .emailAddress(o.getEmailAddress());

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
     * ISO 3166-1 alpha-2 code of the country where the organization is located. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    public String getCountry() {
        return country;
    }

    /**
     * The province where the organization is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stateProvince")
    private final String stateProvince;

    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * The city in which the organization is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locality")
    private final String locality;

    public String getLocality() {
        return locality;
    }

    /**
     * The organization name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    private final String organization;

    public String getOrganization() {
        return organization;
    }

    /**
     * The field to differentiate between divisions within an organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organizationalUnit")
    private final String organizationalUnit;

    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    /**
     * The Certificate Authority (CA) name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commonName")
    private final String commonName;

    public String getCommonName() {
        return commonName;
    }

    /**
     * The email address of the server's administrator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    private final String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CertificateIssuerName(");
        sb.append("country=").append(String.valueOf(this.country));
        sb.append(", stateProvince=").append(String.valueOf(this.stateProvince));
        sb.append(", locality=").append(String.valueOf(this.locality));
        sb.append(", organization=").append(String.valueOf(this.organization));
        sb.append(", organizationalUnit=").append(String.valueOf(this.organizationalUnit));
        sb.append(", commonName=").append(String.valueOf(this.commonName));
        sb.append(", emailAddress=").append(String.valueOf(this.emailAddress));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateIssuerName)) {
            return false;
        }

        CertificateIssuerName other = (CertificateIssuerName) o;
        return java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.stateProvince, other.stateProvince)
                && java.util.Objects.equals(this.locality, other.locality)
                && java.util.Objects.equals(this.organization, other.organization)
                && java.util.Objects.equals(this.organizationalUnit, other.organizationalUnit)
                && java.util.Objects.equals(this.commonName, other.commonName)
                && java.util.Objects.equals(this.emailAddress, other.emailAddress)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result =
                (result * PRIME)
                        + (this.stateProvince == null ? 43 : this.stateProvince.hashCode());
        result = (result * PRIME) + (this.locality == null ? 43 : this.locality.hashCode());
        result = (result * PRIME) + (this.organization == null ? 43 : this.organization.hashCode());
        result =
                (result * PRIME)
                        + (this.organizationalUnit == null
                                ? 43
                                : this.organizationalUnit.hashCode());
        result = (result * PRIME) + (this.commonName == null ? 43 : this.commonName.hashCode());
        result = (result * PRIME) + (this.emailAddress == null ? 43 : this.emailAddress.hashCode());
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
