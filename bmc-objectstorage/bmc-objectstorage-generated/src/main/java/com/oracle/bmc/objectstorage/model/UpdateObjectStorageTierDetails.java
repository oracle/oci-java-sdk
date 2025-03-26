/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To change the storage tier of an object, we specify the object name and the desired
 * storage tier in the body. Objects can be moved between Standard and InfrequentAccess
 * tiers and from Standard or InfrequentAccess tier to Archive tier. If a version id is
 * specified, only the specified version of the object is moved to a different storage
 * tier, else the current version is used.
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
    builder = UpdateObjectStorageTierDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateObjectStorageTierDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"objectName", "storageTier", "versionId"})
    public UpdateObjectStorageTierDetails(
            String objectName, StorageTier storageTier, String versionId) {
        super();
        this.objectName = objectName;
        this.storageTier = storageTier;
        this.versionId = versionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An object for which the storage tier needs to be changed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * An object for which the storage tier needs to be changed.
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * The storage tier that the object should be moved to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        /**
         * The storage tier that the object should be moved to.
         * @param storageTier the value to set
         * @return this builder
         **/
        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }
        /**
         * The versionId of the object. Current object version is used by default.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionId")
        private String versionId;

        /**
         * The versionId of the object. Current object version is used by default.
         *
         * @param versionId the value to set
         * @return this builder
         **/
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            this.__explicitlySet__.add("versionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateObjectStorageTierDetails build() {
            UpdateObjectStorageTierDetails model =
                    new UpdateObjectStorageTierDetails(
                            this.objectName, this.storageTier, this.versionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateObjectStorageTierDetails model) {
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("storageTier")) {
                this.storageTier(model.getStorageTier());
            }
            if (model.wasPropertyExplicitlySet("versionId")) {
                this.versionId(model.getVersionId());
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
     * An object for which the storage tier needs to be changed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * An object for which the storage tier needs to be changed.
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
    }

    /**
     * The storage tier that the object should be moved to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    private final StorageTier storageTier;

    /**
     * The storage tier that the object should be moved to.
     * @return the value
     **/
    public StorageTier getStorageTier() {
        return storageTier;
    }

    /**
     * The versionId of the object. Current object version is used by default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionId")
    private final String versionId;

    /**
     * The versionId of the object. Current object version is used by default.
     *
     * @return the value
     **/
    public String getVersionId() {
        return versionId;
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
        sb.append("UpdateObjectStorageTierDetails(");
        sb.append("super=").append(super.toString());
        sb.append("objectName=").append(String.valueOf(this.objectName));
        sb.append(", storageTier=").append(String.valueOf(this.storageTier));
        sb.append(", versionId=").append(String.valueOf(this.versionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateObjectStorageTierDetails)) {
            return false;
        }

        UpdateObjectStorageTierDetails other = (UpdateObjectStorageTierDetails) o;
        return java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.storageTier, other.storageTier)
                && java.util.Objects.equals(this.versionId, other.versionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.storageTier == null ? 43 : this.storageTier.hashCode());
        result = (result * PRIME) + (this.versionId == null ? 43 : this.versionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
