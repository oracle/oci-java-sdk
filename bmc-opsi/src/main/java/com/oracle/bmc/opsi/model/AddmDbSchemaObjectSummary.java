/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Details for a given object id
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
    builder = AddmDbSchemaObjectSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddmDbSchemaObjectSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "objectIdentifier",
        "owner",
        "objectName",
        "subObjectName",
        "objectType"
    })
    public AddmDbSchemaObjectSummary(
            String id,
            Integer objectIdentifier,
            String owner,
            String objectName,
            String subObjectName,
            String objectType) {
        super();
        this.id = id;
        this.objectIdentifier = objectIdentifier;
        this.owner = owner;
        this.objectName = objectName;
        this.subObjectName = subObjectName;
        this.objectType = objectType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Object id (from RDBMS)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectIdentifier")
        private Integer objectIdentifier;

        /**
         * Object id (from RDBMS)
         * @param objectIdentifier the value to set
         * @return this builder
         **/
        public Builder objectIdentifier(Integer objectIdentifier) {
            this.objectIdentifier = objectIdentifier;
            this.__explicitlySet__.add("objectIdentifier");
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

        public AddmDbSchemaObjectSummary build() {
            AddmDbSchemaObjectSummary model =
                    new AddmDbSchemaObjectSummary(
                            this.id,
                            this.objectIdentifier,
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
        public Builder copy(AddmDbSchemaObjectSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("objectIdentifier")) {
                this.objectIdentifier(model.getObjectIdentifier());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Object id (from RDBMS)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectIdentifier")
    private final Integer objectIdentifier;

    /**
     * Object id (from RDBMS)
     * @return the value
     **/
    public Integer getObjectIdentifier() {
        return objectIdentifier;
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
        sb.append("AddmDbSchemaObjectSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", objectIdentifier=").append(String.valueOf(this.objectIdentifier));
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
        if (!(o instanceof AddmDbSchemaObjectSummary)) {
            return false;
        }

        AddmDbSchemaObjectSummary other = (AddmDbSchemaObjectSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.objectIdentifier, other.objectIdentifier)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.subObjectName, other.subObjectName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.objectIdentifier == null ? 43 : this.objectIdentifier.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result =
                (result * PRIME)
                        + (this.subObjectName == null ? 43 : this.subObjectName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
