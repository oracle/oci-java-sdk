/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to drop a tablespace.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DropTablespaceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DropTablespaceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private TablespaceAdminCredentialDetails credentialDetails;

        public Builder credentialDetails(TablespaceAdminCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIncludingContents")
        private Boolean isIncludingContents;

        public Builder isIncludingContents(Boolean isIncludingContents) {
            this.isIncludingContents = isIncludingContents;
            this.__explicitlySet__.add("isIncludingContents");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDroppingDataFiles")
        private Boolean isDroppingDataFiles;

        public Builder isDroppingDataFiles(Boolean isDroppingDataFiles) {
            this.isDroppingDataFiles = isDroppingDataFiles;
            this.__explicitlySet__.add("isDroppingDataFiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCascadeConstraints")
        private Boolean isCascadeConstraints;

        public Builder isCascadeConstraints(Boolean isCascadeConstraints) {
            this.isCascadeConstraints = isCascadeConstraints;
            this.__explicitlySet__.add("isCascadeConstraints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DropTablespaceDetails build() {
            DropTablespaceDetails __instance__ =
                    new DropTablespaceDetails(
                            credentialDetails,
                            isIncludingContents,
                            isDroppingDataFiles,
                            isCascadeConstraints);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DropTablespaceDetails o) {
            Builder copiedBuilder =
                    credentialDetails(o.getCredentialDetails())
                            .isIncludingContents(o.getIsIncludingContents())
                            .isDroppingDataFiles(o.getIsDroppingDataFiles())
                            .isCascadeConstraints(o.getIsCascadeConstraints());

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

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    TablespaceAdminCredentialDetails credentialDetails;

    /**
     * Specifies whether all the contents of the tablespace being dropped should be dropped.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludingContents")
    Boolean isIncludingContents;

    /**
     * Specifies whether all the associated data files of the tablespace being dropped should be dropped.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDroppingDataFiles")
    Boolean isDroppingDataFiles;

    /**
     * Specifies whether all the constraints on the tablespace being dropped should be dropped.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCascadeConstraints")
    Boolean isCascadeConstraints;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
