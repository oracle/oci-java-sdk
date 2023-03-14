/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Schema for Database Service  Resource
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExtensionDbcsGroup.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtensionDbcsGroup extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceLevelSchemaNames",
        "domainLevelSchemaNames",
        "domainLevelSchema",
        "instanceLevelSchema"
    })
    public ExtensionDbcsGroup(
            java.util.List<GroupExtInstanceLevelSchemaNames> instanceLevelSchemaNames,
            java.util.List<GroupExtDomainLevelSchemaNames> domainLevelSchemaNames,
            String domainLevelSchema,
            String instanceLevelSchema) {
        super();
        this.instanceLevelSchemaNames = instanceLevelSchemaNames;
        this.domainLevelSchemaNames = domainLevelSchemaNames;
        this.domainLevelSchema = domainLevelSchema;
        this.instanceLevelSchema = instanceLevelSchema;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * DBCS instance-level schema-names. Each schema-name is specific to a DB Instance.
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [dbInstanceId, schemaName]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceLevelSchemaNames")
        private java.util.List<GroupExtInstanceLevelSchemaNames> instanceLevelSchemaNames;

        /**
         * DBCS instance-level schema-names. Each schema-name is specific to a DB Instance.
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [dbInstanceId, schemaName]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: complex
         * @param instanceLevelSchemaNames the value to set
         * @return this builder
         **/
        public Builder instanceLevelSchemaNames(
                java.util.List<GroupExtInstanceLevelSchemaNames> instanceLevelSchemaNames) {
            this.instanceLevelSchemaNames = instanceLevelSchemaNames;
            this.__explicitlySet__.add("instanceLevelSchemaNames");
            return this;
        }
        /**
         * DBCS Domain-level schema-names. Each value is specific to a DB Domain.
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [domainName, schemaName]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainLevelSchemaNames")
        private java.util.List<GroupExtDomainLevelSchemaNames> domainLevelSchemaNames;

        /**
         * DBCS Domain-level schema-names. Each value is specific to a DB Domain.
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [domainName, schemaName]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: complex
         * @param domainLevelSchemaNames the value to set
         * @return this builder
         **/
        public Builder domainLevelSchemaNames(
                java.util.List<GroupExtDomainLevelSchemaNames> domainLevelSchemaNames) {
            this.domainLevelSchemaNames = domainLevelSchemaNames;
            this.__explicitlySet__.add("domainLevelSchemaNames");
            return this;
        }
        /**
         * DBCS Domain-level schema-name.  This attribute refers implicitly to a value of 'domainLevelSchemaNames' for a particular DB Domain.
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsSensitive: none
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainLevelSchema")
        private String domainLevelSchema;

        /**
         * DBCS Domain-level schema-name.  This attribute refers implicitly to a value of 'domainLevelSchemaNames' for a particular DB Domain.
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsSensitive: none
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param domainLevelSchema the value to set
         * @return this builder
         **/
        public Builder domainLevelSchema(String domainLevelSchema) {
            this.domainLevelSchema = domainLevelSchema;
            this.__explicitlySet__.add("domainLevelSchema");
            return this;
        }
        /**
         * DBCS instance-level schema-name. This attribute refers implicitly to a value of 'instanceLevelSchemaNames' for a particular DB Instance.
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsSensitive: none
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceLevelSchema")
        private String instanceLevelSchema;

        /**
         * DBCS instance-level schema-name. This attribute refers implicitly to a value of 'instanceLevelSchemaNames' for a particular DB Instance.
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsSensitive: none
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param instanceLevelSchema the value to set
         * @return this builder
         **/
        public Builder instanceLevelSchema(String instanceLevelSchema) {
            this.instanceLevelSchema = instanceLevelSchema;
            this.__explicitlySet__.add("instanceLevelSchema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionDbcsGroup build() {
            ExtensionDbcsGroup model =
                    new ExtensionDbcsGroup(
                            this.instanceLevelSchemaNames,
                            this.domainLevelSchemaNames,
                            this.domainLevelSchema,
                            this.instanceLevelSchema);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionDbcsGroup model) {
            if (model.wasPropertyExplicitlySet("instanceLevelSchemaNames")) {
                this.instanceLevelSchemaNames(model.getInstanceLevelSchemaNames());
            }
            if (model.wasPropertyExplicitlySet("domainLevelSchemaNames")) {
                this.domainLevelSchemaNames(model.getDomainLevelSchemaNames());
            }
            if (model.wasPropertyExplicitlySet("domainLevelSchema")) {
                this.domainLevelSchema(model.getDomainLevelSchema());
            }
            if (model.wasPropertyExplicitlySet("instanceLevelSchema")) {
                this.instanceLevelSchema(model.getInstanceLevelSchema());
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
     * DBCS instance-level schema-names. Each schema-name is specific to a DB Instance.
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [dbInstanceId, schemaName]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceLevelSchemaNames")
    private final java.util.List<GroupExtInstanceLevelSchemaNames> instanceLevelSchemaNames;

    /**
     * DBCS instance-level schema-names. Each schema-name is specific to a DB Instance.
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [dbInstanceId, schemaName]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: complex
     * @return the value
     **/
    public java.util.List<GroupExtInstanceLevelSchemaNames> getInstanceLevelSchemaNames() {
        return instanceLevelSchemaNames;
    }

    /**
     * DBCS Domain-level schema-names. Each value is specific to a DB Domain.
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [domainName, schemaName]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainLevelSchemaNames")
    private final java.util.List<GroupExtDomainLevelSchemaNames> domainLevelSchemaNames;

    /**
     * DBCS Domain-level schema-names. Each value is specific to a DB Domain.
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [domainName, schemaName]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: complex
     * @return the value
     **/
    public java.util.List<GroupExtDomainLevelSchemaNames> getDomainLevelSchemaNames() {
        return domainLevelSchemaNames;
    }

    /**
     * DBCS Domain-level schema-name.  This attribute refers implicitly to a value of 'domainLevelSchemaNames' for a particular DB Domain.
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsSensitive: none
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainLevelSchema")
    private final String domainLevelSchema;

    /**
     * DBCS Domain-level schema-name.  This attribute refers implicitly to a value of 'domainLevelSchemaNames' for a particular DB Domain.
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsSensitive: none
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDomainLevelSchema() {
        return domainLevelSchema;
    }

    /**
     * DBCS instance-level schema-name. This attribute refers implicitly to a value of 'instanceLevelSchemaNames' for a particular DB Instance.
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsSensitive: none
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceLevelSchema")
    private final String instanceLevelSchema;

    /**
     * DBCS instance-level schema-name. This attribute refers implicitly to a value of 'instanceLevelSchemaNames' for a particular DB Instance.
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsSensitive: none
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getInstanceLevelSchema() {
        return instanceLevelSchema;
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
        sb.append("ExtensionDbcsGroup(");
        sb.append("super=").append(super.toString());
        sb.append("instanceLevelSchemaNames=")
                .append(String.valueOf(this.instanceLevelSchemaNames));
        sb.append(", domainLevelSchemaNames=").append(String.valueOf(this.domainLevelSchemaNames));
        sb.append(", domainLevelSchema=").append(String.valueOf(this.domainLevelSchema));
        sb.append(", instanceLevelSchema=").append(String.valueOf(this.instanceLevelSchema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionDbcsGroup)) {
            return false;
        }

        ExtensionDbcsGroup other = (ExtensionDbcsGroup) o;
        return java.util.Objects.equals(
                        this.instanceLevelSchemaNames, other.instanceLevelSchemaNames)
                && java.util.Objects.equals(
                        this.domainLevelSchemaNames, other.domainLevelSchemaNames)
                && java.util.Objects.equals(this.domainLevelSchema, other.domainLevelSchema)
                && java.util.Objects.equals(this.instanceLevelSchema, other.instanceLevelSchema)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.instanceLevelSchemaNames == null
                                ? 43
                                : this.instanceLevelSchemaNames.hashCode());
        result =
                (result * PRIME)
                        + (this.domainLevelSchemaNames == null
                                ? 43
                                : this.domainLevelSchemaNames.hashCode());
        result =
                (result * PRIME)
                        + (this.domainLevelSchema == null ? 43 : this.domainLevelSchema.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceLevelSchema == null
                                ? 43
                                : this.instanceLevelSchema.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
