/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a masked column. A masked column is a database column masked by a data masking
 * request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MaskedColumnSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaskedColumnSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "parentColumnKey",
        "sensitiveTypeId",
        "schemaName",
        "objectName",
        "objectType",
        "columnName",
        "maskingColumnGroup",
        "maskingFormatUsed",
        "totalMaskedValues"
    })
    public MaskedColumnSummary(
            String key,
            String parentColumnKey,
            String sensitiveTypeId,
            String schemaName,
            String objectName,
            ObjectType objectType,
            String columnName,
            String maskingColumnGroup,
            String maskingFormatUsed,
            Long totalMaskedValues) {
        super();
        this.key = key;
        this.parentColumnKey = parentColumnKey;
        this.sensitiveTypeId = sensitiveTypeId;
        this.schemaName = schemaName;
        this.objectName = objectName;
        this.objectType = objectType;
        this.columnName = columnName;
        this.maskingColumnGroup = maskingColumnGroup;
        this.maskingFormatUsed = maskingFormatUsed;
        this.totalMaskedValues = totalMaskedValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key that identifies the masked column. It's numeric and unique within a
         * masking policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key that identifies the masked column. It's numeric and unique within a
         * masking policy.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The unique key that identifies the parent column of the masked column. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentColumnKey")
        private String parentColumnKey;

        /**
         * The unique key that identifies the parent column of the masked column.
         *
         * @param parentColumnKey the value to set
         * @return this builder
         */
        public Builder parentColumnKey(String parentColumnKey) {
            this.parentColumnKey = parentColumnKey;
            this.__explicitlySet__.add("parentColumnKey");
            return this;
        }
        /** The OCID of the sensitive type associated with the masked column. */
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        /**
         * The OCID of the sensitive type associated with the masked column.
         *
         * @param sensitiveTypeId the value to set
         * @return this builder
         */
        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }
        /** The name of the schema that contains the masked column. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The name of the schema that contains the masked column.
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /** The name of the object (table or editioning view) that contains the masked column. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the object (table or editioning view) that contains the masked column.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** The type of the object (table or editioning view) that contains the masked column. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        /**
         * The type of the object (table or editioning view) that contains the masked column.
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** The name of the masked column. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * The name of the masked column.
         *
         * @param columnName the value to set
         * @return this builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /** The masking group of the masked column. */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
        private String maskingColumnGroup;

        /**
         * The masking group of the masked column.
         *
         * @param maskingColumnGroup the value to set
         * @return this builder
         */
        public Builder maskingColumnGroup(String maskingColumnGroup) {
            this.maskingColumnGroup = maskingColumnGroup;
            this.__explicitlySet__.add("maskingColumnGroup");
            return this;
        }
        /** The masking format used for masking the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingFormatUsed")
        private String maskingFormatUsed;

        /**
         * The masking format used for masking the column.
         *
         * @param maskingFormatUsed the value to set
         * @return this builder
         */
        public Builder maskingFormatUsed(String maskingFormatUsed) {
            this.maskingFormatUsed = maskingFormatUsed;
            this.__explicitlySet__.add("maskingFormatUsed");
            return this;
        }
        /** The total number of values masked in the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedValues")
        private Long totalMaskedValues;

        /**
         * The total number of values masked in the column.
         *
         * @param totalMaskedValues the value to set
         * @return this builder
         */
        public Builder totalMaskedValues(Long totalMaskedValues) {
            this.totalMaskedValues = totalMaskedValues;
            this.__explicitlySet__.add("totalMaskedValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskedColumnSummary build() {
            MaskedColumnSummary model =
                    new MaskedColumnSummary(
                            this.key,
                            this.parentColumnKey,
                            this.sensitiveTypeId,
                            this.schemaName,
                            this.objectName,
                            this.objectType,
                            this.columnName,
                            this.maskingColumnGroup,
                            this.maskingFormatUsed,
                            this.totalMaskedValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskedColumnSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("parentColumnKey")) {
                this.parentColumnKey(model.getParentColumnKey());
            }
            if (model.wasPropertyExplicitlySet("sensitiveTypeId")) {
                this.sensitiveTypeId(model.getSensitiveTypeId());
            }
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
            if (model.wasPropertyExplicitlySet("maskingFormatUsed")) {
                this.maskingFormatUsed(model.getMaskingFormatUsed());
            }
            if (model.wasPropertyExplicitlySet("totalMaskedValues")) {
                this.totalMaskedValues(model.getTotalMaskedValues());
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
     * The unique key that identifies the masked column. It's numeric and unique within a masking
     * policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key that identifies the masked column. It's numeric and unique within a masking
     * policy.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The unique key that identifies the parent column of the masked column. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentColumnKey")
    private final String parentColumnKey;

    /**
     * The unique key that identifies the parent column of the masked column.
     *
     * @return the value
     */
    public String getParentColumnKey() {
        return parentColumnKey;
    }

    /** The OCID of the sensitive type associated with the masked column. */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    private final String sensitiveTypeId;

    /**
     * The OCID of the sensitive type associated with the masked column.
     *
     * @return the value
     */
    public String getSensitiveTypeId() {
        return sensitiveTypeId;
    }

    /** The name of the schema that contains the masked column. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The name of the schema that contains the masked column.
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** The name of the object (table or editioning view) that contains the masked column. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the object (table or editioning view) that contains the masked column.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** The type of the object (table or editioning view) that contains the masked column. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

    /**
     * The type of the object (table or editioning view) that contains the masked column.
     *
     * @return the value
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /** The name of the masked column. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * The name of the masked column.
     *
     * @return the value
     */
    public String getColumnName() {
        return columnName;
    }

    /** The masking group of the masked column. */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
    private final String maskingColumnGroup;

    /**
     * The masking group of the masked column.
     *
     * @return the value
     */
    public String getMaskingColumnGroup() {
        return maskingColumnGroup;
    }

    /** The masking format used for masking the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingFormatUsed")
    private final String maskingFormatUsed;

    /**
     * The masking format used for masking the column.
     *
     * @return the value
     */
    public String getMaskingFormatUsed() {
        return maskingFormatUsed;
    }

    /** The total number of values masked in the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedValues")
    private final Long totalMaskedValues;

    /**
     * The total number of values masked in the column.
     *
     * @return the value
     */
    public Long getTotalMaskedValues() {
        return totalMaskedValues;
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
        sb.append("MaskedColumnSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", parentColumnKey=").append(String.valueOf(this.parentColumnKey));
        sb.append(", sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", maskingColumnGroup=").append(String.valueOf(this.maskingColumnGroup));
        sb.append(", maskingFormatUsed=").append(String.valueOf(this.maskingFormatUsed));
        sb.append(", totalMaskedValues=").append(String.valueOf(this.totalMaskedValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaskedColumnSummary)) {
            return false;
        }

        MaskedColumnSummary other = (MaskedColumnSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.parentColumnKey, other.parentColumnKey)
                && java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.maskingColumnGroup, other.maskingColumnGroup)
                && java.util.Objects.equals(this.maskingFormatUsed, other.maskingFormatUsed)
                && java.util.Objects.equals(this.totalMaskedValues, other.totalMaskedValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.parentColumnKey == null ? 43 : this.parentColumnKey.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeId == null ? 43 : this.sensitiveTypeId.hashCode());
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
                        + (this.maskingFormatUsed == null ? 43 : this.maskingFormatUsed.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMaskedValues == null ? 43 : this.totalMaskedValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
