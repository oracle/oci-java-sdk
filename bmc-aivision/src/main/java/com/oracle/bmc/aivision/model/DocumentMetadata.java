/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The document information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DocumentMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DocumentMetadata {
    @Deprecated
    @java.beans.ConstructorProperties({"pageCount", "mimeType"})
    public DocumentMetadata(Integer pageCount, String mimeType) {
        super();
        this.pageCount = pageCount;
        this.mimeType = mimeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Teh number of pages in the document.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pageCount")
        private Integer pageCount;

        /**
         * Teh number of pages in the document.
         * @param pageCount the value to set
         * @return this builder
         **/
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            this.__explicitlySet__.add("pageCount");
            return this;
        }
        /**
         * The result data format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
        private String mimeType;

        /**
         * The result data format.
         * @param mimeType the value to set
         * @return this builder
         **/
        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            this.__explicitlySet__.add("mimeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DocumentMetadata build() {
            DocumentMetadata __instance__ = new DocumentMetadata(pageCount, mimeType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DocumentMetadata o) {
            Builder copiedBuilder = pageCount(o.getPageCount()).mimeType(o.getMimeType());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Teh number of pages in the document.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pageCount")
    private final Integer pageCount;

    /**
     * Teh number of pages in the document.
     * @return the value
     **/
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * The result data format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
    private final String mimeType;

    /**
     * The result data format.
     * @return the value
     **/
    public String getMimeType() {
        return mimeType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentMetadata(");
        sb.append("pageCount=").append(String.valueOf(this.pageCount));
        sb.append(", mimeType=").append(String.valueOf(this.mimeType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DocumentMetadata)) {
            return false;
        }

        DocumentMetadata other = (DocumentMetadata) o;
        return java.util.Objects.equals(this.pageCount, other.pageCount)
                && java.util.Objects.equals(this.mimeType, other.mimeType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pageCount == null ? 43 : this.pageCount.hashCode());
        result = (result * PRIME) + (this.mimeType == null ? 43 : this.mimeType.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
