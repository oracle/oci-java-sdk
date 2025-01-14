/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Monitored Resource Credential Details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "credentialType",
        defaultImpl = MonitoredResourceCredential.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreExistingCredentials.class,
            name = "EXISTING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = EncryptedCredentials.class,
            name = "ENCRYPTED"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PlainTextCredentials.class,
            name = "PLAINTEXT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class MonitoredResourceCredential
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"source", "name", "type", "description"})
    protected MonitoredResourceCredential(
            String source, String name, String type, String description) {
        super();
        this.source = source;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    /**
     * The source type and source name combination, delimited with (.) separator. {source
     * type}.{source name} and source type max char limit is 63.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * The source type and source name combination, delimited with (.) separator. {source
     * type}.{source name} and source type max char limit is 63.
     *
     * @return the value
     */
    public String getSource() {
        return source;
    }

    /** The name of the credential, within the context of the source. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the credential, within the context of the source.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The type of the credential ( ex. JMXCreds,DBCreds). */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of the credential ( ex. JMXCreds,DBCreds).
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** The user-specified textual description of the credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The user-specified textual description of the credential.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("MonitoredResourceCredential(");
        sb.append("super=").append(super.toString());
        sb.append("source=").append(String.valueOf(this.source));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitoredResourceCredential)) {
            return false;
        }

        MonitoredResourceCredential other = (MonitoredResourceCredential) o;
        return java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Type of credentials specified in the credentials element. Three possible values - EXISTING,
     * PLAINTEXT and ENCRYPTED. * EXISTING - Credential is already stored in agent and only
     * credential name need to be passed for existing credential. * PLAINTEXT - The credential
     * properties will have credentials in plain text format. * ENCRYPTED - The credential
     * properties will have credentials stored in vault in encrypted format using KMS client which
     * uses master key for encryption. The same master key will be used to decrypt the credentials
     * before passing on to the management agent.
     */
    public enum CredentialType implements com.oracle.bmc.http.internal.BmcEnum {
        Existing("EXISTING"),
        Plaintext("PLAINTEXT"),
        Encrypted("ENCRYPTED"),

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
