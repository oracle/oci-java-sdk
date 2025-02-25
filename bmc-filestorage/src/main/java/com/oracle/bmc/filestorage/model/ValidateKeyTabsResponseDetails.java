/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Validate keytabs response details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ValidateKeyTabsResponseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ValidateKeyTabsResponseDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "currentKerberosKeytabEntries",
        "backupKerberosKeytabEntries"
    })
    public ValidateKeyTabsResponseDetails(
            java.util.List<KerberosKeytabEntry> currentKerberosKeytabEntries,
            java.util.List<KerberosKeytabEntry> backupKerberosKeytabEntries) {
        super();
        this.currentKerberosKeytabEntries = currentKerberosKeytabEntries;
        this.backupKerberosKeytabEntries = backupKerberosKeytabEntries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of keytab entries (principal, encryptionType, keyVersionNumber).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentKerberosKeytabEntries")
        private java.util.List<KerberosKeytabEntry> currentKerberosKeytabEntries;

        /**
         * An array of keytab entries (principal, encryptionType, keyVersionNumber).
         * @param currentKerberosKeytabEntries the value to set
         * @return this builder
         **/
        public Builder currentKerberosKeytabEntries(
                java.util.List<KerberosKeytabEntry> currentKerberosKeytabEntries) {
            this.currentKerberosKeytabEntries = currentKerberosKeytabEntries;
            this.__explicitlySet__.add("currentKerberosKeytabEntries");
            return this;
        }
        /**
         * An array of keytab entries (principal, encryptionType, keyVersionNumber).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupKerberosKeytabEntries")
        private java.util.List<KerberosKeytabEntry> backupKerberosKeytabEntries;

        /**
         * An array of keytab entries (principal, encryptionType, keyVersionNumber).
         * @param backupKerberosKeytabEntries the value to set
         * @return this builder
         **/
        public Builder backupKerberosKeytabEntries(
                java.util.List<KerberosKeytabEntry> backupKerberosKeytabEntries) {
            this.backupKerberosKeytabEntries = backupKerberosKeytabEntries;
            this.__explicitlySet__.add("backupKerberosKeytabEntries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidateKeyTabsResponseDetails build() {
            ValidateKeyTabsResponseDetails model =
                    new ValidateKeyTabsResponseDetails(
                            this.currentKerberosKeytabEntries, this.backupKerberosKeytabEntries);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateKeyTabsResponseDetails model) {
            if (model.wasPropertyExplicitlySet("currentKerberosKeytabEntries")) {
                this.currentKerberosKeytabEntries(model.getCurrentKerberosKeytabEntries());
            }
            if (model.wasPropertyExplicitlySet("backupKerberosKeytabEntries")) {
                this.backupKerberosKeytabEntries(model.getBackupKerberosKeytabEntries());
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
     * An array of keytab entries (principal, encryptionType, keyVersionNumber).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentKerberosKeytabEntries")
    private final java.util.List<KerberosKeytabEntry> currentKerberosKeytabEntries;

    /**
     * An array of keytab entries (principal, encryptionType, keyVersionNumber).
     * @return the value
     **/
    public java.util.List<KerberosKeytabEntry> getCurrentKerberosKeytabEntries() {
        return currentKerberosKeytabEntries;
    }

    /**
     * An array of keytab entries (principal, encryptionType, keyVersionNumber).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupKerberosKeytabEntries")
    private final java.util.List<KerberosKeytabEntry> backupKerberosKeytabEntries;

    /**
     * An array of keytab entries (principal, encryptionType, keyVersionNumber).
     * @return the value
     **/
    public java.util.List<KerberosKeytabEntry> getBackupKerberosKeytabEntries() {
        return backupKerberosKeytabEntries;
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
        sb.append("ValidateKeyTabsResponseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("currentKerberosKeytabEntries=")
                .append(String.valueOf(this.currentKerberosKeytabEntries));
        sb.append(", backupKerberosKeytabEntries=")
                .append(String.valueOf(this.backupKerberosKeytabEntries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateKeyTabsResponseDetails)) {
            return false;
        }

        ValidateKeyTabsResponseDetails other = (ValidateKeyTabsResponseDetails) o;
        return java.util.Objects.equals(
                        this.currentKerberosKeytabEntries, other.currentKerberosKeytabEntries)
                && java.util.Objects.equals(
                        this.backupKerberosKeytabEntries, other.backupKerberosKeytabEntries)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.currentKerberosKeytabEntries == null
                                ? 43
                                : this.currentKerberosKeytabEntries.hashCode());
        result =
                (result * PRIME)
                        + (this.backupKerberosKeytabEntries == null
                                ? 43
                                : this.backupKerberosKeytabEntries.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
