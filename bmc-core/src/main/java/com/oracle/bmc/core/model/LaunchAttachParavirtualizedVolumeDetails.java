/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details specific to PV type volume attachments.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LaunchAttachParavirtualizedVolumeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LaunchAttachParavirtualizedVolumeDetails extends LaunchAttachVolumeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("device")
        private String device;

        public Builder device(String device) {
            this.device = device;
            this.__explicitlySet__.add("device");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
        private Boolean isReadOnly;

        public Builder isReadOnly(Boolean isReadOnly) {
            this.isReadOnly = isReadOnly;
            this.__explicitlySet__.add("isReadOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isShareable")
        private Boolean isShareable;

        public Builder isShareable(Boolean isShareable) {
            this.isShareable = isShareable;
            this.__explicitlySet__.add("isShareable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
        private String volumeId;

        public Builder volumeId(String volumeId) {
            this.volumeId = volumeId;
            this.__explicitlySet__.add("volumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("launchCreateVolumeDetails")
        private LaunchCreateVolumeDetails launchCreateVolumeDetails;

        public Builder launchCreateVolumeDetails(
                LaunchCreateVolumeDetails launchCreateVolumeDetails) {
            this.launchCreateVolumeDetails = launchCreateVolumeDetails;
            this.__explicitlySet__.add("launchCreateVolumeDetails");
            return this;
        }
        /**
         * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. The default value is false.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        /**
         * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. The default value is false.
         * @param isPvEncryptionInTransitEnabled the value to set
         * @return this builder
         **/
        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LaunchAttachParavirtualizedVolumeDetails build() {
            LaunchAttachParavirtualizedVolumeDetails model =
                    new LaunchAttachParavirtualizedVolumeDetails(
                            this.device,
                            this.displayName,
                            this.isReadOnly,
                            this.isShareable,
                            this.volumeId,
                            this.launchCreateVolumeDetails,
                            this.isPvEncryptionInTransitEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchAttachParavirtualizedVolumeDetails model) {
            if (model.wasPropertyExplicitlySet("device")) {
                this.device(model.getDevice());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isReadOnly")) {
                this.isReadOnly(model.getIsReadOnly());
            }
            if (model.wasPropertyExplicitlySet("isShareable")) {
                this.isShareable(model.getIsShareable());
            }
            if (model.wasPropertyExplicitlySet("volumeId")) {
                this.volumeId(model.getVolumeId());
            }
            if (model.wasPropertyExplicitlySet("launchCreateVolumeDetails")) {
                this.launchCreateVolumeDetails(model.getLaunchCreateVolumeDetails());
            }
            if (model.wasPropertyExplicitlySet("isPvEncryptionInTransitEnabled")) {
                this.isPvEncryptionInTransitEnabled(model.getIsPvEncryptionInTransitEnabled());
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

    @Deprecated
    public LaunchAttachParavirtualizedVolumeDetails(
            String device,
            String displayName,
            Boolean isReadOnly,
            Boolean isShareable,
            String volumeId,
            LaunchCreateVolumeDetails launchCreateVolumeDetails,
            Boolean isPvEncryptionInTransitEnabled) {
        super(device, displayName, isReadOnly, isShareable, volumeId, launchCreateVolumeDetails);
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
    }

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. The default value is false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    private final Boolean isPvEncryptionInTransitEnabled;

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. The default value is false.
     * @return the value
     **/
    public Boolean getIsPvEncryptionInTransitEnabled() {
        return isPvEncryptionInTransitEnabled;
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
        sb.append("LaunchAttachParavirtualizedVolumeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isPvEncryptionInTransitEnabled=")
                .append(String.valueOf(this.isPvEncryptionInTransitEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LaunchAttachParavirtualizedVolumeDetails)) {
            return false;
        }

        LaunchAttachParavirtualizedVolumeDetails other =
                (LaunchAttachParavirtualizedVolumeDetails) o;
        return java.util.Objects.equals(
                        this.isPvEncryptionInTransitEnabled, other.isPvEncryptionInTransitEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isPvEncryptionInTransitEnabled == null
                                ? 43
                                : this.isPvEncryptionInTransitEnabled.hashCode());
        return result;
    }
}
