/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Object type count comparison summary line for MySQL migrations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySqlDataVerificationObjectTypeCountSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlDataVerificationObjectTypeCountSummary
        extends DataVerificationObjectTypeCountSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceObjectCount")
        private Integer sourceObjectCount;

        public Builder sourceObjectCount(Integer sourceObjectCount) {
            this.sourceObjectCount = sourceObjectCount;
            this.__explicitlySet__.add("sourceObjectCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetObjectCount")
        private Integer targetObjectCount;

        public Builder targetObjectCount(Integer targetObjectCount) {
            this.targetObjectCount = targetObjectCount;
            this.__explicitlySet__.add("targetObjectCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaPercent")
        private Double deltaPercent;

        public Builder deltaPercent(Double deltaPercent) {
            this.deltaPercent = deltaPercent;
            this.__explicitlySet__.add("deltaPercent");
            return this;
        }
        /** MySQL database object type. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private MySqlDatabaseObjectTypes objectType;

        /**
         * MySQL database object type.
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(MySqlDatabaseObjectTypes objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** Number of invalid objects in source. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceInvalidCount")
        private Integer sourceInvalidCount;

        /**
         * Number of invalid objects in source.
         *
         * @param sourceInvalidCount the value to set
         * @return this builder
         */
        public Builder sourceInvalidCount(Integer sourceInvalidCount) {
            this.sourceInvalidCount = sourceInvalidCount;
            this.__explicitlySet__.add("sourceInvalidCount");
            return this;
        }
        /** Number of invalid objects in target. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetInvalidCount")
        private Integer targetInvalidCount;

        /**
         * Number of invalid objects in target.
         *
         * @param targetInvalidCount the value to set
         * @return this builder
         */
        public Builder targetInvalidCount(Integer targetInvalidCount) {
            this.targetInvalidCount = targetInvalidCount;
            this.__explicitlySet__.add("targetInvalidCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlDataVerificationObjectTypeCountSummary build() {
            MySqlDataVerificationObjectTypeCountSummary model =
                    new MySqlDataVerificationObjectTypeCountSummary(
                            this.schemaName,
                            this.sourceObjectCount,
                            this.targetObjectCount,
                            this.deltaPercent,
                            this.objectType,
                            this.sourceInvalidCount,
                            this.targetInvalidCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlDataVerificationObjectTypeCountSummary model) {
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("sourceObjectCount")) {
                this.sourceObjectCount(model.getSourceObjectCount());
            }
            if (model.wasPropertyExplicitlySet("targetObjectCount")) {
                this.targetObjectCount(model.getTargetObjectCount());
            }
            if (model.wasPropertyExplicitlySet("deltaPercent")) {
                this.deltaPercent(model.getDeltaPercent());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("sourceInvalidCount")) {
                this.sourceInvalidCount(model.getSourceInvalidCount());
            }
            if (model.wasPropertyExplicitlySet("targetInvalidCount")) {
                this.targetInvalidCount(model.getTargetInvalidCount());
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
    public MySqlDataVerificationObjectTypeCountSummary(
            String schemaName,
            Integer sourceObjectCount,
            Integer targetObjectCount,
            Double deltaPercent,
            MySqlDatabaseObjectTypes objectType,
            Integer sourceInvalidCount,
            Integer targetInvalidCount) {
        super(schemaName, sourceObjectCount, targetObjectCount, deltaPercent);
        this.objectType = objectType;
        this.sourceInvalidCount = sourceInvalidCount;
        this.targetInvalidCount = targetInvalidCount;
    }

    /** MySQL database object type. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final MySqlDatabaseObjectTypes objectType;

    /**
     * MySQL database object type.
     *
     * @return the value
     */
    public MySqlDatabaseObjectTypes getObjectType() {
        return objectType;
    }

    /** Number of invalid objects in source. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceInvalidCount")
    private final Integer sourceInvalidCount;

    /**
     * Number of invalid objects in source.
     *
     * @return the value
     */
    public Integer getSourceInvalidCount() {
        return sourceInvalidCount;
    }

    /** Number of invalid objects in target. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetInvalidCount")
    private final Integer targetInvalidCount;

    /**
     * Number of invalid objects in target.
     *
     * @return the value
     */
    public Integer getTargetInvalidCount() {
        return targetInvalidCount;
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
        sb.append("MySqlDataVerificationObjectTypeCountSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", sourceInvalidCount=").append(String.valueOf(this.sourceInvalidCount));
        sb.append(", targetInvalidCount=").append(String.valueOf(this.targetInvalidCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlDataVerificationObjectTypeCountSummary)) {
            return false;
        }

        MySqlDataVerificationObjectTypeCountSummary other =
                (MySqlDataVerificationObjectTypeCountSummary) o;
        return java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.sourceInvalidCount, other.sourceInvalidCount)
                && java.util.Objects.equals(this.targetInvalidCount, other.targetInvalidCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceInvalidCount == null
                                ? 43
                                : this.sourceInvalidCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetInvalidCount == null
                                ? 43
                                : this.targetInvalidCount.hashCode());
        return result;
    }
}
