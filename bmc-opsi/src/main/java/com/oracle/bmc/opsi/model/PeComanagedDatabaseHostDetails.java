/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Input Host Details used for connection requests for private endpoint accessed db resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PeComanagedDatabaseHostDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PeComanagedDatabaseHostDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hostIp", "port"})
    public PeComanagedDatabaseHostDetails(String hostIp, Integer port) {
        super();
        this.hostIp = hostIp;
        this.port = port;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Host IP used for connection requests for Cloud DB resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostIp")
        private String hostIp;

        /**
         * Host IP used for connection requests for Cloud DB resource.
         * @param hostIp the value to set
         * @return this builder
         **/
        public Builder hostIp(String hostIp) {
            this.hostIp = hostIp;
            this.__explicitlySet__.add("hostIp");
            return this;
        }
        /**
         * Listener port number used for connection requests for rivate endpoint accessed db resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Listener port number used for connection requests for rivate endpoint accessed db resource.
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeComanagedDatabaseHostDetails build() {
            PeComanagedDatabaseHostDetails model =
                    new PeComanagedDatabaseHostDetails(this.hostIp, this.port);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeComanagedDatabaseHostDetails model) {
            if (model.wasPropertyExplicitlySet("hostIp")) {
                this.hostIp(model.getHostIp());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
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
     * Host IP used for connection requests for Cloud DB resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostIp")
    private final String hostIp;

    /**
     * Host IP used for connection requests for Cloud DB resource.
     * @return the value
     **/
    public String getHostIp() {
        return hostIp;
    }

    /**
     * Listener port number used for connection requests for rivate endpoint accessed db resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Listener port number used for connection requests for rivate endpoint accessed db resource.
     * @return the value
     **/
    public Integer getPort() {
        return port;
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
        sb.append("PeComanagedDatabaseHostDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hostIp=").append(String.valueOf(this.hostIp));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeComanagedDatabaseHostDetails)) {
            return false;
        }

        PeComanagedDatabaseHostDetails other = (PeComanagedDatabaseHostDetails) o;
        return java.util.Objects.equals(this.hostIp, other.hostIp)
                && java.util.Objects.equals(this.port, other.port)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostIp == null ? 43 : this.hostIp.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
