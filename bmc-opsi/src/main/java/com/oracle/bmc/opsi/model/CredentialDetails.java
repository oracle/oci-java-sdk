/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * User credential details to connect to the database. This is supplied via the External Database Service.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "credentialType",
    defaultImpl = CredentialDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CredentialsBySource.class,
        name = "CREDENTIALS_BY_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CredentialByVault.class,
        name = "CREDENTIALS_BY_VAULT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CredentialDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"credentialSourceName"})
    protected CredentialDetails(String credentialSourceName) {
        super();
        this.credentialSourceName = credentialSourceName;
    }

    /**
     * Credential source name that had been added in Management Agent wallet. This is supplied in the External Database Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialSourceName")
    private final String credentialSourceName;

    /**
     * Credential source name that had been added in Management Agent wallet. This is supplied in the External Database Service.
     * @return the value
     **/
    public String getCredentialSourceName() {
        return credentialSourceName;
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
     * Credential type.
     **/
    public enum CredentialType {
        CredentialsBySource("CREDENTIALS_BY_SOURCE"),
        CredentialsByVault("CREDENTIALS_BY_VAULT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
