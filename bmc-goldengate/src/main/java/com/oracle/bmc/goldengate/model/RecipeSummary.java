/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The list of recipe details to create pipelines.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecipeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecipeSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "recipeType",
        "name",
        "displayName",
        "description",
        "supportedSourceTechnologyTypes",
        "supportedTargetTechnologyTypes"
    })
    public RecipeSummary(
            RecipeType recipeType,
            String name,
            String displayName,
            String description,
            java.util.List<TechnologyType> supportedSourceTechnologyTypes,
            java.util.List<TechnologyType> supportedTargetTechnologyTypes) {
        super();
        this.recipeType = recipeType;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.supportedSourceTechnologyTypes = supportedSourceTechnologyTypes;
        this.supportedTargetTechnologyTypes = supportedTargetTechnologyTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the recipe
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recipeType")
        private RecipeType recipeType;

        /**
         * The type of the recipe
         *
         * @param recipeType the value to set
         * @return this builder
         **/
        public Builder recipeType(RecipeType recipeType) {
            this.recipeType = recipeType;
            this.__explicitlySet__.add("recipeType");
            return this;
        }
        /**
         * An object's Display Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * An object's Display Name.
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
         * An object's Display Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
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
         * Metadata about this specific object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Metadata about this specific object.
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
         * Array of supported technology types for this recipe.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedSourceTechnologyTypes")
        private java.util.List<TechnologyType> supportedSourceTechnologyTypes;

        /**
         * Array of supported technology types for this recipe.
         *
         * @param supportedSourceTechnologyTypes the value to set
         * @return this builder
         **/
        public Builder supportedSourceTechnologyTypes(
                java.util.List<TechnologyType> supportedSourceTechnologyTypes) {
            this.supportedSourceTechnologyTypes = supportedSourceTechnologyTypes;
            this.__explicitlySet__.add("supportedSourceTechnologyTypes");
            return this;
        }
        /**
         * Array of supported technology types for this recipe.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedTargetTechnologyTypes")
        private java.util.List<TechnologyType> supportedTargetTechnologyTypes;

        /**
         * Array of supported technology types for this recipe.
         *
         * @param supportedTargetTechnologyTypes the value to set
         * @return this builder
         **/
        public Builder supportedTargetTechnologyTypes(
                java.util.List<TechnologyType> supportedTargetTechnologyTypes) {
            this.supportedTargetTechnologyTypes = supportedTargetTechnologyTypes;
            this.__explicitlySet__.add("supportedTargetTechnologyTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecipeSummary build() {
            RecipeSummary model =
                    new RecipeSummary(
                            this.recipeType,
                            this.name,
                            this.displayName,
                            this.description,
                            this.supportedSourceTechnologyTypes,
                            this.supportedTargetTechnologyTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecipeSummary model) {
            if (model.wasPropertyExplicitlySet("recipeType")) {
                this.recipeType(model.getRecipeType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("supportedSourceTechnologyTypes")) {
                this.supportedSourceTechnologyTypes(model.getSupportedSourceTechnologyTypes());
            }
            if (model.wasPropertyExplicitlySet("supportedTargetTechnologyTypes")) {
                this.supportedTargetTechnologyTypes(model.getSupportedTargetTechnologyTypes());
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
     * The type of the recipe
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recipeType")
    private final RecipeType recipeType;

    /**
     * The type of the recipe
     *
     * @return the value
     **/
    public RecipeType getRecipeType() {
        return recipeType;
    }

    /**
     * An object's Display Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * An object's Display Name.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * An object's Display Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Metadata about this specific object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Array of supported technology types for this recipe.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedSourceTechnologyTypes")
    private final java.util.List<TechnologyType> supportedSourceTechnologyTypes;

    /**
     * Array of supported technology types for this recipe.
     *
     * @return the value
     **/
    public java.util.List<TechnologyType> getSupportedSourceTechnologyTypes() {
        return supportedSourceTechnologyTypes;
    }

    /**
     * Array of supported technology types for this recipe.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedTargetTechnologyTypes")
    private final java.util.List<TechnologyType> supportedTargetTechnologyTypes;

    /**
     * Array of supported technology types for this recipe.
     *
     * @return the value
     **/
    public java.util.List<TechnologyType> getSupportedTargetTechnologyTypes() {
        return supportedTargetTechnologyTypes;
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
        sb.append("RecipeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("recipeType=").append(String.valueOf(this.recipeType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", supportedSourceTechnologyTypes=")
                .append(String.valueOf(this.supportedSourceTechnologyTypes));
        sb.append(", supportedTargetTechnologyTypes=")
                .append(String.valueOf(this.supportedTargetTechnologyTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecipeSummary)) {
            return false;
        }

        RecipeSummary other = (RecipeSummary) o;
        return java.util.Objects.equals(this.recipeType, other.recipeType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.supportedSourceTechnologyTypes, other.supportedSourceTechnologyTypes)
                && java.util.Objects.equals(
                        this.supportedTargetTechnologyTypes, other.supportedTargetTechnologyTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.recipeType == null ? 43 : this.recipeType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedSourceTechnologyTypes == null
                                ? 43
                                : this.supportedSourceTechnologyTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedTargetTechnologyTypes == null
                                ? 43
                                : this.supportedTargetTechnologyTypes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
