/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CommitMultipartUploadPartDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CommitMultipartUploadPartDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("partNum")
        private Integer partNum;

        public Builder partNum(Integer partNum) {
            this.partNum = partNum;
            this.__explicitlySet__.add("partNum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

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

    /**
     * The part number for this part.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partNum")
    Integer partNum;

    /**
     * The ETag returned when this part was uploaded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    String etag;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
