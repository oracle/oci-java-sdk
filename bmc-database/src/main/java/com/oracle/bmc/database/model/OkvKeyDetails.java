/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for OKV encryption key. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OkvKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "provider")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OkvKeyDetails extends AutonomousDatabaseEncryptionKeyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** URI of OKV server */
        @com.fasterxml.jackson.annotation.JsonProperty("okvUri")
        private String okvUri;

        /**
         * URI of OKV server
         *
         * @param okvUri the value to set
         * @return this builder
         */
        public Builder okvUri(String okvUri) {
            this.okvUri = okvUri;
            this.__explicitlySet__.add("okvUri");
            return this;
        }
        /** UUID of OKV KMS Key */
        @com.fasterxml.jackson.annotation.JsonProperty("okvKmsKey")
        private String okvKmsKey;

        /**
         * UUID of OKV KMS Key
         *
         * @param okvKmsKey the value to set
         * @return this builder
         */
        public Builder okvKmsKey(String okvKmsKey) {
            this.okvKmsKey = okvKmsKey;
            this.__explicitlySet__.add("okvKmsKey");
            return this;
        }
        /** OKV wallet directory name */
        @com.fasterxml.jackson.annotation.JsonProperty("directoryName")
        private String directoryName;

        /**
         * OKV wallet directory name
         *
         * @param directoryName the value to set
         * @return this builder
         */
        public Builder directoryName(String directoryName) {
            this.directoryName = directoryName;
            this.__explicitlySet__.add("directoryName");
            return this;
        }
        /** OKV certificate directory name */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateDirectoryName")
        private String certificateDirectoryName;

        /**
         * OKV certificate directory name
         *
         * @param certificateDirectoryName the value to set
         * @return this builder
         */
        public Builder certificateDirectoryName(String certificateDirectoryName) {
            this.certificateDirectoryName = certificateDirectoryName;
            this.__explicitlySet__.add("certificateDirectoryName");
            return this;
        }
        /** OKV certificate id */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * OKV certificate id
         *
         * @param certificateId the value to set
         * @return this builder
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OkvKeyDetails build() {
            OkvKeyDetails model =
                    new OkvKeyDetails(
                            this.okvUri,
                            this.okvKmsKey,
                            this.directoryName,
                            this.certificateDirectoryName,
                            this.certificateId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OkvKeyDetails model) {
            if (model.wasPropertyExplicitlySet("okvUri")) {
                this.okvUri(model.getOkvUri());
            }
            if (model.wasPropertyExplicitlySet("okvKmsKey")) {
                this.okvKmsKey(model.getOkvKmsKey());
            }
            if (model.wasPropertyExplicitlySet("directoryName")) {
                this.directoryName(model.getDirectoryName());
            }
            if (model.wasPropertyExplicitlySet("certificateDirectoryName")) {
                this.certificateDirectoryName(model.getCertificateDirectoryName());
            }
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
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
    public OkvKeyDetails(
            String okvUri,
            String okvKmsKey,
            String directoryName,
            String certificateDirectoryName,
            String certificateId) {
        super();
        this.okvUri = okvUri;
        this.okvKmsKey = okvKmsKey;
        this.directoryName = directoryName;
        this.certificateDirectoryName = certificateDirectoryName;
        this.certificateId = certificateId;
    }

    /** URI of OKV server */
    @com.fasterxml.jackson.annotation.JsonProperty("okvUri")
    private final String okvUri;

    /**
     * URI of OKV server
     *
     * @return the value
     */
    public String getOkvUri() {
        return okvUri;
    }

    /** UUID of OKV KMS Key */
    @com.fasterxml.jackson.annotation.JsonProperty("okvKmsKey")
    private final String okvKmsKey;

    /**
     * UUID of OKV KMS Key
     *
     * @return the value
     */
    public String getOkvKmsKey() {
        return okvKmsKey;
    }

    /** OKV wallet directory name */
    @com.fasterxml.jackson.annotation.JsonProperty("directoryName")
    private final String directoryName;

    /**
     * OKV wallet directory name
     *
     * @return the value
     */
    public String getDirectoryName() {
        return directoryName;
    }

    /** OKV certificate directory name */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateDirectoryName")
    private final String certificateDirectoryName;

    /**
     * OKV certificate directory name
     *
     * @return the value
     */
    public String getCertificateDirectoryName() {
        return certificateDirectoryName;
    }

    /** OKV certificate id */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * OKV certificate id
     *
     * @return the value
     */
    public String getCertificateId() {
        return certificateId;
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
        sb.append("OkvKeyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", okvUri=").append(String.valueOf(this.okvUri));
        sb.append(", okvKmsKey=").append(String.valueOf(this.okvKmsKey));
        sb.append(", directoryName=").append(String.valueOf(this.directoryName));
        sb.append(", certificateDirectoryName=")
                .append(String.valueOf(this.certificateDirectoryName));
        sb.append(", certificateId=").append(String.valueOf(this.certificateId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OkvKeyDetails)) {
            return false;
        }

        OkvKeyDetails other = (OkvKeyDetails) o;
        return java.util.Objects.equals(this.okvUri, other.okvUri)
                && java.util.Objects.equals(this.okvKmsKey, other.okvKmsKey)
                && java.util.Objects.equals(this.directoryName, other.directoryName)
                && java.util.Objects.equals(
                        this.certificateDirectoryName, other.certificateDirectoryName)
                && java.util.Objects.equals(this.certificateId, other.certificateId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.okvUri == null ? 43 : this.okvUri.hashCode());
        result = (result * PRIME) + (this.okvKmsKey == null ? 43 : this.okvKmsKey.hashCode());
        result =
                (result * PRIME)
                        + (this.directoryName == null ? 43 : this.directoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateDirectoryName == null
                                ? 43
                                : this.certificateDirectoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        return result;
    }
}
