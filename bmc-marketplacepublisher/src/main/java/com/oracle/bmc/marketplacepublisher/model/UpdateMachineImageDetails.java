/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Machine image details required to update a Image artifact. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateMachineImageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateMachineImageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceImageId",
        "username",
        "isSnapshotAllowed",
        "imageShapeCompatibilityEntries"
    })
    public UpdateMachineImageDetails(
            String sourceImageId,
            String username,
            Boolean isSnapshotAllowed,
            java.util.List<ImageShapeCompatibility> imageShapeCompatibilityEntries) {
        super();
        this.sourceImageId = sourceImageId;
        this.username = username;
        this.isSnapshotAllowed = isSnapshotAllowed;
        this.imageShapeCompatibilityEntries = imageShapeCompatibilityEntries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of source machine image. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceImageId")
        private String sourceImageId;

        /**
         * The OCID of source machine image.
         *
         * @param sourceImageId the value to set
         * @return this builder
         */
        public Builder sourceImageId(String sourceImageId) {
            this.sourceImageId = sourceImageId;
            this.__explicitlySet__.add("sourceImageId");
            return this;
        }
        /** The username for machine image. */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username for machine image.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /** Identified if customer can take a snapshot of instance running on the machine image. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSnapshotAllowed")
        private Boolean isSnapshotAllowed;

        /**
         * Identified if customer can take a snapshot of instance running on the machine image.
         *
         * @param isSnapshotAllowed the value to set
         * @return this builder
         */
        public Builder isSnapshotAllowed(Boolean isSnapshotAllowed) {
            this.isSnapshotAllowed = isSnapshotAllowed;
            this.__explicitlySet__.add("isSnapshotAllowed");
            return this;
        }
        /** List of shape configurations supported by the image. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageShapeCompatibilityEntries")
        private java.util.List<ImageShapeCompatibility> imageShapeCompatibilityEntries;

        /**
         * List of shape configurations supported by the image.
         *
         * @param imageShapeCompatibilityEntries the value to set
         * @return this builder
         */
        public Builder imageShapeCompatibilityEntries(
                java.util.List<ImageShapeCompatibility> imageShapeCompatibilityEntries) {
            this.imageShapeCompatibilityEntries = imageShapeCompatibilityEntries;
            this.__explicitlySet__.add("imageShapeCompatibilityEntries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMachineImageDetails build() {
            UpdateMachineImageDetails model =
                    new UpdateMachineImageDetails(
                            this.sourceImageId,
                            this.username,
                            this.isSnapshotAllowed,
                            this.imageShapeCompatibilityEntries);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMachineImageDetails model) {
            if (model.wasPropertyExplicitlySet("sourceImageId")) {
                this.sourceImageId(model.getSourceImageId());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("isSnapshotAllowed")) {
                this.isSnapshotAllowed(model.getIsSnapshotAllowed());
            }
            if (model.wasPropertyExplicitlySet("imageShapeCompatibilityEntries")) {
                this.imageShapeCompatibilityEntries(model.getImageShapeCompatibilityEntries());
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

    /** The OCID of source machine image. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceImageId")
    private final String sourceImageId;

    /**
     * The OCID of source machine image.
     *
     * @return the value
     */
    public String getSourceImageId() {
        return sourceImageId;
    }

    /** The username for machine image. */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username for machine image.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /** Identified if customer can take a snapshot of instance running on the machine image. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSnapshotAllowed")
    private final Boolean isSnapshotAllowed;

    /**
     * Identified if customer can take a snapshot of instance running on the machine image.
     *
     * @return the value
     */
    public Boolean getIsSnapshotAllowed() {
        return isSnapshotAllowed;
    }

    /** List of shape configurations supported by the image. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageShapeCompatibilityEntries")
    private final java.util.List<ImageShapeCompatibility> imageShapeCompatibilityEntries;

    /**
     * List of shape configurations supported by the image.
     *
     * @return the value
     */
    public java.util.List<ImageShapeCompatibility> getImageShapeCompatibilityEntries() {
        return imageShapeCompatibilityEntries;
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
        sb.append("UpdateMachineImageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceImageId=").append(String.valueOf(this.sourceImageId));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", isSnapshotAllowed=").append(String.valueOf(this.isSnapshotAllowed));
        sb.append(", imageShapeCompatibilityEntries=")
                .append(String.valueOf(this.imageShapeCompatibilityEntries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMachineImageDetails)) {
            return false;
        }

        UpdateMachineImageDetails other = (UpdateMachineImageDetails) o;
        return java.util.Objects.equals(this.sourceImageId, other.sourceImageId)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.isSnapshotAllowed, other.isSnapshotAllowed)
                && java.util.Objects.equals(
                        this.imageShapeCompatibilityEntries, other.imageShapeCompatibilityEntries)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceImageId == null ? 43 : this.sourceImageId.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result =
                (result * PRIME)
                        + (this.isSnapshotAllowed == null ? 43 : this.isSnapshotAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.imageShapeCompatibilityEntries == null
                                ? 43
                                : this.imageShapeCompatibilityEntries.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
