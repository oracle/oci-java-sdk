/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Summary of database tools of autonomous database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DatabaseTool.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseTool extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "isEnabled", "computeCount", "maxIdleTimeInMinutes"})
    public DatabaseTool(
            Name name, Boolean isEnabled, Float computeCount, Integer maxIdleTimeInMinutes) {
        super();
        this.name = name;
        this.isEnabled = isEnabled;
        this.computeCount = computeCount;
        this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of database tool. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private Name name;

        /**
         * Name of database tool.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(Name name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Indicates whether tool is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates whether tool is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** Compute used by database tools. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Float computeCount;

        /**
         * Compute used by database tools.
         *
         * @param computeCount the value to set
         * @return this builder
         */
        public Builder computeCount(Float computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /**
         * The max idle time, in minutes, after which the VM used by database tools will be
         * terminated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxIdleTimeInMinutes")
        private Integer maxIdleTimeInMinutes;

        /**
         * The max idle time, in minutes, after which the VM used by database tools will be
         * terminated.
         *
         * @param maxIdleTimeInMinutes the value to set
         * @return this builder
         */
        public Builder maxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
            this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
            this.__explicitlySet__.add("maxIdleTimeInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseTool build() {
            DatabaseTool model =
                    new DatabaseTool(
                            this.name,
                            this.isEnabled,
                            this.computeCount,
                            this.maxIdleTimeInMinutes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseTool model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("maxIdleTimeInMinutes")) {
                this.maxIdleTimeInMinutes(model.getMaxIdleTimeInMinutes());
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

    /** Name of database tool. */
    public enum Name implements com.oracle.bmc.http.internal.BmcEnum {
        Apex("APEX"),
        DatabaseActions("DATABASE_ACTIONS"),
        GraphStudio("GRAPH_STUDIO"),
        Oml("OML"),
        DataTransforms("DATA_TRANSFORMS"),
        Ords("ORDS"),
        MongodbApi("MONGODB_API"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Name.class);

        private final String value;
        private static java.util.Map<String, Name> map;

        static {
            map = new java.util.HashMap<>();
            for (Name v : Name.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Name(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Name create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Name', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** Name of database tool. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final Name name;

    /**
     * Name of database tool.
     *
     * @return the value
     */
    public Name getName() {
        return name;
    }

    /** Indicates whether tool is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates whether tool is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** Compute used by database tools. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Float computeCount;

    /**
     * Compute used by database tools.
     *
     * @return the value
     */
    public Float getComputeCount() {
        return computeCount;
    }

    /**
     * The max idle time, in minutes, after which the VM used by database tools will be terminated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxIdleTimeInMinutes")
    private final Integer maxIdleTimeInMinutes;

    /**
     * The max idle time, in minutes, after which the VM used by database tools will be terminated.
     *
     * @return the value
     */
    public Integer getMaxIdleTimeInMinutes() {
        return maxIdleTimeInMinutes;
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
        sb.append("DatabaseTool(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", maxIdleTimeInMinutes=").append(String.valueOf(this.maxIdleTimeInMinutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseTool)) {
            return false;
        }

        DatabaseTool other = (DatabaseTool) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.maxIdleTimeInMinutes, other.maxIdleTimeInMinutes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maxIdleTimeInMinutes == null
                                ? 43
                                : this.maxIdleTimeInMinutes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
