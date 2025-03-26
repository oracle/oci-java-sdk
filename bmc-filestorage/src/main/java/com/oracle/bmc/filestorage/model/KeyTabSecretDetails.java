/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Secret details of keytabs in Vault.
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
    builder = KeyTabSecretDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KeyTabSecretDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "keyTabSecretId",
        "currentKeyTabSecretVersion",
        "backupKeyTabSecretVersion"
    })
    public KeyTabSecretDetails(
            String keyTabSecretId,
            Integer currentKeyTabSecretVersion,
            Integer backupKeyTabSecretVersion) {
        super();
        this.keyTabSecretId = keyTabSecretId;
        this.currentKeyTabSecretVersion = currentKeyTabSecretVersion;
        this.backupKeyTabSecretVersion = backupKeyTabSecretVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the keytab secret in the Vault.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyTabSecretId")
        private String keyTabSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the keytab secret in the Vault.
         * @param keyTabSecretId the value to set
         * @return this builder
         **/
        public Builder keyTabSecretId(String keyTabSecretId) {
            this.keyTabSecretId = keyTabSecretId;
            this.__explicitlySet__.add("keyTabSecretId");
            return this;
        }
        /**
         * Version of the keytab secret in the Vault to use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentKeyTabSecretVersion")
        private Integer currentKeyTabSecretVersion;

        /**
         * Version of the keytab secret in the Vault to use.
         * @param currentKeyTabSecretVersion the value to set
         * @return this builder
         **/
        public Builder currentKeyTabSecretVersion(Integer currentKeyTabSecretVersion) {
            this.currentKeyTabSecretVersion = currentKeyTabSecretVersion;
            this.__explicitlySet__.add("currentKeyTabSecretVersion");
            return this;
        }
        /**
         * Version of the keytab secret in the Vault to use as a backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupKeyTabSecretVersion")
        private Integer backupKeyTabSecretVersion;

        /**
         * Version of the keytab secret in the Vault to use as a backup.
         * @param backupKeyTabSecretVersion the value to set
         * @return this builder
         **/
        public Builder backupKeyTabSecretVersion(Integer backupKeyTabSecretVersion) {
            this.backupKeyTabSecretVersion = backupKeyTabSecretVersion;
            this.__explicitlySet__.add("backupKeyTabSecretVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyTabSecretDetails build() {
            KeyTabSecretDetails model =
                    new KeyTabSecretDetails(
                            this.keyTabSecretId,
                            this.currentKeyTabSecretVersion,
                            this.backupKeyTabSecretVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyTabSecretDetails model) {
            if (model.wasPropertyExplicitlySet("keyTabSecretId")) {
                this.keyTabSecretId(model.getKeyTabSecretId());
            }
            if (model.wasPropertyExplicitlySet("currentKeyTabSecretVersion")) {
                this.currentKeyTabSecretVersion(model.getCurrentKeyTabSecretVersion());
            }
            if (model.wasPropertyExplicitlySet("backupKeyTabSecretVersion")) {
                this.backupKeyTabSecretVersion(model.getBackupKeyTabSecretVersion());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the keytab secret in the Vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyTabSecretId")
    private final String keyTabSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the keytab secret in the Vault.
     * @return the value
     **/
    public String getKeyTabSecretId() {
        return keyTabSecretId;
    }

    /**
     * Version of the keytab secret in the Vault to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentKeyTabSecretVersion")
    private final Integer currentKeyTabSecretVersion;

    /**
     * Version of the keytab secret in the Vault to use.
     * @return the value
     **/
    public Integer getCurrentKeyTabSecretVersion() {
        return currentKeyTabSecretVersion;
    }

    /**
     * Version of the keytab secret in the Vault to use as a backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupKeyTabSecretVersion")
    private final Integer backupKeyTabSecretVersion;

    /**
     * Version of the keytab secret in the Vault to use as a backup.
     * @return the value
     **/
    public Integer getBackupKeyTabSecretVersion() {
        return backupKeyTabSecretVersion;
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
        sb.append("KeyTabSecretDetails(");
        sb.append("super=").append(super.toString());
        sb.append("keyTabSecretId=").append(String.valueOf(this.keyTabSecretId));
        sb.append(", currentKeyTabSecretVersion=")
                .append(String.valueOf(this.currentKeyTabSecretVersion));
        sb.append(", backupKeyTabSecretVersion=")
                .append(String.valueOf(this.backupKeyTabSecretVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyTabSecretDetails)) {
            return false;
        }

        KeyTabSecretDetails other = (KeyTabSecretDetails) o;
        return java.util.Objects.equals(this.keyTabSecretId, other.keyTabSecretId)
                && java.util.Objects.equals(
                        this.currentKeyTabSecretVersion, other.currentKeyTabSecretVersion)
                && java.util.Objects.equals(
                        this.backupKeyTabSecretVersion, other.backupKeyTabSecretVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
