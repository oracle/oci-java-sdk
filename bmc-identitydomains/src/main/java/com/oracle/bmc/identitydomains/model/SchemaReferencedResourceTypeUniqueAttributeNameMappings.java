/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This attribute specifies the mapping of "uniqueAttributeNameForDisplay" attributes(s) of the
 * referenced resource with the columnHeaderName(s). This attribute should be given in the
 * idcsCsvAttributeNameMappings when uniqueAttributeNameForDisplay contains more than one attribute.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SchemaReferencedResourceTypeUniqueAttributeNameMappings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SchemaReferencedResourceTypeUniqueAttributeNameMappings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceTypeAttributeName", "mapsFromColumnName"})
    public SchemaReferencedResourceTypeUniqueAttributeNameMappings(
            String resourceTypeAttributeName, String mapsFromColumnName) {
        super();
        this.resourceTypeAttributeName = resourceTypeAttributeName;
        this.mapsFromColumnName = mapsFromColumnName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies the name of the attribute given in \\"uniqueAttributeNameForDisplay\\" in the
         * Resource type definition.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeAttributeName")
        private String resourceTypeAttributeName;

        /**
         * Specifies the name of the attribute given in \\"uniqueAttributeNameForDisplay\\" in the
         * Resource type definition.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param resourceTypeAttributeName the value to set
         * @return this builder
         */
        public Builder resourceTypeAttributeName(String resourceTypeAttributeName) {
            this.resourceTypeAttributeName = resourceTypeAttributeName;
            this.__explicitlySet__.add("resourceTypeAttributeName");
            return this;
        }
        /**
         * Specifies the CSV column header name that maps to the corresponding
         * \\"uniqueAttributeNameForDisplay\\" attribute of the resource.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mapsFromColumnName")
        private String mapsFromColumnName;

        /**
         * Specifies the CSV column header name that maps to the corresponding
         * \\"uniqueAttributeNameForDisplay\\" attribute of the resource.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param mapsFromColumnName the value to set
         * @return this builder
         */
        public Builder mapsFromColumnName(String mapsFromColumnName) {
            this.mapsFromColumnName = mapsFromColumnName;
            this.__explicitlySet__.add("mapsFromColumnName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaReferencedResourceTypeUniqueAttributeNameMappings build() {
            SchemaReferencedResourceTypeUniqueAttributeNameMappings model =
                    new SchemaReferencedResourceTypeUniqueAttributeNameMappings(
                            this.resourceTypeAttributeName, this.mapsFromColumnName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaReferencedResourceTypeUniqueAttributeNameMappings model) {
            if (model.wasPropertyExplicitlySet("resourceTypeAttributeName")) {
                this.resourceTypeAttributeName(model.getResourceTypeAttributeName());
            }
            if (model.wasPropertyExplicitlySet("mapsFromColumnName")) {
                this.mapsFromColumnName(model.getMapsFromColumnName());
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

    /**
     * Specifies the name of the attribute given in \\"uniqueAttributeNameForDisplay\\" in the
     * Resource type definition.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeAttributeName")
    private final String resourceTypeAttributeName;

    /**
     * Specifies the name of the attribute given in \\"uniqueAttributeNameForDisplay\\" in the
     * Resource type definition.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getResourceTypeAttributeName() {
        return resourceTypeAttributeName;
    }

    /**
     * Specifies the CSV column header name that maps to the corresponding
     * \\"uniqueAttributeNameForDisplay\\" attribute of the resource.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mapsFromColumnName")
    private final String mapsFromColumnName;

    /**
     * Specifies the CSV column header name that maps to the corresponding
     * \\"uniqueAttributeNameForDisplay\\" attribute of the resource.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMapsFromColumnName() {
        return mapsFromColumnName;
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
        sb.append("SchemaReferencedResourceTypeUniqueAttributeNameMappings(");
        sb.append("super=").append(super.toString());
        sb.append("resourceTypeAttributeName=")
                .append(String.valueOf(this.resourceTypeAttributeName));
        sb.append(", mapsFromColumnName=").append(String.valueOf(this.mapsFromColumnName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaReferencedResourceTypeUniqueAttributeNameMappings)) {
            return false;
        }

        SchemaReferencedResourceTypeUniqueAttributeNameMappings other =
                (SchemaReferencedResourceTypeUniqueAttributeNameMappings) o;
        return java.util.Objects.equals(
                        this.resourceTypeAttributeName, other.resourceTypeAttributeName)
                && java.util.Objects.equals(this.mapsFromColumnName, other.mapsFromColumnName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceTypeAttributeName == null
                                ? 43
                                : this.resourceTypeAttributeName.hashCode());
        result =
                (result * PRIME)
                        + (this.mapsFromColumnName == null
                                ? 43
                                : this.mapsFromColumnName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
