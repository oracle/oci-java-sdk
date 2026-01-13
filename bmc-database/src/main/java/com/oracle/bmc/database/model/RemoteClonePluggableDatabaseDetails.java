/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * **Deprecated.** Use {@link #createPluggableDatabaseDetails(CreatePluggableDatabaseDetailsRequest)
 * createPluggableDatabaseDetails} for Pluggable Database RemoteClone Operation. Parameters for
 * cloning a pluggable database (PDB) in a remote database (CDB). A remote CDB is one that does not
 * contain the source PDB.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RemoteClonePluggableDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoteClonePluggableDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetContainerDatabaseId",
        "sourceContainerDbAdminPassword",
        "clonedPdbName",
        "pdbAdminPassword",
        "targetTdeWalletPassword",
        "shouldPdbAdminAccountBeLocked"
    })
    public RemoteClonePluggableDatabaseDetails(
            String targetContainerDatabaseId,
            String sourceContainerDbAdminPassword,
            String clonedPdbName,
            String pdbAdminPassword,
            String targetTdeWalletPassword,
            Boolean shouldPdbAdminAccountBeLocked) {
        super();
        this.targetContainerDatabaseId = targetContainerDatabaseId;
        this.sourceContainerDbAdminPassword = sourceContainerDbAdminPassword;
        this.clonedPdbName = clonedPdbName;
        this.pdbAdminPassword = pdbAdminPassword;
        this.targetTdeWalletPassword = targetTdeWalletPassword;
        this.shouldPdbAdminAccountBeLocked = shouldPdbAdminAccountBeLocked;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * target CDB
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetContainerDatabaseId")
        private String targetContainerDatabaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * target CDB
         *
         * @param targetContainerDatabaseId the value to set
         * @return this builder
         */
        public Builder targetContainerDatabaseId(String targetContainerDatabaseId) {
            this.targetContainerDatabaseId = targetContainerDatabaseId;
            this.__explicitlySet__.add("targetContainerDatabaseId");
            return this;
        }
        /** The DB system administrator password of the source CDB. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDbAdminPassword")
        private String sourceContainerDbAdminPassword;

        /**
         * The DB system administrator password of the source CDB.
         *
         * @param sourceContainerDbAdminPassword the value to set
         * @return this builder
         */
        public Builder sourceContainerDbAdminPassword(String sourceContainerDbAdminPassword) {
            this.sourceContainerDbAdminPassword = sourceContainerDbAdminPassword;
            this.__explicitlySet__.add("sourceContainerDbAdminPassword");
            return this;
        }
        /**
         * The name for the pluggable database (PDB). The name is unique in the context of a {@link
         * Database}. The name must begin with an alphabetic character and can contain a maximum of
         * thirty alphanumeric characters. Special characters are not permitted. The pluggable
         * database name should not be same as the container database name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clonedPdbName")
        private String clonedPdbName;

        /**
         * The name for the pluggable database (PDB). The name is unique in the context of a {@link
         * Database}. The name must begin with an alphabetic character and can contain a maximum of
         * thirty alphanumeric characters. Special characters are not permitted. The pluggable
         * database name should not be same as the container database name.
         *
         * @param clonedPdbName the value to set
         * @return this builder
         */
        public Builder clonedPdbName(String clonedPdbName) {
            this.clonedPdbName = clonedPdbName;
            this.__explicitlySet__.add("clonedPdbName");
            return this;
        }
        /**
         * A strong password for PDB Admin of the newly cloned PDB. The password must be at least
         * nine characters and contain at least two uppercase, two lowercase, two numbers, and two
         * special characters. The special characters must be _, \\#, or -.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
        private String pdbAdminPassword;

        /**
         * A strong password for PDB Admin of the newly cloned PDB. The password must be at least
         * nine characters and contain at least two uppercase, two lowercase, two numbers, and two
         * special characters. The special characters must be _, \\#, or -.
         *
         * @param pdbAdminPassword the value to set
         * @return this builder
         */
        public Builder pdbAdminPassword(String pdbAdminPassword) {
            this.pdbAdminPassword = pdbAdminPassword;
            this.__explicitlySet__.add("pdbAdminPassword");
            return this;
        }
        /** The existing TDE wallet password of the target CDB. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetTdeWalletPassword")
        private String targetTdeWalletPassword;

        /**
         * The existing TDE wallet password of the target CDB.
         *
         * @param targetTdeWalletPassword the value to set
         * @return this builder
         */
        public Builder targetTdeWalletPassword(String targetTdeWalletPassword) {
            this.targetTdeWalletPassword = targetTdeWalletPassword;
            this.__explicitlySet__.add("targetTdeWalletPassword");
            return this;
        }
        /**
         * The locked mode of the pluggable database admin account. If false, the user needs to
         * provide the PDB Admin Password to connect to it. If true, the pluggable database will be
         * locked and user cannot login to it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldPdbAdminAccountBeLocked")
        private Boolean shouldPdbAdminAccountBeLocked;

        /**
         * The locked mode of the pluggable database admin account. If false, the user needs to
         * provide the PDB Admin Password to connect to it. If true, the pluggable database will be
         * locked and user cannot login to it.
         *
         * @param shouldPdbAdminAccountBeLocked the value to set
         * @return this builder
         */
        public Builder shouldPdbAdminAccountBeLocked(Boolean shouldPdbAdminAccountBeLocked) {
            this.shouldPdbAdminAccountBeLocked = shouldPdbAdminAccountBeLocked;
            this.__explicitlySet__.add("shouldPdbAdminAccountBeLocked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoteClonePluggableDatabaseDetails build() {
            RemoteClonePluggableDatabaseDetails model =
                    new RemoteClonePluggableDatabaseDetails(
                            this.targetContainerDatabaseId,
                            this.sourceContainerDbAdminPassword,
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
        public Builder copy(RemoteClonePluggableDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("targetContainerDatabaseId")) {
                this.targetContainerDatabaseId(model.getTargetContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("sourceContainerDbAdminPassword")) {
                this.sourceContainerDbAdminPassword(model.getSourceContainerDbAdminPassword());
            }
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * target CDB
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetContainerDatabaseId")
    private final String targetContainerDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * target CDB
     *
     * @return the value
     */
    public String getTargetContainerDatabaseId() {
        return targetContainerDatabaseId;
    }

    /** The DB system administrator password of the source CDB. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDbAdminPassword")
    private final String sourceContainerDbAdminPassword;

    /**
     * The DB system administrator password of the source CDB.
     *
     * @return the value
     */
    public String getSourceContainerDbAdminPassword() {
        return sourceContainerDbAdminPassword;
    }

    /**
     * The name for the pluggable database (PDB). The name is unique in the context of a {@link
     * Database}. The name must begin with an alphabetic character and can contain a maximum of
     * thirty alphanumeric characters. Special characters are not permitted. The pluggable database
     * name should not be same as the container database name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clonedPdbName")
    private final String clonedPdbName;

    /**
     * The name for the pluggable database (PDB). The name is unique in the context of a {@link
     * Database}. The name must begin with an alphabetic character and can contain a maximum of
     * thirty alphanumeric characters. Special characters are not permitted. The pluggable database
     * name should not be same as the container database name.
     *
     * @return the value
     */
    public String getClonedPdbName() {
        return clonedPdbName;
    }

    /**
     * A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine
     * characters and contain at least two uppercase, two lowercase, two numbers, and two special
     * characters. The special characters must be _, \\#, or -.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
    private final String pdbAdminPassword;

    /**
     * A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine
     * characters and contain at least two uppercase, two lowercase, two numbers, and two special
     * characters. The special characters must be _, \\#, or -.
     *
     * @return the value
     */
    public String getPdbAdminPassword() {
        return pdbAdminPassword;
    }

    /** The existing TDE wallet password of the target CDB. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetTdeWalletPassword")
    private final String targetTdeWalletPassword;

    /**
     * The existing TDE wallet password of the target CDB.
     *
     * @return the value
     */
    public String getTargetTdeWalletPassword() {
        return targetTdeWalletPassword;
    }

    /**
     * The locked mode of the pluggable database admin account. If false, the user needs to provide
     * the PDB Admin Password to connect to it. If true, the pluggable database will be locked and
     * user cannot login to it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldPdbAdminAccountBeLocked")
    private final Boolean shouldPdbAdminAccountBeLocked;

    /**
     * The locked mode of the pluggable database admin account. If false, the user needs to provide
     * the PDB Admin Password to connect to it. If true, the pluggable database will be locked and
     * user cannot login to it.
     *
     * @return the value
     */
    public Boolean getShouldPdbAdminAccountBeLocked() {
        return shouldPdbAdminAccountBeLocked;
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
        sb.append("RemoteClonePluggableDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetContainerDatabaseId=")
                .append(String.valueOf(this.targetContainerDatabaseId));
        sb.append(", sourceContainerDbAdminPassword=")
                .append(String.valueOf(this.sourceContainerDbAdminPassword));
        sb.append(", clonedPdbName=").append(String.valueOf(this.clonedPdbName));
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
        if (!(o instanceof RemoteClonePluggableDatabaseDetails)) {
            return false;
        }

        RemoteClonePluggableDatabaseDetails other = (RemoteClonePluggableDatabaseDetails) o;
        return java.util.Objects.equals(
                        this.targetContainerDatabaseId, other.targetContainerDatabaseId)
                && java.util.Objects.equals(
                        this.sourceContainerDbAdminPassword, other.sourceContainerDbAdminPassword)
                && java.util.Objects.equals(this.clonedPdbName, other.clonedPdbName)
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
                        + (this.targetContainerDatabaseId == null
                                ? 43
                                : this.targetContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceContainerDbAdminPassword == null
                                ? 43
                                : this.sourceContainerDbAdminPassword.hashCode());
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
