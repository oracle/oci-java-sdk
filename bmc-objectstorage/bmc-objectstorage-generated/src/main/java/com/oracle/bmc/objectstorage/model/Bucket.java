/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * A bucket is a container for storing objects in a compartment within a namespace. A bucket is
 * associated with a single compartment. The compartment has policies that indicate what actions a
 * user can perform on a bucket and all the objects in the bucket. For more information, see
 * [Managing Buckets](https://docs.cloud.oracle.com/Content/Object/Tasks/managingbuckets.htm).
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Bucket.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Bucket extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespace",
        "name",
        "compartmentId",
        "metadata",
        "createdBy",
        "timeCreated",
        "etag",
        "publicAccessType",
        "storageTier",
        "objectEventsEnabled",
        "freeformTags",
        "definedTags",
        "kmsKeyId",
        "objectLifecyclePolicyEtag",
        "approximateCount",
        "approximateSize",
        "replicationEnabled",
        "isReadOnly",
        "id",
        "versioning",
        "autoTiering"
    })
    public Bucket(
            String namespace,
            String name,
            String compartmentId,
            java.util.Map<String, String> metadata,
            String createdBy,
            java.util.Date timeCreated,
            String etag,
            PublicAccessType publicAccessType,
            StorageTier storageTier,
            Boolean objectEventsEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String kmsKeyId,
            String objectLifecyclePolicyEtag,
            Long approximateCount,
            Long approximateSize,
            Boolean replicationEnabled,
            Boolean isReadOnly,
            String id,
            Versioning versioning,
            AutoTiering autoTiering) {
        super();
        this.namespace = namespace;
        this.name = name;
        this.compartmentId = compartmentId;
        this.metadata = metadata;
        this.createdBy = createdBy;
        this.timeCreated = timeCreated;
        this.etag = etag;
        this.publicAccessType = publicAccessType;
        this.storageTier = storageTier;
        this.objectEventsEnabled = objectEventsEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.kmsKeyId = kmsKeyId;
        this.objectLifecyclePolicyEtag = objectLifecyclePolicyEtag;
        this.approximateCount = approximateCount;
        this.approximateSize = approximateSize;
        this.replicationEnabled = replicationEnabled;
        this.isReadOnly = isReadOnly;
        this.id = id;
        this.versioning = versioning;
        this.autoTiering = autoTiering;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Object Storage namespace in which the bucket resides. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace in which the bucket resides.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The name of the bucket. Avoid entering confidential information. Example: my-new-bucket1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the bucket. Avoid entering confidential information. Example: my-new-bucket1
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The compartment ID in which the bucket is authorized. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment ID in which the bucket is authorized.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Arbitrary string keys and values for user-defined metadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Arbitrary string keys and values for user-defined metadata.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * user who created the bucket.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * user who created the bucket.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * The date and time the bucket was created, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the bucket was created, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The entity tag (ETag) for the bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        /**
         * The entity tag (ETag) for the bucket.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }
        /**
         * The type of public access enabled on this bucket. A bucket is set to {@code
         * NoPublicAccess} by default, which only allows an authenticated caller to access the
         * bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access
         * is allowed for the {@code GetObject}, {@code HeadObject}, and {@code ListObjects}
         * operations. When {@code ObjectReadWithoutList} is enabled on the bucket, public access is
         * allowed for the {@code GetObject} and {@code HeadObject} operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
        private PublicAccessType publicAccessType;

        /**
         * The type of public access enabled on this bucket. A bucket is set to {@code
         * NoPublicAccess} by default, which only allows an authenticated caller to access the
         * bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access
         * is allowed for the {@code GetObject}, {@code HeadObject}, and {@code ListObjects}
         * operations. When {@code ObjectReadWithoutList} is enabled on the bucket, public access is
         * allowed for the {@code GetObject} and {@code HeadObject} operations.
         *
         * @param publicAccessType the value to set
         * @return this builder
         */
        public Builder publicAccessType(PublicAccessType publicAccessType) {
            this.publicAccessType = publicAccessType;
            this.__explicitlySet__.add("publicAccessType");
            return this;
        }
        /**
         * The storage tier type assigned to the bucket. A bucket is set to {@code Standard} tier by
         * default, which means objects uploaded or copied to the bucket will be in the standard
         * storage tier. When the {@code Archive} tier type is set explicitly for a bucket, objects
         * uploaded or copied to the bucket will be stored in archive storage. The {@code
         * storageTier} property is immutable after bucket is created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        /**
         * The storage tier type assigned to the bucket. A bucket is set to {@code Standard} tier by
         * default, which means objects uploaded or copied to the bucket will be in the standard
         * storage tier. When the {@code Archive} tier type is set explicitly for a bucket, objects
         * uploaded or copied to the bucket will be stored in archive storage. The {@code
         * storageTier} property is immutable after bucket is created.
         *
         * @param storageTier the value to set
         * @return this builder
         */
        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }
        /**
         * Whether or not events are emitted for object state changes in this bucket. By default,
         * {@code objectEventsEnabled} is set to {@code false}. Set {@code objectEventsEnabled} to
         * {@code true} to emit events for object state changes. For more information about events,
         * see [Overview of
         * Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectEventsEnabled")
        private Boolean objectEventsEnabled;

        /**
         * Whether or not events are emitted for object state changes in this bucket. By default,
         * {@code objectEventsEnabled} is set to {@code false}. Set {@code objectEventsEnabled} to
         * {@code true} to emit events for object state changes. For more information about events,
         * see [Overview of
         * Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
         *
         * @param objectEventsEnabled the value to set
         * @return this builder
         */
        public Builder objectEventsEnabled(Boolean objectEventsEnabled) {
            this.objectEventsEnabled = objectEventsEnabled;
            this.__explicitlySet__.add("objectEventsEnabled");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
         * master encryption key used to call the Key Management service to generate a data
         * encryption key or to encrypt or decrypt a data encryption key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
         * master encryption key used to call the Key Management service to generate a data
         * encryption key or to encrypt or decrypt a data encryption key.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /** The entity tag (ETag) for the live object lifecycle policy on the bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectLifecyclePolicyEtag")
        private String objectLifecyclePolicyEtag;

        /**
         * The entity tag (ETag) for the live object lifecycle policy on the bucket.
         *
         * @param objectLifecyclePolicyEtag the value to set
         * @return this builder
         */
        public Builder objectLifecyclePolicyEtag(String objectLifecyclePolicyEtag) {
            this.objectLifecyclePolicyEtag = objectLifecyclePolicyEtag;
            this.__explicitlySet__.add("objectLifecyclePolicyEtag");
            return this;
        }
        /**
         * The approximate number of objects in the bucket. Count statistics are reported
         * periodically. You will see a lag between what is displayed and the actual object count.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateCount")
        private Long approximateCount;

        /**
         * The approximate number of objects in the bucket. Count statistics are reported
         * periodically. You will see a lag between what is displayed and the actual object count.
         *
         * @param approximateCount the value to set
         * @return this builder
         */
        public Builder approximateCount(Long approximateCount) {
            this.approximateCount = approximateCount;
            this.__explicitlySet__.add("approximateCount");
            return this;
        }
        /**
         * The approximate total size in bytes of all objects in the bucket. Size statistics are
         * reported periodically. You will see a lag between what is displayed and the actual size
         * of the bucket.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateSize")
        private Long approximateSize;

        /**
         * The approximate total size in bytes of all objects in the bucket. Size statistics are
         * reported periodically. You will see a lag between what is displayed and the actual size
         * of the bucket.
         *
         * @param approximateSize the value to set
         * @return this builder
         */
        public Builder approximateSize(Long approximateSize) {
            this.approximateSize = approximateSize;
            this.__explicitlySet__.add("approximateSize");
            return this;
        }
        /**
         * Whether or not this bucket is a replication source. By default, {@code
         * replicationEnabled} is set to {@code false}. This will be set to 'true' when you create a
         * replication policy for the bucket.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationEnabled")
        private Boolean replicationEnabled;

        /**
         * Whether or not this bucket is a replication source. By default, {@code
         * replicationEnabled} is set to {@code false}. This will be set to 'true' when you create a
         * replication policy for the bucket.
         *
         * @param replicationEnabled the value to set
         * @return this builder
         */
        public Builder replicationEnabled(Boolean replicationEnabled) {
            this.replicationEnabled = replicationEnabled;
            this.__explicitlySet__.add("replicationEnabled");
            return this;
        }
        /**
         * Whether or not this bucket is read only. By default, {@code isReadOnly} is set to {@code
         * false}. This will be set to 'true' when this bucket is configured as a destination in a
         * replication policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
        private Boolean isReadOnly;

        /**
         * Whether or not this bucket is read only. By default, {@code isReadOnly} is set to {@code
         * false}. This will be set to 'true' when this bucket is configured as a destination in a
         * replication policy.
         *
         * @param isReadOnly the value to set
         * @return this builder
         */
        public Builder isReadOnly(Boolean isReadOnly) {
            this.isReadOnly = isReadOnly;
            this.__explicitlySet__.add("isReadOnly");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * bucket.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * bucket.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The versioning status on the bucket. A bucket is created with versioning {@code Disabled}
         * by default. For versioning {@code Enabled}, objects are protected from overwrites and
         * deletes, by maintaining their version history. When versioning is {@code Suspended}, the
         * previous versions will still remain but new versions will no longer be created when
         * overwitten or deleted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("versioning")
        private Versioning versioning;

        /**
         * The versioning status on the bucket. A bucket is created with versioning {@code Disabled}
         * by default. For versioning {@code Enabled}, objects are protected from overwrites and
         * deletes, by maintaining their version history. When versioning is {@code Suspended}, the
         * previous versions will still remain but new versions will no longer be created when
         * overwitten or deleted.
         *
         * @param versioning the value to set
         * @return this builder
         */
        public Builder versioning(Versioning versioning) {
            this.versioning = versioning;
            this.__explicitlySet__.add("versioning");
            return this;
        }
        /**
         * The auto tiering status on the bucket. A bucket is created with auto tiering {@code
         * Disabled} by default. For auto tiering {@code InfrequentAccess}, objects are transitioned
         * automatically between the 'Standard' and 'InfrequentAccess' tiers based on the access
         * pattern of the objects.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
        private AutoTiering autoTiering;

        /**
         * The auto tiering status on the bucket. A bucket is created with auto tiering {@code
         * Disabled} by default. For auto tiering {@code InfrequentAccess}, objects are transitioned
         * automatically between the 'Standard' and 'InfrequentAccess' tiers based on the access
         * pattern of the objects.
         *
         * @param autoTiering the value to set
         * @return this builder
         */
        public Builder autoTiering(AutoTiering autoTiering) {
            this.autoTiering = autoTiering;
            this.__explicitlySet__.add("autoTiering");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Bucket build() {
            Bucket model =
                    new Bucket(
                            this.namespace,
                            this.name,
                            this.compartmentId,
                            this.metadata,
                            this.createdBy,
                            this.timeCreated,
                            this.etag,
                            this.publicAccessType,
                            this.storageTier,
                            this.objectEventsEnabled,
                            this.freeformTags,
                            this.definedTags,
                            this.kmsKeyId,
                            this.objectLifecyclePolicyEtag,
                            this.approximateCount,
                            this.approximateSize,
                            this.replicationEnabled,
                            this.isReadOnly,
                            this.id,
                            this.versioning,
                            this.autoTiering);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Bucket model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("etag")) {
                this.etag(model.getEtag());
            }
            if (model.wasPropertyExplicitlySet("publicAccessType")) {
                this.publicAccessType(model.getPublicAccessType());
            }
            if (model.wasPropertyExplicitlySet("storageTier")) {
                this.storageTier(model.getStorageTier());
            }
            if (model.wasPropertyExplicitlySet("objectEventsEnabled")) {
                this.objectEventsEnabled(model.getObjectEventsEnabled());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("objectLifecyclePolicyEtag")) {
                this.objectLifecyclePolicyEtag(model.getObjectLifecyclePolicyEtag());
            }
            if (model.wasPropertyExplicitlySet("approximateCount")) {
                this.approximateCount(model.getApproximateCount());
            }
            if (model.wasPropertyExplicitlySet("approximateSize")) {
                this.approximateSize(model.getApproximateSize());
            }
            if (model.wasPropertyExplicitlySet("replicationEnabled")) {
                this.replicationEnabled(model.getReplicationEnabled());
            }
            if (model.wasPropertyExplicitlySet("isReadOnly")) {
                this.isReadOnly(model.getIsReadOnly());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("versioning")) {
                this.versioning(model.getVersioning());
            }
            if (model.wasPropertyExplicitlySet("autoTiering")) {
                this.autoTiering(model.getAutoTiering());
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

    /** The Object Storage namespace in which the bucket resides. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace in which the bucket resides.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The name of the bucket. Avoid entering confidential information. Example: my-new-bucket1 */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the bucket. Avoid entering confidential information. Example: my-new-bucket1
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The compartment ID in which the bucket is authorized. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment ID in which the bucket is authorized.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Arbitrary string keys and values for user-defined metadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Arbitrary string keys and values for user-defined metadata.
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * user who created the bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * user who created the bucket.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The date and time the bucket was created, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the bucket was created, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The entity tag (ETag) for the bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    private final String etag;

    /**
     * The entity tag (ETag) for the bucket.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The type of public access enabled on this bucket. A bucket is set to {@code NoPublicAccess}
     * by default, which only allows an authenticated caller to access the bucket and its contents.
     * When {@code ObjectRead} is enabled on the bucket, public access is allowed for the {@code
     * GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code
     * ObjectReadWithoutList} is enabled on the bucket, public access is allowed for the {@code
     * GetObject} and {@code HeadObject} operations.
     */
    public enum PublicAccessType implements com.oracle.bmc.http.internal.BmcEnum {
        NoPublicAccess("NoPublicAccess"),
        ObjectRead("ObjectRead"),
        ObjectReadWithoutList("ObjectReadWithoutList"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PublicAccessType.class);

        private final String value;
        private static java.util.Map<String, PublicAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicAccessType v : PublicAccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PublicAccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublicAccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PublicAccessType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of public access enabled on this bucket. A bucket is set to {@code NoPublicAccess}
     * by default, which only allows an authenticated caller to access the bucket and its contents.
     * When {@code ObjectRead} is enabled on the bucket, public access is allowed for the {@code
     * GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code
     * ObjectReadWithoutList} is enabled on the bucket, public access is allowed for the {@code
     * GetObject} and {@code HeadObject} operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
    private final PublicAccessType publicAccessType;

    /**
     * The type of public access enabled on this bucket. A bucket is set to {@code NoPublicAccess}
     * by default, which only allows an authenticated caller to access the bucket and its contents.
     * When {@code ObjectRead} is enabled on the bucket, public access is allowed for the {@code
     * GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code
     * ObjectReadWithoutList} is enabled on the bucket, public access is allowed for the {@code
     * GetObject} and {@code HeadObject} operations.
     *
     * @return the value
     */
    public PublicAccessType getPublicAccessType() {
        return publicAccessType;
    }

    /**
     * The storage tier type assigned to the bucket. A bucket is set to {@code Standard} tier by
     * default, which means objects uploaded or copied to the bucket will be in the standard storage
     * tier. When the {@code Archive} tier type is set explicitly for a bucket, objects uploaded or
     * copied to the bucket will be stored in archive storage. The {@code storageTier} property is
     * immutable after bucket is created.
     */
    public enum StorageTier implements com.oracle.bmc.http.internal.BmcEnum {
        Standard("Standard"),
        Archive("Archive"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StorageTier.class);

        private final String value;
        private static java.util.Map<String, StorageTier> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageTier v : StorageTier.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StorageTier(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageTier create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StorageTier', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The storage tier type assigned to the bucket. A bucket is set to {@code Standard} tier by
     * default, which means objects uploaded or copied to the bucket will be in the standard storage
     * tier. When the {@code Archive} tier type is set explicitly for a bucket, objects uploaded or
     * copied to the bucket will be stored in archive storage. The {@code storageTier} property is
     * immutable after bucket is created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    private final StorageTier storageTier;

    /**
     * The storage tier type assigned to the bucket. A bucket is set to {@code Standard} tier by
     * default, which means objects uploaded or copied to the bucket will be in the standard storage
     * tier. When the {@code Archive} tier type is set explicitly for a bucket, objects uploaded or
     * copied to the bucket will be stored in archive storage. The {@code storageTier} property is
     * immutable after bucket is created.
     *
     * @return the value
     */
    public StorageTier getStorageTier() {
        return storageTier;
    }

    /**
     * Whether or not events are emitted for object state changes in this bucket. By default, {@code
     * objectEventsEnabled} is set to {@code false}. Set {@code objectEventsEnabled} to {@code true}
     * to emit events for object state changes. For more information about events, see [Overview of
     * Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectEventsEnabled")
    private final Boolean objectEventsEnabled;

    /**
     * Whether or not events are emitted for object state changes in this bucket. By default, {@code
     * objectEventsEnabled} is set to {@code false}. Set {@code objectEventsEnabled} to {@code true}
     * to emit events for object state changes. For more information about events, see [Overview of
     * Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
     *
     * @return the value
     */
    public Boolean getObjectEventsEnabled() {
        return objectEventsEnabled;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
     * master encryption key used to call the Key Management service to generate a data encryption
     * key or to encrypt or decrypt a data encryption key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
     * master encryption key used to call the Key Management service to generate a data encryption
     * key or to encrypt or decrypt a data encryption key.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /** The entity tag (ETag) for the live object lifecycle policy on the bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectLifecyclePolicyEtag")
    private final String objectLifecyclePolicyEtag;

    /**
     * The entity tag (ETag) for the live object lifecycle policy on the bucket.
     *
     * @return the value
     */
    public String getObjectLifecyclePolicyEtag() {
        return objectLifecyclePolicyEtag;
    }

    /**
     * The approximate number of objects in the bucket. Count statistics are reported periodically.
     * You will see a lag between what is displayed and the actual object count.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateCount")
    private final Long approximateCount;

    /**
     * The approximate number of objects in the bucket. Count statistics are reported periodically.
     * You will see a lag between what is displayed and the actual object count.
     *
     * @return the value
     */
    public Long getApproximateCount() {
        return approximateCount;
    }

    /**
     * The approximate total size in bytes of all objects in the bucket. Size statistics are
     * reported periodically. You will see a lag between what is displayed and the actual size of
     * the bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateSize")
    private final Long approximateSize;

    /**
     * The approximate total size in bytes of all objects in the bucket. Size statistics are
     * reported periodically. You will see a lag between what is displayed and the actual size of
     * the bucket.
     *
     * @return the value
     */
    public Long getApproximateSize() {
        return approximateSize;
    }

    /**
     * Whether or not this bucket is a replication source. By default, {@code replicationEnabled} is
     * set to {@code false}. This will be set to 'true' when you create a replication policy for the
     * bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationEnabled")
    private final Boolean replicationEnabled;

    /**
     * Whether or not this bucket is a replication source. By default, {@code replicationEnabled} is
     * set to {@code false}. This will be set to 'true' when you create a replication policy for the
     * bucket.
     *
     * @return the value
     */
    public Boolean getReplicationEnabled() {
        return replicationEnabled;
    }

    /**
     * Whether or not this bucket is read only. By default, {@code isReadOnly} is set to {@code
     * false}. This will be set to 'true' when this bucket is configured as a destination in a
     * replication policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    private final Boolean isReadOnly;

    /**
     * Whether or not this bucket is read only. By default, {@code isReadOnly} is set to {@code
     * false}. This will be set to 'true' when this bucket is configured as a destination in a
     * replication policy.
     *
     * @return the value
     */
    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * bucket.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The versioning status on the bucket. A bucket is created with versioning {@code Disabled} by
     * default. For versioning {@code Enabled}, objects are protected from overwrites and deletes,
     * by maintaining their version history. When versioning is {@code Suspended}, the previous
     * versions will still remain but new versions will no longer be created when overwitten or
     * deleted.
     */
    public enum Versioning implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("Enabled"),
        Suspended("Suspended"),
        Disabled("Disabled"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Versioning.class);

        private final String value;
        private static java.util.Map<String, Versioning> map;

        static {
            map = new java.util.HashMap<>();
            for (Versioning v : Versioning.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Versioning(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Versioning create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Versioning', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The versioning status on the bucket. A bucket is created with versioning {@code Disabled} by
     * default. For versioning {@code Enabled}, objects are protected from overwrites and deletes,
     * by maintaining their version history. When versioning is {@code Suspended}, the previous
     * versions will still remain but new versions will no longer be created when overwitten or
     * deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versioning")
    private final Versioning versioning;

    /**
     * The versioning status on the bucket. A bucket is created with versioning {@code Disabled} by
     * default. For versioning {@code Enabled}, objects are protected from overwrites and deletes,
     * by maintaining their version history. When versioning is {@code Suspended}, the previous
     * versions will still remain but new versions will no longer be created when overwitten or
     * deleted.
     *
     * @return the value
     */
    public Versioning getVersioning() {
        return versioning;
    }

    /**
     * The auto tiering status on the bucket. A bucket is created with auto tiering {@code Disabled}
     * by default. For auto tiering {@code InfrequentAccess}, objects are transitioned automatically
     * between the 'Standard' and 'InfrequentAccess' tiers based on the access pattern of the
     * objects.
     */
    public enum AutoTiering implements com.oracle.bmc.http.internal.BmcEnum {
        Disabled("Disabled"),
        InfrequentAccess("InfrequentAccess"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AutoTiering.class);

        private final String value;
        private static java.util.Map<String, AutoTiering> map;

        static {
            map = new java.util.HashMap<>();
            for (AutoTiering v : AutoTiering.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutoTiering(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutoTiering create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutoTiering', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The auto tiering status on the bucket. A bucket is created with auto tiering {@code Disabled}
     * by default. For auto tiering {@code InfrequentAccess}, objects are transitioned automatically
     * between the 'Standard' and 'InfrequentAccess' tiers based on the access pattern of the
     * objects.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
    private final AutoTiering autoTiering;

    /**
     * The auto tiering status on the bucket. A bucket is created with auto tiering {@code Disabled}
     * by default. For auto tiering {@code InfrequentAccess}, objects are transitioned automatically
     * between the 'Standard' and 'InfrequentAccess' tiers based on the access pattern of the
     * objects.
     *
     * @return the value
     */
    public AutoTiering getAutoTiering() {
        return autoTiering;
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
        sb.append("Bucket(");
        sb.append("super=").append(super.toString());
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", etag=").append(String.valueOf(this.etag));
        sb.append(", publicAccessType=").append(String.valueOf(this.publicAccessType));
        sb.append(", storageTier=").append(String.valueOf(this.storageTier));
        sb.append(", objectEventsEnabled=").append(String.valueOf(this.objectEventsEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", objectLifecyclePolicyEtag=")
                .append(String.valueOf(this.objectLifecyclePolicyEtag));
        sb.append(", approximateCount=").append(String.valueOf(this.approximateCount));
        sb.append(", approximateSize=").append(String.valueOf(this.approximateSize));
        sb.append(", replicationEnabled=").append(String.valueOf(this.replicationEnabled));
        sb.append(", isReadOnly=").append(String.valueOf(this.isReadOnly));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", versioning=").append(String.valueOf(this.versioning));
        sb.append(", autoTiering=").append(String.valueOf(this.autoTiering));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Bucket)) {
            return false;
        }

        Bucket other = (Bucket) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.publicAccessType, other.publicAccessType)
                && java.util.Objects.equals(this.storageTier, other.storageTier)
                && java.util.Objects.equals(this.objectEventsEnabled, other.objectEventsEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(
                        this.objectLifecyclePolicyEtag, other.objectLifecyclePolicyEtag)
                && java.util.Objects.equals(this.approximateCount, other.approximateCount)
                && java.util.Objects.equals(this.approximateSize, other.approximateSize)
                && java.util.Objects.equals(this.replicationEnabled, other.replicationEnabled)
                && java.util.Objects.equals(this.isReadOnly, other.isReadOnly)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.versioning, other.versioning)
                && java.util.Objects.equals(this.autoTiering, other.autoTiering)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.publicAccessType == null ? 43 : this.publicAccessType.hashCode());
        result = (result * PRIME) + (this.storageTier == null ? 43 : this.storageTier.hashCode());
        result =
                (result * PRIME)
                        + (this.objectEventsEnabled == null
                                ? 43
                                : this.objectEventsEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.objectLifecyclePolicyEtag == null
                                ? 43
                                : this.objectLifecyclePolicyEtag.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateCount == null ? 43 : this.approximateCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateSize == null ? 43 : this.approximateSize.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationEnabled == null
                                ? 43
                                : this.replicationEnabled.hashCode());
        result = (result * PRIME) + (this.isReadOnly == null ? 43 : this.isReadOnly.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.versioning == null ? 43 : this.versioning.hashCode());
        result = (result * PRIME) + (this.autoTiering == null ? 43 : this.autoTiering.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
