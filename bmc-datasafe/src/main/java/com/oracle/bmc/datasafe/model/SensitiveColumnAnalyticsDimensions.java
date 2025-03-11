/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The dimensions available for sensitive column analytics. <br>
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
        builder = SensitiveColumnAnalyticsDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SensitiveColumnAnalyticsDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetId",
        "schemaName",
        "objectName",
        "columnName",
        "sensitiveTypeId",
        "sensitiveDataModelId"
    })
    public SensitiveColumnAnalyticsDimensions(
            String targetId,
            String schemaName,
            String objectName,
            String columnName,
            String sensitiveTypeId,
            String sensitiveDataModelId) {
        super();
        this.targetId = targetId;
        this.schemaName = schemaName;
        this.objectName = objectName;
        this.columnName = columnName;
        this.sensitiveTypeId = sensitiveTypeId;
        this.sensitiveDataModelId = sensitiveDataModelId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the target database associated with the sensitive column. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database associated with the sensitive column.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The database schema that contains the sensitive column. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The database schema that contains the sensitive column.
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /** The database object that contains the sensitive column. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The database object that contains the sensitive column.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** The name of the sensitive column. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * The name of the sensitive column.
         *
         * @param columnName the value to set
         * @return this builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /** The OCID of the sensitive type associated with the sensitive column. */
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        /**
         * The OCID of the sensitive type associated with the sensitive column.
         *
         * @param sensitiveTypeId the value to set
         * @return this builder
         */
        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }
        /** The OCID of the sensitive data model which contains the sensitive column. */
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
        private String sensitiveDataModelId;

        /**
         * The OCID of the sensitive data model which contains the sensitive column.
         *
         * @param sensitiveDataModelId the value to set
         * @return this builder
         */
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            this.__explicitlySet__.add("sensitiveDataModelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SensitiveColumnAnalyticsDimensions build() {
            SensitiveColumnAnalyticsDimensions model =
                    new SensitiveColumnAnalyticsDimensions(
                            this.targetId,
                            this.schemaName,
                            this.objectName,
                            this.columnName,
                            this.sensitiveTypeId,
                            this.sensitiveDataModelId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SensitiveColumnAnalyticsDimensions model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("columnName")) {
                this.columnName(model.getColumnName());
            }
            if (model.wasPropertyExplicitlySet("sensitiveTypeId")) {
                this.sensitiveTypeId(model.getSensitiveTypeId());
            }
            if (model.wasPropertyExplicitlySet("sensitiveDataModelId")) {
                this.sensitiveDataModelId(model.getSensitiveDataModelId());
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

    /** The OCID of the target database associated with the sensitive column. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database associated with the sensitive column.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The database schema that contains the sensitive column. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The database schema that contains the sensitive column.
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** The database object that contains the sensitive column. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The database object that contains the sensitive column.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** The name of the sensitive column. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * The name of the sensitive column.
     *
     * @return the value
     */
    public String getColumnName() {
        return columnName;
    }

    /** The OCID of the sensitive type associated with the sensitive column. */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    private final String sensitiveTypeId;

    /**
     * The OCID of the sensitive type associated with the sensitive column.
     *
     * @return the value
     */
    public String getSensitiveTypeId() {
        return sensitiveTypeId;
    }

    /** The OCID of the sensitive data model which contains the sensitive column. */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
    private final String sensitiveDataModelId;

    /**
     * The OCID of the sensitive data model which contains the sensitive column.
     *
     * @return the value
     */
    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
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
        sb.append("SensitiveColumnAnalyticsDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(", sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SensitiveColumnAnalyticsDimensions)) {
            return false;
        }

        SensitiveColumnAnalyticsDimensions other = (SensitiveColumnAnalyticsDimensions) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeId == null ? 43 : this.sensitiveTypeId.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
