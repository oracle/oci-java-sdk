/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth.model;

/**
 * Metadata associated with the diagnosis recommendation report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Metadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Metadata extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostId",
        "healthCheckKey",
        "instanceId",
        "shape",
        "testType"
    })
    public Metadata(
            String hostId,
            String healthCheckKey,
            String instanceId,
            String shape,
            TestType testType) {
        super();
        this.hostId = hostId;
        this.healthCheckKey = healthCheckKey;
        this.instanceId = instanceId;
        this.shape = shape;
        this.testType = testType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the host that ran the test.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostId")
        private String hostId;

        /**
         * OCID of the host that ran the test.
         * @param hostId the value to set
         * @return this builder
         **/
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            this.__explicitlySet__.add("hostId");
            return this;
        }
        /**
         * Identifier of the health check run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckKey")
        private String healthCheckKey;

        /**
         * Identifier of the health check run.
         * @param healthCheckKey the value to set
         * @return this builder
         **/
        public Builder healthCheckKey(String healthCheckKey) {
            this.healthCheckKey = healthCheckKey;
            this.__explicitlySet__.add("healthCheckKey");
            return this;
        }
        /**
         * OCID of the instance related to the test.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * OCID of the instance related to the test.
         * @param instanceId the value to set
         * @return this builder
         **/
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * Shape of the instance under test.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Shape of the instance under test.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * Test type provided by the diagnosis payload.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("testType")
        private TestType testType;

        /**
         * Test type provided by the diagnosis payload.
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

        public Metadata build() {
            Metadata model =
                    new Metadata(
                            this.hostId,
                            this.healthCheckKey,
                            this.instanceId,
                            this.shape,
                            this.testType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Metadata model) {
            if (model.wasPropertyExplicitlySet("hostId")) {
                this.hostId(model.getHostId());
            }
            if (model.wasPropertyExplicitlySet("healthCheckKey")) {
                this.healthCheckKey(model.getHealthCheckKey());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
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
     * OCID of the host that ran the test.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostId")
    private final String hostId;

    /**
     * OCID of the host that ran the test.
     * @return the value
     **/
    public String getHostId() {
        return hostId;
    }

    /**
     * Identifier of the health check run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckKey")
    private final String healthCheckKey;

    /**
     * Identifier of the health check run.
     * @return the value
     **/
    public String getHealthCheckKey() {
        return healthCheckKey;
    }

    /**
     * OCID of the instance related to the test.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * OCID of the instance related to the test.
     * @return the value
     **/
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Shape of the instance under test.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Shape of the instance under test.
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * Test type provided by the diagnosis payload.
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
     * Test type provided by the diagnosis payload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("testType")
    private final TestType testType;

    /**
     * Test type provided by the diagnosis payload.
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
        sb.append("Metadata(");
        sb.append("super=").append(super.toString());
        sb.append("hostId=").append(String.valueOf(this.hostId));
        sb.append(", healthCheckKey=").append(String.valueOf(this.healthCheckKey));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", testType=").append(String.valueOf(this.testType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Metadata)) {
            return false;
        }

        Metadata other = (Metadata) o;
        return java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.healthCheckKey, other.healthCheckKey)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.testType, other.testType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result =
                (result * PRIME)
                        + (this.healthCheckKey == null ? 43 : this.healthCheckKey.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.testType == null ? 43 : this.testType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
