/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * OCI Object Storage bucket will be used to store dump files for the migration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateMySqlObjectStorageDataTransferMediumDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateMySqlObjectStorageDataTransferMediumDetails
        extends UpdateMySqlDataTransferMediumDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucket")
        private UpdateObjectStoreBucket objectStorageBucket;

        public Builder objectStorageBucket(UpdateObjectStoreBucket objectStorageBucket) {
            this.objectStorageBucket = objectStorageBucket;
            this.__explicitlySet__.add("objectStorageBucket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMySqlObjectStorageDataTransferMediumDetails build() {
            UpdateMySqlObjectStorageDataTransferMediumDetails model =
                    new UpdateMySqlObjectStorageDataTransferMediumDetails(this.objectStorageBucket);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMySqlObjectStorageDataTransferMediumDetails model) {
            if (model.wasPropertyExplicitlySet("objectStorageBucket")) {
                this.objectStorageBucket(model.getObjectStorageBucket());
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
    public UpdateMySqlObjectStorageDataTransferMediumDetails(
            UpdateObjectStoreBucket objectStorageBucket) {
        super();
        this.objectStorageBucket = objectStorageBucket;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucket")
    private final UpdateObjectStoreBucket objectStorageBucket;

    public UpdateObjectStoreBucket getObjectStorageBucket() {
        return objectStorageBucket;
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
        sb.append("UpdateMySqlObjectStorageDataTransferMediumDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", objectStorageBucket=").append(String.valueOf(this.objectStorageBucket));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMySqlObjectStorageDataTransferMediumDetails)) {
            return false;
        }

        UpdateMySqlObjectStorageDataTransferMediumDetails other =
                (UpdateMySqlObjectStorageDataTransferMediumDetails) o;
        return java.util.Objects.equals(this.objectStorageBucket, other.objectStorageBucket)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.objectStorageBucket == null
                                ? 43
                                : this.objectStorageBucket.hashCode());
        return result;
    }
}
