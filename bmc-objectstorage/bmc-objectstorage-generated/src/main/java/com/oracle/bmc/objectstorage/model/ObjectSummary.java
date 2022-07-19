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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ObjectSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "size",
        "md5",
        "timeCreated",
        "etag",
        "storageTier",
        "archivalState",
        "timeModified"
    })
    public ObjectSummary(
            String name,
            Long size,
            String md5,
            java.util.Date timeCreated,
            String etag,
            StorageTier storageTier,
            ArchivalState archivalState,
            java.util.Date timeModified) {
        super();
        this.name = name;
        this.size = size;
        this.md5 = md5;
        this.timeCreated = timeCreated;
        this.etag = etag;
        this.storageTier = storageTier;
        this.archivalState = archivalState;
        this.timeModified = timeModified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the object. Avoid entering confidential information.
         * Example: test/object1.log
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the object. Avoid entering confidential information.
         * Example: test/object1.log
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
         * Size of the object in bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Long size;

        /**
         * Size of the object in bytes.
         * @param size the value to set
         * @return this builder
         **/
        public Builder size(Long size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }
        /**
         * Base64-encoded MD5 hash of the object data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("md5")
        private String md5;

        /**
         * Base64-encoded MD5 hash of the object data.
         * @param md5 the value to set
         * @return this builder
         **/
        public Builder md5(String md5) {
            this.md5 = md5;
            this.__explicitlySet__.add("md5");
            return this;
        }
        /**
         * The date and time the object was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the object was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The current entity tag (ETag) for the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        /**
         * The current entity tag (ETag) for the object.
         * @param etag the value to set
         * @return this builder
         **/
        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }
        /**
         * The storage tier that the object is stored in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        /**
         * The storage tier that the object is stored in.
         * @param storageTier the value to set
         * @return this builder
         **/
        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }
        /**
         * Archival state of an object. This field is set only for objects in Archive tier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archivalState")
        private ArchivalState archivalState;

        /**
         * Archival state of an object. This field is set only for objects in Archive tier.
         * @param archivalState the value to set
         * @return this builder
         **/
        public Builder archivalState(ArchivalState archivalState) {
            this.archivalState = archivalState;
            this.__explicitlySet__.add("archivalState");
            return this;
        }
        /**
         * The date and time the object was modified, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The date and time the object was modified, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
         * @param timeModified the value to set
         * @return this builder
         **/
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectSummary build() {
            ObjectSummary __instance__ =
                    new ObjectSummary(
                            name,
                            size,
                            md5,
                            timeCreated,
                            etag,
                            storageTier,
                            archivalState,
                            timeModified);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .size(o.getSize())
                            .md5(o.getMd5())
                            .timeCreated(o.getTimeCreated())
                            .etag(o.getEtag())
                            .storageTier(o.getStorageTier())
                            .archivalState(o.getArchivalState())
                            .timeModified(o.getTimeModified());

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
     * The name of the object. Avoid entering confidential information.
     * Example: test/object1.log
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the object. Avoid entering confidential information.
     * Example: test/object1.log
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Size of the object in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Long size;

    /**
     * Size of the object in bytes.
     * @return the value
     **/
    public Long getSize() {
        return size;
    }

    /**
     * Base64-encoded MD5 hash of the object data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("md5")
    private final String md5;

    /**
     * Base64-encoded MD5 hash of the object data.
     * @return the value
     **/
    public String getMd5() {
        return md5;
    }

    /**
     * The date and time the object was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the object was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current entity tag (ETag) for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    private final String etag;

    /**
     * The current entity tag (ETag) for the object.
     * @return the value
     **/
    public String getEtag() {
        return etag;
    }

    /**
     * The storage tier that the object is stored in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    private final StorageTier storageTier;

    /**
     * The storage tier that the object is stored in.
     * @return the value
     **/
    public StorageTier getStorageTier() {
        return storageTier;
    }

    /**
     * Archival state of an object. This field is set only for objects in Archive tier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archivalState")
    private final ArchivalState archivalState;

    /**
     * Archival state of an object. This field is set only for objects in Archive tier.
     * @return the value
     **/
    public ArchivalState getArchivalState() {
        return archivalState;
    }

    /**
     * The date and time the object was modified, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The date and time the object was modified, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
     * @return the value
     **/
    public java.util.Date getTimeModified() {
        return timeModified;
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
        sb.append("ObjectSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(", md5=").append(String.valueOf(this.md5));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", etag=").append(String.valueOf(this.etag));
        sb.append(", storageTier=").append(String.valueOf(this.storageTier));
        sb.append(", archivalState=").append(String.valueOf(this.archivalState));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectSummary)) {
            return false;
        }

        ObjectSummary other = (ObjectSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.size, other.size)
                && java.util.Objects.equals(this.md5, other.md5)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.storageTier, other.storageTier)
                && java.util.Objects.equals(this.archivalState, other.archivalState)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + (this.md5 == null ? 43 : this.md5.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.storageTier == null ? 43 : this.storageTier.hashCode());
        result =
                (result * PRIME)
                        + (this.archivalState == null ? 43 : this.archivalState.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
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
