/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Benchmark test configuration detail. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BenchmarkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BenchmarkDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "perfTestLength",
        "controlClusterId",
        "test1ClusterId",
        "test2ClusterId"
    })
    public BenchmarkDetails(
            PerfTestLength perfTestLength,
            String controlClusterId,
            String test1ClusterId,
            String test2ClusterId) {
        super();
        this.perfTestLength = perfTestLength;
        this.controlClusterId = controlClusterId;
        this.test1ClusterId = test1ClusterId;
        this.test2ClusterId = test2ClusterId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Execution Length of Perf Test (default set to STANDARD) */
        @com.fasterxml.jackson.annotation.JsonProperty("perfTestLength")
        private PerfTestLength perfTestLength;

        /**
         * Execution Length of Perf Test (default set to STANDARD)
         *
         * @param perfTestLength the value to set
         * @return this builder
         */
        public Builder perfTestLength(PerfTestLength perfTestLength) {
            this.perfTestLength = perfTestLength;
            this.__explicitlySet__.add("perfTestLength");
            return this;
        }
        /** Control Cluster Id Information */
        @com.fasterxml.jackson.annotation.JsonProperty("controlClusterId")
        private String controlClusterId;

        /**
         * Control Cluster Id Information
         *
         * @param controlClusterId the value to set
         * @return this builder
         */
        public Builder controlClusterId(String controlClusterId) {
            this.controlClusterId = controlClusterId;
            this.__explicitlySet__.add("controlClusterId");
            return this;
        }
        /** Required Test Cluster Id needed to run perf test */
        @com.fasterxml.jackson.annotation.JsonProperty("test1ClusterId")
        private String test1ClusterId;

        /**
         * Required Test Cluster Id needed to run perf test
         *
         * @param test1ClusterId the value to set
         * @return this builder
         */
        public Builder test1ClusterId(String test1ClusterId) {
            this.test1ClusterId = test1ClusterId;
            this.__explicitlySet__.add("test1ClusterId");
            return this;
        }
        /** Optional Test Cluster Id needed to run perf test */
        @com.fasterxml.jackson.annotation.JsonProperty("test2ClusterId")
        private String test2ClusterId;

        /**
         * Optional Test Cluster Id needed to run perf test
         *
         * @param test2ClusterId the value to set
         * @return this builder
         */
        public Builder test2ClusterId(String test2ClusterId) {
            this.test2ClusterId = test2ClusterId;
            this.__explicitlySet__.add("test2ClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BenchmarkDetails build() {
            BenchmarkDetails model =
                    new BenchmarkDetails(
                            this.perfTestLength,
                            this.controlClusterId,
                            this.test1ClusterId,
                            this.test2ClusterId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BenchmarkDetails model) {
            if (model.wasPropertyExplicitlySet("perfTestLength")) {
                this.perfTestLength(model.getPerfTestLength());
            }
            if (model.wasPropertyExplicitlySet("controlClusterId")) {
                this.controlClusterId(model.getControlClusterId());
            }
            if (model.wasPropertyExplicitlySet("test1ClusterId")) {
                this.test1ClusterId(model.getTest1ClusterId());
            }
            if (model.wasPropertyExplicitlySet("test2ClusterId")) {
                this.test2ClusterId(model.getTest2ClusterId());
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

    /** Execution Length of Perf Test (default set to STANDARD) */
    public enum PerfTestLength implements com.oracle.bmc.http.internal.BmcEnum {
        Standard("STANDARD"),
        Long("LONG"),
        ;

        private final String value;
        private static java.util.Map<String, PerfTestLength> map;

        static {
            map = new java.util.HashMap<>();
            for (PerfTestLength v : PerfTestLength.values()) {
                map.put(v.getValue(), v);
            }
        }

        PerfTestLength(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PerfTestLength create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PerfTestLength: " + key);
        }
    };
    /** Execution Length of Perf Test (default set to STANDARD) */
    @com.fasterxml.jackson.annotation.JsonProperty("perfTestLength")
    private final PerfTestLength perfTestLength;

    /**
     * Execution Length of Perf Test (default set to STANDARD)
     *
     * @return the value
     */
    public PerfTestLength getPerfTestLength() {
        return perfTestLength;
    }

    /** Control Cluster Id Information */
    @com.fasterxml.jackson.annotation.JsonProperty("controlClusterId")
    private final String controlClusterId;

    /**
     * Control Cluster Id Information
     *
     * @return the value
     */
    public String getControlClusterId() {
        return controlClusterId;
    }

    /** Required Test Cluster Id needed to run perf test */
    @com.fasterxml.jackson.annotation.JsonProperty("test1ClusterId")
    private final String test1ClusterId;

    /**
     * Required Test Cluster Id needed to run perf test
     *
     * @return the value
     */
    public String getTest1ClusterId() {
        return test1ClusterId;
    }

    /** Optional Test Cluster Id needed to run perf test */
    @com.fasterxml.jackson.annotation.JsonProperty("test2ClusterId")
    private final String test2ClusterId;

    /**
     * Optional Test Cluster Id needed to run perf test
     *
     * @return the value
     */
    public String getTest2ClusterId() {
        return test2ClusterId;
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
        sb.append("BenchmarkDetails(");
        sb.append("super=").append(super.toString());
        sb.append("perfTestLength=").append(String.valueOf(this.perfTestLength));
        sb.append(", controlClusterId=").append(String.valueOf(this.controlClusterId));
        sb.append(", test1ClusterId=").append(String.valueOf(this.test1ClusterId));
        sb.append(", test2ClusterId=").append(String.valueOf(this.test2ClusterId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BenchmarkDetails)) {
            return false;
        }

        BenchmarkDetails other = (BenchmarkDetails) o;
        return java.util.Objects.equals(this.perfTestLength, other.perfTestLength)
                && java.util.Objects.equals(this.controlClusterId, other.controlClusterId)
                && java.util.Objects.equals(this.test1ClusterId, other.test1ClusterId)
                && java.util.Objects.equals(this.test2ClusterId, other.test2ClusterId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.perfTestLength == null ? 43 : this.perfTestLength.hashCode());
        result =
                (result * PRIME)
                        + (this.controlClusterId == null ? 43 : this.controlClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.test1ClusterId == null ? 43 : this.test1ClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.test2ClusterId == null ? 43 : this.test2ClusterId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
