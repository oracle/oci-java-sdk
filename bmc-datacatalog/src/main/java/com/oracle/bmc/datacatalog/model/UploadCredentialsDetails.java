/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Upload credential file and connection metadata. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UploadCredentialsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UploadCredentialsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"connectionDetail", "credentialPayload"})
    public UploadCredentialsDetails(
            UpdateConnectionDetails connectionDetail, byte[] credentialPayload) {
        super();
        this.connectionDetail = connectionDetail;
        this.credentialPayload = credentialPayload;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetail")
        private UpdateConnectionDetails connectionDetail;

        public Builder connectionDetail(UpdateConnectionDetails connectionDetail) {
            this.connectionDetail = connectionDetail;
            this.__explicitlySet__.add("connectionDetail");
            return this;
        }
        /** Information used in updating connection credentials. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialPayload")
        private byte[] credentialPayload;

        /**
         * Information used in updating connection credentials.
         *
         * @param credentialPayload the value to set
         * @return this builder
         */
        public Builder credentialPayload(byte[] credentialPayload) {
            this.credentialPayload = credentialPayload;
            this.__explicitlySet__.add("credentialPayload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadCredentialsDetails build() {
            UploadCredentialsDetails model =
                    new UploadCredentialsDetails(this.connectionDetail, this.credentialPayload);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadCredentialsDetails model) {
            if (model.wasPropertyExplicitlySet("connectionDetail")) {
                this.connectionDetail(model.getConnectionDetail());
            }
            if (model.wasPropertyExplicitlySet("credentialPayload")) {
                this.credentialPayload(model.getCredentialPayload());
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

    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetail")
    private final UpdateConnectionDetails connectionDetail;

    public UpdateConnectionDetails getConnectionDetail() {
        return connectionDetail;
    }

    /** Information used in updating connection credentials. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialPayload")
    private final byte[] credentialPayload;

    /**
     * Information used in updating connection credentials.
     *
     * @return the value
     */
    public byte[] getCredentialPayload() {
        return credentialPayload;
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
        sb.append("UploadCredentialsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("connectionDetail=").append(String.valueOf(this.connectionDetail));
        sb.append(", credentialPayload=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.credentialPayload)
                                : (String.valueOf(this.credentialPayload)
                                        + (this.credentialPayload != null
                                                ? " (byte[" + this.credentialPayload.length + "])"
                                                : ""))));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadCredentialsDetails)) {
            return false;
        }

        UploadCredentialsDetails other = (UploadCredentialsDetails) o;
        return java.util.Objects.equals(this.connectionDetail, other.connectionDetail)
                && java.util.Arrays.equals(this.credentialPayload, other.credentialPayload)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectionDetail == null ? 43 : this.connectionDetail.hashCode());
        result = (result * PRIME) + java.util.Arrays.hashCode(this.credentialPayload);
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
