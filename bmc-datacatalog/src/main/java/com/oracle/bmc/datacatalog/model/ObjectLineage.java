/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Lineage for an object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ObjectLineage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ObjectLineage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "level",
        "direction",
        "objects",
        "relationships",
        "annotations"
    })
    public ObjectLineage(
            Integer level,
            LineageDirection direction,
            java.util.List<LineageObject> objects,
            java.util.List<LineageRelationship> relationships,
            java.util.Map<String, java.util.Map<String, String>> annotations) {
        super();
        this.level = level;
        this.direction = direction;
        this.objects = objects;
        this.relationships = relationships;
        this.annotations = annotations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Object level at which the lineage is returned. */
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private Integer level;

        /**
         * Object level at which the lineage is returned.
         *
         * @param level the value to set
         * @return this builder
         */
        public Builder level(Integer level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }
        /** Direction of the lineage returned. */
        @com.fasterxml.jackson.annotation.JsonProperty("direction")
        private LineageDirection direction;

        /**
         * Direction of the lineage returned.
         *
         * @param direction the value to set
         * @return this builder
         */
        public Builder direction(LineageDirection direction) {
            this.direction = direction;
            this.__explicitlySet__.add("direction");
            return this;
        }
        /** Set of objects that are involved in the lineage. */
        @com.fasterxml.jackson.annotation.JsonProperty("objects")
        private java.util.List<LineageObject> objects;

        /**
         * Set of objects that are involved in the lineage.
         *
         * @param objects the value to set
         * @return this builder
         */
        public Builder objects(java.util.List<LineageObject> objects) {
            this.objects = objects;
            this.__explicitlySet__.add("objects");
            return this;
        }
        /** Set of relationships between the objects in the 'objects' set. */
        @com.fasterxml.jackson.annotation.JsonProperty("relationships")
        private java.util.List<LineageRelationship> relationships;

        /**
         * Set of relationships between the objects in the 'objects' set.
         *
         * @param relationships the value to set
         * @return this builder
         */
        public Builder relationships(java.util.List<LineageRelationship> relationships) {
            this.relationships = relationships;
            this.__explicitlySet__.add("relationships");
            return this;
        }
        /**
         * A map of maps that contains additional information in explanation of the lineage
         * returned. The map keys are categories of information and the values are maps of
         * annotation names to their corresponding values. Every annotation is contained inside a
         * category. Example: {@code {"annotations": { "category": { "key": "value"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("annotations")
        private java.util.Map<String, java.util.Map<String, String>> annotations;

        /**
         * A map of maps that contains additional information in explanation of the lineage
         * returned. The map keys are categories of information and the values are maps of
         * annotation names to their corresponding values. Every annotation is contained inside a
         * category. Example: {@code {"annotations": { "category": { "key": "value"}}}}
         *
         * @param annotations the value to set
         * @return this builder
         */
        public Builder annotations(
                java.util.Map<String, java.util.Map<String, String>> annotations) {
            this.annotations = annotations;
            this.__explicitlySet__.add("annotations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectLineage build() {
            ObjectLineage model =
                    new ObjectLineage(
                            this.level,
                            this.direction,
                            this.objects,
                            this.relationships,
                            this.annotations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectLineage model) {
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
            }
            if (model.wasPropertyExplicitlySet("direction")) {
                this.direction(model.getDirection());
            }
            if (model.wasPropertyExplicitlySet("objects")) {
                this.objects(model.getObjects());
            }
            if (model.wasPropertyExplicitlySet("relationships")) {
                this.relationships(model.getRelationships());
            }
            if (model.wasPropertyExplicitlySet("annotations")) {
                this.annotations(model.getAnnotations());
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

    /** Object level at which the lineage is returned. */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final Integer level;

    /**
     * Object level at which the lineage is returned.
     *
     * @return the value
     */
    public Integer getLevel() {
        return level;
    }

    /** Direction of the lineage returned. */
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final LineageDirection direction;

    /**
     * Direction of the lineage returned.
     *
     * @return the value
     */
    public LineageDirection getDirection() {
        return direction;
    }

    /** Set of objects that are involved in the lineage. */
    @com.fasterxml.jackson.annotation.JsonProperty("objects")
    private final java.util.List<LineageObject> objects;

    /**
     * Set of objects that are involved in the lineage.
     *
     * @return the value
     */
    public java.util.List<LineageObject> getObjects() {
        return objects;
    }

    /** Set of relationships between the objects in the 'objects' set. */
    @com.fasterxml.jackson.annotation.JsonProperty("relationships")
    private final java.util.List<LineageRelationship> relationships;

    /**
     * Set of relationships between the objects in the 'objects' set.
     *
     * @return the value
     */
    public java.util.List<LineageRelationship> getRelationships() {
        return relationships;
    }

    /**
     * A map of maps that contains additional information in explanation of the lineage returned.
     * The map keys are categories of information and the values are maps of annotation names to
     * their corresponding values. Every annotation is contained inside a category. Example: {@code
     * {"annotations": { "category": { "key": "value"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("annotations")
    private final java.util.Map<String, java.util.Map<String, String>> annotations;

    /**
     * A map of maps that contains additional information in explanation of the lineage returned.
     * The map keys are categories of information and the values are maps of annotation names to
     * their corresponding values. Every annotation is contained inside a category. Example: {@code
     * {"annotations": { "category": { "key": "value"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getAnnotations() {
        return annotations;
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
        sb.append("ObjectLineage(");
        sb.append("super=").append(super.toString());
        sb.append("level=").append(String.valueOf(this.level));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(", objects=").append(String.valueOf(this.objects));
        sb.append(", relationships=").append(String.valueOf(this.relationships));
        sb.append(", annotations=").append(String.valueOf(this.annotations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectLineage)) {
            return false;
        }

        ObjectLineage other = (ObjectLineage) o;
        return java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(this.direction, other.direction)
                && java.util.Objects.equals(this.objects, other.objects)
                && java.util.Objects.equals(this.relationships, other.relationships)
                && java.util.Objects.equals(this.annotations, other.annotations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result = (result * PRIME) + (this.objects == null ? 43 : this.objects.hashCode());
        result =
                (result * PRIME)
                        + (this.relationships == null ? 43 : this.relationships.hashCode());
        result = (result * PRIME) + (this.annotations == null ? 43 : this.annotations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
