/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateIssuerName.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CertificateIssuerName {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * ISO 3166-1 alpha-2 code of the country where the organization is located. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    String country;

    /**
     * The province where the organization is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stateProvince")
    String stateProvince;

    /**
     * The city in which the organization is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locality")
    String locality;

    /**
     * The organization name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    String organization;

    /**
     * The field to differentiate between divisions within an organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organizationalUnit")
    String organizationalUnit;

    /**
     * The Certificate Authority (CA) name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commonName")
    String commonName;

    /**
     * The email address of the server's administrator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    String emailAddress;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
