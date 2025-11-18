/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * Result of a batch delete operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BatchDeleteObjectsResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BatchDeleteObjectsResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"deleted", "failed"})
    public BatchDeleteObjectsResult(
            java.util.List<DeletedObjectResult> deleted,
            java.util.List<FailedObjectResult> failed) {
        super();
        this.deleted = deleted;
        this.failed = failed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Details of successfully deleted objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("deleted")
        private java.util.List<DeletedObjectResult> deleted;

        /**
         * Details of successfully deleted objects.
         *
         * @param deleted the value to set
         * @return this builder
         */
        public Builder deleted(java.util.List<DeletedObjectResult> deleted) {
            this.deleted = deleted;
            this.__explicitlySet__.add("deleted");
            return this;
        }
        /** Details of failed delete operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("failed")
        private java.util.List<FailedObjectResult> failed;

        /**
         * Details of failed delete operations.
         *
         * @param failed the value to set
         * @return this builder
         */
        public Builder failed(java.util.List<FailedObjectResult> failed) {
            this.failed = failed;
            this.__explicitlySet__.add("failed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BatchDeleteObjectsResult build() {
            BatchDeleteObjectsResult model =
                    new BatchDeleteObjectsResult(this.deleted, this.failed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BatchDeleteObjectsResult model) {
            if (model.wasPropertyExplicitlySet("deleted")) {
                this.deleted(model.getDeleted());
            }
            if (model.wasPropertyExplicitlySet("failed")) {
                this.failed(model.getFailed());
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

    /** Details of successfully deleted objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("deleted")
    private final java.util.List<DeletedObjectResult> deleted;

    /**
     * Details of successfully deleted objects.
     *
     * @return the value
     */
    public java.util.List<DeletedObjectResult> getDeleted() {
        return deleted;
    }

    /** Details of failed delete operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("failed")
    private final java.util.List<FailedObjectResult> failed;

    /**
     * Details of failed delete operations.
     *
     * @return the value
     */
    public java.util.List<FailedObjectResult> getFailed() {
        return failed;
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
        sb.append("BatchDeleteObjectsResult(");
        sb.append("super=").append(super.toString());
        sb.append("deleted=").append(String.valueOf(this.deleted));
        sb.append(", failed=").append(String.valueOf(this.failed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchDeleteObjectsResult)) {
            return false;
        }

        BatchDeleteObjectsResult other = (BatchDeleteObjectsResult) o;
        return java.util.Objects.equals(this.deleted, other.deleted)
                && java.util.Objects.equals(this.failed, other.failed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deleted == null ? 43 : this.deleted.hashCode());
        result = (result * PRIME) + (this.failed == null ? 43 : this.failed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
