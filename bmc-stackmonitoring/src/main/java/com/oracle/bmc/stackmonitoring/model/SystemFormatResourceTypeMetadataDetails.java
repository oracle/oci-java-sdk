/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The resource type metadata is defined in machine friendly format. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SystemFormatResourceTypeMetadataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "format")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SystemFormatResourceTypeMetadataDetails extends ResourceTypeMetadataDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of required properties for resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("requiredProperties")
        private java.util.List<String> requiredProperties;

        /**
         * List of required properties for resource type.
         *
         * @param requiredProperties the value to set
         * @return this builder
         */
        public Builder requiredProperties(java.util.List<String> requiredProperties) {
            this.requiredProperties = requiredProperties;
            this.__explicitlySet__.add("requiredProperties");
            return this;
        }
        /**
         * List of properties needed by the agent for monitoring the resource. Valid only if
         * resource type is OCI management agent based. When specified, these properties are passed
         * to the management agent during resource create or update.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("agentProperties")
        private java.util.List<String> agentProperties;

        /**
         * List of properties needed by the agent for monitoring the resource. Valid only if
         * resource type is OCI management agent based. When specified, these properties are passed
         * to the management agent during resource create or update.
         *
         * @param agentProperties the value to set
         * @return this builder
         */
        public Builder agentProperties(java.util.List<String> agentProperties) {
            this.agentProperties = agentProperties;
            this.__explicitlySet__.add("agentProperties");
            return this;
        }
        /**
         * List of valid properties for resource type while creating the monitored resource. If
         * resources of this type specifies any other properties during create operation, the
         * operation will fail.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("validPropertiesForCreate")
        private java.util.List<String> validPropertiesForCreate;

        /**
         * List of valid properties for resource type while creating the monitored resource. If
         * resources of this type specifies any other properties during create operation, the
         * operation will fail.
         *
         * @param validPropertiesForCreate the value to set
         * @return this builder
         */
        public Builder validPropertiesForCreate(java.util.List<String> validPropertiesForCreate) {
            this.validPropertiesForCreate = validPropertiesForCreate;
            this.__explicitlySet__.add("validPropertiesForCreate");
            return this;
        }
        /**
         * List of valid properties for resource type while updating the monitored resource. If
         * resources of this type specifies any other properties during update operation, the
         * operation will fail.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("validPropertiesForUpdate")
        private java.util.List<String> validPropertiesForUpdate;

        /**
         * List of valid properties for resource type while updating the monitored resource. If
         * resources of this type specifies any other properties during update operation, the
         * operation will fail.
         *
         * @param validPropertiesForUpdate the value to set
         * @return this builder
         */
        public Builder validPropertiesForUpdate(java.util.List<String> validPropertiesForUpdate) {
            this.validPropertiesForUpdate = validPropertiesForUpdate;
            this.__explicitlySet__.add("validPropertiesForUpdate");
            return this;
        }
        /**
         * List of property sets used to uniquely identify the resources. This check is made during
         * create or update of stack monitoring resource. The resource has to pass unique check for
         * each set in the list. For example, database can have user, password and SID as one unique
         * set. Another unique set would be user, password and service name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uniquePropertySets")
        private java.util.List<UniquePropertySet> uniquePropertySets;

        /**
         * List of property sets used to uniquely identify the resources. This check is made during
         * create or update of stack monitoring resource. The resource has to pass unique check for
         * each set in the list. For example, database can have user, password and SID as one unique
         * set. Another unique set would be user, password and service name.
         *
         * @param uniquePropertySets the value to set
         * @return this builder
         */
        public Builder uniquePropertySets(java.util.List<UniquePropertySet> uniquePropertySets) {
            this.uniquePropertySets = uniquePropertySets;
            this.__explicitlySet__.add("uniquePropertySets");
            return this;
        }
        /**
         * List of valid values for the properties. This is useful when resource type wants to
         * restrict only certain values for some properties. For instance for 'osType' property,
         * supported values can be restricted to be either Linux or Windows. Example: {@code {
         * "osType": ["Linux","Windows","Solaris"]}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("validPropertyValues")
        private java.util.Map<String, java.util.List<String>> validPropertyValues;

        /**
         * List of valid values for the properties. This is useful when resource type wants to
         * restrict only certain values for some properties. For instance for 'osType' property,
         * supported values can be restricted to be either Linux or Windows. Example: {@code {
         * "osType": ["Linux","Windows","Solaris"]}}
         *
         * @param validPropertyValues the value to set
         * @return this builder
         */
        public Builder validPropertyValues(
                java.util.Map<String, java.util.List<String>> validPropertyValues) {
            this.validPropertyValues = validPropertyValues;
            this.__explicitlySet__.add("validPropertyValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SystemFormatResourceTypeMetadataDetails build() {
            SystemFormatResourceTypeMetadataDetails model =
                    new SystemFormatResourceTypeMetadataDetails(
                            this.requiredProperties,
                            this.agentProperties,
                            this.validPropertiesForCreate,
                            this.validPropertiesForUpdate,
                            this.uniquePropertySets,
                            this.validPropertyValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SystemFormatResourceTypeMetadataDetails model) {
            if (model.wasPropertyExplicitlySet("requiredProperties")) {
                this.requiredProperties(model.getRequiredProperties());
            }
            if (model.wasPropertyExplicitlySet("agentProperties")) {
                this.agentProperties(model.getAgentProperties());
            }
            if (model.wasPropertyExplicitlySet("validPropertiesForCreate")) {
                this.validPropertiesForCreate(model.getValidPropertiesForCreate());
            }
            if (model.wasPropertyExplicitlySet("validPropertiesForUpdate")) {
                this.validPropertiesForUpdate(model.getValidPropertiesForUpdate());
            }
            if (model.wasPropertyExplicitlySet("uniquePropertySets")) {
                this.uniquePropertySets(model.getUniquePropertySets());
            }
            if (model.wasPropertyExplicitlySet("validPropertyValues")) {
                this.validPropertyValues(model.getValidPropertyValues());
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

    @Deprecated
    public SystemFormatResourceTypeMetadataDetails(
            java.util.List<String> requiredProperties,
            java.util.List<String> agentProperties,
            java.util.List<String> validPropertiesForCreate,
            java.util.List<String> validPropertiesForUpdate,
            java.util.List<UniquePropertySet> uniquePropertySets,
            java.util.Map<String, java.util.List<String>> validPropertyValues) {
        super();
        this.requiredProperties = requiredProperties;
        this.agentProperties = agentProperties;
        this.validPropertiesForCreate = validPropertiesForCreate;
        this.validPropertiesForUpdate = validPropertiesForUpdate;
        this.uniquePropertySets = uniquePropertySets;
        this.validPropertyValues = validPropertyValues;
    }

    /** List of required properties for resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("requiredProperties")
    private final java.util.List<String> requiredProperties;

    /**
     * List of required properties for resource type.
     *
     * @return the value
     */
    public java.util.List<String> getRequiredProperties() {
        return requiredProperties;
    }

    /**
     * List of properties needed by the agent for monitoring the resource. Valid only if resource
     * type is OCI management agent based. When specified, these properties are passed to the
     * management agent during resource create or update.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("agentProperties")
    private final java.util.List<String> agentProperties;

    /**
     * List of properties needed by the agent for monitoring the resource. Valid only if resource
     * type is OCI management agent based. When specified, these properties are passed to the
     * management agent during resource create or update.
     *
     * @return the value
     */
    public java.util.List<String> getAgentProperties() {
        return agentProperties;
    }

    /**
     * List of valid properties for resource type while creating the monitored resource. If
     * resources of this type specifies any other properties during create operation, the operation
     * will fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validPropertiesForCreate")
    private final java.util.List<String> validPropertiesForCreate;

    /**
     * List of valid properties for resource type while creating the monitored resource. If
     * resources of this type specifies any other properties during create operation, the operation
     * will fail.
     *
     * @return the value
     */
    public java.util.List<String> getValidPropertiesForCreate() {
        return validPropertiesForCreate;
    }

    /**
     * List of valid properties for resource type while updating the monitored resource. If
     * resources of this type specifies any other properties during update operation, the operation
     * will fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validPropertiesForUpdate")
    private final java.util.List<String> validPropertiesForUpdate;

    /**
     * List of valid properties for resource type while updating the monitored resource. If
     * resources of this type specifies any other properties during update operation, the operation
     * will fail.
     *
     * @return the value
     */
    public java.util.List<String> getValidPropertiesForUpdate() {
        return validPropertiesForUpdate;
    }

    /**
     * List of property sets used to uniquely identify the resources. This check is made during
     * create or update of stack monitoring resource. The resource has to pass unique check for each
     * set in the list. For example, database can have user, password and SID as one unique set.
     * Another unique set would be user, password and service name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uniquePropertySets")
    private final java.util.List<UniquePropertySet> uniquePropertySets;

    /**
     * List of property sets used to uniquely identify the resources. This check is made during
     * create or update of stack monitoring resource. The resource has to pass unique check for each
     * set in the list. For example, database can have user, password and SID as one unique set.
     * Another unique set would be user, password and service name.
     *
     * @return the value
     */
    public java.util.List<UniquePropertySet> getUniquePropertySets() {
        return uniquePropertySets;
    }

    /**
     * List of valid values for the properties. This is useful when resource type wants to restrict
     * only certain values for some properties. For instance for 'osType' property, supported values
     * can be restricted to be either Linux or Windows. Example: {@code { "osType":
     * ["Linux","Windows","Solaris"]}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validPropertyValues")
    private final java.util.Map<String, java.util.List<String>> validPropertyValues;

    /**
     * List of valid values for the properties. This is useful when resource type wants to restrict
     * only certain values for some properties. For instance for 'osType' property, supported values
     * can be restricted to be either Linux or Windows. Example: {@code { "osType":
     * ["Linux","Windows","Solaris"]}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.List<String>> getValidPropertyValues() {
        return validPropertyValues;
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
        sb.append("SystemFormatResourceTypeMetadataDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", requiredProperties=").append(String.valueOf(this.requiredProperties));
        sb.append(", agentProperties=").append(String.valueOf(this.agentProperties));
        sb.append(", validPropertiesForCreate=")
                .append(String.valueOf(this.validPropertiesForCreate));
        sb.append(", validPropertiesForUpdate=")
                .append(String.valueOf(this.validPropertiesForUpdate));
        sb.append(", uniquePropertySets=").append(String.valueOf(this.uniquePropertySets));
        sb.append(", validPropertyValues=").append(String.valueOf(this.validPropertyValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SystemFormatResourceTypeMetadataDetails)) {
            return false;
        }

        SystemFormatResourceTypeMetadataDetails other = (SystemFormatResourceTypeMetadataDetails) o;
        return java.util.Objects.equals(this.requiredProperties, other.requiredProperties)
                && java.util.Objects.equals(this.agentProperties, other.agentProperties)
                && java.util.Objects.equals(
                        this.validPropertiesForCreate, other.validPropertiesForCreate)
                && java.util.Objects.equals(
                        this.validPropertiesForUpdate, other.validPropertiesForUpdate)
                && java.util.Objects.equals(this.uniquePropertySets, other.uniquePropertySets)
                && java.util.Objects.equals(this.validPropertyValues, other.validPropertyValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.requiredProperties == null
                                ? 43
                                : this.requiredProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.agentProperties == null ? 43 : this.agentProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.validPropertiesForCreate == null
                                ? 43
                                : this.validPropertiesForCreate.hashCode());
        result =
                (result * PRIME)
                        + (this.validPropertiesForUpdate == null
                                ? 43
                                : this.validPropertiesForUpdate.hashCode());
        result =
                (result * PRIME)
                        + (this.uniquePropertySets == null
                                ? 43
                                : this.uniquePropertySets.hashCode());
        result =
                (result * PRIME)
                        + (this.validPropertyValues == null
                                ? 43
                                : this.validPropertyValues.hashCode());
        return result;
    }
}
