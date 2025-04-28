/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateIPSecConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateIPSecConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "cpeLocalIdentifier",
        "cpeLocalIdentifierType",
        "staticRoutes"
    })
    public UpdateIPSecConnectionDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String cpeLocalIdentifier,
            CpeLocalIdentifierType cpeLocalIdentifierType,
            java.util.List<String> staticRoutes) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.cpeLocalIdentifier = cpeLocalIdentifier;
        this.cpeLocalIdentifierType = cpeLocalIdentifierType;
        this.staticRoutes = staticRoutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Your identifier for your CPE device. Can be either an IP address or a hostname
         * (specifically, the fully qualified domain name (FQDN)). The type of identifier you
         * provide here must correspond to the value for {@code cpeLocalIdentifierType}.
         *
         * <p>For information about why you'd provide this value, see [If Your CPE Is Behind a NAT
         * Device](https://docs.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm#nat).
         *
         * <p>Example IP address: {@code 10.0.3.3}
         *
         * <p>Example hostname: {@code cpe.example.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifier")
        private String cpeLocalIdentifier;

        /**
         * Your identifier for your CPE device. Can be either an IP address or a hostname
         * (specifically, the fully qualified domain name (FQDN)). The type of identifier you
         * provide here must correspond to the value for {@code cpeLocalIdentifierType}.
         *
         * <p>For information about why you'd provide this value, see [If Your CPE Is Behind a NAT
         * Device](https://docs.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm#nat).
         *
         * <p>Example IP address: {@code 10.0.3.3}
         *
         * <p>Example hostname: {@code cpe.example.com}
         *
         * @param cpeLocalIdentifier the value to set
         * @return this builder
         */
        public Builder cpeLocalIdentifier(String cpeLocalIdentifier) {
            this.cpeLocalIdentifier = cpeLocalIdentifier;
            this.__explicitlySet__.add("cpeLocalIdentifier");
            return this;
        }
        /**
         * The type of identifier for your CPE device. The value you provide here must correspond to
         * the value for {@code cpeLocalIdentifier}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifierType")
        private CpeLocalIdentifierType cpeLocalIdentifierType;

        /**
         * The type of identifier for your CPE device. The value you provide here must correspond to
         * the value for {@code cpeLocalIdentifier}.
         *
         * @param cpeLocalIdentifierType the value to set
         * @return this builder
         */
        public Builder cpeLocalIdentifierType(CpeLocalIdentifierType cpeLocalIdentifierType) {
            this.cpeLocalIdentifierType = cpeLocalIdentifierType;
            this.__explicitlySet__.add("cpeLocalIdentifierType");
            return this;
        }
        /**
         * Static routes to the CPE. If you provide this attribute, it replaces the entire current
         * set of static routes. A static route's CIDR must not be a multicast address or class E
         * address. The CIDR can be either IPv4 or IPv6. IPv6 addressing is supported for all
         * commercial and government regions. See [IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code 10.0.1.0/24}
         *
         * <p>Example: {@code 2001:db8::/32}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
        private java.util.List<String> staticRoutes;

        /**
         * Static routes to the CPE. If you provide this attribute, it replaces the entire current
         * set of static routes. A static route's CIDR must not be a multicast address or class E
         * address. The CIDR can be either IPv4 or IPv6. IPv6 addressing is supported for all
         * commercial and government regions. See [IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code 10.0.1.0/24}
         *
         * <p>Example: {@code 2001:db8::/32}
         *
         * @param staticRoutes the value to set
         * @return this builder
         */
        public Builder staticRoutes(java.util.List<String> staticRoutes) {
            this.staticRoutes = staticRoutes;
            this.__explicitlySet__.add("staticRoutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateIPSecConnectionDetails build() {
            UpdateIPSecConnectionDetails model =
                    new UpdateIPSecConnectionDetails(
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.cpeLocalIdentifier,
                            this.cpeLocalIdentifierType,
                            this.staticRoutes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIPSecConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("cpeLocalIdentifier")) {
                this.cpeLocalIdentifier(model.getCpeLocalIdentifier());
            }
            if (model.wasPropertyExplicitlySet("cpeLocalIdentifierType")) {
                this.cpeLocalIdentifierType(model.getCpeLocalIdentifierType());
            }
            if (model.wasPropertyExplicitlySet("staticRoutes")) {
                this.staticRoutes(model.getStaticRoutes());
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Your identifier for your CPE device. Can be either an IP address or a hostname (specifically,
     * the fully qualified domain name (FQDN)). The type of identifier you provide here must
     * correspond to the value for {@code cpeLocalIdentifierType}.
     *
     * <p>For information about why you'd provide this value, see [If Your CPE Is Behind a NAT
     * Device](https://docs.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm#nat).
     *
     * <p>Example IP address: {@code 10.0.3.3}
     *
     * <p>Example hostname: {@code cpe.example.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifier")
    private final String cpeLocalIdentifier;

    /**
     * Your identifier for your CPE device. Can be either an IP address or a hostname (specifically,
     * the fully qualified domain name (FQDN)). The type of identifier you provide here must
     * correspond to the value for {@code cpeLocalIdentifierType}.
     *
     * <p>For information about why you'd provide this value, see [If Your CPE Is Behind a NAT
     * Device](https://docs.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm#nat).
     *
     * <p>Example IP address: {@code 10.0.3.3}
     *
     * <p>Example hostname: {@code cpe.example.com}
     *
     * @return the value
     */
    public String getCpeLocalIdentifier() {
        return cpeLocalIdentifier;
    }

    /**
     * The type of identifier for your CPE device. The value you provide here must correspond to the
     * value for {@code cpeLocalIdentifier}.
     */
    public enum CpeLocalIdentifierType implements com.oracle.bmc.http.internal.BmcEnum {
        IpAddress("IP_ADDRESS"),
        Hostname("HOSTNAME"),
        ;

        private final String value;
        private static java.util.Map<String, CpeLocalIdentifierType> map;

        static {
            map = new java.util.HashMap<>();
            for (CpeLocalIdentifierType v : CpeLocalIdentifierType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CpeLocalIdentifierType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CpeLocalIdentifierType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CpeLocalIdentifierType: " + key);
        }
    };
    /**
     * The type of identifier for your CPE device. The value you provide here must correspond to the
     * value for {@code cpeLocalIdentifier}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifierType")
    private final CpeLocalIdentifierType cpeLocalIdentifierType;

    /**
     * The type of identifier for your CPE device. The value you provide here must correspond to the
     * value for {@code cpeLocalIdentifier}.
     *
     * @return the value
     */
    public CpeLocalIdentifierType getCpeLocalIdentifierType() {
        return cpeLocalIdentifierType;
    }

    /**
     * Static routes to the CPE. If you provide this attribute, it replaces the entire current set
     * of static routes. A static route's CIDR must not be a multicast address or class E address.
     * The CIDR can be either IPv4 or IPv6. IPv6 addressing is supported for all commercial and
     * government regions. See [IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code 10.0.1.0/24}
     *
     * <p>Example: {@code 2001:db8::/32}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
    private final java.util.List<String> staticRoutes;

    /**
     * Static routes to the CPE. If you provide this attribute, it replaces the entire current set
     * of static routes. A static route's CIDR must not be a multicast address or class E address.
     * The CIDR can be either IPv4 or IPv6. IPv6 addressing is supported for all commercial and
     * government regions. See [IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code 10.0.1.0/24}
     *
     * <p>Example: {@code 2001:db8::/32}
     *
     * @return the value
     */
    public java.util.List<String> getStaticRoutes() {
        return staticRoutes;
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
        sb.append("UpdateIPSecConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", cpeLocalIdentifier=").append(String.valueOf(this.cpeLocalIdentifier));
        sb.append(", cpeLocalIdentifierType=").append(String.valueOf(this.cpeLocalIdentifierType));
        sb.append(", staticRoutes=").append(String.valueOf(this.staticRoutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIPSecConnectionDetails)) {
            return false;
        }

        UpdateIPSecConnectionDetails other = (UpdateIPSecConnectionDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.cpeLocalIdentifier, other.cpeLocalIdentifier)
                && java.util.Objects.equals(
                        this.cpeLocalIdentifierType, other.cpeLocalIdentifierType)
                && java.util.Objects.equals(this.staticRoutes, other.staticRoutes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.cpeLocalIdentifier == null
                                ? 43
                                : this.cpeLocalIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.cpeLocalIdentifierType == null
                                ? 43
                                : this.cpeLocalIdentifierType.hashCode());
        result = (result * PRIME) + (this.staticRoutes == null ? 43 : this.staticRoutes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
