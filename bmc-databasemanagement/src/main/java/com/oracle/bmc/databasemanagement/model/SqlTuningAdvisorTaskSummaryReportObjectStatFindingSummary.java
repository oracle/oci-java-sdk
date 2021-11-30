/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("objectHashValue")
        private Long objectHashValue;

        public Builder objectHashValue(Long objectHashValue) {
            this.objectHashValue = objectHashValue;
            this.__explicitlySet__.add("objectHashValue");
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
        private String objectType;

        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        public Builder problemType(ProblemType problemType) {
            this.problemType = problemType;
            this.__explicitlySet__.add("problemType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
        private Integer referenceCount;

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

    /**
     * Numerical representation of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectHashValue")
    Long objectHashValue;

    /**
     * Name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * Type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    String objectType;

    /**
     * Schema of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    String schema;
    /**
     * Type of statistics problem related to the object.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ProblemType {
        Missing("MISSING"),
        Stale("STALE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    ProblemType problemType;

    /**
     * The number of the times the object is referenced within the SQL Tuning advisor task findings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
    Integer referenceCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
