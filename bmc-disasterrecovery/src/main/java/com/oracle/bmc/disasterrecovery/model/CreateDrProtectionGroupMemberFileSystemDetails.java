/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create properties for a file system member. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDrProtectionGroupMemberFileSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDrProtectionGroupMemberFileSystemDetails
        extends CreateDrProtectionGroupMemberDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("memberId")
        private String memberId;

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            this.__explicitlySet__.add("memberId");
            return this;
        }
        /**
         * The availability domain of the destination mount target.
         *
         * <p>Example: {@code BBTh:region-AD}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationAvailabilityDomain")
        private String destinationAvailabilityDomain;

        /**
         * The availability domain of the destination mount target.
         *
         * <p>Example: {@code BBTh:region-AD}
         *
         * @param destinationAvailabilityDomain the value to set
         * @return this builder
         */
        public Builder destinationAvailabilityDomain(String destinationAvailabilityDomain) {
            this.destinationAvailabilityDomain = destinationAvailabilityDomain;
            this.__explicitlySet__.add("destinationAvailabilityDomain");
            return this;
        }
        /**
         * A list of mappings between file system exports in the primary region and mount targets in
         * the standby region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportMappings")
        private java.util.List<FileSystemExportMappingDetails> exportMappings;

        /**
         * A list of mappings between file system exports in the primary region and mount targets in
         * the standby region.
         *
         * @param exportMappings the value to set
         * @return this builder
         */
        public Builder exportMappings(
                java.util.List<FileSystemExportMappingDetails> exportMappings) {
            this.exportMappings = exportMappings;
            this.__explicitlySet__.add("exportMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDrProtectionGroupMemberFileSystemDetails build() {
            CreateDrProtectionGroupMemberFileSystemDetails model =
                    new CreateDrProtectionGroupMemberFileSystemDetails(
                            this.memberId, this.destinationAvailabilityDomain, this.exportMappings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDrProtectionGroupMemberFileSystemDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("destinationAvailabilityDomain")) {
                this.destinationAvailabilityDomain(model.getDestinationAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("exportMappings")) {
                this.exportMappings(model.getExportMappings());
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
    public CreateDrProtectionGroupMemberFileSystemDetails(
            String memberId,
            String destinationAvailabilityDomain,
            java.util.List<FileSystemExportMappingDetails> exportMappings) {
        super(memberId);
        this.destinationAvailabilityDomain = destinationAvailabilityDomain;
        this.exportMappings = exportMappings;
    }

    /**
     * The availability domain of the destination mount target.
     *
     * <p>Example: {@code BBTh:region-AD}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationAvailabilityDomain")
    private final String destinationAvailabilityDomain;

    /**
     * The availability domain of the destination mount target.
     *
     * <p>Example: {@code BBTh:region-AD}
     *
     * @return the value
     */
    public String getDestinationAvailabilityDomain() {
        return destinationAvailabilityDomain;
    }

    /**
     * A list of mappings between file system exports in the primary region and mount targets in the
     * standby region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportMappings")
    private final java.util.List<FileSystemExportMappingDetails> exportMappings;

    /**
     * A list of mappings between file system exports in the primary region and mount targets in the
     * standby region.
     *
     * @return the value
     */
    public java.util.List<FileSystemExportMappingDetails> getExportMappings() {
        return exportMappings;
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
        sb.append("CreateDrProtectionGroupMemberFileSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", destinationAvailabilityDomain=")
                .append(String.valueOf(this.destinationAvailabilityDomain));
        sb.append(", exportMappings=").append(String.valueOf(this.exportMappings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDrProtectionGroupMemberFileSystemDetails)) {
            return false;
        }

        CreateDrProtectionGroupMemberFileSystemDetails other =
                (CreateDrProtectionGroupMemberFileSystemDetails) o;
        return java.util.Objects.equals(
                        this.destinationAvailabilityDomain, other.destinationAvailabilityDomain)
                && java.util.Objects.equals(this.exportMappings, other.exportMappings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.destinationAvailabilityDomain == null
                                ? 43
                                : this.destinationAvailabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.exportMappings == null ? 43 : this.exportMappings.hashCode());
        return result;
    }
}
