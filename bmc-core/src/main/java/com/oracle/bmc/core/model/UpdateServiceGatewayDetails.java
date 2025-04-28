/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

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
        builder = UpdateServiceGatewayDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateServiceGatewayDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "blockTraffic",
        "definedTags",
        "displayName",
        "freeformTags",
        "routeTableId",
        "services"
    })
    public UpdateServiceGatewayDetails(
            Boolean blockTraffic,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String routeTableId,
            java.util.List<ServiceIdRequestDetails> services) {
        super();
        this.blockTraffic = blockTraffic;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.routeTableId = routeTableId;
        this.services = services;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether the service gateway blocks all traffic through it. The default is {@code false}.
         * When this is {@code true}, traffic is not routed to any services, regardless of route
         * rules.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockTraffic")
        private Boolean blockTraffic;

        /**
         * Whether the service gateway blocks all traffic through it. The default is {@code false}.
         * When this is {@code true}, traffic is not routed to any services, regardless of route
         * rules.
         *
         * <p>Example: {@code true}
         *
         * @param blockTraffic the value to set
         * @return this builder
         */
        public Builder blockTraffic(Boolean blockTraffic) {
            this.blockTraffic = blockTraffic;
            this.__explicitlySet__.add("blockTraffic");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the service gateway will use. For information about why you would associate a
         * route table with a service gateway, see [Transit Routing: Private Access to Oracle
         * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the service gateway will use. For information about why you would associate a
         * route table with a service gateway, see [Transit Routing: Private Access to Oracle
         * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm).
         *
         * @param routeTableId the value to set
         * @return this builder
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }
        /**
         * List of all the {@code Service} objects you want enabled on this service gateway. Sending
         * an empty list means you want to disable all services. Omitting this parameter entirely
         * keeps the existing list of services intact.
         *
         * <p>You can also enable or disable a particular {@code Service} by using {@link
         * #attachServiceId(AttachServiceIdRequest) attachServiceId} or {@link
         * #detachServiceId(DetachServiceIdRequest) detachServiceId}.
         *
         * <p>For each enabled {@code Service}, make sure there's a route rule with the {@code
         * Service} object's {@code cidrBlock} as the rule's destination and the service gateway as
         * the rule's target. See {@link RouteTable}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<ServiceIdRequestDetails> services;

        /**
         * List of all the {@code Service} objects you want enabled on this service gateway. Sending
         * an empty list means you want to disable all services. Omitting this parameter entirely
         * keeps the existing list of services intact.
         *
         * <p>You can also enable or disable a particular {@code Service} by using {@link
         * #attachServiceId(AttachServiceIdRequest) attachServiceId} or {@link
         * #detachServiceId(DetachServiceIdRequest) detachServiceId}.
         *
         * <p>For each enabled {@code Service}, make sure there's a route rule with the {@code
         * Service} object's {@code cidrBlock} as the rule's destination and the service gateway as
         * the rule's target. See {@link RouteTable}.
         *
         * @param services the value to set
         * @return this builder
         */
        public Builder services(java.util.List<ServiceIdRequestDetails> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateServiceGatewayDetails build() {
            UpdateServiceGatewayDetails model =
                    new UpdateServiceGatewayDetails(
                            this.blockTraffic,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.routeTableId,
                            this.services);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateServiceGatewayDetails model) {
            if (model.wasPropertyExplicitlySet("blockTraffic")) {
                this.blockTraffic(model.getBlockTraffic());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("services")) {
                this.services(model.getServices());
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
     * Whether the service gateway blocks all traffic through it. The default is {@code false}. When
     * this is {@code true}, traffic is not routed to any services, regardless of route rules.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockTraffic")
    private final Boolean blockTraffic;

    /**
     * Whether the service gateway blocks all traffic through it. The default is {@code false}. When
     * this is {@code true}, traffic is not routed to any services, regardless of route rules.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getBlockTraffic() {
        return blockTraffic;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the service gateway will use. For information about why you would associate a
     * route table with a service gateway, see [Transit Routing: Private Access to Oracle
     * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the service gateway will use. For information about why you would associate a
     * route table with a service gateway, see [Transit Routing: Private Access to Oracle
     * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm).
     *
     * @return the value
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * List of all the {@code Service} objects you want enabled on this service gateway. Sending an
     * empty list means you want to disable all services. Omitting this parameter entirely keeps the
     * existing list of services intact.
     *
     * <p>You can also enable or disable a particular {@code Service} by using {@link
     * #attachServiceId(AttachServiceIdRequest) attachServiceId} or {@link
     * #detachServiceId(DetachServiceIdRequest) detachServiceId}.
     *
     * <p>For each enabled {@code Service}, make sure there's a route rule with the {@code Service}
     * object's {@code cidrBlock} as the rule's destination and the service gateway as the rule's
     * target. See {@link RouteTable}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<ServiceIdRequestDetails> services;

    /**
     * List of all the {@code Service} objects you want enabled on this service gateway. Sending an
     * empty list means you want to disable all services. Omitting this parameter entirely keeps the
     * existing list of services intact.
     *
     * <p>You can also enable or disable a particular {@code Service} by using {@link
     * #attachServiceId(AttachServiceIdRequest) attachServiceId} or {@link
     * #detachServiceId(DetachServiceIdRequest) detachServiceId}.
     *
     * <p>For each enabled {@code Service}, make sure there's a route rule with the {@code Service}
     * object's {@code cidrBlock} as the rule's destination and the service gateway as the rule's
     * target. See {@link RouteTable}.
     *
     * @return the value
     */
    public java.util.List<ServiceIdRequestDetails> getServices() {
        return services;
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
        sb.append("UpdateServiceGatewayDetails(");
        sb.append("super=").append(super.toString());
        sb.append("blockTraffic=").append(String.valueOf(this.blockTraffic));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", services=").append(String.valueOf(this.services));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateServiceGatewayDetails)) {
            return false;
        }

        UpdateServiceGatewayDetails other = (UpdateServiceGatewayDetails) o;
        return java.util.Objects.equals(this.blockTraffic, other.blockTraffic)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.services, other.services)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.blockTraffic == null ? 43 : this.blockTraffic.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + (this.services == null ? 43 : this.services.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
