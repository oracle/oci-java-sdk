/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Details of the operator action. Operator actions are pre-defined set of commands available to the
 * operator on different layers of the infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OperatorActionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class OperatorActionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "component",
        "compartmentId",
        "resourceType",
        "lifecycleState",
        "description"
    })
    public OperatorActionSummary(
            String id,
            String name,
            String component,
            String compartmentId,
            ResourceTypes resourceType,
            OperatorActionLifecycleStates lifecycleState,
            String description) {
        super();
        this.id = id;
        this.name = name;
        this.component = component;
        this.compartmentId = compartmentId;
        this.resourceType = resourceType;
        this.lifecycleState = lifecycleState;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier assigned by Oracle to an operator action. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier assigned by Oracle to an operator action.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Name of the operator action. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the operator action.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Name of the component for which the operator action is applicable. */
        @com.fasterxml.jackson.annotation.JsonProperty("component")
        private String component;

        /**
         * Name of the component for which the operator action is applicable.
         *
         * @param component the value to set
         * @return this builder
         */
        public Builder component(String component) {
            this.component = component;
            this.__explicitlySet__.add("component");
            return this;
        }
        /** compartmentId for which the OperatorAction is applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * compartmentId for which the OperatorAction is applicable
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** resourceType for which the OperatorAction is applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        /**
         * resourceType for which the OperatorAction is applicable
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** The current lifecycle state of the operator action. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperatorActionLifecycleStates lifecycleState;

        /**
         * The current lifecycle state of the operator action.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OperatorActionLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Description of the operator action in terms of associated risk profile, and
         * characteristics of the operating system commands made available to the operator under
         * this operator action.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the operator action in terms of associated risk profile, and
         * characteristics of the operating system commands made available to the operator under
         * this operator action.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperatorActionSummary build() {
            OperatorActionSummary model =
                    new OperatorActionSummary(
                            this.id,
                            this.name,
                            this.component,
                            this.compartmentId,
                            this.resourceType,
                            this.lifecycleState,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorActionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("component")) {
                this.component(model.getComponent());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /** Unique identifier assigned by Oracle to an operator action. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier assigned by Oracle to an operator action.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Name of the operator action. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the operator action.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Name of the component for which the operator action is applicable. */
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    private final String component;

    /**
     * Name of the component for which the operator action is applicable.
     *
     * @return the value
     */
    public String getComponent() {
        return component;
    }

    /** compartmentId for which the OperatorAction is applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * compartmentId for which the OperatorAction is applicable
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** resourceType for which the OperatorAction is applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceTypes resourceType;

    /**
     * resourceType for which the OperatorAction is applicable
     *
     * @return the value
     */
    public ResourceTypes getResourceType() {
        return resourceType;
    }

    /** The current lifecycle state of the operator action. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OperatorActionLifecycleStates lifecycleState;

    /**
     * The current lifecycle state of the operator action.
     *
     * @return the value
     */
    public OperatorActionLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Description of the operator action in terms of associated risk profile, and characteristics
     * of the operating system commands made available to the operator under this operator action.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the operator action in terms of associated risk profile, and characteristics
     * of the operating system commands made available to the operator under this operator action.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("OperatorActionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", component=").append(String.valueOf(this.component));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperatorActionSummary)) {
            return false;
        }

        OperatorActionSummary other = (OperatorActionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.component, other.component)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.component == null ? 43 : this.component.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
