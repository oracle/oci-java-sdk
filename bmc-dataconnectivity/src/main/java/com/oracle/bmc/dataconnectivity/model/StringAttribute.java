/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * A summary of profiling results of a specefic attribute.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StringAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StringAttribute extends AttributeProfileResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private ProfileStat min;

        public Builder min(ProfileStat min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private ProfileStat max;

        public Builder max(ProfileStat max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nullCount")
        private ProfileStat nullCount;

        public Builder nullCount(ProfileStat nullCount) {
            this.nullCount = nullCount;
            this.__explicitlySet__.add("nullCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("distinctCount")
        private ProfileStat distinctCount;

        public Builder distinctCount(ProfileStat distinctCount) {
            this.distinctCount = distinctCount;
            this.__explicitlySet__.add("distinctCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uniqueCount")
        private ProfileStat uniqueCount;

        public Builder uniqueCount(ProfileStat uniqueCount) {
            this.uniqueCount = uniqueCount;
            this.__explicitlySet__.add("uniqueCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("duplicateCount")
        private ProfileStat duplicateCount;

        public Builder duplicateCount(ProfileStat duplicateCount) {
            this.duplicateCount = duplicateCount;
            this.__explicitlySet__.add("duplicateCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueFrequencies")
        private java.util.List<ObjectFreqStat> valueFrequencies;

        public Builder valueFrequencies(java.util.List<ObjectFreqStat> valueFrequencies) {
            this.valueFrequencies = valueFrequencies;
            this.__explicitlySet__.add("valueFrequencies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minLength")
        private ProfileStat minLength;

        public Builder minLength(ProfileStat minLength) {
            this.minLength = minLength;
            this.__explicitlySet__.add("minLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
        private ProfileStat maxLength;

        public Builder maxLength(ProfileStat maxLength) {
            this.maxLength = maxLength;
            this.__explicitlySet__.add("maxLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("meanLength")
        private ProfileStat meanLength;

        public Builder meanLength(ProfileStat meanLength) {
            this.meanLength = meanLength;
            this.__explicitlySet__.add("meanLength");
            return this;
        }
        /**
         * Pattern frequencies for the column as described in the profile config.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patternFrequencies")
        private java.util.List<ObjectFreqStat> patternFrequencies;

        /**
         * Pattern frequencies for the column as described in the profile config.
         * @param patternFrequencies the value to set
         * @return this builder
         **/
        public Builder patternFrequencies(java.util.List<ObjectFreqStat> patternFrequencies) {
            this.patternFrequencies = patternFrequencies;
            this.__explicitlySet__.add("patternFrequencies");
            return this;
        }
        /**
         * Inferred DataType for the column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inferredDataTypes")
        private java.util.List<DataTypeStat> inferredDataTypes;

        /**
         * Inferred DataType for the column.
         * @param inferredDataTypes the value to set
         * @return this builder
         **/
        public Builder inferredDataTypes(java.util.List<DataTypeStat> inferredDataTypes) {
            this.inferredDataTypes = inferredDataTypes;
            this.__explicitlySet__.add("inferredDataTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StringAttribute build() {
            StringAttribute model =
                    new StringAttribute(
                            this.name,
                            this.min,
                            this.max,
                            this.nullCount,
                            this.distinctCount,
                            this.uniqueCount,
                            this.duplicateCount,
                            this.valueFrequencies,
                            this.minLength,
                            this.maxLength,
                            this.meanLength,
                            this.patternFrequencies,
                            this.inferredDataTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StringAttribute model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("min")) {
                this.min(model.getMin());
            }
            if (model.wasPropertyExplicitlySet("max")) {
                this.max(model.getMax());
            }
            if (model.wasPropertyExplicitlySet("nullCount")) {
                this.nullCount(model.getNullCount());
            }
            if (model.wasPropertyExplicitlySet("distinctCount")) {
                this.distinctCount(model.getDistinctCount());
            }
            if (model.wasPropertyExplicitlySet("uniqueCount")) {
                this.uniqueCount(model.getUniqueCount());
            }
            if (model.wasPropertyExplicitlySet("duplicateCount")) {
                this.duplicateCount(model.getDuplicateCount());
            }
            if (model.wasPropertyExplicitlySet("valueFrequencies")) {
                this.valueFrequencies(model.getValueFrequencies());
            }
            if (model.wasPropertyExplicitlySet("minLength")) {
                this.minLength(model.getMinLength());
            }
            if (model.wasPropertyExplicitlySet("maxLength")) {
                this.maxLength(model.getMaxLength());
            }
            if (model.wasPropertyExplicitlySet("meanLength")) {
                this.meanLength(model.getMeanLength());
            }
            if (model.wasPropertyExplicitlySet("patternFrequencies")) {
                this.patternFrequencies(model.getPatternFrequencies());
            }
            if (model.wasPropertyExplicitlySet("inferredDataTypes")) {
                this.inferredDataTypes(model.getInferredDataTypes());
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

    @Deprecated
    public StringAttribute(
            String name,
            ProfileStat min,
            ProfileStat max,
            ProfileStat nullCount,
            ProfileStat distinctCount,
            ProfileStat uniqueCount,
            ProfileStat duplicateCount,
            java.util.List<ObjectFreqStat> valueFrequencies,
            ProfileStat minLength,
            ProfileStat maxLength,
            ProfileStat meanLength,
            java.util.List<ObjectFreqStat> patternFrequencies,
            java.util.List<DataTypeStat> inferredDataTypes) {
        super(
                name,
                min,
                max,
                nullCount,
                distinctCount,
                uniqueCount,
                duplicateCount,
                valueFrequencies);
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.meanLength = meanLength;
        this.patternFrequencies = patternFrequencies;
        this.inferredDataTypes = inferredDataTypes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("minLength")
    private final ProfileStat minLength;

    public ProfileStat getMinLength() {
        return minLength;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
    private final ProfileStat maxLength;

    public ProfileStat getMaxLength() {
        return maxLength;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("meanLength")
    private final ProfileStat meanLength;

    public ProfileStat getMeanLength() {
        return meanLength;
    }

    /**
     * Pattern frequencies for the column as described in the profile config.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternFrequencies")
    private final java.util.List<ObjectFreqStat> patternFrequencies;

    /**
     * Pattern frequencies for the column as described in the profile config.
     * @return the value
     **/
    public java.util.List<ObjectFreqStat> getPatternFrequencies() {
        return patternFrequencies;
    }

    /**
     * Inferred DataType for the column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inferredDataTypes")
    private final java.util.List<DataTypeStat> inferredDataTypes;

    /**
     * Inferred DataType for the column.
     * @return the value
     **/
    public java.util.List<DataTypeStat> getInferredDataTypes() {
        return inferredDataTypes;
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
        sb.append("StringAttribute(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", minLength=").append(String.valueOf(this.minLength));
        sb.append(", maxLength=").append(String.valueOf(this.maxLength));
        sb.append(", meanLength=").append(String.valueOf(this.meanLength));
        sb.append(", patternFrequencies=").append(String.valueOf(this.patternFrequencies));
        sb.append(", inferredDataTypes=").append(String.valueOf(this.inferredDataTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StringAttribute)) {
            return false;
        }

        StringAttribute other = (StringAttribute) o;
        return java.util.Objects.equals(this.minLength, other.minLength)
                && java.util.Objects.equals(this.maxLength, other.maxLength)
                && java.util.Objects.equals(this.meanLength, other.meanLength)
                && java.util.Objects.equals(this.patternFrequencies, other.patternFrequencies)
                && java.util.Objects.equals(this.inferredDataTypes, other.inferredDataTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.minLength == null ? 43 : this.minLength.hashCode());
        result = (result * PRIME) + (this.maxLength == null ? 43 : this.maxLength.hashCode());
        result = (result * PRIME) + (this.meanLength == null ? 43 : this.meanLength.hashCode());
        result =
                (result * PRIME)
                        + (this.patternFrequencies == null
                                ? 43
                                : this.patternFrequencies.hashCode());
        result =
                (result * PRIME)
                        + (this.inferredDataTypes == null ? 43 : this.inferredDataTypes.hashCode());
        return result;
    }
}
