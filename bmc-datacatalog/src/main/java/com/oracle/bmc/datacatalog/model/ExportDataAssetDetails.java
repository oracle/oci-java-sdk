/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * The details of what needs to be exported. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExportDataAssetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportDataAssetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"exportScope"})
    public ExportDataAssetDetails(java.util.List<DataAssetExportScope> exportScope) {
        super();
        this.exportScope = exportScope;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Array of objects and their child types to be selected for export. */
        @com.fasterxml.jackson.annotation.JsonProperty("exportScope")
        private java.util.List<DataAssetExportScope> exportScope;

        /**
         * Array of objects and their child types to be selected for export.
         *
         * @param exportScope the value to set
         * @return this builder
         */
        public Builder exportScope(java.util.List<DataAssetExportScope> exportScope) {
            this.exportScope = exportScope;
            this.__explicitlySet__.add("exportScope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportDataAssetDetails build() {
            ExportDataAssetDetails model = new ExportDataAssetDetails(this.exportScope);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportDataAssetDetails model) {
            if (model.wasPropertyExplicitlySet("exportScope")) {
                this.exportScope(model.getExportScope());
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

    /** Array of objects and their child types to be selected for export. */
    @com.fasterxml.jackson.annotation.JsonProperty("exportScope")
    private final java.util.List<DataAssetExportScope> exportScope;

    /**
     * Array of objects and their child types to be selected for export.
     *
     * @return the value
     */
    public java.util.List<DataAssetExportScope> getExportScope() {
        return exportScope;
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
        sb.append("ExportDataAssetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("exportScope=").append(String.valueOf(this.exportScope));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportDataAssetDetails)) {
            return false;
        }

        ExportDataAssetDetails other = (ExportDataAssetDetails) o;
        return java.util.Objects.equals(this.exportScope, other.exportScope) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.exportScope == null ? 43 : this.exportScope.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
