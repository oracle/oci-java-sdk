/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Mount target details about the LDAP ID mapping configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateLdapIdmapDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateLdapIdmapDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemaType",
        "cacheRefreshIntervalSeconds",
        "cacheLifetimeSeconds",
        "negativeCacheLifetimeSeconds",
        "userSearchBase",
        "groupSearchBase",
        "outboundConnector1Id",
        "outboundConnector2Id"
    })
    public CreateLdapIdmapDetails(
            SchemaType schemaType,
            Integer cacheRefreshIntervalSeconds,
            Integer cacheLifetimeSeconds,
            Integer negativeCacheLifetimeSeconds,
            String userSearchBase,
            String groupSearchBase,
            String outboundConnector1Id,
            String outboundConnector2Id) {
        super();
        this.schemaType = schemaType;
        this.cacheRefreshIntervalSeconds = cacheRefreshIntervalSeconds;
        this.cacheLifetimeSeconds = cacheLifetimeSeconds;
        this.negativeCacheLifetimeSeconds = negativeCacheLifetimeSeconds;
        this.userSearchBase = userSearchBase;
        this.groupSearchBase = groupSearchBase;
        this.outboundConnector1Id = outboundConnector1Id;
        this.outboundConnector2Id = outboundConnector2Id;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Schema type of the LDAP account. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaType")
        private SchemaType schemaType;

        /**
         * Schema type of the LDAP account.
         *
         * @param schemaType the value to set
         * @return this builder
         */
        public Builder schemaType(SchemaType schemaType) {
            this.schemaType = schemaType;
            this.__explicitlySet__.add("schemaType");
            return this;
        }
        /**
         * The amount of time that the mount target should allow an entry to persist in its cache
         * before attempting to refresh the entry.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cacheRefreshIntervalSeconds")
        private Integer cacheRefreshIntervalSeconds;

        /**
         * The amount of time that the mount target should allow an entry to persist in its cache
         * before attempting to refresh the entry.
         *
         * @param cacheRefreshIntervalSeconds the value to set
         * @return this builder
         */
        public Builder cacheRefreshIntervalSeconds(Integer cacheRefreshIntervalSeconds) {
            this.cacheRefreshIntervalSeconds = cacheRefreshIntervalSeconds;
            this.__explicitlySet__.add("cacheRefreshIntervalSeconds");
            return this;
        }
        /** The maximum amount of time the mount target is allowed to use a cached entry. */
        @com.fasterxml.jackson.annotation.JsonProperty("cacheLifetimeSeconds")
        private Integer cacheLifetimeSeconds;

        /**
         * The maximum amount of time the mount target is allowed to use a cached entry.
         *
         * @param cacheLifetimeSeconds the value to set
         * @return this builder
         */
        public Builder cacheLifetimeSeconds(Integer cacheLifetimeSeconds) {
            this.cacheLifetimeSeconds = cacheLifetimeSeconds;
            this.__explicitlySet__.add("cacheLifetimeSeconds");
            return this;
        }
        /**
         * The amount of time that a mount target will maintain information that a user is not found
         * in the ID mapping configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("negativeCacheLifetimeSeconds")
        private Integer negativeCacheLifetimeSeconds;

        /**
         * The amount of time that a mount target will maintain information that a user is not found
         * in the ID mapping configuration.
         *
         * @param negativeCacheLifetimeSeconds the value to set
         * @return this builder
         */
        public Builder negativeCacheLifetimeSeconds(Integer negativeCacheLifetimeSeconds) {
            this.negativeCacheLifetimeSeconds = negativeCacheLifetimeSeconds;
            this.__explicitlySet__.add("negativeCacheLifetimeSeconds");
            return this;
        }
        /**
         * All LDAP searches are recursive starting at this user.
         *
         * <p>Example: {@code CN=User,DC=domain,DC=com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userSearchBase")
        private String userSearchBase;

        /**
         * All LDAP searches are recursive starting at this user.
         *
         * <p>Example: {@code CN=User,DC=domain,DC=com}
         *
         * @param userSearchBase the value to set
         * @return this builder
         */
        public Builder userSearchBase(String userSearchBase) {
            this.userSearchBase = userSearchBase;
            this.__explicitlySet__.add("userSearchBase");
            return this;
        }
        /**
         * All LDAP searches are recursive starting at this group.
         *
         * <p>Example: {@code CN=Group,DC=domain,DC=com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupSearchBase")
        private String groupSearchBase;

        /**
         * All LDAP searches are recursive starting at this group.
         *
         * <p>Example: {@code CN=Group,DC=domain,DC=com}
         *
         * @param groupSearchBase the value to set
         * @return this builder
         */
        public Builder groupSearchBase(String groupSearchBase) {
            this.groupSearchBase = groupSearchBase;
            this.__explicitlySet__.add("groupSearchBase");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * first connector to use to communicate with the LDAP server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundConnector1Id")
        private String outboundConnector1Id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * first connector to use to communicate with the LDAP server.
         *
         * @param outboundConnector1Id the value to set
         * @return this builder
         */
        public Builder outboundConnector1Id(String outboundConnector1Id) {
            this.outboundConnector1Id = outboundConnector1Id;
            this.__explicitlySet__.add("outboundConnector1Id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * second connector to use to communicate with the LDAP server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundConnector2Id")
        private String outboundConnector2Id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * second connector to use to communicate with the LDAP server.
         *
         * @param outboundConnector2Id the value to set
         * @return this builder
         */
        public Builder outboundConnector2Id(String outboundConnector2Id) {
            this.outboundConnector2Id = outboundConnector2Id;
            this.__explicitlySet__.add("outboundConnector2Id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLdapIdmapDetails build() {
            CreateLdapIdmapDetails model =
                    new CreateLdapIdmapDetails(
                            this.schemaType,
                            this.cacheRefreshIntervalSeconds,
                            this.cacheLifetimeSeconds,
                            this.negativeCacheLifetimeSeconds,
                            this.userSearchBase,
                            this.groupSearchBase,
                            this.outboundConnector1Id,
                            this.outboundConnector2Id);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLdapIdmapDetails model) {
            if (model.wasPropertyExplicitlySet("schemaType")) {
                this.schemaType(model.getSchemaType());
            }
            if (model.wasPropertyExplicitlySet("cacheRefreshIntervalSeconds")) {
                this.cacheRefreshIntervalSeconds(model.getCacheRefreshIntervalSeconds());
            }
            if (model.wasPropertyExplicitlySet("cacheLifetimeSeconds")) {
                this.cacheLifetimeSeconds(model.getCacheLifetimeSeconds());
            }
            if (model.wasPropertyExplicitlySet("negativeCacheLifetimeSeconds")) {
                this.negativeCacheLifetimeSeconds(model.getNegativeCacheLifetimeSeconds());
            }
            if (model.wasPropertyExplicitlySet("userSearchBase")) {
                this.userSearchBase(model.getUserSearchBase());
            }
            if (model.wasPropertyExplicitlySet("groupSearchBase")) {
                this.groupSearchBase(model.getGroupSearchBase());
            }
            if (model.wasPropertyExplicitlySet("outboundConnector1Id")) {
                this.outboundConnector1Id(model.getOutboundConnector1Id());
            }
            if (model.wasPropertyExplicitlySet("outboundConnector2Id")) {
                this.outboundConnector2Id(model.getOutboundConnector2Id());
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

    /** Schema type of the LDAP account. */
    public enum SchemaType implements com.oracle.bmc.http.internal.BmcEnum {
        Rfc2307("RFC2307"),
        ;

        private final String value;
        private static java.util.Map<String, SchemaType> map;

        static {
            map = new java.util.HashMap<>();
            for (SchemaType v : SchemaType.values()) {
                map.put(v.getValue(), v);
            }
        }

        SchemaType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SchemaType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SchemaType: " + key);
        }
    };
    /** Schema type of the LDAP account. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaType")
    private final SchemaType schemaType;

    /**
     * Schema type of the LDAP account.
     *
     * @return the value
     */
    public SchemaType getSchemaType() {
        return schemaType;
    }

    /**
     * The amount of time that the mount target should allow an entry to persist in its cache before
     * attempting to refresh the entry.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cacheRefreshIntervalSeconds")
    private final Integer cacheRefreshIntervalSeconds;

    /**
     * The amount of time that the mount target should allow an entry to persist in its cache before
     * attempting to refresh the entry.
     *
     * @return the value
     */
    public Integer getCacheRefreshIntervalSeconds() {
        return cacheRefreshIntervalSeconds;
    }

    /** The maximum amount of time the mount target is allowed to use a cached entry. */
    @com.fasterxml.jackson.annotation.JsonProperty("cacheLifetimeSeconds")
    private final Integer cacheLifetimeSeconds;

    /**
     * The maximum amount of time the mount target is allowed to use a cached entry.
     *
     * @return the value
     */
    public Integer getCacheLifetimeSeconds() {
        return cacheLifetimeSeconds;
    }

    /**
     * The amount of time that a mount target will maintain information that a user is not found in
     * the ID mapping configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("negativeCacheLifetimeSeconds")
    private final Integer negativeCacheLifetimeSeconds;

    /**
     * The amount of time that a mount target will maintain information that a user is not found in
     * the ID mapping configuration.
     *
     * @return the value
     */
    public Integer getNegativeCacheLifetimeSeconds() {
        return negativeCacheLifetimeSeconds;
    }

    /**
     * All LDAP searches are recursive starting at this user.
     *
     * <p>Example: {@code CN=User,DC=domain,DC=com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userSearchBase")
    private final String userSearchBase;

    /**
     * All LDAP searches are recursive starting at this user.
     *
     * <p>Example: {@code CN=User,DC=domain,DC=com}
     *
     * @return the value
     */
    public String getUserSearchBase() {
        return userSearchBase;
    }

    /**
     * All LDAP searches are recursive starting at this group.
     *
     * <p>Example: {@code CN=Group,DC=domain,DC=com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupSearchBase")
    private final String groupSearchBase;

    /**
     * All LDAP searches are recursive starting at this group.
     *
     * <p>Example: {@code CN=Group,DC=domain,DC=com}
     *
     * @return the value
     */
    public String getGroupSearchBase() {
        return groupSearchBase;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * first connector to use to communicate with the LDAP server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundConnector1Id")
    private final String outboundConnector1Id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * first connector to use to communicate with the LDAP server.
     *
     * @return the value
     */
    public String getOutboundConnector1Id() {
        return outboundConnector1Id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * second connector to use to communicate with the LDAP server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundConnector2Id")
    private final String outboundConnector2Id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * second connector to use to communicate with the LDAP server.
     *
     * @return the value
     */
    public String getOutboundConnector2Id() {
        return outboundConnector2Id;
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
        sb.append("CreateLdapIdmapDetails(");
        sb.append("super=").append(super.toString());
        sb.append("schemaType=").append(String.valueOf(this.schemaType));
        sb.append(", cacheRefreshIntervalSeconds=")
                .append(String.valueOf(this.cacheRefreshIntervalSeconds));
        sb.append(", cacheLifetimeSeconds=").append(String.valueOf(this.cacheLifetimeSeconds));
        sb.append(", negativeCacheLifetimeSeconds=")
                .append(String.valueOf(this.negativeCacheLifetimeSeconds));
        sb.append(", userSearchBase=").append(String.valueOf(this.userSearchBase));
        sb.append(", groupSearchBase=").append(String.valueOf(this.groupSearchBase));
        sb.append(", outboundConnector1Id=").append(String.valueOf(this.outboundConnector1Id));
        sb.append(", outboundConnector2Id=").append(String.valueOf(this.outboundConnector2Id));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLdapIdmapDetails)) {
            return false;
        }

        CreateLdapIdmapDetails other = (CreateLdapIdmapDetails) o;
        return java.util.Objects.equals(this.schemaType, other.schemaType)
                && java.util.Objects.equals(
                        this.cacheRefreshIntervalSeconds, other.cacheRefreshIntervalSeconds)
                && java.util.Objects.equals(this.cacheLifetimeSeconds, other.cacheLifetimeSeconds)
                && java.util.Objects.equals(
                        this.negativeCacheLifetimeSeconds, other.negativeCacheLifetimeSeconds)
                && java.util.Objects.equals(this.userSearchBase, other.userSearchBase)
                && java.util.Objects.equals(this.groupSearchBase, other.groupSearchBase)
                && java.util.Objects.equals(this.outboundConnector1Id, other.outboundConnector1Id)
                && java.util.Objects.equals(this.outboundConnector2Id, other.outboundConnector2Id)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemaType == null ? 43 : this.schemaType.hashCode());
        result =
                (result * PRIME)
                        + (this.cacheRefreshIntervalSeconds == null
                                ? 43
                                : this.cacheRefreshIntervalSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.cacheLifetimeSeconds == null
                                ? 43
                                : this.cacheLifetimeSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.negativeCacheLifetimeSeconds == null
                                ? 43
                                : this.negativeCacheLifetimeSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.userSearchBase == null ? 43 : this.userSearchBase.hashCode());
        result =
                (result * PRIME)
                        + (this.groupSearchBase == null ? 43 : this.groupSearchBase.hashCode());
        result =
                (result * PRIME)
                        + (this.outboundConnector1Id == null
                                ? 43
                                : this.outboundConnector1Id.hashCode());
        result =
                (result * PRIME)
                        + (this.outboundConnector2Id == null
                                ? 43
                                : this.outboundConnector2Id.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
