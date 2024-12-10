/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * Details of the Service Provider Action. Service provider actions are a pre-defined set of commands available to the support operator on different layers of the infrastructure. Although the groupings may differ depending on the infrastructure layers,
 * the groups are designed to enable the support operator access to commands to resolve a specific set of issues.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceProviderAction.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceProviderAction
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "customerDisplayName",
        "component",
        "resourceType",
        "serviceProviderServiceTypes",
        "lifecycleState",
        "description",
        "properties"
    })
    public ServiceProviderAction(
            String id,
            String name,
            String customerDisplayName,
            String component,
            DelegationControlResourceType resourceType,
            java.util.List<ServiceProviderServiceType> serviceProviderServiceTypes,
            LifecycleState lifecycleState,
            String description,
            java.util.List<ServiceProviderActionProperties> properties) {
        super();
        this.id = id;
        this.name = name;
        this.customerDisplayName = customerDisplayName;
        this.component = component;
        this.resourceType = resourceType;
        this.serviceProviderServiceTypes = serviceProviderServiceTypes;
        this.lifecycleState = lifecycleState;
        this.description = description;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique Oracle assigned identifier for the Service Provider Action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique Oracle assigned identifier for the Service Provider Action.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique name of the Service Provider Action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique name of the Service Provider Action.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Display Name of the Service Provider Action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerDisplayName")
        private String customerDisplayName;

        /**
         * Display Name of the Service Provider Action.
         * @param customerDisplayName the value to set
         * @return this builder
         **/
        public Builder customerDisplayName(String customerDisplayName) {
            this.customerDisplayName = customerDisplayName;
            this.__explicitlySet__.add("customerDisplayName");
            return this;
        }
        /**
         * Name of the infrastructure layer associated with the Service Provider Action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("component")
        private String component;

        /**
         * Name of the infrastructure layer associated with the Service Provider Action.
         * @param component the value to set
         * @return this builder
         **/
        public Builder component(String component) {
            this.component = component;
            this.__explicitlySet__.add("component");
            return this;
        }
        /**
         * resourceType for which the ServiceProviderAction is applicable
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private DelegationControlResourceType resourceType;

        /**
         * resourceType for which the ServiceProviderAction is applicable
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(DelegationControlResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * List of Service Provider Service Types that this Service Provider Action is applicable to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceProviderServiceTypes")
        private java.util.List<ServiceProviderServiceType> serviceProviderServiceTypes;

        /**
         * List of Service Provider Service Types that this Service Provider Action is applicable to.
         * @param serviceProviderServiceTypes the value to set
         * @return this builder
         **/
        public Builder serviceProviderServiceTypes(
                java.util.List<ServiceProviderServiceType> serviceProviderServiceTypes) {
            this.serviceProviderServiceTypes = serviceProviderServiceTypes;
            this.__explicitlySet__.add("serviceProviderServiceTypes");
            return this;
        }
        /**
         * The current lifecycle state of the Service Provider Action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the Service Provider Action.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Description of the Service Provider Action in terms of associated risk profile, and characteristics of the operating system commands made
         * available to the support operator under this Service Provider Action.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the Service Provider Action in terms of associated risk profile, and characteristics of the operating system commands made
         * available to the support operator under this Service Provider Action.
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
         * Fine grained properties associated with the Delegation Control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<ServiceProviderActionProperties> properties;

        /**
         * Fine grained properties associated with the Delegation Control.
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.List<ServiceProviderActionProperties> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceProviderAction build() {
            ServiceProviderAction model =
                    new ServiceProviderAction(
                            this.id,
                            this.name,
                            this.customerDisplayName,
                            this.component,
                            this.resourceType,
                            this.serviceProviderServiceTypes,
                            this.lifecycleState,
                            this.description,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceProviderAction model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("customerDisplayName")) {
                this.customerDisplayName(model.getCustomerDisplayName());
            }
            if (model.wasPropertyExplicitlySet("component")) {
                this.component(model.getComponent());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("serviceProviderServiceTypes")) {
                this.serviceProviderServiceTypes(model.getServiceProviderServiceTypes());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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
     * Unique Oracle assigned identifier for the Service Provider Action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique Oracle assigned identifier for the Service Provider Action.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique name of the Service Provider Action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique name of the Service Provider Action.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Display Name of the Service Provider Action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerDisplayName")
    private final String customerDisplayName;

    /**
     * Display Name of the Service Provider Action.
     * @return the value
     **/
    public String getCustomerDisplayName() {
        return customerDisplayName;
    }

    /**
     * Name of the infrastructure layer associated with the Service Provider Action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    private final String component;

    /**
     * Name of the infrastructure layer associated with the Service Provider Action.
     * @return the value
     **/
    public String getComponent() {
        return component;
    }

    /**
     * resourceType for which the ServiceProviderAction is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final DelegationControlResourceType resourceType;

    /**
     * resourceType for which the ServiceProviderAction is applicable
     * @return the value
     **/
    public DelegationControlResourceType getResourceType() {
        return resourceType;
    }

    /**
     * List of Service Provider Service Types that this Service Provider Action is applicable to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceProviderServiceTypes")
    private final java.util.List<ServiceProviderServiceType> serviceProviderServiceTypes;

    /**
     * List of Service Provider Service Types that this Service Provider Action is applicable to.
     * @return the value
     **/
    public java.util.List<ServiceProviderServiceType> getServiceProviderServiceTypes() {
        return serviceProviderServiceTypes;
    }

    /**
     * The current lifecycle state of the Service Provider Action.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current lifecycle state of the Service Provider Action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the Service Provider Action.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Description of the Service Provider Action in terms of associated risk profile, and characteristics of the operating system commands made
     * available to the support operator under this Service Provider Action.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the Service Provider Action in terms of associated risk profile, and characteristics of the operating system commands made
     * available to the support operator under this Service Provider Action.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Fine grained properties associated with the Delegation Control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<ServiceProviderActionProperties> properties;

    /**
     * Fine grained properties associated with the Delegation Control.
     * @return the value
     **/
    public java.util.List<ServiceProviderActionProperties> getProperties() {
        return properties;
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
        sb.append("ServiceProviderAction(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", customerDisplayName=").append(String.valueOf(this.customerDisplayName));
        sb.append(", component=").append(String.valueOf(this.component));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", serviceProviderServiceTypes=")
                .append(String.valueOf(this.serviceProviderServiceTypes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceProviderAction)) {
            return false;
        }

        ServiceProviderAction other = (ServiceProviderAction) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.customerDisplayName, other.customerDisplayName)
                && java.util.Objects.equals(this.component, other.component)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(
                        this.serviceProviderServiceTypes, other.serviceProviderServiceTypes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.customerDisplayName == null
                                ? 43
                                : this.customerDisplayName.hashCode());
        result = (result * PRIME) + (this.component == null ? 43 : this.component.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceProviderServiceTypes == null
                                ? 43
                                : this.serviceProviderServiceTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
