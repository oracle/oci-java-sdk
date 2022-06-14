/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for updating the export.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateExportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateExportDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"exportOptions"})
    public UpdateExportDetails(java.util.List<ClientOptions> exportOptions) {
        super();
        this.exportOptions = exportOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * New export options for the export.
         * <p>
         **Setting to the empty array will make the export invisible to all clients.**
         * <p>
         * Leaving unset will leave the {@code exportOptions} unchanged.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exportOptions")
        private java.util.List<ClientOptions> exportOptions;

        /**
         * New export options for the export.
         * <p>
         **Setting to the empty array will make the export invisible to all clients.**
         * <p>
         * Leaving unset will leave the {@code exportOptions} unchanged.
         *
         * @param exportOptions the value to set
         * @return this builder
         **/
        public Builder exportOptions(java.util.List<ClientOptions> exportOptions) {
            this.exportOptions = exportOptions;
            this.__explicitlySet__.add("exportOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateExportDetails build() {
            UpdateExportDetails __instance__ = new UpdateExportDetails(exportOptions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExportDetails o) {
            Builder copiedBuilder = exportOptions(o.getExportOptions());

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
     * New export options for the export.
     * <p>
     **Setting to the empty array will make the export invisible to all clients.**
     * <p>
     * Leaving unset will leave the {@code exportOptions} unchanged.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportOptions")
    private final java.util.List<ClientOptions> exportOptions;

    /**
     * New export options for the export.
     * <p>
     **Setting to the empty array will make the export invisible to all clients.**
     * <p>
     * Leaving unset will leave the {@code exportOptions} unchanged.
     *
     * @return the value
     **/
    public java.util.List<ClientOptions> getExportOptions() {
        return exportOptions;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateExportDetails(");
        sb.append("exportOptions=").append(String.valueOf(this.exportOptions));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExportDetails)) {
            return false;
        }

        UpdateExportDetails other = (UpdateExportDetails) o;
        return java.util.Objects.equals(this.exportOptions, other.exportOptions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.exportOptions == null ? 43 : this.exportOptions.hashCode());
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
