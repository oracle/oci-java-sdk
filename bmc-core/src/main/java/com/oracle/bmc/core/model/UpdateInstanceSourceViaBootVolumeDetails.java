/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The details for updating the instance source from an existing boot volume. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateInstanceSourceViaBootVolumeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateInstanceSourceViaBootVolumeDetails extends UpdateInstanceSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isPreserveBootVolumeEnabled")
        private Boolean isPreserveBootVolumeEnabled;

        public Builder isPreserveBootVolumeEnabled(Boolean isPreserveBootVolumeEnabled) {
            this.isPreserveBootVolumeEnabled = isPreserveBootVolumeEnabled;
            this.__explicitlySet__.add("isPreserveBootVolumeEnabled");
            return this;
        }
        /** The OCID of the boot volume used to boot the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeId")
        private String bootVolumeId;

        /**
         * The OCID of the boot volume used to boot the instance.
         *
         * @param bootVolumeId the value to set
         * @return this builder
         */
        public Builder bootVolumeId(String bootVolumeId) {
            this.bootVolumeId = bootVolumeId;
            this.__explicitlySet__.add("bootVolumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInstanceSourceViaBootVolumeDetails build() {
            UpdateInstanceSourceViaBootVolumeDetails model =
                    new UpdateInstanceSourceViaBootVolumeDetails(
                            this.isPreserveBootVolumeEnabled, this.bootVolumeId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInstanceSourceViaBootVolumeDetails model) {
            if (model.wasPropertyExplicitlySet("isPreserveBootVolumeEnabled")) {
                this.isPreserveBootVolumeEnabled(model.getIsPreserveBootVolumeEnabled());
            }
            if (model.wasPropertyExplicitlySet("bootVolumeId")) {
                this.bootVolumeId(model.getBootVolumeId());
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
    public UpdateInstanceSourceViaBootVolumeDetails(
            Boolean isPreserveBootVolumeEnabled, String bootVolumeId) {
        super(isPreserveBootVolumeEnabled);
        this.bootVolumeId = bootVolumeId;
    }

    /** The OCID of the boot volume used to boot the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeId")
    private final String bootVolumeId;

    /**
     * The OCID of the boot volume used to boot the instance.
     *
     * @return the value
     */
    public String getBootVolumeId() {
        return bootVolumeId;
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
        sb.append("UpdateInstanceSourceViaBootVolumeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", bootVolumeId=").append(String.valueOf(this.bootVolumeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInstanceSourceViaBootVolumeDetails)) {
            return false;
        }

        UpdateInstanceSourceViaBootVolumeDetails other =
                (UpdateInstanceSourceViaBootVolumeDetails) o;
        return java.util.Objects.equals(this.bootVolumeId, other.bootVolumeId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.bootVolumeId == null ? 43 : this.bootVolumeId.hashCode());
        return result;
    }
}
