/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = AttributeProfileResult.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = StringAttribute.class,
        name = "STRING"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = NumericAttribute.class,
        name = "NUMERIC"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DateAttribute.class,
        name = "DATE_TIME"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AttributeProfileResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "min",
        "max",
        "nullCount",
        "distinctCount",
        "uniqueCount",
        "duplicateCount",
        "valueFrequencies"
    })
    protected AttributeProfileResult(
            String name,
            ProfileStat min,
            ProfileStat max,
            ProfileStat nullCount,
            ProfileStat distinctCount,
            ProfileStat uniqueCount,
            ProfileStat duplicateCount,
            java.util.List<ObjectFreqStat> valueFrequencies) {
        super();
        this.name = name;
        this.min = min;
        this.max = max;
        this.nullCount = nullCount;
        this.distinctCount = distinctCount;
        this.uniqueCount = uniqueCount;
        this.duplicateCount = duplicateCount;
        this.valueFrequencies = valueFrequencies;
    }

    /**
     * Name of attribute
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of attribute
     * @return the value
     **/
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final ProfileStat min;

    public ProfileStat getMin() {
        return min;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final ProfileStat max;

    public ProfileStat getMax() {
        return max;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nullCount")
    private final ProfileStat nullCount;

    public ProfileStat getNullCount() {
        return nullCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("distinctCount")
    private final ProfileStat distinctCount;

    public ProfileStat getDistinctCount() {
        return distinctCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("uniqueCount")
    private final ProfileStat uniqueCount;

    public ProfileStat getUniqueCount() {
        return uniqueCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("duplicateCount")
    private final ProfileStat duplicateCount;

    public ProfileStat getDuplicateCount() {
        return duplicateCount;
    }

    /**
     * Top N value frequencies for the column as described already in profile config topNValueFrequency property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueFrequencies")
    private final java.util.List<ObjectFreqStat> valueFrequencies;

    /**
     * Top N value frequencies for the column as described already in profile config topNValueFrequency property.
     * @return the value
     **/
    public java.util.List<ObjectFreqStat> getValueFrequencies() {
        return valueFrequencies;
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
        sb.append("AttributeProfileResult(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", min=").append(String.valueOf(this.min));
        sb.append(", max=").append(String.valueOf(this.max));
        sb.append(", nullCount=").append(String.valueOf(this.nullCount));
        sb.append(", distinctCount=").append(String.valueOf(this.distinctCount));
        sb.append(", uniqueCount=").append(String.valueOf(this.uniqueCount));
        sb.append(", duplicateCount=").append(String.valueOf(this.duplicateCount));
        sb.append(", valueFrequencies=").append(String.valueOf(this.valueFrequencies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttributeProfileResult)) {
            return false;
        }

        AttributeProfileResult other = (AttributeProfileResult) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.min, other.min)
                && java.util.Objects.equals(this.max, other.max)
                && java.util.Objects.equals(this.nullCount, other.nullCount)
                && java.util.Objects.equals(this.distinctCount, other.distinctCount)
                && java.util.Objects.equals(this.uniqueCount, other.uniqueCount)
                && java.util.Objects.equals(this.duplicateCount, other.duplicateCount)
                && java.util.Objects.equals(this.valueFrequencies, other.valueFrequencies);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.min == null ? 43 : this.min.hashCode());
        result = (result * PRIME) + (this.max == null ? 43 : this.max.hashCode());
        result = (result * PRIME) + (this.nullCount == null ? 43 : this.nullCount.hashCode());
        result =
                (result * PRIME)
                        + (this.distinctCount == null ? 43 : this.distinctCount.hashCode());
        result = (result * PRIME) + (this.uniqueCount == null ? 43 : this.uniqueCount.hashCode());
        result =
                (result * PRIME)
                        + (this.duplicateCount == null ? 43 : this.duplicateCount.hashCode());
        result =
                (result * PRIME)
                        + (this.valueFrequencies == null ? 43 : this.valueFrequencies.hashCode());
        return result;
    }
}
