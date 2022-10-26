/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to drop a tablespace. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DropTablespaceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DropTablespaceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialDetails",
        "isIncludingContents",
        "isDroppingDataFiles",
        "isCascadeConstraints"
    })
    public DropTablespaceDetails(
            TablespaceAdminCredentialDetails credentialDetails,
            Boolean isIncludingContents,
            Boolean isDroppingDataFiles,
            Boolean isCascadeConstraints) {
        super();
        this.credentialDetails = credentialDetails;
        this.isIncludingContents = isIncludingContents;
        this.isDroppingDataFiles = isDroppingDataFiles;
        this.isCascadeConstraints = isCascadeConstraints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private TablespaceAdminCredentialDetails credentialDetails;

        public Builder credentialDetails(TablespaceAdminCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }
        /** Specifies whether all the contents of the tablespace being dropped should be dropped. */
        @com.fasterxml.jackson.annotation.JsonProperty("isIncludingContents")
        private Boolean isIncludingContents;

        /**
         * Specifies whether all the contents of the tablespace being dropped should be dropped.
         *
         * @param isIncludingContents the value to set
         * @return this builder
         */
        public Builder isIncludingContents(Boolean isIncludingContents) {
            this.isIncludingContents = isIncludingContents;
            this.__explicitlySet__.add("isIncludingContents");
            return this;
        }
        /**
         * Specifies whether all the associated data files of the tablespace being dropped should be
         * dropped.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDroppingDataFiles")
        private Boolean isDroppingDataFiles;

        /**
         * Specifies whether all the associated data files of the tablespace being dropped should be
         * dropped.
         *
         * @param isDroppingDataFiles the value to set
         * @return this builder
         */
        public Builder isDroppingDataFiles(Boolean isDroppingDataFiles) {
            this.isDroppingDataFiles = isDroppingDataFiles;
            this.__explicitlySet__.add("isDroppingDataFiles");
            return this;
        }
        /**
         * Specifies whether all the constraints on the tablespace being dropped should be dropped.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCascadeConstraints")
        private Boolean isCascadeConstraints;

        /**
         * Specifies whether all the constraints on the tablespace being dropped should be dropped.
         *
         * @param isCascadeConstraints the value to set
         * @return this builder
         */
        public Builder isCascadeConstraints(Boolean isCascadeConstraints) {
            this.isCascadeConstraints = isCascadeConstraints;
            this.__explicitlySet__.add("isCascadeConstraints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DropTablespaceDetails build() {
            DropTablespaceDetails model =
                    new DropTablespaceDetails(
                            this.credentialDetails,
                            this.isIncludingContents,
                            this.isDroppingDataFiles,
                            this.isCascadeConstraints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DropTablespaceDetails model) {
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("isIncludingContents")) {
                this.isIncludingContents(model.getIsIncludingContents());
            }
            if (model.wasPropertyExplicitlySet("isDroppingDataFiles")) {
                this.isDroppingDataFiles(model.getIsDroppingDataFiles());
            }
            if (model.wasPropertyExplicitlySet("isCascadeConstraints")) {
                this.isCascadeConstraints(model.getIsCascadeConstraints());
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

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final TablespaceAdminCredentialDetails credentialDetails;

    public TablespaceAdminCredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    /** Specifies whether all the contents of the tablespace being dropped should be dropped. */
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludingContents")
    private final Boolean isIncludingContents;

    /**
     * Specifies whether all the contents of the tablespace being dropped should be dropped.
     *
     * @return the value
     */
    public Boolean getIsIncludingContents() {
        return isIncludingContents;
    }

    /**
     * Specifies whether all the associated data files of the tablespace being dropped should be
     * dropped.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDroppingDataFiles")
    private final Boolean isDroppingDataFiles;

    /**
     * Specifies whether all the associated data files of the tablespace being dropped should be
     * dropped.
     *
     * @return the value
     */
    public Boolean getIsDroppingDataFiles() {
        return isDroppingDataFiles;
    }

    /** Specifies whether all the constraints on the tablespace being dropped should be dropped. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCascadeConstraints")
    private final Boolean isCascadeConstraints;

    /**
     * Specifies whether all the constraints on the tablespace being dropped should be dropped.
     *
     * @return the value
     */
    public Boolean getIsCascadeConstraints() {
        return isCascadeConstraints;
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
        sb.append("DropTablespaceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", isIncludingContents=").append(String.valueOf(this.isIncludingContents));
        sb.append(", isDroppingDataFiles=").append(String.valueOf(this.isDroppingDataFiles));
        sb.append(", isCascadeConstraints=").append(String.valueOf(this.isCascadeConstraints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DropTablespaceDetails)) {
            return false;
        }

        DropTablespaceDetails other = (DropTablespaceDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.isIncludingContents, other.isIncludingContents)
                && java.util.Objects.equals(this.isDroppingDataFiles, other.isDroppingDataFiles)
                && java.util.Objects.equals(this.isCascadeConstraints, other.isCascadeConstraints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludingContents == null
                                ? 43
                                : this.isIncludingContents.hashCode());
        result =
                (result * PRIME)
                        + (this.isDroppingDataFiles == null
                                ? 43
                                : this.isDroppingDataFiles.hashCode());
        result =
                (result * PRIME)
                        + (this.isCascadeConstraints == null
                                ? 43
                                : this.isCascadeConstraints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
