/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Test access to specified Object Storage bucket using the API key.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TestBdsObjectStorageConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TestBdsObjectStorageConnectionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"objectStorageUri", "passphrase", "objectStorageRegion"})
    public TestBdsObjectStorageConnectionDetails(
            String objectStorageUri, String passphrase, String objectStorageRegion) {
        super();
        this.objectStorageUri = objectStorageUri;
        this.passphrase = passphrase;
        this.objectStorageRegion = objectStorageRegion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An Oracle Cloud Infrastructure URI to which this connection must be attempted. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageUri")
        private String objectStorageUri;

        /**
         * An Oracle Cloud Infrastructure URI to which this connection must be attempted. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         * @param objectStorageUri the value to set
         * @return this builder
         **/
        public Builder objectStorageUri(String objectStorageUri) {
            this.objectStorageUri = objectStorageUri;
            this.__explicitlySet__.add("objectStorageUri");
            return this;
        }
        /**
         * Base64 passphrase used to secure the private key which will be created on user behalf.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
        private String passphrase;

        /**
         * Base64 passphrase used to secure the private key which will be created on user behalf.
         * @param passphrase the value to set
         * @return this builder
         **/
        public Builder passphrase(String passphrase) {
            this.passphrase = passphrase;
            this.__explicitlySet__.add("passphrase");
            return this;
        }
        /**
         * The name of the region to establish the Object Storage endpoint. Example us-phoenix-1 .
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageRegion")
        private String objectStorageRegion;

        /**
         * The name of the region to establish the Object Storage endpoint. Example us-phoenix-1 .
         * @param objectStorageRegion the value to set
         * @return this builder
         **/
        public Builder objectStorageRegion(String objectStorageRegion) {
            this.objectStorageRegion = objectStorageRegion;
            this.__explicitlySet__.add("objectStorageRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TestBdsObjectStorageConnectionDetails build() {
            TestBdsObjectStorageConnectionDetails __instance__ =
                    new TestBdsObjectStorageConnectionDetails(
                            objectStorageUri, passphrase, objectStorageRegion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestBdsObjectStorageConnectionDetails o) {
            Builder copiedBuilder =
                    objectStorageUri(o.getObjectStorageUri())
                            .passphrase(o.getPassphrase())
                            .objectStorageRegion(o.getObjectStorageRegion());

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

    /**
     * An Oracle Cloud Infrastructure URI to which this connection must be attempted. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageUri")
    private final String objectStorageUri;

    /**
     * An Oracle Cloud Infrastructure URI to which this connection must be attempted. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     * @return the value
     **/
    public String getObjectStorageUri() {
        return objectStorageUri;
    }

    /**
     * Base64 passphrase used to secure the private key which will be created on user behalf.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
    private final String passphrase;

    /**
     * Base64 passphrase used to secure the private key which will be created on user behalf.
     * @return the value
     **/
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * The name of the region to establish the Object Storage endpoint. Example us-phoenix-1 .
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageRegion")
    private final String objectStorageRegion;

    /**
     * The name of the region to establish the Object Storage endpoint. Example us-phoenix-1 .
     * @return the value
     **/
    public String getObjectStorageRegion() {
        return objectStorageRegion;
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
        sb.append("TestBdsObjectStorageConnectionDetails(");
        sb.append("objectStorageUri=").append(String.valueOf(this.objectStorageUri));
        sb.append(", passphrase=").append(String.valueOf(this.passphrase));
        sb.append(", objectStorageRegion=").append(String.valueOf(this.objectStorageRegion));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestBdsObjectStorageConnectionDetails)) {
            return false;
        }

        TestBdsObjectStorageConnectionDetails other = (TestBdsObjectStorageConnectionDetails) o;
        return java.util.Objects.equals(this.objectStorageUri, other.objectStorageUri)
                && java.util.Objects.equals(this.passphrase, other.passphrase)
                && java.util.Objects.equals(this.objectStorageRegion, other.objectStorageRegion)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.objectStorageUri == null ? 43 : this.objectStorageUri.hashCode());
        result = (result * PRIME) + (this.passphrase == null ? 43 : this.passphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageRegion == null
                                ? 43
                                : this.objectStorageRegion.hashCode());
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
