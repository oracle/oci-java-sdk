/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The bucket used for the Object Storage target. For configuration instructions, see [To create a
 * service
 * connector](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/managingconnectors.htm#create).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ObjectStorageTargetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ObjectStorageTargetDetails extends TargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The name of the bucket. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the bucket. Avoid entering confidential information.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The prefix of the objects. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectNamePrefix")
        private String objectNamePrefix;

        /**
         * The prefix of the objects. Avoid entering confidential information.
         *
         * @param objectNamePrefix the value to set
         * @return this builder
         */
        public Builder objectNamePrefix(String objectNamePrefix) {
            this.objectNamePrefix = objectNamePrefix;
            this.__explicitlySet__.add("objectNamePrefix");
            return this;
        }
        /** The batch rollover size in megabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverSizeInMBs")
        private Integer batchRolloverSizeInMBs;

        /**
         * The batch rollover size in megabytes.
         *
         * @param batchRolloverSizeInMBs the value to set
         * @return this builder
         */
        public Builder batchRolloverSizeInMBs(Integer batchRolloverSizeInMBs) {
            this.batchRolloverSizeInMBs = batchRolloverSizeInMBs;
            this.__explicitlySet__.add("batchRolloverSizeInMBs");
            return this;
        }
        /** The batch rollover time in milliseconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverTimeInMs")
        private Integer batchRolloverTimeInMs;

        /**
         * The batch rollover time in milliseconds.
         *
         * @param batchRolloverTimeInMs the value to set
         * @return this builder
         */
        public Builder batchRolloverTimeInMs(Integer batchRolloverTimeInMs) {
            this.batchRolloverTimeInMs = batchRolloverTimeInMs;
            this.__explicitlySet__.add("batchRolloverTimeInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageTargetDetails build() {
            ObjectStorageTargetDetails model =
                    new ObjectStorageTargetDetails(
                            this.namespace,
                            this.bucketName,
                            this.objectNamePrefix,
                            this.batchRolloverSizeInMBs,
                            this.batchRolloverTimeInMs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageTargetDetails model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("objectNamePrefix")) {
                this.objectNamePrefix(model.getObjectNamePrefix());
            }
            if (model.wasPropertyExplicitlySet("batchRolloverSizeInMBs")) {
                this.batchRolloverSizeInMBs(model.getBatchRolloverSizeInMBs());
            }
            if (model.wasPropertyExplicitlySet("batchRolloverTimeInMs")) {
                this.batchRolloverTimeInMs(model.getBatchRolloverTimeInMs());
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
    public ObjectStorageTargetDetails(
            String namespace,
            String bucketName,
            String objectNamePrefix,
            Integer batchRolloverSizeInMBs,
            Integer batchRolloverTimeInMs) {
        super();
        this.namespace = namespace;
        this.bucketName = bucketName;
        this.objectNamePrefix = objectNamePrefix;
        this.batchRolloverSizeInMBs = batchRolloverSizeInMBs;
        this.batchRolloverTimeInMs = batchRolloverTimeInMs;
    }

    /** The namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The name of the bucket. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the bucket. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The prefix of the objects. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectNamePrefix")
    private final String objectNamePrefix;

    /**
     * The prefix of the objects. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getObjectNamePrefix() {
        return objectNamePrefix;
    }

    /** The batch rollover size in megabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverSizeInMBs")
    private final Integer batchRolloverSizeInMBs;

    /**
     * The batch rollover size in megabytes.
     *
     * @return the value
     */
    public Integer getBatchRolloverSizeInMBs() {
        return batchRolloverSizeInMBs;
    }

    /** The batch rollover time in milliseconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverTimeInMs")
    private final Integer batchRolloverTimeInMs;

    /**
     * The batch rollover time in milliseconds.
     *
     * @return the value
     */
    public Integer getBatchRolloverTimeInMs() {
        return batchRolloverTimeInMs;
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
        sb.append("ObjectStorageTargetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", objectNamePrefix=").append(String.valueOf(this.objectNamePrefix));
        sb.append(", batchRolloverSizeInMBs=").append(String.valueOf(this.batchRolloverSizeInMBs));
        sb.append(", batchRolloverTimeInMs=").append(String.valueOf(this.batchRolloverTimeInMs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectStorageTargetDetails)) {
            return false;
        }

        ObjectStorageTargetDetails other = (ObjectStorageTargetDetails) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectNamePrefix, other.objectNamePrefix)
                && java.util.Objects.equals(
                        this.batchRolloverSizeInMBs, other.batchRolloverSizeInMBs)
                && java.util.Objects.equals(this.batchRolloverTimeInMs, other.batchRolloverTimeInMs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.objectNamePrefix == null ? 43 : this.objectNamePrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.batchRolloverSizeInMBs == null
                                ? 43
                                : this.batchRolloverSizeInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.batchRolloverTimeInMs == null
                                ? 43
                                : this.batchRolloverTimeInMs.hashCode());
        return result;
    }
}
