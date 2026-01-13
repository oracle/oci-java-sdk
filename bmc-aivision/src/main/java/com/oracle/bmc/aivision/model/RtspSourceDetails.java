/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Details of RtspDevice <br>
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
        builder = RtspSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RtspSourceDetails extends StreamSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("streamNetworkAccessDetails")
        private StreamNetworkAccessDetails streamNetworkAccessDetails;

        public Builder streamNetworkAccessDetails(
                StreamNetworkAccessDetails streamNetworkAccessDetails) {
            this.streamNetworkAccessDetails = streamNetworkAccessDetails;
            this.__explicitlySet__.add("streamNetworkAccessDetails");
            return this;
        }
        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of secret
         * where credentials are stored in username:password format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of secret
         * where credentials are stored in username:password format.
         *
         * @param secretId the value to set
         * @return this builder
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /** url of camera */
        @com.fasterxml.jackson.annotation.JsonProperty("cameraUrl")
        private String cameraUrl;

        /**
         * url of camera
         *
         * @param cameraUrl the value to set
         * @return this builder
         */
        public Builder cameraUrl(String cameraUrl) {
            this.cameraUrl = cameraUrl;
            this.__explicitlySet__.add("cameraUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RtspSourceDetails build() {
            RtspSourceDetails model =
                    new RtspSourceDetails(
                            this.streamNetworkAccessDetails, this.secretId, this.cameraUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RtspSourceDetails model) {
            if (model.wasPropertyExplicitlySet("streamNetworkAccessDetails")) {
                this.streamNetworkAccessDetails(model.getStreamNetworkAccessDetails());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("cameraUrl")) {
                this.cameraUrl(model.getCameraUrl());
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
    public RtspSourceDetails(
            StreamNetworkAccessDetails streamNetworkAccessDetails,
            String secretId,
            String cameraUrl) {
        super(streamNetworkAccessDetails);
        this.secretId = secretId;
        this.cameraUrl = cameraUrl;
    }

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of secret where
     * credentials are stored in username:password format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of secret where
     * credentials are stored in username:password format.
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
    }

    /** url of camera */
    @com.fasterxml.jackson.annotation.JsonProperty("cameraUrl")
    private final String cameraUrl;

    /**
     * url of camera
     *
     * @return the value
     */
    public String getCameraUrl() {
        return cameraUrl;
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
        sb.append("RtspSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", cameraUrl=").append(String.valueOf(this.cameraUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RtspSourceDetails)) {
            return false;
        }

        RtspSourceDetails other = (RtspSourceDetails) o;
        return java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.cameraUrl, other.cameraUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result = (result * PRIME) + (this.cameraUrl == null ? 43 : this.cameraUrl.hashCode());
        return result;
    }
}
