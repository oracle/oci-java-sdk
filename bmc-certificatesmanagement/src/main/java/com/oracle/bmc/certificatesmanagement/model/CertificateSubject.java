/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The subject of the certificate, which is a distinguished name that identifies the entity that
 * owns the public key in the certificate. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CertificateSubject.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CertificateSubject
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "commonName",
        "country",
        "domainComponent",
        "distinguishedNameQualifier",
        "generationQualifier",
        "givenName",
        "initials",
        "localityName",
        "organization",
        "organizationalUnit",
        "pseudonym",
        "serialNumber",
        "stateOrProvinceName",
        "street",
        "surname",
        "title",
        "userId"
    })
    public CertificateSubject(
            String commonName,
            String country,
            String domainComponent,
            String distinguishedNameQualifier,
            String generationQualifier,
            String givenName,
            String initials,
            String localityName,
            String organization,
            String organizationalUnit,
            String pseudonym,
            String serialNumber,
            String stateOrProvinceName,
            String street,
            String surname,
            String title,
            String userId) {
        super();
        this.commonName = commonName;
        this.country = country;
        this.domainComponent = domainComponent;
        this.distinguishedNameQualifier = distinguishedNameQualifier;
        this.generationQualifier = generationQualifier;
        this.givenName = givenName;
        this.initials = initials;
        this.localityName = localityName;
        this.organization = organization;
        this.organizationalUnit = organizationalUnit;
        this.pseudonym = pseudonym;
        this.serialNumber = serialNumber;
        this.stateOrProvinceName = stateOrProvinceName;
        this.street = street;
        this.surname = surname;
        this.title = title;
        this.userId = userId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Common name or fully-qualified domain name (RDN CN). */
        @com.fasterxml.jackson.annotation.JsonProperty("commonName")
        private String commonName;

        /**
         * Common name or fully-qualified domain name (RDN CN).
         *
         * @param commonName the value to set
         * @return this builder
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            this.__explicitlySet__.add("commonName");
            return this;
        }
        /** Country name (RDN C). */
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country name (RDN C).
         *
         * @param country the value to set
         * @return this builder
         */
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /** Domain component (RDN DC). */
        @com.fasterxml.jackson.annotation.JsonProperty("domainComponent")
        private String domainComponent;

        /**
         * Domain component (RDN DC).
         *
         * @param domainComponent the value to set
         * @return this builder
         */
        public Builder domainComponent(String domainComponent) {
            this.domainComponent = domainComponent;
            this.__explicitlySet__.add("domainComponent");
            return this;
        }
        /** Distinguished name qualifier(RDN DNQ). */
        @com.fasterxml.jackson.annotation.JsonProperty("distinguishedNameQualifier")
        private String distinguishedNameQualifier;

        /**
         * Distinguished name qualifier(RDN DNQ).
         *
         * @param distinguishedNameQualifier the value to set
         * @return this builder
         */
        public Builder distinguishedNameQualifier(String distinguishedNameQualifier) {
            this.distinguishedNameQualifier = distinguishedNameQualifier;
            this.__explicitlySet__.add("distinguishedNameQualifier");
            return this;
        }
        /** Personal generational qualifier (for example, Sr., Jr. 3rd, or IV). */
        @com.fasterxml.jackson.annotation.JsonProperty("generationQualifier")
        private String generationQualifier;

        /**
         * Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
         *
         * @param generationQualifier the value to set
         * @return this builder
         */
        public Builder generationQualifier(String generationQualifier) {
            this.generationQualifier = generationQualifier;
            this.__explicitlySet__.add("generationQualifier");
            return this;
        }
        /** Personal given name (RDN G or GN). */
        @com.fasterxml.jackson.annotation.JsonProperty("givenName")
        private String givenName;

        /**
         * Personal given name (RDN G or GN).
         *
         * @param givenName the value to set
         * @return this builder
         */
        public Builder givenName(String givenName) {
            this.givenName = givenName;
            this.__explicitlySet__.add("givenName");
            return this;
        }
        /** Personal initials. */
        @com.fasterxml.jackson.annotation.JsonProperty("initials")
        private String initials;

        /**
         * Personal initials.
         *
         * @param initials the value to set
         * @return this builder
         */
        public Builder initials(String initials) {
            this.initials = initials;
            this.__explicitlySet__.add("initials");
            return this;
        }
        /** Locality (RDN L). */
        @com.fasterxml.jackson.annotation.JsonProperty("localityName")
        private String localityName;

        /**
         * Locality (RDN L).
         *
         * @param localityName the value to set
         * @return this builder
         */
        public Builder localityName(String localityName) {
            this.localityName = localityName;
            this.__explicitlySet__.add("localityName");
            return this;
        }
        /** Organization (RDN O). */
        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        private String organization;

        /**
         * Organization (RDN O).
         *
         * @param organization the value to set
         * @return this builder
         */
        public Builder organization(String organization) {
            this.organization = organization;
            this.__explicitlySet__.add("organization");
            return this;
        }
        /** Organizational unit (RDN OU). */
        @com.fasterxml.jackson.annotation.JsonProperty("organizationalUnit")
        private String organizationalUnit;

        /**
         * Organizational unit (RDN OU).
         *
         * @param organizationalUnit the value to set
         * @return this builder
         */
        public Builder organizationalUnit(String organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            this.__explicitlySet__.add("organizationalUnit");
            return this;
        }
        /** Subject pseudonym. */
        @com.fasterxml.jackson.annotation.JsonProperty("pseudonym")
        private String pseudonym;

        /**
         * Subject pseudonym.
         *
         * @param pseudonym the value to set
         * @return this builder
         */
        public Builder pseudonym(String pseudonym) {
            this.pseudonym = pseudonym;
            this.__explicitlySet__.add("pseudonym");
            return this;
        }
        /**
         * Unique subject identifier, which is not the same as the certificate serial number (RDN
         * SERIALNUMBER).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * Unique subject identifier, which is not the same as the certificate serial number (RDN
         * SERIALNUMBER).
         *
         * @param serialNumber the value to set
         * @return this builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /** State or province name (RDN ST or S). */
        @com.fasterxml.jackson.annotation.JsonProperty("stateOrProvinceName")
        private String stateOrProvinceName;

        /**
         * State or province name (RDN ST or S).
         *
         * @param stateOrProvinceName the value to set
         * @return this builder
         */
        public Builder stateOrProvinceName(String stateOrProvinceName) {
            this.stateOrProvinceName = stateOrProvinceName;
            this.__explicitlySet__.add("stateOrProvinceName");
            return this;
        }
        /** Street address (RDN STREET). */
        @com.fasterxml.jackson.annotation.JsonProperty("street")
        private String street;

        /**
         * Street address (RDN STREET).
         *
         * @param street the value to set
         * @return this builder
         */
        public Builder street(String street) {
            this.street = street;
            this.__explicitlySet__.add("street");
            return this;
        }
        /** Personal surname (RDN SN). */
        @com.fasterxml.jackson.annotation.JsonProperty("surname")
        private String surname;

        /**
         * Personal surname (RDN SN).
         *
         * @param surname the value to set
         * @return this builder
         */
        public Builder surname(String surname) {
            this.surname = surname;
            this.__explicitlySet__.add("surname");
            return this;
        }
        /** Title (RDN T or TITLE). */
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * Title (RDN T or TITLE).
         *
         * @param title the value to set
         * @return this builder
         */
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /** User ID (RDN UID). */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * User ID (RDN UID).
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateSubject build() {
            CertificateSubject model =
                    new CertificateSubject(
                            this.commonName,
                            this.country,
                            this.domainComponent,
                            this.distinguishedNameQualifier,
                            this.generationQualifier,
                            this.givenName,
                            this.initials,
                            this.localityName,
                            this.organization,
                            this.organizationalUnit,
                            this.pseudonym,
                            this.serialNumber,
                            this.stateOrProvinceName,
                            this.street,
                            this.surname,
                            this.title,
                            this.userId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateSubject model) {
            if (model.wasPropertyExplicitlySet("commonName")) {
                this.commonName(model.getCommonName());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("domainComponent")) {
                this.domainComponent(model.getDomainComponent());
            }
            if (model.wasPropertyExplicitlySet("distinguishedNameQualifier")) {
                this.distinguishedNameQualifier(model.getDistinguishedNameQualifier());
            }
            if (model.wasPropertyExplicitlySet("generationQualifier")) {
                this.generationQualifier(model.getGenerationQualifier());
            }
            if (model.wasPropertyExplicitlySet("givenName")) {
                this.givenName(model.getGivenName());
            }
            if (model.wasPropertyExplicitlySet("initials")) {
                this.initials(model.getInitials());
            }
            if (model.wasPropertyExplicitlySet("localityName")) {
                this.localityName(model.getLocalityName());
            }
            if (model.wasPropertyExplicitlySet("organization")) {
                this.organization(model.getOrganization());
            }
            if (model.wasPropertyExplicitlySet("organizationalUnit")) {
                this.organizationalUnit(model.getOrganizationalUnit());
            }
            if (model.wasPropertyExplicitlySet("pseudonym")) {
                this.pseudonym(model.getPseudonym());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("stateOrProvinceName")) {
                this.stateOrProvinceName(model.getStateOrProvinceName());
            }
            if (model.wasPropertyExplicitlySet("street")) {
                this.street(model.getStreet());
            }
            if (model.wasPropertyExplicitlySet("surname")) {
                this.surname(model.getSurname());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
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

    /** Common name or fully-qualified domain name (RDN CN). */
    @com.fasterxml.jackson.annotation.JsonProperty("commonName")
    private final String commonName;

    /**
     * Common name or fully-qualified domain name (RDN CN).
     *
     * @return the value
     */
    public String getCommonName() {
        return commonName;
    }

    /** Country name (RDN C). */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country name (RDN C).
     *
     * @return the value
     */
    public String getCountry() {
        return country;
    }

    /** Domain component (RDN DC). */
    @com.fasterxml.jackson.annotation.JsonProperty("domainComponent")
    private final String domainComponent;

    /**
     * Domain component (RDN DC).
     *
     * @return the value
     */
    public String getDomainComponent() {
        return domainComponent;
    }

    /** Distinguished name qualifier(RDN DNQ). */
    @com.fasterxml.jackson.annotation.JsonProperty("distinguishedNameQualifier")
    private final String distinguishedNameQualifier;

    /**
     * Distinguished name qualifier(RDN DNQ).
     *
     * @return the value
     */
    public String getDistinguishedNameQualifier() {
        return distinguishedNameQualifier;
    }

    /** Personal generational qualifier (for example, Sr., Jr. 3rd, or IV). */
    @com.fasterxml.jackson.annotation.JsonProperty("generationQualifier")
    private final String generationQualifier;

    /**
     * Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
     *
     * @return the value
     */
    public String getGenerationQualifier() {
        return generationQualifier;
    }

    /** Personal given name (RDN G or GN). */
    @com.fasterxml.jackson.annotation.JsonProperty("givenName")
    private final String givenName;

    /**
     * Personal given name (RDN G or GN).
     *
     * @return the value
     */
    public String getGivenName() {
        return givenName;
    }

    /** Personal initials. */
    @com.fasterxml.jackson.annotation.JsonProperty("initials")
    private final String initials;

    /**
     * Personal initials.
     *
     * @return the value
     */
    public String getInitials() {
        return initials;
    }

    /** Locality (RDN L). */
    @com.fasterxml.jackson.annotation.JsonProperty("localityName")
    private final String localityName;

    /**
     * Locality (RDN L).
     *
     * @return the value
     */
    public String getLocalityName() {
        return localityName;
    }

    /** Organization (RDN O). */
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    private final String organization;

    /**
     * Organization (RDN O).
     *
     * @return the value
     */
    public String getOrganization() {
        return organization;
    }

    /** Organizational unit (RDN OU). */
    @com.fasterxml.jackson.annotation.JsonProperty("organizationalUnit")
    private final String organizationalUnit;

    /**
     * Organizational unit (RDN OU).
     *
     * @return the value
     */
    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    /** Subject pseudonym. */
    @com.fasterxml.jackson.annotation.JsonProperty("pseudonym")
    private final String pseudonym;

    /**
     * Subject pseudonym.
     *
     * @return the value
     */
    public String getPseudonym() {
        return pseudonym;
    }

    /**
     * Unique subject identifier, which is not the same as the certificate serial number (RDN
     * SERIALNUMBER).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * Unique subject identifier, which is not the same as the certificate serial number (RDN
     * SERIALNUMBER).
     *
     * @return the value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** State or province name (RDN ST or S). */
    @com.fasterxml.jackson.annotation.JsonProperty("stateOrProvinceName")
    private final String stateOrProvinceName;

    /**
     * State or province name (RDN ST or S).
     *
     * @return the value
     */
    public String getStateOrProvinceName() {
        return stateOrProvinceName;
    }

    /** Street address (RDN STREET). */
    @com.fasterxml.jackson.annotation.JsonProperty("street")
    private final String street;

    /**
     * Street address (RDN STREET).
     *
     * @return the value
     */
    public String getStreet() {
        return street;
    }

    /** Personal surname (RDN SN). */
    @com.fasterxml.jackson.annotation.JsonProperty("surname")
    private final String surname;

    /**
     * Personal surname (RDN SN).
     *
     * @return the value
     */
    public String getSurname() {
        return surname;
    }

    /** Title (RDN T or TITLE). */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * Title (RDN T or TITLE).
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /** User ID (RDN UID). */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * User ID (RDN UID).
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
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
        sb.append("CertificateSubject(");
        sb.append("super=").append(super.toString());
        sb.append("commonName=").append(String.valueOf(this.commonName));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", domainComponent=").append(String.valueOf(this.domainComponent));
        sb.append(", distinguishedNameQualifier=")
                .append(String.valueOf(this.distinguishedNameQualifier));
        sb.append(", generationQualifier=").append(String.valueOf(this.generationQualifier));
        sb.append(", givenName=").append(String.valueOf(this.givenName));
        sb.append(", initials=").append(String.valueOf(this.initials));
        sb.append(", localityName=").append(String.valueOf(this.localityName));
        sb.append(", organization=").append(String.valueOf(this.organization));
        sb.append(", organizationalUnit=").append(String.valueOf(this.organizationalUnit));
        sb.append(", pseudonym=").append(String.valueOf(this.pseudonym));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", stateOrProvinceName=").append(String.valueOf(this.stateOrProvinceName));
        sb.append(", street=").append(String.valueOf(this.street));
        sb.append(", surname=").append(String.valueOf(this.surname));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateSubject)) {
            return false;
        }

        CertificateSubject other = (CertificateSubject) o;
        return java.util.Objects.equals(this.commonName, other.commonName)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.domainComponent, other.domainComponent)
                && java.util.Objects.equals(
                        this.distinguishedNameQualifier, other.distinguishedNameQualifier)
                && java.util.Objects.equals(this.generationQualifier, other.generationQualifier)
                && java.util.Objects.equals(this.givenName, other.givenName)
                && java.util.Objects.equals(this.initials, other.initials)
                && java.util.Objects.equals(this.localityName, other.localityName)
                && java.util.Objects.equals(this.organization, other.organization)
                && java.util.Objects.equals(this.organizationalUnit, other.organizationalUnit)
                && java.util.Objects.equals(this.pseudonym, other.pseudonym)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.stateOrProvinceName, other.stateOrProvinceName)
                && java.util.Objects.equals(this.street, other.street)
                && java.util.Objects.equals(this.surname, other.surname)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.userId, other.userId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.commonName == null ? 43 : this.commonName.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result =
                (result * PRIME)
                        + (this.domainComponent == null ? 43 : this.domainComponent.hashCode());
        result =
                (result * PRIME)
                        + (this.distinguishedNameQualifier == null
                                ? 43
                                : this.distinguishedNameQualifier.hashCode());
        result =
                (result * PRIME)
                        + (this.generationQualifier == null
                                ? 43
                                : this.generationQualifier.hashCode());
        result = (result * PRIME) + (this.givenName == null ? 43 : this.givenName.hashCode());
        result = (result * PRIME) + (this.initials == null ? 43 : this.initials.hashCode());
        result = (result * PRIME) + (this.localityName == null ? 43 : this.localityName.hashCode());
        result = (result * PRIME) + (this.organization == null ? 43 : this.organization.hashCode());
        result =
                (result * PRIME)
                        + (this.organizationalUnit == null
                                ? 43
                                : this.organizationalUnit.hashCode());
        result = (result * PRIME) + (this.pseudonym == null ? 43 : this.pseudonym.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.stateOrProvinceName == null
                                ? 43
                                : this.stateOrProvinceName.hashCode());
        result = (result * PRIME) + (this.street == null ? 43 : this.street.hashCode());
        result = (result * PRIME) + (this.surname == null ? 43 : this.surname.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
