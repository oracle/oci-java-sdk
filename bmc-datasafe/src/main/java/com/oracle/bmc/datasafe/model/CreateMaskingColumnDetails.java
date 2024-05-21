/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new masking column. You can use this to add a parent column only.
 * It automatically adds the child columns from the associated sensitive data model or
 * target database. If you provide the sensitiveTypeId attribute but not the maskingFormats
 * attribute, it automatically assigns the default masking format associated with the
 * specified sensitive type. Alternatively, if you provide the maskingFormats attribute,
 * the specified masking formats are assigned to the column.
 * <p>
 * Using the maskingFormats attribute, you can assign one or more masking formats to a
 * column. You can specify a condition as part of each masking format. It enables you
 * to do <a href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional masking</a>
 * so that you can mask the column data values differently using different masking formats
 * and the associated conditions. A masking format can have one or more format entries.
 * The combined output of all the format entries is used for masking. It provides the
 * flexibility to define a masking format that can generate different parts of a data
 * value separately and then combine them to get the final data value for masking.
 * <p>
 * You can use the maskingColumnGroup attribute to group the columns that you would like
 * to mask together. It enables you to do
 * <a href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037">group or compound masking</a>
 * that ensures that the masked data across the columns in a group continue to retain
 * the same logical relationship.
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
    builder = CreateMaskingColumnDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateMaskingColumnDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemaName",
        "objectName",
        "objectType",
        "columnName",
        "maskingColumnGroup",
        "sensitiveTypeId",
        "isMaskingEnabled",
        "maskingFormats"
    })
    public CreateMaskingColumnDetails(
            String schemaName,
            String objectName,
            ObjectType objectType,
            String columnName,
            String maskingColumnGroup,
            String sensitiveTypeId,
            Boolean isMaskingEnabled,
            java.util.List<MaskingFormat> maskingFormats) {
        super();
        this.schemaName = schemaName;
        this.objectName = objectName;
        this.objectType = objectType;
        this.columnName = columnName;
        this.maskingColumnGroup = maskingColumnGroup;
        this.sensitiveTypeId = sensitiveTypeId;
        this.isMaskingEnabled = isMaskingEnabled;
        this.maskingFormats = maskingFormats;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the schema that contains the database column. This attribute cannot be updated for an existing masking column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The name of the schema that contains the database column. This attribute cannot be updated for an existing masking column.
         * @param schemaName the value to set
         * @return this builder
         **/
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /**
         * The name of the object (table or editioning view) that contains the database column. This attribute cannot be updated for an existing masking column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the object (table or editioning view) that contains the database column. This attribute cannot be updated for an existing masking column.
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * The type of the object that contains the database column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        /**
         * The type of the object that contains the database column.
         * @param objectType the value to set
         * @return this builder
         **/
        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /**
         * The name of the database column. This attribute cannot be updated for an existing
         *  masking column. Note that the same name is used for the masking column. There
         *  is no separate displayName attribute for the masking column.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * The name of the database column. This attribute cannot be updated for an existing
         *  masking column. Note that the same name is used for the masking column. There
         *  is no separate displayName attribute for the masking column.
         *
         * @param columnName the value to set
         * @return this builder
         **/
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /**
         * The group of the masking column. It's a masking group identifier and can be any string
         * of acceptable length. All the columns in a group are masked together to ensure that
         * the masked data across these columns continue to retain the same logical relationship.
         * For more details, check
         * <a href=https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037>Group Masking in the Data Safe documentation.</a>
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
        private String maskingColumnGroup;

        /**
         * The group of the masking column. It's a masking group identifier and can be any string
         * of acceptable length. All the columns in a group are masked together to ensure that
         * the masked data across these columns continue to retain the same logical relationship.
         * For more details, check
         * <a href=https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037>Group Masking in the Data Safe documentation.</a>
         *
         * @param maskingColumnGroup the value to set
         * @return this builder
         **/
        public Builder maskingColumnGroup(String maskingColumnGroup) {
            this.maskingColumnGroup = maskingColumnGroup;
            this.__explicitlySet__.add("maskingColumnGroup");
            return this;
        }
        /**
         * The OCID of the sensitive type to be associated with the masking column. Note that
         * if the maskingFormats attribute isn't provided while creating a masking column,
         * the default masking format associated with the specified sensitive type is assigned
         * to the masking column.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        /**
         * The OCID of the sensitive type to be associated with the masking column. Note that
         * if the maskingFormats attribute isn't provided while creating a masking column,
         * the default masking format associated with the specified sensitive type is assigned
         * to the masking column.
         *
         * @param sensitiveTypeId the value to set
         * @return this builder
         **/
        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }
        /**
         * Indicates whether data masking is enabled for the masking column. Set it to false if
         * you don't want to mask the column.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMaskingEnabled")
        private Boolean isMaskingEnabled;

        /**
         * Indicates whether data masking is enabled for the masking column. Set it to false if
         * you don't want to mask the column.
         *
         * @param isMaskingEnabled the value to set
         * @return this builder
         **/
        public Builder isMaskingEnabled(Boolean isMaskingEnabled) {
            this.isMaskingEnabled = isMaskingEnabled;
            this.__explicitlySet__.add("isMaskingEnabled");
            return this;
        }
        /**
         * The masking formats to be assigned to the masking column. You can specify a condition
         * as part of each masking format. It enables you to do
         * <a href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional masking</a>
         * so that you can mask the column data values differently using different masking
         * formats and the associated conditions. A masking format can have one or more format
         * entries. The combined output of all the format entries is used for masking. It
         * provides the flexibility to define a masking format that can generate different parts
         * of a data value separately and then combine them to get the final data value for masking.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
        private java.util.List<MaskingFormat> maskingFormats;

        /**
         * The masking formats to be assigned to the masking column. You can specify a condition
         * as part of each masking format. It enables you to do
         * <a href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional masking</a>
         * so that you can mask the column data values differently using different masking
         * formats and the associated conditions. A masking format can have one or more format
         * entries. The combined output of all the format entries is used for masking. It
         * provides the flexibility to define a masking format that can generate different parts
         * of a data value separately and then combine them to get the final data value for masking.
         *
         * @param maskingFormats the value to set
         * @return this builder
         **/
        public Builder maskingFormats(java.util.List<MaskingFormat> maskingFormats) {
            this.maskingFormats = maskingFormats;
            this.__explicitlySet__.add("maskingFormats");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMaskingColumnDetails build() {
            CreateMaskingColumnDetails model =
                    new CreateMaskingColumnDetails(
                            this.schemaName,
                            this.objectName,
                            this.objectType,
                            this.columnName,
                            this.maskingColumnGroup,
                            this.sensitiveTypeId,
                            this.isMaskingEnabled,
                            this.maskingFormats);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMaskingColumnDetails model) {
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("columnName")) {
                this.columnName(model.getColumnName());
            }
            if (model.wasPropertyExplicitlySet("maskingColumnGroup")) {
                this.maskingColumnGroup(model.getMaskingColumnGroup());
            }
            if (model.wasPropertyExplicitlySet("sensitiveTypeId")) {
                this.sensitiveTypeId(model.getSensitiveTypeId());
            }
            if (model.wasPropertyExplicitlySet("isMaskingEnabled")) {
                this.isMaskingEnabled(model.getIsMaskingEnabled());
            }
            if (model.wasPropertyExplicitlySet("maskingFormats")) {
                this.maskingFormats(model.getMaskingFormats());
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
     * The name of the schema that contains the database column. This attribute cannot be updated for an existing masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The name of the schema that contains the database column. This attribute cannot be updated for an existing masking column.
     * @return the value
     **/
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * The name of the object (table or editioning view) that contains the database column. This attribute cannot be updated for an existing masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the object (table or editioning view) that contains the database column. This attribute cannot be updated for an existing masking column.
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
    }

    /**
     * The type of the object that contains the database column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

    /**
     * The type of the object that contains the database column.
     * @return the value
     **/
    public ObjectType getObjectType() {
        return objectType;
    }

    /**
     * The name of the database column. This attribute cannot be updated for an existing
     *  masking column. Note that the same name is used for the masking column. There
     *  is no separate displayName attribute for the masking column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * The name of the database column. This attribute cannot be updated for an existing
     *  masking column. Note that the same name is used for the masking column. There
     *  is no separate displayName attribute for the masking column.
     *
     * @return the value
     **/
    public String getColumnName() {
        return columnName;
    }

    /**
     * The group of the masking column. It's a masking group identifier and can be any string
     * of acceptable length. All the columns in a group are masked together to ensure that
     * the masked data across these columns continue to retain the same logical relationship.
     * For more details, check
     * <a href=https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037>Group Masking in the Data Safe documentation.</a>
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
    private final String maskingColumnGroup;

    /**
     * The group of the masking column. It's a masking group identifier and can be any string
     * of acceptable length. All the columns in a group are masked together to ensure that
     * the masked data across these columns continue to retain the same logical relationship.
     * For more details, check
     * <a href=https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037>Group Masking in the Data Safe documentation.</a>
     *
     * @return the value
     **/
    public String getMaskingColumnGroup() {
        return maskingColumnGroup;
    }

    /**
     * The OCID of the sensitive type to be associated with the masking column. Note that
     * if the maskingFormats attribute isn't provided while creating a masking column,
     * the default masking format associated with the specified sensitive type is assigned
     * to the masking column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    private final String sensitiveTypeId;

    /**
     * The OCID of the sensitive type to be associated with the masking column. Note that
     * if the maskingFormats attribute isn't provided while creating a masking column,
     * the default masking format associated with the specified sensitive type is assigned
     * to the masking column.
     *
     * @return the value
     **/
    public String getSensitiveTypeId() {
        return sensitiveTypeId;
    }

    /**
     * Indicates whether data masking is enabled for the masking column. Set it to false if
     * you don't want to mask the column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMaskingEnabled")
    private final Boolean isMaskingEnabled;

    /**
     * Indicates whether data masking is enabled for the masking column. Set it to false if
     * you don't want to mask the column.
     *
     * @return the value
     **/
    public Boolean getIsMaskingEnabled() {
        return isMaskingEnabled;
    }

    /**
     * The masking formats to be assigned to the masking column. You can specify a condition
     * as part of each masking format. It enables you to do
     * <a href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional masking</a>
     * so that you can mask the column data values differently using different masking
     * formats and the associated conditions. A masking format can have one or more format
     * entries. The combined output of all the format entries is used for masking. It
     * provides the flexibility to define a masking format that can generate different parts
     * of a data value separately and then combine them to get the final data value for masking.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
    private final java.util.List<MaskingFormat> maskingFormats;

    /**
     * The masking formats to be assigned to the masking column. You can specify a condition
     * as part of each masking format. It enables you to do
     * <a href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional masking</a>
     * so that you can mask the column data values differently using different masking
     * formats and the associated conditions. A masking format can have one or more format
     * entries. The combined output of all the format entries is used for masking. It
     * provides the flexibility to define a masking format that can generate different parts
     * of a data value separately and then combine them to get the final data value for masking.
     *
     * @return the value
     **/
    public java.util.List<MaskingFormat> getMaskingFormats() {
        return maskingFormats;
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
        sb.append("CreateMaskingColumnDetails(");
        sb.append("super=").append(super.toString());
        sb.append("schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", maskingColumnGroup=").append(String.valueOf(this.maskingColumnGroup));
        sb.append(", sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(", isMaskingEnabled=").append(String.valueOf(this.isMaskingEnabled));
        sb.append(", maskingFormats=").append(String.valueOf(this.maskingFormats));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMaskingColumnDetails)) {
            return false;
        }

        CreateMaskingColumnDetails other = (CreateMaskingColumnDetails) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.maskingColumnGroup, other.maskingColumnGroup)
                && java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.isMaskingEnabled, other.isMaskingEnabled)
                && java.util.Objects.equals(this.maskingFormats, other.maskingFormats)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingColumnGroup == null
                                ? 43
                                : this.maskingColumnGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeId == null ? 43 : this.sensitiveTypeId.hashCode());
        result =
                (result * PRIME)
                        + (this.isMaskingEnabled == null ? 43 : this.isMaskingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingFormats == null ? 43 : this.maskingFormats.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
