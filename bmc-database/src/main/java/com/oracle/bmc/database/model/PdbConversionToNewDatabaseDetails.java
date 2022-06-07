/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the new container database in which the converted pluggable database will be located.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PdbConversionToNewDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "target"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PdbConversionToNewDatabaseDetails extends ConvertToPdbTargetBase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cdbName")
        private String cdbName;

        public Builder cdbName(String cdbName) {
            this.cdbName = cdbName;
            this.__explicitlySet__.add("cdbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cdbAdminPassword")
        private String cdbAdminPassword;

        public Builder cdbAdminPassword(String cdbAdminPassword) {
            this.cdbAdminPassword = cdbAdminPassword;
            this.__explicitlySet__.add("cdbAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
        private String pdbAdminPassword;

        public Builder pdbAdminPassword(String pdbAdminPassword) {
            this.pdbAdminPassword = pdbAdminPassword;
            this.__explicitlySet__.add("pdbAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cdbTdeWalletPassword")
        private String cdbTdeWalletPassword;

        public Builder cdbTdeWalletPassword(String cdbTdeWalletPassword) {
            this.cdbTdeWalletPassword = cdbTdeWalletPassword;
            this.__explicitlySet__.add("cdbTdeWalletPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nonCdbTdeWalletPassword")
        private String nonCdbTdeWalletPassword;

        public Builder nonCdbTdeWalletPassword(String nonCdbTdeWalletPassword) {
            this.nonCdbTdeWalletPassword = nonCdbTdeWalletPassword;
            this.__explicitlySet__.add("nonCdbTdeWalletPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalCdbParams")
        private String additionalCdbParams;

        public Builder additionalCdbParams(String additionalCdbParams) {
            this.additionalCdbParams = additionalCdbParams;
            this.__explicitlySet__.add("additionalCdbParams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PdbConversionToNewDatabaseDetails build() {
            PdbConversionToNewDatabaseDetails __instance__ =
                    new PdbConversionToNewDatabaseDetails(
                            cdbName,
                            cdbAdminPassword,
                            pdbAdminPassword,
                            cdbTdeWalletPassword,
                            nonCdbTdeWalletPassword,
                            additionalCdbParams);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PdbConversionToNewDatabaseDetails o) {
            Builder copiedBuilder =
                    cdbName(o.getCdbName())
                            .cdbAdminPassword(o.getCdbAdminPassword())
                            .pdbAdminPassword(o.getPdbAdminPassword())
                            .cdbTdeWalletPassword(o.getCdbTdeWalletPassword())
                            .nonCdbTdeWalletPassword(o.getNonCdbTdeWalletPassword())
                            .additionalCdbParams(o.getAdditionalCdbParams());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @Deprecated
    public PdbConversionToNewDatabaseDetails(
            String cdbName,
            String cdbAdminPassword,
            String pdbAdminPassword,
            String cdbTdeWalletPassword,
            String nonCdbTdeWalletPassword,
            String additionalCdbParams) {
        super();
        this.cdbName = cdbName;
        this.cdbAdminPassword = cdbAdminPassword;
        this.pdbAdminPassword = pdbAdminPassword;
        this.cdbTdeWalletPassword = cdbTdeWalletPassword;
        this.nonCdbTdeWalletPassword = nonCdbTdeWalletPassword;
        this.additionalCdbParams = additionalCdbParams;
    }

    /**
     * The database name. The name must begin with an alphabetic character and can contain a maximum of 8 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdbName")
    private final String cdbName;

    public String getCdbName() {
        return cdbName;
    }

    /**
     * A strong password for SYS, SYSTEM, and the plugbable database ADMIN user of the container database after conversion. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdbAdminPassword")
    private final String cdbAdminPassword;

    public String getCdbAdminPassword() {
        return cdbAdminPassword;
    }

    /**
     * A strong password for plugbable database ADMIN user of the container database after conversion. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
    private final String pdbAdminPassword;

    public String getPdbAdminPassword() {
        return pdbAdminPassword;
    }

    /**
     * The password to open the TDE wallet of the container database after conversion. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numeric, and two special characters. The special characters must be _, \\#, or -.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdbTdeWalletPassword")
    private final String cdbTdeWalletPassword;

    public String getCdbTdeWalletPassword() {
        return cdbTdeWalletPassword;
    }

    /**
     * The existing TDE wallet password of the non-container database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nonCdbTdeWalletPassword")
    private final String nonCdbTdeWalletPassword;

    public String getNonCdbTdeWalletPassword() {
        return nonCdbTdeWalletPassword;
    }

    /**
     * Additional container database parameters.
     * Example: "_pdb_name_case_sensitive=true"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalCdbParams")
    private final String additionalCdbParams;

    public String getAdditionalCdbParams() {
        return additionalCdbParams;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PdbConversionToNewDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", cdbName=").append(String.valueOf(this.cdbName));
        sb.append(", cdbAdminPassword=").append(String.valueOf(this.cdbAdminPassword));
        sb.append(", pdbAdminPassword=").append(String.valueOf(this.pdbAdminPassword));
        sb.append(", cdbTdeWalletPassword=").append(String.valueOf(this.cdbTdeWalletPassword));
        sb.append(", nonCdbTdeWalletPassword=")
                .append(String.valueOf(this.nonCdbTdeWalletPassword));
        sb.append(", additionalCdbParams=").append(String.valueOf(this.additionalCdbParams));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PdbConversionToNewDatabaseDetails)) {
            return false;
        }

        PdbConversionToNewDatabaseDetails other = (PdbConversionToNewDatabaseDetails) o;
        return java.util.Objects.equals(this.cdbName, other.cdbName)
                && java.util.Objects.equals(this.cdbAdminPassword, other.cdbAdminPassword)
                && java.util.Objects.equals(this.pdbAdminPassword, other.pdbAdminPassword)
                && java.util.Objects.equals(this.cdbTdeWalletPassword, other.cdbTdeWalletPassword)
                && java.util.Objects.equals(
                        this.nonCdbTdeWalletPassword, other.nonCdbTdeWalletPassword)
                && java.util.Objects.equals(this.additionalCdbParams, other.additionalCdbParams)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.cdbName == null ? 43 : this.cdbName.hashCode());
        result =
                (result * PRIME)
                        + (this.cdbAdminPassword == null ? 43 : this.cdbAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.pdbAdminPassword == null ? 43 : this.pdbAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.cdbTdeWalletPassword == null
                                ? 43
                                : this.cdbTdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.nonCdbTdeWalletPassword == null
                                ? 43
                                : this.nonCdbTdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalCdbParams == null
                                ? 43
                                : this.additionalCdbParams.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
