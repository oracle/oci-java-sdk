/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Details of the operator action. Operator actions are a pre-defined set of commands available to the operator on different layers of the infrastructure. Although the groupings may differ depending on the infrastructure layers,
 * the groups are designed to enable the operator access to commands to resolve a specific set of issues. The infrastructure layers controlled by the Operator Control include Dom0, CellServer, and Control Plane Server (CPS).
 * <p>
 * There are five groups available to the operator. x-obmcs-top-level-enum: '#/definitions/OperatorActionCategories' enum: *OPERATORACTIONCATEGORIES
 * <p>
 * The following infrastructure layers are controlled by the operator actions x-obmcs-top-level-enum: '#/definitions/InfrastructureLayers' enum: *INFRASTRUCTURELAYERS
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OperatorAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OperatorAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerDisplayName")
        private String customerDisplayName;

        public Builder customerDisplayName(String customerDisplayName) {
            this.customerDisplayName = customerDisplayName;
            this.__explicitlySet__.add("customerDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("component")
        private String component;

        public Builder component(String component) {
            this.component = component;
            this.__explicitlySet__.add("component");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<OperatorActionProperties> properties;

        public Builder properties(java.util.List<OperatorActionProperties> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperatorAction build() {
            OperatorAction __instance__ =
                    new OperatorAction(
                            id,
                            name,
                            customerDisplayName,
                            component,
                            resourceType,
                            description,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorAction o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .customerDisplayName(o.getCustomerDisplayName())
                            .component(o.getComponent())
                            .resourceType(o.getResourceType())
                            .description(o.getDescription())
                            .properties(o.getProperties());

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

    /**
     * Unique Oracle assigned identifier for the operator action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Unique name of the operator action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Display Name of the operator action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerDisplayName")
    String customerDisplayName;

    /**
     * Name of the infrastructure layer associated with the operator action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    String component;

    /**
     * resourceType for which the OperatorAction is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    ResourceTypes resourceType;

    /**
     * Description of the operator action in terms of associated risk profile, and characteristics of the operating system commands made
     * available to the operator under this operator action.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Fine grained properties associated with the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.List<OperatorActionProperties> properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
