/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Private source Scan Hostname model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PrivateSourceScanHost.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class PrivateSourceScanHost
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"scanHostname", "scanPort", "description"})
    public PrivateSourceScanHost(String scanHostname, Integer scanPort, String description) {
        super();
        this.scanHostname = scanHostname;
        this.scanPort = scanPort;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Private Source Scan hostname. Ex: db01-scan.corp.example.com,
         * prd-db01-scan.mycompany.com.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanHostname")
        private String scanHostname;

        /**
         * Private Source Scan hostname. Ex: db01-scan.corp.example.com,
         * prd-db01-scan.mycompany.com.
         *
         * @param scanHostname the value to set
         * @return this builder
         */
        public Builder scanHostname(String scanHostname) {
            this.scanHostname = scanHostname;
            this.__explicitlySet__.add("scanHostname");
            return this;
        }
        /**
         * Private Source Scan host port. This is the source port where SCAN protocol will get
         * connected (e.g. 1521).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanPort")
        private Integer scanPort;

        /**
         * Private Source Scan host port. This is the source port where SCAN protocol will get
         * connected (e.g. 1521).
         *
         * @param scanPort the value to set
         * @return this builder
         */
        public Builder scanPort(Integer scanPort) {
            this.scanPort = scanPort;
            this.__explicitlySet__.add("scanPort");
            return this;
        }
        /** Description of private source scan host zone. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of private source scan host zone.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateSourceScanHost build() {
            PrivateSourceScanHost model =
                    new PrivateSourceScanHost(this.scanHostname, this.scanPort, this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateSourceScanHost model) {
            if (model.wasPropertyExplicitlySet("scanHostname")) {
                this.scanHostname(model.getScanHostname());
            }
            if (model.wasPropertyExplicitlySet("scanPort")) {
                this.scanPort(model.getScanPort());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /**
     * Private Source Scan hostname. Ex: db01-scan.corp.example.com, prd-db01-scan.mycompany.com.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanHostname")
    private final String scanHostname;

    /**
     * Private Source Scan hostname. Ex: db01-scan.corp.example.com, prd-db01-scan.mycompany.com.
     *
     * @return the value
     */
    public String getScanHostname() {
        return scanHostname;
    }

    /**
     * Private Source Scan host port. This is the source port where SCAN protocol will get connected
     * (e.g. 1521).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanPort")
    private final Integer scanPort;

    /**
     * Private Source Scan host port. This is the source port where SCAN protocol will get connected
     * (e.g. 1521).
     *
     * @return the value
     */
    public Integer getScanPort() {
        return scanPort;
    }

    /** Description of private source scan host zone. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of private source scan host zone.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("PrivateSourceScanHost(");
        sb.append("super=").append(super.toString());
        sb.append("scanHostname=").append(String.valueOf(this.scanHostname));
        sb.append(", scanPort=").append(String.valueOf(this.scanPort));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateSourceScanHost)) {
            return false;
        }

        PrivateSourceScanHost other = (PrivateSourceScanHost) o;
        return java.util.Objects.equals(this.scanHostname, other.scanHostname)
                && java.util.Objects.equals(this.scanPort, other.scanPort)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.scanHostname == null ? 43 : this.scanHostname.hashCode());
        result = (result * PRIME) + (this.scanPort == null ? 43 : this.scanPort.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
