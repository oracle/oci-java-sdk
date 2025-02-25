/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Result of the connectivity test performed on a pipeline's assigned connection.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TestPipelineConnectionResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TestPipelineConnectionResult
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resultType", "error"})
    public TestPipelineConnectionResult(ResultType resultType, TestPipelineConnectionError error) {
        super();
        this.resultType = resultType;
        this.error = error;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of result, either Succeeded, Failed, or Timed out.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resultType")
        private ResultType resultType;

        /**
         * Type of result, either Succeeded, Failed, or Timed out.
         *
         * @param resultType the value to set
         * @return this builder
         **/
        public Builder resultType(ResultType resultType) {
            this.resultType = resultType;
            this.__explicitlySet__.add("resultType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private TestPipelineConnectionError error;

        public Builder error(TestPipelineConnectionError error) {
            this.error = error;
            this.__explicitlySet__.add("error");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TestPipelineConnectionResult build() {
            TestPipelineConnectionResult model =
                    new TestPipelineConnectionResult(this.resultType, this.error);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestPipelineConnectionResult model) {
            if (model.wasPropertyExplicitlySet("resultType")) {
                this.resultType(model.getResultType());
            }
            if (model.wasPropertyExplicitlySet("error")) {
                this.error(model.getError());
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
     * Type of result, either Succeeded, Failed, or Timed out.
     *
     **/
    public enum ResultType {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        TimedOut("TIMED_OUT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResultType.class);

        private final String value;
        private static java.util.Map<String, ResultType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResultType v : ResultType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResultType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResultType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResultType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of result, either Succeeded, Failed, or Timed out.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resultType")
    private final ResultType resultType;

    /**
     * Type of result, either Succeeded, Failed, or Timed out.
     *
     * @return the value
     **/
    public ResultType getResultType() {
        return resultType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final TestPipelineConnectionError error;

    public TestPipelineConnectionError getError() {
        return error;
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
        sb.append("TestPipelineConnectionResult(");
        sb.append("super=").append(super.toString());
        sb.append("resultType=").append(String.valueOf(this.resultType));
        sb.append(", error=").append(String.valueOf(this.error));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestPipelineConnectionResult)) {
            return false;
        }

        TestPipelineConnectionResult other = (TestPipelineConnectionResult) o;
        return java.util.Objects.equals(this.resultType, other.resultType)
                && java.util.Objects.equals(this.error, other.error)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resultType == null ? 43 : this.resultType.hashCode());
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
