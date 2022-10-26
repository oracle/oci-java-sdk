/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.model;

/**
 * A relationship name and list of releated entities. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IndicatorRelationship.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class IndicatorRelationship
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "relatedEntity", "attribution"})
    public IndicatorRelationship(
            String name,
            EntityReference relatedEntity,
            java.util.List<DataAttribution> attribution) {
        super();
        this.name = name;
        this.relatedEntity = relatedEntity;
        this.attribution = attribution;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the attribute.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedEntity")
        private EntityReference relatedEntity;

        public Builder relatedEntity(EntityReference relatedEntity) {
            this.relatedEntity = relatedEntity;
            this.__explicitlySet__.add("relatedEntity");
            return this;
        }
        /** The array of attribution data that support this relationship. */
        @com.fasterxml.jackson.annotation.JsonProperty("attribution")
        private java.util.List<DataAttribution> attribution;

        /**
         * The array of attribution data that support this relationship.
         *
         * @param attribution the value to set
         * @return this builder
         */
        public Builder attribution(java.util.List<DataAttribution> attribution) {
            this.attribution = attribution;
            this.__explicitlySet__.add("attribution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IndicatorRelationship build() {
            IndicatorRelationship model =
                    new IndicatorRelationship(this.name, this.relatedEntity, this.attribution);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IndicatorRelationship model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("relatedEntity")) {
                this.relatedEntity(model.getRelatedEntity());
            }
            if (model.wasPropertyExplicitlySet("attribution")) {
                this.attribution(model.getAttribution());
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

    /** The name of the attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the attribute.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("relatedEntity")
    private final EntityReference relatedEntity;

    public EntityReference getRelatedEntity() {
        return relatedEntity;
    }

    /** The array of attribution data that support this relationship. */
    @com.fasterxml.jackson.annotation.JsonProperty("attribution")
    private final java.util.List<DataAttribution> attribution;

    /**
     * The array of attribution data that support this relationship.
     *
     * @return the value
     */
    public java.util.List<DataAttribution> getAttribution() {
        return attribution;
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
        sb.append("IndicatorRelationship(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", relatedEntity=").append(String.valueOf(this.relatedEntity));
        sb.append(", attribution=").append(String.valueOf(this.attribution));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IndicatorRelationship)) {
            return false;
        }

        IndicatorRelationship other = (IndicatorRelationship) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.relatedEntity, other.relatedEntity)
                && java.util.Objects.equals(this.attribution, other.attribution)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedEntity == null ? 43 : this.relatedEntity.hashCode());
        result = (result * PRIME) + (this.attribution == null ? 43 : this.attribution.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
