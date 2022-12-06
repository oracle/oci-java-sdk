/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to download masking log. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DownloadMaskingLogDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DownloadMaskingLogDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetId", "maskingWorkRequestId"})
    public DownloadMaskingLogDetails(String targetId, String maskingWorkRequestId) {
        super();
        this.targetId = targetId;
        this.maskingWorkRequestId = maskingWorkRequestId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the target database for which the masking log is to be downloaded. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database for which the masking log is to be downloaded.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The OCID of the masking work request that resulted in this masking log. */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingWorkRequestId")
        private String maskingWorkRequestId;

        /**
         * The OCID of the masking work request that resulted in this masking log.
         *
         * @param maskingWorkRequestId the value to set
         * @return this builder
         */
        public Builder maskingWorkRequestId(String maskingWorkRequestId) {
            this.maskingWorkRequestId = maskingWorkRequestId;
            this.__explicitlySet__.add("maskingWorkRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DownloadMaskingLogDetails build() {
            DownloadMaskingLogDetails model =
                    new DownloadMaskingLogDetails(this.targetId, this.maskingWorkRequestId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DownloadMaskingLogDetails model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("maskingWorkRequestId")) {
                this.maskingWorkRequestId(model.getMaskingWorkRequestId());
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

    /** The OCID of the target database for which the masking log is to be downloaded. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database for which the masking log is to be downloaded.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The OCID of the masking work request that resulted in this masking log. */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingWorkRequestId")
    private final String maskingWorkRequestId;

    /**
     * The OCID of the masking work request that resulted in this masking log.
     *
     * @return the value
     */
    public String getMaskingWorkRequestId() {
        return maskingWorkRequestId;
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
        sb.append("DownloadMaskingLogDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", maskingWorkRequestId=").append(String.valueOf(this.maskingWorkRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadMaskingLogDetails)) {
            return false;
        }

        DownloadMaskingLogDetails other = (DownloadMaskingLogDetails) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.maskingWorkRequestId, other.maskingWorkRequestId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingWorkRequestId == null
                                ? 43
                                : this.maskingWorkRequestId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
