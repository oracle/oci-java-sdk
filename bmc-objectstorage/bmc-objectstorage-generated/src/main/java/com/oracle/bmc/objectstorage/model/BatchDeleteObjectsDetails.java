/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * Batch delete request details. <br>
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
        builder = BatchDeleteObjectsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BatchDeleteObjectsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"objects", "isSkipDeletedResult"})
    public BatchDeleteObjectsDetails(
            java.util.List<BatchDeleteObjectIdentifier> objects, Boolean isSkipDeletedResult) {
        super();
        this.objects = objects;
        this.isSkipDeletedResult = isSkipDeletedResult;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of the objects to delete. */
        @com.fasterxml.jackson.annotation.JsonProperty("objects")
        private java.util.List<BatchDeleteObjectIdentifier> objects;

        /**
         * The list of the objects to delete.
         *
         * @param objects the value to set
         * @return this builder
         */
        public Builder objects(java.util.List<BatchDeleteObjectIdentifier> objects) {
            this.objects = objects;
            this.__explicitlySet__.add("objects");
            return this;
        }
        /**
         * Specifies whether to skip the details of successfully deleted objects in the response. If
         * specified true then only the details of failed deletes will be available in the response.
         * Defaults to false.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSkipDeletedResult")
        private Boolean isSkipDeletedResult;

        /**
         * Specifies whether to skip the details of successfully deleted objects in the response. If
         * specified true then only the details of failed deletes will be available in the response.
         * Defaults to false.
         *
         * @param isSkipDeletedResult the value to set
         * @return this builder
         */
        public Builder isSkipDeletedResult(Boolean isSkipDeletedResult) {
            this.isSkipDeletedResult = isSkipDeletedResult;
            this.__explicitlySet__.add("isSkipDeletedResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BatchDeleteObjectsDetails build() {
            BatchDeleteObjectsDetails model =
                    new BatchDeleteObjectsDetails(this.objects, this.isSkipDeletedResult);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BatchDeleteObjectsDetails model) {
            if (model.wasPropertyExplicitlySet("objects")) {
                this.objects(model.getObjects());
            }
            if (model.wasPropertyExplicitlySet("isSkipDeletedResult")) {
                this.isSkipDeletedResult(model.getIsSkipDeletedResult());
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

    /** The list of the objects to delete. */
    @com.fasterxml.jackson.annotation.JsonProperty("objects")
    private final java.util.List<BatchDeleteObjectIdentifier> objects;

    /**
     * The list of the objects to delete.
     *
     * @return the value
     */
    public java.util.List<BatchDeleteObjectIdentifier> getObjects() {
        return objects;
    }

    /**
     * Specifies whether to skip the details of successfully deleted objects in the response. If
     * specified true then only the details of failed deletes will be available in the response.
     * Defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipDeletedResult")
    private final Boolean isSkipDeletedResult;

    /**
     * Specifies whether to skip the details of successfully deleted objects in the response. If
     * specified true then only the details of failed deletes will be available in the response.
     * Defaults to false.
     *
     * @return the value
     */
    public Boolean getIsSkipDeletedResult() {
        return isSkipDeletedResult;
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
        sb.append("BatchDeleteObjectsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("objects=").append(String.valueOf(this.objects));
        sb.append(", isSkipDeletedResult=").append(String.valueOf(this.isSkipDeletedResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchDeleteObjectsDetails)) {
            return false;
        }

        BatchDeleteObjectsDetails other = (BatchDeleteObjectsDetails) o;
        return java.util.Objects.equals(this.objects, other.objects)
                && java.util.Objects.equals(this.isSkipDeletedResult, other.isSkipDeletedResult)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objects == null ? 43 : this.objects.hashCode());
        result =
                (result * PRIME)
                        + (this.isSkipDeletedResult == null
                                ? 43
                                : this.isSkipDeletedResult.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
