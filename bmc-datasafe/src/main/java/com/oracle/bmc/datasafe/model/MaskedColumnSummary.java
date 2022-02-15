/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a masked column. A masked column is a database column masked by a data masking request.
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
    builder = MaskedColumnSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MaskedColumnSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentColumnKey")
        private String parentColumnKey;

        public Builder parentColumnKey(String parentColumnKey) {
            this.parentColumnKey = parentColumnKey;
            this.__explicitlySet__.add("parentColumnKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("maskingFormatUsed")
        private String maskingFormatUsed;

        public Builder maskingFormatUsed(String maskingFormatUsed) {
            this.maskingFormatUsed = maskingFormatUsed;
            this.__explicitlySet__.add("maskingFormatUsed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedValues")
        private Long totalMaskedValues;

        public Builder totalMaskedValues(Long totalMaskedValues) {
            this.totalMaskedValues = totalMaskedValues;
            this.__explicitlySet__.add("totalMaskedValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskedColumnSummary build() {
            MaskedColumnSummary __instance__ =
                    new MaskedColumnSummary(
                            key,
                            parentColumnKey,
                            sensitiveTypeId,
                            schemaName,
                            objectName,
                            objectType,
                            columnName,
                            maskingColumnGroup,
                            maskingFormatUsed,
                            totalMaskedValues);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskedColumnSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .parentColumnKey(o.getParentColumnKey())
                            .sensitiveTypeId(o.getSensitiveTypeId())
                            .schemaName(o.getSchemaName())
                            .objectName(o.getObjectName())
                            .objectType(o.getObjectType())
                            .columnName(o.getColumnName())
                            .maskingColumnGroup(o.getMaskingColumnGroup())
                            .maskingFormatUsed(o.getMaskingFormatUsed())
                            .totalMaskedValues(o.getTotalMaskedValues());

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
     * The unique key that identifies the masked column. It's numeric and unique within a masking policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The unique key that identifies the parent column of the masked column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentColumnKey")
    String parentColumnKey;

    /**
     * The OCID of the sensitive type associated with the masked column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    String sensitiveTypeId;

    /**
     * The name of the schema that contains the masked column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    String schemaName;

    /**
     * The name of the object (table or editioning view) that contains the masked column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * The type of the object (table or editioning view) that contains the masked column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    ObjectType objectType;

    /**
     * The name of the masked column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    String columnName;

    /**
     * The masking group of the masked column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
    String maskingColumnGroup;

    /**
     * The masking format used for masking the column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingFormatUsed")
    String maskingFormatUsed;

    /**
     * The total number of values masked in the column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedValues")
    Long totalMaskedValues;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
