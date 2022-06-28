/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * An object that represents one or multiple Oracle services that you can enable for a
 * {@link ServiceGateway}. In the User Guide topic
 * [Access to Oracle Services: Service Gateway](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/servicegateway.htm), the
 * term *service CIDR label* is used to refer to the string that represents the regional public
 * IP address ranges of the Oracle service or services covered by a given {@code Service} object. That
 * unique string is the value of the {@code Service} object's {@code cidrBlock} attribute.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Service.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Service {
    @Deprecated
    @java.beans.ConstructorProperties({"cidrBlock", "description", "id", "name"})
    public Service(String cidrBlock, String description, String id, String name) {
        super();
        this.cidrBlock = cidrBlock;
        this.description = description;
        this.id = id;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A string that represents the regional public IP address ranges for the Oracle service or
         * services covered by this {@code Service} object. Also known as the {@code Service} object's *service
         * CIDR label*.
         * <p>
         * When you set up a route rule to route traffic to the service gateway, use this value as the
         * rule's destination. See {@link RouteTable}. Also, when you set up
         * a security list rule to cover traffic with the service gateway, use the {@code cidrBlock} value
         * as the rule's destination (for an egress rule) or the source (for an ingress rule).
         * See {@link SecurityList}.
         * <p>
         * Example: {@code oci-phx-objectstorage}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * A string that represents the regional public IP address ranges for the Oracle service or
         * services covered by this {@code Service} object. Also known as the {@code Service} object's *service
         * CIDR label*.
         * <p>
         * When you set up a route rule to route traffic to the service gateway, use this value as the
         * rule's destination. See {@link RouteTable}. Also, when you set up
         * a security list rule to cover traffic with the service gateway, use the {@code cidrBlock} value
         * as the rule's destination (for an egress rule) or the source (for an ingress rule).
         * See {@link SecurityList}.
         * <p>
         * Example: {@code oci-phx-objectstorage}
         *
         * @param cidrBlock the value to set
         * @return this builder
         **/
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * Description of the Oracle service or services covered by this {@code Service} object.
         * <p>
         * Example: {@code OCI PHX Object Storage}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the Oracle service or services covered by this {@code Service} object.
         * <p>
         * Example: {@code OCI PHX Object Storage}
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The {@code Service} object's [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The {@code Service} object's [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Name of the {@code Service} object. This name can change and is not guaranteed to be unique.
         * <p>
         * Example: {@code OCI PHX Object Storage}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the {@code Service} object. This name can change and is not guaranteed to be unique.
         * <p>
         * Example: {@code OCI PHX Object Storage}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Service build() {
            Service __instance__ = new Service(cidrBlock, description, id, name);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Service o) {
            Builder copiedBuilder =
                    cidrBlock(o.getCidrBlock())
                            .description(o.getDescription())
                            .id(o.getId())
                            .name(o.getName());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * A string that represents the regional public IP address ranges for the Oracle service or
     * services covered by this {@code Service} object. Also known as the {@code Service} object's *service
     * CIDR label*.
     * <p>
     * When you set up a route rule to route traffic to the service gateway, use this value as the
     * rule's destination. See {@link RouteTable}. Also, when you set up
     * a security list rule to cover traffic with the service gateway, use the {@code cidrBlock} value
     * as the rule's destination (for an egress rule) or the source (for an ingress rule).
     * See {@link SecurityList}.
     * <p>
     * Example: {@code oci-phx-objectstorage}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * A string that represents the regional public IP address ranges for the Oracle service or
     * services covered by this {@code Service} object. Also known as the {@code Service} object's *service
     * CIDR label*.
     * <p>
     * When you set up a route rule to route traffic to the service gateway, use this value as the
     * rule's destination. See {@link RouteTable}. Also, when you set up
     * a security list rule to cover traffic with the service gateway, use the {@code cidrBlock} value
     * as the rule's destination (for an egress rule) or the source (for an ingress rule).
     * See {@link SecurityList}.
     * <p>
     * Example: {@code oci-phx-objectstorage}
     *
     * @return the value
     **/
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * Description of the Oracle service or services covered by this {@code Service} object.
     * <p>
     * Example: {@code OCI PHX Object Storage}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the Oracle service or services covered by this {@code Service} object.
     * <p>
     * Example: {@code OCI PHX Object Storage}
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The {@code Service} object's [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The {@code Service} object's [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Name of the {@code Service} object. This name can change and is not guaranteed to be unique.
     * <p>
     * Example: {@code OCI PHX Object Storage}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the {@code Service} object. This name can change and is not guaranteed to be unique.
     * <p>
     * Example: {@code OCI PHX Object Storage}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Service(");
        sb.append("cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Service)) {
            return false;
        }

        Service other = (Service) o;
        return java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
