/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details needed by the Data Asset export request.
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
    builder = AsynchronousExportDataAssetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AsynchronousExportDataAssetDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"exportScope", "objectStorageTarget"})
    public AsynchronousExportDataAssetDetails(
            java.util.List<DataAssetExportScope> exportScope,
            ObjectStorageObjectReference objectStorageTarget) {
        super();
        this.exportScope = exportScope;
        this.objectStorageTarget = objectStorageTarget;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Array of objects and their child types to be selected for export.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exportScope")
        private java.util.List<DataAssetExportScope> exportScope;

        /**
         * Array of objects and their child types to be selected for export.
         * @param exportScope the value to set
         * @return this builder
         **/
        public Builder exportScope(java.util.List<DataAssetExportScope> exportScope) {
            this.exportScope = exportScope;
            this.__explicitlySet__.add("exportScope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageTarget")
        private ObjectStorageObjectReference objectStorageTarget;

        public Builder objectStorageTarget(ObjectStorageObjectReference objectStorageTarget) {
            this.objectStorageTarget = objectStorageTarget;
            this.__explicitlySet__.add("objectStorageTarget");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AsynchronousExportDataAssetDetails build() {
            AsynchronousExportDataAssetDetails model =
                    new AsynchronousExportDataAssetDetails(
                            this.exportScope, this.objectStorageTarget);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AsynchronousExportDataAssetDetails model) {
            if (model.wasPropertyExplicitlySet("exportScope")) {
                this.exportScope(model.getExportScope());
            }
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

    /**
     * Array of objects and their child types to be selected for export.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportScope")
    private final java.util.List<DataAssetExportScope> exportScope;

    /**
     * Array of objects and their child types to be selected for export.
     * @return the value
     **/
    public java.util.List<DataAssetExportScope> getExportScope() {
        return exportScope;
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
        sb.append("AsynchronousExportDataAssetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("exportScope=").append(String.valueOf(this.exportScope));
        sb.append(", objectStorageTarget=").append(String.valueOf(this.objectStorageTarget));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AsynchronousExportDataAssetDetails)) {
            return false;
        }

        AsynchronousExportDataAssetDetails other = (AsynchronousExportDataAssetDetails) o;
        return java.util.Objects.equals(this.exportScope, other.exportScope)
                && java.util.Objects.equals(this.objectStorageTarget, other.objectStorageTarget)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.exportScope == null ? 43 : this.exportScope.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageTarget == null
                                ? 43
                                : this.objectStorageTarget.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
