/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Named capture value.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NamedCaptureValue.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NamedCaptureValue extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subSequence",
        "subSequenceStartIndex",
        "subSequenceEndIndex"
    })
    public NamedCaptureValue(
            String subSequence, Integer subSequenceStartIndex, Integer subSequenceEndIndex) {
        super();
        this.subSequence = subSequence;
        this.subSequenceStartIndex = subSequenceStartIndex;
        this.subSequenceEndIndex = subSequenceEndIndex;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The subSequence.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subSequence")
        private String subSequence;

        /**
         * The subSequence.
         * @param subSequence the value to set
         * @return this builder
         **/
        public Builder subSequence(String subSequence) {
            this.subSequence = subSequence;
            this.__explicitlySet__.add("subSequence");
            return this;
        }
        /**
         * The subSequence start index.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subSequenceStartIndex")
        private Integer subSequenceStartIndex;

        /**
         * The subSequence start index.
         * @param subSequenceStartIndex the value to set
         * @return this builder
         **/
        public Builder subSequenceStartIndex(Integer subSequenceStartIndex) {
            this.subSequenceStartIndex = subSequenceStartIndex;
            this.__explicitlySet__.add("subSequenceStartIndex");
            return this;
        }
        /**
         * The subSequence end index.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subSequenceEndIndex")
        private Integer subSequenceEndIndex;

        /**
         * The subSequence end index.
         * @param subSequenceEndIndex the value to set
         * @return this builder
         **/
        public Builder subSequenceEndIndex(Integer subSequenceEndIndex) {
            this.subSequenceEndIndex = subSequenceEndIndex;
            this.__explicitlySet__.add("subSequenceEndIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NamedCaptureValue build() {
            NamedCaptureValue model =
                    new NamedCaptureValue(
                            this.subSequence, this.subSequenceStartIndex, this.subSequenceEndIndex);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NamedCaptureValue model) {
            if (model.wasPropertyExplicitlySet("subSequence")) {
                this.subSequence(model.getSubSequence());
            }
            if (model.wasPropertyExplicitlySet("subSequenceStartIndex")) {
                this.subSequenceStartIndex(model.getSubSequenceStartIndex());
            }
            if (model.wasPropertyExplicitlySet("subSequenceEndIndex")) {
                this.subSequenceEndIndex(model.getSubSequenceEndIndex());
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
     * The subSequence.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subSequence")
    private final String subSequence;

    /**
     * The subSequence.
     * @return the value
     **/
    public String getSubSequence() {
        return subSequence;
    }

    /**
     * The subSequence start index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subSequenceStartIndex")
    private final Integer subSequenceStartIndex;

    /**
     * The subSequence start index.
     * @return the value
     **/
    public Integer getSubSequenceStartIndex() {
        return subSequenceStartIndex;
    }

    /**
     * The subSequence end index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subSequenceEndIndex")
    private final Integer subSequenceEndIndex;

    /**
     * The subSequence end index.
     * @return the value
     **/
    public Integer getSubSequenceEndIndex() {
        return subSequenceEndIndex;
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
        sb.append("NamedCaptureValue(");
        sb.append("super=").append(super.toString());
        sb.append("subSequence=").append(String.valueOf(this.subSequence));
        sb.append(", subSequenceStartIndex=").append(String.valueOf(this.subSequenceStartIndex));
        sb.append(", subSequenceEndIndex=").append(String.valueOf(this.subSequenceEndIndex));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NamedCaptureValue)) {
            return false;
        }

        NamedCaptureValue other = (NamedCaptureValue) o;
        return java.util.Objects.equals(this.subSequence, other.subSequence)
                && java.util.Objects.equals(this.subSequenceStartIndex, other.subSequenceStartIndex)
                && java.util.Objects.equals(this.subSequenceEndIndex, other.subSequenceEndIndex)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subSequence == null ? 43 : this.subSequence.hashCode());
        result =
                (result * PRIME)
                        + (this.subSequenceStartIndex == null
                                ? 43
                                : this.subSequenceStartIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.subSequenceEndIndex == null
                                ? 43
                                : this.subSequenceEndIndex.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
