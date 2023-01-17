/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Used for creating NFS Auto Mount backup destinations for autonomous on ExaCC.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutomatedMountDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "mountType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutomatedMountDetails extends MountTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * IP addresses for NFS Auto mount.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nfsServer")
        private java.util.List<String> nfsServer;

        /**
         * IP addresses for NFS Auto mount.
         * @param nfsServer the value to set
         * @return this builder
         **/
        public Builder nfsServer(java.util.List<String> nfsServer) {
            this.nfsServer = nfsServer;
            this.__explicitlySet__.add("nfsServer");
            return this;
        }
        /**
         * Specifies the directory on which to mount the file system
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nfsServerExport")
        private String nfsServerExport;

        /**
         * Specifies the directory on which to mount the file system
         * @param nfsServerExport the value to set
         * @return this builder
         **/
        public Builder nfsServerExport(String nfsServerExport) {
            this.nfsServerExport = nfsServerExport;
            this.__explicitlySet__.add("nfsServerExport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutomatedMountDetails build() {
            AutomatedMountDetails model =
                    new AutomatedMountDetails(this.nfsServer, this.nfsServerExport);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutomatedMountDetails model) {
            if (model.wasPropertyExplicitlySet("nfsServer")) {
                this.nfsServer(model.getNfsServer());
            }
            if (model.wasPropertyExplicitlySet("nfsServerExport")) {
                this.nfsServerExport(model.getNfsServerExport());
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

    @Deprecated
    public AutomatedMountDetails(java.util.List<String> nfsServer, String nfsServerExport) {
        super();
        this.nfsServer = nfsServer;
        this.nfsServerExport = nfsServerExport;
    }

    /**
     * IP addresses for NFS Auto mount.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nfsServer")
    private final java.util.List<String> nfsServer;

    /**
     * IP addresses for NFS Auto mount.
     * @return the value
     **/
    public java.util.List<String> getNfsServer() {
        return nfsServer;
    }

    /**
     * Specifies the directory on which to mount the file system
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nfsServerExport")
    private final String nfsServerExport;

    /**
     * Specifies the directory on which to mount the file system
     * @return the value
     **/
    public String getNfsServerExport() {
        return nfsServerExport;
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
        sb.append("AutomatedMountDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", nfsServer=").append(String.valueOf(this.nfsServer));
        sb.append(", nfsServerExport=").append(String.valueOf(this.nfsServerExport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutomatedMountDetails)) {
            return false;
        }

        AutomatedMountDetails other = (AutomatedMountDetails) o;
        return java.util.Objects.equals(this.nfsServer, other.nfsServer)
                && java.util.Objects.equals(this.nfsServerExport, other.nfsServerExport)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.nfsServer == null ? 43 : this.nfsServer.hashCode());
        result =
                (result * PRIME)
                        + (this.nfsServerExport == null ? 43 : this.nfsServerExport.hashCode());
        return result;
    }
}
