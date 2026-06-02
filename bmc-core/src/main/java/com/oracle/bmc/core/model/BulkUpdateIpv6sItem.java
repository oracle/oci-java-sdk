/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A secondary IPv6 object to update as part of a bulk update.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkUpdateIpv6sItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkUpdateIpv6sItem extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "ipv6Id",
        "lifetime",
        "routeTableId"
    })
    public BulkUpdateIpv6sItem(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String ipv6Id,
            Lifetime lifetime,
            String routeTableId) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.ipv6Id = ipv6Id;
        this.lifetime = lifetime;
        this.routeTableId = routeTableId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6 object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6Id")
        private String ipv6Id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6 object.
         *
         * @param ipv6Id the value to set
         * @return this builder
         **/
        public Builder ipv6Id(String ipv6Id) {
            this.ipv6Id = ipv6Id;
            this.__explicitlySet__.add("ipv6Id");
            return this;
        }
        /**
         * Lifetime of the IP address.
         * There are two types of IPs:
         *  - Ephemeral
         *  - Reserved
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
        private Lifetime lifetime;

        /**
         * Lifetime of the IP address.
         * There are two types of IPs:
         *  - Ephemeral
         *  - Reserved
         *
         * @param lifetime the value to set
         * @return this builder
         **/
        public Builder lifetime(Lifetime lifetime) {
            this.lifetime = lifetime;
            this.__explicitlySet__.add("lifetime");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the IP address or VNIC will use. For more information, see
         * [Per-resource Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the IP address or VNIC will use. For more information, see
         * [Per-resource Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
         *
         * @param routeTableId the value to set
         * @return this builder
         **/
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUpdateIpv6sItem build() {
            BulkUpdateIpv6sItem model =
                    new BulkUpdateIpv6sItem(
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.ipv6Id,
                            this.lifetime,
                            this.routeTableId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUpdateIpv6sItem model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("ipv6Id")) {
                this.ipv6Id(model.getIpv6Id());
            }
            if (model.wasPropertyExplicitlySet("lifetime")) {
                this.lifetime(model.getLifetime());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
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

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6 object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6Id")
    private final String ipv6Id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPv6 object.
     *
     * @return the value
     **/
    public String getIpv6Id() {
        return ipv6Id;
    }

    /**
     * Lifetime of the IP address.
     * There are two types of IPs:
     *  - Ephemeral
     *  - Reserved
     *
     **/
    public enum Lifetime {
        Ephemeral("EPHEMERAL"),
        Reserved("RESERVED"),
        ;

        private final String value;
        private static java.util.Map<String, Lifetime> map;

        static {
            map = new java.util.HashMap<>();
            for (Lifetime v : Lifetime.values()) {
                map.put(v.getValue(), v);
            }
        }

        Lifetime(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Lifetime create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Lifetime: " + key);
        }
    };
    /**
     * Lifetime of the IP address.
     * There are two types of IPs:
     *  - Ephemeral
     *  - Reserved
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
    private final Lifetime lifetime;

    /**
     * Lifetime of the IP address.
     * There are two types of IPs:
     *  - Ephemeral
     *  - Reserved
     *
     * @return the value
     **/
    public Lifetime getLifetime() {
        return lifetime;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the IP address or VNIC will use. For more information, see
     * [Per-resource Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the IP address or VNIC will use. For more information, see
     * [Per-resource Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
     *
     * @return the value
     **/
    public String getRouteTableId() {
        return routeTableId;
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
        sb.append("BulkUpdateIpv6sItem(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", ipv6Id=").append(String.valueOf(this.ipv6Id));
        sb.append(", lifetime=").append(String.valueOf(this.lifetime));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUpdateIpv6sItem)) {
            return false;
        }

        BulkUpdateIpv6sItem other = (BulkUpdateIpv6sItem) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.ipv6Id, other.ipv6Id)
                && java.util.Objects.equals(this.lifetime, other.lifetime)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.ipv6Id == null ? 43 : this.ipv6Id.hashCode());
        result = (result * PRIME) + (this.lifetime == null ? 43 : this.lifetime.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
