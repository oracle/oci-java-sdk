/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * This is dedicated Entity to store Document related info. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DocumentEntityMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DocumentEntityMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pageNumber"})
    public DocumentEntityMetadata(java.math.BigDecimal pageNumber) {
        super();
        this.pageNumber = pageNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This stores page number of document. */
        @com.fasterxml.jackson.annotation.JsonProperty("pageNumber")
        private java.math.BigDecimal pageNumber;

        /**
         * This stores page number of document.
         *
         * @param pageNumber the value to set
         * @return this builder
         */
        public Builder pageNumber(java.math.BigDecimal pageNumber) {
            this.pageNumber = pageNumber;
            this.__explicitlySet__.add("pageNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DocumentEntityMetadata build() {
            DocumentEntityMetadata model = new DocumentEntityMetadata(this.pageNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DocumentEntityMetadata model) {
            if (model.wasPropertyExplicitlySet("pageNumber")) {
                this.pageNumber(model.getPageNumber());
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

    /** This stores page number of document. */
    @com.fasterxml.jackson.annotation.JsonProperty("pageNumber")
    private final java.math.BigDecimal pageNumber;

    /**
     * This stores page number of document.
     *
     * @return the value
     */
    public java.math.BigDecimal getPageNumber() {
        return pageNumber;
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
        sb.append("DocumentEntityMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("pageNumber=").append(String.valueOf(this.pageNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DocumentEntityMetadata)) {
            return false;
        }

        DocumentEntityMetadata other = (DocumentEntityMetadata) o;
        return java.util.Objects.equals(this.pageNumber, other.pageNumber) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pageNumber == null ? 43 : this.pageNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
