/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CommitMultipartUploadPartDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CommitMultipartUploadPartDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"partNum", "etag"})
    public CommitMultipartUploadPartDetails(Integer partNum, String etag) {
        super();
        this.partNum = partNum;
        this.etag = etag;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The part number for this part.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partNum")
        private Integer partNum;

        /**
         * The part number for this part.
         * @param partNum the value to set
         * @return this builder
         **/
        public Builder partNum(Integer partNum) {
            this.partNum = partNum;
            this.__explicitlySet__.add("partNum");
            return this;
        }
        /**
         * The entity tag (ETag) returned when this part was uploaded.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        /**
         * The entity tag (ETag) returned when this part was uploaded.
         * @param etag the value to set
         * @return this builder
         **/
        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommitMultipartUploadPartDetails build() {
            CommitMultipartUploadPartDetails __instance__ =
                    new CommitMultipartUploadPartDetails(partNum, etag);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitMultipartUploadPartDetails o) {
            Builder copiedBuilder = partNum(o.getPartNum()).etag(o.getEtag());

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
     * The part number for this part.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partNum")
    private final Integer partNum;

    /**
     * The part number for this part.
     * @return the value
     **/
    public Integer getPartNum() {
        return partNum;
    }

    /**
     * The entity tag (ETag) returned when this part was uploaded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    private final String etag;

    /**
     * The entity tag (ETag) returned when this part was uploaded.
     * @return the value
     **/
    public String getEtag() {
        return etag;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CommitMultipartUploadPartDetails(");
        sb.append("partNum=").append(String.valueOf(this.partNum));
        sb.append(", etag=").append(String.valueOf(this.etag));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommitMultipartUploadPartDetails)) {
            return false;
        }

        CommitMultipartUploadPartDetails other = (CommitMultipartUploadPartDetails) o;
        return java.util.Objects.equals(this.partNum, other.partNum)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.partNum == null ? 43 : this.partNum.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
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
