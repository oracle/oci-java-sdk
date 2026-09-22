/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth.model;

/**
 * Query filters for retrieving diagnosis summaries.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = QueryDiagnosisSummaryDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryDiagnosisSummaryDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceIds",
        "testType",
        "timeTestRunIntervalStart",
        "timeTestRunIntervalEnd"
    })
    public QueryDiagnosisSummaryDetails(
            java.util.List<String> instanceIds,
            TestType testType,
            java.util.Date timeTestRunIntervalStart,
            java.util.Date timeTestRunIntervalEnd) {
        super();
        this.instanceIds = instanceIds;
        this.testType = testType;
        this.timeTestRunIntervalStart = timeTestRunIntervalStart;
        this.timeTestRunIntervalEnd = timeTestRunIntervalEnd;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of instance OCIDs to match.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceIds")
        private java.util.List<String> instanceIds;

        /**
         * A list of instance OCIDs to match.
         * @param instanceIds the value to set
         * @return this builder
         **/
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            this.__explicitlySet__.add("instanceIds");
            return this;
        }
        /**
         * The test type, PASSIVE or ACTIVE
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("testType")
        private TestType testType;

        /**
         * The test type, PASSIVE or ACTIVE
         * @param testType the value to set
         * @return this builder
         **/
        public Builder testType(TestType testType) {
            this.testType = testType;
            this.__explicitlySet__.add("testType");
            return this;
        }
        /**
         * Start of the time range for tests run, in RFC 3339 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTestRunIntervalStart")
        private java.util.Date timeTestRunIntervalStart;

        /**
         * Start of the time range for tests run, in RFC 3339 format.
         * @param timeTestRunIntervalStart the value to set
         * @return this builder
         **/
        public Builder timeTestRunIntervalStart(java.util.Date timeTestRunIntervalStart) {
            this.timeTestRunIntervalStart = timeTestRunIntervalStart;
            this.__explicitlySet__.add("timeTestRunIntervalStart");
            return this;
        }
        /**
         * End of the time range for tests run, in RFC 3339 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTestRunIntervalEnd")
        private java.util.Date timeTestRunIntervalEnd;

        /**
         * End of the time range for tests run, in RFC 3339 format.
         * @param timeTestRunIntervalEnd the value to set
         * @return this builder
         **/
        public Builder timeTestRunIntervalEnd(java.util.Date timeTestRunIntervalEnd) {
            this.timeTestRunIntervalEnd = timeTestRunIntervalEnd;
            this.__explicitlySet__.add("timeTestRunIntervalEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryDiagnosisSummaryDetails build() {
            QueryDiagnosisSummaryDetails model =
                    new QueryDiagnosisSummaryDetails(
                            this.instanceIds,
                            this.testType,
                            this.timeTestRunIntervalStart,
                            this.timeTestRunIntervalEnd);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryDiagnosisSummaryDetails model) {
            if (model.wasPropertyExplicitlySet("instanceIds")) {
                this.instanceIds(model.getInstanceIds());
            }
            if (model.wasPropertyExplicitlySet("testType")) {
                this.testType(model.getTestType());
            }
            if (model.wasPropertyExplicitlySet("timeTestRunIntervalStart")) {
                this.timeTestRunIntervalStart(model.getTimeTestRunIntervalStart());
            }
            if (model.wasPropertyExplicitlySet("timeTestRunIntervalEnd")) {
                this.timeTestRunIntervalEnd(model.getTimeTestRunIntervalEnd());
            }
            return this;
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
     * A list of instance OCIDs to match.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceIds")
    private final java.util.List<String> instanceIds;

    /**
     * A list of instance OCIDs to match.
     * @return the value
     **/
    public java.util.List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * The test type, PASSIVE or ACTIVE
     **/
    public enum TestType {
        Passive("PASSIVE"),
        Active("ACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, TestType> map;

        static {
            map = new java.util.HashMap<>();
            for (TestType v : TestType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TestType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TestType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TestType: " + key);
        }
    };
    /**
     * The test type, PASSIVE or ACTIVE
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("testType")
    private final TestType testType;

    /**
     * The test type, PASSIVE or ACTIVE
     * @return the value
     **/
    public TestType getTestType() {
        return testType;
    }

    /**
     * Start of the time range for tests run, in RFC 3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTestRunIntervalStart")
    private final java.util.Date timeTestRunIntervalStart;

    /**
     * Start of the time range for tests run, in RFC 3339 format.
     * @return the value
     **/
    public java.util.Date getTimeTestRunIntervalStart() {
        return timeTestRunIntervalStart;
    }

    /**
     * End of the time range for tests run, in RFC 3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTestRunIntervalEnd")
    private final java.util.Date timeTestRunIntervalEnd;

    /**
     * End of the time range for tests run, in RFC 3339 format.
     * @return the value
     **/
    public java.util.Date getTimeTestRunIntervalEnd() {
        return timeTestRunIntervalEnd;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryDiagnosisSummaryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("instanceIds=").append(String.valueOf(this.instanceIds));
        sb.append(", testType=").append(String.valueOf(this.testType));
        sb.append(", timeTestRunIntervalStart=")
                .append(String.valueOf(this.timeTestRunIntervalStart));
        sb.append(", timeTestRunIntervalEnd=").append(String.valueOf(this.timeTestRunIntervalEnd));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryDiagnosisSummaryDetails)) {
            return false;
        }

        QueryDiagnosisSummaryDetails other = (QueryDiagnosisSummaryDetails) o;
        return java.util.Objects.equals(this.instanceIds, other.instanceIds)
                && java.util.Objects.equals(this.testType, other.testType)
                && java.util.Objects.equals(
                        this.timeTestRunIntervalStart, other.timeTestRunIntervalStart)
                && java.util.Objects.equals(
                        this.timeTestRunIntervalEnd, other.timeTestRunIntervalEnd)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceIds == null ? 43 : this.instanceIds.hashCode());
        result = (result * PRIME) + (this.testType == null ? 43 : this.testType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTestRunIntervalStart == null
                                ? 43
                                : this.timeTestRunIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTestRunIntervalEnd == null
                                ? 43
                                : this.timeTestRunIntervalEnd.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
