/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about key range.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = KeyRangePartitionConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KeyRangePartitionConfig extends PartitionConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The partition number for the key range.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partitionNumber")
        private Integer partitionNumber;

        /**
         * The partition number for the key range.
         * @param partitionNumber the value to set
         * @return this builder
         **/
        public Builder partitionNumber(Integer partitionNumber) {
            this.partitionNumber = partitionNumber;
            this.__explicitlySet__.add("partitionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyRange")
        private KeyRange keyRange;

        public Builder keyRange(KeyRange keyRange) {
            this.keyRange = keyRange;
            this.__explicitlySet__.add("keyRange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyRangePartitionConfig build() {
            KeyRangePartitionConfig model =
                    new KeyRangePartitionConfig(this.partitionNumber, this.keyRange);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyRangePartitionConfig model) {
            if (model.wasPropertyExplicitlySet("partitionNumber")) {
                this.partitionNumber(model.getPartitionNumber());
            }
            if (model.wasPropertyExplicitlySet("keyRange")) {
                this.keyRange(model.getKeyRange());
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
    public KeyRangePartitionConfig(Integer partitionNumber, KeyRange keyRange) {
        super();
        this.partitionNumber = partitionNumber;
        this.keyRange = keyRange;
    }

    /**
     * The partition number for the key range.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionNumber")
    private final Integer partitionNumber;

    /**
     * The partition number for the key range.
     * @return the value
     **/
    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keyRange")
    private final KeyRange keyRange;

    public KeyRange getKeyRange() {
        return keyRange;
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
        sb.append("KeyRangePartitionConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", partitionNumber=").append(String.valueOf(this.partitionNumber));
        sb.append(", keyRange=").append(String.valueOf(this.keyRange));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyRangePartitionConfig)) {
            return false;
        }

        KeyRangePartitionConfig other = (KeyRangePartitionConfig) o;
        return java.util.Objects.equals(this.partitionNumber, other.partitionNumber)
                && java.util.Objects.equals(this.keyRange, other.keyRange)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.partitionNumber == null ? 43 : this.partitionNumber.hashCode());
        result = (result * PRIME) + (this.keyRange == null ? 43 : this.keyRange.hashCode());
        return result;
    }
}
