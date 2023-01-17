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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DateAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DateAttribute extends AttributeProfileResult {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DateAttribute build() {
            DateAttribute model =
                    new DateAttribute(
                            this.name,
                            this.min,
                            this.max,
                            this.nullCount,
                            this.distinctCount,
                            this.uniqueCount,
                            this.duplicateCount,
                            this.valueFrequencies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DateAttribute model) {
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
    public DateAttribute(
            String name,
            ProfileStat min,
            ProfileStat max,
            ProfileStat nullCount,
            ProfileStat distinctCount,
            ProfileStat uniqueCount,
            ProfileStat duplicateCount,
            java.util.List<ObjectFreqStat> valueFrequencies) {
        super(
                name,
                min,
                max,
                nullCount,
                distinctCount,
                uniqueCount,
                duplicateCount,
                valueFrequencies);
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
        sb.append("DateAttribute(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DateAttribute)) {
            return false;
        }

        DateAttribute other = (DateAttribute) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
