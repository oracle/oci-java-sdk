/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Catalog source payload. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configSourceType",
        defaultImpl = CatalogSourcePayload.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CatalogGitSourceConfig.class,
            name = "GIT_CATALOG_SOURCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CatalogSourceTemplateConfig.class,
            name = "STACK_TEMPLATE_CATALOG_SOURCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CatalogParSourceConfig.class,
            name = "PAR_CATALOG_SOURCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CatalogMarketplaceSourceConfig.class,
            name = "MARKETPLACE_CATALOG_SOURCE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CatalogSourcePayload
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"workingDirectory"})
    protected CatalogSourcePayload(String workingDirectory) {
        super();
        this.workingDirectory = workingDirectory;
    }

    /**
     * File path to the directory to use for running Terraform. If not specified, the root directory
     * is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
    private final String workingDirectory;

    /**
     * File path to the directory to use for running Terraform. If not specified, the root directory
     * is used.
     *
     * @return the value
     */
    public String getWorkingDirectory() {
        return workingDirectory;
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
        sb.append("CatalogSourcePayload(");
        sb.append("super=").append(super.toString());
        sb.append("workingDirectory=").append(String.valueOf(this.workingDirectory));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogSourcePayload)) {
            return false;
        }

        CatalogSourcePayload other = (CatalogSourcePayload) o;
        return java.util.Objects.equals(this.workingDirectory, other.workingDirectory)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.workingDirectory == null ? 43 : this.workingDirectory.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
