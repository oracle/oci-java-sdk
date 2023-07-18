/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Allows administrator to configure a mount target to interact with the administrator's Kerberos
 * infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Kerberos.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Kerberos extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "kerberosRealm",
        "keyTabSecretId",
        "currentKeyTabSecretVersion",
        "backupKeyTabSecretVersion",
        "isKerberosEnabled"
    })
    public Kerberos(
            String kerberosRealm,
            String keyTabSecretId,
            Integer currentKeyTabSecretVersion,
            Integer backupKeyTabSecretVersion,
            Boolean isKerberosEnabled) {
        super();
        this.kerberosRealm = kerberosRealm;
        this.keyTabSecretId = keyTabSecretId;
        this.currentKeyTabSecretVersion = currentKeyTabSecretVersion;
        this.backupKeyTabSecretVersion = backupKeyTabSecretVersion;
        this.isKerberosEnabled = isKerberosEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Kerberos realm that the mount target will join. */
        @com.fasterxml.jackson.annotation.JsonProperty("kerberosRealm")
        private String kerberosRealm;

        /**
         * The Kerberos realm that the mount target will join.
         *
         * @param kerberosRealm the value to set
         * @return this builder
         */
        public Builder kerberosRealm(String kerberosRealm) {
            this.kerberosRealm = kerberosRealm;
            this.__explicitlySet__.add("kerberosRealm");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * keytab secret in the Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyTabSecretId")
        private String keyTabSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * keytab secret in the Vault.
         *
         * @param keyTabSecretId the value to set
         * @return this builder
         */
        public Builder keyTabSecretId(String keyTabSecretId) {
            this.keyTabSecretId = keyTabSecretId;
            this.__explicitlySet__.add("keyTabSecretId");
            return this;
        }
        /** Version of the keytab secret in the Vault to use. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentKeyTabSecretVersion")
        private Integer currentKeyTabSecretVersion;

        /**
         * Version of the keytab secret in the Vault to use.
         *
         * @param currentKeyTabSecretVersion the value to set
         * @return this builder
         */
        public Builder currentKeyTabSecretVersion(Integer currentKeyTabSecretVersion) {
            this.currentKeyTabSecretVersion = currentKeyTabSecretVersion;
            this.__explicitlySet__.add("currentKeyTabSecretVersion");
            return this;
        }
        /** Version of the keytab secert in the Vault to use as a backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupKeyTabSecretVersion")
        private Integer backupKeyTabSecretVersion;

        /**
         * Version of the keytab secert in the Vault to use as a backup.
         *
         * @param backupKeyTabSecretVersion the value to set
         * @return this builder
         */
        public Builder backupKeyTabSecretVersion(Integer backupKeyTabSecretVersion) {
            this.backupKeyTabSecretVersion = backupKeyTabSecretVersion;
            this.__explicitlySet__.add("backupKeyTabSecretVersion");
            return this;
        }
        /** Specifies whether to enable or disable Kerberos. */
        @com.fasterxml.jackson.annotation.JsonProperty("isKerberosEnabled")
        private Boolean isKerberosEnabled;

        /**
         * Specifies whether to enable or disable Kerberos.
         *
         * @param isKerberosEnabled the value to set
         * @return this builder
         */
        public Builder isKerberosEnabled(Boolean isKerberosEnabled) {
            this.isKerberosEnabled = isKerberosEnabled;
            this.__explicitlySet__.add("isKerberosEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Kerberos build() {
            Kerberos model =
                    new Kerberos(
                            this.kerberosRealm,
                            this.keyTabSecretId,
                            this.currentKeyTabSecretVersion,
                            this.backupKeyTabSecretVersion,
                            this.isKerberosEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Kerberos model) {
            if (model.wasPropertyExplicitlySet("kerberosRealm")) {
                this.kerberosRealm(model.getKerberosRealm());
            }
            if (model.wasPropertyExplicitlySet("keyTabSecretId")) {
                this.keyTabSecretId(model.getKeyTabSecretId());
            }
            if (model.wasPropertyExplicitlySet("currentKeyTabSecretVersion")) {
                this.currentKeyTabSecretVersion(model.getCurrentKeyTabSecretVersion());
            }
            if (model.wasPropertyExplicitlySet("backupKeyTabSecretVersion")) {
                this.backupKeyTabSecretVersion(model.getBackupKeyTabSecretVersion());
            }
            if (model.wasPropertyExplicitlySet("isKerberosEnabled")) {
                this.isKerberosEnabled(model.getIsKerberosEnabled());
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

    /** The Kerberos realm that the mount target will join. */
    @com.fasterxml.jackson.annotation.JsonProperty("kerberosRealm")
    private final String kerberosRealm;

    /**
     * The Kerberos realm that the mount target will join.
     *
     * @return the value
     */
    public String getKerberosRealm() {
        return kerberosRealm;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * keytab secret in the Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyTabSecretId")
    private final String keyTabSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * keytab secret in the Vault.
     *
     * @return the value
     */
    public String getKeyTabSecretId() {
        return keyTabSecretId;
    }

    /** Version of the keytab secret in the Vault to use. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentKeyTabSecretVersion")
    private final Integer currentKeyTabSecretVersion;

    /**
     * Version of the keytab secret in the Vault to use.
     *
     * @return the value
     */
    public Integer getCurrentKeyTabSecretVersion() {
        return currentKeyTabSecretVersion;
    }

    /** Version of the keytab secert in the Vault to use as a backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupKeyTabSecretVersion")
    private final Integer backupKeyTabSecretVersion;

    /**
     * Version of the keytab secert in the Vault to use as a backup.
     *
     * @return the value
     */
    public Integer getBackupKeyTabSecretVersion() {
        return backupKeyTabSecretVersion;
    }

    /** Specifies whether to enable or disable Kerberos. */
    @com.fasterxml.jackson.annotation.JsonProperty("isKerberosEnabled")
    private final Boolean isKerberosEnabled;

    /**
     * Specifies whether to enable or disable Kerberos.
     *
     * @return the value
     */
    public Boolean getIsKerberosEnabled() {
        return isKerberosEnabled;
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
        sb.append("Kerberos(");
        sb.append("super=").append(super.toString());
        sb.append("kerberosRealm=").append(String.valueOf(this.kerberosRealm));
        sb.append(", keyTabSecretId=").append(String.valueOf(this.keyTabSecretId));
        sb.append(", currentKeyTabSecretVersion=")
                .append(String.valueOf(this.currentKeyTabSecretVersion));
        sb.append(", backupKeyTabSecretVersion=")
                .append(String.valueOf(this.backupKeyTabSecretVersion));
        sb.append(", isKerberosEnabled=").append(String.valueOf(this.isKerberosEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Kerberos)) {
            return false;
        }

        Kerberos other = (Kerberos) o;
        return java.util.Objects.equals(this.kerberosRealm, other.kerberosRealm)
                && java.util.Objects.equals(this.keyTabSecretId, other.keyTabSecretId)
                && java.util.Objects.equals(
                        this.currentKeyTabSecretVersion, other.currentKeyTabSecretVersion)
                && java.util.Objects.equals(
                        this.backupKeyTabSecretVersion, other.backupKeyTabSecretVersion)
                && java.util.Objects.equals(this.isKerberosEnabled, other.isKerberosEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.kerberosRealm == null ? 43 : this.kerberosRealm.hashCode());
        result =
                (result * PRIME)
                        + (this.keyTabSecretId == null ? 43 : this.keyTabSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.currentKeyTabSecretVersion == null
                                ? 43
                                : this.currentKeyTabSecretVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.backupKeyTabSecretVersion == null
                                ? 43
                                : this.backupKeyTabSecretVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isKerberosEnabled == null ? 43 : this.isKerberosEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
