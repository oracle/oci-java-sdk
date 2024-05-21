/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * The execution output of a statement.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StatementOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StatementOutput extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"data", "status", "errorName", "errorValue", "traceback"})
    public StatementOutput(
            StatementOutputData data,
            Status status,
            String errorName,
            String errorValue,
            java.util.List<String> traceback) {
        super();
        this.data = data;
        this.status = status;
        this.errorName = errorName;
        this.errorValue = errorValue;
        this.traceback = traceback;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private StatementOutputData data;

        public Builder data(StatementOutputData data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }
        /**
         * Status of the statement output.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status of the statement output.
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The name of the error in the statement output.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorName")
        private String errorName;

        /**
         * The name of the error in the statement output.
         *
         * @param errorName the value to set
         * @return this builder
         **/
        public Builder errorName(String errorName) {
            this.errorName = errorName;
            this.__explicitlySet__.add("errorName");
            return this;
        }
        /**
         * The value of the error in the statement output.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorValue")
        private String errorValue;

        /**
         * The value of the error in the statement output.
         *
         * @param errorValue the value to set
         * @return this builder
         **/
        public Builder errorValue(String errorValue) {
            this.errorValue = errorValue;
            this.__explicitlySet__.add("errorValue");
            return this;
        }
        /**
         * The traceback of the statement output.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("traceback")
        private java.util.List<String> traceback;

        /**
         * The traceback of the statement output.
         *
         * @param traceback the value to set
         * @return this builder
         **/
        public Builder traceback(java.util.List<String> traceback) {
            this.traceback = traceback;
            this.__explicitlySet__.add("traceback");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StatementOutput build() {
            StatementOutput model =
                    new StatementOutput(
                            this.data,
                            this.status,
                            this.errorName,
                            this.errorValue,
                            this.traceback);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StatementOutput model) {
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("errorName")) {
                this.errorName(model.getErrorName());
            }
            if (model.wasPropertyExplicitlySet("errorValue")) {
                this.errorValue(model.getErrorValue());
            }
            if (model.wasPropertyExplicitlySet("traceback")) {
                this.traceback(model.getTraceback());
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

    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final StatementOutputData data;

    public StatementOutputData getData() {
        return data;
    }

    /**
     * Status of the statement output.
     *
     **/
    public enum Status {
        Ok("OK"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the statement output.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status of the statement output.
     *
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The name of the error in the statement output.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorName")
    private final String errorName;

    /**
     * The name of the error in the statement output.
     *
     * @return the value
     **/
    public String getErrorName() {
        return errorName;
    }

    /**
     * The value of the error in the statement output.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorValue")
    private final String errorValue;

    /**
     * The value of the error in the statement output.
     *
     * @return the value
     **/
    public String getErrorValue() {
        return errorValue;
    }

    /**
     * The traceback of the statement output.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("traceback")
    private final java.util.List<String> traceback;

    /**
     * The traceback of the statement output.
     *
     * @return the value
     **/
    public java.util.List<String> getTraceback() {
        return traceback;
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
        sb.append("StatementOutput(");
        sb.append("super=").append(super.toString());
        sb.append("data=").append(String.valueOf(this.data));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", errorName=").append(String.valueOf(this.errorName));
        sb.append(", errorValue=").append(String.valueOf(this.errorValue));
        sb.append(", traceback=").append(String.valueOf(this.traceback));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StatementOutput)) {
            return false;
        }

        StatementOutput other = (StatementOutput) o;
        return java.util.Objects.equals(this.data, other.data)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.errorName, other.errorName)
                && java.util.Objects.equals(this.errorValue, other.errorValue)
                && java.util.Objects.equals(this.traceback, other.traceback)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.errorName == null ? 43 : this.errorName.hashCode());
        result = (result * PRIME) + (this.errorValue == null ? 43 : this.errorValue.hashCode());
        result = (result * PRIME) + (this.traceback == null ? 43 : this.traceback.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
