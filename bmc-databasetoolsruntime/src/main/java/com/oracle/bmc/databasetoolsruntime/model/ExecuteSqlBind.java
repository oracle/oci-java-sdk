/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Bind information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExecuteSqlBind.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExecuteSqlBind
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dataType",
        "name",
        "index",
        "mode",
        "values",
        "results",
        "plsqlTableTypeDetails"
    })
    public ExecuteSqlBind(
            String dataType,
            String name,
            Integer index,
            Mode mode,
            java.util.List<Object> values,
            java.util.List<Object> results,
            ExecuteSqlBindPlsqlTable plsqlTableTypeDetails) {
        super();
        this.dataType = dataType;
        this.name = name;
        this.index = index;
        this.mode = mode;
        this.values = values;
        this.results = results;
        this.plsqlTableTypeDetails = plsqlTableTypeDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The data type. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * The data type.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** Name of the bind. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the bind.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Index of the bind. Index of the first bind is 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("index")
        private Integer index;

        /**
         * Index of the bind. Index of the first bind is 1.
         *
         * @param index the value to set
         * @return this builder
         */
        public Builder index(Integer index) {
            this.index = index;
            this.__explicitlySet__.add("index");
            return this;
        }
        /** The mode in which the bind is used. */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        /**
         * The mode in which the bind is used.
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /** values */
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<Object> values;

        /**
         * values
         *
         * @param values the value to set
         * @return this builder
         */
        public Builder values(java.util.List<Object> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }
        /** results */
        @com.fasterxml.jackson.annotation.JsonProperty("results")
        private java.util.List<Object> results;

        /**
         * results
         *
         * @param results the value to set
         * @return this builder
         */
        public Builder results(java.util.List<Object> results) {
            this.results = results;
            this.__explicitlySet__.add("results");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("plsqlTableTypeDetails")
        private ExecuteSqlBindPlsqlTable plsqlTableTypeDetails;

        public Builder plsqlTableTypeDetails(ExecuteSqlBindPlsqlTable plsqlTableTypeDetails) {
            this.plsqlTableTypeDetails = plsqlTableTypeDetails;
            this.__explicitlySet__.add("plsqlTableTypeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlBind build() {
            ExecuteSqlBind model =
                    new ExecuteSqlBind(
                            this.dataType,
                            this.name,
                            this.index,
                            this.mode,
                            this.values,
                            this.results,
                            this.plsqlTableTypeDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlBind model) {
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("index")) {
                this.index(model.getIndex());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("results")) {
                this.results(model.getResults());
            }
            if (model.wasPropertyExplicitlySet("plsqlTableTypeDetails")) {
                this.plsqlTableTypeDetails(model.getPlsqlTableTypeDetails());
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

    /** The data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * The data type.
     *
     * @return the value
     */
    public String getDataType() {
        return dataType;
    }

    /** Name of the bind. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the bind.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Index of the bind. Index of the first bind is 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("index")
    private final Integer index;

    /**
     * Index of the bind. Index of the first bind is 1.
     *
     * @return the value
     */
    public Integer getIndex() {
        return index;
    }

    /** The mode in which the bind is used. */
    public enum Mode implements com.oracle.bmc.http.internal.BmcEnum {
        In("IN"),
        Inout("INOUT"),
        Out("OUT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Mode.class);

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Mode', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The mode in which the bind is used. */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    /**
     * The mode in which the bind is used.
     *
     * @return the value
     */
    public Mode getMode() {
        return mode;
    }

    /** values */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<Object> values;

    /**
     * values
     *
     * @return the value
     */
    public java.util.List<Object> getValues() {
        return values;
    }

    /** results */
    @com.fasterxml.jackson.annotation.JsonProperty("results")
    private final java.util.List<Object> results;

    /**
     * results
     *
     * @return the value
     */
    public java.util.List<Object> getResults() {
        return results;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("plsqlTableTypeDetails")
    private final ExecuteSqlBindPlsqlTable plsqlTableTypeDetails;

    public ExecuteSqlBindPlsqlTable getPlsqlTableTypeDetails() {
        return plsqlTableTypeDetails;
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
        sb.append("ExecuteSqlBind(");
        sb.append("super=").append(super.toString());
        sb.append("dataType=").append(String.valueOf(this.dataType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", index=").append(String.valueOf(this.index));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", results=").append(String.valueOf(this.results));
        sb.append(", plsqlTableTypeDetails=").append(String.valueOf(this.plsqlTableTypeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlBind)) {
            return false;
        }

        ExecuteSqlBind other = (ExecuteSqlBind) o;
        return java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.index, other.index)
                && java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.results, other.results)
                && java.util.Objects.equals(this.plsqlTableTypeDetails, other.plsqlTableTypeDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.index == null ? 43 : this.index.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result = (result * PRIME) + (this.results == null ? 43 : this.results.hashCode());
        result =
                (result * PRIME)
                        + (this.plsqlTableTypeDetails == null
                                ? 43
                                : this.plsqlTableTypeDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
