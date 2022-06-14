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
    builder = UpdateBucketDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateBucketDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespace",
        "compartmentId",
        "name",
        "metadata",
        "publicAccessType",
        "objectEventsEnabled",
        "freeformTags",
        "definedTags",
        "kmsKeyId",
        "versioning",
        "autoTiering"
    })
    public UpdateBucketDetails(
            String namespace,
            String compartmentId,
            String name,
            java.util.Map<String, String> metadata,
            PublicAccessType publicAccessType,
            Boolean objectEventsEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String kmsKeyId,
            Versioning versioning,
            Bucket.AutoTiering autoTiering) {
        super();
        this.namespace = namespace;
        this.compartmentId = compartmentId;
        this.name = name;
        this.metadata = metadata;
        this.publicAccessType = publicAccessType;
        this.objectEventsEnabled = objectEventsEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.kmsKeyId = kmsKeyId;
        this.versioning = versioning;
        this.autoTiering = autoTiering;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Object Storage namespace in which the bucket lives.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace in which the bucket lives.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The compartmentId for the compartment to move the bucket to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartmentId for the compartment to move the bucket to.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the bucket. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
         * Bucket names must be unique within an Object Storage namespace. Avoid entering confidential information.
         * Example: my-new-bucket1
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the bucket. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
         * Bucket names must be unique within an Object Storage namespace. Avoid entering confidential information.
         * Example: my-new-bucket1
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Arbitrary string, up to 4KB, of keys and values for user-defined metadata.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Arbitrary string, up to 4KB, of keys and values for user-defined metadata.
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The type of public access enabled on this bucket. A bucket is set to {@code NoPublicAccess} by default, which only allows an
         * authenticated caller to access the bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access
         * is allowed for the {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled
         * on the bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
        private PublicAccessType publicAccessType;

        /**
         * The type of public access enabled on this bucket. A bucket is set to {@code NoPublicAccess} by default, which only allows an
         * authenticated caller to access the bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access
         * is allowed for the {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled
         * on the bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
         *
         * @param publicAccessType the value to set
         * @return this builder
         **/
        public Builder publicAccessType(PublicAccessType publicAccessType) {
            this.publicAccessType = publicAccessType;
            this.__explicitlySet__.add("publicAccessType");
            return this;
        }
        /**
         * Whether or not events are emitted for object state changes in this bucket. By default, {@code objectEventsEnabled} is
         * set to {@code false}. Set {@code objectEventsEnabled} to {@code true} to emit events for object state changes. For more information
         * about events, see [Overview of Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectEventsEnabled")
        private Boolean objectEventsEnabled;

        /**
         * Whether or not events are emitted for object state changes in this bucket. By default, {@code objectEventsEnabled} is
         * set to {@code false}. Set {@code objectEventsEnabled} to {@code true} to emit events for object state changes. For more information
         * about events, see [Overview of Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
         *
         * @param objectEventsEnabled the value to set
         * @return this builder
         **/
        public Builder objectEventsEnabled(Boolean objectEventsEnabled) {
            this.objectEventsEnabled = objectEventsEnabled;
            this.__explicitlySet__.add("objectEventsEnabled");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {"Operations": {"CostCenter": "42"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {"Operations": {"CostCenter": "42"}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Key Management master encryption key to associate
         * with the specified bucket. If this value is empty, the Update operation will remove the associated key, if
         * there is one, from the bucket. (The bucket will continue to be encrypted, but with an encryption key managed
         * by Oracle.)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Key Management master encryption key to associate
         * with the specified bucket. If this value is empty, the Update operation will remove the associated key, if
         * there is one, from the bucket. (The bucket will continue to be encrypted, but with an encryption key managed
         * by Oracle.)
         *
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The versioning status on the bucket. If in state {@code Enabled}, multiple versions of the same object can be kept in the bucket.
         * When the object is overwritten or deleted, previous versions will still be available. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
         * Versioning cannot be disabled on a bucket once enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versioning")
        private Versioning versioning;

        /**
         * The versioning status on the bucket. If in state {@code Enabled}, multiple versions of the same object can be kept in the bucket.
         * When the object is overwritten or deleted, previous versions will still be available. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
         * Versioning cannot be disabled on a bucket once enabled.
         *
         * @param versioning the value to set
         * @return this builder
         **/
        public Builder versioning(Versioning versioning) {
            this.versioning = versioning;
            this.__explicitlySet__.add("versioning");
            return this;
        }
        /**
         * The auto tiering status on the bucket. If in state {@code InfrequentAccess}, objects are transitioned
         * automatically between the 'Standard' and 'InfrequentAccess' tiers based on the access pattern of the objects.
         * When auto tiering is {@code Disabled}, there will be no automatic transitions between storage tiers.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
        private Bucket.AutoTiering autoTiering;

        /**
         * The auto tiering status on the bucket. If in state {@code InfrequentAccess}, objects are transitioned
         * automatically between the 'Standard' and 'InfrequentAccess' tiers based on the access pattern of the objects.
         * When auto tiering is {@code Disabled}, there will be no automatic transitions between storage tiers.
         *
         * @param autoTiering the value to set
         * @return this builder
         **/
        public Builder autoTiering(Bucket.AutoTiering autoTiering) {
            this.autoTiering = autoTiering;
            this.__explicitlySet__.add("autoTiering");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBucketDetails build() {
            UpdateBucketDetails __instance__ =
                    new UpdateBucketDetails(
                            namespace,
                            compartmentId,
                            name,
                            metadata,
                            publicAccessType,
                            objectEventsEnabled,
                            freeformTags,
                            definedTags,
                            kmsKeyId,
                            versioning,
                            autoTiering);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBucketDetails o) {
            Builder copiedBuilder =
                    namespace(o.getNamespace())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .metadata(o.getMetadata())
                            .publicAccessType(o.getPublicAccessType())
                            .objectEventsEnabled(o.getObjectEventsEnabled())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .kmsKeyId(o.getKmsKeyId())
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
     * The Object Storage namespace in which the bucket lives.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace in which the bucket lives.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * The compartmentId for the compartment to move the bucket to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartmentId for the compartment to move the bucket to.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the bucket. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * Bucket names must be unique within an Object Storage namespace. Avoid entering confidential information.
     * Example: my-new-bucket1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the bucket. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * Bucket names must be unique within an Object Storage namespace. Avoid entering confidential information.
     * Example: my-new-bucket1
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Arbitrary string, up to 4KB, of keys and values for user-defined metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Arbitrary string, up to 4KB, of keys and values for user-defined metadata.
     * @return the value
     **/
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * The type of public access enabled on this bucket. A bucket is set to {@code NoPublicAccess} by default, which only allows an
     * authenticated caller to access the bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access
     * is allowed for the {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled
     * on the bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
     *
     **/
    public enum PublicAccessType {
        NoPublicAccess("NoPublicAccess"),
        ObjectRead("ObjectRead"),
        ObjectReadWithoutList("ObjectReadWithoutList"),
        ;

        private final String value;
        private static java.util.Map<String, PublicAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicAccessType v : PublicAccessType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid PublicAccessType: " + key);
        }
    };
    /**
     * The type of public access enabled on this bucket. A bucket is set to {@code NoPublicAccess} by default, which only allows an
     * authenticated caller to access the bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access
     * is allowed for the {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled
     * on the bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
    private final PublicAccessType publicAccessType;

    /**
     * The type of public access enabled on this bucket. A bucket is set to {@code NoPublicAccess} by default, which only allows an
     * authenticated caller to access the bucket and its contents. When {@code ObjectRead} is enabled on the bucket, public access
     * is allowed for the {@code GetObject}, {@code HeadObject}, and {@code ListObjects} operations. When {@code ObjectReadWithoutList} is enabled
     * on the bucket, public access is allowed for the {@code GetObject} and {@code HeadObject} operations.
     *
     * @return the value
     **/
    public PublicAccessType getPublicAccessType() {
        return publicAccessType;
    }

    /**
     * Whether or not events are emitted for object state changes in this bucket. By default, {@code objectEventsEnabled} is
     * set to {@code false}. Set {@code objectEventsEnabled} to {@code true} to emit events for object state changes. For more information
     * about events, see [Overview of Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectEventsEnabled")
    private final Boolean objectEventsEnabled;

    /**
     * Whether or not events are emitted for object state changes in this bucket. By default, {@code objectEventsEnabled} is
     * set to {@code false}. Set {@code objectEventsEnabled} to {@code true} to emit events for object state changes. For more information
     * about events, see [Overview of Events](https://docs.cloud.oracle.com/Content/Events/Concepts/eventsoverview.htm).
     *
     * @return the value
     **/
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

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {"Operations": {"CostCenter": "42"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {"Operations": {"CostCenter": "42"}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Key Management master encryption key to associate
     * with the specified bucket. If this value is empty, the Update operation will remove the associated key, if
     * there is one, from the bucket. (The bucket will continue to be encrypted, but with an encryption key managed
     * by Oracle.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Key Management master encryption key to associate
     * with the specified bucket. If this value is empty, the Update operation will remove the associated key, if
     * there is one, from the bucket. (The bucket will continue to be encrypted, but with an encryption key managed
     * by Oracle.)
     *
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The versioning status on the bucket. If in state {@code Enabled}, multiple versions of the same object can be kept in the bucket.
     * When the object is overwritten or deleted, previous versions will still be available. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     * Versioning cannot be disabled on a bucket once enabled.
     *
     **/
    public enum Versioning {
        Enabled("Enabled"),
        Suspended("Suspended"),
        ;

        private final String value;
        private static java.util.Map<String, Versioning> map;

        static {
            map = new java.util.HashMap<>();
            for (Versioning v : Versioning.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Versioning: " + key);
        }
    };
    /**
     * The versioning status on the bucket. If in state {@code Enabled}, multiple versions of the same object can be kept in the bucket.
     * When the object is overwritten or deleted, previous versions will still be available. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     * Versioning cannot be disabled on a bucket once enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versioning")
    private final Versioning versioning;

    /**
     * The versioning status on the bucket. If in state {@code Enabled}, multiple versions of the same object can be kept in the bucket.
     * When the object is overwritten or deleted, previous versions will still be available. When versioning is {@code Suspended}, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     * Versioning cannot be disabled on a bucket once enabled.
     *
     * @return the value
     **/
    public Versioning getVersioning() {
        return versioning;
    }

    /**
     * The auto tiering status on the bucket. If in state {@code InfrequentAccess}, objects are transitioned
     * automatically between the 'Standard' and 'InfrequentAccess' tiers based on the access pattern of the objects.
     * When auto tiering is {@code Disabled}, there will be no automatic transitions between storage tiers.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
    private final Bucket.AutoTiering autoTiering;

    /**
     * The auto tiering status on the bucket. If in state {@code InfrequentAccess}, objects are transitioned
     * automatically between the 'Standard' and 'InfrequentAccess' tiers based on the access pattern of the objects.
     * When auto tiering is {@code Disabled}, there will be no automatic transitions between storage tiers.
     *
     * @return the value
     **/
    public Bucket.AutoTiering getAutoTiering() {
        return autoTiering;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateBucketDetails(");
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", publicAccessType=").append(String.valueOf(this.publicAccessType));
        sb.append(", objectEventsEnabled=").append(String.valueOf(this.objectEventsEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
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
        if (!(o instanceof UpdateBucketDetails)) {
            return false;
        }

        UpdateBucketDetails other = (UpdateBucketDetails) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.publicAccessType, other.publicAccessType)
                && java.util.Objects.equals(this.objectEventsEnabled, other.objectEventsEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.versioning, other.versioning)
                && java.util.Objects.equals(this.autoTiering, other.autoTiering)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.publicAccessType == null ? 43 : this.publicAccessType.hashCode());
        result =
                (result * PRIME)
                        + (this.objectEventsEnabled == null
                                ? 43
                                : this.objectEventsEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
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
