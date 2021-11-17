/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * API key created on user's behalf.
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
    builder = CreateBdsApiKeyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateBdsApiKeyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
        private String passphrase;

        public Builder passphrase(String passphrase) {
            this.passphrase = passphrase;
            this.__explicitlySet__.add("passphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultRegion")
        private String defaultRegion;

        public Builder defaultRegion(String defaultRegion) {
            this.defaultRegion = defaultRegion;
            this.__explicitlySet__.add("defaultRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyAlias")
        private String keyAlias;

        public Builder keyAlias(String keyAlias) {
            this.keyAlias = keyAlias;
            this.__explicitlySet__.add("keyAlias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBdsApiKeyDetails build() {
            CreateBdsApiKeyDetails __instance__ =
                    new CreateBdsApiKeyDetails(userId, passphrase, defaultRegion, keyAlias);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBdsApiKeyDetails o) {
            Builder copiedBuilder =
                    userId(o.getUserId())
                            .passphrase(o.getPassphrase())
                            .defaultRegion(o.getDefaultRegion())
                            .keyAlias(o.getKeyAlias());

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
     * The OCID of the user for whom this new generated API key pair will be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    String userId;

    /**
     * Base64 passphrase used to secure the private key which will be created on user behalf.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
    String passphrase;

    /**
     * The name of the region to establish the Object Storage endpoint. See https://docs.oracle.com/en-us/iaas/api/#/en/identity/20160918/Region/
     * for additional information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultRegion")
    String defaultRegion;

    /**
     * User friendly identifier used to uniquely differentiate between different API keys associated with this Big Data Service cluster.
     * Only ASCII alphanumeric characters with no spaces allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyAlias")
    String keyAlias;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
