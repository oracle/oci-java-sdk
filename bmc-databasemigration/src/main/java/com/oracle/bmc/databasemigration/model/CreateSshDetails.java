/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details of the SSH key that will be used. Required for source database Manual and UserManagerOci connection types.
 * Not required for source container database connections.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateSshDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSshDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"host", "sshkey", "user", "sudoLocation"})
    public CreateSshDetails(String host, String sshkey, String user, String sudoLocation) {
        super();
        this.host = host;
        this.sshkey = sshkey;
        this.user = user;
        this.sudoLocation = sudoLocation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        public CreateSshDetails build() {
            CreateSshDetails __instance__ = new CreateSshDetails(host, sshkey, user, sudoLocation);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSshDetails o) {
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Name of the host the SSH key is valid for.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    public String getHost() {
        return host;
    }

    /**
     * Private SSH key string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshkey")
    private final String sshkey;

    public String getSshkey() {
        return sshkey;
    }

    /**
     * SSH user
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    private final String user;

    public String getUser() {
        return user;
    }

    /**
     * Sudo location
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sudoLocation")
    private final String sudoLocation;

    public String getSudoLocation() {
        return sudoLocation;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateSshDetails(");
        sb.append("host=").append(String.valueOf(this.host));
        sb.append(", sshkey=").append(String.valueOf(this.sshkey));
        sb.append(", user=").append(String.valueOf(this.user));
        sb.append(", sudoLocation=").append(String.valueOf(this.sudoLocation));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSshDetails)) {
            return false;
        }

        CreateSshDetails other = (CreateSshDetails) o;
        return java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.sshkey, other.sshkey)
                && java.util.Objects.equals(this.user, other.user)
                && java.util.Objects.equals(this.sudoLocation, other.sudoLocation)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.sshkey == null ? 43 : this.sshkey.hashCode());
        result = (result * PRIME) + (this.user == null ? 43 : this.user.hashCode());
        result = (result * PRIME) + (this.sudoLocation == null ? 43 : this.sudoLocation.hashCode());
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
