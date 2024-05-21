/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The details for replacing ESXi host.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReplaceHostDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReplaceHostDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"esxiSoftwareVersion"})
    public ReplaceHostDetails(String esxiSoftwareVersion) {
        super();
        this.esxiSoftwareVersion = esxiSoftwareVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ESXi software bundle to install on the ESXi host.
         * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
         * To get a list of the available versions, use
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
        private String esxiSoftwareVersion;

        /**
         * The ESXi software bundle to install on the ESXi host.
         * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
         * To get a list of the available versions, use
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
         *
         * @param esxiSoftwareVersion the value to set
         * @return this builder
         **/
        public Builder esxiSoftwareVersion(String esxiSoftwareVersion) {
            this.esxiSoftwareVersion = esxiSoftwareVersion;
            this.__explicitlySet__.add("esxiSoftwareVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplaceHostDetails build() {
            ReplaceHostDetails model = new ReplaceHostDetails(this.esxiSoftwareVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplaceHostDetails model) {
            if (model.wasPropertyExplicitlySet("esxiSoftwareVersion")) {
                this.esxiSoftwareVersion(model.getEsxiSoftwareVersion());
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
     * The ESXi software bundle to install on the ESXi host.
     * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
     * To get a list of the available versions, use
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
    private final String esxiSoftwareVersion;

    /**
     * The ESXi software bundle to install on the ESXi host.
     * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
     * To get a list of the available versions, use
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
     *
     * @return the value
     **/
    public String getEsxiSoftwareVersion() {
        return esxiSoftwareVersion;
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
        sb.append("ReplaceHostDetails(");
        sb.append("super=").append(super.toString());
        sb.append("esxiSoftwareVersion=").append(String.valueOf(this.esxiSoftwareVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplaceHostDetails)) {
            return false;
        }

        ReplaceHostDetails other = (ReplaceHostDetails) o;
        return java.util.Objects.equals(this.esxiSoftwareVersion, other.esxiSoftwareVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.esxiSoftwareVersion == null
                                ? 43
                                : this.esxiSoftwareVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
