/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * The document incorporated in the request payload. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InlineDocumentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InlineDocumentDetails extends DocumentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Raw document data with Base64 encoding. */
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private byte[] data;

        /**
         * Raw document data with Base64 encoding.
         *
         * @param data the value to set
         * @return this builder
         */
        public Builder data(byte[] data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }
        /** The page ranges to be analysed. */
        @com.fasterxml.jackson.annotation.JsonProperty("pageRange")
        private java.util.List<String> pageRange;

        /**
         * The page ranges to be analysed.
         *
         * @param pageRange the value to set
         * @return this builder
         */
        public Builder pageRange(java.util.List<String> pageRange) {
            this.pageRange = pageRange;
            this.__explicitlySet__.add("pageRange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InlineDocumentDetails build() {
            InlineDocumentDetails model = new InlineDocumentDetails(this.data, this.pageRange);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InlineDocumentDetails model) {
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
            }
            if (model.wasPropertyExplicitlySet("pageRange")) {
                this.pageRange(model.getPageRange());
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
    public InlineDocumentDetails(byte[] data, java.util.List<String> pageRange) {
        super();
        this.data = data;
        this.pageRange = pageRange;
    }

    /** Raw document data with Base64 encoding. */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final byte[] data;

    /**
     * Raw document data with Base64 encoding.
     *
     * @return the value
     */
    public byte[] getData() {
        return data;
    }

    /** The page ranges to be analysed. */
    @com.fasterxml.jackson.annotation.JsonProperty("pageRange")
    private final java.util.List<String> pageRange;

    /**
     * The page ranges to be analysed.
     *
     * @return the value
     */
    public java.util.List<String> getPageRange() {
        return pageRange;
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
        sb.append("InlineDocumentDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", data=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.data)
                                : (String.valueOf(this.data)
                                        + (this.data != null
                                                ? " (byte[" + this.data.length + "])"
                                                : ""))));
        sb.append(", pageRange=").append(String.valueOf(this.pageRange));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InlineDocumentDetails)) {
            return false;
        }

        InlineDocumentDetails other = (InlineDocumentDetails) o;
        return java.util.Arrays.equals(this.data, other.data)
                && java.util.Objects.equals(this.pageRange, other.pageRange)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + java.util.Arrays.hashCode(this.data);
        result = (result * PRIME) + (this.pageRange == null ? 43 : this.pageRange.hashCode());
        return result;
    }
}
