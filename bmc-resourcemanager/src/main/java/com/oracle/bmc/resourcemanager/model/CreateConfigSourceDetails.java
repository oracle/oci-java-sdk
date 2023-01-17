/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Creation details for a configuration source used with the stack.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceType",
    defaultImpl = CreateConfigSourceDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDevOpsConfigSourceDetails.class,
        name = "DEVOPS_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateBitbucketCloudConfigSourceDetails.class,
        name = "BITBUCKET_CLOUD_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateZipUploadConfigSourceDetails.class,
        name = "ZIP_UPLOAD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateBitbucketServerConfigSourceDetails.class,
        name = "BITBUCKET_SERVER_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateGitConfigSourceDetails.class,
        name = "GIT_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateObjectStorageConfigSourceDetails.class,
        name = "OBJECT_STORAGE_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateCompartmentConfigSourceDetails.class,
        name = "COMPARTMENT_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateStackTemplateConfigSourceDetails.class,
        name = "TEMPLATE_CONFIG_SOURCE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateConfigSourceDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"workingDirectory"})
    protected CreateConfigSourceDetails(String workingDirectory) {
        super();
        this.workingDirectory = workingDirectory;
    }

    /**
     * File path to the directory to use for running Terraform.
     * If not specified, the root directory is used.
     * Required when using a zip Terraform configuration ({@code configSourceType} value of {@code ZIP_UPLOAD}) that contains folders.
     * Ignored for the {@code configSourceType} value of {@code COMPARTMENT_CONFIG_SOURCE}.
     * For more information about required and recommended file structure, see
     * [File Structure (Terraform Configurations for Resource Manager)](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager.htm#filestructure).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
    private final String workingDirectory;

    /**
     * File path to the directory to use for running Terraform.
     * If not specified, the root directory is used.
     * Required when using a zip Terraform configuration ({@code configSourceType} value of {@code ZIP_UPLOAD}) that contains folders.
     * Ignored for the {@code configSourceType} value of {@code COMPARTMENT_CONFIG_SOURCE}.
     * For more information about required and recommended file structure, see
     * [File Structure (Terraform Configurations for Resource Manager)](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager.htm#filestructure).
     *
     * @return the value
     **/
    public String getWorkingDirectory() {
        return workingDirectory;
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
        sb.append("CreateConfigSourceDetails(");
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
        if (!(o instanceof CreateConfigSourceDetails)) {
            return false;
        }

        CreateConfigSourceDetails other = (CreateConfigSourceDetails) o;
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
