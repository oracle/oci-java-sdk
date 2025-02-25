/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The Member Reference details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MemberReference.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MemberReference extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "type", "compositeType"})
    public MemberReference(String id, MemberReferenceType type, String compositeType) {
        super();
        this.id = id;
        this.type = type;
        this.compositeType = compositeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resourceInstance/resourceType/resourceGroup
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resourceInstance/resourceType/resourceGroup
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Type of the member reference RESOURCE_INSTANCE, RESOURCE_TYPE, RESOURCE_GROUP
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private MemberReferenceType type;

        /**
         * Type of the member reference RESOURCE_INSTANCE, RESOURCE_TYPE, RESOURCE_GROUP
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(MemberReferenceType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The OCID of the composite resource type like EBS or Peoplesoft.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compositeType")
        private String compositeType;

        /**
         * The OCID of the composite resource type like EBS or Peoplesoft.
         * @param compositeType the value to set
         * @return this builder
         **/
        public Builder compositeType(String compositeType) {
            this.compositeType = compositeType;
            this.__explicitlySet__.add("compositeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MemberReference build() {
            MemberReference model = new MemberReference(this.id, this.type, this.compositeType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MemberReference model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("compositeType")) {
                this.compositeType(model.getCompositeType());
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
     * The OCID of the resourceInstance/resourceType/resourceGroup
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resourceInstance/resourceType/resourceGroup
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Type of the member reference RESOURCE_INSTANCE, RESOURCE_TYPE, RESOURCE_GROUP
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final MemberReferenceType type;

    /**
     * Type of the member reference RESOURCE_INSTANCE, RESOURCE_TYPE, RESOURCE_GROUP
     * @return the value
     **/
    public MemberReferenceType getType() {
        return type;
    }

    /**
     * The OCID of the composite resource type like EBS or Peoplesoft.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compositeType")
    private final String compositeType;

    /**
     * The OCID of the composite resource type like EBS or Peoplesoft.
     * @return the value
     **/
    public String getCompositeType() {
        return compositeType;
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
        sb.append("MemberReference(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", compositeType=").append(String.valueOf(this.compositeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemberReference)) {
            return false;
        }

        MemberReference other = (MemberReference) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.compositeType, other.compositeType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.compositeType == null ? 43 : this.compositeType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
