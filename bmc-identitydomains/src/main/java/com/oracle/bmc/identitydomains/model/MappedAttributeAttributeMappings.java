/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of attribute mappings between Oracle Identity Cloud Service Resource Type and Account
 * Object Class <br>
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
        builder = MappedAttributeAttributeMappings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MappedAttributeAttributeMappings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managedObjectAttributeName",
        "idcsAttributeName",
        "required",
        "appliesToActions",
        "samlFormat"
    })
    public MappedAttributeAttributeMappings(
            String managedObjectAttributeName,
            String idcsAttributeName,
            Boolean required,
            java.util.List<AppliesToActions> appliesToActions,
            String samlFormat) {
        super();
        this.managedObjectAttributeName = managedObjectAttributeName;
        this.idcsAttributeName = idcsAttributeName;
        this.required = required;
        this.appliesToActions = appliesToActions;
        this.samlFormat = samlFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name or expression of an attribute defined in the schema of the Managed Object Class.
         * This is the SCIM compliant Oracle Identity Cloud Service Name of the attribute that maps
         * to the \\"idcsName\\" attribute in the schema of an Managed Object Class.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedObjectAttributeName")
        private String managedObjectAttributeName;

        /**
         * The name or expression of an attribute defined in the schema of the Managed Object Class.
         * This is the SCIM compliant Oracle Identity Cloud Service Name of the attribute that maps
         * to the \\"idcsName\\" attribute in the schema of an Managed Object Class.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param managedObjectAttributeName the value to set
         * @return this builder
         */
        public Builder managedObjectAttributeName(String managedObjectAttributeName) {
            this.managedObjectAttributeName = managedObjectAttributeName;
            this.__explicitlySet__.add("managedObjectAttributeName");
            return this;
        }
        /**
         * The name or expression of an attribute that corresponds to the Oracle Identity Cloud
         * Service Resource referred in the \\"idcsResourceType\\" attribute.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeName")
        private String idcsAttributeName;

        /**
         * The name or expression of an attribute that corresponds to the Oracle Identity Cloud
         * Service Resource referred in the \\"idcsResourceType\\" attribute.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param idcsAttributeName the value to set
         * @return this builder
         */
        public Builder idcsAttributeName(String idcsAttributeName) {
            this.idcsAttributeName = idcsAttributeName;
            this.__explicitlySet__.add("idcsAttributeName");
            return this;
        }
        /**
         * If true, indicates that this attribute must have a value. This attribute maps to the
         * \\"required\\" sub-attribute in the schema of an Managed Object Class.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("required")
        private Boolean required;

        /**
         * If true, indicates that this attribute must have a value. This attribute maps to the
         * \\"required\\" sub-attribute in the schema of an Managed Object Class.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param required the value to set
         * @return this builder
         */
        public Builder required(Boolean required) {
            this.required = required;
            this.__explicitlySet__.add("required");
            return this;
        }
        /**
         * If specified, indicates a subset of mappedActions to which this attribute-mapping
         * applies.If not specified, this attribute-mapping applies to all mappedActions that use
         * mappedAttributes
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("appliesToActions")
        private java.util.List<AppliesToActions> appliesToActions;

        /**
         * If specified, indicates a subset of mappedActions to which this attribute-mapping
         * applies.If not specified, this attribute-mapping applies to all mappedActions that use
         * mappedAttributes
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param appliesToActions the value to set
         * @return this builder
         */
        public Builder appliesToActions(java.util.List<AppliesToActions> appliesToActions) {
            this.appliesToActions = appliesToActions;
            this.__explicitlySet__.add("appliesToActions");
            return this;
        }
        /**
         * Indicates the format of the assertion attribute. Also stores AttributeNamespace for
         * WSFed1.1.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("samlFormat")
        private String samlFormat;

        /**
         * Indicates the format of the assertion attribute. Also stores AttributeNamespace for
         * WSFed1.1.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param samlFormat the value to set
         * @return this builder
         */
        public Builder samlFormat(String samlFormat) {
            this.samlFormat = samlFormat;
            this.__explicitlySet__.add("samlFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MappedAttributeAttributeMappings build() {
            MappedAttributeAttributeMappings model =
                    new MappedAttributeAttributeMappings(
                            this.managedObjectAttributeName,
                            this.idcsAttributeName,
                            this.required,
                            this.appliesToActions,
                            this.samlFormat);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MappedAttributeAttributeMappings model) {
            if (model.wasPropertyExplicitlySet("managedObjectAttributeName")) {
                this.managedObjectAttributeName(model.getManagedObjectAttributeName());
            }
            if (model.wasPropertyExplicitlySet("idcsAttributeName")) {
                this.idcsAttributeName(model.getIdcsAttributeName());
            }
            if (model.wasPropertyExplicitlySet("required")) {
                this.required(model.getRequired());
            }
            if (model.wasPropertyExplicitlySet("appliesToActions")) {
                this.appliesToActions(model.getAppliesToActions());
            }
            if (model.wasPropertyExplicitlySet("samlFormat")) {
                this.samlFormat(model.getSamlFormat());
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
     * The name or expression of an attribute defined in the schema of the Managed Object Class.
     * This is the SCIM compliant Oracle Identity Cloud Service Name of the attribute that maps to
     * the \\"idcsName\\" attribute in the schema of an Managed Object Class.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedObjectAttributeName")
    private final String managedObjectAttributeName;

    /**
     * The name or expression of an attribute defined in the schema of the Managed Object Class.
     * This is the SCIM compliant Oracle Identity Cloud Service Name of the attribute that maps to
     * the \\"idcsName\\" attribute in the schema of an Managed Object Class.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getManagedObjectAttributeName() {
        return managedObjectAttributeName;
    }

    /**
     * The name or expression of an attribute that corresponds to the Oracle Identity Cloud Service
     * Resource referred in the \\"idcsResourceType\\" attribute.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeName")
    private final String idcsAttributeName;

    /**
     * The name or expression of an attribute that corresponds to the Oracle Identity Cloud Service
     * Resource referred in the \\"idcsResourceType\\" attribute.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsAttributeName() {
        return idcsAttributeName;
    }

    /**
     * If true, indicates that this attribute must have a value. This attribute maps to the
     * \\"required\\" sub-attribute in the schema of an Managed Object Class.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    private final Boolean required;

    /**
     * If true, indicates that this attribute must have a value. This attribute maps to the
     * \\"required\\" sub-attribute in the schema of an Managed Object Class.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getRequired() {
        return required;
    }

    /** */
    public enum AppliesToActions implements com.oracle.bmc.http.internal.BmcEnum {
        Create("create"),
        Update("update"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AppliesToActions.class);

        private final String value;
        private static java.util.Map<String, AppliesToActions> map;

        static {
            map = new java.util.HashMap<>();
            for (AppliesToActions v : AppliesToActions.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AppliesToActions(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AppliesToActions create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AppliesToActions', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * If specified, indicates a subset of mappedActions to which this attribute-mapping applies.If
     * not specified, this attribute-mapping applies to all mappedActions that use mappedAttributes
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appliesToActions")
    private final java.util.List<AppliesToActions> appliesToActions;

    /**
     * If specified, indicates a subset of mappedActions to which this attribute-mapping applies.If
     * not specified, this attribute-mapping applies to all mappedActions that use mappedAttributes
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppliesToActions> getAppliesToActions() {
        return appliesToActions;
    }

    /**
     * Indicates the format of the assertion attribute. Also stores AttributeNamespace for WSFed1.1.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("samlFormat")
    private final String samlFormat;

    /**
     * Indicates the format of the assertion attribute. Also stores AttributeNamespace for WSFed1.1.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getSamlFormat() {
        return samlFormat;
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
        sb.append("MappedAttributeAttributeMappings(");
        sb.append("super=").append(super.toString());
        sb.append("managedObjectAttributeName=")
                .append(String.valueOf(this.managedObjectAttributeName));
        sb.append(", idcsAttributeName=").append(String.valueOf(this.idcsAttributeName));
        sb.append(", required=").append(String.valueOf(this.required));
        sb.append(", appliesToActions=").append(String.valueOf(this.appliesToActions));
        sb.append(", samlFormat=").append(String.valueOf(this.samlFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MappedAttributeAttributeMappings)) {
            return false;
        }

        MappedAttributeAttributeMappings other = (MappedAttributeAttributeMappings) o;
        return java.util.Objects.equals(
                        this.managedObjectAttributeName, other.managedObjectAttributeName)
                && java.util.Objects.equals(this.idcsAttributeName, other.idcsAttributeName)
                && java.util.Objects.equals(this.required, other.required)
                && java.util.Objects.equals(this.appliesToActions, other.appliesToActions)
                && java.util.Objects.equals(this.samlFormat, other.samlFormat)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managedObjectAttributeName == null
                                ? 43
                                : this.managedObjectAttributeName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAttributeName == null ? 43 : this.idcsAttributeName.hashCode());
        result = (result * PRIME) + (this.required == null ? 43 : this.required.hashCode());
        result =
                (result * PRIME)
                        + (this.appliesToActions == null ? 43 : this.appliesToActions.hashCode());
        result = (result * PRIME) + (this.samlFormat == null ? 43 : this.samlFormat.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
