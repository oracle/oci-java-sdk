/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * BICC Connector Attribute.Object Storage as External storage where the BICC extracted files are written
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExternalStorage.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExternalStorage extends ConnectorAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("storageId")
        private String storageId;

        public Builder storageId(String storageId) {
            this.storageId = storageId;
            this.__explicitlySet__.add("storageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageName")
        private String storageName;

        public Builder storageName(String storageName) {
            this.storageName = storageName;
            this.__explicitlySet__.add("storageName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalStorage build() {
            ExternalStorage __instance__ =
                    new ExternalStorage(storageId, storageName, host, tenancyId, namespace, bucket);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalStorage o) {
            Builder copiedBuilder =
                    storageId(o.getStorageId())
                            .storageName(o.getStorageName())
                            .host(o.getHost())
                            .tenancyId(o.getTenancyId())
                            .namespace(o.getNamespace())
                            .bucket(o.getBucket());

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
    public ExternalStorage(
            String storageId,
            String storageName,
            String host,
            String tenancyId,
            String namespace,
            String bucket) {
        super();
        this.storageId = storageId;
        this.storageName = storageName;
        this.host = host;
        this.tenancyId = tenancyId;
        this.namespace = namespace;
        this.bucket = bucket;
    }

    /**
     * Id of the external stoarge configured in BICC console. Usually its numeric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageId")
    String storageId;

    /**
     * Name of the external storage configured in BICC console
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageName")
    String storageName;

    /**
     * Object Storage host Url. DO not give http/https.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * Tenancy OCID for the OOS bucket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    String tenancyId;

    /**
     * Namespace for the OOS bucket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * Bucket Name where BICC extracts stores the files
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    String bucket;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
