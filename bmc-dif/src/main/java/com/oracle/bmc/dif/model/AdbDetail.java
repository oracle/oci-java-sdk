/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details to create an Oracle Autonomous Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AdbDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdbDetail extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "dbWorkload",
        "ecpu",
        "dataStorageSizeInTBs",
        "adminPasswordId",
        "isMtlsConnectionRequired",
        "subnetId",
        "dbVersion",
        "toolsPublicAccess",
        "isPublic"
    })
    public AdbDetail(
            String instanceId,
            DbWorkload dbWorkload,
            Integer ecpu,
            Integer dataStorageSizeInTBs,
            String adminPasswordId,
            Boolean isMtlsConnectionRequired,
            String subnetId,
            String dbVersion,
            String toolsPublicAccess,
            Boolean isPublic) {
        super();
        this.instanceId = instanceId;
        this.dbWorkload = dbWorkload;
        this.ecpu = ecpu;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.adminPasswordId = adminPasswordId;
        this.isMtlsConnectionRequired = isMtlsConnectionRequired;
        this.subnetId = subnetId;
        this.dbVersion = dbVersion;
        this.toolsPublicAccess = toolsPublicAccess;
        this.isPublic = isPublic;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Id for the adw instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Id for the adw instance.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** DB Workload to be used with ADB. Accepted values are OLTP, DW. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        /**
         * DB Workload to be used with ADB. Accepted values are OLTP, DW.
         *
         * @param dbWorkload the value to set
         * @return this builder
         */
        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }
        /** The compute amount (ECPUs) available to the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("ecpu")
        private Integer ecpu;

        /**
         * The compute amount (ECPUs) available to the database.
         *
         * @param ecpu the value to set
         * @return this builder
         */
        public Builder ecpu(Integer ecpu) {
            this.ecpu = ecpu;
            this.__explicitlySet__.add("ecpu");
            return this;
        }
        /**
         * The size, in terabytes, of the data volume that will be created and attached to the
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Integer dataStorageSizeInTBs;

        /**
         * The size, in terabytes, of the data volume that will be created and attached to the
         * database.
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInTBs(Integer dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /**
         * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID for admin password.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPasswordId")
        private String adminPasswordId;

        /**
         * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID for admin password.
         *
         * @param adminPasswordId the value to set
         * @return this builder
         */
        public Builder adminPasswordId(String adminPasswordId) {
            this.adminPasswordId = adminPasswordId;
            this.__explicitlySet__.add("adminPasswordId");
            return this;
        }
        /** Specifies if the Autonomous Database requires mTLS connections. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
        private Boolean isMtlsConnectionRequired;

        /**
         * Specifies if the Autonomous Database requires mTLS connections.
         *
         * @param isMtlsConnectionRequired the value to set
         * @return this builder
         */
        public Builder isMtlsConnectionRequired(Boolean isMtlsConnectionRequired) {
            this.isMtlsConnectionRequired = isMtlsConnectionRequired;
            this.__explicitlySet__.add("isMtlsConnectionRequired");
            return this;
        }
        /** The OCID of the subnet the Autonomous Database is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet the Autonomous Database is associated with.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** A valid Oracle Database version for Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * A valid Oracle Database version for Autonomous Database.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /**
         * This is an array of CIDR (classless inter-domain routing) notations for a subnet or VCN
         * OCID (virtual cloud network Oracle Cloud ID). Allowed only when subnetId is provided
         * (private ADB).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toolsPublicAccess")
        private String toolsPublicAccess;

        /**
         * This is an array of CIDR (classless inter-domain routing) notations for a subnet or VCN
         * OCID (virtual cloud network Oracle Cloud ID). Allowed only when subnetId is provided
         * (private ADB).
         *
         * @param toolsPublicAccess the value to set
         * @return this builder
         */
        public Builder toolsPublicAccess(String toolsPublicAccess) {
            this.toolsPublicAccess = toolsPublicAccess;
            this.__explicitlySet__.add("toolsPublicAccess");
            return this;
        }
        /** If true then subnetId should not be provided. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        /**
         * If true then subnetId should not be provided.
         *
         * @param isPublic the value to set
         * @return this builder
         */
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdbDetail build() {
            AdbDetail model =
                    new AdbDetail(
                            this.instanceId,
                            this.dbWorkload,
                            this.ecpu,
                            this.dataStorageSizeInTBs,
                            this.adminPasswordId,
                            this.isMtlsConnectionRequired,
                            this.subnetId,
                            this.dbVersion,
                            this.toolsPublicAccess,
                            this.isPublic);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdbDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
            }
            if (model.wasPropertyExplicitlySet("ecpu")) {
                this.ecpu(model.getEcpu());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInTBs")) {
                this.dataStorageSizeInTBs(model.getDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("adminPasswordId")) {
                this.adminPasswordId(model.getAdminPasswordId());
            }
            if (model.wasPropertyExplicitlySet("isMtlsConnectionRequired")) {
                this.isMtlsConnectionRequired(model.getIsMtlsConnectionRequired());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("toolsPublicAccess")) {
                this.toolsPublicAccess(model.getToolsPublicAccess());
            }
            if (model.wasPropertyExplicitlySet("isPublic")) {
                this.isPublic(model.getIsPublic());
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

    /** Id for the adw instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Id for the adw instance.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** DB Workload to be used with ADB. Accepted values are OLTP, DW. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    private final DbWorkload dbWorkload;

    /**
     * DB Workload to be used with ADB. Accepted values are OLTP, DW.
     *
     * @return the value
     */
    public DbWorkload getDbWorkload() {
        return dbWorkload;
    }

    /** The compute amount (ECPUs) available to the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("ecpu")
    private final Integer ecpu;

    /**
     * The compute amount (ECPUs) available to the database.
     *
     * @return the value
     */
    public Integer getEcpu() {
        return ecpu;
    }

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Integer dataStorageSizeInTBs;

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /** The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID for admin password. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPasswordId")
    private final String adminPasswordId;

    /**
     * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID for admin password.
     *
     * @return the value
     */
    public String getAdminPasswordId() {
        return adminPasswordId;
    }

    /** Specifies if the Autonomous Database requires mTLS connections. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
    private final Boolean isMtlsConnectionRequired;

    /**
     * Specifies if the Autonomous Database requires mTLS connections.
     *
     * @return the value
     */
    public Boolean getIsMtlsConnectionRequired() {
        return isMtlsConnectionRequired;
    }

    /** The OCID of the subnet the Autonomous Database is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet the Autonomous Database is associated with.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** A valid Oracle Database version for Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * A valid Oracle Database version for Autonomous Database.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * This is an array of CIDR (classless inter-domain routing) notations for a subnet or VCN OCID
     * (virtual cloud network Oracle Cloud ID). Allowed only when subnetId is provided (private
     * ADB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toolsPublicAccess")
    private final String toolsPublicAccess;

    /**
     * This is an array of CIDR (classless inter-domain routing) notations for a subnet or VCN OCID
     * (virtual cloud network Oracle Cloud ID). Allowed only when subnetId is provided (private
     * ADB).
     *
     * @return the value
     */
    public String getToolsPublicAccess() {
        return toolsPublicAccess;
    }

    /** If true then subnetId should not be provided. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    private final Boolean isPublic;

    /**
     * If true then subnetId should not be provided.
     *
     * @return the value
     */
    public Boolean getIsPublic() {
        return isPublic;
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
        sb.append("AdbDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", ecpu=").append(String.valueOf(this.ecpu));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", adminPasswordId=").append(String.valueOf(this.adminPasswordId));
        sb.append(", isMtlsConnectionRequired=")
                .append(String.valueOf(this.isMtlsConnectionRequired));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", toolsPublicAccess=").append(String.valueOf(this.toolsPublicAccess));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdbDetail)) {
            return false;
        }

        AdbDetail other = (AdbDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.ecpu, other.ecpu)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.adminPasswordId, other.adminPasswordId)
                && java.util.Objects.equals(
                        this.isMtlsConnectionRequired, other.isMtlsConnectionRequired)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.toolsPublicAccess, other.toolsPublicAccess)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result = (result * PRIME) + (this.ecpu == null ? 43 : this.ecpu.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPasswordId == null ? 43 : this.adminPasswordId.hashCode());
        result =
                (result * PRIME)
                        + (this.isMtlsConnectionRequired == null
                                ? 43
                                : this.isMtlsConnectionRequired.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.toolsPublicAccess == null ? 43 : this.toolsPublicAccess.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
