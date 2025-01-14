/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Vault Credential Details to connect to the database. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CredentialByVault.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "credentialType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CredentialByVault extends CredentialDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("credentialSourceName")
        private String credentialSourceName;

        public Builder credentialSourceName(String credentialSourceName) {
            this.credentialSourceName = credentialSourceName;
            this.__explicitlySet__.add("credentialSourceName");
            return this;
        }
        /** database user name. */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * database user name.
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * The secret [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * mapping to the database credentials.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The secret [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * mapping to the database credentials.
         *
         * @param passwordSecretId the value to set
         * @return this builder
         */
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret where the database keystore contents are stored. This is used for TCPS support in
         * BM/VM/ExaCS cases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("walletSecretId")
        private String walletSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret where the database keystore contents are stored. This is used for TCPS support in
         * BM/VM/ExaCS cases.
         *
         * @param walletSecretId the value to set
         * @return this builder
         */
        public Builder walletSecretId(String walletSecretId) {
            this.walletSecretId = walletSecretId;
            this.__explicitlySet__.add("walletSecretId");
            return this;
        }
        /** database user role. */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * database user role.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CredentialByVault build() {
            CredentialByVault model =
                    new CredentialByVault(
                            this.credentialSourceName,
                            this.userName,
                            this.passwordSecretId,
                            this.walletSecretId,
                            this.role);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CredentialByVault model) {
            if (model.wasPropertyExplicitlySet("credentialSourceName")) {
                this.credentialSourceName(model.getCredentialSourceName());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("walletSecretId")) {
                this.walletSecretId(model.getWalletSecretId());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
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

    @Deprecated
    public CredentialByVault(
            String credentialSourceName,
            String userName,
            String passwordSecretId,
            String walletSecretId,
            Role role) {
        super(credentialSourceName);
        this.userName = userName;
        this.passwordSecretId = passwordSecretId;
        this.walletSecretId = walletSecretId;
        this.role = role;
    }

    /** database user name. */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * database user name.
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /**
     * The secret [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * mapping to the database credentials.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The secret [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * mapping to the database credentials.
     *
     * @return the value
     */
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret where the database keystore contents are stored. This is used for TCPS support in
     * BM/VM/ExaCS cases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("walletSecretId")
    private final String walletSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret where the database keystore contents are stored. This is used for TCPS support in
     * BM/VM/ExaCS cases.
     *
     * @return the value
     */
    public String getWalletSecretId() {
        return walletSecretId;
    }

    /** database user role. */
    public enum Role implements com.oracle.bmc.http.internal.BmcEnum {
        Normal("NORMAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Role.class);

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Role(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Role create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Role', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** database user role. */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * database user role.
     *
     * @return the value
     */
    public Role getRole() {
        return role;
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
        sb.append("CredentialByVault(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", walletSecretId=").append(String.valueOf(this.walletSecretId));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CredentialByVault)) {
            return false;
        }

        CredentialByVault other = (CredentialByVault) o;
        return java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.walletSecretId, other.walletSecretId)
                && java.util.Objects.equals(this.role, other.role)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.walletSecretId == null ? 43 : this.walletSecretId.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        return result;
    }
}
