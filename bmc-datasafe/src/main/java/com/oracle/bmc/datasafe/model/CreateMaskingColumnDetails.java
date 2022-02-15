/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMaskingColumnDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateMaskingColumnDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
        private String maskingColumnGroup;

        public Builder maskingColumnGroup(String maskingColumnGroup) {
            this.maskingColumnGroup = maskingColumnGroup;
            this.__explicitlySet__.add("maskingColumnGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMaskingEnabled")
        private Boolean isMaskingEnabled;

        public Builder isMaskingEnabled(Boolean isMaskingEnabled) {
            this.isMaskingEnabled = isMaskingEnabled;
            this.__explicitlySet__.add("isMaskingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
        private java.util.List<MaskingFormat> maskingFormats;

        public Builder maskingFormats(java.util.List<MaskingFormat> maskingFormats) {
            this.maskingFormats = maskingFormats;
            this.__explicitlySet__.add("maskingFormats");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMaskingColumnDetails build() {
            CreateMaskingColumnDetails __instance__ =
                    new CreateMaskingColumnDetails(
                            schemaName,
                            objectName,
                            objectType,
                            columnName,
                            maskingColumnGroup,
                            sensitiveTypeId,
                            isMaskingEnabled,
                            maskingFormats);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMaskingColumnDetails o) {
            Builder copiedBuilder =
                    schemaName(o.getSchemaName())
                            .objectName(o.getObjectName())
                            .objectType(o.getObjectType())
                            .columnName(o.getColumnName())
                            .maskingColumnGroup(o.getMaskingColumnGroup())
                            .sensitiveTypeId(o.getSensitiveTypeId())
                            .isMaskingEnabled(o.getIsMaskingEnabled())
                            .maskingFormats(o.getMaskingFormats());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the schema that contains the database column. This attribute cannot be updated for an existing masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    String schemaName;

    /**
     * The name of the object (table or editioning view) that contains the database column. This attribute cannot be updated for an existing masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * The type of the object that contains the database column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    ObjectType objectType;

    /**
     * The name of the database column. This attribute cannot be updated for an existing
     *  masking column. Note that the same name is used for the masking column. There
     *  is no separate displayName attribute for the masking column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    String columnName;

    /**
     * The group of the masking column. It's a masking group identifier and can be any string
     * of acceptable length. All the columns in a group are masked together to ensure that
     * the masked data across these columns continue to retain the same logical relationship.
     * For more details, check
     * <a href=https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037>Group Masking in the Data Safe documentation.</a>
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
    String maskingColumnGroup;

    /**
     * The OCID of the sensitive type to be associated with the masking column. Note that
     * if the maskingFormats attribute isn't provided while creating a masking column,
     * the default masking format associated with the specified sensitive type is assigned
     * to the masking column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    String sensitiveTypeId;

    /**
     * Indicates if data masking is enabled for the masking column. Set it to false if
     * you don't want to mask the column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMaskingEnabled")
    Boolean isMaskingEnabled;

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
    java.util.List<MaskingFormat> maskingFormats;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
