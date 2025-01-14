/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Kerberos Realm <br>
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
        builder = AppExtensionKerberosRealmApp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppExtensionKerberosRealmApp
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "realmName",
        "masterKey",
        "defaultEncryptionSaltType",
        "supportedEncryptionSaltTypes",
        "ticketFlags",
        "maxTicketLife",
        "maxRenewableAge"
    })
    public AppExtensionKerberosRealmApp(
            String realmName,
            String masterKey,
            String defaultEncryptionSaltType,
            java.util.List<String> supportedEncryptionSaltTypes,
            Integer ticketFlags,
            Integer maxTicketLife,
            Integer maxRenewableAge) {
        super();
        this.realmName = realmName;
        this.masterKey = masterKey;
        this.defaultEncryptionSaltType = defaultEncryptionSaltType;
        this.supportedEncryptionSaltTypes = supportedEncryptionSaltTypes;
        this.ticketFlags = ticketFlags;
        this.maxTicketLife = maxTicketLife;
        this.maxRenewableAge = maxRenewableAge;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the Kerberos Realm that this App uses for authentication.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("realmName")
        private String realmName;

        /**
         * The name of the Kerberos Realm that this App uses for authentication.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         *
         * @param realmName the value to set
         * @return this builder
         */
        public Builder realmName(String realmName) {
            this.realmName = realmName;
            this.__explicitlySet__.add("realmName");
            return this;
        }
        /**
         * The primary key that the system should use to encrypt artifacts that are specific to this
         * Kerberos realm -- for example, to encrypt the Principal Key in each KerberosRealmUser.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: none - multiValued:
         * false - mutability: readWrite - required: false - returned: request - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("masterKey")
        private String masterKey;

        /**
         * The primary key that the system should use to encrypt artifacts that are specific to this
         * Kerberos realm -- for example, to encrypt the Principal Key in each KerberosRealmUser.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: none - multiValued:
         * false - mutability: readWrite - required: false - returned: request - type: string -
         * uniqueness: none
         *
         * @param masterKey the value to set
         * @return this builder
         */
        public Builder masterKey(String masterKey) {
            this.masterKey = masterKey;
            this.__explicitlySet__.add("masterKey");
            return this;
        }
        /**
         * The type of salt that the system will use to encrypt Kerberos-specific artifacts of this
         * App unless another type of salt is specified.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultEncryptionSaltType")
        private String defaultEncryptionSaltType;

        /**
         * The type of salt that the system will use to encrypt Kerberos-specific artifacts of this
         * App unless another type of salt is specified.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         *
         * @param defaultEncryptionSaltType the value to set
         * @return this builder
         */
        public Builder defaultEncryptionSaltType(String defaultEncryptionSaltType) {
            this.defaultEncryptionSaltType = defaultEncryptionSaltType;
            this.__explicitlySet__.add("defaultEncryptionSaltType");
            return this;
        }
        /**
         * The types of salt that are available for the system to use when encrypting
         * Kerberos-specific artifacts for this App.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedEncryptionSaltTypes")
        private java.util.List<String> supportedEncryptionSaltTypes;

        /**
         * The types of salt that are available for the system to use when encrypting
         * Kerberos-specific artifacts for this App.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         *
         * @param supportedEncryptionSaltTypes the value to set
         * @return this builder
         */
        public Builder supportedEncryptionSaltTypes(
                java.util.List<String> supportedEncryptionSaltTypes) {
            this.supportedEncryptionSaltTypes = supportedEncryptionSaltTypes;
            this.__explicitlySet__.add("supportedEncryptionSaltTypes");
            return this;
        }
        /**
         * Ticket Flags
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ticketFlags")
        private Integer ticketFlags;

        /**
         * Ticket Flags
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: integer - uniqueness: none
         *
         * @param ticketFlags the value to set
         * @return this builder
         */
        public Builder ticketFlags(Integer ticketFlags) {
            this.ticketFlags = ticketFlags;
            this.__explicitlySet__.add("ticketFlags");
            return this;
        }
        /**
         * Max Ticket Life in seconds
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTicketLife")
        private Integer maxTicketLife;

        /**
         * Max Ticket Life in seconds
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: integer - uniqueness: none
         *
         * @param maxTicketLife the value to set
         * @return this builder
         */
        public Builder maxTicketLife(Integer maxTicketLife) {
            this.maxTicketLife = maxTicketLife;
            this.__explicitlySet__.add("maxTicketLife");
            return this;
        }
        /**
         * Max Renewable Age in seconds
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxRenewableAge")
        private Integer maxRenewableAge;

        /**
         * Max Renewable Age in seconds
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: integer - uniqueness: none
         *
         * @param maxRenewableAge the value to set
         * @return this builder
         */
        public Builder maxRenewableAge(Integer maxRenewableAge) {
            this.maxRenewableAge = maxRenewableAge;
            this.__explicitlySet__.add("maxRenewableAge");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionKerberosRealmApp build() {
            AppExtensionKerberosRealmApp model =
                    new AppExtensionKerberosRealmApp(
                            this.realmName,
                            this.masterKey,
                            this.defaultEncryptionSaltType,
                            this.supportedEncryptionSaltTypes,
                            this.ticketFlags,
                            this.maxTicketLife,
                            this.maxRenewableAge);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionKerberosRealmApp model) {
            if (model.wasPropertyExplicitlySet("realmName")) {
                this.realmName(model.getRealmName());
            }
            if (model.wasPropertyExplicitlySet("masterKey")) {
                this.masterKey(model.getMasterKey());
            }
            if (model.wasPropertyExplicitlySet("defaultEncryptionSaltType")) {
                this.defaultEncryptionSaltType(model.getDefaultEncryptionSaltType());
            }
            if (model.wasPropertyExplicitlySet("supportedEncryptionSaltTypes")) {
                this.supportedEncryptionSaltTypes(model.getSupportedEncryptionSaltTypes());
            }
            if (model.wasPropertyExplicitlySet("ticketFlags")) {
                this.ticketFlags(model.getTicketFlags());
            }
            if (model.wasPropertyExplicitlySet("maxTicketLife")) {
                this.maxTicketLife(model.getMaxTicketLife());
            }
            if (model.wasPropertyExplicitlySet("maxRenewableAge")) {
                this.maxRenewableAge(model.getMaxRenewableAge());
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
     * The name of the Kerberos Realm that this App uses for authentication.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("realmName")
    private final String realmName;

    /**
     * The name of the Kerberos Realm that this App uses for authentication.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getRealmName() {
        return realmName;
    }

    /**
     * The primary key that the system should use to encrypt artifacts that are specific to this
     * Kerberos realm -- for example, to encrypt the Principal Key in each KerberosRealmUser.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: none - multiValued: false -
     * mutability: readWrite - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("masterKey")
    private final String masterKey;

    /**
     * The primary key that the system should use to encrypt artifacts that are specific to this
     * Kerberos realm -- for example, to encrypt the Principal Key in each KerberosRealmUser.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: none - multiValued: false -
     * mutability: readWrite - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMasterKey() {
        return masterKey;
    }

    /**
     * The type of salt that the system will use to encrypt Kerberos-specific artifacts of this App
     * unless another type of salt is specified.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultEncryptionSaltType")
    private final String defaultEncryptionSaltType;

    /**
     * The type of salt that the system will use to encrypt Kerberos-specific artifacts of this App
     * unless another type of salt is specified.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDefaultEncryptionSaltType() {
        return defaultEncryptionSaltType;
    }

    /**
     * The types of salt that are available for the system to use when encrypting Kerberos-specific
     * artifacts for this App.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedEncryptionSaltTypes")
    private final java.util.List<String> supportedEncryptionSaltTypes;

    /**
     * The types of salt that are available for the system to use when encrypting Kerberos-specific
     * artifacts for this App.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getSupportedEncryptionSaltTypes() {
        return supportedEncryptionSaltTypes;
    }

    /**
     * Ticket Flags
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ticketFlags")
    private final Integer ticketFlags;

    /**
     * Ticket Flags
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getTicketFlags() {
        return ticketFlags;
    }

    /**
     * Max Ticket Life in seconds
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTicketLife")
    private final Integer maxTicketLife;

    /**
     * Max Ticket Life in seconds
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxTicketLife() {
        return maxTicketLife;
    }

    /**
     * Max Renewable Age in seconds
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxRenewableAge")
    private final Integer maxRenewableAge;

    /**
     * Max Renewable Age in seconds
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxRenewableAge() {
        return maxRenewableAge;
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
        sb.append("AppExtensionKerberosRealmApp(");
        sb.append("super=").append(super.toString());
        sb.append("realmName=").append(String.valueOf(this.realmName));
        sb.append(", masterKey=").append(String.valueOf(this.masterKey));
        sb.append(", defaultEncryptionSaltType=")
                .append(String.valueOf(this.defaultEncryptionSaltType));
        sb.append(", supportedEncryptionSaltTypes=")
                .append(String.valueOf(this.supportedEncryptionSaltTypes));
        sb.append(", ticketFlags=").append(String.valueOf(this.ticketFlags));
        sb.append(", maxTicketLife=").append(String.valueOf(this.maxTicketLife));
        sb.append(", maxRenewableAge=").append(String.valueOf(this.maxRenewableAge));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionKerberosRealmApp)) {
            return false;
        }

        AppExtensionKerberosRealmApp other = (AppExtensionKerberosRealmApp) o;
        return java.util.Objects.equals(this.realmName, other.realmName)
                && java.util.Objects.equals(this.masterKey, other.masterKey)
                && java.util.Objects.equals(
                        this.defaultEncryptionSaltType, other.defaultEncryptionSaltType)
                && java.util.Objects.equals(
                        this.supportedEncryptionSaltTypes, other.supportedEncryptionSaltTypes)
                && java.util.Objects.equals(this.ticketFlags, other.ticketFlags)
                && java.util.Objects.equals(this.maxTicketLife, other.maxTicketLife)
                && java.util.Objects.equals(this.maxRenewableAge, other.maxRenewableAge)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.realmName == null ? 43 : this.realmName.hashCode());
        result = (result * PRIME) + (this.masterKey == null ? 43 : this.masterKey.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultEncryptionSaltType == null
                                ? 43
                                : this.defaultEncryptionSaltType.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedEncryptionSaltTypes == null
                                ? 43
                                : this.supportedEncryptionSaltTypes.hashCode());
        result = (result * PRIME) + (this.ticketFlags == null ? 43 : this.ticketFlags.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTicketLife == null ? 43 : this.maxTicketLife.hashCode());
        result =
                (result * PRIME)
                        + (this.maxRenewableAge == null ? 43 : this.maxRenewableAge.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
