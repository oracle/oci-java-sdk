/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties that are required to create a skill composite entity. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSkillCompositeEntityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSkillCompositeEntityDetails extends CreateSkillEntityDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** List of entity attributes. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<EntityAttribute> attributes;

        /**
         * List of entity attributes.
         *
         * @param attributes the value to set
         * @return this builder
         */
        public Builder attributes(java.util.List<EntityAttribute> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }
        /** List of entity actions. */
        @com.fasterxml.jackson.annotation.JsonProperty("actions")
        private java.util.List<EntityAction> actions;

        /**
         * List of entity actions.
         *
         * @param actions the value to set
         * @return this builder
         */
        public Builder actions(java.util.List<EntityAction> actions) {
            this.actions = actions;
            this.__explicitlySet__.add("actions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("naturalLanguageMapping")
        private EntityNaturalLanguageMapping naturalLanguageMapping;

        public Builder naturalLanguageMapping(EntityNaturalLanguageMapping naturalLanguageMapping) {
            this.naturalLanguageMapping = naturalLanguageMapping;
            this.__explicitlySet__.add("naturalLanguageMapping");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSkillCompositeEntityDetails build() {
            CreateSkillCompositeEntityDetails model =
                    new CreateSkillCompositeEntityDetails(
                            this.name, this.attributes, this.actions, this.naturalLanguageMapping);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSkillCompositeEntityDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("attributes")) {
                this.attributes(model.getAttributes());
            }
            if (model.wasPropertyExplicitlySet("actions")) {
                this.actions(model.getActions());
            }
            if (model.wasPropertyExplicitlySet("naturalLanguageMapping")) {
                this.naturalLanguageMapping(model.getNaturalLanguageMapping());
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

    @Deprecated
    public CreateSkillCompositeEntityDetails(
            String name,
            java.util.List<EntityAttribute> attributes,
            java.util.List<EntityAction> actions,
            EntityNaturalLanguageMapping naturalLanguageMapping) {
        super(name);
        this.attributes = attributes;
        this.actions = actions;
        this.naturalLanguageMapping = naturalLanguageMapping;
    }

    /** List of entity attributes. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.List<EntityAttribute> attributes;

    /**
     * List of entity attributes.
     *
     * @return the value
     */
    public java.util.List<EntityAttribute> getAttributes() {
        return attributes;
    }

    /** List of entity actions. */
    @com.fasterxml.jackson.annotation.JsonProperty("actions")
    private final java.util.List<EntityAction> actions;

    /**
     * List of entity actions.
     *
     * @return the value
     */
    public java.util.List<EntityAction> getActions() {
        return actions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("naturalLanguageMapping")
    private final EntityNaturalLanguageMapping naturalLanguageMapping;

    public EntityNaturalLanguageMapping getNaturalLanguageMapping() {
        return naturalLanguageMapping;
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
        sb.append("CreateSkillCompositeEntityDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(", actions=").append(String.valueOf(this.actions));
        sb.append(", naturalLanguageMapping=").append(String.valueOf(this.naturalLanguageMapping));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSkillCompositeEntityDetails)) {
            return false;
        }

        CreateSkillCompositeEntityDetails other = (CreateSkillCompositeEntityDetails) o;
        return java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.actions, other.actions)
                && java.util.Objects.equals(
                        this.naturalLanguageMapping, other.naturalLanguageMapping)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result = (result * PRIME) + (this.actions == null ? 43 : this.actions.hashCode());
        result =
                (result * PRIME)
                        + (this.naturalLanguageMapping == null
                                ? 43
                                : this.naturalLanguageMapping.hashCode());
        return result;
    }
}
