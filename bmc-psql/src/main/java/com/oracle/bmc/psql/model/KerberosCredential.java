/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Kerberos Credential details as OCI Vault Secret for the keytab. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KerberosCredential.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KerberosCredential
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"realmName", "keytabSecretId", "keytabSecretVersion"})
    public KerberosCredential(String realmName, String keytabSecretId, Long keytabSecretVersion) {
        super();
        this.realmName = realmName;
        this.keytabSecretId = keytabSecretId;
        this.keytabSecretVersion = keytabSecretVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Kerberos realm name. https://docs.oracle.com/cd/E36784_01/html/E37126/kplanning-27.html
         * Realm names can consist of any ASCII string. Usually, the realm name is the same as your
         * DNS domain name except that the realm name is in uppercase. This convention helps
         * differentiate problems with the Kerberos service from problems with the DNS namespace,
         * while keeping a name that is familiar. You can use any string, but configuration and
         * maintenance might then require more work. Use realm names that follow the standard
         * Internet naming structure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("realmName")
        private String realmName;

        /**
         * Kerberos realm name. https://docs.oracle.com/cd/E36784_01/html/E37126/kplanning-27.html
         * Realm names can consist of any ASCII string. Usually, the realm name is the same as your
         * DNS domain name except that the realm name is in uppercase. This convention helps
         * differentiate problems with the Kerberos service from problems with the DNS namespace,
         * while keeping a name that is familiar. You can use any string, but configuration and
         * maintenance might then require more work. Use realm names that follow the standard
         * Internet naming structure.
         *
         * @param realmName the value to set
         * @return this builder
         */
        public Builder realmName(String realmName) {
            this.realmName = realmName;
            this.__explicitlySet__.add("realmName");
            return this;
        }
        /** The OCID of the secret where the Kerberos keytab file is stored as base64 text. */
        @com.fasterxml.jackson.annotation.JsonProperty("keytabSecretId")
        private String keytabSecretId;

        /**
         * The OCID of the secret where the Kerberos keytab file is stored as base64 text.
         *
         * @param keytabSecretId the value to set
         * @return this builder
         */
        public Builder keytabSecretId(String keytabSecretId) {
            this.keytabSecretId = keytabSecretId;
            this.__explicitlySet__.add("keytabSecretId");
            return this;
        }
        /** The secret version of the stored Kerberos keytab file. */
        @com.fasterxml.jackson.annotation.JsonProperty("keytabSecretVersion")
        private Long keytabSecretVersion;

        /**
         * The secret version of the stored Kerberos keytab file.
         *
         * @param keytabSecretVersion the value to set
         * @return this builder
         */
        public Builder keytabSecretVersion(Long keytabSecretVersion) {
            this.keytabSecretVersion = keytabSecretVersion;
            this.__explicitlySet__.add("keytabSecretVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KerberosCredential build() {
            KerberosCredential model =
                    new KerberosCredential(
                            this.realmName, this.keytabSecretId, this.keytabSecretVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KerberosCredential model) {
            if (model.wasPropertyExplicitlySet("realmName")) {
                this.realmName(model.getRealmName());
            }
            if (model.wasPropertyExplicitlySet("keytabSecretId")) {
                this.keytabSecretId(model.getKeytabSecretId());
            }
            if (model.wasPropertyExplicitlySet("keytabSecretVersion")) {
                this.keytabSecretVersion(model.getKeytabSecretVersion());
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
     * Kerberos realm name. https://docs.oracle.com/cd/E36784_01/html/E37126/kplanning-27.html Realm
     * names can consist of any ASCII string. Usually, the realm name is the same as your DNS domain
     * name except that the realm name is in uppercase. This convention helps differentiate problems
     * with the Kerberos service from problems with the DNS namespace, while keeping a name that is
     * familiar. You can use any string, but configuration and maintenance might then require more
     * work. Use realm names that follow the standard Internet naming structure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("realmName")
    private final String realmName;

    /**
     * Kerberos realm name. https://docs.oracle.com/cd/E36784_01/html/E37126/kplanning-27.html Realm
     * names can consist of any ASCII string. Usually, the realm name is the same as your DNS domain
     * name except that the realm name is in uppercase. This convention helps differentiate problems
     * with the Kerberos service from problems with the DNS namespace, while keeping a name that is
     * familiar. You can use any string, but configuration and maintenance might then require more
     * work. Use realm names that follow the standard Internet naming structure.
     *
     * @return the value
     */
    public String getRealmName() {
        return realmName;
    }

    /** The OCID of the secret where the Kerberos keytab file is stored as base64 text. */
    @com.fasterxml.jackson.annotation.JsonProperty("keytabSecretId")
    private final String keytabSecretId;

    /**
     * The OCID of the secret where the Kerberos keytab file is stored as base64 text.
     *
     * @return the value
     */
    public String getKeytabSecretId() {
        return keytabSecretId;
    }

    /** The secret version of the stored Kerberos keytab file. */
    @com.fasterxml.jackson.annotation.JsonProperty("keytabSecretVersion")
    private final Long keytabSecretVersion;

    /**
     * The secret version of the stored Kerberos keytab file.
     *
     * @return the value
     */
    public Long getKeytabSecretVersion() {
        return keytabSecretVersion;
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
        sb.append("KerberosCredential(");
        sb.append("super=").append(super.toString());
        sb.append("realmName=").append(String.valueOf(this.realmName));
        sb.append(", keytabSecretId=").append(String.valueOf(this.keytabSecretId));
        sb.append(", keytabSecretVersion=").append(String.valueOf(this.keytabSecretVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KerberosCredential)) {
            return false;
        }

        KerberosCredential other = (KerberosCredential) o;
        return java.util.Objects.equals(this.realmName, other.realmName)
                && java.util.Objects.equals(this.keytabSecretId, other.keytabSecretId)
                && java.util.Objects.equals(this.keytabSecretVersion, other.keytabSecretVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.realmName == null ? 43 : this.realmName.hashCode());
        result =
                (result * PRIME)
                        + (this.keytabSecretId == null ? 43 : this.keytabSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.keytabSecretVersion == null
                                ? 43
                                : this.keytabSecretVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
