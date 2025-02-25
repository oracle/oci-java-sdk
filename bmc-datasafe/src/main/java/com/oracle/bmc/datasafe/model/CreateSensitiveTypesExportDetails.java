/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new sensitive types export. To specify some sensitive types for export, use
 * sensitiveTypeIdsForExport attribute. But if you want to include all sensitive types, you can set
 * isIncludeAllSensitiveTypes attributes to true. In the latter case, you do not need to list all
 * sensitive types.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSensitiveTypesExportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSensitiveTypesExportDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "compartmentId",
        "sensitiveTypeIdsForExport",
        "isIncludeAllSensitiveTypes",
        "freeformTags",
        "definedTags"
    })
    public CreateSensitiveTypesExportDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.List<String> sensitiveTypeIdsForExport,
            Boolean isIncludeAllSensitiveTypes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.sensitiveTypeIdsForExport = sensitiveTypeIdsForExport;
        this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name of the sensitive types export. The name does not have to be unique, and it's changeable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the sensitive types export. The name does not have to be unique, and it's changeable.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The description of the sensitive types export.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the sensitive types export.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The OCID of the compartment where the sensitive types export should be created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the sensitive types export should be created.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCIDs of the sensitive types used to create sensitive types export.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForExport")
        private java.util.List<String> sensitiveTypeIdsForExport;

        /**
         * The OCIDs of the sensitive types used to create sensitive types export.
         *
         * @param sensitiveTypeIdsForExport the value to set
         * @return this builder
         **/
        public Builder sensitiveTypeIdsForExport(java.util.List<String> sensitiveTypeIdsForExport) {
            this.sensitiveTypeIdsForExport = sensitiveTypeIdsForExport;
            this.__explicitlySet__.add("sensitiveTypeIdsForExport");
            return this;
        }
        /**
         * Indicates if all the existing user-defined sensitive types are used for export. If it's set to true, the
         * sensitiveTypeIdsForExport attribute is ignored and all user-defined sensitive types are used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
        private Boolean isIncludeAllSensitiveTypes;

        /**
         * Indicates if all the existing user-defined sensitive types are used for export. If it's set to true, the
         * sensitiveTypeIdsForExport attribute is ignored and all user-defined sensitive types are used.
         *
         * @param isIncludeAllSensitiveTypes the value to set
         * @return this builder
         **/
        public Builder isIncludeAllSensitiveTypes(Boolean isIncludeAllSensitiveTypes) {
            this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
            this.__explicitlySet__.add("isIncludeAllSensitiveTypes");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSensitiveTypesExportDetails build() {
            CreateSensitiveTypesExportDetails model =
                    new CreateSensitiveTypesExportDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.sensitiveTypeIdsForExport,
                            this.isIncludeAllSensitiveTypes,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSensitiveTypesExportDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sensitiveTypeIdsForExport")) {
                this.sensitiveTypeIdsForExport(model.getSensitiveTypeIdsForExport());
            }
            if (model.wasPropertyExplicitlySet("isIncludeAllSensitiveTypes")) {
                this.isIncludeAllSensitiveTypes(model.getIsIncludeAllSensitiveTypes());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The display name of the sensitive types export. The name does not have to be unique, and it's changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the sensitive types export. The name does not have to be unique, and it's changeable.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The description of the sensitive types export.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the sensitive types export.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The OCID of the compartment where the sensitive types export should be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the sensitive types export should be created.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCIDs of the sensitive types used to create sensitive types export.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForExport")
    private final java.util.List<String> sensitiveTypeIdsForExport;

    /**
     * The OCIDs of the sensitive types used to create sensitive types export.
     *
     * @return the value
     **/
    public java.util.List<String> getSensitiveTypeIdsForExport() {
        return sensitiveTypeIdsForExport;
    }

    /**
     * Indicates if all the existing user-defined sensitive types are used for export. If it's set to true, the
     * sensitiveTypeIdsForExport attribute is ignored and all user-defined sensitive types are used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
    private final Boolean isIncludeAllSensitiveTypes;

    /**
     * Indicates if all the existing user-defined sensitive types are used for export. If it's set to true, the
     * sensitiveTypeIdsForExport attribute is ignored and all user-defined sensitive types are used.
     *
     * @return the value
     **/
    public Boolean getIsIncludeAllSensitiveTypes() {
        return isIncludeAllSensitiveTypes;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateSensitiveTypesExportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sensitiveTypeIdsForExport=")
                .append(String.valueOf(this.sensitiveTypeIdsForExport));
        sb.append(", isIncludeAllSensitiveTypes=")
                .append(String.valueOf(this.isIncludeAllSensitiveTypes));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSensitiveTypesExportDetails)) {
            return false;
        }

        CreateSensitiveTypesExportDetails other = (CreateSensitiveTypesExportDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.sensitiveTypeIdsForExport, other.sensitiveTypeIdsForExport)
                && java.util.Objects.equals(
                        this.isIncludeAllSensitiveTypes, other.isIncludeAllSensitiveTypes)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeIdsForExport == null
                                ? 43
                                : this.sensitiveTypeIdsForExport.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludeAllSensitiveTypes == null
                                ? 43
                                : this.isIncludeAllSensitiveTypes.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
