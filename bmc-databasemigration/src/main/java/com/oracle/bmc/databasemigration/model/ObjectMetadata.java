/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Metadata of object.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ObjectMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectMetadata extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemaOwnerColumn",
        "objectNameColumn",
        "objectTypeFixed",
        "objectTypeColumn"
    })
    public ObjectMetadata(
            String schemaOwnerColumn,
            String objectNameColumn,
            String objectTypeFixed,
            String objectTypeColumn) {
        super();
        this.schemaOwnerColumn = schemaOwnerColumn;
        this.objectNameColumn = objectNameColumn;
        this.objectTypeFixed = objectTypeFixed;
        this.objectTypeColumn = objectTypeColumn;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The field that stores the owner of the object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemaOwnerColumn")
        private String schemaOwnerColumn;

        /**
         * The field that stores the owner of the object.
         *
         * @param schemaOwnerColumn the value to set
         * @return this builder
         **/
        public Builder schemaOwnerColumn(String schemaOwnerColumn) {
            this.schemaOwnerColumn = schemaOwnerColumn;
            this.__explicitlySet__.add("schemaOwnerColumn");
            return this;
        }
        /**
         * The field that stores the name of the object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectNameColumn")
        private String objectNameColumn;

        /**
         * The field that stores the name of the object.
         *
         * @param objectNameColumn the value to set
         * @return this builder
         **/
        public Builder objectNameColumn(String objectNameColumn) {
            this.objectNameColumn = objectNameColumn;
            this.__explicitlySet__.add("objectNameColumn");
            return this;
        }
        /**
         * The field that stores the fixed type of the object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectTypeFixed")
        private String objectTypeFixed;

        /**
         * The field that stores the fixed type of the object.
         *
         * @param objectTypeFixed the value to set
         * @return this builder
         **/
        public Builder objectTypeFixed(String objectTypeFixed) {
            this.objectTypeFixed = objectTypeFixed;
            this.__explicitlySet__.add("objectTypeFixed");
            return this;
        }
        /**
         * The field that stores the type of the object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectTypeColumn")
        private String objectTypeColumn;

        /**
         * The field that stores the type of the object.
         *
         * @param objectTypeColumn the value to set
         * @return this builder
         **/
        public Builder objectTypeColumn(String objectTypeColumn) {
            this.objectTypeColumn = objectTypeColumn;
            this.__explicitlySet__.add("objectTypeColumn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectMetadata build() {
            ObjectMetadata model =
                    new ObjectMetadata(
                            this.schemaOwnerColumn,
                            this.objectNameColumn,
                            this.objectTypeFixed,
                            this.objectTypeColumn);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectMetadata model) {
            if (model.wasPropertyExplicitlySet("schemaOwnerColumn")) {
                this.schemaOwnerColumn(model.getSchemaOwnerColumn());
            }
            if (model.wasPropertyExplicitlySet("objectNameColumn")) {
                this.objectNameColumn(model.getObjectNameColumn());
            }
            if (model.wasPropertyExplicitlySet("objectTypeFixed")) {
                this.objectTypeFixed(model.getObjectTypeFixed());
            }
            if (model.wasPropertyExplicitlySet("objectTypeColumn")) {
                this.objectTypeColumn(model.getObjectTypeColumn());
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
     * The field that stores the owner of the object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaOwnerColumn")
    private final String schemaOwnerColumn;

    /**
     * The field that stores the owner of the object.
     *
     * @return the value
     **/
    public String getSchemaOwnerColumn() {
        return schemaOwnerColumn;
    }

    /**
     * The field that stores the name of the object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectNameColumn")
    private final String objectNameColumn;

    /**
     * The field that stores the name of the object.
     *
     * @return the value
     **/
    public String getObjectNameColumn() {
        return objectNameColumn;
    }

    /**
     * The field that stores the fixed type of the object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectTypeFixed")
    private final String objectTypeFixed;

    /**
     * The field that stores the fixed type of the object.
     *
     * @return the value
     **/
    public String getObjectTypeFixed() {
        return objectTypeFixed;
    }

    /**
     * The field that stores the type of the object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectTypeColumn")
    private final String objectTypeColumn;

    /**
     * The field that stores the type of the object.
     *
     * @return the value
     **/
    public String getObjectTypeColumn() {
        return objectTypeColumn;
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
        sb.append("ObjectMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("schemaOwnerColumn=").append(String.valueOf(this.schemaOwnerColumn));
        sb.append(", objectNameColumn=").append(String.valueOf(this.objectNameColumn));
        sb.append(", objectTypeFixed=").append(String.valueOf(this.objectTypeFixed));
        sb.append(", objectTypeColumn=").append(String.valueOf(this.objectTypeColumn));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectMetadata)) {
            return false;
        }

        ObjectMetadata other = (ObjectMetadata) o;
        return java.util.Objects.equals(this.schemaOwnerColumn, other.schemaOwnerColumn)
                && java.util.Objects.equals(this.objectNameColumn, other.objectNameColumn)
                && java.util.Objects.equals(this.objectTypeFixed, other.objectTypeFixed)
                && java.util.Objects.equals(this.objectTypeColumn, other.objectTypeColumn)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.schemaOwnerColumn == null ? 43 : this.schemaOwnerColumn.hashCode());
        result =
                (result * PRIME)
                        + (this.objectNameColumn == null ? 43 : this.objectNameColumn.hashCode());
        result =
                (result * PRIME)
                        + (this.objectTypeFixed == null ? 43 : this.objectTypeFixed.hashCode());
        result =
                (result * PRIME)
                        + (this.objectTypeColumn == null ? 43 : this.objectTypeColumn.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
