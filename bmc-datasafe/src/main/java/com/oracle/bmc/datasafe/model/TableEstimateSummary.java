/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Estimated row count and size details for a table in a subsetting policy. <br>
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
        builder = TableEstimateSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TableEstimateSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetId",
        "schemaName",
        "tableName",
        "objectType",
        "initialRowCount",
        "estimatedRowCount",
        "initialSizeInKBs",
        "estimatedSizeInKBs"
    })
    public TableEstimateSummary(
            String targetId,
            String schemaName,
            String tableName,
            ObjectType objectType,
            Long initialRowCount,
            Long estimatedRowCount,
            String initialSizeInKBs,
            String estimatedSizeInKBs) {
        super();
        this.targetId = targetId;
        this.schemaName = schemaName;
        this.tableName = tableName;
        this.objectType = objectType;
        this.initialRowCount = initialRowCount;
        this.estimatedRowCount = estimatedRowCount;
        this.initialSizeInKBs = initialSizeInKBs;
        this.estimatedSizeInKBs = estimatedSizeInKBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the target database associated with the table estimate object. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database associated with the table estimate object.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The name of the schema that contains the table. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The name of the schema that contains the table.
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /** The name of the table. */
        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        /**
         * The name of the table.
         *
         * @param tableName the value to set
         * @return this builder
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }
        /** The type of the database object. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        /**
         * The type of the database object.
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** The initial number of rows in the table. */
        @com.fasterxml.jackson.annotation.JsonProperty("initialRowCount")
        private Long initialRowCount;

        /**
         * The initial number of rows in the table.
         *
         * @param initialRowCount the value to set
         * @return this builder
         */
        public Builder initialRowCount(Long initialRowCount) {
            this.initialRowCount = initialRowCount;
            this.__explicitlySet__.add("initialRowCount");
            return this;
        }
        /** The estimated number of rows in the table after subsetting. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCount")
        private Long estimatedRowCount;

        /**
         * The estimated number of rows in the table after subsetting.
         *
         * @param estimatedRowCount the value to set
         * @return this builder
         */
        public Builder estimatedRowCount(Long estimatedRowCount) {
            this.estimatedRowCount = estimatedRowCount;
            this.__explicitlySet__.add("estimatedRowCount");
            return this;
        }
        /** The initial size of the table in KBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("initialSizeInKBs")
        private String initialSizeInKBs;

        /**
         * The initial size of the table in KBs.
         *
         * @param initialSizeInKBs the value to set
         * @return this builder
         */
        public Builder initialSizeInKBs(String initialSizeInKBs) {
            this.initialSizeInKBs = initialSizeInKBs;
            this.__explicitlySet__.add("initialSizeInKBs");
            return this;
        }
        /** The estimated size of the table in KBs after subsetting. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedSizeInKBs")
        private String estimatedSizeInKBs;

        /**
         * The estimated size of the table in KBs after subsetting.
         *
         * @param estimatedSizeInKBs the value to set
         * @return this builder
         */
        public Builder estimatedSizeInKBs(String estimatedSizeInKBs) {
            this.estimatedSizeInKBs = estimatedSizeInKBs;
            this.__explicitlySet__.add("estimatedSizeInKBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TableEstimateSummary build() {
            TableEstimateSummary model =
                    new TableEstimateSummary(
                            this.targetId,
                            this.schemaName,
                            this.tableName,
                            this.objectType,
                            this.initialRowCount,
                            this.estimatedRowCount,
                            this.initialSizeInKBs,
                            this.estimatedSizeInKBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableEstimateSummary model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("tableName")) {
                this.tableName(model.getTableName());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("initialRowCount")) {
                this.initialRowCount(model.getInitialRowCount());
            }
            if (model.wasPropertyExplicitlySet("estimatedRowCount")) {
                this.estimatedRowCount(model.getEstimatedRowCount());
            }
            if (model.wasPropertyExplicitlySet("initialSizeInKBs")) {
                this.initialSizeInKBs(model.getInitialSizeInKBs());
            }
            if (model.wasPropertyExplicitlySet("estimatedSizeInKBs")) {
                this.estimatedSizeInKBs(model.getEstimatedSizeInKBs());
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

    /** The OCID of the target database associated with the table estimate object. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database associated with the table estimate object.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The name of the schema that contains the table. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The name of the schema that contains the table.
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** The name of the table. */
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

    /**
     * The name of the table.
     *
     * @return the value
     */
    public String getTableName() {
        return tableName;
    }

    /** The type of the database object. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

    /**
     * The type of the database object.
     *
     * @return the value
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /** The initial number of rows in the table. */
    @com.fasterxml.jackson.annotation.JsonProperty("initialRowCount")
    private final Long initialRowCount;

    /**
     * The initial number of rows in the table.
     *
     * @return the value
     */
    public Long getInitialRowCount() {
        return initialRowCount;
    }

    /** The estimated number of rows in the table after subsetting. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCount")
    private final Long estimatedRowCount;

    /**
     * The estimated number of rows in the table after subsetting.
     *
     * @return the value
     */
    public Long getEstimatedRowCount() {
        return estimatedRowCount;
    }

    /** The initial size of the table in KBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("initialSizeInKBs")
    private final String initialSizeInKBs;

    /**
     * The initial size of the table in KBs.
     *
     * @return the value
     */
    public String getInitialSizeInKBs() {
        return initialSizeInKBs;
    }

    /** The estimated size of the table in KBs after subsetting. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedSizeInKBs")
    private final String estimatedSizeInKBs;

    /**
     * The estimated size of the table in KBs after subsetting.
     *
     * @return the value
     */
    public String getEstimatedSizeInKBs() {
        return estimatedSizeInKBs;
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
        sb.append("TableEstimateSummary(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", tableName=").append(String.valueOf(this.tableName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", initialRowCount=").append(String.valueOf(this.initialRowCount));
        sb.append(", estimatedRowCount=").append(String.valueOf(this.estimatedRowCount));
        sb.append(", initialSizeInKBs=").append(String.valueOf(this.initialSizeInKBs));
        sb.append(", estimatedSizeInKBs=").append(String.valueOf(this.estimatedSizeInKBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TableEstimateSummary)) {
            return false;
        }

        TableEstimateSummary other = (TableEstimateSummary) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.initialRowCount, other.initialRowCount)
                && java.util.Objects.equals(this.estimatedRowCount, other.estimatedRowCount)
                && java.util.Objects.equals(this.initialSizeInKBs, other.initialSizeInKBs)
                && java.util.Objects.equals(this.estimatedSizeInKBs, other.estimatedSizeInKBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result =
                (result * PRIME)
                        + (this.initialRowCount == null ? 43 : this.initialRowCount.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedRowCount == null ? 43 : this.estimatedRowCount.hashCode());
        result =
                (result * PRIME)
                        + (this.initialSizeInKBs == null ? 43 : this.initialSizeInKBs.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedSizeInKBs == null
                                ? 43
                                : this.estimatedSizeInKBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
