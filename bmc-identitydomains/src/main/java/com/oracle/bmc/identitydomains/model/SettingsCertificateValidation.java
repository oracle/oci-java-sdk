/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Certificate Validation Config
 * <p>
 **Added In:** 2010242156
 * <p>
 **SCIM++ Properties:**
 *  - caseExact: false
 *  - multiValued: false
 *  - mutability: readWrite
 *  - required: false
 *  - returned: default
 *  - type: complex
 *  - uniqueness: none
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SettingsCertificateValidation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SettingsCertificateValidation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "crlEnabled",
        "crlCheckOnOCSPFailureEnabled",
        "crlLocation",
        "crlRefreshInterval",
        "ocspEnabled",
        "ocspUnknownResponseStatusAllowed",
        "ocspResponderURL",
        "ocspSettingsResponderURLPreferred",
        "ocspTimeoutDuration",
        "ocspSigningCertificateAlias"
    })
    public SettingsCertificateValidation(
            Boolean crlEnabled,
            Boolean crlCheckOnOCSPFailureEnabled,
            String crlLocation,
            Integer crlRefreshInterval,
            Boolean ocspEnabled,
            Boolean ocspUnknownResponseStatusAllowed,
            String ocspResponderURL,
            Boolean ocspSettingsResponderURLPreferred,
            Integer ocspTimeoutDuration,
            String ocspSigningCertificateAlias) {
        super();
        this.crlEnabled = crlEnabled;
        this.crlCheckOnOCSPFailureEnabled = crlCheckOnOCSPFailureEnabled;
        this.crlLocation = crlLocation;
        this.crlRefreshInterval = crlRefreshInterval;
        this.ocspEnabled = ocspEnabled;
        this.ocspUnknownResponseStatusAllowed = ocspUnknownResponseStatusAllowed;
        this.ocspResponderURL = ocspResponderURL;
        this.ocspSettingsResponderURLPreferred = ocspSettingsResponderURLPreferred;
        this.ocspTimeoutDuration = ocspTimeoutDuration;
        this.ocspSigningCertificateAlias = ocspSigningCertificateAlias;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * CRL is enabled Configuration
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("crlEnabled")
        private Boolean crlEnabled;

        /**
         * CRL is enabled Configuration
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param crlEnabled the value to set
         * @return this builder
         **/
        public Builder crlEnabled(Boolean crlEnabled) {
            this.crlEnabled = crlEnabled;
            this.__explicitlySet__.add("crlEnabled");
            return this;
        }
        /**
         * Use CRL as Fallback.
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("crlCheckOnOCSPFailureEnabled")
        private Boolean crlCheckOnOCSPFailureEnabled;

        /**
         * Use CRL as Fallback.
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param crlCheckOnOCSPFailureEnabled the value to set
         * @return this builder
         **/
        public Builder crlCheckOnOCSPFailureEnabled(Boolean crlCheckOnOCSPFailureEnabled) {
            this.crlCheckOnOCSPFailureEnabled = crlCheckOnOCSPFailureEnabled;
            this.__explicitlySet__.add("crlCheckOnOCSPFailureEnabled");
            return this;
        }
        /**
         * CRL Location.
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("crlLocation")
        private String crlLocation;

        /**
         * CRL Location.
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param crlLocation the value to set
         * @return this builder
         **/
        public Builder crlLocation(String crlLocation) {
            this.crlLocation = crlLocation;
            this.__explicitlySet__.add("crlLocation");
            return this;
        }
        /**
         * The CRL refresh interval in minutes
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("crlRefreshInterval")
        private Integer crlRefreshInterval;

        /**
         * The CRL refresh interval in minutes
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param crlRefreshInterval the value to set
         * @return this builder
         **/
        public Builder crlRefreshInterval(Integer crlRefreshInterval) {
            this.crlRefreshInterval = crlRefreshInterval;
            this.__explicitlySet__.add("crlRefreshInterval");
            return this;
        }
        /**
         * OCSP is enabled Configuration
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocspEnabled")
        private Boolean ocspEnabled;

        /**
         * OCSP is enabled Configuration
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param ocspEnabled the value to set
         * @return this builder
         **/
        public Builder ocspEnabled(Boolean ocspEnabled) {
            this.ocspEnabled = ocspEnabled;
            this.__explicitlySet__.add("ocspEnabled");
            return this;
        }
        /**
         * OCSP Accept unknown response status from ocsp responder.
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocspUnknownResponseStatusAllowed")
        private Boolean ocspUnknownResponseStatusAllowed;

        /**
         * OCSP Accept unknown response status from ocsp responder.
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param ocspUnknownResponseStatusAllowed the value to set
         * @return this builder
         **/
        public Builder ocspUnknownResponseStatusAllowed(Boolean ocspUnknownResponseStatusAllowed) {
            this.ocspUnknownResponseStatusAllowed = ocspUnknownResponseStatusAllowed;
            this.__explicitlySet__.add("ocspUnknownResponseStatusAllowed");
            return this;
        }
        /**
         * OCSP Responder URL
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocspResponderURL")
        private String ocspResponderURL;

        /**
         * OCSP Responder URL
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param ocspResponderURL the value to set
         * @return this builder
         **/
        public Builder ocspResponderURL(String ocspResponderURL) {
            this.ocspResponderURL = ocspResponderURL;
            this.__explicitlySet__.add("ocspResponderURL");
            return this;
        }
        /**
         * This setting says, OCSP Responder URL present in the issued certificate must be used. Otherwise, OCSP Responder URL from IDP or Settings.
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocspSettingsResponderURLPreferred")
        private Boolean ocspSettingsResponderURLPreferred;

        /**
         * This setting says, OCSP Responder URL present in the issued certificate must be used. Otherwise, OCSP Responder URL from IDP or Settings.
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param ocspSettingsResponderURLPreferred the value to set
         * @return this builder
         **/
        public Builder ocspSettingsResponderURLPreferred(
                Boolean ocspSettingsResponderURLPreferred) {
            this.ocspSettingsResponderURLPreferred = ocspSettingsResponderURLPreferred;
            this.__explicitlySet__.add("ocspSettingsResponderURLPreferred");
            return this;
        }
        /**
         * The OCSP Timeout duration in minutes
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 10
         *  - idcsMinValue: 1
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocspTimeoutDuration")
        private Integer ocspTimeoutDuration;

        /**
         * The OCSP Timeout duration in minutes
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 10
         *  - idcsMinValue: 1
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param ocspTimeoutDuration the value to set
         * @return this builder
         **/
        public Builder ocspTimeoutDuration(Integer ocspTimeoutDuration) {
            this.ocspTimeoutDuration = ocspTimeoutDuration;
            this.__explicitlySet__.add("ocspTimeoutDuration");
            return this;
        }
        /**
         * OCSP Signing Certificate Alias
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocspSigningCertificateAlias")
        private String ocspSigningCertificateAlias;

        /**
         * OCSP Signing Certificate Alias
         * <p>
         **Added In:** 2010242156
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param ocspSigningCertificateAlias the value to set
         * @return this builder
         **/
        public Builder ocspSigningCertificateAlias(String ocspSigningCertificateAlias) {
            this.ocspSigningCertificateAlias = ocspSigningCertificateAlias;
            this.__explicitlySet__.add("ocspSigningCertificateAlias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SettingsCertificateValidation build() {
            SettingsCertificateValidation model =
                    new SettingsCertificateValidation(
                            this.crlEnabled,
                            this.crlCheckOnOCSPFailureEnabled,
                            this.crlLocation,
                            this.crlRefreshInterval,
                            this.ocspEnabled,
                            this.ocspUnknownResponseStatusAllowed,
                            this.ocspResponderURL,
                            this.ocspSettingsResponderURLPreferred,
                            this.ocspTimeoutDuration,
                            this.ocspSigningCertificateAlias);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SettingsCertificateValidation model) {
            if (model.wasPropertyExplicitlySet("crlEnabled")) {
                this.crlEnabled(model.getCrlEnabled());
            }
            if (model.wasPropertyExplicitlySet("crlCheckOnOCSPFailureEnabled")) {
                this.crlCheckOnOCSPFailureEnabled(model.getCrlCheckOnOCSPFailureEnabled());
            }
            if (model.wasPropertyExplicitlySet("crlLocation")) {
                this.crlLocation(model.getCrlLocation());
            }
            if (model.wasPropertyExplicitlySet("crlRefreshInterval")) {
                this.crlRefreshInterval(model.getCrlRefreshInterval());
            }
            if (model.wasPropertyExplicitlySet("ocspEnabled")) {
                this.ocspEnabled(model.getOcspEnabled());
            }
            if (model.wasPropertyExplicitlySet("ocspUnknownResponseStatusAllowed")) {
                this.ocspUnknownResponseStatusAllowed(model.getOcspUnknownResponseStatusAllowed());
            }
            if (model.wasPropertyExplicitlySet("ocspResponderURL")) {
                this.ocspResponderURL(model.getOcspResponderURL());
            }
            if (model.wasPropertyExplicitlySet("ocspSettingsResponderURLPreferred")) {
                this.ocspSettingsResponderURLPreferred(
                        model.getOcspSettingsResponderURLPreferred());
            }
            if (model.wasPropertyExplicitlySet("ocspTimeoutDuration")) {
                this.ocspTimeoutDuration(model.getOcspTimeoutDuration());
            }
            if (model.wasPropertyExplicitlySet("ocspSigningCertificateAlias")) {
                this.ocspSigningCertificateAlias(model.getOcspSigningCertificateAlias());
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
     * CRL is enabled Configuration
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crlEnabled")
    private final Boolean crlEnabled;

    /**
     * CRL is enabled Configuration
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCrlEnabled() {
        return crlEnabled;
    }

    /**
     * Use CRL as Fallback.
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crlCheckOnOCSPFailureEnabled")
    private final Boolean crlCheckOnOCSPFailureEnabled;

    /**
     * Use CRL as Fallback.
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCrlCheckOnOCSPFailureEnabled() {
        return crlCheckOnOCSPFailureEnabled;
    }

    /**
     * CRL Location.
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crlLocation")
    private final String crlLocation;

    /**
     * CRL Location.
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getCrlLocation() {
        return crlLocation;
    }

    /**
     * The CRL refresh interval in minutes
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crlRefreshInterval")
    private final Integer crlRefreshInterval;

    /**
     * The CRL refresh interval in minutes
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getCrlRefreshInterval() {
        return crlRefreshInterval;
    }

    /**
     * OCSP is enabled Configuration
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocspEnabled")
    private final Boolean ocspEnabled;

    /**
     * OCSP is enabled Configuration
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getOcspEnabled() {
        return ocspEnabled;
    }

    /**
     * OCSP Accept unknown response status from ocsp responder.
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocspUnknownResponseStatusAllowed")
    private final Boolean ocspUnknownResponseStatusAllowed;

    /**
     * OCSP Accept unknown response status from ocsp responder.
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getOcspUnknownResponseStatusAllowed() {
        return ocspUnknownResponseStatusAllowed;
    }

    /**
     * OCSP Responder URL
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocspResponderURL")
    private final String ocspResponderURL;

    /**
     * OCSP Responder URL
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getOcspResponderURL() {
        return ocspResponderURL;
    }

    /**
     * This setting says, OCSP Responder URL present in the issued certificate must be used. Otherwise, OCSP Responder URL from IDP or Settings.
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocspSettingsResponderURLPreferred")
    private final Boolean ocspSettingsResponderURLPreferred;

    /**
     * This setting says, OCSP Responder URL present in the issued certificate must be used. Otherwise, OCSP Responder URL from IDP or Settings.
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getOcspSettingsResponderURLPreferred() {
        return ocspSettingsResponderURLPreferred;
    }

    /**
     * The OCSP Timeout duration in minutes
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 10
     *  - idcsMinValue: 1
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocspTimeoutDuration")
    private final Integer ocspTimeoutDuration;

    /**
     * The OCSP Timeout duration in minutes
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 10
     *  - idcsMinValue: 1
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getOcspTimeoutDuration() {
        return ocspTimeoutDuration;
    }

    /**
     * OCSP Signing Certificate Alias
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocspSigningCertificateAlias")
    private final String ocspSigningCertificateAlias;

    /**
     * OCSP Signing Certificate Alias
     * <p>
     **Added In:** 2010242156
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getOcspSigningCertificateAlias() {
        return ocspSigningCertificateAlias;
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
        sb.append("SettingsCertificateValidation(");
        sb.append("super=").append(super.toString());
        sb.append("crlEnabled=").append(String.valueOf(this.crlEnabled));
        sb.append(", crlCheckOnOCSPFailureEnabled=")
                .append(String.valueOf(this.crlCheckOnOCSPFailureEnabled));
        sb.append(", crlLocation=").append(String.valueOf(this.crlLocation));
        sb.append(", crlRefreshInterval=").append(String.valueOf(this.crlRefreshInterval));
        sb.append(", ocspEnabled=").append(String.valueOf(this.ocspEnabled));
        sb.append(", ocspUnknownResponseStatusAllowed=")
                .append(String.valueOf(this.ocspUnknownResponseStatusAllowed));
        sb.append(", ocspResponderURL=").append(String.valueOf(this.ocspResponderURL));
        sb.append(", ocspSettingsResponderURLPreferred=")
                .append(String.valueOf(this.ocspSettingsResponderURLPreferred));
        sb.append(", ocspTimeoutDuration=").append(String.valueOf(this.ocspTimeoutDuration));
        sb.append(", ocspSigningCertificateAlias=")
                .append(String.valueOf(this.ocspSigningCertificateAlias));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SettingsCertificateValidation)) {
            return false;
        }

        SettingsCertificateValidation other = (SettingsCertificateValidation) o;
        return java.util.Objects.equals(this.crlEnabled, other.crlEnabled)
                && java.util.Objects.equals(
                        this.crlCheckOnOCSPFailureEnabled, other.crlCheckOnOCSPFailureEnabled)
                && java.util.Objects.equals(this.crlLocation, other.crlLocation)
                && java.util.Objects.equals(this.crlRefreshInterval, other.crlRefreshInterval)
                && java.util.Objects.equals(this.ocspEnabled, other.ocspEnabled)
                && java.util.Objects.equals(
                        this.ocspUnknownResponseStatusAllowed,
                        other.ocspUnknownResponseStatusAllowed)
                && java.util.Objects.equals(this.ocspResponderURL, other.ocspResponderURL)
                && java.util.Objects.equals(
                        this.ocspSettingsResponderURLPreferred,
                        other.ocspSettingsResponderURLPreferred)
                && java.util.Objects.equals(this.ocspTimeoutDuration, other.ocspTimeoutDuration)
                && java.util.Objects.equals(
                        this.ocspSigningCertificateAlias, other.ocspSigningCertificateAlias)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.crlEnabled == null ? 43 : this.crlEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.crlCheckOnOCSPFailureEnabled == null
                                ? 43
                                : this.crlCheckOnOCSPFailureEnabled.hashCode());
        result = (result * PRIME) + (this.crlLocation == null ? 43 : this.crlLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.crlRefreshInterval == null
                                ? 43
                                : this.crlRefreshInterval.hashCode());
        result = (result * PRIME) + (this.ocspEnabled == null ? 43 : this.ocspEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspUnknownResponseStatusAllowed == null
                                ? 43
                                : this.ocspUnknownResponseStatusAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspResponderURL == null ? 43 : this.ocspResponderURL.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspSettingsResponderURLPreferred == null
                                ? 43
                                : this.ocspSettingsResponderURLPreferred.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspTimeoutDuration == null
                                ? 43
                                : this.ocspTimeoutDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.ocspSigningCertificateAlias == null
                                ? 43
                                : this.ocspSigningCertificateAlias.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
