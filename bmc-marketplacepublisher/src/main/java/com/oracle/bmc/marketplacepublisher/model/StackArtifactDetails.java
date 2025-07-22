/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Stack details required to create a Stack artifact. <br>
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
        builder = StackArtifactDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StackArtifactDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceStackId",
        "imageListingIds",
        "validationStatus",
        "validationError"
    })
    public StackArtifactDetails(
            String sourceStackId,
            java.util.List<String> imageListingIds,
            ValidationStatus validationStatus,
            String validationError) {
        super();
        this.sourceStackId = sourceStackId;
        this.imageListingIds = imageListingIds;
        this.validationStatus = validationStatus;
        this.validationError = validationError;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The source stack OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceStackId")
        private String sourceStackId;

        /**
         * The source stack OCID.
         *
         * @param sourceStackId the value to set
         * @return this builder
         */
        public Builder sourceStackId(String sourceStackId) {
            this.sourceStackId = sourceStackId;
            this.__explicitlySet__.add("sourceStackId");
            return this;
        }
        /** Image listing OCIDs that are referred in the Stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageListingIds")
        private java.util.List<String> imageListingIds;

        /**
         * Image listing OCIDs that are referred in the Stack.
         *
         * @param imageListingIds the value to set
         * @return this builder
         */
        public Builder imageListingIds(java.util.List<String> imageListingIds) {
            this.imageListingIds = imageListingIds;
            this.__explicitlySet__.add("imageListingIds");
            return this;
        }
        /** Stack validation status. */
        @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
        private ValidationStatus validationStatus;

        /**
         * Stack validation status.
         *
         * @param validationStatus the value to set
         * @return this builder
         */
        public Builder validationStatus(ValidationStatus validationStatus) {
            this.validationStatus = validationStatus;
            this.__explicitlySet__.add("validationStatus");
            return this;
        }
        /** The description of the stack validation failure errors. */
        @com.fasterxml.jackson.annotation.JsonProperty("validationError")
        private String validationError;

        /**
         * The description of the stack validation failure errors.
         *
         * @param validationError the value to set
         * @return this builder
         */
        public Builder validationError(String validationError) {
            this.validationError = validationError;
            this.__explicitlySet__.add("validationError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StackArtifactDetails build() {
            StackArtifactDetails model =
                    new StackArtifactDetails(
                            this.sourceStackId,
                            this.imageListingIds,
                            this.validationStatus,
                            this.validationError);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StackArtifactDetails model) {
            if (model.wasPropertyExplicitlySet("sourceStackId")) {
                this.sourceStackId(model.getSourceStackId());
            }
            if (model.wasPropertyExplicitlySet("imageListingIds")) {
                this.imageListingIds(model.getImageListingIds());
            }
            if (model.wasPropertyExplicitlySet("validationStatus")) {
                this.validationStatus(model.getValidationStatus());
            }
            if (model.wasPropertyExplicitlySet("validationError")) {
                this.validationError(model.getValidationError());
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

    /** The source stack OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceStackId")
    private final String sourceStackId;

    /**
     * The source stack OCID.
     *
     * @return the value
     */
    public String getSourceStackId() {
        return sourceStackId;
    }

    /** Image listing OCIDs that are referred in the Stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageListingIds")
    private final java.util.List<String> imageListingIds;

    /**
     * Image listing OCIDs that are referred in the Stack.
     *
     * @return the value
     */
    public java.util.List<String> getImageListingIds() {
        return imageListingIds;
    }

    /** Stack validation status. */
    @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
    private final ValidationStatus validationStatus;

    /**
     * Stack validation status.
     *
     * @return the value
     */
    public ValidationStatus getValidationStatus() {
        return validationStatus;
    }

    /** The description of the stack validation failure errors. */
    @com.fasterxml.jackson.annotation.JsonProperty("validationError")
    private final String validationError;

    /**
     * The description of the stack validation failure errors.
     *
     * @return the value
     */
    public String getValidationError() {
        return validationError;
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
        sb.append("StackArtifactDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceStackId=").append(String.valueOf(this.sourceStackId));
        sb.append(", imageListingIds=").append(String.valueOf(this.imageListingIds));
        sb.append(", validationStatus=").append(String.valueOf(this.validationStatus));
        sb.append(", validationError=").append(String.valueOf(this.validationError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StackArtifactDetails)) {
            return false;
        }

        StackArtifactDetails other = (StackArtifactDetails) o;
        return java.util.Objects.equals(this.sourceStackId, other.sourceStackId)
                && java.util.Objects.equals(this.imageListingIds, other.imageListingIds)
                && java.util.Objects.equals(this.validationStatus, other.validationStatus)
                && java.util.Objects.equals(this.validationError, other.validationError)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceStackId == null ? 43 : this.sourceStackId.hashCode());
        result =
                (result * PRIME)
                        + (this.imageListingIds == null ? 43 : this.imageListingIds.hashCode());
        result =
                (result * PRIME)
                        + (this.validationStatus == null ? 43 : this.validationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.validationError == null ? 43 : this.validationError.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
