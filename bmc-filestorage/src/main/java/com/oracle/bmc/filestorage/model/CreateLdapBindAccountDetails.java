/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Account details for the LDAP bind account to be used by mount targets that use this outbound connector.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateLdapBindAccountDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectorType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateLdapBindAccountDetails extends CreateOutboundConnectorDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }
        /**
         * Array of server endpoints to use when connecting with the LDAP bind account.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
        private java.util.List<Endpoint> endpoints;

        /**
         * Array of server endpoints to use when connecting with the LDAP bind account.
         *
         * @param endpoints the value to set
         * @return this builder
         **/
        public Builder endpoints(java.util.List<Endpoint> endpoints) {
            this.endpoints = endpoints;
            this.__explicitlySet__.add("endpoints");
            return this;
        }
        /**
         * The LDAP Distinguished Name of the bind account.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bindDistinguishedName")
        private String bindDistinguishedName;

        /**
         * The LDAP Distinguished Name of the bind account.
         *
         * @param bindDistinguishedName the value to set
         * @return this builder
         **/
        public Builder bindDistinguishedName(String bindDistinguishedName) {
            this.bindDistinguishedName = bindDistinguishedName;
            this.__explicitlySet__.add("bindDistinguishedName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the password for the LDAP bind account in the Vault.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the password for the LDAP bind account in the Vault.
         * @param passwordSecretId the value to set
         * @return this builder
         **/
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }
        /**
         * Version of the password secret in the Vault to use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretVersion")
        private Integer passwordSecretVersion;

        /**
         * Version of the password secret in the Vault to use.
         * @param passwordSecretVersion the value to set
         * @return this builder
         **/
        public Builder passwordSecretVersion(Integer passwordSecretVersion) {
            this.passwordSecretVersion = passwordSecretVersion;
            this.__explicitlySet__.add("passwordSecretVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLdapBindAccountDetails build() {
            CreateLdapBindAccountDetails model =
                    new CreateLdapBindAccountDetails(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.locks,
                            this.endpoints,
                            this.bindDistinguishedName,
                            this.passwordSecretId,
                            this.passwordSecretVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLdapBindAccountDetails model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("endpoints")) {
                this.endpoints(model.getEndpoints());
            }
            if (model.wasPropertyExplicitlySet("bindDistinguishedName")) {
                this.bindDistinguishedName(model.getBindDistinguishedName());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretVersion")) {
                this.passwordSecretVersion(model.getPasswordSecretVersion());
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

    @Deprecated
    public CreateLdapBindAccountDetails(
            String availabilityDomain,
            String compartmentId,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<ResourceLock> locks,
            java.util.List<Endpoint> endpoints,
            String bindDistinguishedName,
            String passwordSecretId,
            Integer passwordSecretVersion) {
        super(availabilityDomain, compartmentId, displayName, freeformTags, definedTags, locks);
        this.endpoints = endpoints;
        this.bindDistinguishedName = bindDistinguishedName;
        this.passwordSecretId = passwordSecretId;
        this.passwordSecretVersion = passwordSecretVersion;
    }

    /**
     * Array of server endpoints to use when connecting with the LDAP bind account.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    private final java.util.List<Endpoint> endpoints;

    /**
     * Array of server endpoints to use when connecting with the LDAP bind account.
     *
     * @return the value
     **/
    public java.util.List<Endpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * The LDAP Distinguished Name of the bind account.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bindDistinguishedName")
    private final String bindDistinguishedName;

    /**
     * The LDAP Distinguished Name of the bind account.
     *
     * @return the value
     **/
    public String getBindDistinguishedName() {
        return bindDistinguishedName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the password for the LDAP bind account in the Vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the password for the LDAP bind account in the Vault.
     * @return the value
     **/
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /**
     * Version of the password secret in the Vault to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretVersion")
    private final Integer passwordSecretVersion;

    /**
     * Version of the password secret in the Vault to use.
     * @return the value
     **/
    public Integer getPasswordSecretVersion() {
        return passwordSecretVersion;
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
        sb.append("CreateLdapBindAccountDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", endpoints=").append(String.valueOf(this.endpoints));
        sb.append(", bindDistinguishedName=").append(String.valueOf(this.bindDistinguishedName));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", passwordSecretVersion=").append(String.valueOf(this.passwordSecretVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLdapBindAccountDetails)) {
            return false;
        }

        CreateLdapBindAccountDetails other = (CreateLdapBindAccountDetails) o;
        return java.util.Objects.equals(this.endpoints, other.endpoints)
                && java.util.Objects.equals(this.bindDistinguishedName, other.bindDistinguishedName)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.passwordSecretVersion, other.passwordSecretVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.endpoints == null ? 43 : this.endpoints.hashCode());
        result =
                (result * PRIME)
                        + (this.bindDistinguishedName == null
                                ? 43
                                : this.bindDistinguishedName.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretVersion == null
                                ? 43
                                : this.passwordSecretVersion.hashCode());
        return result;
    }
}
