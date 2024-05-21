/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * A summary of a log associated with a particular run.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RunLogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RunLogSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "runId",
        "sizeInBytes",
        "source",
        "timeCreated",
        "type"
    })
    public RunLogSummary(
            String name,
            String runId,
            Long sizeInBytes,
            Source source,
            java.util.Date timeCreated,
            Type type) {
        super();
        this.name = name;
        this.runId = runId;
        this.sizeInBytes = sizeInBytes;
        this.source = source;
        this.timeCreated = timeCreated;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the log.
         * Example: spark_driver_stderr_20190917T114000Z.log.gz
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the log.
         * Example: spark_driver_stderr_20190917T114000Z.log.gz
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The runId associated with the log.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("runId")
        private String runId;

        /**
         * The runId associated with the log.
         *
         * @param runId the value to set
         * @return this builder
         **/
        public Builder runId(String runId) {
            this.runId = runId;
            this.__explicitlySet__.add("runId");
            return this;
        }
        /**
         * The size of the object in bytes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * The size of the object in bytes.
         *
         * @param sizeInBytes the value to set
         * @return this builder
         **/
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /**
         * The source of the log such as driver and executor.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private Source source;

        /**
         * The source of the log such as driver and executor.
         *
         * @param source the value to set
         * @return this builder
         **/
        public Builder source(Source source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * The date and time the object was created, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the object was created, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The type of log such as stdout and stderr.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of log such as stdout and stderr.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunLogSummary build() {
            RunLogSummary model =
                    new RunLogSummary(
                            this.name,
                            this.runId,
                            this.sizeInBytes,
                            this.source,
                            this.timeCreated,
                            this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunLogSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("runId")) {
                this.runId(model.getRunId());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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
     * The name of the log.
     * Example: spark_driver_stderr_20190917T114000Z.log.gz
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the log.
     * Example: spark_driver_stderr_20190917T114000Z.log.gz
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The runId associated with the log.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("runId")
    private final String runId;

    /**
     * The runId associated with the log.
     *
     * @return the value
     **/
    public String getRunId() {
        return runId;
    }

    /**
     * The size of the object in bytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * The size of the object in bytes.
     *
     * @return the value
     **/
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * The source of the log such as driver and executor.
     *
     **/
    public enum Source {
        Application("APPLICATION"),
        Driver("DRIVER"),
        Executor("EXECUTOR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Source.class);

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Source', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The source of the log such as driver and executor.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final Source source;

    /**
     * The source of the log such as driver and executor.
     *
     * @return the value
     **/
    public Source getSource() {
        return source;
    }

    /**
     * The date and time the object was created, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the object was created, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The type of log such as stdout and stderr.
     *
     **/
    public enum Type {
        Stderr("STDERR"),
        Stdout("STDOUT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of log such as stdout and stderr.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of log such as stdout and stderr.
     *
     * @return the value
     **/
    public Type getType() {
        return type;
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
        sb.append("RunLogSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", runId=").append(String.valueOf(this.runId));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunLogSummary)) {
            return false;
        }

        RunLogSummary other = (RunLogSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.runId, other.runId)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
