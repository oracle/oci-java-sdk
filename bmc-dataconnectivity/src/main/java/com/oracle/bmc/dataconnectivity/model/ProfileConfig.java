/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Profiling configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProfileConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ProfileConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "attributes",
        "functions",
        "topNValFreq",
        "patternThreshold",
        "dataTypeThreshold"
    })
    public ProfileConfig(
            java.util.List<String> attributes,
            java.util.List<Functions> functions,
            Integer topNValFreq,
            Integer patternThreshold,
            Integer dataTypeThreshold) {
        super();
        this.attributes = attributes;
        this.functions = functions;
        this.topNValFreq = topNValFreq;
        this.patternThreshold = patternThreshold;
        this.dataTypeThreshold = dataTypeThreshold;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Array of column names to profile. If empty, all the columns in the entity are profiled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<String> attributes;

        /**
         * Array of column names to profile. If empty, all the columns in the entity are profiled.
         *
         * @param attributes the value to set
         * @return this builder
         */
        public Builder attributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }
        /**
         * Array of enum strings to decide which profile functions to run. If empty, all the
         * supported functions are run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("functions")
        private java.util.List<Functions> functions;

        /**
         * Array of enum strings to decide which profile functions to run. If empty, all the
         * supported functions are run.
         *
         * @param functions the value to set
         * @return this builder
         */
        public Builder functions(java.util.List<Functions> functions) {
            this.functions = functions;
            this.__explicitlySet__.add("functions");
            return this;
        }
        /**
         * The maximum number of value frequencies to return per column. The VFs are sorted
         * descending on frequency, and ascending on value, and then topN are returned and rest
         * discarded.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("topNValFreq")
        private Integer topNValFreq;

        /**
         * The maximum number of value frequencies to return per column. The VFs are sorted
         * descending on frequency, and ascending on value, and then topN are returned and rest
         * discarded.
         *
         * @param topNValFreq the value to set
         * @return this builder
         */
        public Builder topNValFreq(Integer topNValFreq) {
            this.topNValFreq = topNValFreq;
            this.__explicitlySet__.add("topNValFreq");
            return this;
        }
        /**
         * A pattern has to qualify at least this percentage threshold to be considered a pattern on
         * its own. Patterns that do not qualify are clubbed together into 'Others' pattern.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patternThreshold")
        private Integer patternThreshold;

        /**
         * A pattern has to qualify at least this percentage threshold to be considered a pattern on
         * its own. Patterns that do not qualify are clubbed together into 'Others' pattern.
         *
         * @param patternThreshold the value to set
         * @return this builder
         */
        public Builder patternThreshold(Integer patternThreshold) {
            this.patternThreshold = patternThreshold;
            this.__explicitlySet__.add("patternThreshold");
            return this;
        }
        /**
         * A data type has to qualify at least this percentage threshold to be considered an
         * inferred data type for a column.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataTypeThreshold")
        private Integer dataTypeThreshold;

        /**
         * A data type has to qualify at least this percentage threshold to be considered an
         * inferred data type for a column.
         *
         * @param dataTypeThreshold the value to set
         * @return this builder
         */
        public Builder dataTypeThreshold(Integer dataTypeThreshold) {
            this.dataTypeThreshold = dataTypeThreshold;
            this.__explicitlySet__.add("dataTypeThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProfileConfig build() {
            ProfileConfig model =
                    new ProfileConfig(
                            this.attributes,
                            this.functions,
                            this.topNValFreq,
                            this.patternThreshold,
                            this.dataTypeThreshold);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProfileConfig model) {
            if (model.wasPropertyExplicitlySet("attributes")) {
                this.attributes(model.getAttributes());
            }
            if (model.wasPropertyExplicitlySet("functions")) {
                this.functions(model.getFunctions());
            }
            if (model.wasPropertyExplicitlySet("topNValFreq")) {
                this.topNValFreq(model.getTopNValFreq());
            }
            if (model.wasPropertyExplicitlySet("patternThreshold")) {
                this.patternThreshold(model.getPatternThreshold());
            }
            if (model.wasPropertyExplicitlySet("dataTypeThreshold")) {
                this.dataTypeThreshold(model.getDataTypeThreshold());
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

    /** Array of column names to profile. If empty, all the columns in the entity are profiled. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.List<String> attributes;

    /**
     * Array of column names to profile. If empty, all the columns in the entity are profiled.
     *
     * @return the value
     */
    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /** */
    public enum Functions implements com.oracle.bmc.http.internal.BmcEnum {
        AttributeCount("ATTRIBUTE_COUNT"),
        RowCount("ROW_COUNT"),
        DataType("DATA_TYPE"),
        DistinctCount("DISTINCT_COUNT"),
        DuplicateCount("DUPLICATE_COUNT"),
        Histogram("HISTOGRAM"),
        Max("MAX"),
        MaxLength("MAX_LENGTH"),
        Mean("MEAN"),
        MeanLength("MEAN_LENGTH"),
        Median("MEDIAN"),
        Min("MIN"),
        MinLength("MIN_LENGTH"),
        NullCount("NULL_COUNT"),
        Outlier("OUTLIER"),
        Pattern("PATTERN"),
        StandardDeviation("STANDARD_DEVIATION"),
        UniqueCount("UNIQUE_COUNT"),
        Variance("VARIANCE"),
        ValueFrequency("VALUE_FREQUENCY"),
        ;

        private final String value;
        private static java.util.Map<String, Functions> map;

        static {
            map = new java.util.HashMap<>();
            for (Functions v : Functions.values()) {
                map.put(v.getValue(), v);
            }
        }

        Functions(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Functions create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Functions: " + key);
        }
    };
    /**
     * Array of enum strings to decide which profile functions to run. If empty, all the supported
     * functions are run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("functions")
    private final java.util.List<Functions> functions;

    /**
     * Array of enum strings to decide which profile functions to run. If empty, all the supported
     * functions are run.
     *
     * @return the value
     */
    public java.util.List<Functions> getFunctions() {
        return functions;
    }

    /**
     * The maximum number of value frequencies to return per column. The VFs are sorted descending
     * on frequency, and ascending on value, and then topN are returned and rest discarded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topNValFreq")
    private final Integer topNValFreq;

    /**
     * The maximum number of value frequencies to return per column. The VFs are sorted descending
     * on frequency, and ascending on value, and then topN are returned and rest discarded.
     *
     * @return the value
     */
    public Integer getTopNValFreq() {
        return topNValFreq;
    }

    /**
     * A pattern has to qualify at least this percentage threshold to be considered a pattern on its
     * own. Patterns that do not qualify are clubbed together into 'Others' pattern.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patternThreshold")
    private final Integer patternThreshold;

    /**
     * A pattern has to qualify at least this percentage threshold to be considered a pattern on its
     * own. Patterns that do not qualify are clubbed together into 'Others' pattern.
     *
     * @return the value
     */
    public Integer getPatternThreshold() {
        return patternThreshold;
    }

    /**
     * A data type has to qualify at least this percentage threshold to be considered an inferred
     * data type for a column.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataTypeThreshold")
    private final Integer dataTypeThreshold;

    /**
     * A data type has to qualify at least this percentage threshold to be considered an inferred
     * data type for a column.
     *
     * @return the value
     */
    public Integer getDataTypeThreshold() {
        return dataTypeThreshold;
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
        sb.append("ProfileConfig(");
        sb.append("super=").append(super.toString());
        sb.append("attributes=").append(String.valueOf(this.attributes));
        sb.append(", functions=").append(String.valueOf(this.functions));
        sb.append(", topNValFreq=").append(String.valueOf(this.topNValFreq));
        sb.append(", patternThreshold=").append(String.valueOf(this.patternThreshold));
        sb.append(", dataTypeThreshold=").append(String.valueOf(this.dataTypeThreshold));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProfileConfig)) {
            return false;
        }

        ProfileConfig other = (ProfileConfig) o;
        return java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.functions, other.functions)
                && java.util.Objects.equals(this.topNValFreq, other.topNValFreq)
                && java.util.Objects.equals(this.patternThreshold, other.patternThreshold)
                && java.util.Objects.equals(this.dataTypeThreshold, other.dataTypeThreshold)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result = (result * PRIME) + (this.functions == null ? 43 : this.functions.hashCode());
        result = (result * PRIME) + (this.topNValFreq == null ? 43 : this.topNValFreq.hashCode());
        result =
                (result * PRIME)
                        + (this.patternThreshold == null ? 43 : this.patternThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.dataTypeThreshold == null ? 43 : this.dataTypeThreshold.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
