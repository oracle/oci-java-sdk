/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.gdp.model;

/**
 * Information about a particular bucket.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BucketDetailsDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BucketDetailsDefinition
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bucketType", "namespace", "name", "id"})
    public BucketDetailsDefinition(
            BucketType bucketType, String namespace, String name, String id) {
        super();
        this.bucketType = bucketType;
        this.namespace = namespace;
        this.name = name;
        this.id = id;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of bucket. SENDER pipelines can be SOURCE, TRANSFER, REJECT, or FAILED. RECEIVER pipelines have a DESTINATION bucket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketType")
        private BucketType bucketType;

        /**
         * Type of bucket. SENDER pipelines can be SOURCE, TRANSFER, REJECT, or FAILED. RECEIVER pipelines have a DESTINATION bucket.
         * @param bucketType the value to set
         * @return this builder
         **/
        public Builder bucketType(BucketType bucketType) {
            this.bucketType = bucketType;
            this.__explicitlySet__.add("bucketType");
            return this;
        }
        /**
         * Namespace of the bucket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Namespace of the bucket.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Name of the bucket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the bucket.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * OCID of the bucket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the bucket.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BucketDetailsDefinition build() {
            BucketDetailsDefinition model =
                    new BucketDetailsDefinition(
                            this.bucketType, this.namespace, this.name, this.id);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BucketDetailsDefinition model) {
            if (model.wasPropertyExplicitlySet("bucketType")) {
                this.bucketType(model.getBucketType());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            return this;
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
     * Type of bucket. SENDER pipelines can be SOURCE, TRANSFER, REJECT, or FAILED. RECEIVER pipelines have a DESTINATION bucket.
     **/
    public enum BucketType {
        Source("SOURCE"),
        Transfer("TRANSFER"),
        Reject("REJECT"),
        Destination("DESTINATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BucketType.class);

        private final String value;
        private static java.util.Map<String, BucketType> map;

        static {
            map = new java.util.HashMap<>();
            for (BucketType v : BucketType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BucketType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BucketType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BucketType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of bucket. SENDER pipelines can be SOURCE, TRANSFER, REJECT, or FAILED. RECEIVER pipelines have a DESTINATION bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketType")
    private final BucketType bucketType;

    /**
     * Type of bucket. SENDER pipelines can be SOURCE, TRANSFER, REJECT, or FAILED. RECEIVER pipelines have a DESTINATION bucket.
     * @return the value
     **/
    public BucketType getBucketType() {
        return bucketType;
    }

    /**
     * Namespace of the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Namespace of the bucket.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * Name of the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the bucket.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * OCID of the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the bucket.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BucketDetailsDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("bucketType=").append(String.valueOf(this.bucketType));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BucketDetailsDefinition)) {
            return false;
        }

        BucketDetailsDefinition other = (BucketDetailsDefinition) o;
        return java.util.Objects.equals(this.bucketType, other.bucketType)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.id, other.id)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bucketType == null ? 43 : this.bucketType.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
