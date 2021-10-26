/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The subject of the certificate, which is a distinguished name that identifies the entity that owns the public key in the certificate.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateSubject.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CertificateSubject {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("commonName")
        private String commonName;

        public Builder commonName(String commonName) {
            this.commonName = commonName;
            this.__explicitlySet__.add("commonName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainComponent")
        private String domainComponent;

        public Builder domainComponent(String domainComponent) {
            this.domainComponent = domainComponent;
            this.__explicitlySet__.add("domainComponent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("distinguishedNameQualifier")
        private String distinguishedNameQualifier;

        public Builder distinguishedNameQualifier(String distinguishedNameQualifier) {
            this.distinguishedNameQualifier = distinguishedNameQualifier;
            this.__explicitlySet__.add("distinguishedNameQualifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("generationQualifier")
        private String generationQualifier;

        public Builder generationQualifier(String generationQualifier) {
            this.generationQualifier = generationQualifier;
            this.__explicitlySet__.add("generationQualifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("givenName")
        private String givenName;

        public Builder givenName(String givenName) {
            this.givenName = givenName;
            this.__explicitlySet__.add("givenName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initials")
        private String initials;

        public Builder initials(String initials) {
            this.initials = initials;
            this.__explicitlySet__.add("initials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localityName")
        private String localityName;

        public Builder localityName(String localityName) {
            this.localityName = localityName;
            this.__explicitlySet__.add("localityName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("pseudonym")
        private String pseudonym;

        public Builder pseudonym(String pseudonym) {
            this.pseudonym = pseudonym;
            this.__explicitlySet__.add("pseudonym");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stateOrProvinceName")
        private String stateOrProvinceName;

        public Builder stateOrProvinceName(String stateOrProvinceName) {
            this.stateOrProvinceName = stateOrProvinceName;
            this.__explicitlySet__.add("stateOrProvinceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("street")
        private String street;

        public Builder street(String street) {
            this.street = street;
            this.__explicitlySet__.add("street");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("surname")
        private String surname;

        public Builder surname(String surname) {
            this.surname = surname;
            this.__explicitlySet__.add("surname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateSubject build() {
            CertificateSubject __instance__ =
                    new CertificateSubject(
                            commonName,
                            country,
                            domainComponent,
                            distinguishedNameQualifier,
                            generationQualifier,
                            givenName,
                            initials,
                            localityName,
                            organization,
                            organizationalUnit,
                            pseudonym,
                            serialNumber,
                            stateOrProvinceName,
                            street,
                            surname,
                            title,
                            userId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateSubject o) {
            Builder copiedBuilder =
                    commonName(o.getCommonName())
                            .country(o.getCountry())
                            .domainComponent(o.getDomainComponent())
                            .distinguishedNameQualifier(o.getDistinguishedNameQualifier())
                            .generationQualifier(o.getGenerationQualifier())
                            .givenName(o.getGivenName())
                            .initials(o.getInitials())
                            .localityName(o.getLocalityName())
                            .organization(o.getOrganization())
                            .organizationalUnit(o.getOrganizationalUnit())
                            .pseudonym(o.getPseudonym())
                            .serialNumber(o.getSerialNumber())
                            .stateOrProvinceName(o.getStateOrProvinceName())
                            .street(o.getStreet())
                            .surname(o.getSurname())
                            .title(o.getTitle())
                            .userId(o.getUserId());

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
     * Common name or fully-qualified domain name (RDN CN).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commonName")
    String commonName;

    /**
     * Country name (RDN C).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    String country;

    /**
     * Domain component (RDN DC).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainComponent")
    String domainComponent;

    /**
     * Distinguished name qualifier(RDN DNQ).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("distinguishedNameQualifier")
    String distinguishedNameQualifier;

    /**
     * Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("generationQualifier")
    String generationQualifier;

    /**
     * Personal given name (RDN G or GN).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("givenName")
    String givenName;

    /**
     * Personal initials.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initials")
    String initials;

    /**
     * Locality (RDN L).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localityName")
    String localityName;

    /**
     * Organization (RDN O).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    String organization;

    /**
     * Organizational unit (RDN OU).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organizationalUnit")
    String organizationalUnit;

    /**
     * Subject pseudonym.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pseudonym")
    String pseudonym;

    /**
     * Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    String serialNumber;

    /**
     * State or province name (RDN ST or S).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stateOrProvinceName")
    String stateOrProvinceName;

    /**
     * Street address (RDN STREET).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("street")
    String street;

    /**
     * Personal surname (RDN SN).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("surname")
    String surname;

    /**
     * Title (RDN T or TITLE).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    String title;

    /**
     * User ID (RDN UID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    String userId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
