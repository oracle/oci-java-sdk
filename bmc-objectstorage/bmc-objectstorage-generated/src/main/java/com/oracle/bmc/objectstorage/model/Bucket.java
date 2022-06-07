/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * A bucket is a container for storing objects in a compartment within a namespace. A bucket is associated with a single compartment.
 * The compartment has policies that indicate what actions a user can perform on a bucket and all the objects in the bucket. For more
 * information, see [Managing Buckets](https://docs.cloud.oracle.com/Content/Object/Tasks/managingbuckets.htm).
 * <p>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Bucket.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Bucket {
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
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
        private PublicAccessType publicAccessType;

        public Builder publicAccessType(PublicAccessType publicAccessType) {
            this.publicAccessType = publicAccessType;
            this.__explicitlySet__.add("publicAccessType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectEventsEnabled")
        private Boolean objectEventsEnabled;

        public Builder objectEventsEnabled(Boolean objectEventsEnabled) {
            this.objectEventsEnabled = objectEventsEnabled;
            this.__explicitlySet__.add("objectEventsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectLifecyclePolicyEtag")
        private String objectLifecyclePolicyEtag;

        public Builder objectLifecyclePolicyEtag(String objectLifecyclePolicyEtag) {
            this.objectLifecyclePolicyEtag = objectLifecyclePolicyEtag;
            this.__explicitlySet__.add("objectLifecyclePolicyEtag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximateCount")
        private Long approximateCount;

        public Builder approximateCount(Long approximateCount) {
            this.approximateCount = approximateCount;
            this.__explicitlySet__.add("approximateCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximateSize")
        private Long approximateSize;

        public Builder approximateSize(Long approximateSize) {
            this.approximateSize = approximateSize;
            this.__explicitlySet__.add("approximateSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicationEnabled")
        private Boolean replicationEnabled;

        public Builder replicationEnabled(Boolean replicationEnabled) {
            this.replicationEnabled = replicationEnabled;
            this.__explicitlySet__.add("replicationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
        private Boolean isReadOnly;

        public Builder isReadOnly(Boolean isReadOnly) {
            this.isReadOnly = isReadOnly;
            this.__explicitlySet__.add("isReadOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versioning")
        private Versioning versioning;

        public Builder versioning(Versioning versioning) {
            this.versioning = versioning;
            this.__explicitlySet__.add("versioning");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
        private AutoTiering autoTiering;

        public Builder autoTiering(AutoTiering autoTiering) {
            this.autoTiering = autoTiering;
            this.__explicitlySet__.add("autoTiering");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Bucket build() {
            Bucket __instance__ =
                    new Bucket(
                            namespace,
                            name,
                            compartmentId,
                            metadata,
                            createdBy,
                            timeCreated,
                            etag,
                            publicAccessType,
                            storageTier,
                            objectEventsEnabled,
                            freeformTags,
                            definedTags,
                            kmsKeyId,
                            objectLifecyclePolicyEtag,
                            approximateCount,
                            approximateSize,
                            replicationEnabled,
                            isReadOnly,
                            id,
                            versioning,
                            autoTiering);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Bucket o) {
            Builder copiedBuilder =
                    namespace(o.getNamespace())
                            .name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .metadata(o.getMetadata())
                            .createdBy(o.getCreatedBy())
                            .timeCreated(o.getTimeCreated())
                            .etag(o.getEtag())
                            .publicAccessType(o.getPublicAccessType())
                            .storageTier(o.getStorageTier())
                            .objectEventsEnabled(o.getObjectEventsEnabled())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .kmsKeyId(o.getKmsKeyId())
                            .objectLifecyclePolicyEtag(o.getObjectLifecyclePolicyEtag())
                            .approximateCount(o.getApproximateCount())
                            .approximateSize(o.getApproximateSize())
                            .replicationEnabled(o.getReplicationEnabled())
                            .isReadOnly(o.getIsReadOnly())
                            .id(o.getId())
                            .versioning(o.getVersioning())
                            .autoTiering(o.getAutoTiering());

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
     * The Object Storage namespace in which the bucket resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    public String getNamespace() {
        return namespace;
    }

    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: my-new-bucket1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The compartment ID in which the bucket is authorized.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Arbitrary string keys and values for user-defined metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the user who created the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The date and time the bucket was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The entity tag (ETag) for the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    private final String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The type of public access enabled on this bucket.
     * A bucket is set to {@code NoPublicAccess} by default, which only allows an authenticated caller to access the
     * bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access is allowed for the
     * {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled on the
     * bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
     *
     **/
    public enum PublicAccessType {
        NoPublicAccess("NoPublicAccess"),
        ObjectRead("ObjectRead"),
        ObjectReadWithoutList("ObjectReadWithoutList"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The type of public access enabled on this bucket.
     * A bucket is set to {@code NoPublicAccess} by default, which only allows an authenticated caller to access the
     * bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access is allowed for the
     * {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled on the
     * bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
    private final PublicAccessType publicAccessType;

    public PublicAccessType getPublicAccessType() {
        return publicAccessType;
    }

    /**
     * The storage tier type assigned to the bucket. A bucket is set to {@code Standard} tier by default, which means
     * objects uploaded or copied to the bucket will be in the standard storage tier. When the {@code Archive} tier type
     * is set explicitly for a bucket, objects uploaded or copied to the bucket will be stored in archive storage.
     * The {@code storageTier} property is immutable after bucket is created.
     *
     **/
    public enum StorageTier {
        Standard("Standard"),
        Archive("Archive"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The storage tier type assigned to the bucket. A bucket is set to {@code Standard} tier by default, which means
     * objects uploaded or copied to the bucket will be in the standard storage tier. When the {@code Archive} tier type
     * is set explicitly for a bucket, objects uploaded or copied to the bucket will be stored in archive storage.
     * The {@code storageTier} property is immutable after bucket is created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    private final StorageTier storageTier;

    public StorageTier getStorageTier() {
        return storageTier;
    }

    /**
     * Whether or not events are emitted for object state changes in this bucket. By default, {@code objectEventsEnabled} is
     * set to {@code false}. Set {@code objectEventsEnabled} to {@code true} to emit events for object state changes. For more information
     * about events, see [Overview of Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectEventsEnabled")
    private final Boolean objectEventsEnabled;

    public Boolean getObjectEventsEnabled() {
        return objectEventsEnabled;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a master encryption key used to call the Key Management
     * service to generate a data encryption key or to encrypt or decrypt a data encryption key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The entity tag (ETag) for the live object lifecycle policy on the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectLifecyclePolicyEtag")
    private final String objectLifecyclePolicyEtag;

    public String getObjectLifecyclePolicyEtag() {
        return objectLifecyclePolicyEtag;
    }

    /**
     * The approximate number of objects in the bucket. Count statistics are reported periodically. You will see a
     * lag between what is displayed and the actual object count.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateCount")
    private final Long approximateCount;

    public Long getApproximateCount() {
        return approximateCount;
    }

    /**
     * The approximate total size in bytes of all objects in the bucket. Size statistics are reported periodically. You will
     * see a lag between what is displayed and the actual size of the bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateSize")
    private final Long approximateSize;

    public Long getApproximateSize() {
        return approximateSize;
    }

    /**
     * Whether or not this bucket is a replication source. By default, {@code replicationEnabled} is set to {@code false}. This will
     * be set to 'true' when you create a replication policy for the bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationEnabled")
    private final Boolean replicationEnabled;

    public Boolean getReplicationEnabled() {
        return replicationEnabled;
    }

    /**
     * Whether or not this bucket is read only. By default, {@code isReadOnly} is set to {@code false}. This will
     * be set to 'true' when this bucket is configured as a destination in a replication policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    private final Boolean isReadOnly;

    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The versioning status on the bucket. A bucket is created with versioning {@code Disabled} by default.
     * For versioning {@code Enabled}, objects are protected from overwrites and deletes, by maintaining their version history. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     *
     **/
    public enum Versioning {
        Enabled("Enabled"),
        Suspended("Suspended"),
        Disabled("Disabled"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The versioning status on the bucket. A bucket is created with versioning {@code Disabled} by default.
     * For versioning {@code Enabled}, objects are protected from overwrites and deletes, by maintaining their version history. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versioning")
    private final Versioning versioning;

    public Versioning getVersioning() {
        return versioning;
    }

    /**
     * The auto tiering status on the bucket. A bucket is created with auto tiering {@code Disabled} by default.
     * For auto tiering {@code InfrequentAccess}, objects are transitioned automatically between the 'Standard'
     * and 'InfrequentAccess' tiers based on the access pattern of the objects.
     *
     **/
    public enum AutoTiering {
        Disabled("Disabled"),
        InfrequentAccess("InfrequentAccess"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The auto tiering status on the bucket. A bucket is created with auto tiering {@code Disabled} by default.
     * For auto tiering {@code InfrequentAccess}, objects are transitioned automatically between the 'Standard'
     * and 'InfrequentAccess' tiers based on the access pattern of the objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
    private final AutoTiering autoTiering;

    public AutoTiering getAutoTiering() {
        return autoTiering;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Bucket(");
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
