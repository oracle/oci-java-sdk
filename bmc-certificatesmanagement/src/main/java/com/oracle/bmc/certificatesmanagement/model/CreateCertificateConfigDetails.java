/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the contents of the certificate and certificate metadata.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType",
    defaultImpl = CreateCertificateConfigDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateCertificateManagedExternallyIssuedByInternalCaConfigDetails.class,
        name = "MANAGED_EXTERNALLY_ISSUED_BY_INTERNAL_CA"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateCertificateIssuedByInternalCaConfigDetails.class,
        name = "ISSUED_BY_INTERNAL_CA"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateCertificateByImportingConfigDetails.class,
        name = "IMPORTED"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateCertificateConfigDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"versionName"})
    protected CreateCertificateConfigDetails(String versionName) {
        super();
        this.versionName = versionName;
    }

    /**
     * A name for the certificate. When the value is not null, a name is unique across versions of a given certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    private final String versionName;

    /**
     * A name for the certificate. When the value is not null, a name is unique across versions of a given certificate.
     * @return the value
     **/
    public String getVersionName() {
        return versionName;
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
        sb.append("CreateCertificateConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("versionName=").append(String.valueOf(this.versionName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCertificateConfigDetails)) {
            return false;
        }

        CreateCertificateConfigDetails other = (CreateCertificateConfigDetails) o;
        return java.util.Objects.equals(this.versionName, other.versionName) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.versionName == null ? 43 : this.versionName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
