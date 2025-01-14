/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the preferred credential. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = PreferredCredential.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NamedPreferredCredential.class,
            name = "NAMED_CREDENTIAL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = BasicPreferredCredential.class,
            name = "BASIC")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class PreferredCredential extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"credentialName", "status", "isAccessible"})
    protected PreferredCredential(
            String credentialName, PreferredCredentialStatus status, Boolean isAccessible) {
        super();
        this.credentialName = credentialName;
        this.status = status;
        this.isAccessible = isAccessible;
    }

    /** The name of the preferred credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
    private final String credentialName;

    /**
     * The name of the preferred credential.
     *
     * @return the value
     */
    public String getCredentialName() {
        return credentialName;
    }

    /** The status of the preferred credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final PreferredCredentialStatus status;

    /**
     * The status of the preferred credential.
     *
     * @return the value
     */
    public PreferredCredentialStatus getStatus() {
        return status;
    }

    /** Indicates whether the preferred credential is accessible. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessible")
    private final Boolean isAccessible;

    /**
     * Indicates whether the preferred credential is accessible.
     *
     * @return the value
     */
    public Boolean getIsAccessible() {
        return isAccessible;
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
        sb.append("PreferredCredential(");
        sb.append("super=").append(super.toString());
        sb.append("credentialName=").append(String.valueOf(this.credentialName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", isAccessible=").append(String.valueOf(this.isAccessible));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreferredCredential)) {
            return false;
        }

        PreferredCredential other = (PreferredCredential) o;
        return java.util.Objects.equals(this.credentialName, other.credentialName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.isAccessible, other.isAccessible)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialName == null ? 43 : this.credentialName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.isAccessible == null ? 43 : this.isAccessible.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
