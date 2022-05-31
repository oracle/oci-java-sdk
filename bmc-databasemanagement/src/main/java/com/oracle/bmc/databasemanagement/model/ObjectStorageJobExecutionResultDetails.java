/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the job execution result stored in Object Storage. The
 * job execution result could be accessed using the Object Storage API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ObjectStorageJobExecutionResultDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ObjectStorageJobExecutionResultDetails extends JobExecutionResultDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rowCount")
        private Integer rowCount;

        public Builder rowCount(Integer rowCount) {
            this.rowCount = rowCount;
            this.__explicitlySet__.add("rowCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageJobExecutionResultDetails build() {
            ObjectStorageJobExecutionResultDetails __instance__ =
                    new ObjectStorageJobExecutionResultDetails(
                            namespaceName, bucketName, objectName, rowCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageJobExecutionResultDetails o) {
            Builder copiedBuilder =
                    namespaceName(o.getNamespaceName())
                            .bucketName(o.getBucketName())
                            .objectName(o.getObjectName())
                            .rowCount(o.getRowCount());

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

    @Deprecated
    public ObjectStorageJobExecutionResultDetails(
            String namespaceName, String bucketName, String objectName, Integer rowCount) {
        super();
        this.namespaceName = namespaceName;
        this.bucketName = bucketName;
        this.objectName = objectName;
        this.rowCount = rowCount;
    }

    /**
     * The Object Storage namespace used for job execution result storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    String namespaceName;

    /**
     * The name of the bucket used for job execution result storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    String bucketName;

    /**
     * The name of the object containing the job execution result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * The number of rows returned in the result for the Query SqlType.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowCount")
    Integer rowCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
