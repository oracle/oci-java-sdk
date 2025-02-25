/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The result of the connectivity test performed between the GoldenGate deployment and the associated database / service.
 * The 'error' property is deprecated and will not contain values in the future. So, the error(s) will be returned in just the 'errors' property.
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
    builder = TestConnectionAssignmentResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TestConnectionAssignmentResult
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resultType", "error", "errors"})
    public TestConnectionAssignmentResult(
            ResultType resultType,
            TestConnectionAssignmentError error,
            java.util.List<TestConnectionAssignmentError> errors) {
        super();
        this.resultType = resultType;
        this.error = error;
        this.errors = errors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of the result (i.e. Success, Failure or Timeout).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resultType")
        private ResultType resultType;

        /**
         * Type of the result (i.e. Success, Failure or Timeout).
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
        private TestConnectionAssignmentError error;

        public Builder error(TestConnectionAssignmentError error) {
            this.error = error;
            this.__explicitlySet__.add("error");
            return this;
        }
        /**
         * List of test connection assignment error objects.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<TestConnectionAssignmentError> errors;

        /**
         * List of test connection assignment error objects.
         *
         * @param errors the value to set
         * @return this builder
         **/
        public Builder errors(java.util.List<TestConnectionAssignmentError> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TestConnectionAssignmentResult build() {
            TestConnectionAssignmentResult model =
                    new TestConnectionAssignmentResult(this.resultType, this.error, this.errors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestConnectionAssignmentResult model) {
            if (model.wasPropertyExplicitlySet("resultType")) {
                this.resultType(model.getResultType());
            }
            if (model.wasPropertyExplicitlySet("error")) {
                this.error(model.getError());
            }
            if (model.wasPropertyExplicitlySet("errors")) {
                this.errors(model.getErrors());
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
     * Type of the result (i.e. Success, Failure or Timeout).
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
     * Type of the result (i.e. Success, Failure or Timeout).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resultType")
    private final ResultType resultType;

    /**
     * Type of the result (i.e. Success, Failure or Timeout).
     *
     * @return the value
     **/
    public ResultType getResultType() {
        return resultType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final TestConnectionAssignmentError error;

    public TestConnectionAssignmentError getError() {
        return error;
    }

    /**
     * List of test connection assignment error objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<TestConnectionAssignmentError> errors;

    /**
     * List of test connection assignment error objects.
     *
     * @return the value
     **/
    public java.util.List<TestConnectionAssignmentError> getErrors() {
        return errors;
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
        sb.append("TestConnectionAssignmentResult(");
        sb.append("super=").append(super.toString());
        sb.append("resultType=").append(String.valueOf(this.resultType));
        sb.append(", error=").append(String.valueOf(this.error));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestConnectionAssignmentResult)) {
            return false;
        }

        TestConnectionAssignmentResult other = (TestConnectionAssignmentResult) o;
        return java.util.Objects.equals(this.resultType, other.resultType)
                && java.util.Objects.equals(this.error, other.error)
                && java.util.Objects.equals(this.errors, other.errors)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resultType == null ? 43 : this.resultType.hashCode());
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
