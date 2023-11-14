/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes specific to Apps that represent instances of Radius App. <br>
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
        builder = AppExtensionRadiusAppApp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppExtensionRadiusAppApp
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clientIP",
        "port",
        "secretKey",
        "secretKeyTemporary",
        "includeGroupInResponse",
        "captureClientIp",
        "typeOfRadiusApp",
        "endUserIPAttribute",
        "radiusVendorSpecificId",
        "countryCodeResponseAttributeId",
        "groupMembershipRadiusAttribute",
        "responseFormat",
        "responseFormatDelimiter",
        "groupNameFormat",
        "passwordAndOtpTogether",
        "groupMembershipToReturn"
    })
    public AppExtensionRadiusAppApp(
            String clientIP,
            String port,
            String secretKey,
            String secretKeyTemporary,
            Boolean includeGroupInResponse,
            Boolean captureClientIp,
            String typeOfRadiusApp,
            String endUserIPAttribute,
            String radiusVendorSpecificId,
            String countryCodeResponseAttributeId,
            String groupMembershipRadiusAttribute,
            String responseFormat,
            String responseFormatDelimiter,
            String groupNameFormat,
            Boolean passwordAndOtpTogether,
            java.util.List<AppGroupMembershipToReturn> groupMembershipToReturn) {
        super();
        this.clientIP = clientIP;
        this.port = port;
        this.secretKey = secretKey;
        this.secretKeyTemporary = secretKeyTemporary;
        this.includeGroupInResponse = includeGroupInResponse;
        this.captureClientIp = captureClientIp;
        this.typeOfRadiusApp = typeOfRadiusApp;
        this.endUserIPAttribute = endUserIPAttribute;
        this.radiusVendorSpecificId = radiusVendorSpecificId;
        this.countryCodeResponseAttributeId = countryCodeResponseAttributeId;
        this.groupMembershipRadiusAttribute = groupMembershipRadiusAttribute;
        this.responseFormat = responseFormat;
        this.responseFormatDelimiter = responseFormatDelimiter;
        this.groupNameFormat = groupNameFormat;
        this.passwordAndOtpTogether = passwordAndOtpTogether;
        this.groupMembershipToReturn = groupMembershipToReturn;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This is the IP address of the RADIUS Client like Oracle Database server. It can be only
         * IP address and not hostname.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientIP")
        private String clientIP;

        /**
         * This is the IP address of the RADIUS Client like Oracle Database server. It can be only
         * IP address and not hostname.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string
         *
         * @param clientIP the value to set
         * @return this builder
         */
        public Builder clientIP(String clientIP) {
            this.clientIP = clientIP;
            this.__explicitlySet__.add("clientIP");
            return this;
        }
        /**
         * This is the port of RADIUS Proxy which RADIUS client will connect to.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

        /**
         * This is the port of RADIUS Proxy which RADIUS client will connect to.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(String port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * Secret key used to secure communication between RADIUS Proxy and RADIUS client
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
        private String secretKey;

        /**
         * Secret key used to secure communication between RADIUS Proxy and RADIUS client
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string
         *
         * @param secretKey the value to set
         * @return this builder
         */
        public Builder secretKey(String secretKey) {
            this.secretKey = secretKey;
            this.__explicitlySet__.add("secretKey");
            return this;
        }
        /**
         * Secret key used to secure communication between RADIUS Proxy and RADIUS client. This will
         * be available only for few releases for an internal migration requirement. Use secretKey
         * attribute instead of this attribute for all other requirements.
         *
         * <p>*Added In:** 2306131901
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive:
         * encrypt - multiValued: false - mutability: readWrite - required: false - returned: never
         * - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretKeyTemporary")
        private String secretKeyTemporary;

        /**
         * Secret key used to secure communication between RADIUS Proxy and RADIUS client. This will
         * be available only for few releases for an internal migration requirement. Use secretKey
         * attribute instead of this attribute for all other requirements.
         *
         * <p>*Added In:** 2306131901
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive:
         * encrypt - multiValued: false - mutability: readWrite - required: false - returned: never
         * - type: string
         *
         * @param secretKeyTemporary the value to set
         * @return this builder
         */
        public Builder secretKeyTemporary(String secretKeyTemporary) {
            this.secretKeyTemporary = secretKeyTemporary;
            this.__explicitlySet__.add("secretKeyTemporary");
            return this;
        }
        /**
         * Indicates to include groups in RADIUS response
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("includeGroupInResponse")
        private Boolean includeGroupInResponse;

        /**
         * Indicates to include groups in RADIUS response
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: boolean
         *
         * @param includeGroupInResponse the value to set
         * @return this builder
         */
        public Builder includeGroupInResponse(Boolean includeGroupInResponse) {
            this.includeGroupInResponse = includeGroupInResponse;
            this.__explicitlySet__.add("includeGroupInResponse");
            return this;
        }
        /**
         * If true, capture the client IP address from the RADIUS request packet. IP Address is used
         * for auditing, policy-evaluation and country-code calculation.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("captureClientIp")
        private Boolean captureClientIp;

        /**
         * If true, capture the client IP address from the RADIUS request packet. IP Address is used
         * for auditing, policy-evaluation and country-code calculation.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean
         *
         * @param captureClientIp the value to set
         * @return this builder
         */
        public Builder captureClientIp(Boolean captureClientIp) {
            this.captureClientIp = captureClientIp;
            this.__explicitlySet__.add("captureClientIp");
            return this;
        }
        /**
         * Value consists of type of RADIUS App. Type can be Oracle Database, VPN etc
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("typeOfRadiusApp")
        private String typeOfRadiusApp;

        /**
         * Value consists of type of RADIUS App. Type can be Oracle Database, VPN etc
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string
         *
         * @param typeOfRadiusApp the value to set
         * @return this builder
         */
        public Builder typeOfRadiusApp(String typeOfRadiusApp) {
            this.typeOfRadiusApp = typeOfRadiusApp;
            this.__explicitlySet__.add("typeOfRadiusApp");
            return this;
        }
        /**
         * The name of the attribute that contains the Internet Protocol address of the end-user.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endUserIPAttribute")
        private String endUserIPAttribute;

        /**
         * The name of the attribute that contains the Internet Protocol address of the end-user.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string
         *
         * @param endUserIPAttribute the value to set
         * @return this builder
         */
        public Builder endUserIPAttribute(String endUserIPAttribute) {
            this.endUserIPAttribute = endUserIPAttribute;
            this.__explicitlySet__.add("endUserIPAttribute");
            return this;
        }
        /**
         * ID used to identify a particular vendor.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("radiusVendorSpecificId")
        private String radiusVendorSpecificId;

        /**
         * ID used to identify a particular vendor.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string
         *
         * @param radiusVendorSpecificId the value to set
         * @return this builder
         */
        public Builder radiusVendorSpecificId(String radiusVendorSpecificId) {
            this.radiusVendorSpecificId = radiusVendorSpecificId;
            this.__explicitlySet__.add("radiusVendorSpecificId");
            return this;
        }
        /**
         * Vendor-specific identifier of the attribute in the RADIUS response that will contain the
         * end-user's country code. This is an integer-value in the range 1 to 255
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("countryCodeResponseAttributeId")
        private String countryCodeResponseAttributeId;

        /**
         * Vendor-specific identifier of the attribute in the RADIUS response that will contain the
         * end-user's country code. This is an integer-value in the range 1 to 255
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string
         *
         * @param countryCodeResponseAttributeId the value to set
         * @return this builder
         */
        public Builder countryCodeResponseAttributeId(String countryCodeResponseAttributeId) {
            this.countryCodeResponseAttributeId = countryCodeResponseAttributeId;
            this.__explicitlySet__.add("countryCodeResponseAttributeId");
            return this;
        }
        /**
         * RADIUS attribute that RADIUS-enabled system uses to pass the group membership
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipRadiusAttribute")
        private String groupMembershipRadiusAttribute;

        /**
         * RADIUS attribute that RADIUS-enabled system uses to pass the group membership
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string
         *
         * @param groupMembershipRadiusAttribute the value to set
         * @return this builder
         */
        public Builder groupMembershipRadiusAttribute(String groupMembershipRadiusAttribute) {
            this.groupMembershipRadiusAttribute = groupMembershipRadiusAttribute;
            this.__explicitlySet__.add("groupMembershipRadiusAttribute");
            return this;
        }
        /**
         * Configure the responseFormat based on vendor in order to pass it to RADIUS infra
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("responseFormat")
        private String responseFormat;

        /**
         * Configure the responseFormat based on vendor in order to pass it to RADIUS infra
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string
         *
         * @param responseFormat the value to set
         * @return this builder
         */
        public Builder responseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            this.__explicitlySet__.add("responseFormat");
            return this;
        }
        /**
         * The delimiter used if group membership responseFormat is a delimited list instead of
         * repeating attributes
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("responseFormatDelimiter")
        private String responseFormatDelimiter;

        /**
         * The delimiter used if group membership responseFormat is a delimited list instead of
         * repeating attributes
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string
         *
         * @param responseFormatDelimiter the value to set
         * @return this builder
         */
        public Builder responseFormatDelimiter(String responseFormatDelimiter) {
            this.responseFormatDelimiter = responseFormatDelimiter;
            this.__explicitlySet__.add("responseFormatDelimiter");
            return this;
        }
        /**
         * Configure the groupNameFormat based on vendor in order to pass it to RADIUS infra
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupNameFormat")
        private String groupNameFormat;

        /**
         * Configure the groupNameFormat based on vendor in order to pass it to RADIUS infra
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string
         *
         * @param groupNameFormat the value to set
         * @return this builder
         */
        public Builder groupNameFormat(String groupNameFormat) {
            this.groupNameFormat = groupNameFormat;
            this.__explicitlySet__.add("groupNameFormat");
            return this;
        }
        /**
         * Indicates if password and OTP are passed in the same sign-in request or not.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordAndOtpTogether")
        private Boolean passwordAndOtpTogether;

        /**
         * Indicates if password and OTP are passed in the same sign-in request or not.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean
         *
         * @param passwordAndOtpTogether the value to set
         * @return this builder
         */
        public Builder passwordAndOtpTogether(Boolean passwordAndOtpTogether) {
            this.passwordAndOtpTogether = passwordAndOtpTogether;
            this.__explicitlySet__.add("passwordAndOtpTogether");
            return this;
        }
        /**
         * In a successful authentication response, Oracle Identity Cloud Service will pass user's
         * group information restricted to groups persisted in this attribute, in the specified
         * RADIUS attribute.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipToReturn")
        private java.util.List<AppGroupMembershipToReturn> groupMembershipToReturn;

        /**
         * In a successful authentication response, Oracle Identity Cloud Service will pass user's
         * group information restricted to groups persisted in this attribute, in the specified
         * RADIUS attribute.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param groupMembershipToReturn the value to set
         * @return this builder
         */
        public Builder groupMembershipToReturn(
                java.util.List<AppGroupMembershipToReturn> groupMembershipToReturn) {
            this.groupMembershipToReturn = groupMembershipToReturn;
            this.__explicitlySet__.add("groupMembershipToReturn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionRadiusAppApp build() {
            AppExtensionRadiusAppApp model =
                    new AppExtensionRadiusAppApp(
                            this.clientIP,
                            this.port,
                            this.secretKey,
                            this.secretKeyTemporary,
                            this.includeGroupInResponse,
                            this.captureClientIp,
                            this.typeOfRadiusApp,
                            this.endUserIPAttribute,
                            this.radiusVendorSpecificId,
                            this.countryCodeResponseAttributeId,
                            this.groupMembershipRadiusAttribute,
                            this.responseFormat,
                            this.responseFormatDelimiter,
                            this.groupNameFormat,
                            this.passwordAndOtpTogether,
                            this.groupMembershipToReturn);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionRadiusAppApp model) {
            if (model.wasPropertyExplicitlySet("clientIP")) {
                this.clientIP(model.getClientIP());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("secretKey")) {
                this.secretKey(model.getSecretKey());
            }
            if (model.wasPropertyExplicitlySet("secretKeyTemporary")) {
                this.secretKeyTemporary(model.getSecretKeyTemporary());
            }
            if (model.wasPropertyExplicitlySet("includeGroupInResponse")) {
                this.includeGroupInResponse(model.getIncludeGroupInResponse());
            }
            if (model.wasPropertyExplicitlySet("captureClientIp")) {
                this.captureClientIp(model.getCaptureClientIp());
            }
            if (model.wasPropertyExplicitlySet("typeOfRadiusApp")) {
                this.typeOfRadiusApp(model.getTypeOfRadiusApp());
            }
            if (model.wasPropertyExplicitlySet("endUserIPAttribute")) {
                this.endUserIPAttribute(model.getEndUserIPAttribute());
            }
            if (model.wasPropertyExplicitlySet("radiusVendorSpecificId")) {
                this.radiusVendorSpecificId(model.getRadiusVendorSpecificId());
            }
            if (model.wasPropertyExplicitlySet("countryCodeResponseAttributeId")) {
                this.countryCodeResponseAttributeId(model.getCountryCodeResponseAttributeId());
            }
            if (model.wasPropertyExplicitlySet("groupMembershipRadiusAttribute")) {
                this.groupMembershipRadiusAttribute(model.getGroupMembershipRadiusAttribute());
            }
            if (model.wasPropertyExplicitlySet("responseFormat")) {
                this.responseFormat(model.getResponseFormat());
            }
            if (model.wasPropertyExplicitlySet("responseFormatDelimiter")) {
                this.responseFormatDelimiter(model.getResponseFormatDelimiter());
            }
            if (model.wasPropertyExplicitlySet("groupNameFormat")) {
                this.groupNameFormat(model.getGroupNameFormat());
            }
            if (model.wasPropertyExplicitlySet("passwordAndOtpTogether")) {
                this.passwordAndOtpTogether(model.getPasswordAndOtpTogether());
            }
            if (model.wasPropertyExplicitlySet("groupMembershipToReturn")) {
                this.groupMembershipToReturn(model.getGroupMembershipToReturn());
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
     * This is the IP address of the RADIUS Client like Oracle Database server. It can be only IP
     * address and not hostname.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientIP")
    private final String clientIP;

    /**
     * This is the IP address of the RADIUS Client like Oracle Database server. It can be only IP
     * address and not hostname.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string
     *
     * @return the value
     */
    public String getClientIP() {
        return clientIP;
    }

    /**
     * This is the port of RADIUS Proxy which RADIUS client will connect to.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final String port;

    /**
     * This is the port of RADIUS Proxy which RADIUS client will connect to.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string
     *
     * @return the value
     */
    public String getPort() {
        return port;
    }

    /**
     * Secret key used to secure communication between RADIUS Proxy and RADIUS client
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
    private final String secretKey;

    /**
     * Secret key used to secure communication between RADIUS Proxy and RADIUS client
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string
     *
     * @return the value
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Secret key used to secure communication between RADIUS Proxy and RADIUS client. This will be
     * available only for few releases for an internal migration requirement. Use secretKey
     * attribute instead of this attribute for all other requirements.
     *
     * <p>*Added In:** 2306131901
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive: encrypt -
     * multiValued: false - mutability: readWrite - required: false - returned: never - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretKeyTemporary")
    private final String secretKeyTemporary;

    /**
     * Secret key used to secure communication between RADIUS Proxy and RADIUS client. This will be
     * available only for few releases for an internal migration requirement. Use secretKey
     * attribute instead of this attribute for all other requirements.
     *
     * <p>*Added In:** 2306131901
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive: encrypt -
     * multiValued: false - mutability: readWrite - required: false - returned: never - type: string
     *
     * @return the value
     */
    public String getSecretKeyTemporary() {
        return secretKeyTemporary;
    }

    /**
     * Indicates to include groups in RADIUS response
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("includeGroupInResponse")
    private final Boolean includeGroupInResponse;

    /**
     * Indicates to include groups in RADIUS response
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIncludeGroupInResponse() {
        return includeGroupInResponse;
    }

    /**
     * If true, capture the client IP address from the RADIUS request packet. IP Address is used for
     * auditing, policy-evaluation and country-code calculation.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("captureClientIp")
    private final Boolean captureClientIp;

    /**
     * If true, capture the client IP address from the RADIUS request packet. IP Address is used for
     * auditing, policy-evaluation and country-code calculation.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getCaptureClientIp() {
        return captureClientIp;
    }

    /**
     * Value consists of type of RADIUS App. Type can be Oracle Database, VPN etc
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("typeOfRadiusApp")
    private final String typeOfRadiusApp;

    /**
     * Value consists of type of RADIUS App. Type can be Oracle Database, VPN etc
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getTypeOfRadiusApp() {
        return typeOfRadiusApp;
    }

    /**
     * The name of the attribute that contains the Internet Protocol address of the end-user.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endUserIPAttribute")
    private final String endUserIPAttribute;

    /**
     * The name of the attribute that contains the Internet Protocol address of the end-user.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getEndUserIPAttribute() {
        return endUserIPAttribute;
    }

    /**
     * ID used to identify a particular vendor.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("radiusVendorSpecificId")
    private final String radiusVendorSpecificId;

    /**
     * ID used to identify a particular vendor.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getRadiusVendorSpecificId() {
        return radiusVendorSpecificId;
    }

    /**
     * Vendor-specific identifier of the attribute in the RADIUS response that will contain the
     * end-user's country code. This is an integer-value in the range 1 to 255
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("countryCodeResponseAttributeId")
    private final String countryCodeResponseAttributeId;

    /**
     * Vendor-specific identifier of the attribute in the RADIUS response that will contain the
     * end-user's country code. This is an integer-value in the range 1 to 255
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getCountryCodeResponseAttributeId() {
        return countryCodeResponseAttributeId;
    }

    /**
     * RADIUS attribute that RADIUS-enabled system uses to pass the group membership
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipRadiusAttribute")
    private final String groupMembershipRadiusAttribute;

    /**
     * RADIUS attribute that RADIUS-enabled system uses to pass the group membership
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getGroupMembershipRadiusAttribute() {
        return groupMembershipRadiusAttribute;
    }

    /**
     * Configure the responseFormat based on vendor in order to pass it to RADIUS infra
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responseFormat")
    private final String responseFormat;

    /**
     * Configure the responseFormat based on vendor in order to pass it to RADIUS infra
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getResponseFormat() {
        return responseFormat;
    }

    /**
     * The delimiter used if group membership responseFormat is a delimited list instead of
     * repeating attributes
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responseFormatDelimiter")
    private final String responseFormatDelimiter;

    /**
     * The delimiter used if group membership responseFormat is a delimited list instead of
     * repeating attributes
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getResponseFormatDelimiter() {
        return responseFormatDelimiter;
    }

    /**
     * Configure the groupNameFormat based on vendor in order to pass it to RADIUS infra
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupNameFormat")
    private final String groupNameFormat;

    /**
     * Configure the groupNameFormat based on vendor in order to pass it to RADIUS infra
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getGroupNameFormat() {
        return groupNameFormat;
    }

    /**
     * Indicates if password and OTP are passed in the same sign-in request or not.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordAndOtpTogether")
    private final Boolean passwordAndOtpTogether;

    /**
     * Indicates if password and OTP are passed in the same sign-in request or not.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getPasswordAndOtpTogether() {
        return passwordAndOtpTogether;
    }

    /**
     * In a successful authentication response, Oracle Identity Cloud Service will pass user's group
     * information restricted to groups persisted in this attribute, in the specified RADIUS
     * attribute.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readWrite - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipToReturn")
    private final java.util.List<AppGroupMembershipToReturn> groupMembershipToReturn;

    /**
     * In a successful authentication response, Oracle Identity Cloud Service will pass user's group
     * information restricted to groups persisted in this attribute, in the specified RADIUS
     * attribute.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readWrite - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppGroupMembershipToReturn> getGroupMembershipToReturn() {
        return groupMembershipToReturn;
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
        sb.append("AppExtensionRadiusAppApp(");
        sb.append("super=").append(super.toString());
        sb.append("clientIP=").append(String.valueOf(this.clientIP));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", secretKey=").append(String.valueOf(this.secretKey));
        sb.append(", secretKeyTemporary=").append(String.valueOf(this.secretKeyTemporary));
        sb.append(", includeGroupInResponse=").append(String.valueOf(this.includeGroupInResponse));
        sb.append(", captureClientIp=").append(String.valueOf(this.captureClientIp));
        sb.append(", typeOfRadiusApp=").append(String.valueOf(this.typeOfRadiusApp));
        sb.append(", endUserIPAttribute=").append(String.valueOf(this.endUserIPAttribute));
        sb.append(", radiusVendorSpecificId=").append(String.valueOf(this.radiusVendorSpecificId));
        sb.append(", countryCodeResponseAttributeId=")
                .append(String.valueOf(this.countryCodeResponseAttributeId));
        sb.append(", groupMembershipRadiusAttribute=")
                .append(String.valueOf(this.groupMembershipRadiusAttribute));
        sb.append(", responseFormat=").append(String.valueOf(this.responseFormat));
        sb.append(", responseFormatDelimiter=")
                .append(String.valueOf(this.responseFormatDelimiter));
        sb.append(", groupNameFormat=").append(String.valueOf(this.groupNameFormat));
        sb.append(", passwordAndOtpTogether=").append(String.valueOf(this.passwordAndOtpTogether));
        sb.append(", groupMembershipToReturn=")
                .append(String.valueOf(this.groupMembershipToReturn));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionRadiusAppApp)) {
            return false;
        }

        AppExtensionRadiusAppApp other = (AppExtensionRadiusAppApp) o;
        return java.util.Objects.equals(this.clientIP, other.clientIP)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.secretKey, other.secretKey)
                && java.util.Objects.equals(this.secretKeyTemporary, other.secretKeyTemporary)
                && java.util.Objects.equals(
                        this.includeGroupInResponse, other.includeGroupInResponse)
                && java.util.Objects.equals(this.captureClientIp, other.captureClientIp)
                && java.util.Objects.equals(this.typeOfRadiusApp, other.typeOfRadiusApp)
                && java.util.Objects.equals(this.endUserIPAttribute, other.endUserIPAttribute)
                && java.util.Objects.equals(
                        this.radiusVendorSpecificId, other.radiusVendorSpecificId)
                && java.util.Objects.equals(
                        this.countryCodeResponseAttributeId, other.countryCodeResponseAttributeId)
                && java.util.Objects.equals(
                        this.groupMembershipRadiusAttribute, other.groupMembershipRadiusAttribute)
                && java.util.Objects.equals(this.responseFormat, other.responseFormat)
                && java.util.Objects.equals(
                        this.responseFormatDelimiter, other.responseFormatDelimiter)
                && java.util.Objects.equals(this.groupNameFormat, other.groupNameFormat)
                && java.util.Objects.equals(
                        this.passwordAndOtpTogether, other.passwordAndOtpTogether)
                && java.util.Objects.equals(
                        this.groupMembershipToReturn, other.groupMembershipToReturn)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clientIP == null ? 43 : this.clientIP.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.secretKey == null ? 43 : this.secretKey.hashCode());
        result =
                (result * PRIME)
                        + (this.secretKeyTemporary == null
                                ? 43
                                : this.secretKeyTemporary.hashCode());
        result =
                (result * PRIME)
                        + (this.includeGroupInResponse == null
                                ? 43
                                : this.includeGroupInResponse.hashCode());
        result =
                (result * PRIME)
                        + (this.captureClientIp == null ? 43 : this.captureClientIp.hashCode());
        result =
                (result * PRIME)
                        + (this.typeOfRadiusApp == null ? 43 : this.typeOfRadiusApp.hashCode());
        result =
                (result * PRIME)
                        + (this.endUserIPAttribute == null
                                ? 43
                                : this.endUserIPAttribute.hashCode());
        result =
                (result * PRIME)
                        + (this.radiusVendorSpecificId == null
                                ? 43
                                : this.radiusVendorSpecificId.hashCode());
        result =
                (result * PRIME)
                        + (this.countryCodeResponseAttributeId == null
                                ? 43
                                : this.countryCodeResponseAttributeId.hashCode());
        result =
                (result * PRIME)
                        + (this.groupMembershipRadiusAttribute == null
                                ? 43
                                : this.groupMembershipRadiusAttribute.hashCode());
        result =
                (result * PRIME)
                        + (this.responseFormat == null ? 43 : this.responseFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.responseFormatDelimiter == null
                                ? 43
                                : this.responseFormatDelimiter.hashCode());
        result =
                (result * PRIME)
                        + (this.groupNameFormat == null ? 43 : this.groupNameFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordAndOtpTogether == null
                                ? 43
                                : this.passwordAndOtpTogether.hashCode());
        result =
                (result * PRIME)
                        + (this.groupMembershipToReturn == null
                                ? 43
                                : this.groupMembershipToReturn.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
