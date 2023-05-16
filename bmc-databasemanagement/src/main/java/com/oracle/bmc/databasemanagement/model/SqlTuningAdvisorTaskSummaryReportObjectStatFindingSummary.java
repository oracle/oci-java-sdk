/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary for all the statistic findings of an object in a SQL Tuning Advisor task. Includes the
 * object's hash, name, type, schema, problem type and the object reference count. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "objectHashValue",
        "objectName",
        "objectType",
        "schema",
        "problemType",
        "referenceCount"
    })
    public SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary(
            Long objectHashValue,
            String objectName,
            String objectType,
            String schema,
            ProblemType problemType,
            Integer referenceCount) {
        super();
        this.objectHashValue = objectHashValue;
        this.objectName = objectName;
        this.objectType = objectType;
        this.schema = schema;
        this.problemType = problemType;
        this.referenceCount = referenceCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Numerical representation of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectHashValue")
        private Long objectHashValue;

        /**
         * Numerical representation of the object.
         *
         * @param objectHashValue the value to set
         * @return this builder
         */
        public Builder objectHashValue(Long objectHashValue) {
            this.objectHashValue = objectHashValue;
            this.__explicitlySet__.add("objectHashValue");
            return this;
        }
        /** Name of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * Name of the object.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** Type of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        /**
         * Type of the object.
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** Schema of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        /**
         * Schema of the object.
         *
         * @param schema the value to set
         * @return this builder
         */
        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /** Type of statistics problem related to the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        /**
         * Type of statistics problem related to the object.
         *
         * @param problemType the value to set
         * @return this builder
         */
        public Builder problemType(ProblemType problemType) {
            this.problemType = problemType;
            this.__explicitlySet__.add("problemType");
            return this;
        }
        /**
         * The number of the times the object is referenced within the SQL Tuning advisor task
         * findings.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
        private Integer referenceCount;

        /**
         * The number of the times the object is referenced within the SQL Tuning advisor task
         * findings.
         *
         * @param referenceCount the value to set
         * @return this builder
         */
        public Builder referenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            this.__explicitlySet__.add("referenceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary build() {
            SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary model =
                    new SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary(
                            this.objectHashValue,
                            this.objectName,
                            this.objectType,
                            this.schema,
                            this.problemType,
                            this.referenceCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary model) {
            if (model.wasPropertyExplicitlySet("objectHashValue")) {
                this.objectHashValue(model.getObjectHashValue());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("problemType")) {
                this.problemType(model.getProblemType());
            }
            if (model.wasPropertyExplicitlySet("referenceCount")) {
                this.referenceCount(model.getReferenceCount());
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

    /** Numerical representation of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectHashValue")
    private final Long objectHashValue;

    /**
     * Numerical representation of the object.
     *
     * @return the value
     */
    public Long getObjectHashValue() {
        return objectHashValue;
    }

    /** Name of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * Name of the object.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** Type of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final String objectType;

    /**
     * Type of the object.
     *
     * @return the value
     */
    public String getObjectType() {
        return objectType;
    }

    /** Schema of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

    /**
     * Schema of the object.
     *
     * @return the value
     */
    public String getSchema() {
        return schema;
    }

    /** Type of statistics problem related to the object. */
    public enum ProblemType implements com.oracle.bmc.http.internal.BmcEnum {
        Missing("MISSING"),
        Stale("STALE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ProblemType.class);

        private final String value;
        private static java.util.Map<String, ProblemType> map;

        static {
            map = new java.util.HashMap<>();
            for (ProblemType v : ProblemType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ProblemType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProblemType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ProblemType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of statistics problem related to the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    private final ProblemType problemType;

    /**
     * Type of statistics problem related to the object.
     *
     * @return the value
     */
    public ProblemType getProblemType() {
        return problemType;
    }

    /**
     * The number of the times the object is referenced within the SQL Tuning advisor task findings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
    private final Integer referenceCount;

    /**
     * The number of the times the object is referenced within the SQL Tuning advisor task findings.
     *
     * @return the value
     */
    public Integer getReferenceCount() {
        return referenceCount;
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
        sb.append("SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary(");
        sb.append("super=").append(super.toString());
        sb.append("objectHashValue=").append(String.valueOf(this.objectHashValue));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", problemType=").append(String.valueOf(this.problemType));
        sb.append(", referenceCount=").append(String.valueOf(this.referenceCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary)) {
            return false;
        }

        SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary other =
                (SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary) o;
        return java.util.Objects.equals(this.objectHashValue, other.objectHashValue)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.problemType, other.problemType)
                && java.util.Objects.equals(this.referenceCount, other.referenceCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.objectHashValue == null ? 43 : this.objectHashValue.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.problemType == null ? 43 : this.problemType.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceCount == null ? 43 : this.referenceCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
