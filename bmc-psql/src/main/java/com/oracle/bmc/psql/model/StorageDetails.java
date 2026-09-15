/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Storage details of the database system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "systemType",
        defaultImpl = StorageDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OciOptimizedStorageDetails.class,
            name = "OCI_OPTIMIZED_STORAGE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class StorageDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isRegionallyDurable", "availabilityDomain", "kmsKeyId"})
    protected StorageDetails(
            Boolean isRegionallyDurable, String availabilityDomain, String kmsKeyId) {
        super();
        this.isRegionallyDurable = isRegionallyDurable;
        this.availabilityDomain = availabilityDomain;
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * Specifies if the block volume used for the database system is regional or AD-local. If not
     * specified, it will be set to false. If {@code isRegionallyDurable} is set to true, {@code
     * availabilityDomain} should not be specified. If {@code isRegionallyDurable} is set to false,
     * {@code availabilityDomain} must be specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRegionallyDurable")
    private final Boolean isRegionallyDurable;

    /**
     * Specifies if the block volume used for the database system is regional or AD-local. If not
     * specified, it will be set to false. If {@code isRegionallyDurable} is set to true, {@code
     * availabilityDomain} should not be specified. If {@code isRegionallyDurable} is set to false,
     * {@code availabilityDomain} must be specified.
     *
     * @return the value
     */
    public Boolean getIsRegionallyDurable() {
        return isRegionallyDurable;
    }

    /**
     * Specifies the availability domain of AD-local storage. If {@code isRegionallyDurable} is set
     * to true, {@code availabilityDomain} should not be specified. If {@code isRegionallyDurable}
     * is set to false, {@code availabilityDomain} must be specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Specifies the availability domain of AD-local storage. If {@code isRegionallyDurable} is set
     * to true, {@code availabilityDomain} should not be specified. If {@code isRegionallyDurable}
     * is set to false, {@code availabilityDomain} must be specified.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the Vault service key to assign as the master encryption key for the database
     * system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Vault service key to assign as the master encryption key for the database
     * system.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
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
        sb.append("StorageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isRegionallyDurable=").append(String.valueOf(this.isRegionallyDurable));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StorageDetails)) {
            return false;
        }

        StorageDetails other = (StorageDetails) o;
        return java.util.Objects.equals(this.isRegionallyDurable, other.isRegionallyDurable)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRegionallyDurable == null
                                ? 43
                                : this.isRegionallyDurable.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
