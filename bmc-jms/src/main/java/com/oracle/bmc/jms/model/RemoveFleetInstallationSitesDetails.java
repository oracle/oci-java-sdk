/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The list of Java installation sites to remove.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RemoveFleetInstallationSitesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RemoveFleetInstallationSitesDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"installationSites"})
    public RemoveFleetInstallationSitesDetails(
            java.util.List<ExistingInstallationSiteId> installationSites) {
        super();
        this.installationSites = installationSites;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of installation sites to remove.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("installationSites")
        private java.util.List<ExistingInstallationSiteId> installationSites;

        /**
         * The list of installation sites to remove.
         * @param installationSites the value to set
         * @return this builder
         **/
        public Builder installationSites(
                java.util.List<ExistingInstallationSiteId> installationSites) {
            this.installationSites = installationSites;
            this.__explicitlySet__.add("installationSites");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveFleetInstallationSitesDetails build() {
            RemoveFleetInstallationSitesDetails model =
                    new RemoveFleetInstallationSitesDetails(this.installationSites);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveFleetInstallationSitesDetails model) {
            if (model.wasPropertyExplicitlySet("installationSites")) {
                this.installationSites(model.getInstallationSites());
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
     * The list of installation sites to remove.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installationSites")
    private final java.util.List<ExistingInstallationSiteId> installationSites;

    /**
     * The list of installation sites to remove.
     * @return the value
     **/
    public java.util.List<ExistingInstallationSiteId> getInstallationSites() {
        return installationSites;
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
        sb.append("RemoveFleetInstallationSitesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("installationSites=").append(String.valueOf(this.installationSites));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveFleetInstallationSitesDetails)) {
            return false;
        }

        RemoveFleetInstallationSitesDetails other = (RemoveFleetInstallationSitesDetails) o;
        return java.util.Objects.equals(this.installationSites, other.installationSites)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.installationSites == null ? 43 : this.installationSites.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
