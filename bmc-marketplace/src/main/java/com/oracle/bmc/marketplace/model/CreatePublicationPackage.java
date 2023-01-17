/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * A base object for creating a publication package. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "packageType",
        defaultImpl = CreatePublicationPackage.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateImagePublicationPackage.class,
            name = "IMAGE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class CreatePublicationPackage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"packageVersion", "operatingSystem", "eula"})
    protected CreatePublicationPackage(
            String packageVersion, OperatingSystem operatingSystem, java.util.List<Eula> eula) {
        super();
        this.packageVersion = packageVersion;
        this.operatingSystem = operatingSystem;
        this.eula = eula;
    }

    /** The package version. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * The package version.
     *
     * @return the value
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final OperatingSystem operatingSystem;

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    /** The end user license agreeement (EULA) that consumers of this listing must accept. */
    @com.fasterxml.jackson.annotation.JsonProperty("eula")
    private final java.util.List<Eula> eula;

    /**
     * The end user license agreeement (EULA) that consumers of this listing must accept.
     *
     * @return the value
     */
    public java.util.List<Eula> getEula() {
        return eula;
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
        sb.append("CreatePublicationPackage(");
        sb.append("super=").append(super.toString());
        sb.append("packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", eula=").append(String.valueOf(this.eula));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePublicationPackage)) {
            return false;
        }

        CreatePublicationPackage other = (CreatePublicationPackage) o;
        return java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(this.eula, other.eula)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result = (result * PRIME) + (this.eula == null ? 43 : this.eula.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
