/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Object Storage Details required to provision buckets. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ObjectStorageDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ObjectStorageDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "objectVersioning",
        "storageTier",
        "autoTiering"
    })
    public ObjectStorageDetail(
            String instanceId,
            ObjectVersioning objectVersioning,
            StorageTier storageTier,
            AutoTiering autoTiering) {
        super();
        this.instanceId = instanceId;
        this.objectVersioning = objectVersioning;
        this.storageTier = storageTier;
        this.autoTiering = autoTiering;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Id for Object Storage instance to be provisioned. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Id for Object Storage instance to be provisioned.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * Mentions whether the object versioning to be enabled or not,Allowed values are "ENABLED"
         * / "DISABLED"/"SUSPENDED"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersioning")
        private ObjectVersioning objectVersioning;

        /**
         * Mentions whether the object versioning to be enabled or not,Allowed values are "ENABLED"
         * / "DISABLED"/"SUSPENDED"
         *
         * @param objectVersioning the value to set
         * @return this builder
         */
        public Builder objectVersioning(ObjectVersioning objectVersioning) {
            this.objectVersioning = objectVersioning;
            this.__explicitlySet__.add("objectVersioning");
            return this;
        }
        /**
         * Mentions which storage tier to use for the bucket,Allowed values are "STANDARD" /
         * "ARCHIVE"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        /**
         * Mentions which storage tier to use for the bucket,Allowed values are "STANDARD" /
         * "ARCHIVE"
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
         * It sets the auto-tiering status on the bucket.Allowed values are "DISABLED" /
         * "INFREQUENTACCESS"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
        private AutoTiering autoTiering;

        /**
         * It sets the auto-tiering status on the bucket.Allowed values are "DISABLED" /
         * "INFREQUENTACCESS"
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

        public ObjectStorageDetail build() {
            ObjectStorageDetail model =
                    new ObjectStorageDetail(
                            this.instanceId,
                            this.objectVersioning,
                            this.storageTier,
                            this.autoTiering);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("objectVersioning")) {
                this.objectVersioning(model.getObjectVersioning());
            }
            if (model.wasPropertyExplicitlySet("storageTier")) {
                this.storageTier(model.getStorageTier());
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

    /** Id for Object Storage instance to be provisioned. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Id for Object Storage instance to be provisioned.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Mentions whether the object versioning to be enabled or not,Allowed values are "ENABLED" /
     * "DISABLED"/"SUSPENDED"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersioning")
    private final ObjectVersioning objectVersioning;

    /**
     * Mentions whether the object versioning to be enabled or not,Allowed values are "ENABLED" /
     * "DISABLED"/"SUSPENDED"
     *
     * @return the value
     */
    public ObjectVersioning getObjectVersioning() {
        return objectVersioning;
    }

    /**
     * Mentions which storage tier to use for the bucket,Allowed values are "STANDARD" / "ARCHIVE"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    private final StorageTier storageTier;

    /**
     * Mentions which storage tier to use for the bucket,Allowed values are "STANDARD" / "ARCHIVE"
     *
     * @return the value
     */
    public StorageTier getStorageTier() {
        return storageTier;
    }

    /**
     * It sets the auto-tiering status on the bucket.Allowed values are "DISABLED" /
     * "INFREQUENTACCESS"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoTiering")
    private final AutoTiering autoTiering;

    /**
     * It sets the auto-tiering status on the bucket.Allowed values are "DISABLED" /
     * "INFREQUENTACCESS"
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
        sb.append("ObjectStorageDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", objectVersioning=").append(String.valueOf(this.objectVersioning));
        sb.append(", storageTier=").append(String.valueOf(this.storageTier));
        sb.append(", autoTiering=").append(String.valueOf(this.autoTiering));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectStorageDetail)) {
            return false;
        }

        ObjectStorageDetail other = (ObjectStorageDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.objectVersioning, other.objectVersioning)
                && java.util.Objects.equals(this.storageTier, other.storageTier)
                && java.util.Objects.equals(this.autoTiering, other.autoTiering)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersioning == null ? 43 : this.objectVersioning.hashCode());
        result = (result * PRIME) + (this.storageTier == null ? 43 : this.storageTier.hashCode());
        result = (result * PRIME) + (this.autoTiering == null ? 43 : this.autoTiering.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
