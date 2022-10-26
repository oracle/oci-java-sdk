/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public enum ErrorCode implements com.oracle.bmc.http.internal.BmcEnum {
    ContentEmpty("CONTENT_EMPTY"),
    ClientException("CLIENT_EXCEPTION"),
    InvalidFormat("INVALID_FORMAT"),
    InvalidJsonInput("INVALID_JSON_INPUT"),
    SslAuthorization("SSL_AUTHORIZATION"),
    AuthFailed("AUTH_FAILED"),
    CsiNotAuthorized("CSI_NOT_AUTHORIZED"),
    UserPolicyNotAuthorized("USER_POLICY_NOT_AUTHORIZED"),
    EmailNotVerified("EMAIL_NOT_VERIFIED"),
    EmailNotFound("EMAIL_NOT_FOUND"),
    IdcsEmailNotValid("IDCS_EMAIL_NOT_VALID"),
    InvalidPath("INVALID_PATH"),
    MethodNotAllowed("METHOD_NOT_ALLOWED"),
    JsonProcessing("JSON_PROCESSING"),
    GenericException("GENERIC_EXCEPTION"),
    ExternalServiceProviderUnavailable("EXTERNAL_SERVICE_PROVIDER_UNAVAILABLE"),
    ExternalServiceProviderTimeout("EXTERNAL_SERVICE_PROVIDER_TIMEOUT"),
    TooManyRequests("TOO_MANY_REQUESTS"),
    IdpScimNotSetup("IDP_SCIM_NOT_SETUP"),
    IncidentNotFound("INCIDENT_NOT_FOUND"),
    InvalidUserCsi("INVALID_USER_CSI"),
    DataAlreadyExists("DATA_ALREADY_EXISTS"),
    AuthUserNotMatching("AUTH_USER_NOT_MATCHING"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ErrorCode.class);

    private final String value;
    private static java.util.Map<String, ErrorCode> map;

    static {
        map = new java.util.HashMap<>();
        for (ErrorCode v : ErrorCode.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ErrorCode(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ErrorCode create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ErrorCode', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
