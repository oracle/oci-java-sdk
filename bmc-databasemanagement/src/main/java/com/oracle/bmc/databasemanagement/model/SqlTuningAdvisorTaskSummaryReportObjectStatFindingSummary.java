/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary for all the statistic findings of an object in a SQL Tuning Advisor task. Includes the object's hash, name, type, schema, problem type and the object reference count.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary {
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
        /**
         * Numerical representation of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectHashValue")
        private Long objectHashValue;

        /**
         * Numerical representation of the object.
         * @param objectHashValue the value to set
         * @return this builder
         **/
        public Builder objectHashValue(Long objectHashValue) {
            this.objectHashValue = objectHashValue;
            this.__explicitlySet__.add("objectHashValue");
            return this;
        }
        /**
         * Name of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * Name of the object.
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * Type of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        /**
         * Type of the object.
         * @param objectType the value to set
         * @return this builder
         **/
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /**
         * Schema of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        /**
         * Schema of the object.
         * @param schema the value to set
         * @return this builder
         **/
        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /**
         * Type of statistics problem related to the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        /**
         * Type of statistics problem related to the object.
         * @param problemType the value to set
         * @return this builder
         **/
        public Builder problemType(ProblemType problemType) {
            this.problemType = problemType;
            this.__explicitlySet__.add("problemType");
            return this;
        }
        /**
         * The number of the times the object is referenced within the SQL Tuning advisor task findings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
        private Integer referenceCount;

        /**
         * The number of the times the object is referenced within the SQL Tuning advisor task findings.
         * @param referenceCount the value to set
         * @return this builder
         **/
        public Builder referenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            this.__explicitlySet__.add("referenceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary build() {
            SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary __instance__ =
                    new SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary(
                            objectHashValue,
                            objectName,
                            objectType,
                            schema,
                            problemType,
                            referenceCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary o) {
            Builder copiedBuilder =
                    objectHashValue(o.getObjectHashValue())
                            .objectName(o.getObjectName())
                            .objectType(o.getObjectType())
                            .schema(o.getSchema())
                            .problemType(o.getProblemType())
                            .referenceCount(o.getReferenceCount());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Numerical representation of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectHashValue")
    private final Long objectHashValue;

    /**
     * Numerical representation of the object.
     * @return the value
     **/
    public Long getObjectHashValue() {
        return objectHashValue;
    }

    /**
     * Name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * Name of the object.
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
    }

    /**
     * Type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final String objectType;

    /**
     * Type of the object.
     * @return the value
     **/
    public String getObjectType() {
        return objectType;
    }

    /**
     * Schema of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

    /**
     * Schema of the object.
     * @return the value
     **/
    public String getSchema() {
        return schema;
    }

    /**
     * Type of statistics problem related to the object.
     **/
    public enum ProblemType {
        Missing("MISSING"),
        Stale("STALE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * Type of statistics problem related to the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    private final ProblemType problemType;

    /**
     * Type of statistics problem related to the object.
     * @return the value
     **/
    public ProblemType getProblemType() {
        return problemType;
    }

    /**
     * The number of the times the object is referenced within the SQL Tuning advisor task findings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
    private final Integer referenceCount;

    /**
     * The number of the times the object is referenced within the SQL Tuning advisor task findings.
     * @return the value
     **/
    public Integer getReferenceCount() {
        return referenceCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary(");
        sb.append("objectHashValue=").append(String.valueOf(this.objectHashValue));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", problemType=").append(String.valueOf(this.problemType));
        sb.append(", referenceCount=").append(String.valueOf(this.referenceCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
