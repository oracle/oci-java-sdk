/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateSshDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateSshDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"host", "sshkey", "user", "sudoLocation"})
    public UpdateSshDetails(String host, String sshkey, String user, String sudoLocation) {
        super();
        this.host = host;
        this.sshkey = sshkey;
        this.user = user;
        this.sudoLocation = sudoLocation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the host the SSH key is valid for.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * Name of the host the SSH key is valid for.
         *
         * @param host the value to set
         * @return this builder
         **/
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /**
         * Private SSH key string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshkey")
        private String sshkey;

        /**
         * Private SSH key string.
         *
         * @param sshkey the value to set
         * @return this builder
         **/
        public Builder sshkey(String sshkey) {
            this.sshkey = sshkey;
            this.__explicitlySet__.add("sshkey");
            return this;
        }
        /**
         * SSH user
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private String user;

        /**
         * SSH user
         *
         * @param user the value to set
         * @return this builder
         **/
        public Builder user(String user) {
            this.user = user;
            this.__explicitlySet__.add("user");
            return this;
        }
        /**
         * Sudo location
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sudoLocation")
        private String sudoLocation;

        /**
         * Sudo location
         *
         * @param sudoLocation the value to set
         * @return this builder
         **/
        public Builder sudoLocation(String sudoLocation) {
            this.sudoLocation = sudoLocation;
            this.__explicitlySet__.add("sudoLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSshDetails build() {
            UpdateSshDetails model =
                    new UpdateSshDetails(this.host, this.sshkey, this.user, this.sudoLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSshDetails model) {
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("sshkey")) {
                this.sshkey(model.getSshkey());
            }
            if (model.wasPropertyExplicitlySet("user")) {
                this.user(model.getUser());
            }
            if (model.wasPropertyExplicitlySet("sudoLocation")) {
                this.sudoLocation(model.getSudoLocation());
            }
            return this;
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

    /**
     * Name of the host the SSH key is valid for.
     *
     * @return the value
     **/
    public String getHost() {
        return host;
    }

    /**
     * Private SSH key string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshkey")
    private final String sshkey;

    /**
     * Private SSH key string.
     *
     * @return the value
     **/
    public String getSshkey() {
        return sshkey;
    }

    /**
     * SSH user
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    private final String user;

    /**
     * SSH user
     *
     * @return the value
     **/
    public String getUser() {
        return user;
    }

    /**
     * Sudo location
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sudoLocation")
    private final String sudoLocation;

    /**
     * Sudo location
     *
     * @return the value
     **/
    public String getSudoLocation() {
        return sudoLocation;
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
        sb.append("UpdateSshDetails(");
        sb.append("super=").append(super.toString());
        sb.append("host=").append(String.valueOf(this.host));
        sb.append(", sshkey=").append(String.valueOf(this.sshkey));
        sb.append(", user=").append(String.valueOf(this.user));
        sb.append(", sudoLocation=").append(String.valueOf(this.sudoLocation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSshDetails)) {
            return false;
        }

        UpdateSshDetails other = (UpdateSshDetails) o;
        return java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.sshkey, other.sshkey)
                && java.util.Objects.equals(this.user, other.user)
                && java.util.Objects.equals(this.sudoLocation, other.sudoLocation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.sshkey == null ? 43 : this.sshkey.hashCode());
        result = (result * PRIME) + (this.user == null ? 43 : this.user.hashCode());
        result = (result * PRIME) + (this.sudoLocation == null ? 43 : this.sudoLocation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
