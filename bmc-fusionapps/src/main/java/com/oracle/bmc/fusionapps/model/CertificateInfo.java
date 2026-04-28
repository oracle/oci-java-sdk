/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Properties of certificate <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CertificateInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CertificateInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "commonName",
        "subjectAltNames",
        "organizationName",
        "organizationUnit",
        "locality",
        "state",
        "country",
        "emailAddress",
        "originCsr",
        "akamaiCsr",
        "originDvCertInstruction",
        "akamaiDvCertInstruction",
        "firstName",
        "lastName",
        "phoneNumber",
        "postalCode"
    })
    public CertificateInfo(
            String commonName,
            java.util.List<String> subjectAltNames,
            String organizationName,
            String organizationUnit,
            String locality,
            String state,
            String country,
            String emailAddress,
            String originCsr,
            String akamaiCsr,
            String originDvCertInstruction,
            String akamaiDvCertInstruction,
            String firstName,
            String lastName,
            String phoneNumber,
            String postalCode) {
        super();
        this.commonName = commonName;
        this.subjectAltNames = subjectAltNames;
        this.organizationName = organizationName;
        this.organizationUnit = organizationUnit;
        this.locality = locality;
        this.state = state;
        this.country = country;
        this.emailAddress = emailAddress;
        this.originCsr = originCsr;
        this.akamaiCsr = akamaiCsr;
        this.originDvCertInstruction = originDvCertInstruction;
        this.akamaiDvCertInstruction = akamaiDvCertInstruction;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Fully qualified host name */
        @com.fasterxml.jackson.annotation.JsonProperty("commonName")
        private String commonName;

        /**
         * Fully qualified host name
         *
         * @param commonName the value to set
         * @return this builder
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            this.__explicitlySet__.add("commonName");
            return this;
        }
        /** List of subject alternative names, comma separated */
        @com.fasterxml.jackson.annotation.JsonProperty("subjectAltNames")
        private java.util.List<String> subjectAltNames;

        /**
         * List of subject alternative names, comma separated
         *
         * @param subjectAltNames the value to set
         * @return this builder
         */
        public Builder subjectAltNames(java.util.List<String> subjectAltNames) {
            this.subjectAltNames = subjectAltNames;
            this.__explicitlySet__.add("subjectAltNames");
            return this;
        }
        /** Company name */
        @com.fasterxml.jackson.annotation.JsonProperty("organizationName")
        private String organizationName;

        /**
         * Company name
         *
         * @param organizationName the value to set
         * @return this builder
         */
        public Builder organizationName(String organizationName) {
            this.organizationName = organizationName;
            this.__explicitlySet__.add("organizationName");
            return this;
        }
        /** Company section */
        @com.fasterxml.jackson.annotation.JsonProperty("organizationUnit")
        private String organizationUnit;

        /**
         * Company section
         *
         * @param organizationUnit the value to set
         * @return this builder
         */
        public Builder organizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            this.__explicitlySet__.add("organizationUnit");
            return this;
        }
        /** City */
        @com.fasterxml.jackson.annotation.JsonProperty("locality")
        private String locality;

        /**
         * City
         *
         * @param locality the value to set
         * @return this builder
         */
        public Builder locality(String locality) {
            this.locality = locality;
            this.__explicitlySet__.add("locality");
            return this;
        }
        /** State or province */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * State or province
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** Country name */
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country name
         *
         * @param country the value to set
         * @return this builder
         */
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /** Email address */
        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        /**
         * Email address
         *
         * @param emailAddress the value to set
         * @return this builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }
        /** Certificate signing request */
        @com.fasterxml.jackson.annotation.JsonProperty("originCsr")
        private String originCsr;

        /**
         * Certificate signing request
         *
         * @param originCsr the value to set
         * @return this builder
         */
        public Builder originCsr(String originCsr) {
            this.originCsr = originCsr;
            this.__explicitlySet__.add("originCsr");
            return this;
        }
        /** Akamai Certificate signing request */
        @com.fasterxml.jackson.annotation.JsonProperty("akamaiCsr")
        private String akamaiCsr;

        /**
         * Akamai Certificate signing request
         *
         * @param akamaiCsr the value to set
         * @return this builder
         */
        public Builder akamaiCsr(String akamaiCsr) {
            this.akamaiCsr = akamaiCsr;
            this.__explicitlySet__.add("akamaiCsr");
            return this;
        }
        /** Dv Cert instruction to validate domain, e.g. set DNS token or HTTP token, etc */
        @com.fasterxml.jackson.annotation.JsonProperty("originDvCertInstruction")
        private String originDvCertInstruction;

        /**
         * Dv Cert instruction to validate domain, e.g. set DNS token or HTTP token, etc
         *
         * @param originDvCertInstruction the value to set
         * @return this builder
         */
        public Builder originDvCertInstruction(String originDvCertInstruction) {
            this.originDvCertInstruction = originDvCertInstruction;
            this.__explicitlySet__.add("originDvCertInstruction");
            return this;
        }
        /** Akamai Dv Cert instruction to validate domain, e.g. set DNS token or HTTP token, etc */
        @com.fasterxml.jackson.annotation.JsonProperty("akamaiDvCertInstruction")
        private String akamaiDvCertInstruction;

        /**
         * Akamai Dv Cert instruction to validate domain, e.g. set DNS token or HTTP token, etc
         *
         * @param akamaiDvCertInstruction the value to set
         * @return this builder
         */
        public Builder akamaiDvCertInstruction(String akamaiDvCertInstruction) {
            this.akamaiDvCertInstruction = akamaiDvCertInstruction;
            this.__explicitlySet__.add("akamaiDvCertInstruction");
            return this;
        }
        /** First name */
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * First name
         *
         * @param firstName the value to set
         * @return this builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /** Last name */
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * Last name
         *
         * @param lastName the value to set
         * @return this builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }
        /** Phone number */
        @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
        private String phoneNumber;

        /**
         * Phone number
         *
         * @param phoneNumber the value to set
         * @return this builder
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.__explicitlySet__.add("phoneNumber");
            return this;
        }
        /** Postal code */
        @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
        private String postalCode;

        /**
         * Postal code
         *
         * @param postalCode the value to set
         * @return this builder
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            this.__explicitlySet__.add("postalCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateInfo build() {
            CertificateInfo model =
                    new CertificateInfo(
                            this.commonName,
                            this.subjectAltNames,
                            this.organizationName,
                            this.organizationUnit,
                            this.locality,
                            this.state,
                            this.country,
                            this.emailAddress,
                            this.originCsr,
                            this.akamaiCsr,
                            this.originDvCertInstruction,
                            this.akamaiDvCertInstruction,
                            this.firstName,
                            this.lastName,
                            this.phoneNumber,
                            this.postalCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateInfo model) {
            if (model.wasPropertyExplicitlySet("commonName")) {
                this.commonName(model.getCommonName());
            }
            if (model.wasPropertyExplicitlySet("subjectAltNames")) {
                this.subjectAltNames(model.getSubjectAltNames());
            }
            if (model.wasPropertyExplicitlySet("organizationName")) {
                this.organizationName(model.getOrganizationName());
            }
            if (model.wasPropertyExplicitlySet("organizationUnit")) {
                this.organizationUnit(model.getOrganizationUnit());
            }
            if (model.wasPropertyExplicitlySet("locality")) {
                this.locality(model.getLocality());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("emailAddress")) {
                this.emailAddress(model.getEmailAddress());
            }
            if (model.wasPropertyExplicitlySet("originCsr")) {
                this.originCsr(model.getOriginCsr());
            }
            if (model.wasPropertyExplicitlySet("akamaiCsr")) {
                this.akamaiCsr(model.getAkamaiCsr());
            }
            if (model.wasPropertyExplicitlySet("originDvCertInstruction")) {
                this.originDvCertInstruction(model.getOriginDvCertInstruction());
            }
            if (model.wasPropertyExplicitlySet("akamaiDvCertInstruction")) {
                this.akamaiDvCertInstruction(model.getAkamaiDvCertInstruction());
            }
            if (model.wasPropertyExplicitlySet("firstName")) {
                this.firstName(model.getFirstName());
            }
            if (model.wasPropertyExplicitlySet("lastName")) {
                this.lastName(model.getLastName());
            }
            if (model.wasPropertyExplicitlySet("phoneNumber")) {
                this.phoneNumber(model.getPhoneNumber());
            }
            if (model.wasPropertyExplicitlySet("postalCode")) {
                this.postalCode(model.getPostalCode());
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

    /** Fully qualified host name */
    @com.fasterxml.jackson.annotation.JsonProperty("commonName")
    private final String commonName;

    /**
     * Fully qualified host name
     *
     * @return the value
     */
    public String getCommonName() {
        return commonName;
    }

    /** List of subject alternative names, comma separated */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectAltNames")
    private final java.util.List<String> subjectAltNames;

    /**
     * List of subject alternative names, comma separated
     *
     * @return the value
     */
    public java.util.List<String> getSubjectAltNames() {
        return subjectAltNames;
    }

    /** Company name */
    @com.fasterxml.jackson.annotation.JsonProperty("organizationName")
    private final String organizationName;

    /**
     * Company name
     *
     * @return the value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** Company section */
    @com.fasterxml.jackson.annotation.JsonProperty("organizationUnit")
    private final String organizationUnit;

    /**
     * Company section
     *
     * @return the value
     */
    public String getOrganizationUnit() {
        return organizationUnit;
    }

    /** City */
    @com.fasterxml.jackson.annotation.JsonProperty("locality")
    private final String locality;

    /**
     * City
     *
     * @return the value
     */
    public String getLocality() {
        return locality;
    }

    /** State or province */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * State or province
     *
     * @return the value
     */
    public String getState() {
        return state;
    }

    /** Country name */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country name
     *
     * @return the value
     */
    public String getCountry() {
        return country;
    }

    /** Email address */
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    private final String emailAddress;

    /**
     * Email address
     *
     * @return the value
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /** Certificate signing request */
    @com.fasterxml.jackson.annotation.JsonProperty("originCsr")
    private final String originCsr;

    /**
     * Certificate signing request
     *
     * @return the value
     */
    public String getOriginCsr() {
        return originCsr;
    }

    /** Akamai Certificate signing request */
    @com.fasterxml.jackson.annotation.JsonProperty("akamaiCsr")
    private final String akamaiCsr;

    /**
     * Akamai Certificate signing request
     *
     * @return the value
     */
    public String getAkamaiCsr() {
        return akamaiCsr;
    }

    /** Dv Cert instruction to validate domain, e.g. set DNS token or HTTP token, etc */
    @com.fasterxml.jackson.annotation.JsonProperty("originDvCertInstruction")
    private final String originDvCertInstruction;

    /**
     * Dv Cert instruction to validate domain, e.g. set DNS token or HTTP token, etc
     *
     * @return the value
     */
    public String getOriginDvCertInstruction() {
        return originDvCertInstruction;
    }

    /** Akamai Dv Cert instruction to validate domain, e.g. set DNS token or HTTP token, etc */
    @com.fasterxml.jackson.annotation.JsonProperty("akamaiDvCertInstruction")
    private final String akamaiDvCertInstruction;

    /**
     * Akamai Dv Cert instruction to validate domain, e.g. set DNS token or HTTP token, etc
     *
     * @return the value
     */
    public String getAkamaiDvCertInstruction() {
        return akamaiDvCertInstruction;
    }

    /** First name */
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * First name
     *
     * @return the value
     */
    public String getFirstName() {
        return firstName;
    }

    /** Last name */
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * Last name
     *
     * @return the value
     */
    public String getLastName() {
        return lastName;
    }

    /** Phone number */
    @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
    private final String phoneNumber;

    /**
     * Phone number
     *
     * @return the value
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** Postal code */
    @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
    private final String postalCode;

    /**
     * Postal code
     *
     * @return the value
     */
    public String getPostalCode() {
        return postalCode;
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
        sb.append("CertificateInfo(");
        sb.append("super=").append(super.toString());
        sb.append("commonName=").append(String.valueOf(this.commonName));
        sb.append(", subjectAltNames=").append(String.valueOf(this.subjectAltNames));
        sb.append(", organizationName=").append(String.valueOf(this.organizationName));
        sb.append(", organizationUnit=").append(String.valueOf(this.organizationUnit));
        sb.append(", locality=").append(String.valueOf(this.locality));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", emailAddress=").append(String.valueOf(this.emailAddress));
        sb.append(", originCsr=").append(String.valueOf(this.originCsr));
        sb.append(", akamaiCsr=").append(String.valueOf(this.akamaiCsr));
        sb.append(", originDvCertInstruction=")
                .append(String.valueOf(this.originDvCertInstruction));
        sb.append(", akamaiDvCertInstruction=")
                .append(String.valueOf(this.akamaiDvCertInstruction));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(", phoneNumber=").append(String.valueOf(this.phoneNumber));
        sb.append(", postalCode=").append(String.valueOf(this.postalCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateInfo)) {
            return false;
        }

        CertificateInfo other = (CertificateInfo) o;
        return java.util.Objects.equals(this.commonName, other.commonName)
                && java.util.Objects.equals(this.subjectAltNames, other.subjectAltNames)
                && java.util.Objects.equals(this.organizationName, other.organizationName)
                && java.util.Objects.equals(this.organizationUnit, other.organizationUnit)
                && java.util.Objects.equals(this.locality, other.locality)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.emailAddress, other.emailAddress)
                && java.util.Objects.equals(this.originCsr, other.originCsr)
                && java.util.Objects.equals(this.akamaiCsr, other.akamaiCsr)
                && java.util.Objects.equals(
                        this.originDvCertInstruction, other.originDvCertInstruction)
                && java.util.Objects.equals(
                        this.akamaiDvCertInstruction, other.akamaiDvCertInstruction)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.phoneNumber, other.phoneNumber)
                && java.util.Objects.equals(this.postalCode, other.postalCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.commonName == null ? 43 : this.commonName.hashCode());
        result =
                (result * PRIME)
                        + (this.subjectAltNames == null ? 43 : this.subjectAltNames.hashCode());
        result =
                (result * PRIME)
                        + (this.organizationName == null ? 43 : this.organizationName.hashCode());
        result =
                (result * PRIME)
                        + (this.organizationUnit == null ? 43 : this.organizationUnit.hashCode());
        result = (result * PRIME) + (this.locality == null ? 43 : this.locality.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.emailAddress == null ? 43 : this.emailAddress.hashCode());
        result = (result * PRIME) + (this.originCsr == null ? 43 : this.originCsr.hashCode());
        result = (result * PRIME) + (this.akamaiCsr == null ? 43 : this.akamaiCsr.hashCode());
        result =
                (result * PRIME)
                        + (this.originDvCertInstruction == null
                                ? 43
                                : this.originDvCertInstruction.hashCode());
        result =
                (result * PRIME)
                        + (this.akamaiDvCertInstruction == null
                                ? 43
                                : this.akamaiDvCertInstruction.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result = (result * PRIME) + (this.phoneNumber == null ? 43 : this.phoneNumber.hashCode());
        result = (result * PRIME) + (this.postalCode == null ? 43 : this.postalCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
