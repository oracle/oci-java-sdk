/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * The monitor result for a specific execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MonitorResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MonitorResult extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resultType",
        "resultContentType",
        "resultDataSet",
        "monitorId",
        "vantagePoint",
        "executionTime"
    })
    public MonitorResult(
            String resultType,
            String resultContentType,
            java.util.List<MonitorResultData> resultDataSet,
            String monitorId,
            String vantagePoint,
            String executionTime) {
        super();
        this.resultType = resultType;
        this.resultContentType = resultContentType;
        this.resultDataSet = resultDataSet;
        this.monitorId = monitorId;
        this.vantagePoint = vantagePoint;
        this.executionTime = executionTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of result. Example: HAR, Screenshot, Log or Network. */
        @com.fasterxml.jackson.annotation.JsonProperty("resultType")
        private String resultType;

        /**
         * Type of result. Example: HAR, Screenshot, Log or Network.
         *
         * @param resultType the value to set
         * @return this builder
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            this.__explicitlySet__.add("resultType");
            return this;
        }
        /** Type of result content. Example: Zip or Raw file. */
        @com.fasterxml.jackson.annotation.JsonProperty("resultContentType")
        private String resultContentType;

        /**
         * Type of result content. Example: Zip or Raw file.
         *
         * @param resultContentType the value to set
         * @return this builder
         */
        public Builder resultContentType(String resultContentType) {
            this.resultContentType = resultContentType;
            this.__explicitlySet__.add("resultContentType");
            return this;
        }
        /** Monitor result data set. */
        @com.fasterxml.jackson.annotation.JsonProperty("resultDataSet")
        private java.util.List<MonitorResultData> resultDataSet;

        /**
         * Monitor result data set.
         *
         * @param resultDataSet the value to set
         * @return this builder
         */
        public Builder resultDataSet(java.util.List<MonitorResultData> resultDataSet) {
            this.resultDataSet = resultDataSet;
            this.__explicitlySet__.add("resultDataSet");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * monitor.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("monitorId")
        private String monitorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * monitor.
         *
         * @param monitorId the value to set
         * @return this builder
         */
        public Builder monitorId(String monitorId) {
            this.monitorId = monitorId;
            this.__explicitlySet__.add("monitorId");
            return this;
        }
        /** The name of the public or dedicated vantage point. */
        @com.fasterxml.jackson.annotation.JsonProperty("vantagePoint")
        private String vantagePoint;

        /**
         * The name of the public or dedicated vantage point.
         *
         * @param vantagePoint the value to set
         * @return this builder
         */
        public Builder vantagePoint(String vantagePoint) {
            this.vantagePoint = vantagePoint;
            this.__explicitlySet__.add("vantagePoint");
            return this;
        }
        /** The specific point of time when the result of an execution is collected. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionTime")
        private String executionTime;

        /**
         * The specific point of time when the result of an execution is collected.
         *
         * @param executionTime the value to set
         * @return this builder
         */
        public Builder executionTime(String executionTime) {
            this.executionTime = executionTime;
            this.__explicitlySet__.add("executionTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitorResult build() {
            MonitorResult model =
                    new MonitorResult(
                            this.resultType,
                            this.resultContentType,
                            this.resultDataSet,
                            this.monitorId,
                            this.vantagePoint,
                            this.executionTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitorResult model) {
            if (model.wasPropertyExplicitlySet("resultType")) {
                this.resultType(model.getResultType());
            }
            if (model.wasPropertyExplicitlySet("resultContentType")) {
                this.resultContentType(model.getResultContentType());
            }
            if (model.wasPropertyExplicitlySet("resultDataSet")) {
                this.resultDataSet(model.getResultDataSet());
            }
            if (model.wasPropertyExplicitlySet("monitorId")) {
                this.monitorId(model.getMonitorId());
            }
            if (model.wasPropertyExplicitlySet("vantagePoint")) {
                this.vantagePoint(model.getVantagePoint());
            }
            if (model.wasPropertyExplicitlySet("executionTime")) {
                this.executionTime(model.getExecutionTime());
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

    /** Type of result. Example: HAR, Screenshot, Log or Network. */
    @com.fasterxml.jackson.annotation.JsonProperty("resultType")
    private final String resultType;

    /**
     * Type of result. Example: HAR, Screenshot, Log or Network.
     *
     * @return the value
     */
    public String getResultType() {
        return resultType;
    }

    /** Type of result content. Example: Zip or Raw file. */
    @com.fasterxml.jackson.annotation.JsonProperty("resultContentType")
    private final String resultContentType;

    /**
     * Type of result content. Example: Zip or Raw file.
     *
     * @return the value
     */
    public String getResultContentType() {
        return resultContentType;
    }

    /** Monitor result data set. */
    @com.fasterxml.jackson.annotation.JsonProperty("resultDataSet")
    private final java.util.List<MonitorResultData> resultDataSet;

    /**
     * Monitor result data set.
     *
     * @return the value
     */
    public java.util.List<MonitorResultData> getResultDataSet() {
        return resultDataSet;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * monitor.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monitorId")
    private final String monitorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * monitor.
     *
     * @return the value
     */
    public String getMonitorId() {
        return monitorId;
    }

    /** The name of the public or dedicated vantage point. */
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePoint")
    private final String vantagePoint;

    /**
     * The name of the public or dedicated vantage point.
     *
     * @return the value
     */
    public String getVantagePoint() {
        return vantagePoint;
    }

    /** The specific point of time when the result of an execution is collected. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionTime")
    private final String executionTime;

    /**
     * The specific point of time when the result of an execution is collected.
     *
     * @return the value
     */
    public String getExecutionTime() {
        return executionTime;
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
        sb.append("MonitorResult(");
        sb.append("super=").append(super.toString());
        sb.append("resultType=").append(String.valueOf(this.resultType));
        sb.append(", resultContentType=").append(String.valueOf(this.resultContentType));
        sb.append(", resultDataSet=").append(String.valueOf(this.resultDataSet));
        sb.append(", monitorId=").append(String.valueOf(this.monitorId));
        sb.append(", vantagePoint=").append(String.valueOf(this.vantagePoint));
        sb.append(", executionTime=").append(String.valueOf(this.executionTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitorResult)) {
            return false;
        }

        MonitorResult other = (MonitorResult) o;
        return java.util.Objects.equals(this.resultType, other.resultType)
                && java.util.Objects.equals(this.resultContentType, other.resultContentType)
                && java.util.Objects.equals(this.resultDataSet, other.resultDataSet)
                && java.util.Objects.equals(this.monitorId, other.monitorId)
                && java.util.Objects.equals(this.vantagePoint, other.vantagePoint)
                && java.util.Objects.equals(this.executionTime, other.executionTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resultType == null ? 43 : this.resultType.hashCode());
        result =
                (result * PRIME)
                        + (this.resultContentType == null ? 43 : this.resultContentType.hashCode());
        result =
                (result * PRIME)
                        + (this.resultDataSet == null ? 43 : this.resultDataSet.hashCode());
        result = (result * PRIME) + (this.monitorId == null ? 43 : this.monitorId.hashCode());
        result = (result * PRIME) + (this.vantagePoint == null ? 43 : this.vantagePoint.hashCode());
        result =
                (result * PRIME)
                        + (this.executionTime == null ? 43 : this.executionTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
