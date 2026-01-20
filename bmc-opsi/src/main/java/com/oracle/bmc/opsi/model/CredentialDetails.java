/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * User credential details to connect to the database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "credentialType",
        defaultImpl = CredentialDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CredentialByNamedCredentials.class,
            name = "CREDENTIALS_BY_NAMED_CREDS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CredentialsBySource.class,
            name = "CREDENTIALS_BY_SOURCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CredentialByVault.class,
            name = "CREDENTIALS_BY_VAULT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CredentialByIam.class,
            name = "CREDENTIALS_BY_IAM")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CredentialDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"credentialSourceName"})
    protected CredentialDetails(String credentialSourceName) {
        super();
        this.credentialSourceName = credentialSourceName;
    }

    /**
     * Credential source name that had been added in Management Agent wallet. This value is only
     * required when Credential set by CREDENTIALS_BY_SOURCE and is optional properties for ther
     * others.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialSourceName")
    private final String credentialSourceName;

    /**
     * Credential source name that had been added in Management Agent wallet. This value is only
     * required when Credential set by CREDENTIALS_BY_SOURCE and is optional properties for ther
     * others.
     *
     * @return the value
     */
    public String getCredentialSourceName() {
        return credentialSourceName;
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
        sb.append("CredentialDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialSourceName=").append(String.valueOf(this.credentialSourceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CredentialDetails)) {
            return false;
        }

        CredentialDetails other = (CredentialDetails) o;
        return java.util.Objects.equals(this.credentialSourceName, other.credentialSourceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialSourceName == null
                                ? 43
                                : this.credentialSourceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * CREDENTIALS_BY_SOURCE is supplied via the External Database Service. CREDENTIALS_BY_VAULT is
     * supplied by secret service to connection PE_COMANAGED_DATABASE and ADB as well.
     * CREDENTIALS_BY_IAM is used db-token to connect only for Autonomous Database.
     */
    public enum CredentialType implements com.oracle.bmc.http.internal.BmcEnum {
        CredentialsBySource("CREDENTIALS_BY_SOURCE"),
        CredentialsByVault("CREDENTIALS_BY_VAULT"),
        CredentialsByIam("CREDENTIALS_BY_IAM"),
        CredentialsByNamedCreds("CREDENTIALS_BY_NAMED_CREDS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CredentialType.class);

        private final String value;
        private static java.util.Map<String, CredentialType> map;

        static {
            map = new java.util.HashMap<>();
            for (CredentialType v : CredentialType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CredentialType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CredentialType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CredentialType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
