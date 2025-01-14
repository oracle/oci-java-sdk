/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Action of an entity <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EntityAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EntityAction extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "crudType", "naturalLanguageMapping", "arguments"})
    public EntityAction(
            String name,
            String crudType,
            EntityActionNaturalLanguageMapping naturalLanguageMapping,
            java.util.List<EntityActionArgument> arguments) {
        super();
        this.name = name;
        this.crudType = crudType;
        this.naturalLanguageMapping = naturalLanguageMapping;
        this.arguments = arguments;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of an entity action */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of an entity action
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Type of CRUD operation for entity action */
        @com.fasterxml.jackson.annotation.JsonProperty("crudType")
        private String crudType;

        /**
         * Type of CRUD operation for entity action
         *
         * @param crudType the value to set
         * @return this builder
         */
        public Builder crudType(String crudType) {
            this.crudType = crudType;
            this.__explicitlySet__.add("crudType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("naturalLanguageMapping")
        private EntityActionNaturalLanguageMapping naturalLanguageMapping;

        public Builder naturalLanguageMapping(
                EntityActionNaturalLanguageMapping naturalLanguageMapping) {
            this.naturalLanguageMapping = naturalLanguageMapping;
            this.__explicitlySet__.add("naturalLanguageMapping");
            return this;
        }
        /** List of entity action arguments */
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<EntityActionArgument> arguments;

        /**
         * List of entity action arguments
         *
         * @param arguments the value to set
         * @return this builder
         */
        public Builder arguments(java.util.List<EntityActionArgument> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntityAction build() {
            EntityAction model =
                    new EntityAction(
                            this.name, this.crudType, this.naturalLanguageMapping, this.arguments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityAction model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("crudType")) {
                this.crudType(model.getCrudType());
            }
            if (model.wasPropertyExplicitlySet("naturalLanguageMapping")) {
                this.naturalLanguageMapping(model.getNaturalLanguageMapping());
            }
            if (model.wasPropertyExplicitlySet("arguments")) {
                this.arguments(model.getArguments());
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

    /** Name of an entity action */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of an entity action
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Type of CRUD operation for entity action */
    @com.fasterxml.jackson.annotation.JsonProperty("crudType")
    private final String crudType;

    /**
     * Type of CRUD operation for entity action
     *
     * @return the value
     */
    public String getCrudType() {
        return crudType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("naturalLanguageMapping")
    private final EntityActionNaturalLanguageMapping naturalLanguageMapping;

    public EntityActionNaturalLanguageMapping getNaturalLanguageMapping() {
        return naturalLanguageMapping;
    }

    /** List of entity action arguments */
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<EntityActionArgument> arguments;

    /**
     * List of entity action arguments
     *
     * @return the value
     */
    public java.util.List<EntityActionArgument> getArguments() {
        return arguments;
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
        sb.append("EntityAction(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", crudType=").append(String.valueOf(this.crudType));
        sb.append(", naturalLanguageMapping=").append(String.valueOf(this.naturalLanguageMapping));
        sb.append(", arguments=").append(String.valueOf(this.arguments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityAction)) {
            return false;
        }

        EntityAction other = (EntityAction) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.crudType, other.crudType)
                && java.util.Objects.equals(
                        this.naturalLanguageMapping, other.naturalLanguageMapping)
                && java.util.Objects.equals(this.arguments, other.arguments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.crudType == null ? 43 : this.crudType.hashCode());
        result =
                (result * PRIME)
                        + (this.naturalLanguageMapping == null
                                ? 43
                                : this.naturalLanguageMapping.hashCode());
        result = (result * PRIME) + (this.arguments == null ? 43 : this.arguments.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
