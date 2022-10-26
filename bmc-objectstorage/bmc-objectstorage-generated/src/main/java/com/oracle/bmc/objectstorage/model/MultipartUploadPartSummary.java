/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * Gets summary information about multipart uploads.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you are not
 * authorized, talk to an administrator. If you are an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MultipartUploadPartSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MultipartUploadPartSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"etag", "md5", "size", "partNumber"})
    public MultipartUploadPartSummary(String etag, String md5, Long size, Integer partNumber) {
        super();
        this.etag = etag;
        this.md5 = md5;
        this.size = size;
        this.partNumber = partNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The current entity tag (ETag) for the part. */
        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        /**
         * The current entity tag (ETag) for the part.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }
        /** The MD5 hash of the bytes of the part. */
        @com.fasterxml.jackson.annotation.JsonProperty("md5")
        private String md5;

        /**
         * The MD5 hash of the bytes of the part.
         *
         * @param md5 the value to set
         * @return this builder
         */
        public Builder md5(String md5) {
            this.md5 = md5;
            this.__explicitlySet__.add("md5");
            return this;
        }
        /** The size of the part in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Long size;

        /**
         * The size of the part in bytes.
         *
         * @param size the value to set
         * @return this builder
         */
        public Builder size(Long size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }
        /** The part number for this part. */
        @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
        private Integer partNumber;

        /**
         * The part number for this part.
         *
         * @param partNumber the value to set
         * @return this builder
         */
        public Builder partNumber(Integer partNumber) {
            this.partNumber = partNumber;
            this.__explicitlySet__.add("partNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MultipartUploadPartSummary build() {
            MultipartUploadPartSummary model =
                    new MultipartUploadPartSummary(this.etag, this.md5, this.size, this.partNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultipartUploadPartSummary model) {
            if (model.wasPropertyExplicitlySet("etag")) {
                this.etag(model.getEtag());
            }
            if (model.wasPropertyExplicitlySet("md5")) {
                this.md5(model.getMd5());
            }
            if (model.wasPropertyExplicitlySet("size")) {
                this.size(model.getSize());
            }
            if (model.wasPropertyExplicitlySet("partNumber")) {
                this.partNumber(model.getPartNumber());
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

    /** The current entity tag (ETag) for the part. */
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    private final String etag;

    /**
     * The current entity tag (ETag) for the part.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The MD5 hash of the bytes of the part. */
    @com.fasterxml.jackson.annotation.JsonProperty("md5")
    private final String md5;

    /**
     * The MD5 hash of the bytes of the part.
     *
     * @return the value
     */
    public String getMd5() {
        return md5;
    }

    /** The size of the part in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Long size;

    /**
     * The size of the part in bytes.
     *
     * @return the value
     */
    public Long getSize() {
        return size;
    }

    /** The part number for this part. */
    @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
    private final Integer partNumber;

    /**
     * The part number for this part.
     *
     * @return the value
     */
    public Integer getPartNumber() {
        return partNumber;
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
        sb.append("MultipartUploadPartSummary(");
        sb.append("super=").append(super.toString());
        sb.append("etag=").append(String.valueOf(this.etag));
        sb.append(", md5=").append(String.valueOf(this.md5));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(", partNumber=").append(String.valueOf(this.partNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MultipartUploadPartSummary)) {
            return false;
        }

        MultipartUploadPartSummary other = (MultipartUploadPartSummary) o;
        return java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.md5, other.md5)
                && java.util.Objects.equals(this.size, other.size)
                && java.util.Objects.equals(this.partNumber, other.partNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.md5 == null ? 43 : this.md5.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + (this.partNumber == null ? 43 : this.partNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
