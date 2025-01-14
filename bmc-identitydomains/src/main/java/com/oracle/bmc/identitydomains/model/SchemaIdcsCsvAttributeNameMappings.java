/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Csv meta data for those resource type attributes which can be imported / exported from / to csv.
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
        builder = SchemaIdcsCsvAttributeNameMappings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SchemaIdcsCsvAttributeNameMappings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "columnHeaderName",
        "deprecatedColumnHeaderName",
        "mapsTo",
        "defaultValue",
        "multiValueDelimiter",
        "csvColumnForResolvingResourceType",
        "resolveValueUsingResourceType",
        "referencedResourceTypeUniqueAttributeNameMappings"
    })
    public SchemaIdcsCsvAttributeNameMappings(
            String columnHeaderName,
            String deprecatedColumnHeaderName,
            String mapsTo,
            String defaultValue,
            String multiValueDelimiter,
            String csvColumnForResolvingResourceType,
            java.util.List<SchemaResolveValueUsingResourceType> resolveValueUsingResourceType,
            java.util.List<SchemaReferencedResourceTypeUniqueAttributeNameMappings>
                    referencedResourceTypeUniqueAttributeNameMappings) {
        super();
        this.columnHeaderName = columnHeaderName;
        this.deprecatedColumnHeaderName = deprecatedColumnHeaderName;
        this.mapsTo = mapsTo;
        this.defaultValue = defaultValue;
        this.multiValueDelimiter = multiValueDelimiter;
        this.csvColumnForResolvingResourceType = csvColumnForResolvingResourceType;
        this.resolveValueUsingResourceType = resolveValueUsingResourceType;
        this.referencedResourceTypeUniqueAttributeNameMappings =
                referencedResourceTypeUniqueAttributeNameMappings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The CSV column header name that maps to this attribute.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("columnHeaderName")
        private String columnHeaderName;

        /**
         * The CSV column header name that maps to this attribute.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param columnHeaderName the value to set
         * @return this builder
         */
        public Builder columnHeaderName(String columnHeaderName) {
            this.columnHeaderName = columnHeaderName;
            this.__explicitlySet__.add("columnHeaderName");
            return this;
        }
        /**
         * The deprecated CSV column header name that maps to this attribute.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deprecatedColumnHeaderName")
        private String deprecatedColumnHeaderName;

        /**
         * The deprecated CSV column header name that maps to this attribute.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param deprecatedColumnHeaderName the value to set
         * @return this builder
         */
        public Builder deprecatedColumnHeaderName(String deprecatedColumnHeaderName) {
            this.deprecatedColumnHeaderName = deprecatedColumnHeaderName;
            this.__explicitlySet__.add("deprecatedColumnHeaderName");
            return this;
        }
        /**
         * The attribute path that the CSV column header name maps to for complex multi-valued
         * attributes.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mapsTo")
        private String mapsTo;

        /**
         * The attribute path that the CSV column header name maps to for complex multi-valued
         * attributes.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param mapsTo the value to set
         * @return this builder
         */
        public Builder mapsTo(String mapsTo) {
            this.mapsTo = mapsTo;
            this.__explicitlySet__.add("mapsTo");
            return this;
        }
        /**
         * The default value to be used during import processing in case the CSV column header is
         * not present or value is not given in the import CSV.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The default value to be used during import processing in case the CSV column header is
         * not present or value is not given in the import CSV.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /**
         * If values of the CSV column header name can contain multiple values, this attribute
         * specifies the delimiter to be used. For example, Group's \\"User Members\\" CSV column
         * header is multi-valued and it's delimiter is a semi-colon (\\";\\").
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("multiValueDelimiter")
        private String multiValueDelimiter;

        /**
         * If values of the CSV column header name can contain multiple values, this attribute
         * specifies the delimiter to be used. For example, Group's \\"User Members\\" CSV column
         * header is multi-valued and it's delimiter is a semi-colon (\\";\\").
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param multiValueDelimiter the value to set
         * @return this builder
         */
        public Builder multiValueDelimiter(String multiValueDelimiter) {
            this.multiValueDelimiter = multiValueDelimiter;
            this.__explicitlySet__.add("multiValueDelimiter");
            return this;
        }
        /**
         * This specifies the Csv Header for resolving Resource Type for this Column Header
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("csvColumnForResolvingResourceType")
        private String csvColumnForResolvingResourceType;

        /**
         * This specifies the Csv Header for resolving Resource Type for this Column Header
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param csvColumnForResolvingResourceType the value to set
         * @return this builder
         */
        public Builder csvColumnForResolvingResourceType(String csvColumnForResolvingResourceType) {
            this.csvColumnForResolvingResourceType = csvColumnForResolvingResourceType;
            this.__explicitlySet__.add("csvColumnForResolvingResourceType");
            return this;
        }
        /**
         * This attribute gives a maps for resolving Resource Type after reading it's value from
         * \\"csvColumnForResolvingResourceType\\" attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
         * required: false - returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resolveValueUsingResourceType")
        private java.util.List<SchemaResolveValueUsingResourceType> resolveValueUsingResourceType;

        /**
         * This attribute gives a maps for resolving Resource Type after reading it's value from
         * \\"csvColumnForResolvingResourceType\\" attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
         * required: false - returned: default - type: complex - uniqueness: none
         *
         * @param resolveValueUsingResourceType the value to set
         * @return this builder
         */
        public Builder resolveValueUsingResourceType(
                java.util.List<SchemaResolveValueUsingResourceType> resolveValueUsingResourceType) {
            this.resolveValueUsingResourceType = resolveValueUsingResourceType;
            this.__explicitlySet__.add("resolveValueUsingResourceType");
            return this;
        }
        /**
         * This attribute specifies the mapping of \\"uniqueAttributeNameForDisplay\\" attributes(s)
         * of the referenced resource with the columnHeaderName(s). This attribute should be given
         * in the idcsCsvAttributeNameMappings when uniqueAttributeNameForDisplay contains more than
         * one attribute.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
         * required: false - returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "referencedResourceTypeUniqueAttributeNameMappings")
        private java.util.List<SchemaReferencedResourceTypeUniqueAttributeNameMappings>
                referencedResourceTypeUniqueAttributeNameMappings;

        /**
         * This attribute specifies the mapping of \\"uniqueAttributeNameForDisplay\\" attributes(s)
         * of the referenced resource with the columnHeaderName(s). This attribute should be given
         * in the idcsCsvAttributeNameMappings when uniqueAttributeNameForDisplay contains more than
         * one attribute.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
         * required: false - returned: default - type: complex - uniqueness: none
         *
         * @param referencedResourceTypeUniqueAttributeNameMappings the value to set
         * @return this builder
         */
        public Builder referencedResourceTypeUniqueAttributeNameMappings(
                java.util.List<SchemaReferencedResourceTypeUniqueAttributeNameMappings>
                        referencedResourceTypeUniqueAttributeNameMappings) {
            this.referencedResourceTypeUniqueAttributeNameMappings =
                    referencedResourceTypeUniqueAttributeNameMappings;
            this.__explicitlySet__.add("referencedResourceTypeUniqueAttributeNameMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaIdcsCsvAttributeNameMappings build() {
            SchemaIdcsCsvAttributeNameMappings model =
                    new SchemaIdcsCsvAttributeNameMappings(
                            this.columnHeaderName,
                            this.deprecatedColumnHeaderName,
                            this.mapsTo,
                            this.defaultValue,
                            this.multiValueDelimiter,
                            this.csvColumnForResolvingResourceType,
                            this.resolveValueUsingResourceType,
                            this.referencedResourceTypeUniqueAttributeNameMappings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaIdcsCsvAttributeNameMappings model) {
            if (model.wasPropertyExplicitlySet("columnHeaderName")) {
                this.columnHeaderName(model.getColumnHeaderName());
            }
            if (model.wasPropertyExplicitlySet("deprecatedColumnHeaderName")) {
                this.deprecatedColumnHeaderName(model.getDeprecatedColumnHeaderName());
            }
            if (model.wasPropertyExplicitlySet("mapsTo")) {
                this.mapsTo(model.getMapsTo());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("multiValueDelimiter")) {
                this.multiValueDelimiter(model.getMultiValueDelimiter());
            }
            if (model.wasPropertyExplicitlySet("csvColumnForResolvingResourceType")) {
                this.csvColumnForResolvingResourceType(
                        model.getCsvColumnForResolvingResourceType());
            }
            if (model.wasPropertyExplicitlySet("resolveValueUsingResourceType")) {
                this.resolveValueUsingResourceType(model.getResolveValueUsingResourceType());
            }
            if (model.wasPropertyExplicitlySet(
                    "referencedResourceTypeUniqueAttributeNameMappings")) {
                this.referencedResourceTypeUniqueAttributeNameMappings(
                        model.getReferencedResourceTypeUniqueAttributeNameMappings());
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
     * The CSV column header name that maps to this attribute.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("columnHeaderName")
    private final String columnHeaderName;

    /**
     * The CSV column header name that maps to this attribute.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getColumnHeaderName() {
        return columnHeaderName;
    }

    /**
     * The deprecated CSV column header name that maps to this attribute.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deprecatedColumnHeaderName")
    private final String deprecatedColumnHeaderName;

    /**
     * The deprecated CSV column header name that maps to this attribute.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDeprecatedColumnHeaderName() {
        return deprecatedColumnHeaderName;
    }

    /**
     * The attribute path that the CSV column header name maps to for complex multi-valued
     * attributes.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mapsTo")
    private final String mapsTo;

    /**
     * The attribute path that the CSV column header name maps to for complex multi-valued
     * attributes.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMapsTo() {
        return mapsTo;
    }

    /**
     * The default value to be used during import processing in case the CSV column header is not
     * present or value is not given in the import CSV.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The default value to be used during import processing in case the CSV column header is not
     * present or value is not given in the import CSV.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * If values of the CSV column header name can contain multiple values, this attribute specifies
     * the delimiter to be used. For example, Group's \\"User Members\\" CSV column header is
     * multi-valued and it's delimiter is a semi-colon (\\";\\").
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multiValueDelimiter")
    private final String multiValueDelimiter;

    /**
     * If values of the CSV column header name can contain multiple values, this attribute specifies
     * the delimiter to be used. For example, Group's \\"User Members\\" CSV column header is
     * multi-valued and it's delimiter is a semi-colon (\\";\\").
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMultiValueDelimiter() {
        return multiValueDelimiter;
    }

    /**
     * This specifies the Csv Header for resolving Resource Type for this Column Header
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("csvColumnForResolvingResourceType")
    private final String csvColumnForResolvingResourceType;

    /**
     * This specifies the Csv Header for resolving Resource Type for this Column Header
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCsvColumnForResolvingResourceType() {
        return csvColumnForResolvingResourceType;
    }

    /**
     * This attribute gives a maps for resolving Resource Type after reading it's value from
     * \\"csvColumnForResolvingResourceType\\" attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
     * required: false - returned: default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resolveValueUsingResourceType")
    private final java.util.List<SchemaResolveValueUsingResourceType> resolveValueUsingResourceType;

    /**
     * This attribute gives a maps for resolving Resource Type after reading it's value from
     * \\"csvColumnForResolvingResourceType\\" attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
     * required: false - returned: default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<SchemaResolveValueUsingResourceType> getResolveValueUsingResourceType() {
        return resolveValueUsingResourceType;
    }

    /**
     * This attribute specifies the mapping of \\"uniqueAttributeNameForDisplay\\" attributes(s) of
     * the referenced resource with the columnHeaderName(s). This attribute should be given in the
     * idcsCsvAttributeNameMappings when uniqueAttributeNameForDisplay contains more than one
     * attribute.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
     * required: false - returned: default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty(
            "referencedResourceTypeUniqueAttributeNameMappings")
    private final java.util.List<SchemaReferencedResourceTypeUniqueAttributeNameMappings>
            referencedResourceTypeUniqueAttributeNameMappings;

    /**
     * This attribute specifies the mapping of \\"uniqueAttributeNameForDisplay\\" attributes(s) of
     * the referenced resource with the columnHeaderName(s). This attribute should be given in the
     * idcsCsvAttributeNameMappings when uniqueAttributeNameForDisplay contains more than one
     * attribute.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
     * required: false - returned: default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<SchemaReferencedResourceTypeUniqueAttributeNameMappings>
            getReferencedResourceTypeUniqueAttributeNameMappings() {
        return referencedResourceTypeUniqueAttributeNameMappings;
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
        sb.append("SchemaIdcsCsvAttributeNameMappings(");
        sb.append("super=").append(super.toString());
        sb.append("columnHeaderName=").append(String.valueOf(this.columnHeaderName));
        sb.append(", deprecatedColumnHeaderName=")
                .append(String.valueOf(this.deprecatedColumnHeaderName));
        sb.append(", mapsTo=").append(String.valueOf(this.mapsTo));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", multiValueDelimiter=").append(String.valueOf(this.multiValueDelimiter));
        sb.append(", csvColumnForResolvingResourceType=")
                .append(String.valueOf(this.csvColumnForResolvingResourceType));
        sb.append(", resolveValueUsingResourceType=")
                .append(String.valueOf(this.resolveValueUsingResourceType));
        sb.append(", referencedResourceTypeUniqueAttributeNameMappings=")
                .append(String.valueOf(this.referencedResourceTypeUniqueAttributeNameMappings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaIdcsCsvAttributeNameMappings)) {
            return false;
        }

        SchemaIdcsCsvAttributeNameMappings other = (SchemaIdcsCsvAttributeNameMappings) o;
        return java.util.Objects.equals(this.columnHeaderName, other.columnHeaderName)
                && java.util.Objects.equals(
                        this.deprecatedColumnHeaderName, other.deprecatedColumnHeaderName)
                && java.util.Objects.equals(this.mapsTo, other.mapsTo)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.multiValueDelimiter, other.multiValueDelimiter)
                && java.util.Objects.equals(
                        this.csvColumnForResolvingResourceType,
                        other.csvColumnForResolvingResourceType)
                && java.util.Objects.equals(
                        this.resolveValueUsingResourceType, other.resolveValueUsingResourceType)
                && java.util.Objects.equals(
                        this.referencedResourceTypeUniqueAttributeNameMappings,
                        other.referencedResourceTypeUniqueAttributeNameMappings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.columnHeaderName == null ? 43 : this.columnHeaderName.hashCode());
        result =
                (result * PRIME)
                        + (this.deprecatedColumnHeaderName == null
                                ? 43
                                : this.deprecatedColumnHeaderName.hashCode());
        result = (result * PRIME) + (this.mapsTo == null ? 43 : this.mapsTo.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result =
                (result * PRIME)
                        + (this.multiValueDelimiter == null
                                ? 43
                                : this.multiValueDelimiter.hashCode());
        result =
                (result * PRIME)
                        + (this.csvColumnForResolvingResourceType == null
                                ? 43
                                : this.csvColumnForResolvingResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.resolveValueUsingResourceType == null
                                ? 43
                                : this.resolveValueUsingResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedResourceTypeUniqueAttributeNameMappings == null
                                ? 43
                                : this.referencedResourceTypeUniqueAttributeNameMappings
                                        .hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
