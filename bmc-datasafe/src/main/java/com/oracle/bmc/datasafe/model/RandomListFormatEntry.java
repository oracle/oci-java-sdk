/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Random List masking format randomly selects values from a list of values to replace the
 * original values. To learn more, check Random List in the Data Safe documentation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RandomListFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RandomListFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A comma-separated list of values to be used to replace column values. The list can be of
         * strings, numbers, or dates. The data type of each value in the list must be compatible
         * with the data type of the column. The number of entries in the list cannot be more than
         * 999.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("randomList")
        private java.util.List<String> randomList;

        /**
         * A comma-separated list of values to be used to replace column values. The list can be of
         * strings, numbers, or dates. The data type of each value in the list must be compatible
         * with the data type of the column. The number of entries in the list cannot be more than
         * 999.
         *
         * @param randomList the value to set
         * @return this builder
         */
        public Builder randomList(java.util.List<String> randomList) {
            this.randomList = randomList;
            this.__explicitlySet__.add("randomList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RandomListFormatEntry build() {
            RandomListFormatEntry model =
                    new RandomListFormatEntry(this.description, this.randomList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RandomListFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("randomList")) {
                this.randomList(model.getRandomList());
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

    @Deprecated
    public RandomListFormatEntry(String description, java.util.List<String> randomList) {
        super(description);
        this.randomList = randomList;
    }

    /**
     * A comma-separated list of values to be used to replace column values. The list can be of
     * strings, numbers, or dates. The data type of each value in the list must be compatible with
     * the data type of the column. The number of entries in the list cannot be more than 999.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("randomList")
    private final java.util.List<String> randomList;

    /**
     * A comma-separated list of values to be used to replace column values. The list can be of
     * strings, numbers, or dates. The data type of each value in the list must be compatible with
     * the data type of the column. The number of entries in the list cannot be more than 999.
     *
     * @return the value
     */
    public java.util.List<String> getRandomList() {
        return randomList;
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
        sb.append("RandomListFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", randomList=").append(String.valueOf(this.randomList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RandomListFormatEntry)) {
            return false;
        }

        RandomListFormatEntry other = (RandomListFormatEntry) o;
        return java.util.Objects.equals(this.randomList, other.randomList) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.randomList == null ? 43 : this.randomList.hashCode());
        return result;
    }
}
