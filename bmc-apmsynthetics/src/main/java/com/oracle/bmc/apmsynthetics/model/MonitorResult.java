/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * The monitor result for a specific execution.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MonitorResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MonitorResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resultType")
        private String resultType;

        public Builder resultType(String resultType) {
            this.resultType = resultType;
            this.__explicitlySet__.add("resultType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resultContentType")
        private String resultContentType;

        public Builder resultContentType(String resultContentType) {
            this.resultContentType = resultContentType;
            this.__explicitlySet__.add("resultContentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resultDataSet")
        private java.util.List<MonitorResultData> resultDataSet;

        public Builder resultDataSet(java.util.List<MonitorResultData> resultDataSet) {
            this.resultDataSet = resultDataSet;
            this.__explicitlySet__.add("resultDataSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("monitorId")
        private String monitorId;

        public Builder monitorId(String monitorId) {
            this.monitorId = monitorId;
            this.__explicitlySet__.add("monitorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vantagePoint")
        private String vantagePoint;

        public Builder vantagePoint(String vantagePoint) {
            this.vantagePoint = vantagePoint;
            this.__explicitlySet__.add("vantagePoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionTime")
        private String executionTime;

        public Builder executionTime(String executionTime) {
            this.executionTime = executionTime;
            this.__explicitlySet__.add("executionTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitorResult build() {
            MonitorResult __instance__ =
                    new MonitorResult(
                            resultType,
                            resultContentType,
                            resultDataSet,
                            monitorId,
                            vantagePoint,
                            executionTime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitorResult o) {
            Builder copiedBuilder =
                    resultType(o.getResultType())
                            .resultContentType(o.getResultContentType())
                            .resultDataSet(o.getResultDataSet())
                            .monitorId(o.getMonitorId())
                            .vantagePoint(o.getVantagePoint())
                            .executionTime(o.getExecutionTime());

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
     * Type of result.
     * Example: HAR, Screenshot, Log or Network.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resultType")
    String resultType;

    /**
     * Type of result content.
     * Example: Zip or Raw file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resultContentType")
    String resultContentType;

    /**
     * Monitor result data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resultDataSet")
    java.util.List<MonitorResultData> resultDataSet;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the monitor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monitorId")
    String monitorId;

    /**
     * The name of the public or dedicated vantage point.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePoint")
    String vantagePoint;

    /**
     * The specific point of time when the result of an execution is collected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionTime")
    String executionTime;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
