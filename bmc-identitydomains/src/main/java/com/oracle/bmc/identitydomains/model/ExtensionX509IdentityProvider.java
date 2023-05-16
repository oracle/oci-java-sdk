/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * X509 Identity Provider Extension Schema <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExtensionX509IdentityProvider.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionX509IdentityProvider
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "certMatchAttribute",
        "userMatchAttribute",
        "otherCertMatchAttribute",
        "signingCertificateChain",
        "ocspEnabled",
        "ocspServerName",
        "ocspResponderURL",
        "ocspAllowUnknownResponseStatus",
        "ocspRevalidateTime",
        "ocspEnableSignedResponse",
        "ocspTrustCertChain",
        "crlEnabled",
        "crlCheckOnOCSPFailureEnabled",
        "crlLocation",
        "crlReloadDuration"
    })
    public ExtensionX509IdentityProvider(
            String certMatchAttribute,
            String userMatchAttribute,
            String otherCertMatchAttribute,
            java.util.List<String> signingCertificateChain,
            Boolean ocspEnabled,
            String ocspServerName,
            String ocspResponderURL,
            Boolean ocspAllowUnknownResponseStatus,
            Integer ocspRevalidateTime,
            Boolean ocspEnableSignedResponse,
            java.util.List<String> ocspTrustCertChain,
            Boolean crlEnabled,
            Boolean crlCheckOnOCSPFailureEnabled,
            String crlLocation,
            Integer crlReloadDuration) {
        super();
        this.certMatchAttribute = certMatchAttribute;
        this.userMatchAttribute = userMatchAttribute;
        this.otherCertMatchAttribute = otherCertMatchAttribute;
        this.signingCertificateChain = signingCertificateChain;
        this.ocspEnabled = ocspEnabled;
        this.ocspServerName = ocspServerName;
        this.ocspResponderURL = ocspResponderURL;
        this.ocspAllowUnknownResponseStatus = ocspAllowUnknownResponseStatus;
        this.ocspRevalidateTime = ocspRevalidateTime;
        this.ocspEnableSignedResponse = ocspEnableSignedResponse;
        this.ocspTrustCertChain = ocspTrustCertChain;
        this.crlEnabled = crlEnabled;
        this.crlCheckOnOCSPFailureEnabled = crlCheckOnOCSPFailureEnabled;
        this.crlLocation = crlLocation;
        this.crlReloadDuration = crlReloadDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * X509 Certificate Matching Attribute
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certMatchAttribute")
        private String certMatchAttribute;

        /**
         * X509 Certificate Matching Attribute
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param certMatchAttribute the value to set
         * @return this builder
         */
        public Builder certMatchAttribute(String certMatchAttribute) {
            this.certMatchAttribute = certMatchAttribute;
            this.__explicitlySet__.add("certMatchAttribute");
            return this;
        }
        /**
         * This property specifies the userstore attribute value that must match the incoming
         * certificate attribute.
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userMatchAttribute")
        private String userMatchAttribute;

        /**
         * This property specifies the userstore attribute value that must match the incoming
         * certificate attribute.
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param userMatchAttribute the value to set
         * @return this builder
         */
        public Builder userMatchAttribute(String userMatchAttribute) {
            this.userMatchAttribute = userMatchAttribute;
            this.__explicitlySet__.add("userMatchAttribute");
            return this;
        }
        /**
         * Check for specific conditions of other certificate attributes
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("otherCertMatchAttribute")
        private String otherCertMatchAttribute;

        /**
         * Check for specific conditions of other certificate attributes
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param otherCertMatchAttribute the value to set
         * @return this builder
         */
        public Builder otherCertMatchAttribute(String otherCertMatchAttribute) {
            this.otherCertMatchAttribute = otherCertMatchAttribute;
            this.__explicitlySet__.add("otherCertMatchAttribute");
            return this;
        }
        /**
         * Certificate alias list to create a chain for the incoming client certificate
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signingCertificateChain")
        private java.util.List<String> signingCertificateChain;

        /**
         * Certificate alias list to create a chain for the incoming client certificate
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param signingCertificateChain the value to set
         * @return this builder
         */
        public Builder signingCertificateChain(java.util.List<String> signingCertificateChain) {
            this.signingCertificateChain = signingCertificateChain;
            this.__explicitlySet__.add("signingCertificateChain");
            return this;
        }
        /**
         * Set to true to enable OCSP Validation
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocspEnabled")
        private Boolean ocspEnabled;

        /**
         * Set to true to enable OCSP Validation
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param ocspEnabled the value to set
         * @return this builder
         */
        public Builder ocspEnabled(Boolean ocspEnabled) {
            this.ocspEnabled = ocspEnabled;
            this.__explicitlySet__.add("ocspEnabled");
            return this;
        }
        /**
         * This property specifies the OCSP Server alias name
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocspServerName")
        private String ocspServerName;

        /**
         * This property specifies the OCSP Server alias name
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param ocspServerName the value to set
         * @return this builder
         */
        public Builder ocspServerName(String ocspServerName) {
            this.ocspServerName = ocspServerName;
            this.__explicitlySet__.add("ocspServerName");
            return this;
        }
        /**
         * This property specifies OCSP Responder URL.
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocspResponderURL")
        private String ocspResponderURL;

        /**
         * This property specifies OCSP Responder URL.
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param ocspResponderURL the value to set
         * @return this builder
         */
        public Builder ocspResponderURL(String ocspResponderURL) {
            this.ocspResponderURL = ocspResponderURL;
            this.__explicitlySet__.add("ocspResponderURL");
            return this;
        }
        /**
         * Allow access if OCSP response is UNKNOWN or OCSP Responder does not respond within the
         * timeout duration
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocspAllowUnknownResponseStatus")
        private Boolean ocspAllowUnknownResponseStatus;

        /**
         * Allow access if OCSP response is UNKNOWN or OCSP Responder does not respond within the
         * timeout duration
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param ocspAllowUnknownResponseStatus the value to set
         * @return this builder
         */
        public Builder ocspAllowUnknownResponseStatus(Boolean ocspAllowUnknownResponseStatus) {
            this.ocspAllowUnknownResponseStatus = ocspAllowUnknownResponseStatus;
            this.__explicitlySet__.add("ocspAllowUnknownResponseStatus");
            return this;
        }
        /**
         * Revalidate OCSP status for user after X hours
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 24 - idcsMinValue: 0 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: false - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocspRevalidateTime")
        private Integer ocspRevalidateTime;

        /**
         * Revalidate OCSP status for user after X hours
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 24 - idcsMinValue: 0 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: false - returned: default - type:
         * integer - uniqueness: none
         *
         * @param ocspRevalidateTime the value to set
         * @return this builder
         */
        public Builder ocspRevalidateTime(Integer ocspRevalidateTime) {
            this.ocspRevalidateTime = ocspRevalidateTime;
            this.__explicitlySet__.add("ocspRevalidateTime");
            return this;
        }
        /**
         * Describes if the OCSP response is signed
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocspEnableSignedResponse")
        private Boolean ocspEnableSignedResponse;

        /**
         * Describes if the OCSP response is signed
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param ocspEnableSignedResponse the value to set
         * @return this builder
         */
        public Builder ocspEnableSignedResponse(Boolean ocspEnableSignedResponse) {
            this.ocspEnableSignedResponse = ocspEnableSignedResponse;
            this.__explicitlySet__.add("ocspEnableSignedResponse");
            return this;
        }
        /**
         * OCSP Trusted Certificate Chain
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocspTrustCertChain")
        private java.util.List<String> ocspTrustCertChain;

        /**
         * OCSP Trusted Certificate Chain
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param ocspTrustCertChain the value to set
         * @return this builder
         */
        public Builder ocspTrustCertChain(java.util.List<String> ocspTrustCertChain) {
            this.ocspTrustCertChain = ocspTrustCertChain;
            this.__explicitlySet__.add("ocspTrustCertChain");
            return this;
        }
        /**
         * Set to true to enable CRL Validation
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crlEnabled")
        private Boolean crlEnabled;

        /**
         * Set to true to enable CRL Validation
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param crlEnabled the value to set
         * @return this builder
         */
        public Builder crlEnabled(Boolean crlEnabled) {
            this.crlEnabled = crlEnabled;
            this.__explicitlySet__.add("crlEnabled");
            return this;
        }
        /**
         * Fallback on CRL Validation if OCSP fails.
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crlCheckOnOCSPFailureEnabled")
        private Boolean crlCheckOnOCSPFailureEnabled;

        /**
         * Fallback on CRL Validation if OCSP fails.
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param crlCheckOnOCSPFailureEnabled the value to set
         * @return this builder
         */
        public Builder crlCheckOnOCSPFailureEnabled(Boolean crlCheckOnOCSPFailureEnabled) {
            this.crlCheckOnOCSPFailureEnabled = crlCheckOnOCSPFailureEnabled;
            this.__explicitlySet__.add("crlCheckOnOCSPFailureEnabled");
            return this;
        }
        /**
         * CRL Location URL
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crlLocation")
        private String crlLocation;

        /**
         * CRL Location URL
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param crlLocation the value to set
         * @return this builder
         */
        public Builder crlLocation(String crlLocation) {
            this.crlLocation = crlLocation;
            this.__explicitlySet__.add("crlLocation");
            return this;
        }
        /**
         * Fetch the CRL contents every X minutes
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crlReloadDuration")
        private Integer crlReloadDuration;

        /**
         * Fetch the CRL contents every X minutes
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param crlReloadDuration the value to set
         * @return this builder
         */
        public Builder crlReloadDuration(Integer crlReloadDuration) {
            this.crlReloadDuration = crlReloadDuration;
            this.__explicitlySet__.add("crlReloadDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionX509IdentityProvider build() {
            ExtensionX509IdentityProvider model =
                    new ExtensionX509IdentityProvider(
                            this.certMatchAttribute,
                            this.userMatchAttribute,
                            this.otherCertMatchAttribute,
                            this.signingCertificateChain,
                            this.ocspEnabled,
                            this.ocspServerName,
                            this.ocspResponderURL,
                            this.ocspAllowUnknownResponseStatus,
                            this.ocspRevalidateTime,
                            this.ocspEnableSignedResponse,
                            this.ocspTrustCertChain,
                            this.crlEnabled,
                            this.crlCheckOnOCSPFailureEnabled,
                            this.crlLocation,
                            this.crlReloadDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionX509IdentityProvider model) {
            if (model.wasPropertyExplicitlySet("certMatchAttribute")) {
                this.certMatchAttribute(model.getCertMatchAttribute());
            }
            if (model.wasPropertyExplicitlySet("userMatchAttribute")) {
                this.userMatchAttribute(model.getUserMatchAttribute());
            }
            if (model.wasPropertyExplicitlySet("otherCertMatchAttribute")) {
                this.otherCertMatchAttribute(model.getOtherCertMatchAttribute());
            }
            if (model.wasPropertyExplicitlySet("signingCertificateChain")) {
                this.signingCertificateChain(model.getSigningCertificateChain());
            }
            if (model.wasPropertyExplicitlySet("ocspEnabled")) {
                this.ocspEnabled(model.getOcspEnabled());
            }
            if (model.wasPropertyExplicitlySet("ocspServerName")) {
                this.ocspServerName(model.getOcspServerName());
            }
            if (model.wasPropertyExplicitlySet("ocspResponderURL")) {
                this.ocspResponderURL(model.getOcspResponderURL());
            }
            if (model.wasPropertyExplicitlySet("ocspAllowUnknownResponseStatus")) {
                this.ocspAllowUnknownResponseStatus(model.getOcspAllowUnknownResponseStatus());
            }
            if (model.wasPropertyExplicitlySet("ocspRevalidateTime")) {
                this.ocspRevalidateTime(model.getOcspRevalidateTime());
            }
            if (model.wasPropertyExplicitlySet("ocspEnableSignedResponse")) {
                this.ocspEnableSignedResponse(model.getOcspEnableSignedResponse());
            }
            if (model.wasPropertyExplicitlySet("ocspTrustCertChain")) {
                this.ocspTrustCertChain(model.getOcspTrustCertChain());
            }
            if (model.wasPropertyExplicitlySet("crlEnabled")) {
                this.crlEnabled(model.getCrlEnabled());
            }
            if (model.wasPropertyExplicitlySet("crlCheckOnOCSPFailureEnabled")) {
                this.crlCheckOnOCSPFailureEnabled(model.getCrlCheckOnOCSPFailureEnabled());
            }
            if (model.wasPropertyExplicitlySet("crlLocation")) {
                this.crlLocation(model.getCrlLocation());
            }
            if (model.wasPropertyExplicitlySet("crlReloadDuration")) {
                this.crlReloadDuration(model.getCrlReloadDuration());
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

    /**
     * X509 Certificate Matching Attribute
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certMatchAttribute")
    private final String certMatchAttribute;

    /**
     * X509 Certificate Matching Attribute
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCertMatchAttribute() {
        return certMatchAttribute;
    }

    /**
     * This property specifies the userstore attribute value that must match the incoming
     * certificate attribute.
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userMatchAttribute")
    private final String userMatchAttribute;

    /**
     * This property specifies the userstore attribute value that must match the incoming
     * certificate attribute.
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getUserMatchAttribute() {
        return userMatchAttribute;
    }

    /**
     * Check for specific conditions of other certificate attributes
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("otherCertMatchAttribute")
    private final String otherCertMatchAttribute;

    /**
     * Check for specific conditions of other certificate attributes
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getOtherCertMatchAttribute() {
        return otherCertMatchAttribute;
    }

    /**
     * Certificate alias list to create a chain for the incoming client certificate
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signingCertificateChain")
    private final java.util.List<String> signingCertificateChain;

    /**
     * Certificate alias list to create a chain for the incoming client certificate
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getSigningCertificateChain() {
        return signingCertificateChain;
    }

    /**
     * Set to true to enable OCSP Validation
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocspEnabled")
    private final Boolean ocspEnabled;

    /**
     * Set to true to enable OCSP Validation
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getOcspEnabled() {
        return ocspEnabled;
    }

    /**
     * This property specifies the OCSP Server alias name
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocspServerName")
    private final String ocspServerName;

    /**
     * This property specifies the OCSP Server alias name
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getOcspServerName() {
        return ocspServerName;
    }

    /**
     * This property specifies OCSP Responder URL.
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocspResponderURL")
    private final String ocspResponderURL;

    /**
     * This property specifies OCSP Responder URL.
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getOcspResponderURL() {
        return ocspResponderURL;
    }

    /**
     * Allow access if OCSP response is UNKNOWN or OCSP Responder does not respond within the
     * timeout duration
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocspAllowUnknownResponseStatus")
    private final Boolean ocspAllowUnknownResponseStatus;

    /**
     * Allow access if OCSP response is UNKNOWN or OCSP Responder does not respond within the
     * timeout duration
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getOcspAllowUnknownResponseStatus() {
        return ocspAllowUnknownResponseStatus;
    }

    /**
     * Revalidate OCSP status for user after X hours
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 24 - idcsMinValue: 0 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocspRevalidateTime")
    private final Integer ocspRevalidateTime;

    /**
     * Revalidate OCSP status for user after X hours
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 24 - idcsMinValue: 0 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getOcspRevalidateTime() {
        return ocspRevalidateTime;
    }

    /**
     * Describes if the OCSP response is signed
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocspEnableSignedResponse")
    private final Boolean ocspEnableSignedResponse;

    /**
     * Describes if the OCSP response is signed
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getOcspEnableSignedResponse() {
        return ocspEnableSignedResponse;
    }

    /**
     * OCSP Trusted Certificate Chain
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocspTrustCertChain")
    private final java.util.List<String> ocspTrustCertChain;

    /**
     * OCSP Trusted Certificate Chain
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getOcspTrustCertChain() {
        return ocspTrustCertChain;
    }

    /**
     * Set to true to enable CRL Validation
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crlEnabled")
    private final Boolean crlEnabled;

    /**
     * Set to true to enable CRL Validation
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getCrlEnabled() {
        return crlEnabled;
    }

    /**
     * Fallback on CRL Validation if OCSP fails.
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crlCheckOnOCSPFailureEnabled")
    private final Boolean crlCheckOnOCSPFailureEnabled;

    /**
     * Fallback on CRL Validation if OCSP fails.
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getCrlCheckOnOCSPFailureEnabled() {
        return crlCheckOnOCSPFailureEnabled;
    }

    /**
     * CRL Location URL
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crlLocation")
    private final String crlLocation;

    /**
     * CRL Location URL
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCrlLocation() {
        return crlLocation;
    }

    /**
     * Fetch the CRL contents every X minutes
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crlReloadDuration")
    private final Integer crlReloadDuration;

    /**
     * Fetch the CRL contents every X minutes
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getCrlReloadDuration() {
        return crlReloadDuration;
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
        sb.append("ExtensionX509IdentityProvider(");
        sb.append("super=").append(super.toString());
        sb.append("certMatchAttribute=").append(String.valueOf(this.certMatchAttribute));
        sb.append(", userMatchAttribute=").append(String.valueOf(this.userMatchAttribute));
        sb.append(", otherCertMatchAttribute=")
                .append(String.valueOf(this.otherCertMatchAttribute));
        sb.append(", signingCertificateChain=")
                .append(String.valueOf(this.signingCertificateChain));
        sb.append(", ocspEnabled=").append(String.valueOf(this.ocspEnabled));
        sb.append(", ocspServerName=").append(String.valueOf(this.ocspServerName));
        sb.append(", ocspResponderURL=").append(String.valueOf(this.ocspResponderURL));
        sb.append(", ocspAllowUnknownResponseStatus=")
                .append(String.valueOf(this.ocspAllowUnknownResponseStatus));
        sb.append(", ocspRevalidateTime=").append(String.valueOf(this.ocspRevalidateTime));
        sb.append(", ocspEnableSignedResponse=")
                .append(String.valueOf(this.ocspEnableSignedResponse));
        sb.append(", ocspTrustCertChain=").append(String.valueOf(this.ocspTrustCertChain));
        sb.append(", crlEnabled=").append(String.valueOf(this.crlEnabled));
        sb.append(", crlCheckOnOCSPFailureEnabled=")
                .append(String.valueOf(this.crlCheckOnOCSPFailureEnabled));
        sb.append(", crlLocation=").append(String.valueOf(this.crlLocation));
        sb.append(", crlReloadDuration=").append(String.valueOf(this.crlReloadDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionX509IdentityProvider)) {
            return false;
        }

        ExtensionX509IdentityProvider other = (ExtensionX509IdentityProvider) o;
        return java.util.Objects.equals(this.certMatchAttribute, other.certMatchAttribute)
                && java.util.Objects.equals(this.userMatchAttribute, other.userMatchAttribute)
                && java.util.Objects.equals(
                        this.otherCertMatchAttribute, other.otherCertMatchAttribute)
                && java.util.Objects.equals(
                        this.signingCertificateChain, other.signingCertificateChain)
                && java.util.Objects.equals(this.ocspEnabled, other.ocspEnabled)
                && java.util.Objects.equals(this.ocspServerName, other.ocspServerName)
                && java.util.Objects.equals(this.ocspResponderURL, other.ocspResponderURL)
                && java.util.Objects.equals(
                        this.ocspAllowUnknownResponseStatus, other.ocspAllowUnknownResponseStatus)
                && java.util.Objects.equals(this.ocspRevalidateTime, other.ocspRevalidateTime)
                && java.util.Objects.equals(
                        this.ocspEnableSignedResponse, other.ocspEnableSignedResponse)
                && java.util.Objects.equals(this.ocspTrustCertChain, other.ocspTrustCertChain)
                && java.util.Objects.equals(this.crlEnabled, other.crlEnabled)
                && java.util.Objects.equals(
                        this.crlCheckOnOCSPFailureEnabled, other.crlCheckOnOCSPFailureEnabled)
                && java.util.Objects.equals(this.crlLocation, other.crlLocation)
                && java.util.Objects.equals(this.crlReloadDuration, other.crlReloadDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.certMatchAttribute == null
                                ? 43
                                : this.certMatchAttribute.hashCode());
        result =
                (result * PRIME)
                        + (this.userMatchAttribute == null
                                ? 43
                                : this.userMatchAttribute.hashCode());
        result =
                (result * PRIME)
                        + (this.otherCertMatchAttribute == null
                                ? 43
                                : this.otherCertMatchAttribute.hashCode());
        result =
                (result * PRIME)
                        + (this.signingCertificateChain == null
                                ? 43
                                : this.signingCertificateChain.hashCode());
        result = (result * PRIME) + (this.ocspEnabled == null ? 43 : this.ocspEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspServerName == null ? 43 : this.ocspServerName.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspResponderURL == null ? 43 : this.ocspResponderURL.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspAllowUnknownResponseStatus == null
                                ? 43
                                : this.ocspAllowUnknownResponseStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspRevalidateTime == null
                                ? 43
                                : this.ocspRevalidateTime.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspEnableSignedResponse == null
                                ? 43
                                : this.ocspEnableSignedResponse.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspTrustCertChain == null
                                ? 43
                                : this.ocspTrustCertChain.hashCode());
        result = (result * PRIME) + (this.crlEnabled == null ? 43 : this.crlEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.crlCheckOnOCSPFailureEnabled == null
                                ? 43
                                : this.crlCheckOnOCSPFailureEnabled.hashCode());
        result = (result * PRIME) + (this.crlLocation == null ? 43 : this.crlLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.crlReloadDuration == null ? 43 : this.crlReloadDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
