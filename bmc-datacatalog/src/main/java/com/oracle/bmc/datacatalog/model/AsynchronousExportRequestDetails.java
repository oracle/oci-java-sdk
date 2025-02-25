/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details for an export request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AsynchronousExportRequestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AsynchronousExportRequestDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"objectStorageTarget"})
    public AsynchronousExportRequestDetails(ObjectStorageObjectReference objectStorageTarget) {
        super();
        this.objectStorageTarget = objectStorageTarget;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageTarget")
        private ObjectStorageObjectReference objectStorageTarget;

        public Builder objectStorageTarget(ObjectStorageObjectReference objectStorageTarget) {
            this.objectStorageTarget = objectStorageTarget;
            this.__explicitlySet__.add("objectStorageTarget");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AsynchronousExportRequestDetails build() {
            AsynchronousExportRequestDetails model =
                    new AsynchronousExportRequestDetails(this.objectStorageTarget);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AsynchronousExportRequestDetails model) {
            if (model.wasPropertyExplicitlySet("objectStorageTarget")) {
                this.objectStorageTarget(model.getObjectStorageTarget());
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

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageTarget")
    private final ObjectStorageObjectReference objectStorageTarget;

    public ObjectStorageObjectReference getObjectStorageTarget() {
        return objectStorageTarget;
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
        sb.append("AsynchronousExportRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("objectStorageTarget=").append(String.valueOf(this.objectStorageTarget));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AsynchronousExportRequestDetails)) {
            return false;
        }

        AsynchronousExportRequestDetails other = (AsynchronousExportRequestDetails) o;
        return java.util.Objects.equals(this.objectStorageTarget, other.objectStorageTarget)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.objectStorageTarget == null
                                ? 43
                                : this.objectStorageTarget.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
