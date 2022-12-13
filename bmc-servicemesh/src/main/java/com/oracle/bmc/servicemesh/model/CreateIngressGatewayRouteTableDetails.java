/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * The information about a new IngressGatewayRouteTable.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIngressGatewayRouteTableDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateIngressGatewayRouteTableDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ingressGatewayId",
        "name",
        "description",
        "priority",
        "routeRules",
        "compartmentId",
        "freeformTags",
        "definedTags"
    })
    public CreateIngressGatewayRouteTableDetails(
            String ingressGatewayId,
            String name,
            String description,
            Integer priority,
            java.util.List<IngressGatewayTrafficRouteRuleDetails> routeRules,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.ingressGatewayId = ingressGatewayId;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.routeRules = routeRules;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the service mesh in which this access policy is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ingressGatewayId")
        private String ingressGatewayId;

        /**
         * The OCID of the service mesh in which this access policy is created.
         * @param ingressGatewayId the value to set
         * @return this builder
         **/
        public Builder ingressGatewayId(String ingressGatewayId) {
            this.ingressGatewayId = ingressGatewayId;
            this.__explicitlySet__.add("ingressGatewayId");
            return this;
        }
        /**
         * A user-friendly name. The name must be unique within the same ingress gateway and cannot be changed after creation.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My unique resource name}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A user-friendly name. The name must be unique within the same ingress gateway and cannot be changed after creation.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My unique resource name}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Description of the resource. It can be changed after creation.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code This is my new resource}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the resource. It can be changed after creation.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code This is my new resource}
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
         * The priority of the route table. Lower value means higher priority. The routes are declared based on the priority.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * The priority of the route table. Lower value means higher priority. The routes are declared based on the priority.
         * @param priority the value to set
         * @return this builder
         **/
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }
        /**
         * The route rules for the ingress gateway.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeRules")
        private java.util.List<IngressGatewayTrafficRouteRuleDetails> routeRules;

        /**
         * The route rules for the ingress gateway.
         * @param routeRules the value to set
         * @return this builder
         **/
        public Builder routeRules(
                java.util.List<IngressGatewayTrafficRouteRuleDetails> routeRules) {
            this.routeRules = routeRules;
            this.__explicitlySet__.add("routeRules");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIngressGatewayRouteTableDetails build() {
            CreateIngressGatewayRouteTableDetails model =
                    new CreateIngressGatewayRouteTableDetails(
                            this.ingressGatewayId,
                            this.name,
                            this.description,
                            this.priority,
                            this.routeRules,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIngressGatewayRouteTableDetails model) {
            if (model.wasPropertyExplicitlySet("ingressGatewayId")) {
                this.ingressGatewayId(model.getIngressGatewayId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("routeRules")) {
                this.routeRules(model.getRouteRules());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The OCID of the service mesh in which this access policy is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ingressGatewayId")
    private final String ingressGatewayId;

    /**
     * The OCID of the service mesh in which this access policy is created.
     * @return the value
     **/
    public String getIngressGatewayId() {
        return ingressGatewayId;
    }

    /**
     * A user-friendly name. The name must be unique within the same ingress gateway and cannot be changed after creation.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My unique resource name}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-friendly name. The name must be unique within the same ingress gateway and cannot be changed after creation.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My unique resource name}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Description of the resource. It can be changed after creation.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code This is my new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the resource. It can be changed after creation.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code This is my new resource}
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The priority of the route table. Lower value means higher priority. The routes are declared based on the priority.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * The priority of the route table. Lower value means higher priority. The routes are declared based on the priority.
     * @return the value
     **/
    public Integer getPriority() {
        return priority;
    }

    /**
     * The route rules for the ingress gateway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeRules")
    private final java.util.List<IngressGatewayTrafficRouteRuleDetails> routeRules;

    /**
     * The route rules for the ingress gateway.
     * @return the value
     **/
    public java.util.List<IngressGatewayTrafficRouteRuleDetails> getRouteRules() {
        return routeRules;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateIngressGatewayRouteTableDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ingressGatewayId=").append(String.valueOf(this.ingressGatewayId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", routeRules=").append(String.valueOf(this.routeRules));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIngressGatewayRouteTableDetails)) {
            return false;
        }

        CreateIngressGatewayRouteTableDetails other = (CreateIngressGatewayRouteTableDetails) o;
        return java.util.Objects.equals(this.ingressGatewayId, other.ingressGatewayId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.routeRules, other.routeRules)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ingressGatewayId == null ? 43 : this.ingressGatewayId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.routeRules == null ? 43 : this.routeRules.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
