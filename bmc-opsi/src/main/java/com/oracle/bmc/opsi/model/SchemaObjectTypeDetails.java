/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Schema object details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SchemaObjectTypeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SchemaObjectTypeDetails extends RelatedObjectTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Object id (from RDBMS)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectId")
        private Integer objectId;

        /**
         * Object id (from RDBMS)
         * @param objectId the value to set
         * @return this builder
         **/
        public Builder objectId(Integer objectId) {
            this.objectId = objectId;
            this.__explicitlySet__.add("objectId");
            return this;
        }
        /**
         * Owner of object
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * Owner of object
         * @param owner the value to set
         * @return this builder
         **/
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /**
         * Name of object
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * Name of object
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * Subobject name; for example, partition name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subObjectName")
        private String subObjectName;

        /**
         * Subobject name; for example, partition name
         * @param subObjectName the value to set
         * @return this builder
         **/
        public Builder subObjectName(String subObjectName) {
            this.subObjectName = subObjectName;
            this.__explicitlySet__.add("subObjectName");
            return this;
        }
        /**
         * Type of the object (such as TABLE, INDEX)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        /**
         * Type of the object (such as TABLE, INDEX)
         * @param objectType the value to set
         * @return this builder
         **/
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaObjectTypeDetails build() {
            SchemaObjectTypeDetails model =
                    new SchemaObjectTypeDetails(
                            this.objectId,
                            this.owner,
                            this.objectName,
                            this.subObjectName,
                            this.objectType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaObjectTypeDetails model) {
            if (model.wasPropertyExplicitlySet("objectId")) {
                this.objectId(model.getObjectId());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("subObjectName")) {
                this.subObjectName(model.getSubObjectName());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
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

    @Deprecated
    public SchemaObjectTypeDetails(
            Integer objectId,
            String owner,
            String objectName,
            String subObjectName,
            String objectType) {
        super();
        this.objectId = objectId;
        this.owner = owner;
        this.objectName = objectName;
        this.subObjectName = subObjectName;
        this.objectType = objectType;
    }

    /**
     * Object id (from RDBMS)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectId")
    private final Integer objectId;

    /**
     * Object id (from RDBMS)
     * @return the value
     **/
    public Integer getObjectId() {
        return objectId;
    }

    /**
     * Owner of object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * Owner of object
     * @return the value
     **/
    public String getOwner() {
        return owner;
    }

    /**
     * Name of object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * Name of object
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
    }

    /**
     * Subobject name; for example, partition name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subObjectName")
    private final String subObjectName;

    /**
     * Subobject name; for example, partition name
     * @return the value
     **/
    public String getSubObjectName() {
        return subObjectName;
    }

    /**
     * Type of the object (such as TABLE, INDEX)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final String objectType;

    /**
     * Type of the object (such as TABLE, INDEX)
     * @return the value
     **/
    public String getObjectType() {
        return objectType;
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
        sb.append("SchemaObjectTypeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", objectId=").append(String.valueOf(this.objectId));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", subObjectName=").append(String.valueOf(this.subObjectName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaObjectTypeDetails)) {
            return false;
        }

        SchemaObjectTypeDetails other = (SchemaObjectTypeDetails) o;
        return java.util.Objects.equals(this.objectId, other.objectId)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.subObjectName, other.subObjectName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.objectId == null ? 43 : this.objectId.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result =
                (result * PRIME)
                        + (this.subObjectName == null ? 43 : this.subObjectName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        return result;
    }
}
