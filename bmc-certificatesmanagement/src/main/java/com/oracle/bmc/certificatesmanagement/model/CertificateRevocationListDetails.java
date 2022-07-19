/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the certificate revocation list (CRL).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateRevocationListDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CertificateRevocationListDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"objectStorageConfig", "customFormattedUrls"})
    public CertificateRevocationListDetails(
            ObjectStorageBucketConfigDetails objectStorageConfig,
            java.util.List<String> customFormattedUrls) {
        super();
        this.objectStorageConfig = objectStorageConfig;
        this.customFormattedUrls = customFormattedUrls;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageConfig")
        private ObjectStorageBucketConfigDetails objectStorageConfig;

        public Builder objectStorageConfig(ObjectStorageBucketConfigDetails objectStorageConfig) {
            this.objectStorageConfig = objectStorageConfig;
            this.__explicitlySet__.add("objectStorageConfig");
            return this;
        }
        /**
         * Optional CRL access points, expressed using a format where the version number of the issuing CA is inserted wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customFormattedUrls")
        private java.util.List<String> customFormattedUrls;

        /**
         * Optional CRL access points, expressed using a format where the version number of the issuing CA is inserted wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
         *
         * @param customFormattedUrls the value to set
         * @return this builder
         **/
        public Builder customFormattedUrls(java.util.List<String> customFormattedUrls) {
            this.customFormattedUrls = customFormattedUrls;
            this.__explicitlySet__.add("customFormattedUrls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateRevocationListDetails build() {
            CertificateRevocationListDetails __instance__ =
                    new CertificateRevocationListDetails(objectStorageConfig, customFormattedUrls);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateRevocationListDetails o) {
            Builder copiedBuilder =
                    objectStorageConfig(o.getObjectStorageConfig())
                            .customFormattedUrls(o.getCustomFormattedUrls());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageConfig")
    private final ObjectStorageBucketConfigDetails objectStorageConfig;

    public ObjectStorageBucketConfigDetails getObjectStorageConfig() {
        return objectStorageConfig;
    }

    /**
     * Optional CRL access points, expressed using a format where the version number of the issuing CA is inserted wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customFormattedUrls")
    private final java.util.List<String> customFormattedUrls;

    /**
     * Optional CRL access points, expressed using a format where the version number of the issuing CA is inserted wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
     *
     * @return the value
     **/
    public java.util.List<String> getCustomFormattedUrls() {
        return customFormattedUrls;
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
        sb.append("CertificateRevocationListDetails(");
        sb.append("objectStorageConfig=").append(String.valueOf(this.objectStorageConfig));
        sb.append(", customFormattedUrls=").append(String.valueOf(this.customFormattedUrls));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateRevocationListDetails)) {
            return false;
        }

        CertificateRevocationListDetails other = (CertificateRevocationListDetails) o;
        return java.util.Objects.equals(this.objectStorageConfig, other.objectStorageConfig)
                && java.util.Objects.equals(this.customFormattedUrls, other.customFormattedUrls)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.objectStorageConfig == null
                                ? 43
                                : this.objectStorageConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.customFormattedUrls == null
                                ? 43
                                : this.customFormattedUrls.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
