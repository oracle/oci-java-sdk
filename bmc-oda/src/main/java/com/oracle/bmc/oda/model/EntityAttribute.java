/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Attribute of an entity <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EntityAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EntityAttribute
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "type",
        "naturalLanguageMapping",
        "isMultiValue",
        "isFuzzyMatch",
        "isInvertComparisons",
        "temporalPreference",
        "entityName"
    })
    public EntityAttribute(
            String name,
            EntityAttributeType type,
            EntityAttributeNaturalLanguageMapping naturalLanguageMapping,
            Boolean isMultiValue,
            Boolean isFuzzyMatch,
            Boolean isInvertComparisons,
            TemporalPreference temporalPreference,
            String entityName) {
        super();
        this.name = name;
        this.type = type;
        this.naturalLanguageMapping = naturalLanguageMapping;
        this.isMultiValue = isMultiValue;
        this.isFuzzyMatch = isFuzzyMatch;
        this.isInvertComparisons = isInvertComparisons;
        this.temporalPreference = temporalPreference;
        this.entityName = entityName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of an entity attribute */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of an entity attribute
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The type of an entity attribute */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private EntityAttributeType type;

        /**
         * The type of an entity attribute
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(EntityAttributeType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("naturalLanguageMapping")
        private EntityAttributeNaturalLanguageMapping naturalLanguageMapping;

        public Builder naturalLanguageMapping(
                EntityAttributeNaturalLanguageMapping naturalLanguageMapping) {
            this.naturalLanguageMapping = naturalLanguageMapping;
            this.__explicitlySet__.add("naturalLanguageMapping");
            return this;
        }
        /** Is the entity attribute multi-value */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiValue")
        private Boolean isMultiValue;

        /**
         * Is the entity attribute multi-value
         *
         * @param isMultiValue the value to set
         * @return this builder
         */
        public Builder isMultiValue(Boolean isMultiValue) {
            this.isMultiValue = isMultiValue;
            this.__explicitlySet__.add("isMultiValue");
            return this;
        }
        /** Is the entity attribute a fuzzy match */
        @com.fasterxml.jackson.annotation.JsonProperty("isFuzzyMatch")
        private Boolean isFuzzyMatch;

        /**
         * Is the entity attribute a fuzzy match
         *
         * @param isFuzzyMatch the value to set
         * @return this builder
         */
        public Builder isFuzzyMatch(Boolean isFuzzyMatch) {
            this.isFuzzyMatch = isFuzzyMatch;
            this.__explicitlySet__.add("isFuzzyMatch");
            return this;
        }
        /** Are comparisons inverted in the entity attribute */
        @com.fasterxml.jackson.annotation.JsonProperty("isInvertComparisons")
        private Boolean isInvertComparisons;

        /**
         * Are comparisons inverted in the entity attribute
         *
         * @param isInvertComparisons the value to set
         * @return this builder
         */
        public Builder isInvertComparisons(Boolean isInvertComparisons) {
            this.isInvertComparisons = isInvertComparisons;
            this.__explicitlySet__.add("isInvertComparisons");
            return this;
        }
        /** Temporal preference of an attribute */
        @com.fasterxml.jackson.annotation.JsonProperty("temporalPreference")
        private TemporalPreference temporalPreference;

        /**
         * Temporal preference of an attribute
         *
         * @param temporalPreference the value to set
         * @return this builder
         */
        public Builder temporalPreference(TemporalPreference temporalPreference) {
            this.temporalPreference = temporalPreference;
            this.__explicitlySet__.add("temporalPreference");
            return this;
        }
        /** Name of referenced entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * Name of referenced entity.
         *
         * @param entityName the value to set
         * @return this builder
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntityAttribute build() {
            EntityAttribute model =
                    new EntityAttribute(
                            this.name,
                            this.type,
                            this.naturalLanguageMapping,
                            this.isMultiValue,
                            this.isFuzzyMatch,
                            this.isInvertComparisons,
                            this.temporalPreference,
                            this.entityName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityAttribute model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("naturalLanguageMapping")) {
                this.naturalLanguageMapping(model.getNaturalLanguageMapping());
            }
            if (model.wasPropertyExplicitlySet("isMultiValue")) {
                this.isMultiValue(model.getIsMultiValue());
            }
            if (model.wasPropertyExplicitlySet("isFuzzyMatch")) {
                this.isFuzzyMatch(model.getIsFuzzyMatch());
            }
            if (model.wasPropertyExplicitlySet("isInvertComparisons")) {
                this.isInvertComparisons(model.getIsInvertComparisons());
            }
            if (model.wasPropertyExplicitlySet("temporalPreference")) {
                this.temporalPreference(model.getTemporalPreference());
            }
            if (model.wasPropertyExplicitlySet("entityName")) {
                this.entityName(model.getEntityName());
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

    /** The name of an entity attribute */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of an entity attribute
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The type of an entity attribute */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final EntityAttributeType type;

    /**
     * The type of an entity attribute
     *
     * @return the value
     */
    public EntityAttributeType getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("naturalLanguageMapping")
    private final EntityAttributeNaturalLanguageMapping naturalLanguageMapping;

    public EntityAttributeNaturalLanguageMapping getNaturalLanguageMapping() {
        return naturalLanguageMapping;
    }

    /** Is the entity attribute multi-value */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValue")
    private final Boolean isMultiValue;

    /**
     * Is the entity attribute multi-value
     *
     * @return the value
     */
    public Boolean getIsMultiValue() {
        return isMultiValue;
    }

    /** Is the entity attribute a fuzzy match */
    @com.fasterxml.jackson.annotation.JsonProperty("isFuzzyMatch")
    private final Boolean isFuzzyMatch;

    /**
     * Is the entity attribute a fuzzy match
     *
     * @return the value
     */
    public Boolean getIsFuzzyMatch() {
        return isFuzzyMatch;
    }

    /** Are comparisons inverted in the entity attribute */
    @com.fasterxml.jackson.annotation.JsonProperty("isInvertComparisons")
    private final Boolean isInvertComparisons;

    /**
     * Are comparisons inverted in the entity attribute
     *
     * @return the value
     */
    public Boolean getIsInvertComparisons() {
        return isInvertComparisons;
    }

    /** Temporal preference of an attribute */
    @com.fasterxml.jackson.annotation.JsonProperty("temporalPreference")
    private final TemporalPreference temporalPreference;

    /**
     * Temporal preference of an attribute
     *
     * @return the value
     */
    public TemporalPreference getTemporalPreference() {
        return temporalPreference;
    }

    /** Name of referenced entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * Name of referenced entity.
     *
     * @return the value
     */
    public String getEntityName() {
        return entityName;
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
        sb.append("EntityAttribute(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", naturalLanguageMapping=").append(String.valueOf(this.naturalLanguageMapping));
        sb.append(", isMultiValue=").append(String.valueOf(this.isMultiValue));
        sb.append(", isFuzzyMatch=").append(String.valueOf(this.isFuzzyMatch));
        sb.append(", isInvertComparisons=").append(String.valueOf(this.isInvertComparisons));
        sb.append(", temporalPreference=").append(String.valueOf(this.temporalPreference));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityAttribute)) {
            return false;
        }

        EntityAttribute other = (EntityAttribute) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(
                        this.naturalLanguageMapping, other.naturalLanguageMapping)
                && java.util.Objects.equals(this.isMultiValue, other.isMultiValue)
                && java.util.Objects.equals(this.isFuzzyMatch, other.isFuzzyMatch)
                && java.util.Objects.equals(this.isInvertComparisons, other.isInvertComparisons)
                && java.util.Objects.equals(this.temporalPreference, other.temporalPreference)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.naturalLanguageMapping == null
                                ? 43
                                : this.naturalLanguageMapping.hashCode());
        result = (result * PRIME) + (this.isMultiValue == null ? 43 : this.isMultiValue.hashCode());
        result = (result * PRIME) + (this.isFuzzyMatch == null ? 43 : this.isFuzzyMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.isInvertComparisons == null
                                ? 43
                                : this.isInvertComparisons.hashCode());
        result =
                (result * PRIME)
                        + (this.temporalPreference == null
                                ? 43
                                : this.temporalPreference.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
