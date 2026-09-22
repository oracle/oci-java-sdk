/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth.model;

/**
 * Diagnosis summary of a host and tenancy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiagnosisSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DiagnosisSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostId",
        "instanceId",
        "healthCheckKey",
        "timeTestRan",
        "timeGenerated",
        "failedTests",
        "health",
        "testType"
    })
    public DiagnosisSummary(
            String hostId,
            String instanceId,
            String healthCheckKey,
            java.util.Date timeTestRan,
            java.util.Date timeGenerated,
            java.util.List<FailedTest> failedTests,
            Health health,
            TestType testType) {
        super();
        this.hostId = hostId;
        this.instanceId = instanceId;
        this.healthCheckKey = healthCheckKey;
        this.timeTestRan = timeTestRan;
        this.timeGenerated = timeGenerated;
        this.failedTests = failedTests;
        this.health = health;
        this.testType = testType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * id of the host
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostId")
        private String hostId;

        /**
         * id of the host
         * @param hostId the value to set
         * @return this builder
         **/
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            this.__explicitlySet__.add("hostId");
            return this;
        }
        /**
         * OCID of the instance associated with this summary.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * OCID of the instance associated with this summary.
         * @param instanceId the value to set
         * @return this builder
         **/
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * Identifier of the health check that produced this diagnosis summary.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckKey")
        private String healthCheckKey;

        /**
         * Identifier of the health check that produced this diagnosis summary.
         * @param healthCheckKey the value to set
         * @return this builder
         **/
        public Builder healthCheckKey(String healthCheckKey) {
            this.healthCheckKey = healthCheckKey;
            this.__explicitlySet__.add("healthCheckKey");
            return this;
        }
        /**
         * time the test was run
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTestRan")
        private java.util.Date timeTestRan;

        /**
         * time the test was run
         * @param timeTestRan the value to set
         * @return this builder
         **/
        public Builder timeTestRan(java.util.Date timeTestRan) {
            this.timeTestRan = timeTestRan;
            this.__explicitlySet__.add("timeTestRan");
            return this;
        }
        /**
         * time the recommendation report was generated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeGenerated")
        private java.util.Date timeGenerated;

        /**
         * time the recommendation report was generated
         * @param timeGenerated the value to set
         * @return this builder
         **/
        public Builder timeGenerated(java.util.Date timeGenerated) {
            this.timeGenerated = timeGenerated;
            this.__explicitlySet__.add("timeGenerated");
            return this;
        }
        /**
         * Each summary contains no more than 50 failed tests
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("failedTests")
        private java.util.List<FailedTest> failedTests;

        /**
         * Each summary contains no more than 50 failed tests
         * @param failedTests the value to set
         * @return this builder
         **/
        public Builder failedTests(java.util.List<FailedTest> failedTests) {
            this.failedTests = failedTests;
            this.__explicitlySet__.add("failedTests");
            return this;
        }
        /**
         * if the host is healthy
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("health")
        private Health health;

        /**
         * if the host is healthy
         * @param health the value to set
         * @return this builder
         **/
        public Builder health(Health health) {
            this.health = health;
            this.__explicitlySet__.add("health");
            return this;
        }
        /**
         * Type of the diagnosis test recorded in this summary (e.g., PASSIVE or ACTIVE).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("testType")
        private TestType testType;

        /**
         * Type of the diagnosis test recorded in this summary (e.g., PASSIVE or ACTIVE).
         * @param testType the value to set
         * @return this builder
         **/
        public Builder testType(TestType testType) {
            this.testType = testType;
            this.__explicitlySet__.add("testType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiagnosisSummary build() {
            DiagnosisSummary model =
                    new DiagnosisSummary(
                            this.hostId,
                            this.instanceId,
                            this.healthCheckKey,
                            this.timeTestRan,
                            this.timeGenerated,
                            this.failedTests,
                            this.health,
                            this.testType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiagnosisSummary model) {
            if (model.wasPropertyExplicitlySet("hostId")) {
                this.hostId(model.getHostId());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("healthCheckKey")) {
                this.healthCheckKey(model.getHealthCheckKey());
            }
            if (model.wasPropertyExplicitlySet("timeTestRan")) {
                this.timeTestRan(model.getTimeTestRan());
            }
            if (model.wasPropertyExplicitlySet("timeGenerated")) {
                this.timeGenerated(model.getTimeGenerated());
            }
            if (model.wasPropertyExplicitlySet("failedTests")) {
                this.failedTests(model.getFailedTests());
            }
            if (model.wasPropertyExplicitlySet("health")) {
                this.health(model.getHealth());
            }
            if (model.wasPropertyExplicitlySet("testType")) {
                this.testType(model.getTestType());
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
     * id of the host
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostId")
    private final String hostId;

    /**
     * id of the host
     * @return the value
     **/
    public String getHostId() {
        return hostId;
    }

    /**
     * OCID of the instance associated with this summary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * OCID of the instance associated with this summary.
     * @return the value
     **/
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Identifier of the health check that produced this diagnosis summary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckKey")
    private final String healthCheckKey;

    /**
     * Identifier of the health check that produced this diagnosis summary.
     * @return the value
     **/
    public String getHealthCheckKey() {
        return healthCheckKey;
    }

    /**
     * time the test was run
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTestRan")
    private final java.util.Date timeTestRan;

    /**
     * time the test was run
     * @return the value
     **/
    public java.util.Date getTimeTestRan() {
        return timeTestRan;
    }

    /**
     * time the recommendation report was generated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeGenerated")
    private final java.util.Date timeGenerated;

    /**
     * time the recommendation report was generated
     * @return the value
     **/
    public java.util.Date getTimeGenerated() {
        return timeGenerated;
    }

    /**
     * Each summary contains no more than 50 failed tests
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedTests")
    private final java.util.List<FailedTest> failedTests;

    /**
     * Each summary contains no more than 50 failed tests
     * @return the value
     **/
    public java.util.List<FailedTest> getFailedTests() {
        return failedTests;
    }

    /**
     * if the host is healthy
     **/
    public enum Health {
        Healthy("HEALTHY"),
        Unhealthy("UNHEALTHY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Health.class);

        private final String value;
        private static java.util.Map<String, Health> map;

        static {
            map = new java.util.HashMap<>();
            for (Health v : Health.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Health(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Health create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Health', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * if the host is healthy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("health")
    private final Health health;

    /**
     * if the host is healthy
     * @return the value
     **/
    public Health getHealth() {
        return health;
    }

    /**
     * Type of the diagnosis test recorded in this summary (e.g., PASSIVE or ACTIVE).
     **/
    public enum TestType {
        Passive("PASSIVE"),
        Active("ACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TestType.class);

        private final String value;
        private static java.util.Map<String, TestType> map;

        static {
            map = new java.util.HashMap<>();
            for (TestType v : TestType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'TestType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of the diagnosis test recorded in this summary (e.g., PASSIVE or ACTIVE).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("testType")
    private final TestType testType;

    /**
     * Type of the diagnosis test recorded in this summary (e.g., PASSIVE or ACTIVE).
     * @return the value
     **/
    public TestType getTestType() {
        return testType;
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
        sb.append("DiagnosisSummary(");
        sb.append("super=").append(super.toString());
        sb.append("hostId=").append(String.valueOf(this.hostId));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", healthCheckKey=").append(String.valueOf(this.healthCheckKey));
        sb.append(", timeTestRan=").append(String.valueOf(this.timeTestRan));
        sb.append(", timeGenerated=").append(String.valueOf(this.timeGenerated));
        sb.append(", failedTests=").append(String.valueOf(this.failedTests));
        sb.append(", health=").append(String.valueOf(this.health));
        sb.append(", testType=").append(String.valueOf(this.testType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiagnosisSummary)) {
            return false;
        }

        DiagnosisSummary other = (DiagnosisSummary) o;
        return java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.healthCheckKey, other.healthCheckKey)
                && java.util.Objects.equals(this.timeTestRan, other.timeTestRan)
                && java.util.Objects.equals(this.timeGenerated, other.timeGenerated)
                && java.util.Objects.equals(this.failedTests, other.failedTests)
                && java.util.Objects.equals(this.health, other.health)
                && java.util.Objects.equals(this.testType, other.testType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.healthCheckKey == null ? 43 : this.healthCheckKey.hashCode());
        result = (result * PRIME) + (this.timeTestRan == null ? 43 : this.timeTestRan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeGenerated == null ? 43 : this.timeGenerated.hashCode());
        result = (result * PRIME) + (this.failedTests == null ? 43 : this.failedTests.hashCode());
        result = (result * PRIME) + (this.health == null ? 43 : this.health.hashCode());
        result = (result * PRIME) + (this.testType == null ? 43 : this.testType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
