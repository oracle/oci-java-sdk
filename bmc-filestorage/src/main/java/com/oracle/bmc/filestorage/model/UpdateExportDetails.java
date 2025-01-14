/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for updating the export. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateExportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateExportDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isIdmapGroupsForSysAuth", "exportOptions"})
    public UpdateExportDetails(
            Boolean isIdmapGroupsForSysAuth, java.util.List<ClientOptions> exportOptions) {
        super();
        this.isIdmapGroupsForSysAuth = isIdmapGroupsForSysAuth;
        this.exportOptions = exportOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether or not the export should use ID mapping for Unix groups rather than the group
         * list provided within an NFS request's RPC header. When this flag is true the Unix UID
         * from the RPC header is used to retrieve the list of secondary groups from a the ID
         * mapping subsystem. The primary GID is always taken from the RPC header. If ID mapping is
         * not configured, incorrectly configured, unavailable, or cannot be used to determine a
         * list of secondary groups then an empty secondary group list is used for authorization. If
         * the number of groups exceeds the limit of 256 groups, the list retrieved from LDAP is
         * truncated to the first 256 groups read.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIdmapGroupsForSysAuth")
        private Boolean isIdmapGroupsForSysAuth;

        /**
         * Whether or not the export should use ID mapping for Unix groups rather than the group
         * list provided within an NFS request's RPC header. When this flag is true the Unix UID
         * from the RPC header is used to retrieve the list of secondary groups from a the ID
         * mapping subsystem. The primary GID is always taken from the RPC header. If ID mapping is
         * not configured, incorrectly configured, unavailable, or cannot be used to determine a
         * list of secondary groups then an empty secondary group list is used for authorization. If
         * the number of groups exceeds the limit of 256 groups, the list retrieved from LDAP is
         * truncated to the first 256 groups read.
         *
         * @param isIdmapGroupsForSysAuth the value to set
         * @return this builder
         */
        public Builder isIdmapGroupsForSysAuth(Boolean isIdmapGroupsForSysAuth) {
            this.isIdmapGroupsForSysAuth = isIdmapGroupsForSysAuth;
            this.__explicitlySet__.add("isIdmapGroupsForSysAuth");
            return this;
        }
        /**
         * New export options for the export.
         *
         * <p>*Setting to the empty array will make the export invisible to all clients.**
         *
         * <p>Leaving unset will leave the {@code exportOptions} unchanged.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportOptions")
        private java.util.List<ClientOptions> exportOptions;

        /**
         * New export options for the export.
         *
         * <p>*Setting to the empty array will make the export invisible to all clients.**
         *
         * <p>Leaving unset will leave the {@code exportOptions} unchanged.
         *
         * @param exportOptions the value to set
         * @return this builder
         */
        public Builder exportOptions(java.util.List<ClientOptions> exportOptions) {
            this.exportOptions = exportOptions;
            this.__explicitlySet__.add("exportOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateExportDetails build() {
            UpdateExportDetails model =
                    new UpdateExportDetails(this.isIdmapGroupsForSysAuth, this.exportOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExportDetails model) {
            if (model.wasPropertyExplicitlySet("isIdmapGroupsForSysAuth")) {
                this.isIdmapGroupsForSysAuth(model.getIsIdmapGroupsForSysAuth());
            }
            if (model.wasPropertyExplicitlySet("exportOptions")) {
                this.exportOptions(model.getExportOptions());
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

    /**
     * Whether or not the export should use ID mapping for Unix groups rather than the group list
     * provided within an NFS request's RPC header. When this flag is true the Unix UID from the RPC
     * header is used to retrieve the list of secondary groups from a the ID mapping subsystem. The
     * primary GID is always taken from the RPC header. If ID mapping is not configured, incorrectly
     * configured, unavailable, or cannot be used to determine a list of secondary groups then an
     * empty secondary group list is used for authorization. If the number of groups exceeds the
     * limit of 256 groups, the list retrieved from LDAP is truncated to the first 256 groups read.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIdmapGroupsForSysAuth")
    private final Boolean isIdmapGroupsForSysAuth;

    /**
     * Whether or not the export should use ID mapping for Unix groups rather than the group list
     * provided within an NFS request's RPC header. When this flag is true the Unix UID from the RPC
     * header is used to retrieve the list of secondary groups from a the ID mapping subsystem. The
     * primary GID is always taken from the RPC header. If ID mapping is not configured, incorrectly
     * configured, unavailable, or cannot be used to determine a list of secondary groups then an
     * empty secondary group list is used for authorization. If the number of groups exceeds the
     * limit of 256 groups, the list retrieved from LDAP is truncated to the first 256 groups read.
     *
     * @return the value
     */
    public Boolean getIsIdmapGroupsForSysAuth() {
        return isIdmapGroupsForSysAuth;
    }

    /**
     * New export options for the export.
     *
     * <p>*Setting to the empty array will make the export invisible to all clients.**
     *
     * <p>Leaving unset will leave the {@code exportOptions} unchanged.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportOptions")
    private final java.util.List<ClientOptions> exportOptions;

    /**
     * New export options for the export.
     *
     * <p>*Setting to the empty array will make the export invisible to all clients.**
     *
     * <p>Leaving unset will leave the {@code exportOptions} unchanged.
     *
     * @return the value
     */
    public java.util.List<ClientOptions> getExportOptions() {
        return exportOptions;
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
        sb.append("UpdateExportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isIdmapGroupsForSysAuth=").append(String.valueOf(this.isIdmapGroupsForSysAuth));
        sb.append(", exportOptions=").append(String.valueOf(this.exportOptions));
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
        return java.util.Objects.equals(this.isIdmapGroupsForSysAuth, other.isIdmapGroupsForSysAuth)
                && java.util.Objects.equals(this.exportOptions, other.exportOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isIdmapGroupsForSysAuth == null
                                ? 43
                                : this.isIdmapGroupsForSysAuth.hashCode());
        result =
                (result * PRIME)
                        + (this.exportOptions == null ? 43 : this.exportOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
