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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TestBdsObjectStorageConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TestBdsObjectStorageConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageUri")
        private String objectStorageUri;

        public Builder objectStorageUri(String objectStorageUri) {
            this.objectStorageUri = objectStorageUri;
            this.__explicitlySet__.add("objectStorageUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
        private String passphrase;

        public Builder passphrase(String passphrase) {
            this.passphrase = passphrase;
            this.__explicitlySet__.add("passphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageRegion")
        private String objectStorageRegion;

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

    /**
     * An Oracle Cloud Infrastructure URI to which this connection must be attempted. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageUri")
    String objectStorageUri;

    /**
     * Base64 passphrase used to secure the private key which will be created on user behalf.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
    String passphrase;

    /**
     * The name of the region to establish the Object Storage endpoint. Example us-phoenix-1 .
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageRegion")
    String objectStorageRegion;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
