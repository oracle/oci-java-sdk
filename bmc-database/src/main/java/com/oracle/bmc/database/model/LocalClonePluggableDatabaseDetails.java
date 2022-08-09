/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters for cloning a pluggable database (PDB) within the same database (CDB).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
    builder = LocalClonePluggableDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LocalClonePluggableDatabaseDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clonedPdbName",
        "pdbAdminPassword",
        "targetTdeWalletPassword",
        "shouldPdbAdminAccountBeLocked"
    })
    public LocalClonePluggableDatabaseDetails(
            String clonedPdbName,
            String pdbAdminPassword,
            String targetTdeWalletPassword,
            Boolean shouldPdbAdminAccountBeLocked) {
        super();
        this.clonedPdbName = clonedPdbName;
        this.pdbAdminPassword = pdbAdminPassword;
        this.targetTdeWalletPassword = targetTdeWalletPassword;
        this.shouldPdbAdminAccountBeLocked = shouldPdbAdminAccountBeLocked;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name for the pluggable database (PDB). The name is unique in the context of a {@link Database}. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clonedPdbName")
        private String clonedPdbName;

        /**
         * The name for the pluggable database (PDB). The name is unique in the context of a {@link Database}. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
         * @param clonedPdbName the value to set
         * @return this builder
         **/
        public Builder clonedPdbName(String clonedPdbName) {
            this.clonedPdbName = clonedPdbName;
            this.__explicitlySet__.add("clonedPdbName");
            return this;
        }
        /**
         * A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numbers, and two special characters. The special characters must be _, \\#, or -.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
        private String pdbAdminPassword;

        /**
         * A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numbers, and two special characters. The special characters must be _, \\#, or -.
         * @param pdbAdminPassword the value to set
         * @return this builder
         **/
        public Builder pdbAdminPassword(String pdbAdminPassword) {
            this.pdbAdminPassword = pdbAdminPassword;
            this.__explicitlySet__.add("pdbAdminPassword");
            return this;
        }
        /**
         * The existing TDE wallet password of the target CDB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetTdeWalletPassword")
        private String targetTdeWalletPassword;

        /**
         * The existing TDE wallet password of the target CDB.
         * @param targetTdeWalletPassword the value to set
         * @return this builder
         **/
        public Builder targetTdeWalletPassword(String targetTdeWalletPassword) {
            this.targetTdeWalletPassword = targetTdeWalletPassword;
            this.__explicitlySet__.add("targetTdeWalletPassword");
            return this;
        }
        /**
         * The locked mode of the pluggable database admin account. If false, the user needs to provide the PDB Admin Password to connect to it.
         * If true, the pluggable database will be locked and user cannot login to it.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldPdbAdminAccountBeLocked")
        private Boolean shouldPdbAdminAccountBeLocked;

        /**
         * The locked mode of the pluggable database admin account. If false, the user needs to provide the PDB Admin Password to connect to it.
         * If true, the pluggable database will be locked and user cannot login to it.
         *
         * @param shouldPdbAdminAccountBeLocked the value to set
         * @return this builder
         **/
        public Builder shouldPdbAdminAccountBeLocked(Boolean shouldPdbAdminAccountBeLocked) {
            this.shouldPdbAdminAccountBeLocked = shouldPdbAdminAccountBeLocked;
            this.__explicitlySet__.add("shouldPdbAdminAccountBeLocked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LocalClonePluggableDatabaseDetails build() {
            LocalClonePluggableDatabaseDetails model =
                    new LocalClonePluggableDatabaseDetails(
                            this.clonedPdbName,
                            this.pdbAdminPassword,
                            this.targetTdeWalletPassword,
                            this.shouldPdbAdminAccountBeLocked);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LocalClonePluggableDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("clonedPdbName")) {
                this.clonedPdbName(model.getClonedPdbName());
            }
            if (model.wasPropertyExplicitlySet("pdbAdminPassword")) {
                this.pdbAdminPassword(model.getPdbAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("targetTdeWalletPassword")) {
                this.targetTdeWalletPassword(model.getTargetTdeWalletPassword());
            }
            if (model.wasPropertyExplicitlySet("shouldPdbAdminAccountBeLocked")) {
                this.shouldPdbAdminAccountBeLocked(model.getShouldPdbAdminAccountBeLocked());
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
     * The name for the pluggable database (PDB). The name is unique in the context of a {@link Database}. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clonedPdbName")
    private final String clonedPdbName;

    /**
     * The name for the pluggable database (PDB). The name is unique in the context of a {@link Database}. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
     * @return the value
     **/
    public String getClonedPdbName() {
        return clonedPdbName;
    }

    /**
     * A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numbers, and two special characters. The special characters must be _, \\#, or -.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
    private final String pdbAdminPassword;

    /**
     * A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numbers, and two special characters. The special characters must be _, \\#, or -.
     * @return the value
     **/
    public String getPdbAdminPassword() {
        return pdbAdminPassword;
    }

    /**
     * The existing TDE wallet password of the target CDB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetTdeWalletPassword")
    private final String targetTdeWalletPassword;

    /**
     * The existing TDE wallet password of the target CDB.
     * @return the value
     **/
    public String getTargetTdeWalletPassword() {
        return targetTdeWalletPassword;
    }

    /**
     * The locked mode of the pluggable database admin account. If false, the user needs to provide the PDB Admin Password to connect to it.
     * If true, the pluggable database will be locked and user cannot login to it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldPdbAdminAccountBeLocked")
    private final Boolean shouldPdbAdminAccountBeLocked;

    /**
     * The locked mode of the pluggable database admin account. If false, the user needs to provide the PDB Admin Password to connect to it.
     * If true, the pluggable database will be locked and user cannot login to it.
     *
     * @return the value
     **/
    public Boolean getShouldPdbAdminAccountBeLocked() {
        return shouldPdbAdminAccountBeLocked;
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
        sb.append("LocalClonePluggableDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clonedPdbName=").append(String.valueOf(this.clonedPdbName));
        sb.append(", pdbAdminPassword=").append(String.valueOf(this.pdbAdminPassword));
        sb.append(", targetTdeWalletPassword=")
                .append(String.valueOf(this.targetTdeWalletPassword));
        sb.append(", shouldPdbAdminAccountBeLocked=")
                .append(String.valueOf(this.shouldPdbAdminAccountBeLocked));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LocalClonePluggableDatabaseDetails)) {
            return false;
        }

        LocalClonePluggableDatabaseDetails other = (LocalClonePluggableDatabaseDetails) o;
        return java.util.Objects.equals(this.clonedPdbName, other.clonedPdbName)
                && java.util.Objects.equals(this.pdbAdminPassword, other.pdbAdminPassword)
                && java.util.Objects.equals(
                        this.targetTdeWalletPassword, other.targetTdeWalletPassword)
                && java.util.Objects.equals(
                        this.shouldPdbAdminAccountBeLocked, other.shouldPdbAdminAccountBeLocked)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clonedPdbName == null ? 43 : this.clonedPdbName.hashCode());
        result =
                (result * PRIME)
                        + (this.pdbAdminPassword == null ? 43 : this.pdbAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.targetTdeWalletPassword == null
                                ? 43
                                : this.targetTdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldPdbAdminAccountBeLocked == null
                                ? 43
                                : this.shouldPdbAdminAccountBeLocked.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
