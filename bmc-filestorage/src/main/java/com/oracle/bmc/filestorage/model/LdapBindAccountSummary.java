/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Summary information for the LDAP bind account used by the outbound connector.
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
    builder = LdapBindAccountSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectorType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LdapBindAccountSummary extends OutboundConnectorSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
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
         * The LDAP Distinguished Name of the account.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bindDistinguishedName")
        private String bindDistinguishedName;

        /**
         * The LDAP Distinguished Name of the account.
         * @param bindDistinguishedName the value to set
         * @return this builder
         **/
        public Builder bindDistinguishedName(String bindDistinguishedName) {
            this.bindDistinguishedName = bindDistinguishedName;
            this.__explicitlySet__.add("bindDistinguishedName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LdapBindAccountSummary build() {
            LdapBindAccountSummary model =
                    new LdapBindAccountSummary(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.id,
                            this.lifecycleState,
                            this.displayName,
                            this.timeCreated,
                            this.locks,
                            this.freeformTags,
                            this.definedTags,
                            this.endpoints,
                            this.bindDistinguishedName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LdapBindAccountSummary model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("endpoints")) {
                this.endpoints(model.getEndpoints());
            }
            if (model.wasPropertyExplicitlySet("bindDistinguishedName")) {
                this.bindDistinguishedName(model.getBindDistinguishedName());
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
    public LdapBindAccountSummary(
            String availabilityDomain,
            String compartmentId,
            String id,
            LifecycleState lifecycleState,
            String displayName,
            java.util.Date timeCreated,
            java.util.List<ResourceLock> locks,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<Endpoint> endpoints,
            String bindDistinguishedName) {
        super(
                availabilityDomain,
                compartmentId,
                id,
                lifecycleState,
                displayName,
                timeCreated,
                locks,
                freeformTags,
                definedTags);
        this.endpoints = endpoints;
        this.bindDistinguishedName = bindDistinguishedName;
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
     * The LDAP Distinguished Name of the account.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bindDistinguishedName")
    private final String bindDistinguishedName;

    /**
     * The LDAP Distinguished Name of the account.
     * @return the value
     **/
    public String getBindDistinguishedName() {
        return bindDistinguishedName;
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
        sb.append("LdapBindAccountSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", endpoints=").append(String.valueOf(this.endpoints));
        sb.append(", bindDistinguishedName=").append(String.valueOf(this.bindDistinguishedName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LdapBindAccountSummary)) {
            return false;
        }

        LdapBindAccountSummary other = (LdapBindAccountSummary) o;
        return java.util.Objects.equals(this.endpoints, other.endpoints)
                && java.util.Objects.equals(this.bindDistinguishedName, other.bindDistinguishedName)
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
        return result;
    }
}
