/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Entity Object Reference <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Entity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Entity extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"entityValue", "pronunciations", "weight"})
    public Entity(String entityValue, java.util.List<Pronunciation> pronunciations, Float weight) {
        super();
        this.entityValue = entityValue;
        this.pronunciations = pronunciations;
        this.weight = weight;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Entity value */
        @com.fasterxml.jackson.annotation.JsonProperty("entityValue")
        private String entityValue;

        /**
         * Entity value
         *
         * @param entityValue the value to set
         * @return this builder
         */
        public Builder entityValue(String entityValue) {
            this.entityValue = entityValue;
            this.__explicitlySet__.add("entityValue");
            return this;
        }
        /** List of pronunciations (minimum 1, maximum 255) */
        @com.fasterxml.jackson.annotation.JsonProperty("pronunciations")
        private java.util.List<Pronunciation> pronunciations;

        /**
         * List of pronunciations (minimum 1, maximum 255)
         *
         * @param pronunciations the value to set
         * @return this builder
         */
        public Builder pronunciations(java.util.List<Pronunciation> pronunciations) {
            this.pronunciations = pronunciations;
            this.__explicitlySet__.add("pronunciations");
            return this;
        }
        /** Entity weight */
        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Float weight;

        /**
         * Entity weight
         *
         * @param weight the value to set
         * @return this builder
         */
        public Builder weight(Float weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Entity build() {
            Entity model = new Entity(this.entityValue, this.pronunciations, this.weight);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Entity model) {
            if (model.wasPropertyExplicitlySet("entityValue")) {
                this.entityValue(model.getEntityValue());
            }
            if (model.wasPropertyExplicitlySet("pronunciations")) {
                this.pronunciations(model.getPronunciations());
            }
            if (model.wasPropertyExplicitlySet("weight")) {
                this.weight(model.getWeight());
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

    /** Entity value */
    @com.fasterxml.jackson.annotation.JsonProperty("entityValue")
    private final String entityValue;

    /**
     * Entity value
     *
     * @return the value
     */
    public String getEntityValue() {
        return entityValue;
    }

    /** List of pronunciations (minimum 1, maximum 255) */
    @com.fasterxml.jackson.annotation.JsonProperty("pronunciations")
    private final java.util.List<Pronunciation> pronunciations;

    /**
     * List of pronunciations (minimum 1, maximum 255)
     *
     * @return the value
     */
    public java.util.List<Pronunciation> getPronunciations() {
        return pronunciations;
    }

    /** Entity weight */
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final Float weight;

    /**
     * Entity weight
     *
     * @return the value
     */
    public Float getWeight() {
        return weight;
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
        sb.append("Entity(");
        sb.append("super=").append(super.toString());
        sb.append("entityValue=").append(String.valueOf(this.entityValue));
        sb.append(", pronunciations=").append(String.valueOf(this.pronunciations));
        sb.append(", weight=").append(String.valueOf(this.weight));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Entity)) {
            return false;
        }

        Entity other = (Entity) o;
        return java.util.Objects.equals(this.entityValue, other.entityValue)
                && java.util.Objects.equals(this.pronunciations, other.pronunciations)
                && java.util.Objects.equals(this.weight, other.weight)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityValue == null ? 43 : this.entityValue.hashCode());
        result =
                (result * PRIME)
                        + (this.pronunciations == null ? 43 : this.pronunciations.hashCode());
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
