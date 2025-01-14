/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters for creating a pluggable database in a specified container database (CDB). Additional
 * option {@code pdbCreationTypeDetails} can be used for creating Pluggable Database using different
 * operations, e.g. LocalClone, Remote Clone, Relocate. **Warning:** Oracle recommends that you
 * avoid using any confidential information when you supply string values using the API. <br>
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
        builder = CreatePluggableDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePluggableDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pdbName",
        "containerDatabaseId",
        "pdbAdminPassword",
        "tdeWalletPassword",
        "shouldPdbAdminAccountBeLocked",
        "containerDatabaseAdminPassword",
        "shouldCreatePdbBackup",
        "pdbCreationTypeDetails",
        "freeformTags",
        "definedTags"
    })
    public CreatePluggableDatabaseDetails(
            String pdbName,
            String containerDatabaseId,
            String pdbAdminPassword,
            String tdeWalletPassword,
            Boolean shouldPdbAdminAccountBeLocked,
            String containerDatabaseAdminPassword,
            Boolean shouldCreatePdbBackup,
            CreatePluggableDatabaseCreationTypeDetails pdbCreationTypeDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.pdbName = pdbName;
        this.containerDatabaseId = containerDatabaseId;
        this.pdbAdminPassword = pdbAdminPassword;
        this.tdeWalletPassword = tdeWalletPassword;
        this.shouldPdbAdminAccountBeLocked = shouldPdbAdminAccountBeLocked;
        this.containerDatabaseAdminPassword = containerDatabaseAdminPassword;
        this.shouldCreatePdbBackup = shouldCreatePdbBackup;
        this.pdbCreationTypeDetails = pdbCreationTypeDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name for the pluggable database (PDB). The name is unique in the context of a {@link
         * Database}. The name must begin with an alphabetic character and can contain a maximum of
         * thirty alphanumeric characters. Special characters are not permitted. The pluggable
         * database name should not be same as the container database name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
        private String pdbName;

        /**
         * The name for the pluggable database (PDB). The name is unique in the context of a {@link
         * Database}. The name must begin with an alphabetic character and can contain a maximum of
         * thirty alphanumeric characters. Special characters are not permitted. The pluggable
         * database name should not be same as the container database name.
         *
         * @param pdbName the value to set
         * @return this builder
         */
        public Builder pdbName(String pdbName) {
            this.pdbName = pdbName;
            this.__explicitlySet__.add("pdbName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * CDB
         */
        @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
        private String containerDatabaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * CDB
         *
         * @param containerDatabaseId the value to set
         * @return this builder
         */
        public Builder containerDatabaseId(String containerDatabaseId) {
            this.containerDatabaseId = containerDatabaseId;
            this.__explicitlySet__.add("containerDatabaseId");
            return this;
        }
        /**
         * A strong password for PDB Admin. The password must be at least nine characters and
         * contain at least two uppercase, two lowercase, two numbers, and two special characters.
         * The special characters must be _, \\#, or -.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
        private String pdbAdminPassword;

        /**
         * A strong password for PDB Admin. The password must be at least nine characters and
         * contain at least two uppercase, two lowercase, two numbers, and two special characters.
         * The special characters must be _, \\#, or -.
         *
         * @param pdbAdminPassword the value to set
         * @return this builder
         */
        public Builder pdbAdminPassword(String pdbAdminPassword) {
            this.pdbAdminPassword = pdbAdminPassword;
            this.__explicitlySet__.add("pdbAdminPassword");
            return this;
        }
        /** The existing TDE wallet password of the CDB. */
        @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
        private String tdeWalletPassword;

        /**
         * The existing TDE wallet password of the CDB.
         *
         * @param tdeWalletPassword the value to set
         * @return this builder
         */
        public Builder tdeWalletPassword(String tdeWalletPassword) {
            this.tdeWalletPassword = tdeWalletPassword;
            this.__explicitlySet__.add("tdeWalletPassword");
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
        /** The DB system administrator password of the Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseAdminPassword")
        private String containerDatabaseAdminPassword;

        /**
         * The DB system administrator password of the Container Database.
         *
         * @param containerDatabaseAdminPassword the value to set
         * @return this builder
         */
        public Builder containerDatabaseAdminPassword(String containerDatabaseAdminPassword) {
            this.containerDatabaseAdminPassword = containerDatabaseAdminPassword;
            this.__explicitlySet__.add("containerDatabaseAdminPassword");
            return this;
        }
        /** Indicates whether to take Pluggable Database Backup after the operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldCreatePdbBackup")
        private Boolean shouldCreatePdbBackup;

        /**
         * Indicates whether to take Pluggable Database Backup after the operation.
         *
         * @param shouldCreatePdbBackup the value to set
         * @return this builder
         */
        public Builder shouldCreatePdbBackup(Boolean shouldCreatePdbBackup) {
            this.shouldCreatePdbBackup = shouldCreatePdbBackup;
            this.__explicitlySet__.add("shouldCreatePdbBackup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pdbCreationTypeDetails")
        private CreatePluggableDatabaseCreationTypeDetails pdbCreationTypeDetails;

        public Builder pdbCreationTypeDetails(
                CreatePluggableDatabaseCreationTypeDetails pdbCreationTypeDetails) {
            this.pdbCreationTypeDetails = pdbCreationTypeDetails;
            this.__explicitlySet__.add("pdbCreationTypeDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePluggableDatabaseDetails build() {
            CreatePluggableDatabaseDetails model =
                    new CreatePluggableDatabaseDetails(
                            this.pdbName,
                            this.containerDatabaseId,
                            this.pdbAdminPassword,
                            this.tdeWalletPassword,
                            this.shouldPdbAdminAccountBeLocked,
                            this.containerDatabaseAdminPassword,
                            this.shouldCreatePdbBackup,
                            this.pdbCreationTypeDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePluggableDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("pdbName")) {
                this.pdbName(model.getPdbName());
            }
            if (model.wasPropertyExplicitlySet("containerDatabaseId")) {
                this.containerDatabaseId(model.getContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("pdbAdminPassword")) {
                this.pdbAdminPassword(model.getPdbAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("tdeWalletPassword")) {
                this.tdeWalletPassword(model.getTdeWalletPassword());
            }
            if (model.wasPropertyExplicitlySet("shouldPdbAdminAccountBeLocked")) {
                this.shouldPdbAdminAccountBeLocked(model.getShouldPdbAdminAccountBeLocked());
            }
            if (model.wasPropertyExplicitlySet("containerDatabaseAdminPassword")) {
                this.containerDatabaseAdminPassword(model.getContainerDatabaseAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("shouldCreatePdbBackup")) {
                this.shouldCreatePdbBackup(model.getShouldCreatePdbBackup());
            }
            if (model.wasPropertyExplicitlySet("pdbCreationTypeDetails")) {
                this.pdbCreationTypeDetails(model.getPdbCreationTypeDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The name for the pluggable database (PDB). The name is unique in the context of a {@link
     * Database}. The name must begin with an alphabetic character and can contain a maximum of
     * thirty alphanumeric characters. Special characters are not permitted. The pluggable database
     * name should not be same as the container database name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
    private final String pdbName;

    /**
     * The name for the pluggable database (PDB). The name is unique in the context of a {@link
     * Database}. The name must begin with an alphabetic character and can contain a maximum of
     * thirty alphanumeric characters. Special characters are not permitted. The pluggable database
     * name should not be same as the container database name.
     *
     * @return the value
     */
    public String getPdbName() {
        return pdbName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the CDB
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
    private final String containerDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the CDB
     *
     * @return the value
     */
    public String getContainerDatabaseId() {
        return containerDatabaseId;
    }

    /**
     * A strong password for PDB Admin. The password must be at least nine characters and contain at
     * least two uppercase, two lowercase, two numbers, and two special characters. The special
     * characters must be _, \\#, or -.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
    private final String pdbAdminPassword;

    /**
     * A strong password for PDB Admin. The password must be at least nine characters and contain at
     * least two uppercase, two lowercase, two numbers, and two special characters. The special
     * characters must be _, \\#, or -.
     *
     * @return the value
     */
    public String getPdbAdminPassword() {
        return pdbAdminPassword;
    }

    /** The existing TDE wallet password of the CDB. */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
    private final String tdeWalletPassword;

    /**
     * The existing TDE wallet password of the CDB.
     *
     * @return the value
     */
    public String getTdeWalletPassword() {
        return tdeWalletPassword;
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

    /** The DB system administrator password of the Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseAdminPassword")
    private final String containerDatabaseAdminPassword;

    /**
     * The DB system administrator password of the Container Database.
     *
     * @return the value
     */
    public String getContainerDatabaseAdminPassword() {
        return containerDatabaseAdminPassword;
    }

    /** Indicates whether to take Pluggable Database Backup after the operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldCreatePdbBackup")
    private final Boolean shouldCreatePdbBackup;

    /**
     * Indicates whether to take Pluggable Database Backup after the operation.
     *
     * @return the value
     */
    public Boolean getShouldCreatePdbBackup() {
        return shouldCreatePdbBackup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pdbCreationTypeDetails")
    private final CreatePluggableDatabaseCreationTypeDetails pdbCreationTypeDetails;

    public CreatePluggableDatabaseCreationTypeDetails getPdbCreationTypeDetails() {
        return pdbCreationTypeDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreatePluggableDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("pdbName=").append(String.valueOf(this.pdbName));
        sb.append(", containerDatabaseId=").append(String.valueOf(this.containerDatabaseId));
        sb.append(", pdbAdminPassword=").append(String.valueOf(this.pdbAdminPassword));
        sb.append(", tdeWalletPassword=").append(String.valueOf(this.tdeWalletPassword));
        sb.append(", shouldPdbAdminAccountBeLocked=")
                .append(String.valueOf(this.shouldPdbAdminAccountBeLocked));
        sb.append(", containerDatabaseAdminPassword=").append("<redacted>");
        sb.append(", shouldCreatePdbBackup=").append(String.valueOf(this.shouldCreatePdbBackup));
        sb.append(", pdbCreationTypeDetails=").append(String.valueOf(this.pdbCreationTypeDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePluggableDatabaseDetails)) {
            return false;
        }

        CreatePluggableDatabaseDetails other = (CreatePluggableDatabaseDetails) o;
        return java.util.Objects.equals(this.pdbName, other.pdbName)
                && java.util.Objects.equals(this.containerDatabaseId, other.containerDatabaseId)
                && java.util.Objects.equals(this.pdbAdminPassword, other.pdbAdminPassword)
                && java.util.Objects.equals(this.tdeWalletPassword, other.tdeWalletPassword)
                && java.util.Objects.equals(
                        this.shouldPdbAdminAccountBeLocked, other.shouldPdbAdminAccountBeLocked)
                && java.util.Objects.equals(
                        this.containerDatabaseAdminPassword, other.containerDatabaseAdminPassword)
                && java.util.Objects.equals(this.shouldCreatePdbBackup, other.shouldCreatePdbBackup)
                && java.util.Objects.equals(
                        this.pdbCreationTypeDetails, other.pdbCreationTypeDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pdbName == null ? 43 : this.pdbName.hashCode());
        result =
                (result * PRIME)
                        + (this.containerDatabaseId == null
                                ? 43
                                : this.containerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.pdbAdminPassword == null ? 43 : this.pdbAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.tdeWalletPassword == null ? 43 : this.tdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldPdbAdminAccountBeLocked == null
                                ? 43
                                : this.shouldPdbAdminAccountBeLocked.hashCode());
        result =
                (result * PRIME)
                        + (this.containerDatabaseAdminPassword == null
                                ? 43
                                : this.containerDatabaseAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldCreatePdbBackup == null
                                ? 43
                                : this.shouldCreatePdbBackup.hashCode());
        result =
                (result * PRIME)
                        + (this.pdbCreationTypeDetails == null
                                ? 43
                                : this.pdbCreationTypeDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
