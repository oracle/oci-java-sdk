/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Declares how two elements of object lineage are related.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LineageRelationship.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LineageRelationship extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fromObjectKey", "toObjectKey", "relationshipType"})
    public LineageRelationship(String fromObjectKey, String toObjectKey, String relationshipType) {
        super();
        this.fromObjectKey = fromObjectKey;
        this.toObjectKey = toObjectKey;
        this.relationshipType = relationshipType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Object key of source lineage element.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fromObjectKey")
        private String fromObjectKey;

        /**
         * Object key of source lineage element.
         * @param fromObjectKey the value to set
         * @return this builder
         **/
        public Builder fromObjectKey(String fromObjectKey) {
            this.fromObjectKey = fromObjectKey;
            this.__explicitlySet__.add("fromObjectKey");
            return this;
        }
        /**
         * Object key of target lineage element.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("toObjectKey")
        private String toObjectKey;

        /**
         * Object key of target lineage element.
         * @param toObjectKey the value to set
         * @return this builder
         **/
        public Builder toObjectKey(String toObjectKey) {
            this.toObjectKey = toObjectKey;
            this.__explicitlySet__.add("toObjectKey");
            return this;
        }
        /**
         * Type of the relationship.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relationshipType")
        private String relationshipType;

        /**
         * Type of the relationship.
         * @param relationshipType the value to set
         * @return this builder
         **/
        public Builder relationshipType(String relationshipType) {
            this.relationshipType = relationshipType;
            this.__explicitlySet__.add("relationshipType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LineageRelationship build() {
            LineageRelationship model =
                    new LineageRelationship(
                            this.fromObjectKey, this.toObjectKey, this.relationshipType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageRelationship model) {
            if (model.wasPropertyExplicitlySet("fromObjectKey")) {
                this.fromObjectKey(model.getFromObjectKey());
            }
            if (model.wasPropertyExplicitlySet("toObjectKey")) {
                this.toObjectKey(model.getToObjectKey());
            }
            if (model.wasPropertyExplicitlySet("relationshipType")) {
                this.relationshipType(model.getRelationshipType());
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
     * Object key of source lineage element.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fromObjectKey")
    private final String fromObjectKey;

    /**
     * Object key of source lineage element.
     * @return the value
     **/
    public String getFromObjectKey() {
        return fromObjectKey;
    }

    /**
     * Object key of target lineage element.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toObjectKey")
    private final String toObjectKey;

    /**
     * Object key of target lineage element.
     * @return the value
     **/
    public String getToObjectKey() {
        return toObjectKey;
    }

    /**
     * Type of the relationship.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relationshipType")
    private final String relationshipType;

    /**
     * Type of the relationship.
     * @return the value
     **/
    public String getRelationshipType() {
        return relationshipType;
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
        sb.append("LineageRelationship(");
        sb.append("super=").append(super.toString());
        sb.append("fromObjectKey=").append(String.valueOf(this.fromObjectKey));
        sb.append(", toObjectKey=").append(String.valueOf(this.toObjectKey));
        sb.append(", relationshipType=").append(String.valueOf(this.relationshipType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageRelationship)) {
            return false;
        }

        LineageRelationship other = (LineageRelationship) o;
        return java.util.Objects.equals(this.fromObjectKey, other.fromObjectKey)
                && java.util.Objects.equals(this.toObjectKey, other.toObjectKey)
                && java.util.Objects.equals(this.relationshipType, other.relationshipType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.fromObjectKey == null ? 43 : this.fromObjectKey.hashCode());
        result = (result * PRIME) + (this.toObjectKey == null ? 43 : this.toObjectKey.hashCode());
        result =
                (result * PRIME)
                        + (this.relationshipType == null ? 43 : this.relationshipType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
