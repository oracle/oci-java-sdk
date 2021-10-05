/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details of the SSH key that will be used.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateSshDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateSshDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshkey")
        private String sshkey;

        public Builder sshkey(String sshkey) {
            this.sshkey = sshkey;
            this.__explicitlySet__.add("sshkey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private String user;

        public Builder user(String user) {
            this.user = user;
            this.__explicitlySet__.add("user");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sudoLocation")
        private String sudoLocation;

        public Builder sudoLocation(String sudoLocation) {
            this.sudoLocation = sudoLocation;
            this.__explicitlySet__.add("sudoLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSshDetails build() {
            UpdateSshDetails __instance__ = new UpdateSshDetails(host, sshkey, user, sudoLocation);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSshDetails o) {
            Builder copiedBuilder =
                    host(o.getHost())
                            .sshkey(o.getSshkey())
                            .user(o.getUser())
                            .sudoLocation(o.getSudoLocation());

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
     * Name of the host the SSH key is valid for.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * Private SSH key string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshkey")
    String sshkey;

    /**
     * SSH user
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    String user;

    /**
     * Sudo location
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sudoLocation")
    String sudoLocation;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
